
//New Pandora api
//This object implements the new Shared Api interface. There method implementations should be will
//be accessible on all platforms and should match in both method name and parameters passed in. This
//Pandora object could have been previously setup by the web component so the client should append if
//a Pandora object already exists in its context.

if (typeof(Pandora) != 'object') {
    Pandora = {}
}


function merge(obj) {
    var type = typeof obj;
      isObj = type === 'function' || type === 'object' && !!obj;
    if (!isObj) return obj;
    var source, prop;
    for (var i = 1, length = arguments.length; i < length; i++) {
        source = arguments[i];
        for (prop in source) {
            if (obj[prop] && typeof(obj[prop]) !== 'function') {
               continue;
            }
            obj[prop] = source[prop];
        }
    }
    return obj;
};

merge(Pandora, {

    TRANSITION_TYPE_SLIDE: "slide",
    TRANSITION_TYPE_FLIP: "flip",
    TRANSITION_TYPE_CURL: "curl",
    TRANSITION_TYPE_FADE: "fade",
    TRANSITION_TYPE_GROW: "grow",

    _locations: [],
    _locationTimeout: null,
    _callbacks: [],
    _callMethod: function(/*string*/command, /*hash*/params, /*function|string*/callback) {
        var callbackID = this._callbacks.push(callback) - 1;
        var paramStr = "";
        for (var name in params) {
            if (params[name] != null) {
                paramStr += paramStr ? "&" : "?";
                paramStr += name + "=" + encodeURIComponent(params[name]);
            }
        }

        // we need to delay setting location for two reasons:
        // 1) setting location during page load will cause issues,
        // 2) setting location twice in a row will cause first location to be "lost"
        this._locations.push("Pandora://" + command + "/" + callbackID  + paramStr);
        if (this._locationTimeout == null) {
            this._locationTimeout = setTimeout(function() { Pandora._setNextLocation() }, 1);
        }

        return callbackID;
    },
    _setNextLocation: function() {
        this._locationTimeout = null;
        if (this._locations.length) {
            window.location = this._locations.shift();
            if (this._locations.length) {
                this._locationTimeout = setTimeout(function() { Pandora._setNextLocation() }, 1);
            }
        }
    },
    _methodResponse: function(/*string*/callbackID, /*hash*/response) {
        var callback = this._callbacks[callbackID];
        delete this._callbacks[callbackID];
        if (typeof(callback) == "function" || typeof(callback) == "string") {
            // we need to delay execution a bit to prevent strange (and
            // potentially deadly) interactions with the webview host.
            var _this = this;
            setTimeout(function() {_this._callCallback(callback, [response]);}, 1);
        }
    },
    _callCallback: function(nameOrFunction, args) {
        if (typeof nameOrFunction == "function") {
            nameOrFunction.apply(this, args);
        } else {
            // we need to support string names for parity with Android
            window[nameOrFunction].apply(this, args);
        }
    },
    supports : function(/*string*/command) {
        var supported_functions = [
        'disableVideoAdsUntilNextStationChange', 'share', 'createStation', 'openLandingPage', 'closeLandingPage', 'setViewportHeight',
        'getNowPlayingTrackDetails', 'setCloseButtonVisibility',
        'openExternalPage', 'playTrack', 'pauseTrack', 'getP1SubscriberState', 'closeAd', 'playMovie', 'preloadMovie',
        'offerTrial', 'offerUpgrade', 'telephone', 'recordAdClick', 'openGenrePicker', 'openGenrePickerForGCat',
        'fetchURL', 'canOpenURL', 'addCalendarItem', 'setViewportFullScreen', 'getPersonalInfo', 'sendEvent', 'startValueExchange', 'delayAdRefresh',
        'setNowPlayingFullSize', 'playSample', 'stopSample',
        'pingImpressionUrls'
        ];
        if (command) {
            return (supported_functions.indexOf(command) >= 0);
        } else
            return false;
    },
    echo: function(value, callback) {
        this._callMethod("echo", {value: value}, callback);
    },
    telephone: function(params, callback) {
        this._callMethod("telephone", params, callback);
    },
    playMovie: function(params, callback) {
        this._callMethod("playMovie", params, callback);
    },
    preloadMovie: function(params, callback) {
        this._callMethod("preloadMovie", params, callback);
    },
    playSample: function(params, callback) {
        this._callMethod("playSample", params, callback);
    },
    stopSample: function(params, callback) {
        this._callMethod("stopSample", params, callback);
    },
    goToScreen: function(screenName) {
        this._callMethod("goToScreen", {screen: screenName});
    },
    sendEmail: function(fromAddress, template, callback) {
        this._callMethod("sendEmail", {fromAddress: fromAddress, template: template}, function(results) { callback(results.success) });
    },
    fetchURL: function(args, callback) {
        var paramsStr = "";
        for (var n in args.params) {
            if (paramsStr != "") {
                paramsStr += "&";
            }
            paramsStr += encodeURIComponent(n) + "=" + encodeURIComponent(args.params[n]);
        }
        args.params = paramsStr;
        this._callMethod("fetchURL", args, function (results) { this._callCallback(callback, [results.responseText]) });
    },
    fetchWithAuth: function(url) {
        this._callMethod("fetchWithAuth", {url: url});
    },
    registerImpression: function(url) {
        this.fetchURL({url: url}, function() {});
    },
    recordAdClick: function(params, callback) {
        this._callMethod("recordAdClick", params, callback);
    },
    pingImpressionUrls: function(params, callback) {
        this._callMethod("pingImpressionUrls", params, callback);
    },

    ////////////// New API Methods /////////////

    // Used to create a station
    createStation:function(params, callback) {
        this._callMethod("createStation", params, callback);
    },
    // Used to close a banner ad
    closeAd: function (params, callback) {
        this._callMethod("closeAd", params, callback);
    },
    // Used to determine P1 state of the user
    getP1SubscriberState: function (params, callback) {
        this._callMethod("getP1SubscriberState", params, callback);
    },
    // Used to pause a currently playing track
    pauseTrack: function (params, callback) {
        this._callMethod("pauseTrack", params, callback);
    },
    // Used to play a track, doesn't do anything if the track is already playing
    playTrack: function (params, callback) {
        this._callMethod("playTrack", params, callback);
    },
    openSafari: function(url) {
        this._callMethod("openSafari", {url: url});
    },
    canOpenURL: function(params, callback) {
        this._callMethod("canOpenURL", params, function(results) { this._callCallback(callback, [results.canOpenURL]) });
    },
    setViewportHeight: function(params , callback) {
        if (params) {
            this._callMethod("setViewportHeight", params, callback);
        }
    },
    setNowPlayingFullSize: function() {
        this._callMethod("setNowPlayingFullSize", {});
    },
    hideViewport: function() {
        this._callMethod("hideViewport", function() {});
    },
    setStationCreationFollowOnURL: function(url) {
        this._callMethod("setStationCreationFollowOnURL", {url: url});
    },
    disableVideoAdsUntilNextStationChange: function(params, callback) {
        this._callMethod("disableVideoAdsUntilNextStationChange", params, callback);
    },
    openLandingPage: function(params, callback) {
        this._callMethod("openLandingPage", params, callback);
    },
    closeLandingPage: function(params, callback) {
        this._callMethod("closeLandingPage", params, callback);
    },
    offerUpgrade: function(params, callback) {
        this._callMethod("offerUpgrade", params ? params : {}, callback);
    },
    offerTrial: function(params, callback) {
        this._callMethod("offerTrial", params, callback);
    },
    getPersonalInfo: function(params, callback) {
        this._callMethod("getPersonalInfo", params, callback);
    },
    sendEvent: function(params, callback) {
        this._callMethod("sendEvent", params, callback);
    },
    alert: function(message) {
        this._callMethod("alert", {message: message});
    },
    // Used to close the web view when it's in a custom/non-standard container
    closeCustomWebViewContainer: function(params, callback) {
        this._callMethod("closeCustomWebViewContainer", params, callback);
    },
    addCalendarItem: function(params, callback) {
        this._callMethod("addCalendarItem", params, callback);
    },
    authorizeFacebook: function() {
        this._callMethod("authorizeFacebook", { });
    },
    openGenrePicker: function(params, callback) {
        this._callMethod("openGenrePicker", params, callback);
    },
    openGenrePickerForGCat: function(params, callback) {
        this._callMethod("openGenrePickerForGCat", params, callback);
    },
    refreshAd: function(interaction, force) {
        this._callMethod("refreshAd", { interaction : interaction, force : force });
    },
    delayAdRefresh: function(params) {
        this._callMethod("delayAdRefresh", params ? params : {});
    },
    // Used to pause the currently playing track
    pause: function() {
        this._callMethod("pause", { });
    },
    // Used to simulate a link click - needed for compatibility w/IOS as Android does not have this issue
    clickLink: function(clickURL) {
        window.location.href = clickURL;
    },
    // Used to resume the currently playing track
    play: function() {
        this._callMethod("play", { });
    },
    // Used to open the native web browser
    openExternalPage: function(params, callback) {
        this._callMethod("openExternalPage", params, callback);
    },
    //Used to share track|station from browser
    share: function (params, callback) {
        this._callMethod("share", params,
            function(result) {
                if (!callback) return;

                var success = result.success;
                this._callCallback(callback, [success]);
            }
        );
    },
    getNowPlayingTrackDetails : function(params, callback) {
        this._callMethod("getNowPlayingTrackDetails", params, callback);
    },
    setCloseButtonVisibility : function(params, callback) {
        this._callMethod("setCloseButtonVisibility", params, callback);
    },
    startValueExchange: function(params, callback) {
        this._callMethod("startValueExchange", params, callback);
    }
});


//IMPORTANT... Old API. This as been deprecated as of Pandora 5.2. Should begin to use Pandora api calls
if (typeof(PandoraApp) != 'object') {
//    if (navigator.geolocation) {
//        navigator.geolocation.getCurrentPosition = function(good, bad, opt) {
//            if (bad) {
//                bad({
//                    code: 1,
//                    message: "geolocation not allowed in Pandora",
//                    PERMISSION_DENIED: 1,
//                    POSITION_UNAVAILABLE: 2,
//                    TIMEOUT: 3,
//                    UNKNOWN_ERROR: 0
//                });
//            }
//        }
//        navigator.geolocation.watchPosition = navigator.geolocation.getCurrentPosition;
//    }

    //KEEPING THIS AROUND FOR BACKWARD COMPATILBILITY. This can be removed once we start using the new API
	PandoraApp = {
		TRANSITION_TYPE_SLIDE: "slide",
		TRANSITION_TYPE_FLIP: "flip",
		TRANSITION_TYPE_CURL: "curl",
		TRANSITION_TYPE_FADE: "fade",
		TRANSITION_TYPE_GROW: "grow",
		
		_locations: [],
		_locationTimeout: null,
		_callbacks: [],
		_callMethod: function(/*string*/command, /*hash*/params, /*function|string*/callback) {
			var callbackID = this._callbacks.push(callback) - 1;
			var appendContent = true;
			var paramStr = "";
			for (var name in params) {
				if (params[name] != null) {
				    paramStr += paramStr ? "&" : "?";
					paramStr += name + "=" + encodeURIComponent(params[name]);
				}
			}

			if (typeof admob === "undefined") {
				// we need to delay setting location for two reasons:
				// 1) setting location during page load will cause issues,
				// 2) setting location twice in a row will cause first location to be "lost"
				this._locations.push("PandoraAppInternal://" + command + "/" + callbackID  + paramStr);
	            if (this._locationTimeout == null) {
					this._locationTimeout = setTimeout(function() { PandoraApp._setNextLocation() }, 1);
	            }
			} else {
	            var url = "PandoraAppInternal://" + command + "/" + callbackID  + paramStr;
	            admob.dispatchAppEvent("appEvent", url);
	        }

			return callbackID;
		},
		_setNextLocation: function() {
			this._locationTimeout = null;
			if (this._locations.length) {
				window.location = this._locations.shift();
				if (this._locations.length) {
					this._locationTimeout = setTimeout(function() { PandoraApp._setNextLocation() }, 1);
				}
			}
		},
		_methodResponse: function(/*string*/callbackID, /*hash*/response) {
			var callback = this._callbacks[callbackID];
			delete this._callbacks[callbackID];
			if (typeof(callback) == "function" || typeof(callback) == "string") {
				// we need to delay execution a bit to prevent strange (and
				// potentially deadly) interactions with the webview host.
				var _this = this;
				setTimeout(function() {_this._callCallback(callback, [response]);}, 1);
			}
		},
		_callCallback: function(nameOrFunction, args) {
			if (typeof nameOrFunction == "function") {
				nameOrFunction.apply(this, args);
			} else {
				// we need to support string names for parity with Android
				window[nameOrFunction].apply(this, args);
			}
		},
		echo: function(value, callback) {
			this._callMethod("echo", {value: value}, callback);
		},
		telephone: function(number, callback) {
			this._callMethod("telephone", {number: number}, callback);
		},
		playMovie: function(cellURL, wifiURL, callback) {
			function fixupURL(url) {
				if (url == null) return null;
				
				if (!url.match(/^https?:\/\//)) {
					if (url.charAt(0) == '/') {
						var matched = location.href.match(/^(\w*:\/\/[^\/]*)/);
					} else {
						var matched = location.href.match(/^(.*\/)[^\/]*$/);
					}
					if (matched) {
						url = matched[1] + url;
					}
				}
				return url;
			}
			cellURL = fixupURL(cellURL);
			wifiURL = fixupURL(wifiURL);
			
			this._callMethod("playMovie", {cellURL: cellURL, wifiURL: wifiURL}, callback);
		},
		goToScreen: function(screenName) {
			this._callMethod("goToScreen", {screen: screenName});
		},
		sendEmail: function(fromAddress, template, callback) {
			this._callMethod("sendEmail", {fromAddress: fromAddress, template: template}, function(results) { callback(results.success) });
		},
		fetchURL: function(args, callback) {
			var paramsStr = "";
			for (var n in args.params) {
				if (paramsStr != "") {
					paramsStr += "&";
				}
				paramsStr += encodeURIComponent(n) + "=" + encodeURIComponent(args.params[n]);
			}
			args.params = paramsStr;
			this._callMethod("fetchURL", args, function (results) { this._callCallback(callback, [results.responseText]) });
		},
		fetchWithAuth: function(url) {
			this._callMethod("fetchWithAuth", {url: url});
		},
		registerImpression: function(url) {
			this.fetchURL({url: url}, function() {});
		},
        recordAdClick: function(url) {
            this._callMethod("recordAdClick", {url: url});
        },
		createStationFromStationId: function(stationId, startingTrackToken) {
			this._callMethod("createStationFromStationId", {stationId: stationId, startingTrackToken: startingTrackToken});
		},
		createStationFromMusicId: function(musicId) {
			this._callMethod("createStationFromMusicId", {musicId: musicId});
		},
		openSafari: function(url) {
			this._callMethod("openSafari", {url: url});
		},
		canOpenURL: function(url, callback) {
			this._callMethod("canOpenURL", {url: url}, function(results) { this._callCallback(callback, [results.canOpenURL]) });
		},
		setViewportHeight: function(height) {
            if (height == 0) {
                this.hideViewport();
            } else {
                this._callMethod("setViewportHeight", {height: String(height)});
            }
        },
		hideViewport: function() {
			this._callMethod("hideViewport", function() {});
        },
        setStationCreationFollowOnURL: function(url) {
            this._callMethod("setStationCreationFollowOnURL", {url: url});
        },
        disableVideoAdsUntilNextStationChange: function() {
            this._callMethod("disableVideoAdsUntilNextStationChange", {});
        },
		openLandingPage: function(pageURLorHTML, backgroundColor, transitionType, chromeType, loadHandler, closeHandler) {
			var params = { };
			if (String(pageURLorHTML).match(/^[\w]+:/)) {
				params.pageURL = pageURLorHTML;
			} else {
				params.pageHTML = pageURLorHTML;
			}
			if (backgroundColor) params.backgroundColor = String(backgroundColor);
			if (transitionType) params.transitionType   = String(transitionType);
			if (chromeType)     params.chromeType       = String(chromeType);
			this._callMethod("openLandingPage", params);
			
			if (loadHandler) {
				this._onLandingPageLoad = function() {
					loadHandler(true);
				}
				this._onLandingPageLoadError = function() {
					loadHandler(false);
				}
			} else {
				this._onLandingPageLoad = this._onLandingPageLoadError = function() {};
			}
			
			if (closeHandler) {
				this._onLandingPageClose = closeHandler;
			} else {
				this._onLandingPageClose = function() {};
			}
		},
		closeLandingPage: function(transitionType) {
			this._callMethod("closeLandingPage", transitionType ? { transitionType: String(transitionType) } : null);
		},
		_onLandingPageLoad: function() {
		},
		_onLandingPageLoadError: function() {
		},
		_onLandingPageClose: function() {
		},
		offerUpgrade: function(params) {
			this._callMethod("offerUpgrade", params ? params : {});
		},
        offerTrial: function(sponsor, callback) {
			this._callMethod("offerTrial", {complimentarySponsor: sponsor}, callback);
		},
		// fields is an array of strings which may be "email", "zip", "age" and/or "gender"
		getPersonalInfo: function(who, why, fields, callback) {
			this._callMethod(
				"getPersonalInfo", 
				{
					who: who,
					why: why,
					fields: fields.join(",")
				},
				function (result) {
					var confirmed = result.confirmed;
					delete result.confirmed;
					this._callCallback(callback, [confirmed, result]);
				}
			);
		},
		alert: function(message) {
			this._callMethod("alert", {message: message});
		},
        // Used to close the web view when it's in a custom/non-standard container
        closeCustomWebViewContainer: function() {
			this._callMethod("closeCustomWebViewContainer", { });
        },
		addCalendarItem: function(who, title, startTimeMillis, endTimeMillis, description, location) {
			this._callMethod("addCalendarItem", { who : who, title : title, startTimeMillis : startTimeMillis,
								endTimeMillis : endTimeMillis, description : description, location : location });
        },
		authorizeFacebook: function() {
			this._callMethod("authorizeFacebook", { });
        },
		launchGenrePanel: function(category, name) {
			this._callMethod("launchGenrePanel", { category : category, name : name});
        },
        launchGenrePicker: function(category, name) {
            this._callMethod("launchGenrePanel", { category : category, name : name});
        },
		openGenrePickerForGCat: function(gcat) {
			this._callMethod("openGenrePickerForGCat", { gcat : gcat });
        },
        openGenrePickerForCategory: function(category, name) {
            this._callMethod("launchGenrePanel", { category : category, name : name });
        },
		refreshAd: function(interaction, force) {
			this._callMethod("refreshAd", { interaction : interaction, force : force });
        }, 
        // Used to pause the currently playing track
        pause: function() {
			this._callMethod("pause", { });
        },
        // Used to simulate a link click - needed for compatibility w/IOS as Android does not have this issue
        clickLink: function(clickURL) {
			window.location.href = clickURL;
        },
        // Used to resume the currently playing track
        play: function() {
			this._callMethod("play", { });
        },
        // Used to open the native web browser
       	openExternalPage: function(url) {
			this._callMethod("openExternalPage", {url: url});
		}
	};
}



//// BEGIN OF JS CHECKS ////
// NOTE: The following checks must be removed as part of MOBILE-9869 which depends
// on WEB-3833. See explanation:
// Web creates one instance of 'Pandora' object and mobile creates an instance which is
// also named 'Pandora'. Due to this naming collision, the code on the backend assumes that
// 'Pandora' object is already 'defined' and hence skips setting various handlers that are
// used by the methods that exist on WEB. Hence, the following is a work around to help web
// acheive its purpose. Ideally this code should be on the backend. Once the WEB team resolves
// WEB-3833 both iOS and Android should remove these lines.

if (typeof(Pandora.eventHandlers) == "undefined") {
    Pandora.eventHandlers = {};
}

if (typeof(Pandora.registeredForEvents) == "undefined") {
    Pandora.registeredForEvents = false;
}

if (typeof(Pandora.getDiv) == "undefined") {
    Pandora.getDiv = function (divID) {
        if( document.getElementById ) {
            // standard (IE 5+)
            return document.getElementById(divID);
        } else {
            // IE 4
            return document.all[divID];
        }
    };
}

if (typeof(Pandora.registerForEventsIfNecessary) == "undefined") {
    Pandora.registerForEventsIfNecessary = function () {
        if (this.registeredForEvents)
            return;

        var div = this.getDiv("tunerEventListenerDiv");
        if( div == null ) {
            div = document.createElement("DIV");
            div.id = "tunerEventListenerDiv";
            document.body.appendChild(div);
        }
        this.registeredForEvents = true;
    };
}

if (typeof(Pandora.fireEvent) == "undefined") {
    Pandora.fireEvent = function(eventName, /*Array*/ args) {
        if (this.eventHandlers[eventName] != null) {
            this.eventHandlers[eventName](args);
        }
    };
}

if (typeof(Pandora.setEventHandler) == "undefined") {
    Pandora.setEventHandler = function(event, handler) {
        this.eventHandlers[event] = handler;
        this.registerForEventsIfNecessary();
    };
}

if (typeof(Pandora.getTrackingCodeCookie) == "undefined") {
    Pandora.getTrackingCodeCookie = function() {
        var cookies = document.cookie.split(";");
        for(var i = 0; i < cookies.length; i++) {
            var crumb = cookies[i].split("=");
            if (crumb[0].replace(/^\s\s*/, '') == "tc") {
                return crumb[1];
            }
        }
        return null;
    };
}

if (typeof(Pandora.getBaseUrl) == "undefined") {
    Pandora.getBaseUrl = function() {
        return '<!--#echo var="HOME_PAGE" -->';
    };
}

if (typeof(Pandora.eiWorking) == "undefined") {
    Pandora.eiWorking = true;
}

if (typeof(Pandora.waitForSecretary) == "undefined") {
    Pandora.waitForSecretary = function(callback) {
        callback(true);
    };
}

if (typeof(Pandora.onPandoraReady) == "function") {
   Pandora.onPandoraReady();
} else {
   window.addEventListener('load', function () {
       if (typeof(Pandora.onPandoraReady) == "function") {
           Pandora.onPandoraReady();
       }
   }, false);
}
//// END OF JS CHECKS ////
