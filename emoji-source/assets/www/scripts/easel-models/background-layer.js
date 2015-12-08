'use strict';

(function(window) {
    /**
     * A class defining a BackgroundLayer bitmap associated to a costar within a stage
     *
     * @param stage
     * @param options.costar
     *
     */
    function BackgroundLayer() {
        this.container = new createjs.Container();
        this.bitmap  = new createjs.Bitmap();
        this.container.addChild(this.bitmap);
    }

    BackgroundLayer.prototype.handleDragDown = function (evt) {
        this.lastPoint = {
            x: evt.stageX,
            y: evt.stageY
        };
    };

    BackgroundLayer.prototype.handleDragMove = function () {
        if (this.lastPoint) {
            var newPoint = {x:this.container.stage.mouseX, y:this.container.stage.mouseY};
            var shiftX = this.lastPoint.x - newPoint.x;
            var shiftY = this.lastPoint.y - newPoint.y;
            var newX = this.container.x - shiftX;
            var newY = this.container.y - shiftY;
            this.lastPoint = newPoint;

            this.container.x = Math.min(0, Math.max(this.minX, newX));
            this.container.y = Math.min(0, Math.max(this.minY, newY));

            this.container.stage.update();
        }
    };

    BackgroundLayer.prototype.handleTap = function (evt) {
        this.lastPoint = null;
    };

    BackgroundLayer.prototype.handleDragUp = function () {
        this.lastPoint = null;
    };

    BackgroundLayer.prototype.getRectangle = function(mouseX, mouseY) {
        return this.container.getBounds();
    };

    window.EaselModels.BackgroundLayer = BackgroundLayer;

})(window);
