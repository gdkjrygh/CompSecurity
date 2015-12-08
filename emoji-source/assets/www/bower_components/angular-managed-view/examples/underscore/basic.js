angular.module('underscoreExample', [])
.service('UnderscoreCompiler', function($window) {
	return function(template) {
		return $window._.template(template);
	};
})
.managedView('basicUnderscore', function() {
	return {
		viewCompiler: 'UnderscoreCompiler',
		template: '<span>Hello <%= name %>!</span>'
	};
});