'use strict';

angular.module('templatesService', ['remoteService'])
    .factory('Templates', function (Remote, $q, Log, $rootScope) {

        // Comic objects referenced by template_id
        var comics = {};

        // Object that stores any app update interstial dump_templates might contain
        var appUpdate = {'hidden': true};

        var loaded = false;

        // Date that the most recent comics where loaded YYYY-MM-DD
        var latest = '1999-01-01';

        var latest_templates = [];

        var home_ad;

        var category_tags = {};

        var shuffle_category_tags = function (categories) {
            angular.forEach(categories, function (tags, tag_index) {
                categories[tag_index] = shuffle(tags);
                angular.forEach(tags, function (tag) {
                    if (tag.template_ids && tag.template_ids.statusComics.length) {
                        tag.template_ids.statusComics = shuffle(tag.template_ids.statusComics);
                        tag.template_ids.allComics = shuffle(tag.template_ids.allComics);
                    }
                });
            });
        };

        var shuffle = function (array) {
            if (array.length == 2) {
                if (Math.random() > 0.5) {
                    return [array[0], array[1]];
                } else {
                    return [array[1], array[0]];
                }
            }

            var counter = array.length, temp, index;

            // While there are elements in the array
            while (counter--) {
                // Pick a random index
                index = Math.floor((Math.random() * counter));

                // And swap the last element with it
                temp = array[counter];
                array[counter] = array[index];
                array[index] = temp;
            }

            return array;
        };

        var get_template = function (template_id) {
            var comic = comics[template_id];
            if (comic) {
                comic.template_id = template_id;
                return comic;
            } else {
                Log.log("Can't find comic by template_id " + template_id);
            }
        };

        var get_templates = function (template_ids, do_shuffle) {
            var tmp = [];
            if (do_shuffle !== false) {
                template_ids = shuffle(template_ids);
            }
            if (template_ids) {
                for (var i = 0; i < template_ids.length; i++) {
                    tmp.push(get_template(template_ids[i]));
                }
            }
            return tmp;
        };

        // We've received new data from the server, make sure we're visible again if we've been hidden
        var updateAppUpdate = function (newData) {
            if (appUpdate.hasOwnProperty('hidden')) {
                delete appUpdate.hidden;
            }
            angular.copy(newData, appUpdate);
        };

        var import_comic_data = function (response) {
            var data = response.data;
            Log.log("import_comic_data");
            cached_all_comics = false;
            cached_types = {};
            comics = data.comics;

            var make_searchable = function (comic) {
                comic.search_desc = angular.lowercase(comic.description).replace(/[\.,-\/#!$%\^&\*;:{}=\-_`~()]/g, "");
                comic.search_desc_array = comic.search_desc.split(" ");
                comic.search_tags = comic.tags.join(" ");
            };

            angular.forEach(comics, make_searchable);

            // If we don't have an interstitial for today, make sure we clear the previous interstitial
            if (data.hasOwnProperty('home_ad')) {
                home_ad = data.home_ad;
            } else {
                home_ad = false;
            }

            // TODO: If we're in the home ctrl when this happens, trigger some kind of
            // interstitial (home_ad or latest interstitial) update
            if (data.hasOwnProperty('appUpdate') === false) {
                data.appUpdate = {'hidden': true};
            }
            updateAppUpdate(data.appUpdate);

            latest = data.latest_day;

            latest_templates = data.latest_templates;

            category_tags = data.category_tags;

            var comicsPerTag = {};
            angular.forEach(comics, function (comic, templateId) {
                // Force all templates have an integer comic.type
                comic.type = parseInt(comic.type, 10);

                angular.forEach(comic.tags, function (tag) {
                    var lowercaseTag = angular.lowercase(tag);
                    comicsPerTag[lowercaseTag] = comicsPerTag[lowercaseTag] || {statusComics: [], allComics: []};
                    if (comic.type === 0) {
                        comicsPerTag[lowercaseTag].statusComics.push(templateId);
                    }
                    comicsPerTag[lowercaseTag].allComics.push(templateId);
                });
            });

            angular.forEach(category_tags, function (innerCategoryTags) {
                angular.forEach(innerCategoryTags, function (categoryTag) {
                    categoryTag.template_ids = comicsPerTag[angular.lowercase(categoryTag.tag)];
                });
            });

            category_tags.unshift([
                {'tag': 'Latest', template_ids: {statusComics: [latest_templates[0]], allComics: [latest_templates[0]]}}
            ]);

            shuffle_category_tags(category_tags);

            loaded = true;

            // Can't think of a cleaner way to notify the home controller that it
            // needs to update its interstitials...
            $rootScope.$broadcast('templatesLoaded');
        };

        var init = function (skip_first) {
            Log.log("Templates.init()");

            loaded = false;

            /* Fun for testing new comics loading on day rollovers
             if (skip_first === undefined) {
             skip_first = true;
             }
             */
            return Remote.comics(skip_first).then(import_comic_data);
        };

        var loading_promise = init();

        var cached_all_comics = false;

        var cached_types = {};

        return {
            get_template: get_template,
            get_templates: get_templates,

            get_all_templates: function () {
                if (cached_all_comics === false) {
                    var tmp = [];
                    for (var i in comics) {
                        tmp.push(i);
                    }
                    cached_all_comics = get_templates(tmp);
                }
                return cached_all_comics;
            },

            get_templates_type: function (type) {
                if (type == 2) {
                    throw new Error("Unsupported comic type 2");
                }
                if (cached_types.hasOwnProperty(type) === false) {
                    var tmp = [];
                    for (var i in comics) {
                        if (comics[i].type == type) {
                            tmp.push(i);
                        }
                    }
                    cached_types[type] = get_templates(tmp);
                }
                return cached_types[type];
            },

            // Return an array of objects, each object containing a comic and a display tag
            get_tag_comics: function (statusComicOnly) {
                var cache_label = 'all_comics';
                if (statusComicOnly) {
                    cache_label = 'status_comics';
                }
                if (cached_types.hasOwnProperty(cache_label)) {
                    return cached_types[cache_label];
                }
                var results = [];
                angular.forEach(category_tags, function (tags) {
                    angular.forEach(tags, function (tag) {
                        if (!tag.template_ids) {
                            return;
                        }
                        var template_id = statusComicOnly ? tag.template_ids.statusComics[0] : tag.template_ids.allComics[0];
                        var comic = get_template(template_id);
                        if (comic) {
                            results.push({'comic': comic, 'display_tag': tag.tag});
                        }
                    });
                });
                cached_types[cache_label] = results;

                return results;
            },

            loaded: function () {
                return loaded;
            },

            waiting: function () {
                return loading_promise;
            },

            reload: function () {
                loading_promise = init();
            },

            latest: function () {
                return latest;
            },

            set_latest: function (value) {
                latest = value;
            },

            search: function (comic, lower, hash) {
                var score = 100;
                if (hash === true) {
                    if (comic.tags.indexOf(lower) !== -1) {
                        if (lower === "latest") {
                            // Latest comic - these are special!
                            comic.score = latest_templates.indexOf(comic.template_id);
                            if (comic.tag_click) {
                                comic.score -= 5;
                            }
                            return true;
                        }
                        score -= 50;
                        if (comic.tag_click === true) {
                            score -= 50;
                        }
                    }
                } else {
                    if (comic.search_tags.indexOf(lower) !== -1) {
                        score -= 5;
                        if (comic.tags.indexOf(lower) !== -1) {
                            score -= 50;
                        }
                    }

                    if (comic.search_desc.indexOf(lower) !== -1) {
                        score -= 1;
                        if (comic.search_desc_array.indexOf(lower) !== -1) {
                            score -= 10;
                        }
                    }
                }
                comic.score = score;
                if (score !== 100) {
                    return true;
                }
                return false;
            },

            getHomeAd: function () {
                if (home_ad) {
                    var ha = angular.copy(home_ad);
                    ha.templates = shuffle(ha.templates);
                    return ha;
                }
                return false;
            },

            appUpdate: function () {
                return appUpdate;
            },

            latest_comics: function () {
                return get_templates(latest_templates.slice(0, 4), false);
            },

            ordering: function (comic) {
                return comic.score;
            },

            countByTag: function (tag) {
                var count = 0;

                if (tag[0] === '#') {
                    tag = tag.substring(1);
                }
                angular.forEach(comics, function (comic) {
                    if (comic.tags.indexOf(tag) !== -1) {
                        count++;
                    }
                });
                return count;
            },

            TYPE_PHOTO_TEMPLATE: 10
        };
    });
