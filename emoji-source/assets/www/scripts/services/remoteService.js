'use strict';

angular.module('remoteService', ['logService', 'bootstrapService', 'configuration'])
    .factory('Remote', function (Bootstrap, $http, Log, API_HOST, TEMPLATES_HOST, $q) {
        var url = API_HOST + 'facebook/mfb/mfb_json.php';
        var delay = Bootstrap.delay_loading;
        var device_id = 0;

        var log_response = function (promise, description) {
            var time_start = new Date();
            Log.log(description);
            promise.then(function () {
                Log.log("\t" + description + " done in " + (new Date() - time_start) + "ms");
            }, function (response) {
                Log.log("\t" + description + " failed in " + (new Date() - time_start) + "ms, Status: " + response.status);
            });
        };

        return {
            set_device_id: function (id) {
                device_id = id;
            },

            comics: function(late) {
                var templates_url = TEMPLATES_HOST + 'facebook/mfb/dump_templates.php?template_format=1&delay_loading=' + delay;

                templates_url += "&app_os=" + Bootstrap.app_os;
                templates_url += "&app_version=" + Bootstrap.app_version;
                // Fun for testing new comics
                /*
                if (late === true) {
                    templates_url += "&behind=2";
                } else {
                    templates_url += "&delay_loading=5";
                }
                */

                var promise;
                try {
                    promise = $http.get(templates_url, {retry: true});
                } catch (err) {
                    promise = $q.reject({status: 'Error loading templates.'});
                }

                log_response(promise, "Remote.comics");
                return promise;
            },

            flash: function (port, pack, method) {
                if (port === 0) {
                    Log.log('No port for flash!', pack);
                    return;
                }
                // The old way: use a post, except this has problems on old androids
                // return $http.post('http://localhost:' + port + '/mfb/flasher.php?v' + Math.random(), pack);

                // The new way - perform a GET
                var vars = {'pack':pack, v:Math.random()};
                var promise;

                // If we wanted jsonp, do this:
                if (method === "get") {
                    promise = $http.get('http://localhost:' + port + '/mfb/flasher.php', {params:vars, timeout:1000});
                } else if (method === "jsonp") {
                    vars['callback'] = 'JSON_CALLBACK';
                    promise = $http.jsonp('http://localhost:' + port + '/mfb/flasher.php', {params:vars, timeout:1000});
                } else if (method === "post") {
                    promise = $http.post('http://localhost:' + port + '/mfb/flasher.php', vars.pack, {timeout:1000});
                } else {
                    throw new Error("Flash - unknown method: " + method);
                }
                log_response(promise, "Remote.flash " + pack.builder);
                return promise;
            },

            post: function(vars) {
                if (vars.hasOwnProperty('delay_loading') === false) {
                    vars['delay_loading'] = delay;
                }
                vars['app_os'] = Bootstrap.app_os;
                vars['app_version'] = Bootstrap.app_version;
                vars['device_id'] = device_id;
                var post_url = url + "?method=" + vars['method'];
                var promise = $http.post(post_url, vars, {retry: true, with_token: true});
                log_response(promise, "Remote.post " + vars.method);
                return promise;
            },

            error: function(data, status, headers, config) {
                alert('Network error: ' +  status + "\n");
                Log.log("Network error");
                Log.log('Data:', data);
                Log.log('Status:', status);
                Log.log('Headers:', headers);
                Log.log('Config:', config);
            },

            set_delay: function (new_delay) {
                Log.log("Setting remote delay to " + new_delay);
                delay = new_delay;
            }
        };
    }
);
