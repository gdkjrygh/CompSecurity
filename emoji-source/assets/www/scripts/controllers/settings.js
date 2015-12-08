'use strict';

angular.module('mfbApp')
    .controller('SettingsCtrl', function ($scope, Bootstrap, $routeParams, Launch, Users, Remote,
										  Log, $anchorScroll, NavHelper, Storage, $cordovaSocialSharing,
                                          $cordovaDevice, $cordovaDialogs, FBLogin) {

		$scope.settings_privacy = NavHelper.settings_privacy;
		$scope.settings_tou = NavHelper.settings_tou;
		$scope.settings_faq = NavHelper.settings_faq;
		$scope.settings_notifications = NavHelper.settings_notifications;

        $scope.back = NavHelper.back;

        $scope.user = Users.me();

        if ($routeParams.terms) {
            $scope.terms = $routeParams.terms;
        }
        $scope.version = Bootstrap.app_version;

        $scope.feedback = function () {
            var message = ['Feedback: \n\n'];
            message.push("Model: " +  $cordovaDevice.getModel());
            message.push("Platform: " +  $cordovaDevice.getPlatform());
            message.push("Version: " +  $cordovaDevice.getVersion());

            $cordovaSocialSharing
                    .shareViaEmail(message.join('\n'), "Feedback " + Bootstrap.app_version, 'tickets@bitstripsfacebook.uservoice.com')
                    .then(function(result) {
                        Log.log("Send feeback result: ", result);
                    }, function(err) {
                        Log.log("Send feedback error: ", err);
                    });
        };

        $scope.logout_click = function() {
            $scope.logging_out = true;
            FBLogin.logout();
        };

        $scope.view_log = 0; // No longer needed given how easy it is to debug cordova - Bootstrap.testing;

        $scope.generate_flash_error = function () {
            Launch.launch({'builder':'generate_error'});
        };

        $scope.prompt_rate_app= function () {
            Launch.launch({'builder':'rate_app'});
        };

        $scope.view_web_log = function () {
            $scope.web_log = Log.get_log().join("\n");
        };

        $scope.reset_avatar = function () {
            $cordovaDialogs.confirm('This action cannot be undone. Are you sure?', 'Reset Avatar', ['Yes', 'No'])
                .then(function(index) {
                    if (index === 1) {
                        NavHelper.avatar_builder('reset');
                    }
                });
        };

        var wvc_counter = 0;
        $scope.version_click = function () {
            wvc_counter += 1;
            if (wvc_counter > 5) {
                $scope.view_log += 1;
            }
        };

        $scope.saveUserSettings = function(){
            Remote.post({'method':'save_notifications', 'notifications':$scope.user.notifications, 'settings':$scope.user.settings});
        };

        $scope.$watch('user.settings', function (new_val, old_val) {
            if (angular.equals(new_val, old_val) === false) {
                $scope.saveUserSettings();
            }
        }, true);

        $scope.view_it = function (url) {
            Launch.openSystemURL(url);
        };
    });

