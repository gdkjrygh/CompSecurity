'use strict';

angular.module('DirectFeedCtrl', ['comicsService', 'feedsService', 'makeComicWizard',
	'usersService', 'refreshService', 'directComicsService', 'utils', 'navService'])
	.controller('DirectCtrl', function ($scope, NavHelper, Feeds, Comics,
										makeComicWizard, Users, refreshService,
										directComics, $filter, keyLength) {
		var directFeed = Feeds.get_feed('direct');
		var me = Users.me();

		$scope.back = NavHelper.back;

		var feedLoadSuccess = function() {
			$scope.initialized = true;
			$scope.feedItems = directFeed.feed_items;
			$scope.feedHasItems = directFeed.feed_items.length > 0;
		};

		var feedLoadError = function() {
			$scope.feedFailedToLoad = true;
		};

		directFeed.loaded.then(feedLoadSuccess, feedLoadError);

		$scope.retry = function() {
			$scope.feedFailedToLoad = false;
			Feeds.refresh('direct').then(feedLoadSuccess, feedLoadError);
		};

		$scope.putMeInTemplate = function () {
			makeComicWizard.userA(Users.me());
			makeComicWizard.defaultDirect(true);
			NavHelper.browse_templates();
		};

		$scope.viewComic = NavHelper.view_comic;

		$scope.recipientData = function (comic) {
			var numberOfRecipients = keyLength(comic.recipients);
			var firstRecipient = comic.recipients[Object.keys(comic.recipients)[0]];

			if (numberOfRecipients < 1) {
				throw new Error('Trying to list non-direct comic in direct feed');
			}

			return (numberOfRecipients === 1) ?
				$filter('displayName')(firstRecipient) :
				numberOfRecipients + ' people';
		};

		$scope.viewUser = function (user) {
			NavHelper.view_user(user.fb_id);
		};

		$scope.fromMe = Users.amIAuthor;

		$scope.isUnread = function(comic) {
			return (comic.author.user_id != me.bs_id && directComics.isUnread(comic, me));
		};

		$scope.canLoad = true;

		$scope.loadMore = function() {
			$scope.canLoad = false;
			Feeds.load_more('direct')
				['finally'](function() {
					$scope.canLoad = true;
				});
		};

		$scope.loadLatest = function() {
			$scope.canLoad = false;
			return refreshService.refreshHomeTabs()
				['finally'](function() {
					$scope.canLoad = true;
				});
		};
	})
	.filter('onlyDirectComics', function() {
		return function(listOfComics) {
			if (!listOfComics) { return []; }
			return listOfComics.map(function(item) {
				return item.item_data;
			});
		};
	});
