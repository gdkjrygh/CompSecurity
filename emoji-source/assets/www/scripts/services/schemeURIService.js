'use strict';


angular.module('schemeURIService', ['navService', 'makeComicWizard', 'usersService'])
.service('SchemeURIService', function($window, $timeout, NavHelper, makeComicWizard, Users) {

    var methods = {
        // Expects: create_comic?template_id=3276
        create_comic: function(options) {
            required(options, 'template_id');

            var navigateToComic = function() {
                $timeout(function() {
                    makeComicWizard.templateId(options.template_id);
                    setCostars(options);
                    NavHelper.editTemplate();
                });
            };

            if (NavHelper.isEditTemplate()) {
                $timeout(function() {
                    NavHelper.go_home();
                    navigateToComic();
                });
            }

            navigateToComic();
        },

        // Expects: show_tag?tag=Latest&template_id=1234
        show_tag: function(options) {
            required(options, 'tag');
            required(options, 'template_id');
            $timeout(function() {
                setCostars(options);
                NavHelper.browse_templates('#'+options.tag, options.template_id, 'selected_tag');
            });
        },

        // Expects: show_search?search=coffee
        show_search: function(options) {
            required(options, 'search');
            $timeout(function() {
                NavHelper.browse_templates(options.search);
            });
        },

        // Expects: show_friend?id=750735236
        show_friend: function(options) {
            required(options, 'id');
            $timeout(function() {
                NavHelper.view_user_from_home(options.id);
            });
        },

        // Expects: show_comic?id=12345
        show_comic: function(options) {
            required(options, 'id');
            // Reuse notification method
            $window.show_comic(options.id);
        }
    };

    function required(obj, key) {
        if (!angular.isDefined(obj[key])) {
            throw new Error(key + ' is mandatory');
        }
    }

    function setCostars(options) {
        var user;

        if (options.costar_a) {
            user = Users.get_user_fb(options.costar_a);
            if (!!user) {
                makeComicWizard.userA(user);
            }
        }

        if (options.costar_b) {
            user = Users.get_user_fb(options.costar_b);
            if (!!user) {
                makeComicWizard.userB(user);
            }
        }
    }

    function params2object(parameters) {
        var options = {};

        if (!parameters) { return options; }

        parameters = parameters.split('&');

        angular.forEach(parameters, function(parameter) {
            var key, value;
            parameter = parameter.split('=');
            key = parameter[0];
            value = parameter[1];
            options[key] = value;
        });

        return options;
    }

    function execute(info) {
        var method, parameters;
        info = info.replace('bitstripsapp://', '');

        info = info.split('?');
        method = info[0];
        parameters = info[1];

        // If the method is unknown do nothing
        if (!methods[method]) { return null; }

        methods[method](params2object(parameters));

    }

    return {
        execute: execute
    };
});
