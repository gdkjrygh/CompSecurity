'use strict';

(function(window) {
    var Stage = window.EaselModels.Stage;

    function SceneStage(options) {
        Stage.call(this, options);
    }

    SceneStage.prototype = Object.create(Stage.prototype);

    SceneStage.prototype.applyBackground = function (fullImage) {
        var sceneHeight, sceneWidth;

        // Background image is a scene and needs to be sliced
        // Set full image for each of the background layers
        this.bgBitmapSceneBack.image = fullImage;
        this.bgBitmapSceneMid.image = fullImage;
        this.bgBitmapSceneFront.image = fullImage;

        // Reposition the scene for each background layer
        sceneHeight = fullImage.height / 3;
        sceneWidth = fullImage.width;

        this.bgBitmapSceneBack.sourceRect = new createjs.Rectangle(
            0,
            0,
            sceneWidth,
            sceneHeight
        );

        this.bgBitmapSceneMid.sourceRect = new createjs.Rectangle(
            0,
            sceneHeight,
            sceneWidth,
            sceneHeight
        );

        this.bgBitmapSceneFront.sourceRect = new createjs.Rectangle(
            0,
            sceneHeight*2,
            sceneWidth,
            sceneHeight
        );

        this.update();
    };

    window.EaselModels.SceneStage = SceneStage;

})(window);
