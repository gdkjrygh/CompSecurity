// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.mopub.common.AdReport;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.ViewGestureDetector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.json.JSONObject;

// Referenced classes of package com.mopub.mraid:
//            MraidNativeCommandHandler, h, MraidJavascriptCommand, b, 
//            c, d, e, PlacementType, 
//            ViewState, g, ag, f, 
//            ab, ah

public class MraidBridge
{

    private final AdReport a;
    private final String b;
    private final PlacementType c;
    private final MraidNativeCommandHandler d;
    private MraidBridgeListener e;
    private MraidWebView f;
    private boolean g;
    private boolean h;
    private final WebViewClient i;

    MraidBridge(AdReport adreport, PlacementType placementtype)
    {
        this(adreport, placementtype, new MraidNativeCommandHandler());
    }

    private MraidBridge(AdReport adreport, PlacementType placementtype, MraidNativeCommandHandler mraidnativecommandhandler)
    {
        b = "(function() {\n  var isIOS = (/iphone|ipad|ipod/i).test(window.navigator.userAgent.toLowerCase());\n  if (isIOS) {\n    console = {};\n    console.log = function(log) {\n      var iframe = document.createElement('iframe');\n      iframe.setAttribute('src', 'ios-log: ' + log);\n      document.documentElement.appendChild(iframe);\n      iframe.parentNode.removeChild(iframe);\n      iframe = null;\n    };\n    console.debug = console.info = console.warn = console.error = console.log;\n  }\n}());\n\n\n(function() {\n  var mraid = window.mraid = {};\n\n  //////////////////////////////////////////////////////////////////////////////////////////////////\n\n  // Bridge interface to SDK\n\n  var bridge = window.mraidbridge = {\n    nativeSDKFiredReady: false,\n    nativeCallQueue: [],\n    nativeCallInFlight: false,\n    lastSizeChangeProperties: null\n  };\n\n\n  bridge.fireChangeEvent = function(properties) {\n    for (var p in properties) {\n      if (properties.hasOwnProperty(p)) {\n        // Change handlers defined by MRAID below\n        var handler = changeHandlers[p];\n        handler(properties[p]);\n      }\n    }\n  };\n\n  bridge.nativeCallComplete = function(command) {\n    if (this.nativeCallQueue.length === 0) {\n      this.nativeCallInFlight = false;\n      return;\n    }\n\n    var nextCall = this.nativeCallQueue.pop();\n    window.location = nextCall;\n  };\n\n  bridge.executeNativeCall = function(args) {\n    var command = args.shift();\n\n    if (!this.nativeSDKFiredReady) {\n        console.log('rejecting ' + command + ' because mraid is not ready');\n        bridge.notifyErrorEvent('mraid is not ready', command);\n        return;\n    }\n\n    var call = 'mraid://' + command;\n\n    var key, value;\n    var isFirstArgument = true;\n\n    for (var i = 0; i < args.length; i += 2) {\n      key = args[i];\n      value = args[i + 1];\n\n      if (value === null) continue;\n\n      if (isFirstArgument) {\n        call += '?';\n        isFirstArgument = false;\n      } else {\n        call += '&';\n      }\n\n      call += encodeURIComponent(key) + '=' + encodeURIComponent(value);\n    }\n\n    if (this.nativeCallInFlight) {\n      this.nativeCallQueue.push(call);\n    } else {\n      this.nativeCallInFlight = true;\n      window.location = call;\n    }\n  };\n\n\n  bridge.setCurrentPosition = function(x, y, width, height) {\n    currentPosition = {\n      x: x,\n      y: y,\n      width: width,\n      height: height\n    };\n    broadcastEvent(EVENTS.INFO, 'Set current position to ' + stringify(currentPosition));\n  };\n\n  bridge.setDefaultPosition = function(x, y, width, height) {\n    defaultPosition = {\n      x: x,\n      y: y,\n      width: width,\n      height: height\n    };\n    broadcastEvent(EVENTS.INFO, 'Set default position to ' + stringify(defaultPosition));\n  };\n\n  bridge.setMaxSize = function(width, height) {\n    maxSize = {\n      width: width,\n      height: height\n    };\n\n    expandProperties.width = width;\n    expandProperties.height = height;\n\n    broadcastEvent(EVENTS.INFO, 'Set max size to ' + stringify(maxSize));\n  };\n\n  bridge.setPlacementType = function(_placementType) {\n    placementType = _placementType;\n    broadcastEvent(EVENTS.INFO, 'Set placement type to ' + stringify(placementType));\n  };\n\n  bridge.setScreenSize = function(width, height) {\n    screenSize = {\n      width: width,\n      height: height\n    };\n    broadcastEvent(EVENTS.INFO, 'Set screen size to ' + stringify(screenSize));\n  };\n\n  bridge.setState = function(_state) {\n    state = _state;\n    broadcastEvent(EVENTS.INFO, 'Set state to ' + stringify(state));\n    broadcastEvent(EVENTS.STATECHANGE, state);\n  };\n\n  bridge.setIsViewable = function(_isViewable) {\n    isViewable = _isViewable;\n    broadcastEvent(EVENTS.INFO, 'Set isViewable to ' + stringify(isViewable));\n    broadcastEvent(EVENTS.VIEWABLECHANGE, isViewable);\n  };\n\n  bridge.setSupports = function(sms, tel, calendar, storePicture, inlineVideo) {\n    supportProperties = {\n      sms: sms,\n      tel: tel,\n      calendar: calendar,\n      storePicture: storePicture,\n      inlineVideo: inlineVideo\n    };\n  };\n\n  bridge.notifyReadyEvent = function() {\n    this.nativeSDKFiredReady = true;\n    broadcastEvent(EVENTS.READY);\n  };\n\n  bridge.notifyErrorEvent = function(message, action) {\n    broadcastEvent(EVENTS.ERROR, message, action);\n  };\n\n  // Temporary aliases while we migrate to the new API\n  bridge.fireReadyEvent = bridge.notifyReadyEvent;\n  bridge.fireErrorEvent = bridge.notifyErrorEvent;\n\n  bridge.notifySizeChangeEvent = function(width, height) {\n    if (this.lastSizeChangeProperties &&\n          width == this.lastSizeChangeProperties.width && height == this.lastSizeChangeProperties.height) {\n      return;\n    }\n\n    this.lastSizeChangeProperties = {\n        width: width,\n        height: height\n    };\n    broadcastEvent(EVENTS.SIZECHANGE, width, height);\n  };\n\n  bridge.notifyStateChangeEvent = function() {\n    if (state === STATES.LOADING) {\n      broadcastEvent(EVENTS.INFO, 'Native SDK initialized.');\n    }\n\n    broadcastEvent(EVENTS.INFO, 'Set state to ' + stringify(state));\n    broadcastEvent(EVENTS.STATECHANGE, state);\n  };\n\n  bridge.notifyViewableChangeEvent = function() {\n    broadcastEvent(EVENTS.INFO, 'Set isViewable to ' + stringify(isViewable));\n    broadcastEvent(EVENTS.VIEWABLECHANGE, isViewable);\n  };\n\n\n  // Constants. ////////////////////////////////////////////////////////////////////////////////////\n\n  var VERSION = mraid.VERSION = '2.0';\n\n  var STATES = mraid.STATES = {\n    LOADING: 'loading',\n    DEFAULT: 'default',\n    EXPANDED: 'expanded',\n    HIDDEN: 'hidden',\n    RESIZED: 'resized'\n  };\n\n  var EVENTS = mraid.EVENTS = {\n    ERROR: 'error',\n    INFO: 'info',\n    READY: 'ready',\n    STATECHANGE: 'stateChange',\n    VIEWABLECHANGE: 'viewableChange',\n    SIZECHANGE: 'sizeChange'\n  };\n\n  var PLACEMENT_TYPES = mraid.PLACEMENT_TYPES = {\n    UNKNOWN: 'unknown',\n    INLINE: 'inline',\n    INTERSTITIAL: 'interstitial'\n  };\n\n  // External MRAID state: may be directly or indirectly modified by the ad JS. ////////////////////\n\n  // Properties which define the behavior of an expandable ad.\n  var expandProperties = {\n    width: false,\n    height: false,\n    useCustomClose: false,\n    isModal: true\n  };\n\n  var resizeProperties = {\n    width: false,\n    height: false,\n    offsetX: false,\n    offsetY: false,\n    customClosePosition: 'top-right',\n    allowOffscreen: true\n  };\n\n  var orientationProperties = {\n    allowOrientationChange: true,\n    forceOrientation: \"none\"\n  };\n\n  var supportProperties = {\n    sms: false,\n    tel: false,\n    calendar: false,\n    storePicture: false,\n    inlineVideo: false\n  };\n\n  // default is undefined so that notifySizeChangeEvent can track changes\n  var lastSizeChangeProperties;\n\n  var maxSize = {};\n\n  var currentPosition = {};\n\n  var defaultPosition = {};\n\n  var screenSize = {};\n\n  var hasSetCustomClose = false;\n\n  var listeners = {};\n\n  // Internal MRAID state. Modified by the native SDK. /////////////////////////////////////////////\n\n  var state = STATES.LOADING;\n\n  var isViewable = false;\n\n  var placementType = PLACEMENT_TYPES.UNKNOWN;\n\n  //////////////////////////////////////////////////////////////////////////////////////////////////\n\n  var EventListeners = function(event) {\n    this.event = event;\n    this.count = 0;\n    var listeners = {};\n\n    this.add = function(func) {\n      var id = String(func);\n      if (!listeners[id]) {\n        listeners[id] = func;\n        this.count++;\n      }\n    };\n\n    this.remove = function(func) {\n      var id = String(func);\n      if (listeners[id]) {\n        listeners[id] = null;\n        delete listeners[id];\n        this.count--;\n        return true;\n      } else {\n        return false;\n      }\n    };\n\n    this.removeAll = function() {\n      for (var id in listeners) {\n        if (listeners.hasOwnProperty(id)) this.remove(listeners[id]);\n      }\n    };\n\n    this.broadcast = function(args) {\n      for (var id in listeners) {\n        if (listeners.hasOwnProperty(id)) listeners[id].apply(mraid, args);\n      }\n    };\n\n    this.toString = function() {\n      var out = [event, ':'];\n      for (var id in listeners) {\n        if (listeners.hasOwnProperty(id)) out.push('|', id, '|');\n      }\n      return out.join('');\n    };\n  };\n\n  var broadcastEvent = function() {\n    var args = new Array(arguments.length);\n    var l = arguments.length;\n    for (var i = 0; i < l; i++) args[i] = arguments[i];\n    var event = args.shift();\n    if (listeners[event]) listeners[event].broadcast(args);\n  };\n\n  var contains = function(value, array) {\n    for (var i in array) {\n      if (array[i] === value) return true;\n    }\n    return false;\n  };\n\n  var clone = function(obj) {\n    if (obj === null) return null;\n    var f = function() {};\n    f.prototype = obj;\n    return new f();\n  };\n\n  var stringify = function(obj) {\n    if (typeof obj === 'object') {\n      var out = [];\n      if (obj.push) {\n        // Array.\n        for (var p in obj) out.push(obj[p]);\n        return '[' + out.join(',') + ']';\n      } else {\n        // Other object.\n        for (var p in obj) out.push(\"'\" + p + \"': \" + obj[p]);\n        return '{' + out.join(',') + '}';\n      }\n    } else return String(obj);\n  };\n\n  var trim = function(str) {\n    return str.replace(/^\\s+|\\s+$/g, '');\n  };\n\n  // Functions that will be invoked by the native SDK whenever a \"change\" event occurs.\n  var changeHandlers = {\n    state: function(val) {\n      if (state === STATES.LOADING) {\n        broadcastEvent(EVENTS.INFO, 'Native SDK initialized.');\n      }\n      state = val;\n      broadcastEvent(EVENTS.INFO, 'Set state to ' + stringify(val));\n      broadcastEvent(EVENTS.STATECHANGE, state);\n    },\n\n    viewable: function(val) {\n      isViewable = val;\n      broadcastEvent(EVENTS.INFO, 'Set isViewable to ' + stringify(val));\n      broadcastEvent(EVENTS.VIEWABLECHANGE, isViewable);\n    },\n\n    placementType: function(val) {\n      broadcastEvent(EVENTS.INFO, 'Set placementType to ' + stringify(val));\n      placementType = val;\n    },\n\n    sizeChange: function(val) {\n      broadcastEvent(EVENTS.INFO, 'Set screenSize to ' + stringify(val));\n      for (var key in val) {\n        if (val.hasOwnProperty(key)) screenSize[key] = val[key];\n      }\n    },\n\n    supports: function(val) {\n      broadcastEvent(EVENTS.INFO, 'Set supports to ' + stringify(val));\n        supportProperties = val;\n    }\n  };\n\n  var validate = function(obj, validators, action, merge) {\n    if (!merge) {\n      // Check to see if any required properties are missing.\n      if (obj === null) {\n        broadcastEvent(EVENTS.ERROR, 'Required object not provided.', action);\n        return false;\n      } else {\n        for (var i in validators) {\n          if (validators.hasOwnProperty(i) && obj[i] === undefined) {\n            broadcastEvent(EVENTS.ERROR, 'Object is missing required property: ' + i, action);\n            return false;\n          }\n        }\n      }\n    }\n\n    for (var prop in obj) {\n      var validator = validators[prop];\n      var value = obj[prop];\n      if (validator && !validator(value)) {\n        // Failed validation.\n        broadcastEvent(EVENTS.ERROR, 'Value of property ' + prop + ' is invalid: ' + value, action);\n        return false;\n      }\n    }\n    return true;\n  };\n\n  var expandPropertyValidators = {\n    useCustomClose: function(v) { return (typeof v === 'boolean'); },\n  };\n\n  //////////////////////////////////////////////////////////////////////////////////////////////////\n\n  mraid.addEventListener = function(event, listener) {\n    if (!event || !listener) {\n      broadcastEvent(EVENTS.ERROR, 'Both event and listener are required.', 'addEventListener');\n    } else if (!contains(event, EVENTS)) {\n      broadcastEvent(EVENTS.ERROR, 'Unknown MRAID event: ' + event, 'addEventListener');\n    } else {\n      if (!listeners[event]) {\n        listeners[event] = new EventListeners(event);\n      }\n      listeners[event].add(listener);\n    }\n  };\n\n  mraid.close = function() {\n    if (state === STATES.HIDDEN) {\n      broadcastEvent(EVENTS.ERROR, 'Ad cannot be closed when it is already hidden.',\n        'close');\n    } else bridge.executeNativeCall(['close']);\n  };\n\n  mraid.expand = function(URL) {\n    if (!(this.getState() === STATES.DEFAULT || this.getState() === STATES.RESIZED)) {\n      broadcastEvent(EVENTS.ERROR, 'Ad can only be expanded from the default or resized state.', 'expand');\n    } else {\n      var args = ['expand',\n        'shouldUseCustomClose', expandProperties.useCustomClose\n      ];\n\n      if (URL) {\n        args = args.concat(['url', URL]);\n      }\n\n      bridge.executeNativeCall(args);\n    }\n  };\n\n  mraid.getExpandProperties = function() {\n    var properties = {\n      width: expandProperties.width,\n      height: expandProperties.height,\n      useCustomClose: expandProperties.useCustomClose,\n      isModal: expandProperties.isModal\n    };\n    return properties;\n  };\n\n\n  mraid.getCurrentPosition = function() {\n    return {\n      x: currentPosition.x,\n      y: currentPosition.y,\n      width: currentPosition.width,\n      height: currentPosition.height\n    };\n  };\n\n  mraid.getDefaultPosition = function() {\n    return {\n      x: defaultPosition.x,\n      y: defaultPosition.y,\n      width: defaultPosition.width,\n      height: defaultPosition.height\n    };\n  };\n\n  mraid.getMaxSize = function() {\n    return {\n      width: maxSize.width,\n      height: maxSize.height\n    };\n  };\n\n  mraid.getPlacementType = function() {\n    return placementType;\n  };\n\n  mraid.getScreenSize = function() {\n    return {\n      width: screenSize.width,\n      height: screenSize.height\n    };\n  };\n\n  mraid.getState = function() {\n    return state;\n  };\n\n  mraid.isViewable = function() {\n    return isViewable;\n  };\n\n  mraid.getVersion = function() {\n    return mraid.VERSION;\n  };\n\n  mraid.open = function(URL) {\n    if (!URL) broadcastEvent(EVENTS.ERROR, 'URL is required.', 'open');\n    else bridge.executeNativeCall(['open', 'url', URL]);\n  };\n\n  mraid.removeEventListener = function(event, listener) {\n    if (!event) {\n      broadcastEvent(EVENTS.ERROR, 'Event is required.', 'removeEventListener');\n      return;\n    }\n\n    if (listener) {\n      // If we have a valid event, we'll try to remove the listener from it.\n      var success = false;\n      if (listeners[event]) {\n        success = listeners[event].remove(listener);\n      }\n\n      // If we didn't have a valid event or couldn't remove the listener from the event, broadcast an error and return early.\n      if (!success) {\n        broadcastEvent(EVENTS.ERROR, 'Listener not currently registered for event.', 'removeEventListener');\n        return;\n      }\n\n    } else if (!listener && listeners[event]) {\n      listeners[event].removeAll();\n    }\n\n    if (listeners[event] && listeners[event].count === 0) {\n      listeners[event] = null;\n      delete listeners[event];\n    }\n  };\n\n  mraid.setExpandProperties = function(properties) {\n    if (validate(properties, expandPropertyValidators, 'setExpandProperties', true)) {\n      if (properties.hasOwnProperty('useCustomClose')) {\n        expandProperties.useCustomClose = properties.useCustomClose;\n      }\n    }\n  };\n\n  mraid.useCustomClose = function(shouldUseCustomClose) {\n    expandProperties.useCustomClose = shouldUseCustomClose;\n    hasSetCustomClose = true;\n    bridge.executeNativeCall(['usecustomclose', 'shouldUseCustomClose', shouldUseCustomClose]);\n  };\n\n  // MRAID 2.0 APIs ////////////////////////////////////////////////////////////////////////////////\n\n  mraid.createCalendarEvent = function(parameters) {\n    CalendarEventParser.initialize(parameters);\n    if (CalendarEventParser.parse()) {\n      bridge.executeNativeCall(CalendarEventParser.arguments);\n    } else {\n      broadcastEvent(EVENTS.ERROR, CalendarEventParser.errors[0], 'createCalendarEvent');\n    }\n  };\n\n  mraid.supports = function(feature) {\n    return supportProperties[feature];\n  };\n\n  mraid.playVideo = function(uri) {\n    if (!mraid.isViewable()) {\n      broadcastEvent(EVENTS.ERROR, 'playVideo cannot be called until the ad is viewable', 'playVideo');\n      return;\n    }\n\n    if (!uri) {\n      broadcastEvent(EVENTS.ERROR, 'playVideo must be called with a valid URI', 'playVideo');\n    } else {\n      bridge.executeNativeCall(['playVideo', 'uri', uri]);\n    }\n  };\n\n  mraid.storePicture = function(uri) {\n    if (!mraid.isViewable()) {\n      broadcastEvent(EVENTS.ERROR, 'storePicture cannot be called until the ad is viewable', 'storePicture');\n      return;\n    }\n\n    if (!uri) {\n      broadcastEvent(EVENTS.ERROR, 'storePicture must be called with a valid URI', 'storePicture');\n    } else {\n      bridge.executeNativeCall(['storePicture', 'uri', uri]);\n    }\n  };\n\n\n  var resizePropertyValidators = {\n    width: function(v) {\n      return !isNaN(v) && v > 0;\n    },\n    height: function(v) {\n      return !isNaN(v) && v > 0;\n    },\n    offsetX: function(v) {\n      return !isNaN(v);\n    },\n    offsetY: function(v) {\n      return !isNaN(v);\n    },\n    customClosePosition: function(v) {\n      return (typeof v === 'string' &&\n        ['top-right', 'bottom-right', 'top-left', 'bottom-left', 'center', 'top-center', 'bottom-center'].indexOf(v) > -1);\n    },\n    allowOffscreen: function(v) {\n      return (typeof v === 'boolean');\n    }\n  };\n\n  mraid.setOrientationProperties = function(properties) {\n\n    if (properties.hasOwnProperty('allowOrientationChange')) {\n      orientationProperties.allowOrientationChange = properties.allowOrientationChange;\n    }\n\n    if (properties.hasOwnProperty('forceOrientation')) {\n      orientationProperties.forceOrientation = properties.forceOrientation;\n    }\n\n    var args = ['setOrientationProperties',\n      'allowOrientationChange', orientationProperties.allowOrientationChange,\n      'forceOrientation', orientationProperties.forceOrientation\n    ];\n    bridge.executeNativeCall(args);\n  };\n\n  mraid.getOrientationProperties = function() {\n    return {\n      allowOrientationChange: orientationProperties.allowOrientationChange,\n      forceOrientation: orientationProperties.forceOrientation\n    };\n  };\n\n  mraid.resize = function() {\n    if (!(this.getState() === STATES.DEFAULT || this.getState() === STATES.RESIZED)) {\n      broadcastEvent(EVENTS.ERROR, 'Ad can only be resized from the default or resized state.', 'resize');\n    } else if (!resizeProperties.width || !resizeProperties.height) {\n      broadcastEvent(EVENTS.ERROR, 'Must set resize properties before calling resize()', 'resize');\n    } else {\n      var args = ['resize',\n        'width', resizeProperties.width,\n        'height', resizeProperties.height,\n        'offsetX', resizeProperties.offsetX || 0,\n        'offsetY', resizeProperties.offsetY || 0,\n        'customClosePosition', resizeProperties.customClosePosition,\n        'allowOffscreen', !!resizeProperties.allowOffscreen\n        ];\n\n      bridge.executeNativeCall(args);\n    }\n  };\n\n  mraid.getResizeProperties = function() {\n    var properties = {\n      width: resizeProperties.width,\n      height: resizeProperties.height,\n      offsetX: resizeProperties.offsetX,\n      offsetY: resizeProperties.offsetY,\n      customClosePosition: resizeProperties.customClosePosition,\n      allowOffscreen: resizeProperties.allowOffscreen\n    };\n    return properties;\n  };\n\n  mraid.setResizeProperties = function(properties) {\n    if (validate(properties, resizePropertyValidators, 'setResizeProperties', true)) {\n\n      var desiredProperties = ['width', 'height', 'offsetX', 'offsetY', 'customClosePosition', 'allowOffscreen'];\n\n      var length = desiredProperties.length;\n\n      for (var i = 0; i < length; i++) {\n        var propname = desiredProperties[i];\n        if (properties.hasOwnProperty(propname)) {\n          resizeProperties[propname] = properties[propname];\n        }\n      }\n    }\n  };\n\n  var CalendarEventParser = {\n    initialize: function(parameters) {\n      this.parameters = parameters;\n      this.errors = [];\n      this.arguments = ['createCalendarEvent'];\n    },\n\n    parse: function() {\n      if (!this.parameters) {\n        this.errors.push('The object passed to createCalendarEvent cannot be null.');\n      } else {\n        this.parseDescription();\n        this.parseLocation();\n        this.parseSummary();\n        this.parseStartAndEndDates();\n        this.parseReminder();\n        this.parseRecurrence();\n        this.parseTransparency();\n      }\n\n      var errorCount = this.errors.length;\n      if (errorCount) {\n        this.arguments.length = 0;\n      }\n\n      return (errorCount === 0);\n    },\n\n    parseDescription: function() {\n      this._processStringValue('description');\n    },\n\n    parseLocation: function() {\n      this._processStringValue('location');\n    },\n\n    parseSummary: function() {\n      this._processStringValue('summary');\n    },\n\n    parseStartAndEndDates: function() {\n      this._processDateValue('start');\n      this._processDateValue('end');\n    },\n\n    parseReminder: function() {\n      var reminder = this._getParameter('reminder');\n      if (!reminder) {\n        return;\n      }\n\n      if (reminder < 0) {\n        this.arguments.push('relativeReminder');\n        this.arguments.push(parseInt(reminder) / 1000);\n      } else {\n        this.arguments.push('absoluteReminder');\n        this.arguments.push(reminder);\n      }\n    },\n\n    parseRecurrence: function() {\n      var recurrenceDict = this._getParameter('recurrence');\n      if (!recurrenceDict) {\n        return;\n      }\n\n      this.parseRecurrenceInterval(recurrenceDict);\n      this.parseRecurrenceFrequency(recurrenceDict);\n      this.parseRecurrenceEndDate(recurrenceDict);\n      this.parseRecurrenceArrayValue(recurrenceDict, 'daysInWeek');\n      this.parseRecurrenceArrayValue(recurrenceDict, 'daysInMonth');\n      this.parseRecurrenceArrayValue(recurrenceDict, 'daysInYear');\n      this.parseRecurrenceArrayValue(recurrenceDict, 'monthsInYear');\n    },\n\n    parseTransparency: function() {\n      var validValues = ['opaque', 'transparent'];\n\n      if (this.parameters.hasOwnProperty('transparency')) {\n        var transparency = this.parameters.transparency;\n        if (contains(transparency, validValues)) {\n          this.arguments.push('transparency');\n          this.arguments.push(transparency);\n        } else {\n          this.errors.push('transparency must be opaque or transparent');\n        }\n      }\n    },\n\n    parseRecurrenceArrayValue: function(recurrenceDict, kind) {\n      if (recurrenceDict.hasOwnProperty(kind)) {\n        var array = recurrenceDict[kind];\n        if (!array || !(array instanceof Array)) {\n          this.errors.push(kind + ' must be an array.');\n        } else {\n          var arrayStr = array.join(',');\n          this.arguments.push(kind);\n          this.arguments.push(arrayStr);\n        }\n      }\n    },\n\n    parseRecurrenceInterval: function(recurrenceDict) {\n      if (recurrenceDict.hasOwnProperty('interval')) {\n        var interval = recurrenceDict.interval;\n        if (!interval) {\n          this.errors.push('Recurrence interval cannot be null.');\n        } else {\n          this.arguments.push('interval');\n          this.arguments.push(interval);\n        }\n      } else {\n        // If a recurrence rule was specified without an interval, use a default value of 1.\n        this.arguments.push('interval');\n        this.arguments.push(1);\n      }\n    },\n\n    parseRecurrenceFrequency: function(recurrenceDict) {\n      if (recurrenceDict.hasOwnProperty('frequency')) {\n        var frequency = recurrenceDict.frequency;\n        var validFrequencies = ['daily', 'weekly', 'monthly', 'yearly'];\n        if (contains(frequency, validFrequencies)) {\n          this.arguments.push('frequency');\n          this.arguments.push(frequency);\n        } else {\n          this.errors.push('Recurrence frequency must be one of: \"daily\", \"weekly\", \"monthly\", \"yearly\".');\n        }\n      }\n    },\n\n    parseRecurrenceEndDate: function(recurrenceDict) {\n      var expires = recurrenceDict.expires;\n\n      if (!expires) {\n        return;\n      }\n\n      this.arguments.push('expires');\n      this.arguments.push(expires);\n    },\n\n    _getParameter: function(key) {\n      if (this.parameters.hasOwnProperty(key)) {\n        return this.parameters[key];\n      }\n\n      return null;\n    },\n\n    _processStringValue: function(kind) {\n      if (this.parameters.hasOwnProperty(kind)) {\n        var value = this.parameters[kind];\n        this.arguments.push(kind);\n        this.arguments.push(value);\n      }\n    },\n\n    _processDateValue: function(kind) {\n      if (this.parameters.hasOwnProperty(kind)) {\n        var dateString = this._getParameter(kind);\n        this.arguments.push(kind);\n        this.arguments.push(dateString);\n      }\n    }\n  };\n}());\n".replaceAll("(?m)^\\s+", "").replaceAll("(?m)^//.*(?=\\n)", "");
        i = new _cls5();
        a = adreport;
        c = placementtype;
        d = mraidnativecommandhandler;
    }

    private static int a(int j, int k)
    {
        if (j < k || j > 0x186a0)
        {
            throw new h((new StringBuilder("Integer parameter out of range: ")).append(j).toString());
        } else
        {
            return j;
        }
    }

    static MraidBridgeListener a(MraidBridge mraidbridge)
    {
        return mraidbridge.e;
    }

    private static String a(Rect rect)
    {
        return (new StringBuilder()).append(rect.left).append(",").append(rect.top).append(",").append(rect.width()).append(",").append(rect.height()).toString();
    }

    static void a(MraidBridge mraidbridge, MraidJavascriptCommand mraidjavascriptcommand, String s)
    {
        mraidbridge.a(mraidjavascriptcommand, s);
    }

    private void a(MraidJavascriptCommand mraidjavascriptcommand, String s)
    {
        a((new StringBuilder("window.mraidbridge.notifyErrorEvent(")).append(JSONObject.quote(mraidjavascriptcommand.a())).append(", ").append(JSONObject.quote(s)).append(")").toString());
    }

    static boolean a(MraidBridge mraidbridge, boolean flag)
    {
        mraidbridge.g = flag;
        return flag;
    }

    private static boolean a(String s, boolean flag)
    {
        if (s == null)
        {
            return flag;
        } else
        {
            return d(s);
        }
    }

    private static String b(Rect rect)
    {
        return (new StringBuilder()).append(rect.width()).append(",").append(rect.height()).toString();
    }

    static boolean b(MraidBridge mraidbridge)
    {
        return mraidbridge.g;
    }

    private static int c(String s)
    {
        int j;
        try
        {
            j = Integer.parseInt(s, 10);
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new h((new StringBuilder("Invalid numeric parameter: ")).append(s).toString());
        }
        return j;
    }

    static void c(MraidBridge mraidbridge)
    {
        if (!mraidbridge.h)
        {
            mraidbridge.h = true;
            if (mraidbridge.e != null)
            {
                mraidbridge.e.onPageLoaded();
            }
        }
    }

    private static boolean d(String s)
    {
        if ("true".equals(s))
        {
            return true;
        }
        if ("false".equals(s))
        {
            return false;
        } else
        {
            throw new h((new StringBuilder("Invalid boolean parameter: ")).append(s).toString());
        }
    }

    private static URI e(String s)
    {
        if (s == null)
        {
            throw new h("Parameter cannot be null");
        }
        URI uri;
        try
        {
            uri = new URI(s);
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new h((new StringBuilder("Invalid URL parameter: ")).append(s).toString());
        }
        return uri;
    }

    final void a()
    {
        f = null;
    }

    final void a(MraidBridgeListener mraidbridgelistener)
    {
        e = mraidbridgelistener;
    }

    final void a(MraidWebView mraidwebview)
    {
        f = mraidwebview;
        f.getSettings().setJavaScriptEnabled(true);
        f.loadUrl((new StringBuilder("javascript:")).append(b).toString());
        f.setScrollContainer(false);
        f.setVerticalScrollBarEnabled(false);
        f.setHorizontalScrollBarEnabled(false);
        f.setBackgroundColor(0xff000000);
        f.setWebViewClient(i);
        f.setWebChromeClient(new b(this));
        mraidwebview = new ViewGestureDetector(f.getContext(), f, a);
        mraidwebview.setUserClickListener(new c(this));
        f.setOnTouchListener(new d(this, mraidwebview));
        f.a(new e(this));
    }

    final void a(PlacementType placementtype)
    {
        a((new StringBuilder("mraidbridge.setPlacementType(")).append(JSONObject.quote(placementtype.toString().toLowerCase(Locale.US))).append(")").toString());
    }

    final void a(ViewState viewstate)
    {
        a((new StringBuilder("mraidbridge.setState(")).append(JSONObject.quote(viewstate.toJavascriptString())).append(")").toString());
    }

    final void a(String s)
    {
        if (f == null)
        {
            MoPubLog.d((new StringBuilder("Attempted to inject Javascript into MRAID WebView while was not attached:\n\t")).append(s).toString());
            return;
        } else
        {
            MoPubLog.v((new StringBuilder("Injecting Javascript into MRAID WebView:\n\t")).append(s).toString());
            f.loadUrl((new StringBuilder("javascript:")).append(s).toString());
            return;
        }
    }

    final void a(boolean flag)
    {
        a((new StringBuilder("mraidbridge.setIsViewable(")).append(flag).append(")").toString());
    }

    final void a(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4)
    {
        a((new StringBuilder("mraidbridge.setSupports(")).append(flag).append(",").append(flag1).append(",").append(flag2).append(",").append(flag3).append(",").append(flag4).append(")").toString());
    }

    final void b()
    {
        a("mraidbridge.notifyReadyEvent();");
    }

    final boolean b(String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        obj = null;
        boolean flag = false;
        try
        {
            obj3 = new URI(s);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            MoPubLog.w((new StringBuilder("Invalid MRAID URL: ")).append(s).toString());
            a(MraidJavascriptCommand.UNSPECIFIED, "Mraid command sent an invalid URL");
            return true;
        }
        obj2 = ((URI) (obj3)).getScheme();
        obj1 = ((URI) (obj3)).getHost();
        if (!"mopub".equals(obj2)) goto _L2; else goto _L1
_L1:
        if ("failLoad".equals(obj1) && c == PlacementType.INLINE && e != null)
        {
            e.onPageFailedToLoad();
        }
        flag = true;
_L44:
        return flag;
_L2:
        if (!"mraid".equals(obj2))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = new HashMap();
        for (s = URLEncodedUtils.parse(((URI) (obj3)), "UTF-8").iterator(); s.hasNext(); ((Map) (obj2)).put(((NameValuePair) (obj3)).getName(), ((NameValuePair) (obj3)).getValue()))
        {
            obj3 = (NameValuePair)s.next();
        }

        obj1 = MraidJavascriptCommand.a(((String) (obj1)));
        if (((MraidJavascriptCommand) (obj1)).a(c) && !g)
        {
            throw new h("Cannot execute this command unless the user clicks");
        }
          goto _L3
_L4:
        a((new StringBuilder("window.mraidbridge.nativeCallComplete(")).append(JSONObject.quote(((MraidJavascriptCommand) (obj1)).a())).append(")").toString());
        return true;
_L3:
        if (e == null)
        {
            throw new h("Invalid state to execute this command");
        }
        if (f == null)
        {
            throw new h("The current WebView is being destroyed");
        }
        g.a[((MraidJavascriptCommand) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 10: default 1235
    //                   1 368
    //                   2 380
    //                   3 683
    //                   4 745
    //                   5 778
    //                   6 808
    //                   7 928
    //                   8 958
    //                   9 1118
    //                   10 1133;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L5:
        e.onClose();
          goto _L4
_L6:
        int j;
        int k;
        int l;
        int i1;
        j = a(c((String)((Map) (obj2)).get("width")), 0);
        k = a(c((String)((Map) (obj2)).get("height")), 0);
        l = a(c((String)((Map) (obj2)).get("offsetX")), 0xfffe7960);
        i1 = a(c((String)((Map) (obj2)).get("offsetY")), 0xfffe7960);
        obj = (String)((Map) (obj2)).get("customClosePosition");
        s = com.mopub.common.CloseableLayout.ClosePosition.TOP_RIGHT;
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L16; else goto _L15
_L15:
        boolean flag1 = a((String)((Map) (obj2)).get("allowOffscreen"), true);
        e.onResize(j, k, l, i1, s, flag1);
          goto _L4
_L16:
        if (!((String) (obj)).equals("top-left")) goto _L18; else goto _L17
_L17:
        s = com.mopub.common.CloseableLayout.ClosePosition.TOP_LEFT;
          goto _L15
_L18:
        if (!((String) (obj)).equals("top-right")) goto _L20; else goto _L19
_L19:
        s = com.mopub.common.CloseableLayout.ClosePosition.TOP_RIGHT;
          goto _L15
_L20:
        if (!((String) (obj)).equals("center")) goto _L22; else goto _L21
_L21:
        s = com.mopub.common.CloseableLayout.ClosePosition.CENTER;
          goto _L15
_L22:
        if (!((String) (obj)).equals("bottom-left")) goto _L24; else goto _L23
_L23:
        s = com.mopub.common.CloseableLayout.ClosePosition.BOTTOM_LEFT;
          goto _L15
_L24:
        if (!((String) (obj)).equals("bottom-right")) goto _L26; else goto _L25
_L25:
        s = com.mopub.common.CloseableLayout.ClosePosition.BOTTOM_RIGHT;
          goto _L15
_L26:
        if (!((String) (obj)).equals("top-center")) goto _L28; else goto _L27
_L27:
        s = com.mopub.common.CloseableLayout.ClosePosition.TOP_CENTER;
          goto _L15
_L28:
        if (!((String) (obj)).equals("bottom-center")) goto _L30; else goto _L29
_L29:
        s = com.mopub.common.CloseableLayout.ClosePosition.BOTTOM_CENTER;
          goto _L15
_L30:
        throw new h((new StringBuilder("Invalid close position: ")).append(((String) (obj))).toString());
_L7:
        s = (String)((Map) (obj2)).get("url");
        if (s != null) goto _L32; else goto _L31
_L31:
        s = ((String) (obj));
_L33:
        try
        {
            boolean flag2 = a((String)((Map) (obj2)).get("shouldUseCustomClose"), false);
            e.onExpand(s, flag2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a(((MraidJavascriptCommand) (obj1)), s.getMessage());
        }
          goto _L4
_L32:
        s = e(s);
          goto _L33
_L8:
        boolean flag3 = a((String)((Map) (obj2)).get("shouldUseCustomClose"), false);
        e.onUseCustomClose(flag3);
          goto _L4
_L9:
        s = e((String)((Map) (obj2)).get("url"));
        e.onOpen(s);
          goto _L4
_L10:
        boolean flag4;
        flag4 = d((String)((Map) (obj2)).get("allowOrientationChange"));
        s = (String)((Map) (obj2)).get("forceOrientation");
        if (!"portrait".equals(s)) goto _L35; else goto _L34
_L34:
        s = ag.PORTRAIT;
_L38:
        e.onSetOrientationProperties(flag4, s);
          goto _L4
_L35:
        if (!"landscape".equals(s)) goto _L37; else goto _L36
_L36:
        s = ag.LANDSCAPE;
          goto _L38
_L37:
        if (!"none".equals(s)) goto _L40; else goto _L39
_L39:
        s = ag.NONE;
          goto _L38
_L40:
        throw new h((new StringBuilder("Invalid orientation: ")).append(s).toString());
_L11:
        s = e((String)((Map) (obj2)).get("uri"));
        e.onPlayVideo(s);
          goto _L4
_L12:
        obj2 = e((String)((Map) (obj2)).get("uri"));
        s = d;
        obj = f.getContext();
        obj2 = ((URI) (obj2)).toString();
        obj3 = new f(this, ((MraidJavascriptCommand) (obj1)));
        if (!MraidNativeCommandHandler.isStorePictureSupported(((Context) (obj))))
        {
            MoPubLog.d("Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
            throw new h("Error downloading file  - the device does not have an SD card mounted, or the Android permission is not granted.");
        }
        if (!(obj instanceof Activity)) goto _L42; else goto _L41
_L41:
        (new android.app.AlertDialog.Builder(((Context) (obj)))).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", null).setPositiveButton("Okay", new ab(s, ((Context) (obj)), ((String) (obj2)), ((af) (obj3)))).setCancelable(true).show();
          goto _L4
_L42:
        Toast.makeText(((Context) (obj)), "Downloading image to Picture gallery...", 0).show();
        s.a(((Context) (obj)), ((String) (obj2)), ((af) (obj3)));
          goto _L4
_L13:
        MraidNativeCommandHandler.a(f.getContext(), ((Map) (obj2)));
          goto _L4
_L14:
        throw new h("Unspecified MRAID Javascript command");
        if (!g) goto _L44; else goto _L43
_L43:
        obj = new Intent();
        ((Intent) (obj)).setAction("android.intent.action.VIEW");
        ((Intent) (obj)).setData(Uri.parse(s));
        ((Intent) (obj)).addFlags(0x10000000);
        if (f != null) goto _L46; else goto _L45
_L45:
        MoPubLog.d("WebView was detached. Unable to load a URL");
        return true;
_L46:
        try
        {
            f.getContext().startActivity(((Intent) (obj)));
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            MoPubLog.d((new StringBuilder("No activity found to handle this URL ")).append(s).toString());
            return false;
        }
        return true;
    }

    final boolean c()
    {
        return f != null && f.isVisible();
    }

    final boolean d()
    {
        return f != null;
    }

    final boolean e()
    {
        return h;
    }

    public void notifyScreenMetrics(ah ah1)
    {
        a((new StringBuilder("mraidbridge.setScreenSize(")).append(b(ah1.a())).append(");mraidbridge.setMaxSize(").append(b(ah1.c())).append(");mraidbridge.setCurrentPosition(").append(a(ah1.e())).append(");mraidbridge.setDefaultPosition(").append(a(ah1.g())).append(")").toString());
        a((new StringBuilder("mraidbridge.notifySizeChangeEvent(")).append(b(ah1.d())).append(")").toString());
    }

    public void setContentHtml(String s)
    {
        if (f == null)
        {
            MoPubLog.d("MRAID bridge called setContentHtml before WebView was attached");
            return;
        } else
        {
            h = false;
            f.loadDataWithBaseURL(null, s, "text/html", "UTF-8", null);
            return;
        }
    }

    public void setContentUrl(String s)
    {
        if (f == null)
        {
            MoPubLog.d("MRAID bridge called setContentHtml while WebView was not attached");
            return;
        } else
        {
            h = false;
            f.loadUrl(s);
            return;
        }
    }

    private class _cls5 extends WebViewClient
    {

        final MraidBridge a;

        public void onPageFinished(WebView webview, String s)
        {
            MraidBridge.c(a);
        }

        public void onReceivedError(WebView webview, int j, String s, String s1)
        {
            MoPubLog.d((new StringBuilder("Error: ")).append(s).toString());
            super.onReceivedError(webview, j, s, s1);
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            return a.b(s);
        }

        _cls5()
        {
            a = MraidBridge.this;
            super();
        }
    }


    private class MraidBridgeListener
    {

        public abstract void onClose();

        public abstract boolean onConsoleMessage(ConsoleMessage consolemessage);

        public abstract void onExpand(URI uri, boolean flag);

        public abstract boolean onJsAlert(String s, JsResult jsresult);

        public abstract void onOpen(URI uri);

        public abstract void onPageFailedToLoad();

        public abstract void onPageLoaded();

        public abstract void onPlayVideo(URI uri);

        public abstract void onResize(int j, int k, int l, int i1, com.mopub.common.CloseableLayout.ClosePosition closeposition, boolean flag);

        public abstract void onSetOrientationProperties(boolean flag, ag ag1);

        public abstract void onUseCustomClose(boolean flag);

        public abstract void onVisibilityChanged(boolean flag);
    }


    private class MraidWebView extends BaseWebView
    {

        private OnVisibilityChangedListener b;
        private boolean c;

        final void a(OnVisibilityChangedListener onvisibilitychangedlistener)
        {
            b = onvisibilitychangedlistener;
        }

        public boolean isVisible()
        {
            return c;
        }

        protected void onVisibilityChanged(View view, int j)
        {
            super.onVisibilityChanged(view, j);
            boolean flag;
            if (j == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag != c)
            {
                c = flag;
                class OnVisibilityChangedListener
                {

                    public abstract void onVisibilityChanged(boolean flag1);
                }

                if (b != null)
                {
                    b.onVisibilityChanged(c);
                }
            }
        }

        public MraidWebView(Context context)
        {
            super(context);
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
        }
    }

}
