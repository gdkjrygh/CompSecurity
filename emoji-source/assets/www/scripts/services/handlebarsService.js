'use strict';

angular.module('handlebars', [])
.service('HandlebarsService', function($window, $filter, Users) {
	var Handlebars = $window.Handlebars;

	var me = Users.me();

	// Helpers
	Handlebars.registerHelper('displayName', function(user) {
		return $filter('displayName')(user);
	});

	Handlebars.registerHelper('displayName2', function(user, author) {
		return $filter('displayName')(user, true, author);
	});

	Handlebars.registerHelper('isLinkable', function(user, options) {
		var linkable =  Users.isFriend(user) && Users.hasBitstripsId(user);
		return (linkable) ? '<a ng-click="view_user(' + user.fb_id + ')">' + options.fn(this) + '</a>'
						  : '<span class="not-friend">' + options.fn(this) + '</span>';
	});

	Handlebars.registerHelper('timestamp', function(time) {
		return $filter('timestamp_format')(time);
	});

	Handlebars.registerHelper('ifIAmAuthor', function(comic, options) {
		return  (comic.author.user_id == me.bs_id) ? options.fn(this)
													: '';
	});

	return function(name) {
		return $window.myApp.Templates[name];
	};
});
