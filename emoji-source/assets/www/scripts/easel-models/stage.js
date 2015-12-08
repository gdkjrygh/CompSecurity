'use strict';

(function (window) {
    window.EaselModels = {};

    var MAX_TEXT_WIDTH = 400;
    var MIN_TEXT_WIDTH = 46;
    var STAGE_BUFFER_SIZE = 15;
    var DRAG_INTERVAL = 30;

    var createjs = window.createjs;
    var noop = function () {
    };

    /**
     * A class defining a world to customize a comic
     */
    function Stage(options) {
        if (typeof options.canvas === "undefined") {
            throw new Error('canvas is required for stage');
        }
        if (typeof options.bubbleData === "undefined") {
            throw new Error('bubbleData is required for stage');
        }
        if (typeof options.textAreaElement === "undefined") {
            throw new Error('textAreaElement is required for stage');
        }
        if (typeof options.bubbleClickCallback === "undefined") {
            throw new Error('bubbleClickCallback is required for stage');
        }
        if (typeof options.setEditingCallback === "undefined") {
            throw new Error('setEditingCallback is required for stage');
        }
        if (typeof options.wholeSceneUrl === "undefined") {
            throw new Error('wholeSceneUrl is required for stage');
        }
        if (typeof options.costarUrlsObj === "undefined") {
            throw new Error('costarUrlsObj is required for stage');
        }
        if (typeof options.costarOnTop === "undefined") {
            throw new Error('costarOnTop is required for stage');
        }

        this.canvas = options.canvas;

        // Default optional values
        options.canvasWidth = options.canvasWidth || 896;
        options.canvasHeight = options.canvasHeight || 656;
        options.maxTextWidth = options.maxTextWidth || MAX_TEXT_WIDTH;

        var rect = this.canvas.getBoundingClientRect();
        this.scale = rect.width / options.canvasWidth;
        this.textAreaElement = options.textAreaElement;
        this.editingCallback = options.setEditingCallback;
        this.options = options;

        this.photoBackup = {};

        this.stage = new createjs.Stage('canvas');

        // Callbacks
        this.onAssetsReadyCallback = options.onAssetsReadyCallback || noop;
        this.onAssetsErrorCallback = options.onAssetsErrorCallback || noop;

        var BackgroundLayer = window.EaselModels.BackgroundLayer;
        this.bgLayerBack = new BackgroundLayer();
        this.bgLayerMid = new BackgroundLayer();
        this.bgLayerFront = new BackgroundLayer();
        this.bgBitmapSceneBack = this.bgLayerBack.bitmap;
        this.bgBitmapSceneMid = this.bgLayerMid.bitmap;
        this.bgBitmapSceneFront = this.bgLayerFront.bitmap;

        var Character = window.EaselModels.Character;
        this.costarBack = new Character();
        this.costarFront = new Character();
        this.costarBackBitmap = this.costarBack.bitmap;
        this.costarFrontBitmap = this.costarFront.bitmap;

        createjs.Touch.enable(this.stage);

        var handleDragMove = function (stageObj) {
            if (stageObj.interactiveElement) {
                stageObj.interactiveElement.handleDragMove();
            }
        };

        var handleDragDown = function (evt) {
            var self = this;

            // save the clickPoint so we can compare drag vs tap
            this.clickPoint = {
                localX: evt.localX,
                localY: evt.localY,
                stageX: evt.stageX,
                stageY: evt.stageY
            };

            var pt;
            var rect;
            var thisElement;
            this.interactiveElement = null;

            // handle touch events on all interactive elements
            for (var i = 0; i < this.stageInstance.interactiveElementsList.length; i++) {
                thisElement = this.stageInstance.interactiveElementsList[i].element;
                pt = thisElement.container.globalToLocal(evt.stageX, evt.stageY);
                rect = thisElement.getRectangle(evt.stageX, evt.stageY);

                if (rect && rect.contains(pt.x, pt.y)) {
                    this.interactiveElement = thisElement;
                    break;
                }
            }

            if (this.interactiveElement) {
                handleDragMove(self);

                this.dragInterval = setInterval(function () {
                    handleDragMove(self);
                }, DRAG_INTERVAL);

                this.interactiveElement.handleDragDown(evt);
            }
        };

        var handleDragUp = function (evt) {
            clearInterval(this.dragInterval);

            // tapping is only relevant if there was an interaction
            if (this.interactiveElement) {
                var clickThreshold = 10;
                var hasBeenDraggedOnX = Math.abs(evt.stageX - this.clickPoint.stageX) > clickThreshold;
                var hasBeenDraggedOnY = Math.abs(evt.stageY - this.clickPoint.stageY) > clickThreshold;

                if (!hasBeenDraggedOnX && !hasBeenDraggedOnY) {
                    // we tapped!
                    this.interactiveElement.handleTap(this.interactiveElement.costar);
                } else {
                    this.interactiveElement.handleDragUp();
                }
            }
        };

        this.sceneContainer = new createjs.Container();
        this.sceneContainer.mouseChildren = false;
        this.stage.stageInstance = this;
        this.stage.on('mousedown', handleDragDown);
        this.stage.on('pressup', handleDragUp);

        // Asset loading
        this.assetsReady = false;
        this.resolveAssetQueueAndDraw(options);

        this.stage.setBounds(0, 0, options.canvasWidth, options.canvasHeight);

        // add the stack of display objects
        var displayStack = [
            this.bgLayerBack.container,
            this.costarBack.container,
            this.bgLayerMid.container,
            this.costarFront.container,
            this.bgLayerFront.container
        ];

        for (var i = 0; i < displayStack.length; i++) {
            this.sceneContainer.addChild(displayStack[i]);
        }

        this.stage.addChild(this.sceneContainer);

        // Create bubble boundaries
        this._initBufferRect(options);
        // Create Bubbles
        this._initBubbles(options);

        // Restore state if any
        if (options.comicStateBackup) {
            this._restoreBubbles(options.comicStateBackup.bubbles);
        }

        if (options.comicStateBackup && options.comicStateBackup.photo) {
            this._repositionAvatar(options.comicStateBackup.photo.position);
        }
    }

    Stage.prototype.registerInteractiveElement = function (options) {
        if (typeof options.element === 'undefined') {
            throw new Error('`options.element` is required for `registerInteractiveElement`');
        }
        if (typeof options.weight === 'undefined') {
            throw new Error('`options.weight` is required for `registerInteractiveElement`');
        }

        if (!this.interactiveElementsList) {
            this.interactiveElementsList = [];
        }

        this.interactiveElementsList.push(options);

        this.interactiveElementsList.sort(function (a, b) {
            if (a.weight > b.weight) {
                return 1;
            }

            if (a.weight < b.weight) {
                return -1;
            }

            // a must be equal to b
            return 0;
        });
    };

    Stage.prototype.resolveAssetQueueAndDraw = function (options) {
        var duoComic = !!options.costarUrlsObj.b;
        var assetsRemaining = (duoComic) ? 3 : 2;
        var comicData = {};
        var self = this;

        var handleAllResourcesLoaded = function (result) {
            var positionForA = (options.costarOnTop === 1) ? "front" : "back";
            var positionForB = (options.costarOnTop === 2) ? "front" : "back";

            // Draw background
            self.applyBackground(comicData.backgrounds);

            // Draw costarA
            self.drawCharacter(positionForA, comicData.costarA.src);

            // Draw costarB
            if (duoComic) {
                self.drawCharacter(positionForB, comicData.costarB.src);
            }

            self.assetsReady = true;
            self.onAssetsReadyCallback(self);
        };

        var handleResourceLoadingFailure = function (result) {
            self.assetsReady = false;

            var image = new Image();
            image.src = 'images/retries/comic-fail.png';
            image.onload = function () {
                self.bgBitmapSceneBack.image = image;
                self.update();
            };

            self.onAssetsErrorCallback(result);
        };

        var loadImage = function (imageUrl, key) {
            var image = new Image();
            image.crossOrigin = '';
            image.src = imageUrl;

            image.onerror = handleResourceLoadingFailure;

            image.onload = function () {
                assetsRemaining--;
                comicData[key] = image;

                if (!assetsRemaining) {
                    handleAllResourcesLoaded();
                }
            };
        };

        loadImage(options.wholeSceneUrl, 'backgrounds');
        loadImage(options.costarUrlsObj.a, 'costarA');
        if (duoComic) {
            loadImage(options.costarUrlsObj.b, 'costarB');
        }
    };

    Stage.prototype.isReady = function () {
        return this.assetsReady;
    };

    Stage.prototype._initBufferRect = function (options) {
        this.bufferRect = new createjs.Rectangle(
            STAGE_BUFFER_SIZE, // x
            STAGE_BUFFER_SIZE, // y
            options.canvasWidth - (2 * STAGE_BUFFER_SIZE), // width
            options.canvasHeight - (2 * STAGE_BUFFER_SIZE) // height
        );
    };

    Stage.prototype.addBubble = function (costar, bubbleData, options) {
        var Bubble = window.EaselModels.Bubble;
        var thisBubble = new Bubble(this.stage,
            {
                costar: costar,
                posX: bubbleData.x * options.canvasWidth,
                posY: bubbleData.y * options.canvasHeight,
                orientation: bubbleData.pointer_orientation,
                pointerLocation: bubbleData.pointer_location,
                callback: options.bubbleClickCallback,
                maxTextWidth: options.maxTextWidth,
                pointerXPercent: this.options.pointerXPercent,
                minTextWidth: MIN_TEXT_WIDTH,
                bufferRect: this.bufferRect
            }
        );
        thisBubble.mouseEnabled = false;
        thisBubble.mouseChildren = false;
        this.bubbles.push(thisBubble);
        this.stage.addChild(thisBubble.getContainer());

        // register the bubbles and their pointers with the list of interactive elements
        this.registerInteractiveElement({element: thisBubble, weight: 0});
        this.registerInteractiveElement({element: thisBubble.bubblePointer, weight: 1});

        return thisBubble;
    };

    Stage.prototype._initBubbles = function (options) {
        this.bubbles = [];
        this.activeBubbleIndex = 0;
        // avoid duplication by using a method to add a new bubble
        this.textBubble1 = this.addBubble(1, options.bubbleData[0], options);
        if (options.bubbleData[1]) {
            this.textBubble2 = this.addBubble(2, options.bubbleData[1], options);
        }
    };

    Stage.prototype._restoreBubbles = function (backupBubbles) {
        var bubble;
        var backupBubble;

        for (var i = 0; i < this.bubbles.length; i++) {
            bubble = this.bubbles[i];
            backupBubble = backupBubbles[i];

            if (backupBubble) {
                bubble.setText(backupBubble.text);
                bubble.container.x = backupBubble.position.x;
                bubble.container.y = backupBubble.position.y;
                bubble.container.costar = backupBubble.costar;
                bubble.setVisibility(backupBubble.visible);

                bubble.bubblePointer.x = backupBubble.pointerData.x;
                bubble.bubblePointer.y = backupBubble.pointerData.y;
                bubble.bubblePointer.scaleX = backupBubble.pointerData.scaleX;
                bubble.bubblePointer.scaleY = backupBubble.pointerData.scaleY;
            }
        }

        this.setEditing(0);
        this.update();
    };

    Stage.prototype._repositionAvatar = function (positioningData) {
        if (positioningData) {
            this.costarFrontBitmap.x = positioningData.x;
            this.costarFrontBitmap.y = positioningData.y;
            this.update();
        }
    };

    Stage.prototype.getBubble = function (index) {
        return this.bubbles[index];
    };

    Stage.prototype.update = function () {
        this.stage.clear();
        this.stage.update();
    };

    Stage.prototype.resetBackground = function (deleteBool) {
        if (deleteBool) {
            this.bgBitmap.image = null;
        }

        this.bgBitmap.visible = false;
        this.update();
    };

    Stage.prototype.getSceneContainer = function () {
        return this.sceneContainer;
    };

    Stage.prototype.drawCharacter = function (depth, avatarUrl) {
        var characterContainer,
            self = this,
            avatarImage = new Image();

        switch (depth) {
            case 'back':
                characterContainer = this.costarBackBitmap;
                break;
            case 'front':
                characterContainer = this.costarFrontBitmap;
                break;
            default:
                throw new Error('Specify character depth, i.e. `front` or `back`');
        }

        avatarImage.crossOrigin = '';
        avatarImage.src = avatarUrl;

        this.photoBackup.avatarTemplate = avatarUrl;

        avatarImage.onload = function () {
            characterContainer.image = avatarImage;
            self.update();
        };
    };


    Stage.prototype.drawBackgroundPhoto = function (imageData, photoPosition) {
        var self = this;
        var backgroundPhoto = new Image();
        backgroundPhoto.onload = function () {
            self.applyBackground(backgroundPhoto, photoPosition);
        };

        backgroundPhoto.crossOrigin = '';
        backgroundPhoto.src = imageData;
        // add as property of stage object to retrieve for backup
        this.photoBackup.background = imageData;
    };

    Stage.prototype.applyBackground = function (fullImage) {
        throw new Error('Stage children need to implement applyBackground method.');
    };

    Stage.prototype.retryResolvingAssetsAndDraw = function () {
        this.bgBitmapSceneBack.image = null;
        this.update();
        this.resolveAssetQueueAndDraw(this.options);
    };

    Stage.prototype.textClick = function (pageX, pageY) {
        // Find the top left position of the canvas on the page so we can translation pageX/Y to stage coordinates
        var canvasRect = this.canvas.getBoundingClientRect();
        var canvasPositionOnPageX = canvasRect.left;
        var canvasPositionOnPageY = canvasRect.top + window.scrollY;

        var stageClickX = (pageX - canvasPositionOnPageX) / this.scale;
        var stageClickY = (pageY - canvasPositionOnPageY) / this.scale;

        var bubble = this.getBubble(this.activeBubbleIndex);
        var hit = bubble.clickTest(stageClickX, stageClickY);

        if (!hit) {
            this.setEditing(0);
        }

        return hit;
    };

    Stage.prototype.setEditing = function (value, scopeApply) {
        if (!this.assetsReady && !this.getCustomizedComicState()) {
            this.retryResolvingAssetsAndDraw();
            return;
        }

        this.getBubble(0).setEditingModeToInactive();
        var bubbleB = this.getBubble(1);
        if (bubbleB) {
            bubbleB.setEditingModeToInactive();
        }

        // We are editing bubble 1 or 2
        this.syncTextPosition(value);

        this.stage.update();
        this.editingCallback(value, scopeApply);
    };

    Stage.prototype.syncTextPosition = function (value) {
        if (value !== 0) {
            this.activeBubbleIndex = value - 1;
            var activeBubble = this.getBubble(this.activeBubbleIndex);
            activeBubble.setEditingModeToActive();
            var textAreaX = activeBubble.getPosX() * this.scale - this.options.maxTextWidth * this.scale / 2 + 'px';
            var textAreaY = activeBubble.getPosY() * this.scale - 50 * this.scale / 2 + 'px';

            this.textAreaElement.style.width = this.options.maxTextWidth + 'px';
            this.textAreaElement.style.left = textAreaX;
            this.textAreaElement.style.top = textAreaY;
        }
    };

    Stage.prototype.getImageData = function () {
        return this.stage.toDataURL();
    };

    Stage.prototype.getCustomizedComicState = function () {
        var bubble;
        var bubblesData = [];
        var photoComicData = {};

        // Setting the customized bubble state
        for (var i = 0; i < this.bubbles.length; i++) {
            bubble = this.bubbles[i];

            bubblesData.push({
                text: bubble.getTextField().text,
                userHasEdited: bubble.getTextField().text !== bubble.getDefaultText(),
                position: {
                    x: bubble.getPosX(),
                    y: bubble.getPosY()
                },
                costar: bubble.container.costar,
                visible: bubble.container.visible,
                pointerData: bubble.bubblePointer.getPointerPositioning()
            });
        }

        // Setting the customized photo comic state
        photoComicData.background = this.photoBackup.background;
        photoComicData.backgroundPosition = {
            x: this.bgBitmapSceneBack.x,
            y: this.bgBitmapSceneBack.y
        };

        photoComicData.avatarTemplate = this.photoBackup.avatarTemplate;
        photoComicData.position = {
            x: this.costarFrontBitmap.x,
            y: this.costarFrontBitmap.y
        };

        return {
            bubbles: bubblesData,
            photo: photoComicData
        };
    };


    Stage.prototype.destroy = function () {
        this.stage.enableDOMEvents(false);
        this.stage.removeAllChildren();
    };

    window.EaselModels.Stage = Stage;
})(window);
