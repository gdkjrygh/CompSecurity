'use strict';

angular.module('bitmojiServices', ['usersService'])
    .factory('BitmojiServices', function (Remote, ImageBaseURL, Users, $http, BITMOJI_SERVICES_HOST, $q, Bootstrap) {
        var _promise = $http.get(BITMOJI_SERVICES_HOST + 'bitmoji-dynamic-config');
        var user = Users.me();

        var showBitmojiCard = function () {
            var promise = $q.defer();

            $q.when(_promise)
                .then(function (response) {
                    var showCard = !user.fresh_install && response.data.show_bitmoji_card_in_bitstrips;
                    promise.resolve(showCard);
                }, function (error) {
                    promise.reject(error);
                });

            return promise.promise;
        };

        var getBitmojiCardTemplates = function () {
            var urls = [];
            var templatesPromise = $q.defer();

            $q.when(_promise)
                .then(function (response) {
                    var bitmojiCardTemplateIds = response.data.bitmoji_card_template_ids;
                    var templateUrl;

                    for (var i=0; i < bitmojiCardTemplateIds.length; i++) {
                        templateUrl = ImageBaseURL + bitmojiCardTemplateIds[i] + '-' + user.id + '-v1.png';
                        urls.push(templateUrl);
                    }

                    templatesPromise.resolve(urls);
                }, function (error) {
                    templatesPromise.reject(error);
                });

            return templatesPromise.promise;
        };

        var getGetBitmojiUrl = function () {
            var getBitmojiUrlPromise = $q.defer();

            $q.when(_promise)
                .then(function (response) {
                    // Bootstrap.app_os is either 0 or 1 depending on the platform
                    var platform = 'android';
                    if (Bootstrap.app_os == 1) {
                        platform = 'ios';
                    }
                    getBitmojiUrlPromise.resolve(response.data.get_bitmoji_url[platform]);
                }, function (error) {
                    getBitmojiUrlPromise.reject(error);
                });

            return getBitmojiUrlPromise.promise;
        };

        return {
            showBitmojiCard: showBitmojiCard,
            getBitmojiUrl: getGetBitmojiUrl,
            getBitmojiCardTemplates: getBitmojiCardTemplates
        };
    });
