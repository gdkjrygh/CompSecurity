'use strict';

angular.module('mfbApp')
    .controller('CustomizeCtrl', function ($scope, Draw, makeComicWizard, NavHelper, Users, Templates, TemplatesHelper, $timeout) {
        var MAX_BUBBLETEXT_LENGTH = 140;

        var tabs = ['bubbleTab', 'emotionTab'];
        var templateId = makeComicWizard.templateId();
        $scope.editMode = false;
        $scope.comic = Templates.get_template(templateId);
        $scope.hasCostar = makeComicWizard.userB() && $scope.comic.type === 1;
        $scope.clickedEmo = [];

        // Users
        var updateUsers = function () {
            $scope.user_a = $scope.comic.user_a = makeComicWizard.userA();
            $scope.user_b = $scope.comic.user_b = ($scope.comic.type === 1 ? makeComicWizard.userB() : makeComicWizard.userA());
        };

        updateUsers();

        $scope.swapUsers = function () {
            if (customizedCaption()) {
                description = captionUndoNames($scope.caption, $scope.user_a, $scope.user_b);
            }

            $scope.clickedEmo = [];
            makeComicWizard.swapUsers();
            updateUsers();

            TemplatesHelper.update_template_info($scope.comic);

            var costarAUrl = TemplatesHelper.getCharacterUrl(makeComicWizard.userA().id, $scope.comic.comic_id, 1);
            var costarBUrl = TemplatesHelper.getCharacterUrl(makeComicWizard.userB().id, $scope.comic.comic_id, 2);
            var positionForA = ($scope.comic.on_top === 1) ? "front" : "back";
            var positionForB = ($scope.comic.on_top === 2) ? "front" : "back";

            Draw.drawCharacter(positionForA, costarAUrl);
            Draw.drawCharacter(positionForB, costarBUrl);

            $scope.caption = TemplatesHelper.update_desc(description, $scope.comic.user_a, $scope.comic.user_b);
        };

        // Caption
        var description = makeComicWizard.getDescriptionOrDefault($scope.comic.description);
        $scope.caption = TemplatesHelper.update_desc(description, $scope.comic.user_a, $scope.comic.user_b);

        var trackedCaptionChange = false;
        $scope.caption_change = function () {
            $scope.caption = $scope.caption.replace("\n", " ").substring(0, 110);
            if (trackedCaptionChange === false) {
                trackedCaptionChange = true;
            }
        };

        var customizedCaption = function () {
            var original = TemplatesHelper.update_desc($scope.comic.description, $scope.comic.user_a, $scope.comic.user_b);
            return $scope.caption !== original;
        };

        var captionUndoNames = function (caption, user_a, user_b) {
            if (!caption) {
                return '';
            }
            return caption.replace(user_a.first_name, "{a}").replace(user_b.first_name, "{b}");
        };


        // Navigation
        $scope.back = function () {
            makeComicWizard.clearComicData();
            Draw.clearBackup();
            NavHelper.back();
        };

        $scope.changeControlsTab = function (tabToShow, activeCostar) {
            // Hide all tabs
            tabs.forEach(function (tab) {
                $scope[tab] = false;
            });

            // Show clicked tab
            $scope[tabToShow] = true;
            $scope.activeCostar = activeCostar;
        };


        // Canvas drawing
        var textBubbleClickCallback = function (activeCostar) {
            $scope.addText(activeCostar);
            $scope.$apply();
        };

        var getCostarUrls = function () {
            return {
                a: TemplatesHelper.getCharacterUrl($scope.comic.user_a.id, $scope.comic.comic_id, 1),
                b: (makeComicWizard.userB() && $scope.comic.type === 1) ? TemplatesHelper.getCharacterUrl($scope.comic.user_b.id, $scope.comic.comic_id, 2) : null
            };
        };

        $scope.setEditMode = function (value) {
            Draw.setEditing(value);
            $scope.editMode = !!value;
        };

        $scope.init = function () {
            // Set active tab
            $scope.changeControlsTab(tabs[0]);
            $scope.activeCostar = 1;

            if (!$scope.comic) {
                throw new Error('Comic was unable to load as background image in Customize Scene Editor');
            }

            // Get whole scene background
            var sceneUrl = TemplatesHelper.sceneBackground($scope.comic.comic_id);
            var isPhotoComic = false;

            Draw.setTheStage(
                textBubbleClickCallback,
                $scope.comic.bubbles,
                document.getElementById('bubble-textarea'),
                setEditingCallback,
                sceneUrl,
                getCostarUrls(),
                $scope.comic.on_top,
                isPhotoComic
            ).then(function() {
                $scope.canvasIsLoaded = true;
            });

            // Restore backed-up customize data
            $scope.textA = Draw.getBackupText(1);
            $scope.textB = Draw.getBackupText(2);
        };

        var setEditingCallback = function (value, scopeApply) {
            $scope.editMode = !!value;

            if (scopeApply) {
                $scope.$apply();
            }
        };

        $scope.init();


        // Text bubble
        $scope.addText = function (costar) {
            $scope.activeCostar = costar;
            $scope.editMode = true;
            makeComicWizard.customized(true);
            Draw.setEditing(costar);
            focusBubbleText();

            switch (costar) {
                case 1:
                    $scope.textBubbleValue = $scope.textA;
                    Draw.showBubble(true, 1);
                    break;
                case 2:
                    $scope.textBubbleValue = $scope.textB;
                    Draw.showBubble(true, 2);
                    break;
            }
        };

        $scope.textKeypress = function(event) {
            if (event.keyCode === 13) {
                $scope.textBubbleValue += '\n';
                event.preventDefault();
            }

            $scope.textBubbleValue = limitTextLength($scope.textBubbleValue);
        };

        $scope.removeTextBubble = function (costar) {
            Draw.showBubble(false, costar);
            $scope.setEditMode(0);
        };

        var focusBubbleText = function () {
            $timeout(function () {
                document.getElementById('bubble-textarea').focus();
            });
        };

        // I think we can kill this?
        var positionTextBubbles = function () {
            $scope.xPosition = $scope.comic.bubbles[0].x;
            $scope.yPosition = $scope.comic.bubbles[0].y;
        };

        positionTextBubbles();

        var limitTextLength = function (text) {
            if (text && text.length >= MAX_BUBBLETEXT_LENGTH) {
                return text.substring(0, MAX_BUBBLETEXT_LENGTH);
            }
            return text;
        };

        var applyText = function (text) {
            text = limitTextLength(text);
            switch ($scope.activeCostar) {
                case 1:
                    applyTextForA(text);
                    break;
                case 2:
                    applyTextForB(text);
                    break;
            }
        };

        var applyTextForA = function (text) {
            Draw.showBubble(!!text, 1);
            Draw.setBubbleText(text, 1);
            $scope.textA = text;
        };

        var applyTextForB = function (text) {
            Draw.showBubble(!!text, 2);
            Draw.setBubbleText(text, 2);
            $scope.textB = text;
        };

        $scope.applyTextFromUser = function (text) {
            applyText(text);
        };

        $scope.activeCostarHasTextBubble = function () {
            return Draw.getBubbleVisibility($scope.activeCostar);
        };

        $scope.showOverlay = function (value) {
            $scope.editMode = !!value;
        };

        var initEmotions = function () {
            // Emotions
            $scope.emosArray = [];

            for (var i=1; i <= 42; i++) {
                if ( i.toString().length < 2 ) {
                    i = "0" + i;
                }

                $scope.emosArray.push('images/emos/emo_00'+ i +'.png');
            }
        };

        initEmotions();

        $scope.changeActiveEmo = function (index) {
            var activeCostarObj = $scope.activeCostar === 1 ? makeComicWizard.userA() : makeComicWizard.userB();
            var newCharacterUrl;
            var userClickedOnActiveEmo = $scope.clickedEmo[$scope.activeCostar] == $scope.emosArray[index];
            var depth = ($scope.comic.on_top === $scope.activeCostar) ? 'front' : 'back';

            if (userClickedOnActiveEmo) {
                // restore original emo
                $scope.clickedEmo[$scope.activeCostar] = null;
                newCharacterUrl = TemplatesHelper.getCharacterUrl(activeCostarObj.id, $scope.comic.comic_id, $scope.activeCostar);
            } else {
                // apply new emo
                $scope.clickedEmo[$scope.activeCostar] = $scope.emosArray[index];
                newCharacterUrl = TemplatesHelper.getCharacterUrl(activeCostarObj.id, $scope.comic.comic_id, $scope.activeCostar, index);
            }

            makeComicWizard.customized(true);
            Draw.drawCharacter(depth, newCharacterUrl);
        };

        $scope.isActiveEmo = function (index) {
            return $scope.clickedEmo[$scope.activeCostar] == $scope.emosArray[index];
        };

        // Share
        $scope.goToShare = function () {
            if (customizedCaption()) {
                makeComicWizard.customCaption(captionUndoNames($scope.caption, $scope.comic.user_a, $scope.comic.user_b));
            }

            if (makeComicWizard.customized()) {
                Draw.pushBackup();
                makeComicWizard.customCanvas(Draw.getCanvasImageData());
            }

            NavHelper.share(templateId);
        };

        $scope.$on('$viewContentLoaded', function () {
            $scope.$emit('loaded');
        });

        $scope.$on('$destroy', Draw.cleanup);
    });
