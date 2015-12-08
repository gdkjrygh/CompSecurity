'use strict';

angular.module('directComicsService', ['usersService', 'remoteService'])
.service('directComics', function(Users, Remote, $q) {
	var EXPIRATION_TIME = 300000; // 5 min
	var changeCallback = angular.noop;
	var me = Users.me();
	var state = {
		unread: 0,
		lastCheck: null
	};

	/**
	 * @param options{object}
	 * - force: It ignores the last check and forces calling the server
	 *   for the number of unread messages
	 *
	 *  @returns A promise with the number of unreads
	 */
	var getUnreadComics = function(options) {
		var now;

		options = options || {};

		// If we checked recently don't bother the server
		if (!options.force  && state.lastCheck) {
			now = new Date();
			if (now.getTime() - state.lastCheck.getTime() < EXPIRATION_TIME) {
				changeCallback(state.unread);
				return $q.when(state.unread);
			}
		}

		return Remote.post({
			method: 'unread_direct_comics',
			recipient_id: me.bs_id
		}).then(function(response) {
			if (response && response.data && response.data.unread) {
				state.unread = +response.data.unread;
				changeCallback(state.unread);
			}
			state.lastCheck = new Date();
			return state.unread;
		});
	};

	var markAsRead = function(comic, recipient) {
		var recipientId = recipient.bs_id;

		if (isUnread(comic, recipient)) {
			comic.recipients[recipientId].read_time = (new Date()).toString();
			state.unread = Math.max(state.unread-1, 0);
			return Remote.post({
				method: 'mark_as_read',
				comic_id: comic.comic_id,
				recipient_id: recipientId
			});
		}
	};

	var isDirectComic = function (comic) {
		if (!angular.isObject(comic)) {
			return false;
		}
		return comic.hasOwnProperty('recipients');
	};

	var isUnread = function(comic, user) {
		if (isDirectComic(comic) === false) {
			return false;
		}
		return (comic.recipients[user.bs_id] && !comic.recipients[user.bs_id].read_time);
	};


	/**
	 * Allows to register an unbound callback to display the number of unread
	 * in external components (like tabs)
	 */
	var onUnreadChange = function(callback) {
		changeCallback = callback;
	};


	return {
		getUnreadComics: getUnreadComics,
		markAsRead: markAsRead,
		onUnreadChange: onUnreadChange,
		isUnread: isUnread,
		isDirectComic: isDirectComic
	};
});
