'use strict';

angular.module('UserCtrl', ['navService', 'launchService', 'feedsService', 'mementoService', 'makeComicWizard', 'utils'])
	.controller('UserCtrl', function ($scope, $routeParams, Users, Feeds, NavHelper, Launch, memento, makeComicWizard, delayPromise, $window) {
		if ($routeParams.fb_id) {
			$scope.user = Users.get_user_fb($routeParams.fb_id);
		} else {
			$scope.user = Users.me();
		}

		$scope.put_user_in_template = function () {
			makeComicWizard.userA($scope.user);
			makeComicWizard.userB(Users.me());
			NavHelper.browse_templates();
		};

		$scope.putMeInTemplate = function () {
			makeComicWizard.userA(Users.me());
			NavHelper.browse_templates();
		};

		$scope.edit_avatar = function () {
            NavHelper.avatar_builder('edit');
		};

		$scope.change_picture = NavHelper.change_profile_picture;

        $scope.go_settings = NavHelper.go_settings;

		$scope.native_share = function ($event) {
			var url = $scope.user.thumb;
			Launch.camera_roll(url, '', $event);
		};

		var feed_type = 'user_' + $scope.user.bs_id;
		$scope.canLoad = false;
		$scope.fetchingMoreComics = false;

		var feedLoadingSuccess = function () {
			$scope.canLoad = true;
			$scope.feedIsEmpty = $scope.feed.feed_items.length === 0;
			$scope.loading = false;

			$scope.$on('tabSwitch', function () {
				$scope.tabSwitching = false;
			});

			$scope.$emit('loaded');
		};

		var feedLoadingFail = function () {
			$scope.feedFailedToLoad = true;
			$scope.loading = false;
		};

		$scope.getFeed = function () {
			var minimumSpinnerAnimationTime = $scope.feedFailedToLoad ? 1500 : 0;
			$scope.feedFailedToLoad = false;
			$scope.loading = true;
			$scope.feed = Feeds.get_feed(feed_type);

			delayPromise($scope.feed.loaded, minimumSpinnerAnimationTime).then(feedLoadingSuccess, feedLoadingFail);
		};



		$scope.add = function() {
			if ($scope.feed.feed_items.length > $scope.feed.limit) {
				$scope.feed.limit += 3;
			} else if ($scope.fetchingMoreComics === false) {
				$scope.fetchingMoreComics = true;
				$scope.canLoad = false;
				Feeds.load_more(feed_type).then(function () {
					$scope.canLoad = true;
					$scope.fetchingMoreComics = false;
					$scope.feed.limit += 3;
				});
			}
		};

		$scope.loadLatest = function() {
			$scope.canLoad = false;
			return Feeds.refresh(feed_type).then(function() {
				$scope.canLoad = true;
			}, feedLoadingFail);
		};

		$scope.back = NavHelper.back;

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

		memento($scope, 'feed_' + $scope.user.fb_id);

		// Defer heavy tasks for responsive UX
		$window.setTimeout($scope.getFeed);
	});


