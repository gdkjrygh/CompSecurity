'use strict';

(function(window) {
    var Stage = window.EaselModels.Stage;

    function PhotoStage(options) {
        options.maxTextWidth = 806; // 90% of the canvas size
        options.pointerXPercent = 0.35; // position of the pointer on the x-axis based on pointerLocation
        Stage.call(this, options);
    }

    PhotoStage.prototype = Object.create(Stage.prototype);

    PhotoStage.prototype.drawCharacter = function (depth, avatarUrl) {
        Stage.prototype.drawCharacter.call(this, depth, avatarUrl);

        // register the character with the list of interactive elements
        this.registerInteractiveElement({ element: this.costarFront, weight: 3 });
    };

    PhotoStage.prototype.applyBackground = function (fullImage, photoPosition) {
        // Background image is a photo and needs to be cropped and centered
        this.bgBitmapSceneBack.image = fullImage;

        var bitmapBounds = this.bgBitmapSceneBack.getBounds();
        var widthRatio = this.options.canvasWidth/bitmapBounds.width;
        var heightRatio = this.options.canvasHeight/bitmapBounds.height;

        // The larger ratio is the one that needs to be used for scaling
        var largerRatio = Math.max(widthRatio, heightRatio);

        // Scale the image up
        this.bgBitmapSceneBack.scaleX = this.bgBitmapSceneBack.scaleY = largerRatio;

        // Get new bounds
        var transformedBounds = this.bgBitmapSceneBack.getTransformedBounds();
        var transformedWidth = transformedBounds.width;
        var transformedHeight = transformedBounds.height;

        this.bgLayerBack.minX = this.options.canvasWidth - transformedWidth;
        this.bgLayerBack.minY = this.options.canvasHeight - transformedHeight;

        var xPos, yPos;
        if (photoPosition) {
            xPos = photoPosition.x;
            yPos = photoPosition.y;
        } else {
            // Centre the background image in the stage
            yPos = this.options.canvasHeight / 2 - transformedHeight / 2;
            xPos = this.options.canvasWidth / 2 - transformedWidth / 2;
        }

        this.bgLayerBack.x = xPos;
        this.bgLayerBack.y = yPos;

        this.update();

        // register the photo background with the list of interactive elements
        this.registerInteractiveElement({ element: this.bgLayerBack, weight: 4 });
    };

    PhotoStage.prototype.getImageData = function() {
        return this.stage.toDataURL(null, 'image/jpeg');
    };

    window.EaselModels.PhotoStage = PhotoStage;

})(window);
