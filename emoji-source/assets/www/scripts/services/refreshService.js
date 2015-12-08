'use strict';

angular.module('refreshService', ['feedsService', 'directComicsService'])
.service('refreshService', function($q, Feeds, directComics) {
	var refreshHomeTabs = function() {

		return $q.all([
			Feeds.refresh('notifications'),
			Feeds.refresh('home'),
			Feeds.refresh('direct'),
			directComics.getUnreadComics({
				force: true
			})
		]);
	};

	return {
		refreshHomeTabs: refreshHomeTabs
	};
});
