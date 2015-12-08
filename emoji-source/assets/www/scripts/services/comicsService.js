'use strict';

angular.module('comicsService', ['usersService', 'remoteService', 'navService', 'directComicsService'])
	.factory('Comics', function (Remote, Log, $q, Users, NavHelper, directComics) {
		var comics = {};

		var fetch_comic = function (comic_id) {
			return Remote.post({
				'method': 'get_comic',
				'comic_id': comic_id
			}).then(function (response) {
					return add_comic(response.data.comic);
				});
		};

		var like_toggle = function (comic) {
			if (comic.did_you_like === true) {
				var me = Users.me();
				angular.forEach(comic.comic_likes, function (like, index) {
					if (like.fb_id == me.fb_id) {
						comic.comic_likes.splice(index, 1);
					}
				});
				comic.did_you_like = false;
			} else {
				comic.comic_likes = comic.comic_likes || [];
				comic.comic_likes.push(Users.me());
				comic.did_you_like = true;
			}

			var save_like = function () {
				Remote.post({
					'method': 'like_unlike',
					'comic_id': comic.comic_id,
					'like_value': comic.did_you_like
				});
			};

			save_like();
		};

		var delete_comic = function (comic) {
			var deferred = $q.defer();

			var errorDelete = function () {
				comic.deleting = false;
				comic.try_again = true;
			};

			comic.deleting = true;

			Remote.post({'method': 'delete_comic', 'fb_comic_id': comic.comic_id}).
				then(function (response) {
					var data = response.data;
					if (data && data.fb_comic_id == comic.comic_id) {
						deferred.resolve(true);
						return;
					}
					errorDelete();
				}, errorDelete);

			return deferred.promise;
		};

		// This function transforms the data in two ways:
		// adds the property did_you_like
		// surfaces the users within the likes in to the array
		var transformLikes = function (comic) {
			comic.did_you_like = false;
			var likes = [];
			var me = Users.me();
			angular.forEach(comic.comic_likes, function (like) {
				if (angular.isObject(like) && like.timestamp && like.user) {
					likes.push(like.user);
					if (like.user.fb_id == me.fb_id) {
						comic.did_you_like = true;
					}
				}
			});
			comic.comic_likes = likes;
			return comic;
		};

		var add_comic = function (data) {
			if (data.hasOwnProperty('loaded') === false) {
				data.loaded = true;
			}

			var returnComic;

			// Do we already have the data, but with a loaded? If so, copy the data in
			// Otherwise,
			if (comics.hasOwnProperty(data.comic_id)) {
				var comic = comics[data.comic_id];
				if (comic != data) {
					angular.copy(data, comic);
				}
				returnComic = comic;
			} else {
				comics[data.comic_id] = data;
				returnComic = data;
			}
			return transformLikes(returnComic);
		};

		var add_comment = function (comic, user, comment) {
			//updates the UI for fast response
			comic.comments.push({user: user, timestamp: Date.now() / 1000, text: comment});

			return Remote.post({
				'method': 'add_comment',
				'comic_id': comic.comic_id,
				'comment': comment
			});
		};

		var isComicType = function (type) {
			return function (comic) {
				return comic && parseInt(comic.type, 10) === type;
			};
		};

		var refreshComic = function(comic_id) {
			if (comics.hasOwnProperty(comic_id)) {
				return fetch_comic(comic_id);
			}
		};

		var respondToNativeNotification = function(comicId) {
			refreshComic(comicId);
			NavHelper.viewComicFromNotification(comicId);
		};

		var markComicAsRead = function (comicId) {
			var me = Users.me();
			if (comics.hasOwnProperty(comicId)) {
				directComics.markAsRead(comics[comicId], me);
			}
		};

		return {
			get_comic: function (comic_id) {
				if (comics[comic_id]) {
					return $q.when(comics[comic_id]);
				} else {
					return fetch_comic(comic_id);
				}
			},
			refresh_comic: refreshComic,
			add_comic: add_comic,
			like_toggle: like_toggle,
			delete_comic: delete_comic,
			add_comment: add_comment,
			isStatusComic: isComicType(1),
			isFriendComic: isComicType(2),
			respondToNativeNotification: respondToNativeNotification,
			markComicAsRead: markComicAsRead
		};
	}
);
