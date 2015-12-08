'use strict';

(function(window) {
    /***********************************************************************/

    /**
     * A class defining a text bubble associated to a costar within a stage
     *
     * @param options.costar
     * @param options.maxTextWidth
     * @param options.callback
     *
     */
    var BUBBLE_FILL_COLOUR = '#fdfcf4';
    var BUBBLE_STROKE_COLOUR = '#000000';
    var BUBBLE_CORNER_ROUNDING = 38;

    // font size must match font-size value in _canvasSceneEditor.scss
    var BUBBLE_FONT = '30px Chatterbox, Helvetica Neue';

    function Bubble(stage, options) {
        var DEFAULT_BUBBLE_TEXT = 'Type here';

        this.bubblePadding = {
            paddingHorizontal: 32,
            paddingVertical: 26
        };

        this.textBubbleCallback = (!!options.callback) ? options.callback : function() {};

        // Required options
        if (typeof options.costar === "undefined") { throw new Error('costar is required for bubble'); }
        if (typeof options.maxTextWidth === "undefined") { throw new Error('maxTextWidth is required for bubble'); }
        if (typeof options.minTextWidth === "undefined") { throw new Error('minTextWidth is required for bubble'); }
        if (typeof options.posX === "undefined") { throw new Error('posX is required for bubble'); }
        if (typeof options.posY === "undefined") { throw new Error('posY is required for bubble'); }
        if (typeof options.orientation === "undefined") { throw new Error('orientation is required for bubble'); }
        if (typeof options.pointerLocation === "undefined") { throw new Error('pointerLocation is required for bubble'); }
        if (typeof options.bufferRect === "undefined") { throw new Error('bufferRect is required for bubble'); }

        this.stage = stage;

        this.bufferRect = options.bufferRect;

        this.container = new createjs.Container();

        // set costar for the bubble container to retrieve later for click callback
        this.costar = options.costar;

        this.bubbleUnder = new createjs.Shape();
        this.bubbleOver = new createjs.Shape();
        this.bubblePointer = new window.EaselModels.BubblePointer(this, {
            orientation: options.orientation,
            pointerLocation: options.pointerLocation,
            pointerXPercent: options.pointerXPercent
        });
        this.fillColour = BUBBLE_FILL_COLOUR;
        this.outlineColour = BUBBLE_STROKE_COLOUR;
        this.strokeSize = 6;
        this.style = 'regular';

        this.textField = new createjs.Text('', BUBBLE_FONT, BUBBLE_FILL_COLOUR);
        this.textField.textAlign = 'center';
        this.textField.textBaseline = 'alphabetic';
        // enable wrapping on spaces
        this.textField.lineWidth = options.maxTextWidth;
        this.minTextWidth = options.minTextWidth;

        this.container.addChild(
            this.bubbleUnder,
            this.bubblePointer.container,
            this.bubbleOver,
            this.textField
        );

        this.setPosition(options.posX, options.posY);
        this.defaultText = DEFAULT_BUBBLE_TEXT;
        this.setText(DEFAULT_BUBBLE_TEXT);
        this.setVisibility(false);
    }

    Bubble.prototype.makeDraggable = function() {
        this.draggingBubble = false;
        this.draggingPointer = false;
    };

    Bubble.prototype.getContainer = function() {
        return this.container;
    };

    Bubble.prototype.getTextField = function() {
        return this.textField;
    };

    Bubble.prototype.getDefaultText = function () {
        return this.defaultText;
    };

    Bubble.prototype.getMetrics = function() {
        var myMetrics = this.textField.getMetrics();
        if (myMetrics.width < this.minTextWidth) {
            myMetrics.width = this.minTextWidth;
        }
        return myMetrics;
    };

    Bubble.prototype.setTextFieldColour = function(colour) {
        this.textField.color = colour;
        this.stage.clear();
        this.stage.update();
    };

    Bubble.prototype.setEditingModeToInactive = function () {
        this.setTextFieldColour(BUBBLE_STROKE_COLOUR);
    };

    Bubble.prototype.setEditingModeToActive = function () {
        this.setTextFieldColour(BUBBLE_FILL_COLOUR);
    };

    Bubble.prototype.setText = function(text) {
        var metrics;
        var textSplit;

        this.textField.text = text;
        this.draw();

        // Check for text wrapping
        metrics = this.getMetrics();

        if (metrics.width > this.maxTextWidth) {
            // our text is too wide. Break it into bits and test if each bit is too wide
            textSplit = text.split(' ');
            this._checkBubbleWidth(textSplit);
        } else {
            this.stage.clear();
            this.stage.update();
        }
    };

    Bubble.prototype._checkBubbleWidth = function(textSplit) {
        var metrics, text1of2, text2of2, halfLength;

        for (var i = 0; i<textSplit.length; i++) {
            // text the width of each word
            this.setText(textSplit[i]);
            metrics = this.getMetrics();

            if (metrics.width > this.maxTextWidth) {
                // this word is too big. split it in half, start over
                halfLength = Math.floor(textSplit[i].length/2);
                text1of2 = textSplit[i].substring(0, halfLength);
                text2of2 = textSplit[i].substring(halfLength);
                textSplit.splice(i, 1, text1of2, text2of2);
                this.setText(textSplit.join(' '));
                return;
            }
        }
    };

    Bubble.prototype.setPosition = function(x, y) {
        this.container.x = x;
        this.container.y = y;
    };

    Bubble.prototype.getPosX = function() {
        return this.container.x;
    };

    Bubble.prototype.getPosY = function() {
        return this.container.y;
    };

    Bubble.prototype.setVisibility = function(value) {
        value = !!value;
        if (this.container.visible !== value) {
            this.container.visible = value;
            this.draw();
        }
    };

    Bubble.prototype.getVisibility = function() {
        return this.container.visible;
    };

    Bubble.prototype.draw = function() {
        switch(this.style) {
        case "regular":
            this.drawRegular();
            break;

        default:
            throw new Error("I don't know this bubble style");
        }

        this.stage.clear();
        this.stage.update();
    };

    Bubble.prototype.clickTest = function (stageX, stageY) {
        var local = this.bubbleOver.globalToLocal(stageX, stageY);
        return this.bubbleOver.hitTest(local.x, local.y);
    };

    Bubble.prototype.drawRegular = function() {
        var metrics = this.getMetrics();

        var x = this.textField.x - this.bubblePadding.paddingHorizontal / 2 - metrics.width/2;
        var y = this.textField.y + metrics.vOffset - this.bubblePadding.paddingVertical / 2;
        var w = metrics.width + this.bubblePadding.paddingHorizontal;

        if (w < this.bubblePointer.getWidth() * 2) {
            x -= (this.bubblePointer.getWidth() * 2 - w) / 2;
            w = this.bubblePointer.getWidth() * 2;
        }

        var h = metrics.height + this.bubblePadding.paddingVertical;
        var r = Math.min(BUBBLE_CORNER_ROUNDING, h/2);

        // draw the bubble underneath, with outline
        this.bubbleUnder.graphics.clear();
        this.bubbleUnder.graphics.beginStroke(this.outlineColour);
        this.bubbleUnder.graphics.beginFill(this.fillColour);
        this.bubbleUnder.graphics.setStrokeStyle(this.strokeSize);
        this.bubbleUnder.graphics.drawRoundRect(x, y, w, h, r);

        // draw the bubble overtop, no outline
        this.bubbleOver.graphics.clear();
        this.bubbleOver.graphics.beginFill(this.fillColour);
        this.bubbleOver.graphics.drawRoundRect(x, y, w, h, r);
        this.bubbleOver.setBounds(x, y, w, h);

        // Draw pointer
        this.bubblePointer.drawRegular(x, y, w, h, r);

        this.respectBounds();
    };

    Bubble.prototype.respectBounds = function() {
        // Container bounds as rectangle
        var r = this.container.getBounds();

        // Horizontal bounds
        var leftLimit = this.bufferRect.x + r.width/2;
        var rightLimit = this.bufferRect.x + this.bufferRect.width - r.width/2;
        this.container.x = Math.max(leftLimit, Math.min(rightLimit, this.container.x));

        // Vertical bounds
        var topLimit = this.bufferRect.y - r.y;
        var bottomLimit = this.bufferRect.y + this.bufferRect.height - r.height - r.y;
        this.container.y = Math.max(topLimit, Math.min(bottomLimit, this.container.y));
    };

    Bubble.prototype.handleDragDown = function (evt) {
        this.lastPoint = {x:evt.stageX, y:evt.stageY};
    };

    Bubble.prototype.handleDragMove = function () {
        if (this.lastPoint) {
            var newPoint = {
                x: this.container.stage.mouseX,
                y: this.container.stage.mouseY
            };
            var shiftX = this.lastPoint.x - newPoint.x;
            var shiftY = this.lastPoint.y - newPoint.y;
            var newX = this.container.x - shiftX;
            var newY = this.container.y - shiftY;

            this.lastPoint = newPoint;
            this.container.x = newX;
            this.container.y = newY;
            this.respectBounds();

            this.container.stage.update();
        }
    };

    Bubble.prototype.handleTap = function (costar) {
        this.lastPoint = null;
        this.textBubbleCallback(costar);
    };

    Bubble.prototype.handleDragUp = function () {
        this.lastPoint = null;
    };

    Bubble.prototype.getRectangle = function() {
        if (!this.container.visible) {
            return null;
        }

        var rect = this.container.getBounds();
        var bubbleHitAreaBuffer = 10;
        rect.x -= bubbleHitAreaBuffer;
        rect.y -= bubbleHitAreaBuffer;
        rect.width += bubbleHitAreaBuffer*2;
        rect.height += bubbleHitAreaBuffer*2;

        return rect;
    };

    window.EaselModels.Bubble = Bubble;

})(window);

