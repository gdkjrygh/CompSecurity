'use strict';

angular.module('HomeCtrl', ['costarsService', 'feedsService', 'templatesService',
    'templatesHelperService', 'mementoService', 'utils',
    'refreshService', 'launchService', 'makeComicWizard', 'bitmojiServices',
    'storageService', 'stateService', 'appRateService'])
    .controller('HomeCtrl',
    function ($scope, $q, Feeds, Templates, Costars, TemplatesHelper, Users, NavHelper, memento, delayPromise, $window, refreshService, Launch, makeComicWizard, BitmojiServices, Storage, State, AppRater) {
        $scope.canLoad = false;
        $scope.fetching_more_comics = false;
        $scope.avatar_home = NavHelper.avatar_home;
        $scope.feed_limit = 3;
        $scope.user = Users.me();

        $scope.showPrivacyPolicyUpdate = $scope.user.showPrivacyPolicyUpdate;
        if ($scope.user.showPrivacyPolicyUpdate) {
            $scope.user.showPrivacyPolicyUpdate = false;
        }

        var feedLoadingSuccess = function () {
            $scope.canLoad = true;
            $scope.feedIsEmpty = $scope.feed.feed_items.length === 0;
            $scope.loading = false;
        };

        var feedLoadingFail = function () {
            $scope.feedFailedToLoad = true;
            $scope.loading = false;
        };

        $scope.getFeed = function () {
            var minimumSpinnerAnimationTime = $scope.feedFailedToLoad ? 1500 : 0;
            $scope.canLoad = false;
            $scope.loading = true;
            $scope.feedFailedToLoad = false;
            $scope.feed = Feeds.get_feed('home');

            delayPromise($scope.feed.loaded, minimumSpinnerAnimationTime).then(feedLoadingSuccess, feedLoadingFail);
        };

        var setInterstitial = function () {
            var users = Users.getFriendsWithAvatars();
            $scope.home_ad = Templates.getHomeAd();
            if ($scope.home_ad) {
                $scope.home_ad.comics = Templates.get_templates($scope.home_ad.templates.slice(0, 4));
                TemplatesHelper.set_user_in_comics($scope.home_ad.comics, users);
                $scope.home_ad.count = Templates.countByTag($scope.home_ad.tag);
                $scope.latest = false;
            } else {
                $scope.latest = Templates.latest_comics();
                TemplatesHelper.set_user_in_comics($scope.latest, users);
            }
        };

        var setFailureMessage = function () {
            $scope.templatesFailedToLoad = true;
            $window.setTimeout(function () {
                throw new Error('Templates failed to load. User cannot make a comic.');
            });
        };

        var loadStuff = function () {
            var a = Costars.init();
            var b = Templates.waiting();

            $scope.loading = true;

            var onLoad = function () {
                setInterstitial();

                $scope.loading = false;

                $scope.$on('tabSwitch', function () {
                    $scope.tabSwitching = false;
                });

                $scope.$emit('loaded');
                makeComicWizard.init();
                Launch.launch({'builder': 'app_is_ready'});
            };

            var listenForTemplatesChange = function () {
                $scope.$on('templatesLoaded', setInterstitial);
            };

            $q.all([a, b, $scope.feed.loaded]).then(onLoad).then(listenForTemplatesChange, setFailureMessage);
        };

        var determineWhetherOrNotToShowTheBitmojiCard = function () {
            var userHasEngagedBitmojiCard = Storage.getItem('has_engaged_bitmoji_card');
			if (!userHasEngagedBitmojiCard && !State.get_key('hasSeenBitmojiAdThisSession')) {
				// If the user has already tapped Get Started or
				// has engaged with the card this session,
				// then we don't show it again
				BitmojiServices.showBitmojiCard()
					.then(function (value) {
						// Are we choosing to show the Bitmoji card?
						$scope.showBitmojiCard = !!value;

						if ($scope.showBitmojiCard) {
							// We are choosing to show the Bitmoji card
							// Get Bitmoji card templates
							BitmojiServices.getBitmojiCardTemplates()
								.then(function (urls) {
									$scope.bitmojis = urls;
								});

							BitmojiServices.getBitmojiUrl()
								.then(function (url) {
									$scope.getBitmojiUrl = url;
								});
						}
					});
			}
        };

        $scope.save = function () {
            return {
                $scroll: 'auto',
                preloaded: true
            };
        };

        $scope.restore = function (state) {
            if (state.preloaded) {
                $scope.tabSwitching = true;
            }
        };

        $scope.add = function () {
            if ($scope.feed.feed_items.length > $scope.feed.limit) {
                $scope.feed.limit += 3;
            } else if ($scope.fetching_more_comics === false) {
                $scope.fetching_more_comics = true;
                $scope.canLoad = false;
                Feeds.load_more('home')
                    .then(function () {
                        $scope.feed.limit += 3;
                    })['finally'](function () {
                    $scope.canLoad = true;
                    $scope.fetching_more_comics = false;
                });
            }
        };

        $scope.loadLatest = function () {
            // If you want to force templates to reload, do this: Templates.reload();
            $scope.canLoad = false;

            TemplatesHelper.load_more_tomorrow();

            return refreshService.refreshHomeTabs().then(function () {
                $scope.canLoad = true;
            }, feedLoadingFail);
        };

        memento($scope, 'my_feed');

        // Defer heavy tasks for responsive UX
        $scope.getFeed();
        $window.setTimeout(loadStuff);
        $window.setTimeout(AppRater.show, 2000);
        determineWhetherOrNotToShowTheBitmojiCard();

        $scope.closeBitmojiCard = function () {
            $scope.showBitmojiCard = false;
            State.set_key('hasSeenBitmojiAdThisSession', true);
        };

        $scope.getBitmoji = function () {
            $scope.showBitmojiCard = false;
            State.set_key('hasSeenBitmojiAdThisSession', true);
            Storage.setItem('has_engaged_bitmoji_card', true);
            Launch.openSystemURL($scope.getBitmojiUrl);
        };
    });
