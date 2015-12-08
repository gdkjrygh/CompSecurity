'use strict';

angular.module('navService', ['usersService', 'ngRoute'])
    .factory('Section', function () {
        return function (name) {
            var current_path = '';
            var history = [];
            var get_path = function () {
                return '/' + name + '/' + current_path;
            };
            var trim_slashes = function (str) {
                return str.replace(/^([\/]+)/, '').replace(/([\/]+)$/, '');
            };

            return {
                get_path: get_path,
                set_path: function (path, ignoreHistory) {
                    var trimmed_path = trim_slashes(path);
                    if (current_path != trimmed_path && !ignoreHistory) {
                        history.push(current_path);
                    }
                    current_path = trimmed_path;
                    return get_path();
                },
                back: function () {
                    if (history.length === 0) {
                        return false;
                    }
                    current_path = history.pop();
                    return get_path();
                }
            };
        };
    })
    .factory('Nav', function ($location, $window, $route, Section) {

        var stacks = {},
            sections = function (section) {
                if (!stacks[section]) {
                    stacks[section] = new Section(section);
                }
                return stacks[section];
            },
            current_section,
            last_section = 'home',
            is_change_section = function (section) {
                return current_section !== section;
            },
            keep_track_of_current_section = function (section) {
                current_section = section;
            };

        var ignoreHistory = function () {
            if ($route.current && $route.current.noHistory) {
                return true;
            }
            return false;
        };

        return {
            go: function (section, path, anchor, search) {
                if (!section) {
                    section = $location.path().split('/')[1];
                }
                if (!path) {
                    if (is_change_section(section) === false) {
                        $window.scrollTo(0, 0);
                        return;
                    } else if (current_section) {
                        last_section = current_section;
                    }
                    path = sections(section).get_path();
                } else {
                    path = sections(section).set_path(path, ignoreHistory());
                }

                keep_track_of_current_section(section);
                $location.path(path);
                $location.hash(anchor || '');
                $location.search(search || {});
            },
            back: function () {
                var path = sections(current_section).back();
                if (path === false) {
                    path = sections('home').get_path();
                    keep_track_of_current_section('home');
                }
                $location.path(path);
                // reset hash and search on navigation
                // they should probably be part of the history
                $location.hash('');
                $location.search({back: true});
            },
            at_home_root: function () {
                return $location.path() === '/home/';
            },
            last_section: function () {
                return last_section;
            }
        };
    })
    .factory('NavHelper', function (Nav, Users, $location) {
        var go_section = function (section) {
            return function () {
                Nav.go(section, null, null, {back: true});
            };
        };
        var join_args = function (args) {
            return [].splice.call(args, 0).join('/');
        };
        return {
            go_home: go_section('home'),
            go_photo: go_section('photo'),
            go_templates: go_section('templates'),
            go_avatar: go_section('avatar'),
            home_feed: function () {
                Nav.go('home', '/', '');
            },
            home_intro: function () {
                Nav.go('home', 'intro/');
            },
            home_direct: function () {
                Nav.go('home', 'direct/');
            },
            notification_feed: function () {
                Nav.go('home', 'notifications', '');
            },
            home_feed_after_sharing_comic: function () {
                Nav.go('photo', '/');
                Nav.go('templates', '/'); // push template home to the top of the stack
                Nav.go('home', '/', 'firstComicAnchor');
            },
            direct_feed_after_sharing_comic: function () {
                Nav.go('photo', '/');
                Nav.go('templates', '/'); // push template home to the top of the stack
                Nav.go('home', '/direct');
            },
            view_comic: function (comic_id) {
                Nav.go(null, 'view_comic/' + comic_id);
            },
            view_comic_comments_expanded: function (comic_id) {
                Nav.go(null, 'view_comic/' + comic_id, 'comic_actions', {comments_expanded: true});
            },
            viewComicFromNotification: function (comicId) {
                Nav.go('home', 'view_comic/' + comicId + '/notification');
            },
            comment_on_comic: function (comic_id) {
                Nav.go(null, 'view_comic/' + comic_id, null, {new_comment: true});
            },
            view_user: function (user_id) {
                var me = Users.me();
                if (me.fb_id == user_id) {
                    Nav.go('avatar', '/');
                } else {
                    Nav.go(null, 'user/' + user_id);
                }
            },
            view_user_from_home: function (user_id) {
                Nav.go('home', 'user/' + user_id);
            },
            change_profile_picture: function () {
                Nav.go('avatar', 'profile_pics');
            },
            avatar_builder: function (mode) {
                Nav.go('avatar', 'builder/' + mode);
            },
            browse_templates: function () {
                Nav.go('templates', join_args(arguments));
            },
            browse_templates_with_back: function (search, template_id, selected_tag) {
                Nav.go('templates', join_args(arguments), null, {back: true});
            },
            editTemplate: function () {
                Nav.go('templates', '/edit');
            },
            isEditTemplate: function () {
                return $location.path().match('/templates/edit');
            },
            select_friend: function (char_type) {
                Nav.go('templates', 'select_friend/' + char_type);
            },
            select_friend_without_avatar: function (char_type) {
                Nav.go('templates', 'select_friend_without_avatar/' + char_type);
            },
            avatar_home: function () {
                Nav.go('avatar', '/');
            },
            go_settings: function () {
                Nav.go('avatar', 'settings');
            },
            settings_privacy: function () {
                Nav.go('avatar', 'settings/privacy');
            },
            settings_tou: function () {
                Nav.go('avatar', 'settings/tou');
            },
            settings_faq: function () {
                Nav.go('avatar', 'settings/faq');
            },
            settings_notifications: function () {
                Nav.go('avatar', 'settings/notifications');
            },
            back: function () {
                Nav.back();
            },
            previous_section: function () {
                go_section(Nav.last_section())();
            },
            share: function () {
                Nav.go('templates', '/share');
            },
            sharePhoto: function () {
                Nav.go('photo', '/share');
            },
            can_go_back: function () {
                if ($location.path().indexOf('/login') === 0) {
                    return false;
                }
                return !Nav.at_home_root();
            }
        };
    });
