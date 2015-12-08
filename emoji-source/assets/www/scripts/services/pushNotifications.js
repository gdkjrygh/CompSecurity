'use strict';

angular.module('pushNotificationsService', ['remoteService'])
.service('PushNotifications', function($window, $document, $http, $location, Remote) {
    var GCM_SENDER_ID = '959948041813';

    var plugin = null;

    $document[0].addEventListener('deviceready', function() {
        plugin = $window.plugins.pushNotification;
    });


    function isAndroid() {
        return (!!$window.device.platform && $window.device.platform.toLowerCase() === 'android');
    }

    function register() {
        if  (!plugin) {
            console.warn('Registering for Push Notifications is not available');
            return;
        }

        if (isAndroid()) {
            registerAndroid();
        } else {
            registerIOS();
        }
    }

    // TODO This function is highly based in the original Flash one
    // We need to refactor this once the timeline is not so bad.
    // No global functions allowed!
    function resolveMessageNotification(data) {
        if (data.hasOwnProperty('daily_notification')) {
            notifyClick(data.daily_notification, 'daily_notification');

            if (!lockedState()) {
                $window.new_day();
            }

        } else if (data.hasOwnProperty('notification') && data.hasOwnProperty('type')) {
            if (data.type >= 25 && data.type <= 28) {
                if (!lockedState()) {
                    if (data.hasOwnProperty('comic_id') && data.comic_id > 0) {
                        $window.show_comic(data.comic_id);
                    } else {
                        $window.new_friend_comics();
                    }
                }

                notifyClick(data.notification, data.type);
            }
        }
    }

    function notifyClick(id, type) {
        Remote.post({
            method: 'notification_clicked',
            notification_id: id,
            notification_type: type
        });
    }

    // Listener for Android
    $window.onNotification = function(e) {

        if (e.event === 'registered') {

            if (e.regid.length > 0) {
                Remote.post({
                    method: 'notification_register',
                    registration_id: e.regid
                });
            }

        } else if (e.event === 'message' && e.payload) {
            if (e.foreground) {
                console.log('Notification received while in foreground. Ignoring');
                return;
            }

            resolveMessageNotification(e.payload);

        } else if (e.event === 'error') {
            throw new Error(JSON.stringify(e));

        }
    };

    // Listener for iOS
    $window.onNotificationAPN = function(event) {
        if (event.alert && event.foreground !== "1") {
            resolveMessageNotification(event);
        }
    };

    function registerAndroid() {
        var payload = {
            "senderID": GCM_SENDER_ID,
            "ecb":"onNotification"
        };

        var errorHandler = function(error) {
            console.error('Error registering device for notifications ' + error);
        };

        plugin.register(angular.noop, errorHandler, payload);
    }

    function registerIOS() {
        var payload = {
            "badge":"true",
            "sound":"true",
            "alert":"true",
            "ecb":"onNotificationAPN"
        };

        var tokenHandler = function(result) {
            Remote.post({
                method: 'notification_register',
                registration_id: result
            });
        };

        var errorHandler = function(error) {
            console.error('Error registering device for notifications ' + error);
        };

        plugin.register(tokenHandler, errorHandler, payload);
    }

    function lockedState() {
        var path = $location.path();
        return path.match(/avatar\/builder/) || path.match(/templates\/edit/);
    }

    return {
        register: register
    };
});
