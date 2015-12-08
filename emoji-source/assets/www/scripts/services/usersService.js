'use strict';

angular.module('usersService', ['logService'])
	.factory('Users', function (Log) {
		// Me is a special user object, will be populated by userAuth
		var me_data = {};
		var users_hash_bs_id = {};
		var users_hash_fb_id = {};

		// Given some user_data, store it in users_hash_*
		var add_user = function (user_data) {
			var bs_id = false;
			var fb_id = false;
			var user = false;
			if (user_data.hasOwnProperty('bs_id') && user_data.bs_id > 0) {
				bs_id = user_data.bs_id;
			}
			if (user_data.hasOwnProperty('fb_id') && user_data.fb_id > 0) {
				fb_id = user_data.fb_id;
			}
			if (fb_id === false && bs_id === false) {
				throw new Error("Users.add_user without a valid bs_id or fb_id", user_data);
			}
			if (bs_id && users_hash_bs_id[bs_id]) {
				user = users_hash_bs_id[bs_id];
			}
			if (fb_id && users_hash_fb_id[fb_id]) {
				if (user === false) {
					user = users_hash_fb_id[fb_id];
				} else {
					// We need to confirm user matches users_hash_fb_id - if they're not the same object,
					// we'll need to merge them somehow...
					if (user !== users_hash_fb_id[fb_id]) {
						throw new Error("Users.add_user - unhandled situation! Fuuu.");
					}
				}
			}

			if (user === false) {
				user = user_data;
			} else if (user !== user_data) {
				angular.copy(user_data, user);
			}
			if (bs_id) {
				users_hash_bs_id[bs_id] = user;
			}
			if (fb_id) {
				users_hash_fb_id[fb_id] = user;
			}

			return user;
		};


		var get_user = function (bs_id, fb_id) {
			if (bs_id && users_hash_bs_id[bs_id]) {
				return users_hash_bs_id[bs_id];
			} else if (fb_id && users_hash_fb_id[fb_id]) {
				return users_hash_fb_id[fb_id];
			}
			// Todo: We don't have this user yet? Go out and fetch it!
			return false;
		};

		return {
			me: function (data) {
				if (angular.isDefined(data)) {
					angular.copy(data, me_data);
					add_user(me_data);
				}
				return me_data;
			},

			add_user: add_user,

			// Only used by friendSelect - returns a list of all users for picking who you want to put in a comic
			get_users: function () {
				var users = [];
				angular.forEach(users_hash_fb_id, function (friend) {
					users.push(friend);
				});
				return users;
			},

			getFriendsWithAvatars: function () {
				var friends = [me_data];
				angular.forEach(users_hash_fb_id, function (friend) {
					if (friend.id !== -1 && me_data.id !== friend.id) {
						friends.push(friend);
					}
				});
				return friends;
			},

			getFriendsWithAvatarsWithoutBitstrips: function () {
				var friends = [];
				angular.forEach(users_hash_fb_id, function (friend) {
					if (friend.id !== -1 && friend.bs_id === 0) {
						friends.push(friend);
					}
				});
				return friends;
			},

			getFriendsWithoutBitstrips: function () {
				var result = [];
				angular.forEach(users_hash_fb_id, function (user) {
					if (!user.bs_id) {
						result.push(user);
					}
				});
				return result;
			},

			getFriendsWithBitstrips: function () {
				var result = [];
				angular.forEach(users_hash_fb_id, function (user) {
					if (user.bs_id && me_data.id !== user.id) {
						result.push(user);
					}
				});
				return result;
			},

			// Confusing because when it's called without fb_id, it's being called to return the app user's data
			// otherwise, it should return user data for a specific user fb_id
			get_user_bs: function (bs_id) {
				return get_user(bs_id);
			},

			get_user_fb: function (fb_id) {
				return get_user(null, fb_id);
			},

			// Used to update a user object's data, called when an avatar is updated or avatar is reset
			setAvatar: function (fb_id, avatar_id, version, thumb) {
				var user = get_user(null, fb_id);
				if (user === false) {
					Log.log("setAvatar: unable to find user " + fb_id);
					return;
				}
				if (user.avatar_id == 1 && avatar_id != 1) {
					user.intro = true;
				}
				user.avatar_id = avatar_id;
				user.version = version;
				user.id = avatar_id + '_' + version;
				if (thumb) {
					user.thumb = thumb;
				}

				Log.log("setAvatar: ", fb_id, avatar_id, version, thumb, user);
			},

			// Called when the user changes their profile pic
			set_thumb: function (fb_id, thumb) {
				var user = get_user(null, fb_id);
				user.thumb = thumb;
			},

			get_name: function (bs_id, fb_id) {
				var user = get_user(bs_id, fb_id);
				if (user === false || user.name === "") {
					return 'a friend';
				}
				return user.first_name;
			},

			isFriend: function (user) {
				return !!users_hash_fb_id[user.fb_id];
			},

			hasBitstripsId: function (user) {
				return !!user.user_id || user.fb_id == me_data.fb_id;
			},

			isMe: function (user) {
				return user && (me_data.fb_id == user.fb_id);
			},

			areSamePerson: function (user1, user2) {
				var exist = user1 && user2;
				if (!exist) {
					return false;
				}
				var haveIds = user1.fb_id && user2.fb_id;
				var sameIds = user1.fb_id === user2.fb_id;

				return haveIds && sameIds;
			},

			meFirst: function (users) {
				var results = [];

				angular.forEach(users, function (user) {
					if (user.fb_id == me_data.fb_id) {
						results.unshift(user);
					} else {
						results.push(user);
					}
				});

				return results;
			},

			amIAuthor: function(comic) {
				return me_data.bs_id == comic.author.user_id;
			}

		};
	}
);
