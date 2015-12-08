(function(angular) {
  'use strict';

    var view = function(viewName, viewData) {
        this.directive(viewName, [
            '$http',
            '$sce',
            '$parse',
            '$q',
            '$templateCache',
            '$injector',
            function($http, $sce, $parse, $q, $templateCache, $injector) {

                var compiler,
                    compiledTemplate,
                    injectableFunction,
                    dependencies,
                    directiveOptions;

                // Get the DI annotations from the view
                var locals = {};
                injectableFunction = (viewData || angular.noop);
                dependencies = $injector.annotate(injectableFunction);

                // Resolve the view dependencies
                angular.forEach(dependencies, function(name) {
                    locals[name] = $injector.get(name);
                });

                directiveOptions = $injector.invoke(injectableFunction, this, locals) || {};

                // Error if a template compiler/provider is not passed
                if (!directiveOptions.viewCompiler) {
                    throw new Error('A view compiler is required');
                }

                compiler = $injector.get(directiveOptions.viewCompiler);

                // Resolve templateUrls or fetch plain templates
                if (directiveOptions.templateUrl) {
                    compiledTemplate = $http.get($sce.getTrustedResourceUrl(directiveOptions.templateUrl), {
                        cache: $templateCache
                    }).then(function(response) {
                        compiledTemplate = compiler(response.data);
                    });
                } else if (directiveOptions.template) {
                    compiledTemplate = compiler(directiveOptions.template);
                } else {
                    throw new Error('No template');
                }

                // Save a possible user custom link function
                directiveOptions.userLink = directiveOptions.link;

                // Avoid Angular doing regular compiling and processing by deleting the templates
                delete directiveOptions.link;
                delete directiveOptions.templateUrl;
                delete directiveOptions.template;

                directiveOptions.compile = function(elem, attrs) {

                    return function(scope, elem, attrs) {

                        function render() {
                            var rendered,
                                context,
                                parentElement;

                            // Render context in template
                            context = (scope.$createContext || angular.identity)(scope);
                            rendered = compiledTemplate(context);

                            // Replace contents of the directive
                            elem[0].innerHTML = rendered;

                            // Remove previous listeners
                            elem.off('click');

                            // Attach a resolver for events
                            elem.on('click', function(event) {

                                // Does the clicked element have an ng-click?
                                var elemHTML = elem[0].innerHTML;
                                var target = angular.element(event.target);
                                var ngClickHandler = target.attr('ng-click');

                                // Blubble up for the first ng-click
                                while (!!target && !ngClickHandler && elemHTML !== target[0].innerHTML) {
                                    target = target.parent() && target.parent()[0];
                                    target = angular.element(target);
                                    ngClickHandler = target.attr('ng-click');
                                }

                                if (!!ngClickHandler) {
                                    // Make $event available in the scope as is expected in Angular
                                    scope.$event = event;
                                    scope.$apply(function() {
                                        $parse(ngClickHandler)(scope);
                                    });
                                }
                            });

                            // Execute user link function if any
                            (directiveOptions.userLink || angular.noop)(scope, elem, attrs);
                        }

                        if (!!compiledTemplate.then) {
                            compiledTemplate.then(function() {
                                render();
                            });
                        } else {
                            render();
                        }

                        // Allow user to explicitly call $render to redraw the view
                        scope.$render = render;
                    };
                };

                return directiveOptions;
            }
        ]);
    };


    // New module instances include the `view` extension
    var originalMethod = angular.module;
    angular.module = function(name, reqs, configFn) {
        var module = originalMethod(name, reqs, configFn);
        module.managedView = module.managedDirective =  view;
        return module;
    };

})(angular);
