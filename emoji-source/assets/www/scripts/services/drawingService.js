'use strict';

/*
 * Drawer service depends on EaselJS
 */
angular.module('drawingService', ['ngCordova', 'keyboardService'])
    .factory('easelModels', function($window) {
        return {
            PhotoStage: $window.EaselModels.PhotoStage,
            SceneStage: $window.EaselModels.SceneStage
        };
    })
    .factory('Draw', function ($cordovaSocialSharing, $q, easelModels, CordovaKeyboardPlugin, $document) {
        var _comicStateBackup = null;
        var stage;

        var setTheStage = function (textBubbleCallback, bubbleData, textArea, setEditingCallback, wholeSceneUrl, costarUrlsObj, costarOnTop, isPhotoComic) {
            var deferred = $q.defer();

            var onAssetsReadyCallback = function(stage) {
                deferred.resolve(stage);
            };

            var onAssetsErrorCallback = function(error) {
                deferred.reject(error);
            };


            var stageOptions = {
                canvas: document.getElementById('canvas'),
                wholeSceneUrl: wholeSceneUrl,
                costarUrlsObj: costarUrlsObj,
                costarOnTop: costarOnTop,
                bubbleData: bubbleData,
                textAreaElement: textArea,
                bubbleClickCallback: textBubbleCallback,
                setEditingCallback: setEditingCallback,
                comicStateBackup: _comicStateBackup,
                onAssetsReadyCallback: onAssetsReadyCallback,
                onAssetsErrorCallback: onAssetsErrorCallback
            };

            if (stage) {
                stage.destroy();
            }

            if (isPhotoComic) {
                stage = new easelModels.PhotoStage(stageOptions);
            } else {
                stage = new easelModels.SceneStage(stageOptions);
            }

            makeClickableToToggleOffEditMode(stage.getSceneContainer());

            // Do the same with the text bubbles to prevent bubbles being dragged away from their text
            makeClickableToToggleOffEditMode(stage.getBubble(0).getContainer()); // bubble 1
            if (stage.getBubble(1)) {
                makeClickableToToggleOffEditMode(stage.getBubble(1).getContainer()); // bubble 2 (if it exists!)
            }

            return deferred.promise;
        };

        var blurCaptionTextArea = function () {
            var captionBox = $document[0].getElementById('caption-textarea');

            if (captionBox) {
                captionBox.blur();
            }
        };

        var makeClickableToToggleOffEditMode = function (bitmap) {
            bitmap.on('mousedown', function (evt) {
                setEditing(0, true);
                blurCaptionTextArea();
            });
        };

        var drawBubble = function(costar) {
            stage.getBubble(costar-1).draw();
        };

        var setBubbleText = function (text, costar) {
            var activeBubble = stage.getBubble(costar-1);
            activeBubble.setText(text);
            stage.syncTextPosition(costar);
        };


        var showBubble = function (value, costar) {
            var activeBubble = stage.getBubble(costar-1);
            activeBubble.setVisibility(!!value);
            stage.update();
        };

        var getBubbleVisibility = function (costar) {
            var activeBubble = stage.getBubble(costar-1);
            return activeBubble.getVisibility();
        };

        var resetBackground = function (deleteBool) {
            stage.resetBackground(deleteBool);
        };

        var share = function () {
            $cordovaSocialSharing.share(null, null, stage.toDataURL());
        };

        var getCanvasImageData = function () {
            return stage.getImageData();
        };

        var drawBackgroundPhoto = function (templateUrl, photoPosition) {
            if (!stage) { throw new Error('There is no stage – cannot draw photo.'); }
            stage.drawBackgroundPhoto(templateUrl, photoPosition);
        };

        var drawCharacter = function (depth, characterUrl) {
            stage.drawCharacter(depth, characterUrl);
        };

        var setEditing = function (value, scopeApply) {
            // where value is expected to be 0, 1, 2
            if (value) {
                CordovaKeyboardPlugin.show();
            } else {
                CordovaKeyboardPlugin.close();
            }

            stage.setEditing(value, scopeApply);
        };

        var pushBackup = function() {
            _comicStateBackup = stage.getCustomizedComicState();
        };

        var clearBackup = function() {
            _comicStateBackup = null;
        };

        var getBackupText = function (costar) {
            var bubbleBackup = _comicStateBackup && _comicStateBackup.bubbles[costar-1] ? _comicStateBackup.bubbles[costar-1] : false;

            if (bubbleBackup && bubbleBackup.userHasEdited) {
                return bubbleBackup.text;
            } else {
                return null;
            }
        };

        var getBackedUpPhotoPosition = function () {
            return _comicStateBackup && _comicStateBackup.photo ? _comicStateBackup.photo.backgroundPosition : null;
        };

        var getBackedUpPhoto = function () {
            return _comicStateBackup && _comicStateBackup.photo ? _comicStateBackup.photo.background : null;
        };

        var getBackedUpAvatar = function () {
            return _comicStateBackup && _comicStateBackup.photo ? _comicStateBackup.photo.avatarTemplate : null;
        };

        var canvasIsLoaded = function () {
            return stage && stage.isReady();
        };

        var textClick = function (pageX, pageY) {
            return stage.textClick(pageX, pageY);
        };

        var cleanup = function () {
            stage.destroy();
            stage = null;
        };

        return {
            setTheStage: setTheStage,
            setBubbleText: setBubbleText,
            resetBackground: resetBackground,
            drawBackgroundPhoto: drawBackgroundPhoto,
            drawCharacter: drawCharacter,
            showBubble: showBubble,
            getBubbleVisibility: getBubbleVisibility,
            drawBubble: drawBubble,
            share: share,
            canvasIsLoaded: canvasIsLoaded,
            getCanvasImageData: getCanvasImageData,
            setEditing: setEditing,
            getBackupText: getBackupText,
            getBackedUpPhoto: getBackedUpPhoto,
            getBackedUpAvatar: getBackedUpAvatar,
            getBackedUpPhotoPosition: getBackedUpPhotoPosition,
            pushBackup: pushBackup,
            clearBackup: clearBackup,
            textClick: textClick,
            cleanup: cleanup
        };
    });
