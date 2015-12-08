.class public Lcom/mopub/mraid/MraidBridge;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/mopub/common/AdReport;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/mopub/mraid/PlacementType;

.field private final d:Lcom/mopub/mraid/MraidNativeCommandHandler;

.field private e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

.field private f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

.field private g:Z

.field private h:Z

.field private final i:Landroid/webkit/WebViewClient;


# direct methods
.method constructor <init>(Lcom/mopub/common/AdReport;Lcom/mopub/mraid/PlacementType;)V
    .locals 1

    .prologue
    .line 90
    new-instance v0, Lcom/mopub/mraid/MraidNativeCommandHandler;

    invoke-direct {v0}, Lcom/mopub/mraid/MraidNativeCommandHandler;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/mopub/mraid/MraidBridge;-><init>(Lcom/mopub/common/AdReport;Lcom/mopub/mraid/PlacementType;Lcom/mopub/mraid/MraidNativeCommandHandler;)V

    .line 91
    return-void
.end method

.method private constructor <init>(Lcom/mopub/common/AdReport;Lcom/mopub/mraid/PlacementType;Lcom/mopub/mraid/MraidNativeCommandHandler;)V
    .locals 3
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    const-string v0, "(function() {\n  var isIOS = (/iphone|ipad|ipod/i).test(window.navigator.userAgent.toLowerCase());\n  if (isIOS) {\n    console = {};\n    console.log = function(log) {\n      var iframe = document.createElement(\'iframe\');\n      iframe.setAttribute(\'src\', \'ios-log: \' + log);\n      document.documentElement.appendChild(iframe);\n      iframe.parentNode.removeChild(iframe);\n      iframe = null;\n    };\n    console.debug = console.info = console.warn = console.error = console.log;\n  }\n}());\n\n\n(function() {\n  var mraid = window.mraid = {};\n\n  //////////////////////////////////////////////////////////////////////////////////////////////////\n\n  // Bridge interface to SDK\n\n  var bridge = window.mraidbridge = {\n    nativeSDKFiredReady: false,\n    nativeCallQueue: [],\n    nativeCallInFlight: false,\n    lastSizeChangeProperties: null\n  };\n\n\n  bridge.fireChangeEvent = function(properties) {\n    for (var p in properties) {\n      if (properties.hasOwnProperty(p)) {\n        // Change handlers defined by MRAID below\n        var handler = changeHandlers[p];\n        handler(properties[p]);\n      }\n    }\n  };\n\n  bridge.nativeCallComplete = function(command) {\n    if (this.nativeCallQueue.length === 0) {\n      this.nativeCallInFlight = false;\n      return;\n    }\n\n    var nextCall = this.nativeCallQueue.pop();\n    window.location = nextCall;\n  };\n\n  bridge.executeNativeCall = function(args) {\n    var command = args.shift();\n\n    if (!this.nativeSDKFiredReady) {\n        console.log(\'rejecting \' + command + \' because mraid is not ready\');\n        bridge.notifyErrorEvent(\'mraid is not ready\', command);\n        return;\n    }\n\n    var call = \'mraid://\' + command;\n\n    var key, value;\n    var isFirstArgument = true;\n\n    for (var i = 0; i < args.length; i += 2) {\n      key = args[i];\n      value = args[i + 1];\n\n      if (value === null) continue;\n\n      if (isFirstArgument) {\n        call += \'?\';\n        isFirstArgument = false;\n      } else {\n        call += \'&\';\n      }\n\n      call += encodeURIComponent(key) + \'=\' + encodeURIComponent(value);\n    }\n\n    if (this.nativeCallInFlight) {\n      this.nativeCallQueue.push(call);\n    } else {\n      this.nativeCallInFlight = true;\n      window.location = call;\n    }\n  };\n\n\n  bridge.setCurrentPosition = function(x, y, width, height) {\n    currentPosition = {\n      x: x,\n      y: y,\n      width: width,\n      height: height\n    };\n    broadcastEvent(EVENTS.INFO, \'Set current position to \' + stringify(currentPosition));\n  };\n\n  bridge.setDefaultPosition = function(x, y, width, height) {\n    defaultPosition = {\n      x: x,\n      y: y,\n      width: width,\n      height: height\n    };\n    broadcastEvent(EVENTS.INFO, \'Set default position to \' + stringify(defaultPosition));\n  };\n\n  bridge.setMaxSize = function(width, height) {\n    maxSize = {\n      width: width,\n      height: height\n    };\n\n    expandProperties.width = width;\n    expandProperties.height = height;\n\n    broadcastEvent(EVENTS.INFO, \'Set max size to \' + stringify(maxSize));\n  };\n\n  bridge.setPlacementType = function(_placementType) {\n    placementType = _placementType;\n    broadcastEvent(EVENTS.INFO, \'Set placement type to \' + stringify(placementType));\n  };\n\n  bridge.setScreenSize = function(width, height) {\n    screenSize = {\n      width: width,\n      height: height\n    };\n    broadcastEvent(EVENTS.INFO, \'Set screen size to \' + stringify(screenSize));\n  };\n\n  bridge.setState = function(_state) {\n    state = _state;\n    broadcastEvent(EVENTS.INFO, \'Set state to \' + stringify(state));\n    broadcastEvent(EVENTS.STATECHANGE, state);\n  };\n\n  bridge.setIsViewable = function(_isViewable) {\n    isViewable = _isViewable;\n    broadcastEvent(EVENTS.INFO, \'Set isViewable to \' + stringify(isViewable));\n    broadcastEvent(EVENTS.VIEWABLECHANGE, isViewable);\n  };\n\n  bridge.setSupports = function(sms, tel, calendar, storePicture, inlineVideo) {\n    supportProperties = {\n      sms: sms,\n      tel: tel,\n      calendar: calendar,\n      storePicture: storePicture,\n      inlineVideo: inlineVideo\n    };\n  };\n\n  bridge.notifyReadyEvent = function() {\n    this.nativeSDKFiredReady = true;\n    broadcastEvent(EVENTS.READY);\n  };\n\n  bridge.notifyErrorEvent = function(message, action) {\n    broadcastEvent(EVENTS.ERROR, message, action);\n  };\n\n  // Temporary aliases while we migrate to the new API\n  bridge.fireReadyEvent = bridge.notifyReadyEvent;\n  bridge.fireErrorEvent = bridge.notifyErrorEvent;\n\n  bridge.notifySizeChangeEvent = function(width, height) {\n    if (this.lastSizeChangeProperties &&\n          width == this.lastSizeChangeProperties.width && height == this.lastSizeChangeProperties.height) {\n      return;\n    }\n\n    this.lastSizeChangeProperties = {\n        width: width,\n        height: height\n    };\n    broadcastEvent(EVENTS.SIZECHANGE, width, height);\n  };\n\n  bridge.notifyStateChangeEvent = function() {\n    if (state === STATES.LOADING) {\n      broadcastEvent(EVENTS.INFO, \'Native SDK initialized.\');\n    }\n\n    broadcastEvent(EVENTS.INFO, \'Set state to \' + stringify(state));\n    broadcastEvent(EVENTS.STATECHANGE, state);\n  };\n\n  bridge.notifyViewableChangeEvent = function() {\n    broadcastEvent(EVENTS.INFO, \'Set isViewable to \' + stringify(isViewable));\n    broadcastEvent(EVENTS.VIEWABLECHANGE, isViewable);\n  };\n\n\n  // Constants. ////////////////////////////////////////////////////////////////////////////////////\n\n  var VERSION = mraid.VERSION = \'2.0\';\n\n  var STATES = mraid.STATES = {\n    LOADING: \'loading\',\n    DEFAULT: \'default\',\n    EXPANDED: \'expanded\',\n    HIDDEN: \'hidden\',\n    RESIZED: \'resized\'\n  };\n\n  var EVENTS = mraid.EVENTS = {\n    ERROR: \'error\',\n    INFO: \'info\',\n    READY: \'ready\',\n    STATECHANGE: \'stateChange\',\n    VIEWABLECHANGE: \'viewableChange\',\n    SIZECHANGE: \'sizeChange\'\n  };\n\n  var PLACEMENT_TYPES = mraid.PLACEMENT_TYPES = {\n    UNKNOWN: \'unknown\',\n    INLINE: \'inline\',\n    INTERSTITIAL: \'interstitial\'\n  };\n\n  // External MRAID state: may be directly or indirectly modified by the ad JS. ////////////////////\n\n  // Properties which define the behavior of an expandable ad.\n  var expandProperties = {\n    width: false,\n    height: false,\n    useCustomClose: false,\n    isModal: true\n  };\n\n  var resizeProperties = {\n    width: false,\n    height: false,\n    offsetX: false,\n    offsetY: false,\n    customClosePosition: \'top-right\',\n    allowOffscreen: true\n  };\n\n  var orientationProperties = {\n    allowOrientationChange: true,\n    forceOrientation: \"none\"\n  };\n\n  var supportProperties = {\n    sms: false,\n    tel: false,\n    calendar: false,\n    storePicture: false,\n    inlineVideo: false\n  };\n\n  // default is undefined so that notifySizeChangeEvent can track changes\n  var lastSizeChangeProperties;\n\n  var maxSize = {};\n\n  var currentPosition = {};\n\n  var defaultPosition = {};\n\n  var screenSize = {};\n\n  var hasSetCustomClose = false;\n\n  var listeners = {};\n\n  // Internal MRAID state. Modified by the native SDK. /////////////////////////////////////////////\n\n  var state = STATES.LOADING;\n\n  var isViewable = false;\n\n  var placementType = PLACEMENT_TYPES.UNKNOWN;\n\n  //////////////////////////////////////////////////////////////////////////////////////////////////\n\n  var EventListeners = function(event) {\n    this.event = event;\n    this.count = 0;\n    var listeners = {};\n\n    this.add = function(func) {\n      var id = String(func);\n      if (!listeners[id]) {\n        listeners[id] = func;\n        this.count++;\n      }\n    };\n\n    this.remove = function(func) {\n      var id = String(func);\n      if (listeners[id]) {\n        listeners[id] = null;\n        delete listeners[id];\n        this.count--;\n        return true;\n      } else {\n        return false;\n      }\n    };\n\n    this.removeAll = function() {\n      for (var id in listeners) {\n        if (listeners.hasOwnProperty(id)) this.remove(listeners[id]);\n      }\n    };\n\n    this.broadcast = function(args) {\n      for (var id in listeners) {\n        if (listeners.hasOwnProperty(id)) listeners[id].apply(mraid, args);\n      }\n    };\n\n    this.toString = function() {\n      var out = [event, \':\'];\n      for (var id in listeners) {\n        if (listeners.hasOwnProperty(id)) out.push(\'|\', id, \'|\');\n      }\n      return out.join(\'\');\n    };\n  };\n\n  var broadcastEvent = function() {\n    var args = new Array(arguments.length);\n    var l = arguments.length;\n    for (var i = 0; i < l; i++) args[i] = arguments[i];\n    var event = args.shift();\n    if (listeners[event]) listeners[event].broadcast(args);\n  };\n\n  var contains = function(value, array) {\n    for (var i in array) {\n      if (array[i] === value) return true;\n    }\n    return false;\n  };\n\n  var clone = function(obj) {\n    if (obj === null) return null;\n    var f = function() {};\n    f.prototype = obj;\n    return new f();\n  };\n\n  var stringify = function(obj) {\n    if (typeof obj === \'object\') {\n      var out = [];\n      if (obj.push) {\n        // Array.\n        for (var p in obj) out.push(obj[p]);\n        return \'[\' + out.join(\',\') + \']\';\n      } else {\n        // Other object.\n        for (var p in obj) out.push(\"\'\" + p + \"\': \" + obj[p]);\n        return \'{\' + out.join(\',\') + \'}\';\n      }\n    } else return String(obj);\n  };\n\n  var trim = function(str) {\n    return str.replace(/^\\s+|\\s+$/g, \'\');\n  };\n\n  // Functions that will be invoked by the native SDK whenever a \"change\" event occurs.\n  var changeHandlers = {\n    state: function(val) {\n      if (state === STATES.LOADING) {\n        broadcastEvent(EVENTS.INFO, \'Native SDK initialized.\');\n      }\n      state = val;\n      broadcastEvent(EVENTS.INFO, \'Set state to \' + stringify(val));\n      broadcastEvent(EVENTS.STATECHANGE, state);\n    },\n\n    viewable: function(val) {\n      isViewable = val;\n      broadcastEvent(EVENTS.INFO, \'Set isViewable to \' + stringify(val));\n      broadcastEvent(EVENTS.VIEWABLECHANGE, isViewable);\n    },\n\n    placementType: function(val) {\n      broadcastEvent(EVENTS.INFO, \'Set placementType to \' + stringify(val));\n      placementType = val;\n    },\n\n    sizeChange: function(val) {\n      broadcastEvent(EVENTS.INFO, \'Set screenSize to \' + stringify(val));\n      for (var key in val) {\n        if (val.hasOwnProperty(key)) screenSize[key] = val[key];\n      }\n    },\n\n    supports: function(val) {\n      broadcastEvent(EVENTS.INFO, \'Set supports to \' + stringify(val));\n        supportProperties = val;\n    }\n  };\n\n  var validate = function(obj, validators, action, merge) {\n    if (!merge) {\n      // Check to see if any required properties are missing.\n      if (obj === null) {\n        broadcastEvent(EVENTS.ERROR, \'Required object not provided.\', action);\n        return false;\n      } else {\n        for (var i in validators) {\n          if (validators.hasOwnProperty(i) && obj[i] === undefined) {\n            broadcastEvent(EVENTS.ERROR, \'Object is missing required property: \' + i, action);\n            return false;\n          }\n        }\n      }\n    }\n\n    for (var prop in obj) {\n      var validator = validators[prop];\n      var value = obj[prop];\n      if (validator && !validator(value)) {\n        // Failed validation.\n        broadcastEvent(EVENTS.ERROR, \'Value of property \' + prop + \' is invalid: \' + value, action);\n        return false;\n      }\n    }\n    return true;\n  };\n\n  var expandPropertyValidators = {\n    useCustomClose: function(v) { return (typeof v === \'boolean\'); },\n  };\n\n  //////////////////////////////////////////////////////////////////////////////////////////////////\n\n  mraid.addEventListener = function(event, listener) {\n    if (!event || !listener) {\n      broadcastEvent(EVENTS.ERROR, \'Both event and listener are required.\', \'addEventListener\');\n    } else if (!contains(event, EVENTS)) {\n      broadcastEvent(EVENTS.ERROR, \'Unknown MRAID event: \' + event, \'addEventListener\');\n    } else {\n      if (!listeners[event]) {\n        listeners[event] = new EventListeners(event);\n      }\n      listeners[event].add(listener);\n    }\n  };\n\n  mraid.close = function() {\n    if (state === STATES.HIDDEN) {\n      broadcastEvent(EVENTS.ERROR, \'Ad cannot be closed when it is already hidden.\',\n        \'close\');\n    } else bridge.executeNativeCall([\'close\']);\n  };\n\n  mraid.expand = function(URL) {\n    if (!(this.getState() === STATES.DEFAULT || this.getState() === STATES.RESIZED)) {\n      broadcastEvent(EVENTS.ERROR, \'Ad can only be expanded from the default or resized state.\', \'expand\');\n    } else {\n      var args = [\'expand\',\n        \'shouldUseCustomClose\', expandProperties.useCustomClose\n      ];\n\n      if (URL) {\n        args = args.concat([\'url\', URL]);\n      }\n\n      bridge.executeNativeCall(args);\n    }\n  };\n\n  mraid.getExpandProperties = function() {\n    var properties = {\n      width: expandProperties.width,\n      height: expandProperties.height,\n      useCustomClose: expandProperties.useCustomClose,\n      isModal: expandProperties.isModal\n    };\n    return properties;\n  };\n\n\n  mraid.getCurrentPosition = function() {\n    return {\n      x: currentPosition.x,\n      y: currentPosition.y,\n      width: currentPosition.width,\n      height: currentPosition.height\n    };\n  };\n\n  mraid.getDefaultPosition = function() {\n    return {\n      x: defaultPosition.x,\n      y: defaultPosition.y,\n      width: defaultPosition.width,\n      height: defaultPosition.height\n    };\n  };\n\n  mraid.getMaxSize = function() {\n    return {\n      width: maxSize.width,\n      height: maxSize.height\n    };\n  };\n\n  mraid.getPlacementType = function() {\n    return placementType;\n  };\n\n  mraid.getScreenSize = function() {\n    return {\n      width: screenSize.width,\n      height: screenSize.height\n    };\n  };\n\n  mraid.getState = function() {\n    return state;\n  };\n\n  mraid.isViewable = function() {\n    return isViewable;\n  };\n\n  mraid.getVersion = function() {\n    return mraid.VERSION;\n  };\n\n  mraid.open = function(URL) {\n    if (!URL) broadcastEvent(EVENTS.ERROR, \'URL is required.\', \'open\');\n    else bridge.executeNativeCall([\'open\', \'url\', URL]);\n  };\n\n  mraid.removeEventListener = function(event, listener) {\n    if (!event) {\n      broadcastEvent(EVENTS.ERROR, \'Event is required.\', \'removeEventListener\');\n      return;\n    }\n\n    if (listener) {\n      // If we have a valid event, we\'ll try to remove the listener from it.\n      var success = false;\n      if (listeners[event]) {\n        success = listeners[event].remove(listener);\n      }\n\n      // If we didn\'t have a valid event or couldn\'t remove the listener from the event, broadcast an error and return early.\n      if (!success) {\n        broadcastEvent(EVENTS.ERROR, \'Listener not currently registered for event.\', \'removeEventListener\');\n        return;\n      }\n\n    } else if (!listener && listeners[event]) {\n      listeners[event].removeAll();\n    }\n\n    if (listeners[event] && listeners[event].count === 0) {\n      listeners[event] = null;\n      delete listeners[event];\n    }\n  };\n\n  mraid.setExpandProperties = function(properties) {\n    if (validate(properties, expandPropertyValidators, \'setExpandProperties\', true)) {\n      if (properties.hasOwnProperty(\'useCustomClose\')) {\n        expandProperties.useCustomClose = properties.useCustomClose;\n      }\n    }\n  };\n\n  mraid.useCustomClose = function(shouldUseCustomClose) {\n    expandProperties.useCustomClose = shouldUseCustomClose;\n    hasSetCustomClose = true;\n    bridge.executeNativeCall([\'usecustomclose\', \'shouldUseCustomClose\', shouldUseCustomClose]);\n  };\n\n  // MRAID 2.0 APIs ////////////////////////////////////////////////////////////////////////////////\n\n  mraid.createCalendarEvent = function(parameters) {\n    CalendarEventParser.initialize(parameters);\n    if (CalendarEventParser.parse()) {\n      bridge.executeNativeCall(CalendarEventParser.arguments);\n    } else {\n      broadcastEvent(EVENTS.ERROR, CalendarEventParser.errors[0], \'createCalendarEvent\');\n    }\n  };\n\n  mraid.supports = function(feature) {\n    return supportProperties[feature];\n  };\n\n  mraid.playVideo = function(uri) {\n    if (!mraid.isViewable()) {\n      broadcastEvent(EVENTS.ERROR, \'playVideo cannot be called until the ad is viewable\', \'playVideo\');\n      return;\n    }\n\n    if (!uri) {\n      broadcastEvent(EVENTS.ERROR, \'playVideo must be called with a valid URI\', \'playVideo\');\n    } else {\n      bridge.executeNativeCall([\'playVideo\', \'uri\', uri]);\n    }\n  };\n\n  mraid.storePicture = function(uri) {\n    if (!mraid.isViewable()) {\n      broadcastEvent(EVENTS.ERROR, \'storePicture cannot be called until the ad is viewable\', \'storePicture\');\n      return;\n    }\n\n    if (!uri) {\n      broadcastEvent(EVENTS.ERROR, \'storePicture must be called with a valid URI\', \'storePicture\');\n    } else {\n      bridge.executeNativeCall([\'storePicture\', \'uri\', uri]);\n    }\n  };\n\n\n  var resizePropertyValidators = {\n    width: function(v) {\n      return !isNaN(v) && v > 0;\n    },\n    height: function(v) {\n      return !isNaN(v) && v > 0;\n    },\n    offsetX: function(v) {\n      return !isNaN(v);\n    },\n    offsetY: function(v) {\n      return !isNaN(v);\n    },\n    customClosePosition: function(v) {\n      return (typeof v === \'string\' &&\n        [\'top-right\', \'bottom-right\', \'top-left\', \'bottom-left\', \'center\', \'top-center\', \'bottom-center\'].indexOf(v) > -1);\n    },\n    allowOffscreen: function(v) {\n      return (typeof v === \'boolean\');\n    }\n  };\n\n  mraid.setOrientationProperties = function(properties) {\n\n    if (properties.hasOwnProperty(\'allowOrientationChange\')) {\n      orientationProperties.allowOrientationChange = properties.allowOrientationChange;\n    }\n\n    if (properties.hasOwnProperty(\'forceOrientation\')) {\n      orientationProperties.forceOrientation = properties.forceOrientation;\n    }\n\n    var args = [\'setOrientationProperties\',\n      \'allowOrientationChange\', orientationProperties.allowOrientationChange,\n      \'forceOrientation\', orientationProperties.forceOrientation\n    ];\n    bridge.executeNativeCall(args);\n  };\n\n  mraid.getOrientationProperties = function() {\n    return {\n      allowOrientationChange: orientationProperties.allowOrientationChange,\n      forceOrientation: orientationProperties.forceOrientation\n    };\n  };\n\n  mraid.resize = function() {\n    if (!(this.getState() === STATES.DEFAULT || this.getState() === STATES.RESIZED)) {\n      broadcastEvent(EVENTS.ERROR, \'Ad can only be resized from the default or resized state.\', \'resize\');\n    } else if (!resizeProperties.width || !resizeProperties.height) {\n      broadcastEvent(EVENTS.ERROR, \'Must set resize properties before calling resize()\', \'resize\');\n    } else {\n      var args = [\'resize\',\n        \'width\', resizeProperties.width,\n        \'height\', resizeProperties.height,\n        \'offsetX\', resizeProperties.offsetX || 0,\n        \'offsetY\', resizeProperties.offsetY || 0,\n        \'customClosePosition\', resizeProperties.customClosePosition,\n        \'allowOffscreen\', !!resizeProperties.allowOffscreen\n        ];\n\n      bridge.executeNativeCall(args);\n    }\n  };\n\n  mraid.getResizeProperties = function() {\n    var properties = {\n      width: resizeProperties.width,\n      height: resizeProperties.height,\n      offsetX: resizeProperties.offsetX,\n      offsetY: resizeProperties.offsetY,\n      customClosePosition: resizeProperties.customClosePosition,\n      allowOffscreen: resizeProperties.allowOffscreen\n    };\n    return properties;\n  };\n\n  mraid.setResizeProperties = function(properties) {\n    if (validate(properties, resizePropertyValidators, \'setResizeProperties\', true)) {\n\n      var desiredProperties = [\'width\', \'height\', \'offsetX\', \'offsetY\', \'customClosePosition\', \'allowOffscreen\'];\n\n      var length = desiredProperties.length;\n\n      for (var i = 0; i < length; i++) {\n        var propname = desiredProperties[i];\n        if (properties.hasOwnProperty(propname)) {\n          resizeProperties[propname] = properties[propname];\n        }\n      }\n    }\n  };\n\n  var CalendarEventParser = {\n    initialize: function(parameters) {\n      this.parameters = parameters;\n      this.errors = [];\n      this.arguments = [\'createCalendarEvent\'];\n    },\n\n    parse: function() {\n      if (!this.parameters) {\n        this.errors.push(\'The object passed to createCalendarEvent cannot be null.\');\n      } else {\n        this.parseDescription();\n        this.parseLocation();\n        this.parseSummary();\n        this.parseStartAndEndDates();\n        this.parseReminder();\n        this.parseRecurrence();\n        this.parseTransparency();\n      }\n\n      var errorCount = this.errors.length;\n      if (errorCount) {\n        this.arguments.length = 0;\n      }\n\n      return (errorCount === 0);\n    },\n\n    parseDescription: function() {\n      this._processStringValue(\'description\');\n    },\n\n    parseLocation: function() {\n      this._processStringValue(\'location\');\n    },\n\n    parseSummary: function() {\n      this._processStringValue(\'summary\');\n    },\n\n    parseStartAndEndDates: function() {\n      this._processDateValue(\'start\');\n      this._processDateValue(\'end\');\n    },\n\n    parseReminder: function() {\n      var reminder = this._getParameter(\'reminder\');\n      if (!reminder) {\n        return;\n      }\n\n      if (reminder < 0) {\n        this.arguments.push(\'relativeReminder\');\n        this.arguments.push(parseInt(reminder) / 1000);\n      } else {\n        this.arguments.push(\'absoluteReminder\');\n        this.arguments.push(reminder);\n      }\n    },\n\n    parseRecurrence: function() {\n      var recurrenceDict = this._getParameter(\'recurrence\');\n      if (!recurrenceDict) {\n        return;\n      }\n\n      this.parseRecurrenceInterval(recurrenceDict);\n      this.parseRecurrenceFrequency(recurrenceDict);\n      this.parseRecurrenceEndDate(recurrenceDict);\n      this.parseRecurrenceArrayValue(recurrenceDict, \'daysInWeek\');\n      this.parseRecurrenceArrayValue(recurrenceDict, \'daysInMonth\');\n      this.parseRecurrenceArrayValue(recurrenceDict, \'daysInYear\');\n      this.parseRecurrenceArrayValue(recurrenceDict, \'monthsInYear\');\n    },\n\n    parseTransparency: function() {\n      var validValues = [\'opaque\', \'transparent\'];\n\n      if (this.parameters.hasOwnProperty(\'transparency\')) {\n        var transparency = this.parameters.transparency;\n        if (contains(transparency, validValues)) {\n          this.arguments.push(\'transparency\');\n          this.arguments.push(transparency);\n        } else {\n          this.errors.push(\'transparency must be opaque or transparent\');\n        }\n      }\n    },\n\n    parseRecurrenceArrayValue: function(recurrenceDict, kind) {\n      if (recurrenceDict.hasOwnProperty(kind)) {\n        var array = recurrenceDict[kind];\n        if (!array || !(array instanceof Array)) {\n          this.errors.push(kind + \' must be an array.\');\n        } else {\n          var arrayStr = array.join(\',\');\n          this.arguments.push(kind);\n          this.arguments.push(arrayStr);\n        }\n      }\n    },\n\n    parseRecurrenceInterval: function(recurrenceDict) {\n      if (recurrenceDict.hasOwnProperty(\'interval\')) {\n        var interval = recurrenceDict.interval;\n        if (!interval) {\n          this.errors.push(\'Recurrence interval cannot be null.\');\n        } else {\n          this.arguments.push(\'interval\');\n          this.arguments.push(interval);\n        }\n      } else {\n        // If a recurrence rule was specified without an interval, use a default value of 1.\n        this.arguments.push(\'interval\');\n        this.arguments.push(1);\n      }\n    },\n\n    parseRecurrenceFrequency: function(recurrenceDict) {\n      if (recurrenceDict.hasOwnProperty(\'frequency\')) {\n        var frequency = recurrenceDict.frequency;\n        var validFrequencies = [\'daily\', \'weekly\', \'monthly\', \'yearly\'];\n        if (contains(frequency, validFrequencies)) {\n          this.arguments.push(\'frequency\');\n          this.arguments.push(frequency);\n        } else {\n          this.errors.push(\'Recurrence frequency must be one of: \"daily\", \"weekly\", \"monthly\", \"yearly\".\');\n        }\n      }\n    },\n\n    parseRecurrenceEndDate: function(recurrenceDict) {\n      var expires = recurrenceDict.expires;\n\n      if (!expires) {\n        return;\n      }\n\n      this.arguments.push(\'expires\');\n      this.arguments.push(expires);\n    },\n\n    _getParameter: function(key) {\n      if (this.parameters.hasOwnProperty(key)) {\n        return this.parameters[key];\n      }\n\n      return null;\n    },\n\n    _processStringValue: function(kind) {\n      if (this.parameters.hasOwnProperty(kind)) {\n        var value = this.parameters[kind];\n        this.arguments.push(kind);\n        this.arguments.push(value);\n      }\n    },\n\n    _processDateValue: function(kind) {\n      if (this.parameters.hasOwnProperty(kind)) {\n        var dateString = this._getParameter(kind);\n        this.arguments.push(kind);\n        this.arguments.push(dateString);\n      }\n    }\n  };\n}());\n"

    const-string v1, "(?m)^\\s+"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "(?m)^//.*(?=\\n)"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mraid/MraidBridge;->b:Ljava/lang/String;

    .line 267
    new-instance v0, Lcom/mopub/mraid/MraidBridge$5;

    invoke-direct {v0, p0}, Lcom/mopub/mraid/MraidBridge$5;-><init>(Lcom/mopub/mraid/MraidBridge;)V

    iput-object v0, p0, Lcom/mopub/mraid/MraidBridge;->i:Landroid/webkit/WebViewClient;

    .line 96
    iput-object p1, p0, Lcom/mopub/mraid/MraidBridge;->a:Lcom/mopub/common/AdReport;

    .line 97
    iput-object p2, p0, Lcom/mopub/mraid/MraidBridge;->c:Lcom/mopub/mraid/PlacementType;

    .line 98
    iput-object p3, p0, Lcom/mopub/mraid/MraidBridge;->d:Lcom/mopub/mraid/MraidNativeCommandHandler;

    .line 99
    return-void
.end method

.method private static a(II)I
    .locals 3

    .prologue
    .line 490
    if-lt p0, p1, :cond_0

    const v0, 0x186a0

    if-le p0, v0, :cond_1

    .line 491
    :cond_0
    new-instance v0, Lcom/mopub/mraid/h;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Integer parameter out of range: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v0

    .line 493
    :cond_1
    return p0
.end method

.method static synthetic a(Lcom/mopub/mraid/MraidBridge;)Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    return-object v0
.end method

.method private static a(Landroid/graphics/Rect;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 561
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Landroid/graphics/Rect;->left:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/mopub/mraid/MraidBridge;Lcom/mopub/mraid/MraidJavascriptCommand;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1, p2}, Lcom/mopub/mraid/MraidBridge;->a(Lcom/mopub/mraid/MraidJavascriptCommand;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/mopub/mraid/MraidJavascriptCommand;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "window.mraidbridge.notifyErrorEvent("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mopub/mraid/MraidJavascriptCommand;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/mraid/MraidBridge;->a(Ljava/lang/String;)V

    .line 225
    return-void
.end method

.method static synthetic a(Lcom/mopub/mraid/MraidBridge;Z)Z
    .locals 0

    .prologue
    .line 41
    iput-boolean p1, p0, Lcom/mopub/mraid/MraidBridge;->g:Z

    return p1
.end method

.method private static a(Ljava/lang/String;Z)Z
    .locals 0

    .prologue
    .line 498
    if-nez p0, :cond_0

    .line 501
    :goto_0
    return p1

    :cond_0
    invoke-static {p0}, Lcom/mopub/mraid/MraidBridge;->d(Ljava/lang/String;)Z

    move-result p1

    goto :goto_0
.end method

.method private static b(Landroid/graphics/Rect;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 566
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/mopub/mraid/MraidBridge;)Z
    .locals 1

    .prologue
    .line 41
    iget-boolean v0, p0, Lcom/mopub/mraid/MraidBridge;->g:Z

    return v0
.end method

.method private static c(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 470
    const/16 v0, 0xa

    :try_start_0
    invoke-static {p0, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 474
    return v0

    .line 472
    :catch_0
    move-exception v0

    new-instance v0, Lcom/mopub/mraid/h;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid numeric parameter: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic c(Lcom/mopub/mraid/MraidBridge;)V
    .locals 1

    .prologue
    .line 41
    .line 5355
    iget-boolean v0, p0, Lcom/mopub/mraid/MraidBridge;->h:Z

    if-nez v0, :cond_0

    .line 5359
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mraid/MraidBridge;->h:Z

    .line 5360
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    if-eqz v0, :cond_0

    .line 5361
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    invoke-interface {v0}, Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;->onPageLoaded()V

    .line 41
    :cond_0
    return-void
.end method

.method private static d(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 505
    const-string v0, "true"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 506
    const/4 v0, 0x1

    .line 508
    :goto_0
    return v0

    .line 507
    :cond_0
    const-string v0, "false"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 508
    const/4 v0, 0x0

    goto :goto_0

    .line 510
    :cond_1
    new-instance v0, Lcom/mopub/mraid/h;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid boolean parameter: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static e(Ljava/lang/String;)Ljava/net/URI;
    .locals 3

    .prologue
    .line 524
    if-nez p0, :cond_0

    .line 525
    new-instance v0, Lcom/mopub/mraid/h;

    const-string v1, "Parameter cannot be null"

    invoke-direct {v0, v1}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v0

    .line 528
    :cond_0
    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 530
    :catch_0
    move-exception v0

    new-instance v0, Lcom/mopub/mraid/h;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid URL parameter: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method final a()V
    .locals 1

    .prologue
    .line 188
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    .line 189
    return-void
.end method

.method final a(Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    .line 103
    return-void
.end method

.method final a(Lcom/mopub/mraid/MraidBridge$MraidWebView;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 106
    iput-object p1, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    .line 107
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 109
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "javascript:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mopub/mraid/MraidBridge;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->loadUrl(Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    invoke-virtual {v0, v3}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->setScrollContainer(Z)V

    .line 111
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    invoke-virtual {v0, v3}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->setVerticalScrollBarEnabled(Z)V

    .line 112
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    invoke-virtual {v0, v3}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->setHorizontalScrollBarEnabled(Z)V

    .line 113
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->setBackgroundColor(I)V

    .line 115
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    iget-object v1, p0, Lcom/mopub/mraid/MraidBridge;->i:Landroid/webkit/WebViewClient;

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 117
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    new-instance v1, Lcom/mopub/mraid/b;

    invoke-direct {v1, p0}, Lcom/mopub/mraid/b;-><init>(Lcom/mopub/mraid/MraidBridge;)V

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 141
    new-instance v0, Lcom/mopub/mobileads/ViewGestureDetector;

    iget-object v1, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    invoke-virtual {v1}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    iget-object v3, p0, Lcom/mopub/mraid/MraidBridge;->a:Lcom/mopub/common/AdReport;

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/mobileads/ViewGestureDetector;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/mopub/common/AdReport;)V

    .line 143
    new-instance v1, Lcom/mopub/mraid/c;

    invoke-direct {v1, p0}, Lcom/mopub/mraid/c;-><init>(Lcom/mopub/mraid/MraidBridge;)V

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/ViewGestureDetector;->setUserClickListener(Lcom/mopub/mobileads/ViewGestureDetector$UserClickListener;)V

    .line 160
    iget-object v1, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    new-instance v2, Lcom/mopub/mraid/d;

    invoke-direct {v2, p0, v0}, Lcom/mopub/mraid/d;-><init>(Lcom/mopub/mraid/MraidBridge;Lcom/mopub/mobileads/ViewGestureDetector;)V

    invoke-virtual {v1, v2}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 177
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    new-instance v1, Lcom/mopub/mraid/e;

    invoke-direct {v1, p0}, Lcom/mopub/mraid/e;-><init>(Lcom/mopub/mraid/MraidBridge;)V

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->a(Lcom/mopub/mraid/MraidBridge$MraidWebView$OnVisibilityChangedListener;)V

    .line 185
    return-void
.end method

.method final a(Lcom/mopub/mraid/PlacementType;)V
    .locals 3

    .prologue
    .line 541
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mraidbridge.setPlacementType("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 5010
    invoke-virtual {p1}, Lcom/mopub/mraid/PlacementType;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 541
    invoke-static {v1}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/mraid/MraidBridge;->a(Ljava/lang/String;)V

    .line 544
    return-void
.end method

.method final a(Lcom/mopub/mraid/ViewState;)V
    .locals 2

    .prologue
    .line 547
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mraidbridge.setState("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mopub/mraid/ViewState;->toJavascriptString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/mraid/MraidBridge;->a(Ljava/lang/String;)V

    .line 550
    return-void
.end method

.method final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 212
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    if-nez v0, :cond_0

    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Attempted to inject Javascript into MRAID WebView while was not attached:\n\t"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 219
    :goto_0
    return-void

    .line 217
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Injecting Javascript into MRAID WebView:\n\t"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->v(Ljava/lang/String;)V

    .line 218
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "javascript:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method

.method final a(Z)V
    .locals 2

    .prologue
    .line 535
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mraidbridge.setIsViewable("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/mraid/MraidBridge;->a(Ljava/lang/String;)V

    .line 538
    return-void
.end method

.method final a(ZZZZZ)V
    .locals 2

    .prologue
    .line 554
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mraidbridge.setSupports("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/mraid/MraidBridge;->a(Ljava/lang/String;)V

    .line 557
    return-void
.end method

.method final b()V
    .locals 1

    .prologue
    .line 585
    const-string v0, "mraidbridge.notifyReadyEvent();"

    invoke-virtual {p0, v0}, Lcom/mopub/mraid/MraidBridge;->a(Ljava/lang/String;)V

    .line 586
    return-void
.end method

.method final b(Ljava/lang/String;)Z
    .locals 10
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v7, 0x1

    const/4 v0, 0x0

    .line 289
    :try_start_0
    new-instance v2, Ljava/net/URI;

    invoke-direct {v2, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 297
    invoke-virtual {v2}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v3

    .line 298
    invoke-virtual {v2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v4

    .line 300
    const-string v5, "mopub"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 301
    const-string v0, "failLoad"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->c:Lcom/mopub/mraid/PlacementType;

    sget-object v1, Lcom/mopub/mraid/PlacementType;->INLINE:Lcom/mopub/mraid/PlacementType;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    invoke-interface {v0}, Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;->onPageFailedToLoad()V

    :cond_0
    move v0, v7

    .line 346
    :cond_1
    :goto_0
    return v0

    .line 291
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid MRAID URL: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    .line 292
    sget-object v0, Lcom/mopub/mraid/MraidJavascriptCommand;->UNSPECIFIED:Lcom/mopub/mraid/MraidJavascriptCommand;

    const-string v1, "Mraid command sent an invalid URL"

    invoke-direct {p0, v0, v1}, Lcom/mopub/mraid/MraidBridge;->a(Lcom/mopub/mraid/MraidJavascriptCommand;Ljava/lang/String;)V

    move v0, v7

    .line 293
    goto :goto_0

    .line 309
    :cond_2
    const-string v5, "mraid"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    .line 310
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 311
    const-string v0, "UTF-8"

    invoke-static {v2, v0}, Lorg/apache/http/client/utils/URLEncodedUtils;->parse(Ljava/net/URI;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/NameValuePair;

    .line 312
    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 314
    :cond_3
    invoke-static {v4}, Lcom/mopub/mraid/MraidJavascriptCommand;->a(Ljava/lang/String;)Lcom/mopub/mraid/MraidJavascriptCommand;

    move-result-object v8

    .line 1369
    :try_start_1
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->c:Lcom/mopub/mraid/PlacementType;

    invoke-virtual {v8, v0}, Lcom/mopub/mraid/MraidJavascriptCommand;->a(Lcom/mopub/mraid/PlacementType;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/mopub/mraid/MraidBridge;->g:Z

    if-nez v0, :cond_4

    .line 1370
    new-instance v0, Lcom/mopub/mraid/h;

    const-string v1, "Cannot execute this command unless the user clicks"

    invoke-direct {v0, v1}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Lcom/mopub/mraid/h; {:try_start_1 .. :try_end_1} :catch_1

    .line 317
    :catch_1
    move-exception v0

    .line 318
    invoke-virtual {v0}, Lcom/mopub/mraid/h;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v8, v0}, Lcom/mopub/mraid/MraidBridge;->a(Lcom/mopub/mraid/MraidJavascriptCommand;Ljava/lang/String;)V

    .line 4228
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "window.mraidbridge.nativeCallComplete("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Lcom/mopub/mraid/MraidJavascriptCommand;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/mraid/MraidBridge;->a(Ljava/lang/String;)V

    move v0, v7

    .line 321
    goto/16 :goto_0

    .line 1373
    :cond_4
    :try_start_2
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    if-nez v0, :cond_5

    .line 1374
    new-instance v0, Lcom/mopub/mraid/h;

    const-string v1, "Invalid state to execute this command"

    invoke-direct {v0, v1}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1377
    :cond_5
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    if-nez v0, :cond_6

    .line 1378
    new-instance v0, Lcom/mopub/mraid/h;

    const-string v1, "The current WebView is being destroyed"

    invoke-direct {v0, v1}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1381
    :cond_6
    sget-object v0, Lcom/mopub/mraid/g;->a:[I

    invoke-virtual {v8}, Lcom/mopub/mraid/MraidJavascriptCommand;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 1383
    :pswitch_0
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    invoke-interface {v0}, Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;->onClose()V

    goto :goto_2

    .line 1387
    :pswitch_1
    const-string v0, "width"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBridge;->c(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mopub/mraid/MraidBridge;->a(II)I

    move-result v1

    .line 1388
    const-string v0, "height"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBridge;->c(Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/mopub/mraid/MraidBridge;->a(II)I

    move-result v2

    .line 1389
    const-string v0, "offsetX"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBridge;->c(Ljava/lang/String;)I

    move-result v0

    const v3, -0x186a0

    invoke-static {v0, v3}, Lcom/mopub/mraid/MraidBridge;->a(II)I

    move-result v3

    .line 1390
    const-string v0, "offsetY"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBridge;->c(Ljava/lang/String;)I

    move-result v0

    const v4, -0x186a0

    invoke-static {v0, v4}, Lcom/mopub/mraid/MraidBridge;->a(II)I

    move-result v4

    .line 1391
    const-string v0, "customClosePosition"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v5, Lcom/mopub/common/CloseableLayout$ClosePosition;->TOP_RIGHT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    .line 1444
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 1393
    :goto_3
    const-string v0, "allowOffscreen"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v6, 0x1

    invoke-static {v0, v6}, Lcom/mopub/mraid/MraidBridge;->a(Ljava/lang/String;Z)Z

    move-result v6

    .line 1394
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    invoke-interface/range {v0 .. v6}, Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;->onResize(IIIILcom/mopub/common/CloseableLayout$ClosePosition;Z)V

    goto/16 :goto_2

    .line 1448
    :cond_7
    const-string v5, "top-left"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 1449
    sget-object v5, Lcom/mopub/common/CloseableLayout$ClosePosition;->TOP_LEFT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    goto :goto_3

    .line 1450
    :cond_8
    const-string v5, "top-right"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 1451
    sget-object v5, Lcom/mopub/common/CloseableLayout$ClosePosition;->TOP_RIGHT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    goto :goto_3

    .line 1452
    :cond_9
    const-string v5, "center"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 1453
    sget-object v5, Lcom/mopub/common/CloseableLayout$ClosePosition;->CENTER:Lcom/mopub/common/CloseableLayout$ClosePosition;

    goto :goto_3

    .line 1454
    :cond_a
    const-string v5, "bottom-left"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 1455
    sget-object v5, Lcom/mopub/common/CloseableLayout$ClosePosition;->BOTTOM_LEFT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    goto :goto_3

    .line 1456
    :cond_b
    const-string v5, "bottom-right"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 1457
    sget-object v5, Lcom/mopub/common/CloseableLayout$ClosePosition;->BOTTOM_RIGHT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    goto :goto_3

    .line 1458
    :cond_c
    const-string v5, "top-center"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 1459
    sget-object v5, Lcom/mopub/common/CloseableLayout$ClosePosition;->TOP_CENTER:Lcom/mopub/common/CloseableLayout$ClosePosition;

    goto :goto_3

    .line 1460
    :cond_d
    const-string v5, "bottom-center"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 1461
    sget-object v5, Lcom/mopub/common/CloseableLayout$ClosePosition;->BOTTOM_CENTER:Lcom/mopub/common/CloseableLayout$ClosePosition;

    goto :goto_3

    .line 1463
    :cond_e
    new-instance v1, Lcom/mopub/mraid/h;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid close position: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1398
    :pswitch_2
    const-string v0, "url"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1516
    if-nez v0, :cond_f

    .line 1399
    :goto_4
    const-string v0, "shouldUseCustomClose"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/mopub/mraid/MraidBridge;->a(Ljava/lang/String;Z)Z

    move-result v0

    .line 1401
    iget-object v2, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    invoke-interface {v2, v1, v0}, Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;->onExpand(Ljava/net/URI;Z)V

    goto/16 :goto_2

    .line 1519
    :cond_f
    invoke-static {v0}, Lcom/mopub/mraid/MraidBridge;->e(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    move-object v1, v0

    goto :goto_4

    .line 1404
    :pswitch_3
    const-string v0, "shouldUseCustomClose"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mopub/mraid/MraidBridge;->a(Ljava/lang/String;Z)Z

    move-result v0

    .line 1405
    iget-object v1, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    invoke-interface {v1, v0}, Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;->onUseCustomClose(Z)V

    goto/16 :goto_2

    .line 1408
    :pswitch_4
    const-string v0, "url"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBridge;->e(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    .line 1409
    iget-object v1, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    invoke-interface {v1, v0}, Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;->onOpen(Ljava/net/URI;)V

    goto/16 :goto_2

    .line 1412
    :pswitch_5
    const-string v0, "allowOrientationChange"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBridge;->d(Ljava/lang/String;)Z

    move-result v1

    .line 1413
    const-string v0, "forceOrientation"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2478
    const-string v2, "portrait"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 2479
    sget-object v0, Lcom/mopub/mraid/ag;->PORTRAIT:Lcom/mopub/mraid/ag;

    .line 1415
    :goto_5
    iget-object v2, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    invoke-interface {v2, v1, v0}, Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;->onSetOrientationProperties(ZLcom/mopub/mraid/ag;)V

    goto/16 :goto_2

    .line 2480
    :cond_10
    const-string v2, "landscape"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 2481
    sget-object v0, Lcom/mopub/mraid/ag;->LANDSCAPE:Lcom/mopub/mraid/ag;

    goto :goto_5

    .line 2482
    :cond_11
    const-string v2, "none"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 2483
    sget-object v0, Lcom/mopub/mraid/ag;->NONE:Lcom/mopub/mraid/ag;

    goto :goto_5

    .line 2485
    :cond_12
    new-instance v1, Lcom/mopub/mraid/h;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid orientation: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1419
    :pswitch_6
    const-string v0, "uri"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBridge;->e(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    .line 1420
    iget-object v1, p0, Lcom/mopub/mraid/MraidBridge;->e:Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;

    invoke-interface {v1, v0}, Lcom/mopub/mraid/MraidBridge$MraidBridgeListener;->onPlayVideo(Ljava/net/URI;)V

    goto/16 :goto_2

    .line 1423
    :pswitch_7
    const-string v0, "uri"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBridge;->e(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    .line 1424
    iget-object v1, p0, Lcom/mopub/mraid/MraidBridge;->d:Lcom/mopub/mraid/MraidNativeCommandHandler;

    iget-object v2, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    invoke-virtual {v2}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lcom/mopub/mraid/f;

    invoke-direct {v3, p0, v8}, Lcom/mopub/mraid/f;-><init>(Lcom/mopub/mraid/MraidBridge;Lcom/mopub/mraid/MraidJavascriptCommand;)V

    .line 3113
    invoke-static {v2}, Lcom/mopub/mraid/MraidNativeCommandHandler;->isStorePictureSupported(Landroid/content/Context;)Z

    move-result v4

    if-nez v4, :cond_13

    .line 3114
    const-string v0, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 3116
    new-instance v0, Lcom/mopub/mraid/h;

    const-string v1, "Error downloading file  - the device does not have an SD card mounted, or the Android permission is not granted."

    invoke-direct {v0, v1}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3121
    :cond_13
    instance-of v4, v2, Landroid/app/Activity;

    if-eqz v4, :cond_14

    .line 3427
    new-instance v4, Landroid/app/AlertDialog$Builder;

    invoke-direct {v4, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 3428
    const-string v5, "Save Image"

    invoke-virtual {v4, v5}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v4

    const-string v5, "Download image to Picture gallery?"

    invoke-virtual {v4, v5}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v4

    const-string v5, "Cancel"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v4

    const-string v5, "Okay"

    new-instance v6, Lcom/mopub/mraid/ab;

    invoke-direct {v6, v1, v2, v0, v3}, Lcom/mopub/mraid/ab;-><init>(Lcom/mopub/mraid/MraidNativeCommandHandler;Landroid/content/Context;Ljava/lang/String;Lcom/mopub/mraid/af;)V

    invoke-virtual {v4, v5, v6}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_2

    .line 3124
    :cond_14
    const-string v4, "Downloading image to Picture gallery..."

    const/4 v5, 0x0

    invoke-static {v2, v4, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    .line 3125
    invoke-virtual {v1, v2, v0, v3}, Lcom/mopub/mraid/MraidNativeCommandHandler;->a(Landroid/content/Context;Ljava/lang/String;Lcom/mopub/mraid/af;)V

    goto/16 :goto_2

    .line 1434
    :pswitch_8
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v6}, Lcom/mopub/mraid/MraidNativeCommandHandler;->a(Landroid/content/Context;Ljava/util/Map;)V

    goto/16 :goto_2

    .line 1437
    :pswitch_9
    new-instance v0, Lcom/mopub/mraid/h;

    const-string v1, "Unspecified MRAID Javascript command"

    invoke-direct {v0, v1}, Lcom/mopub/mraid/h;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Lcom/mopub/mraid/h; {:try_start_2 .. :try_end_2} :catch_1

    .line 327
    :cond_15
    iget-boolean v1, p0, Lcom/mopub/mraid/MraidBridge;->g:Z

    if-eqz v1, :cond_1

    .line 328
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 329
    const-string v2, "android.intent.action.VIEW"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 330
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 331
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 334
    :try_start_3
    iget-object v2, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    if-nez v2, :cond_16

    .line 335
    const-string v1, "WebView was detached. Unable to load a URL"

    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    move v0, v7

    .line 336
    goto/16 :goto_0

    .line 338
    :cond_16
    iget-object v2, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    invoke-virtual {v2}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_3
    .catch Landroid/content/ActivityNotFoundException; {:try_start_3 .. :try_end_3} :catch_2

    move v0, v7

    .line 339
    goto/16 :goto_0

    .line 341
    :catch_2
    move-exception v1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No activity found to handle this URL "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1381
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method final c()Z
    .locals 1

    .prologue
    .line 593
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final d()Z
    .locals 1

    .prologue
    .line 597
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final e()Z
    .locals 1

    .prologue
    .line 601
    iget-boolean v0, p0, Lcom/mopub/mraid/MraidBridge;->h:Z

    return v0
.end method

.method public notifyScreenMetrics(Lcom/mopub/mraid/ah;)V
    .locals 2

    .prologue
    .line 570
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mraidbridge.setScreenSize("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mopub/mraid/ah;->a()Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {v1}, Lcom/mopub/mraid/MraidBridge;->b(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ");mraidbridge.setMaxSize("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/mopub/mraid/ah;->c()Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {v1}, Lcom/mopub/mraid/MraidBridge;->b(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ");mraidbridge.setCurrentPosition("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/mopub/mraid/ah;->e()Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {v1}, Lcom/mopub/mraid/MraidBridge;->a(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ");mraidbridge.setDefaultPosition("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/mopub/mraid/ah;->g()Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {v1}, Lcom/mopub/mraid/MraidBridge;->a(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/mraid/MraidBridge;->a(Ljava/lang/String;)V

    .line 579
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mraidbridge.notifySizeChangeEvent("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mopub/mraid/ah;->d()Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {v1}, Lcom/mopub/mraid/MraidBridge;->b(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/mopub/mraid/MraidBridge;->a(Ljava/lang/String;)V

    .line 582
    return-void
.end method

.method public setContentHtml(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 192
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    if-nez v0, :cond_0

    .line 193
    const-string v0, "MRAID bridge called setContentHtml before WebView was attached"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 199
    :goto_0
    return-void

    .line 197
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mopub/mraid/MraidBridge;->h:Z

    .line 198
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    const-string v3, "text/html"

    const-string v4, "UTF-8"

    move-object v2, p1

    move-object v5, v1

    invoke-virtual/range {v0 .. v5}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setContentUrl(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    if-nez v0, :cond_0

    .line 203
    const-string v0, "MRAID bridge called setContentHtml while WebView was not attached"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 209
    :goto_0
    return-void

    .line 207
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mopub/mraid/MraidBridge;->h:Z

    .line 208
    iget-object v0, p0, Lcom/mopub/mraid/MraidBridge;->f:Lcom/mopub/mraid/MraidBridge$MraidWebView;

    invoke-virtual {v0, p1}, Lcom/mopub/mraid/MraidBridge$MraidWebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method
