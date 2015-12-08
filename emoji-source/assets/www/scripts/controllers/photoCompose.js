'use strict';

angular.module('mfbApp')
    .controller('PhotoComposeCtrl', function ($scope, Draw, NavHelper, Templates, Users, TemplatesHelper, Photos, makeComicWizard, $timeout, Storage) {
        var DEFAULT_PHOTO_BACKGROUND = 'images/photo-default.png';
        var STORAGE_KEY_LAST_USED_AVATAR_INDEX = 'lastUsedAvatarIndex';

        var MAX_BUBBLETEXT_LENGTH = 100;

        var tabs = ['photoTab', 'bubbleTab', 'emotionTab'];
        var me = Users.me();
        var defaultRandomAvatarIndex;

        $scope.editMode = false;

        $scope.hasBackground = false;

        $scope.changeControlsTab = function (tabToShow) {
            if (tabs.indexOf(tabToShow) === -1) {
                throw new Error(tabToShow + ' is not a valid PhotoComposeCtrl tab.');
            }

            // Hide all tabs
            tabs.forEach(function (tab) {
                $scope[tab] = false;
            });

            // Show clicked tab
            $scope[tabToShow] = true;
        };

        // Canvas drawing
        var textBubbleClickCallback = function () {
            $scope.addText();
            $scope.$apply();
        };

        var setEditingCallback = function (value, scopeApply) {
            $scope.editMode = !!value;

            if (scopeApply) {
                $scope.$apply();
            }
        };

        var scaleUp = function (url) {
            return url.replace('scale=1', 'scale=2');
        };

        $scope.init = function () {
            // Set photo tab as active tab
            $scope.changeControlsTab(tabs[0]);
            makeComicWizard.customized(true);

            // Set up the canvas
            var isPhotoComic = true;
            var backedUpPhoto = Draw.getBackedUpPhoto();
            var backedUpPhotoPosition = Draw.getBackedUpPhotoPosition();
            var defaultBubbleData = [{
                pointer_location: 4,
                pointer_orientation: "left",
                x: 0.5,
                y: 0.10
            }];

            $scope.avatarTemplates = TemplatesHelper.getPhotoAvatarTemplates(me);
            defaultRandomAvatarIndex = 0; // Default to first template // Math.floor(Math.random() * $scope.avatarTemplates.length);

            var lastUsedAvatarIndex = Math.min(Storage.getItem(STORAGE_KEY_LAST_USED_AVATAR_INDEX), $scope.avatarTemplates.length - 1);
            $scope.currentAvatarIndex = lastUsedAvatarIndex === null ? defaultRandomAvatarIndex : lastUsedAvatarIndex;

            // Avatar
            var defaultAvatarUrl = scaleUp($scope.avatarTemplates[$scope.currentAvatarIndex].url);
            var backedUpAvatar = Draw.getBackedUpAvatar();
            var avatarToDraw = backedUpAvatar ? backedUpAvatar : defaultAvatarUrl;

            Draw.setTheStage(
                textBubbleClickCallback,
                defaultBubbleData,
                document.getElementById('bubble-textarea'),
                setEditingCallback,
                DEFAULT_PHOTO_BACKGROUND,
                {a: avatarToDraw, b: null},
                1,
                isPhotoComic
            ).then(function () {
                    $scope.canvasIsLoaded = true;
                    makeComicWizard.photoBackgroundType('default');

                    if (backedUpPhoto) {
                        Draw.drawBackgroundPhoto(backedUpPhoto, backedUpPhotoPosition);
                        $scope.hasBackground = true;
                    }
                });


            // Text bubble
            $scope.textBubbleValue = Draw.getBackupText(1);
        };

        Templates.waiting().then($scope.init);


        // Text bubble
        var focusBubbleText = function () {
            $timeout(function () {
                document.getElementById('bubble-textarea').focus();
            });
        };

        $scope.addText = function () {
            $scope.setEditMode(1);
            focusBubbleText();
            Draw.showBubble(true, 1);
        };

        var limitTextLength = function (text) {
            if (text && text.length >= MAX_BUBBLETEXT_LENGTH) {
                return text.substring(0, MAX_BUBBLETEXT_LENGTH);
            }
            return text;
        };

        $scope.textKeypress = function (event) {
            // android fix:
            if (event.keyCode === 13) {
                $scope.textBubbleValue += '\n';
                event.preventDefault();
            }

            $scope.textBubbleValue = limitTextLength($scope.textBubbleValue);
        };

        $scope.setEditMode = function (value) {
            Draw.setEditing(value);
            $scope.editMode = !!value;
        };

        $scope.hasTextBubble = function () {
            return Draw.getBubbleVisibility(1);
        };

        $scope.applyTextFromUser = function (text) {
            text = limitTextLength(text);
            $scope.textBubbleValue = text;
            Draw.setBubbleText(text, 1);
            Draw.showBubble(!!text, 1);
            makeComicWizard.hasTextBubble(true);
        };

        $scope.removeTextBubble = function () {
            Draw.showBubble(false, 1);
            $scope.setEditMode(0);
            makeComicWizard.hasTextBubble(false);
        };


        // Avatar
        $scope.placeAvatar = function (url, index) {
            var scale2Url = scaleUp(url);
            $scope.currentAvatarIndex = index;
            Storage.setItem(STORAGE_KEY_LAST_USED_AVATAR_INDEX, index);
            Draw.drawCharacter('front', scale2Url);
        };

        $scope.isActiveAvatar = function (index) {
            return $scope.currentAvatarIndex === index;
        };

        // Background photo
        $scope.choose = function () {
            Photos.library()
                .then(function (imageData) {
                    // Get photo success
                    Draw.drawBackgroundPhoto(imageData);
                    makeComicWizard.photoBackgroundType('library');
                    $scope.hasBackground = true;
                }, function (error) {
                    // Get photo fail
            });
        };

        $scope.snap = function () {
            Photos.camera()
                .then(function (imageData) {
                    // Get photo success
                    Draw.drawBackgroundPhoto(imageData);
                    makeComicWizard.photoBackgroundType('camera');
                    $scope.hasBackground = true;
                }, function (error) {
                    // Get photo fail
            });
        };

        $scope.back = function () {
            makeComicWizard.clearComicData();
            Draw.clearBackup();
            NavHelper.previous_section();
        };

        $scope.goToShare = function () {
            makeComicWizard.customCaption($scope.caption);
            makeComicWizard.templateId($scope.avatarTemplates[$scope.currentAvatarIndex].template_id);
            makeComicWizard.customCanvas(Draw.getCanvasImageData());
            Draw.pushBackup();
            NavHelper.sharePhoto();
        };

        $scope.$on('$destroy', Draw.cleanup);
    });
