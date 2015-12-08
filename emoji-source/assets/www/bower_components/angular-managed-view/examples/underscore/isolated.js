angular.module('underscoreIsolated', [])
.service('UnderscoreCompiler', function($window) {
	return function(template) {
		return $window._.template(template);
	};
})
.managedView('underscoreIsolated', function() {
	return {
		restrict: 'E',
		viewCompiler: 'UnderscoreCompiler',
		template: '<span>Hello <%= user.name %>!</span>',
		scope: {
			user: '='
		}
	};
});