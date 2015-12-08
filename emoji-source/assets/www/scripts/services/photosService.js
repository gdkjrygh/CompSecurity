'use strict';

angular.module('photosService', [])
    .factory('Photos', function ($window, $cordovaCamera, $q) {

        var getPhoto = function (sourceType) {
            var options,
                deferred = $q.defer();

            if (!navigator.camera) {
                console.warn('Cordova Camera plugin is not supported!');
                // Provide something so we can test in the browser...
                deferred.resolve('http://images.bitstrips.com/cordova-temp-images/' + parseInt(Math.random()*2+1, 10) + '.jpg');
                return deferred.promise;
            }

            options = {
                quality: 75,
                destinationType: Camera.DestinationType.DATA_URL,
                sourceType: Camera.PictureSourceType[sourceType],
                correctOrientation: true,
                targetWidth: 1000,
                targetHeight: 800,
                allowEdit: false,
                encodingType: Camera.EncodingType.JPEG,
                popoverOptions: CameraPopoverOptions,
                saveToPhotoAlbum: false
            };

            $cordovaCamera.getPicture(options)
                .then(function (imageData) {
                    deferred.resolve('data:image/jpeg;base64,' + imageData);
                }, function (error) {
                    deferred.reject();
                });

            return deferred.promise;
        };

        var camera = function () {
            return getPhoto('CAMERA');
        };

        var library = function () {
            return getPhoto('PHOTOLIBRARY');
        };

        return {
            camera: camera,
            library: library
        };
    });
