package ru.kata.spring.boot_security.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    boolean addRole(Role role);

    List<Role> getListRoles();

    List<Role> getListByRole(List<String> name);

    boolean add(User user);

    List<User> getListUsers();

    void delete(Long id);

    void update(User user);

    User getById(Long id);

    User getByUsername(String userName);
}
