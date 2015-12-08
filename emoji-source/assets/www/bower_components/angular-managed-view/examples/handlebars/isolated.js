angular.module('handlebarsIsolated', [])
.service('HandlebarsCompiler', function($window) {
	return function(template) {
		return $window.Handlebars.compile(template);
	};
})
.managedView('handlebarsIsolated', function() {
	return {
		restrict: 'E',
		viewCompiler: 'HandlebarsCompiler',
		template: '<span>Hello {{ user.name }}!</span>',
		scope: {
			user: '='
		}
	};
});