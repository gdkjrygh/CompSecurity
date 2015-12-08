'use strict';

angular.module('NotificationsCtrl', ['usersService', 'feedsService',
		'templatesService', 'costarsService', 'templatesHelperService',
		'mementoService', 'refreshService'])
.controller('NotificationsCtrl',
	function ($scope, $q, Feeds, Templates, Costars, TemplatesHelper, Users,
		NavHelper, memento, refreshService) {

        $scope.back = NavHelper.back;

		$scope.view_user = NavHelper.view_user;
		$scope.view_comic = NavHelper.view_comic;

		$scope.canLoad = false;

		$scope.fetching_more_notifications = false;

		$scope.save = function () {
			return {
				$scroll: 'auto'
			};
		};

		memento($scope, 'notifications_feed');

		$scope.add = function () {
			if ($scope.feed.feed_items.length > $scope.feed.limit) {
				$scope.feed.limit += 3;
			} else if ($scope.fetching_more_notifications === false) {
				$scope.fetching_more_notifications = true;
				$scope.canLoad = false;
				Feeds.load_more('notifications').then(function () {
					$scope.canLoad = true;
					$scope.fetching_more_notifications = false;
					$scope.feed.limit += 3;
				});
			}
		};


		$scope.feed = Feeds.get_feed('notifications');

		$scope.notificationsLoading = true;

		$scope.feed.loaded.then(function () {
			$scope.$emit('loaded');
			$scope.canLoad = true;
			$scope.feed.limit = 10;
			$scope.feedIsEmpty = $scope.feed.feed_items.length === 0;
			$scope.notificationsLoading = false;
		});

		$scope.refresh = function() {
			$scope.canLoad = false;

			return refreshService.refreshHomeTabs().then(function() {
				$scope.feed.limit = 10;
				$scope.canLoad = true;
			});

		};

		$scope.is_me = function (user) {
			return (user.fb_id == Users.me().fb_id);
		};

		$scope.is_like = function (notification) {
			return notification.item_type === 2;
		};

		$scope.is_comment = function (notification) {
			return notification.item_type === 3;
		};

		$scope.get_verb = function (notification) {
			var isAuthor;

			if ($scope.is_like(notification)) {
				return 'liked';
			} else if ($scope.is_comment(notification)) {
				isAuthor = Users.amIAuthor(notification.item_data);
				return (isAuthor) ? 'commented on' : 'also commented on';
			}
		};

		$scope.subject = function (notification) {
			if ($scope.is_like(notification)) {
				return notification.item_data.liker;
			} else if ($scope.is_comment(notification)) {
				return notification.item_data.commenter;
			}
		};
	});
