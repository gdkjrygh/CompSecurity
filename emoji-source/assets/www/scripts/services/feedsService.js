'use strict';

angular.module('feedsService', ['remoteService', 'comicsService', 'utils', 'feedShimService'])
	.factory('Feeds', function(Comics, Remote, Log, $q, FeedShimService) {
        // Feeds object contains multiple feeds, referenced by property name
		var INITIAL_FEED_LIMIT = 3;
		var feeds = {};

		var get_feed_remote = function (feed_type, item_id, greater_than_item) {
			var validFeeds = ['home', 'notifications', 'direct'];

			var vars = {
				'method': 'get_feed',
				'item_id': item_id,
				'greater_than_item': greater_than_item,
				'feed_type': feed_type
			};

			if (feed_type === 'notifications') {
				vars['method'] = 'get_notifications_feed';

			// Hacky - depending on feed type, pass users_feed
			} else if (validFeeds.indexOf(feed_type) < 0) {
                var split = feed_type.split("_");
                if (split[0] === "user") {
                    vars['users_feed'] = split[1];
					vars['feed_type'] = 'user';
                } else {
					throw new Error("Invalid non-home feed type: " + feed_type);
				}
            }

			return Remote.post(vars)
				.then(function (response) {
					return {'feed_type':feed_type, 'feed_items':response.data.data};
				});
		};

		var push_into_feed = function (data) {
            var feed = feeds[data.feed_type].feed_items;
			angular.forEach(data.feed_items, function (feed_item) {
                if (feed_item.item_type == 1) {
                    feed_item.item_data = Comics.add_comic(feed_item.item_data);
                }
                feed.push(feed_item);
            });
		};

		var unshift_into_feed = function (data) {
            var feed = feeds[data.feed_type].feed_items;
            var feed_items = data.feed_items;
			for (var i = feed_items.length - 1; i >= 0; i--) {
                if (feed_items[i].item_type == 1) {
                    feed_items[i].item_data = Comics.add_comic(feed_items[i].item_data);
                }
                feed.unshift(feed_items[i]);
            }
		};

		var get_feed = function(type) {
            if (!feeds[type]) {
                feeds[type] = {'feed_items':[], loaded:init(type), locked: false, limit: INITIAL_FEED_LIMIT};
            }
			else if (feeds[type].loadingFailed) {
				feeds[type].loaded = init(type);
			}
			return feeds[type];
		};

		var load_more = function(feed_type) {
			if (!feeds[feed_type]) {
				return;
			}
			var feed = feeds[feed_type];
			var feed_items = feed.feed_items;

			if (feed_items.length === 0) {
				return feed.loaded;
			}

			if (feed.locked) {
				return $q.when();
			}

			var promise = get_feed_remote(feed_type,
										  feed_items[feed_items.length - 1].item_id,
										  false);

			promise.then(push_into_feed);
			promise.then(function(data){
				if (data.feed_items.length === 0) {
					feed.locked = true;
				}
			});
			return promise;
		};

		var load_latest = function(feed_type) {
			if (!feeds[feed_type]) {
				return;
			}
			var feed = feeds[feed_type].feed_items;
			var firstId = (!!feed[0]) ? feed[0].item_id : null;
			var promise = get_feed_remote(feed_type, firstId, true);
			promise.then(unshift_into_feed);
			return promise;
		};

		var init = function (feed_type) {
			var promise = get_feed_remote(feed_type, false, false);
			promise.then(push_into_feed, function error() {
				feeds[feed_type].loadingFailed = true;
			});
			return promise;
		};

        var delete_comic = function (comic) {
            var comic_id = comic.comic_id;
            // Ugly!
            var promise = Comics.delete_comic(comic);
            promise.then(function () {
				angular.forEach(feeds, function(feed) {
					for (var i = 0; i < feed.feed_items.length; i++) {
						var feed_item = feed.feed_items[i];
						if (feed_item.item_type == 1 && feed_item.item_data.comic_id == comic_id) {
							feed.feed_items.splice(i, 1);
							break;
						}
					}
				});

				// Clean notifications
				var notifications = feeds['notifications'];
				if (notifications) {
					notifications.feed_items = notifications.feed_items.filter(function(n) {
						return (n.item_data.comic_id != comic_id);
					});
				}
            });

            return promise;
        };

		var refresh = function(feedType) {
			if (!feeds[feedType]) {
				return;
			}
			var promise = get_feed_remote(feedType, false, false);
			promise.then(function(data) {
				feeds[feedType].feed_items.length = 0;
				feeds[feedType].limit = INITIAL_FEED_LIMIT;
				feeds[feedType].locked = false;
				push_into_feed(data);
			});
			return promise;
		};

		var respondToNativeNotification = function () {
			this.load_latest('home');
			this.load_latest('notifications');
			this.load_latest('direct');
		};

		return {
			get_feed: get_feed,
			load_more: load_more,
			load_latest: load_latest,
            // Ugly! But not sure how else to clean up the feed
            delete_comic: delete_comic,
			refresh: refresh,
			respondToNativeNotification: respondToNativeNotification
		};
	});
