'use strict';

angular.module('comicCommentDirective', [])
	.directive('comicComment', function(VIEWS) {
		return {
			templateUrl: VIEWS + 'one-comment.html',
			restrict: 'E',
			scope: {
				comment: '=',
				showIcon: '='
			}
		};
	});
