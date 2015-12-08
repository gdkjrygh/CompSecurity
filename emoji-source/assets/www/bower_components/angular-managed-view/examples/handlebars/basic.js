angular.module('handlebarsExample', [])
.service('HandlebarsCompiler', function($window) {
	return function(template) {
		return $window.Handlebars.compile(template);
	};
})
.managedView('basicHbs', function() {
	return {
		viewCompiler: 'HandlebarsCompiler',
		template: '<span>Hello {{ name }}!</span>'
	};
});