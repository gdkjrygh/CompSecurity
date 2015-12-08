'use strict';

angular.module('avatarBuilderCtrl', ['avatarBuilderService', 'usersService', 'navService', 'ngCordova', 'spinnerDialog'])
.controller('AvatarBuilderCtrl', function($scope, $window, $routeParams, Users, NavHelper, AvatarBuilderService,
                                            $cordovaDialogs, SpinnerDialog) {
    var avatarId = Users.me().id;
    var topBarPadding = parseInt($window.jQuery('body').css('padding-top'), 10);
    var avatarBuilderMode = $routeParams.mode;
    var isExistingUser = (!!avatarId && avatarId !== "1_0" && avatarBuilderMode !== 'reset');

    $scope.avatarBuilderTitle = (isExistingUser) ?  'Edit Your Avatar' : 'Create Your Avatar';
    $scope.avatarBuilderStyle = {height:  ($window.innerHeight - topBarPadding) + 'px'};

    AvatarBuilderService.openAvatarBuilder({ mode: avatarBuilderMode });

    var closeAvatarBuilder = function() {
        NavHelper.avatar_home();

        if (!isExistingUser) {
            NavHelper.home_feed();
        }
    };

    var saveAvatarToBackend = function() {
        startSavingProcess();
        AvatarBuilderService.saveAvatar().then(closeAvatarBuilder, showSavingError)['finally'](function() {
            endSavingProcess();
        });
    };

    var saveFn = function() {
        // Do not allow to save if there are no changes
        if (!AvatarBuilderService.hasChanged()) { return; }

        $cordovaDialogs.confirm('Save your avatar?', 'Save', ['Yes', 'No'])
            .then(function(index) {
                if (index === 1) { saveAvatarToBackend(); }
            });
    };

    var backFn = function() {
        if (!AvatarBuilderService.hasChanged()) {
            NavHelper.back();
            return;
        }

        $cordovaDialogs.confirm('Cancel and lose unsaved changes?', 'Exit Avatar Designer', ['Yes', 'No'])
            .then(function(index) {
                if (index === 1) { NavHelper.back(); }
            });
    };

    var showSavingError = function() {
        $cordovaDialogs.confirm('Avatar could not be saved.', 'Error', ['Retry', 'Cancel'])
            .then(function(index) {
                if (index === 1) {
                    saveAvatarToBackend();
                } else {
                    NavHelper.avatar_home();
                }
            });
    };

    var lockInput = function() {
        $scope.savingAvatar = true;
        $scope.save = angular.noop;
        $scope.back = angular.noop;
    };

    var unlockInput = function() {
        $scope.save = saveFn;
        $scope.back = backFn;
        $scope.savingAvatar = false;
    };

    var startSavingProcess = function() {
        lockInput();
        SpinnerDialog.show('Save', 'Saving Avatar', true);
    };

    var endSavingProcess = function() {
        SpinnerDialog.hide();
        unlockInput();
    };

    unlockInput();
});
