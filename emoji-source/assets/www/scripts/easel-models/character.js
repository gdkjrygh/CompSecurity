'use strict';

(function (window) {
    /**
     * A class defining a character bitmap associated to a costar within a stage
     *
     * @param stage
     * @param options.costar
     *
     */
    function Character() {
        this.container = new createjs.Container();
        this.bitmap = new createjs.Bitmap();
        this.container.addChild(this.bitmap);
    }

    Character.prototype.handleDragDown = function (evt) {
        this.lastPoint = {
            x: evt.stageX,
            y: evt.stageY
        };
    };

    Character.prototype.handleDragMove = function () {
        if (this.lastPoint) {
            var newPoint = {x: this.container.stage.mouseX, y: this.container.stage.mouseY};
            var shiftX = this.lastPoint.x - newPoint.x;
            var shiftY = this.lastPoint.y - newPoint.y;
            var newX = this.container.x - shiftX;
            var newY = this.container.y - shiftY;
            this.lastPoint = newPoint;
            this.container.x = newX;

            if (newY >= 0) {
                this.container.y = newY;
            }

            this.container.stage.update();
        }

    };

    Character.prototype.handleTap = function (evt) {
        this.lastPoint = null;
    };

    Character.prototype.handleDragUp = function () {
        this.lastPoint = null;
    };

    Character.prototype.getRectangle = function (mouseX, mouseY) {
        var rect = this.container.getBounds();
        var pt = this.container.globalToLocal(mouseX, mouseY);
        var hitPixels = this.bitmap.hitTest(pt.x, pt.y);

        return rect && hitPixels ? rect : null;
    };

    window.EaselModels.Character = Character;

})(window);
