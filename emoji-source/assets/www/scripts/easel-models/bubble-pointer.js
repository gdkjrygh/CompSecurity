'use strict';

(function(window) {
    /***********************************************************************/

    /**
     * A class defining a special shape to control the bubble pointer
     *
     * @param bubble - The bubble associated to the pointer
     *
     */
    function BubblePointer(bubble, options) {
        this.bubble = bubble;
        this.pointerPadding = 20; // keeps the pointer from getting too close to the bubble edge

        this.container = new createjs.Container();
        this.pointerShape = new createjs.Shape();
        this.container.addChild(this.pointerShape);

        this.container.width = 30;
        this.container.height = 44;

        if (options.orientation === 'right') {
            this.setRightPointer();
        } else {
            this.setLeftPointer();
        }

        // position the pointer on the x-axis based on pointerLocation
        var pointerXPercent = options.pointerXPercent || 0.8;

        switch (options.pointerLocation) {
            case 1:
            case 4:
                this.pointerXPercent = -pointerXPercent;
                break;
            case 3:
            case 6:
                this.pointerXPercent = pointerXPercent;
                break;
            default:
                // pointerLocation == 2 or 5
                this.pointerXPercent = 0;
        }

        // position the pointer on the top or bottom based on pointerLocation
        if (options.pointerLocation <= 3) {
            this.container.scaleY = -1;
        }
    }

    BubblePointer.prototype = Object.create(createjs.Shape.prototype);

    BubblePointer.prototype.getWidth = function() {
        return this.container.width;
    };

    BubblePointer.prototype.getHeight = function() {
        return this.container.height;
    };

    BubblePointer.prototype.drawRegular = function(x, y, w, h, r) {
        var metrics = this.bubble.getMetrics();
        var fillColour = this.bubble.fillColour;
        var outlineColour = this.bubble.outlineColour;
        var strokeSize = this.bubble.strokeSize;

        var pointerAdjustY = 28;
        this.pointerX = x + w/2 - this.container.width/2;
        this.pointerY = y + h - (metrics.lineHeight + this.bubble.bubblePadding.paddingVertical)/2 + pointerAdjustY;
        this.areaWidth = w;
        this.areaHeight = h;

        // need new pointer-drawing script
        this.pointerShape.graphics.clear();
        this.pointerShape.graphics.beginStroke(outlineColour);
        this.pointerShape.graphics.beginFill(fillColour);
        this.pointerShape.graphics.setStrokeStyle(strokeSize/2);
        this.pointerShape.graphics.moveTo( // starting point
            this.pointerX, // x
            this.pointerY // y
        );
        this.pointerShape.graphics.quadraticCurveTo( // bottom of the pointer
            this.pointerX + this.container.width/3, // control x
            this.pointerY + this.container.height/2, // control y
            this.pointerX, // x
            this.pointerY + this.container.height // y
        );
        this.pointerShape.graphics.quadraticCurveTo( // top right point
            this.pointerX + this.container.width * 0.9, // control x
            this.pointerY + this.container.height * 0.6,// control y
            this.pointerX + this.container.width * 1.2, // x
            this.pointerY // y
        );

        // If the pointer is at the top adjust the y position
        if (this.container.scaleY == -1) {
            this.adjustVerticalPosition();
        }

        // position the pointer on the x axis
        this.adjustHorizontalPosition();
    };

    BubblePointer.prototype.attemptToMove = function(posX, posY) {
        var self = this;
        var movingRight = function (newX) {
            return (newX > self.container.x);
        };

        var movesPastThreshold = function (posX) {
            return Math.abs(posX - self.container.x) > 5;
        };

        var bubbleHalfWidth = this.bubble.getMetrics().width / 2;
        var leftLimit = 0 - bubbleHalfWidth + this.pointerPadding;
        var rightLimit = bubbleHalfWidth - this.pointerPadding;

        if (posX > leftLimit && posX < rightLimit) {
            // the pointer is within the bubble boundaries
            if (movesPastThreshold(posX)) {
                this[ movingRight(posX) ? 'setRightPointer' : 'setLeftPointer' ]();
            }

            this.container.x = posX;
            this.pointerXPercent = this.container.x/bubbleHalfWidth;
        }

        // Set pointer vertical position
        if (this.container.stage.mouseY > this.bubble.container.y) {
            this.setPointerAtBottom();
        } else {
            this.setPointerAtTop();
        }
    };

    BubblePointer.prototype.setLeftPointer = function() {
        this.container.scaleX = 1;
    };

    BubblePointer.prototype.setRightPointer = function() {
        this.container.scaleX = -1;
    };

    BubblePointer.prototype.setPointerAtBottom = function() {
        this.container.scaleY = 1;
        this.container.y = 0;
    };

    BubblePointer.prototype.setPointerAtTop = function() {
        this.container.scaleY = -1;
        // Translate the pointer to be at the top without redrawing it
        this.adjustVerticalPosition();
    };

    BubblePointer.prototype.adjustVerticalPosition = function() {
        var OFFSET_FACTOR = 50;
        var BUBBLE_HEIGHT_PER_LINE = 32.4;
        var bubbleHeight = this.bubble.getContainer().getBounds() ? this.bubble.getContainer().getBounds().height : BUBBLE_HEIGHT_PER_LINE;
        this.container.y = bubbleHeight - BUBBLE_HEIGHT_PER_LINE - OFFSET_FACTOR;
    };

    BubblePointer.prototype.adjustHorizontalPosition = function() {
        var bubbleHalfWidth = this.bubble.getMetrics().width / 2;
        var posX = this.pointerXPercent * bubbleHalfWidth;

        // keep the pointer within limits
        var leftLimit = (0 - bubbleHalfWidth) + this.pointerPadding;
        var rightLimit = bubbleHalfWidth - this.pointerPadding;

        if (posX < leftLimit) {
            posX = leftLimit;
        } else if (posX > rightLimit) {
            posX = rightLimit;
        }

        this.container.x = posX;
    };

    BubblePointer.prototype.getPointerPositioning = function () {
        return {
            x: this.container.x,
            y: this.container.y,
            scaleX: this.container.scaleX,
            scaleY: this.container.scaleY
        };
    };

    BubblePointer.prototype.getRectangle = function () {
        if (!this.bubble.container.visible) {
            return null;
        }

        var rect = new createjs.Rectangle(
            this.pointerX - this.areaWidth/2,
            this.pointerY,
            this.areaWidth,
            this.areaHeight * 1.2
        );
        return rect;
    };

    BubblePointer.prototype.handleDragDown = function (evt) {
        this.lastPoint = {x:evt.stageX, y:evt.stageY};
    };

    BubblePointer.prototype.handleDragUp = function () {
        this.lastPoint = null;
    };

    BubblePointer.prototype.handleDragMove = function () {
        if (this.lastPoint) {
            var newPoint = {
                x: this.container.stage.mouseX,
                y: this.container.stage.mouseY
            };
            var shiftX = this.lastPoint.x - newPoint.x;
            var shiftY = this.lastPoint.y - newPoint.y;

            this.attemptToMove(this.container.x - shiftX, this.container.y - shiftY);
            this.container.stage.update();
            this.lastPoint = newPoint;
        }
    };

    BubblePointer.prototype.handleTap = function (evt) {
        this.lastPoint = null;
    };

    window.EaselModels.BubblePointer = BubblePointer;

})(window);
