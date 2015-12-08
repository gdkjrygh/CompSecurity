'use strict';


angular.module('feedTabsDirective', ['feedsService', 'navService','storageService', 'directComicsService'])
	.controller('FeedTabsCtrl', function ($scope, NavHelper, Feeds, Storage, directComics) {
		var notificationFeed = Feeds.get_feed('notifications');

		$scope.home_feed = NavHelper.home_feed;
		$scope.notification_feed = NavHelper.notification_feed;
		$scope.goToInbox = NavHelper.home_direct;


		$scope.unreadDirectMessages = 0;

		directComics.onUnreadChange(function(number) {
			$scope.unreadDirectMessages = (number > 9) ? '9+' : number;
		});

		directComics.getUnreadComics();

		var updateReadNotifications = function () {
			if (notificationFeed.feed_items.length) {
				Storage.setItem('lastReadTimestamp', notificationFeed.feed_items[0].item_data.timestamp);
			}
		};

		var showUnreadNotifications = function (a,b) {
			var lastReadTimestamp = Storage.getItem('lastReadTimestamp');
            var unreadCounter = 0;
            for (var i = 0; i < notificationFeed.feed_items.length; i++) {
                if (lastReadTimestamp >= notificationFeed.feed_items[i].item_data.timestamp) {
                    break;
                }
                unreadCounter += 1;
            }
            $scope.unreadActivityCount = (unreadCounter > 9) ? '9+' : unreadCounter;
		};

		$scope.notificationFeed = notificationFeed;
		if ($scope.selected === 'notifications') {
			$scope.$watch('notificationFeed', updateReadNotifications, true);
		} else {
			$scope.$watch('notificationFeed', showUnreadNotifications, true);
		}

	})
	.directive('feedTabs', function (VIEWS) {
		return {
			templateUrl: VIEWS + 'feedTabs.html',
			controller: 'FeedTabsCtrl',
			scope: {
				selected: '@'
			},
			restrict: 'E'
		};
	});
