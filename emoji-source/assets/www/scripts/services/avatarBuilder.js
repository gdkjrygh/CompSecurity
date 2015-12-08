'use strict';

angular.module('avatarBuilderService', ['usersService', 'navService', 'configuration', 'ngCordova'])
.service('AvatarBuilderService', function($window, $http, $q, Users, API_HOST, ImageBaseURL, NavHelper, $cordovaDialogs) {

    if (!$window.AvatarBuilder) {
        throw new Error('Could not open the avatar builder');
    }

    $window.AvatarBuilder.service.setImagesPath('bower_components/avatar-builder/images/');

    var avatarBuilderConfig = {
        renderingHost: ImageBaseURL.replace('/v2/cpanel/', '')
        // TODO analyticsCallback: ...,
    };

    function getAvatarEndpoint() {
        var fb_token = Users.me().access_token;
        return API_HOST + 'facebook/mfb/avatar.php?styled_char_data=1&fb_token=' + fb_token;
    }

    function openAvatarBuilder(options) {
        options = options || {};

        $http.get(getAvatarEndpoint())
        .then(function(response) {
            var data = response.data;
            angular.extend(data, avatarBuilderConfig);

            // Support old avatar builder - REMOVE THIS WHEN WE UPDATE TO STYLED BUILDER
            if (!!data.styled_char_data) {
                data.char_data = data.styled_char_data['1'];
            }

            data.mode = options.mode;
            $window.AvatarBuilder.start(data, 'content');
        }, function() {
            showRetryDialog(options);
        });
    }

    function showRetryDialog(options) {
        $cordovaDialogs.confirm(
            'Could not load due to a network connectivity or server issue. Please try again.',
            'Network Error',
            ['Retry', 'Cancel']
        ).then(function(index) {
            if (index === 1) {
                openAvatarBuilder(options);
            } else {
                NavHelper.avatar_home();
            }
        });
    }

    function hasChanged() {
        return $window.AvatarBuilder.service.hasChanged() || $window.AvatarBuilder.service.isNew();
    }

    function saveAvatar() {
        var deferred = $q.defer();

        var payload = $window.AvatarBuilder.service.getDeltaPayload();
        $http.post(getAvatarEndpoint(), payload).then(function(response) {
            var avatarId = response.data.avatar_id;
            var version = response.data.avatar_version;
            var thumb = response.data.profile_pic;
            Users.setAvatar(Users.me().fb_id, avatarId, version, thumb);
            deferred.resolve();
        }, function(error) {
            deferred.reject();
        });

        return deferred.promise;
    }

    return {
        openAvatarBuilder: openAvatarBuilder,
        saveAvatar: saveAvatar,
        hasChanged: hasChanged
    };

});

