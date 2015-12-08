'use strict';

angular.module('fbService', ['storageService'])
    .factory('FBLogin', function (Storage, $q, $window, $cordovaDialogs) {
        var storageLabel = 'fbtoken';

        var saveToken = function (token) {
            Storage.setItem(storageLabel, token);
        };

        var login = function(success, error) {
            var facebookLoginPermissions = [
                'public_profile',
                'email',
                'user_friends'
            ];

            var loginSuccessCallback = function (response) {
                console.log(response);
                saveToken(response.authResponse.accessToken);
                success(response.authResponse.accessToken);
            };

            var loginErrorCallback = function (response) {
                console.log(JSON.stringify(response));
                error("There was an error!");
            };

            facebookConnectPlugin.login(facebookLoginPermissions, loginSuccessCallback, loginErrorCallback);
        };

        var logout = function () {
            facebookConnectPlugin.logout(
                function (success) {
                    clearToken();
                    Storage.clear();
                    $window.location = "index.html";
                }, function (error) {
                    var dialogMessage = "Sorry, we couldn't log you out. Please try again.";
                    var dialogTitle = 'Logout Error';
                    var dialogButton = 'Okay';
                    $cordovaDialogs.alert(dialogMessage, dialogTitle, dialogButton);
                });
        };

        var getToken = function () {
            return Storage.getItem(storageLabel);
        };

        var clearToken = function () {
            return Storage.removeItem(storageLabel);
        };

        var getPublishPerms = function () {
            var deferred = $q.defer();

            facebookConnectPlugin.login(['publish_actions'], function (data) {
                deferred.resolve(data);
            }, function (error) {
                deferred.reject(error);
            });

            return deferred.promise;
        };

        return {
            login: login,
            logout: logout,
            getToken: getToken,
            clearToken: clearToken,
            getPublishPerms: getPublishPerms
        };
    });
