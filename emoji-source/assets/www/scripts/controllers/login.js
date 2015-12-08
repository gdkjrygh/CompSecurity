'use strict';

angular.module('mfbApp')
    .controller('LoginCtrl', function ($scope, UserAuth, $routeParams, Launch, Remote, Bootstrap, FBLogin, $cordovaDialogs) {
        $scope.capacity = Math.floor((Math.random() * 2));
        var retry_token = false;

        var showErrorDialog = function (message) {
            var dialogTitle = 'Error logging in';
            var dialogButton = 'Okay';

            $cordovaDialogs
                .alert(message, dialogTitle, dialogButton)
                .then(function () {
                    $scope.logging_in = false;
                });
        };

        var error_getting_token = function (errorMessage) {
            retry_token = false;
            showErrorDialog(errorMessage);
        };

        var set_token = function (token) {
            $scope.logging_in = true;
            UserAuth.set_token(token).then(
                angular.noop,
                function (response) {
                    var message = response.data;
                    var errorMessage;

                    if (message === 'overloaded') {
                        $scope.capacity = ($scope.capacity + 1) % 2;
                        $scope.overloaded = 1;
                        retry_token = token;
                    } else if (message === 'invalid') {
                        // Invalid is only returned if we need to clear the token, otherwise we'll
                        // try this token again
                        FBLogin.clearToken();
                        errorMessage = "Please try again";
                    } else if (!message) {
                        retry_token = token;
                        errorMessage = "Error in login response from the server - please try again";
                    } else {
                        retry_token = token;
                        errorMessage = "Failed to connect to server - please try again";
                    }

                    showErrorDialog(errorMessage);
                }
            );
        };

        Launch.launch({'builder': 'run_ready'});

        if ($routeParams.version) {
            var tmp = $routeParams.version;
            tmp = tmp.split(":");
            Bootstrap.app_version = tmp[0];
            window.app_version = tmp[0];
            if (tmp.length >= 2) {
                Launch.set_port(tmp[1]);
                Launch.launch({'builder': 'run'});
            }
            if (tmp.length >= 3) {
                Remote.set_device_id(tmp[2]);
            }
        }

        if (FBLogin.getToken()) {
            set_token(FBLogin.getToken());
        }


        $scope.login_click = function () {
            $scope.logging_in = true;

            if (retry_token !== false) {
                set_token(retry_token);
            } else {
                FBLogin.login(set_token, error_getting_token);
            }

        };

        $scope.overloaded_ok = function () {
            delete $scope.overloaded;
        };

        $scope.set_token = set_token;

        var alt_login = {
            show_ready_button: true,
            show_email_input: false,
            show_thanks: false,

            clicked_ready: function () {
                alt_login.show_ready_button = false;
                alt_login.show_email_input = true;
            },
            clicked_submit: function () {
                if ($scope.email) {
                    alt_login.show_email_input = false;
                    alt_login.show_thanks = true;
                    Remote.post({'method': 'when_ready', 'when_ready': $scope.email});
                }
            }
        };

        $scope.alt_login = alt_login;
    });
