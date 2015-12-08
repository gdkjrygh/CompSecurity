// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.content.SharedPreferences;
import com.worklight.common.Logger;
import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LoggerPlugin extends CordovaPlugin
{

    private static final String ACTION_AUTO_TRIGGER = "processAutomaticTrigger";
    private static final String ACTION_GET_STATUS = "getStatus";
    private static final String ACTION_LOG = "log";
    private static final String ACTION_SEND = "send";
    private static final String ACTION_SEND_ANALYTICS = "sendAnalytics";
    private static final String ACTION_SET_NATIVE_OPTIONS = "setNativeOptions";
    private static final String ACTION_UPDATE_CONFIG_FROM_SERVER = "updateConfigFromServer";
    private static final String KEY_analyticsCapture = "analyticsCapture";
    private static final String KEY_autoSendLogs = "autoSendLogs";
    private static final String KEY_capture = "capture";
    private static final String KEY_captureFromServer = "captureFromServer";
    private static final String KEY_filters = "filters";
    private static final String KEY_filtersFromServer = "filtersFromServer";
    private static final String KEY_level = "level";
    private static final String KEY_levelFromServer = "levelFromServer";
    private static final String KEY_maxFileSize = "maxFileSize";
    protected static final Object WAIT_LOCK = new Object();
    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/plugin/LoggerPlugin.getName());

    public LoggerPlugin()
    {
    }

    private JSONObject getCurrentConfiguration()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("maxFileSize", Logger.getMaxFileSize());
        jsonobject.put("level", Logger.getLevel().toString());
        jsonobject.put("levelFromServer", cordova.getActivity().getSharedPreferences(Logger.SHARED_PREF_KEY, 0).getString("levelFromServer", jsonobject.getString("level")));
        jsonobject.put("capture", Boolean.toString(Logger.getCapture()));
        jsonobject.put("captureFromServer", Boolean.toString(cordova.getActivity().getSharedPreferences(Logger.SHARED_PREF_KEY, 0).getBoolean("logPersistenceFromServer", Logger.getCapture())));
        jsonobject.put("analyticsCapture", Boolean.toString(Logger.getAnalyticsCapture()));
        jsonobject.put("filters", Logger.HashMapToJSONObject(Logger.getFilters()));
        jsonobject.put("filtersFromServer", cordova.getActivity().getSharedPreferences(Logger.SHARED_PREF_KEY, 0).getString("filtersFromServer", jsonobject.get("filters").toString()));
        return jsonobject;
    }

    public boolean execute(final String action, final JSONArray args, final CallbackContext callbackContext)
    {
        cordova.getThreadPool().execute(new Runnable() {

            final LoggerPlugin this$0;
            final String val$action;
            final JSONArray val$args;
            final CallbackContext val$callbackContext;

            public void run()
            {
                if (!action.equals("send")) goto _L2; else goto _L1
_L1:
                Logger.send(new WLRequestListener() {

                    final _cls1 this$1;

                    public void onFailure(WLFailResponse wlfailresponse)
                    {
                        callbackContext.error(wlfailresponse.getResponseText());
                    }

                    public void onSuccess(WLResponse wlresponse)
                    {
                        callbackContext.success();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
_L24:
                synchronized (LoggerPlugin.WAIT_LOCK)
                {
                    LoggerPlugin.WAIT_LOCK.notifyAll();
                }
                return;
_L2:
                Object obj2;
                if (action.equals("updateConfigFromServer"))
                {
                    Logger.updateConfigFromServer();
                    callbackContext.success();
                    continue; /* Loop/switch isn't completed */
                }
                if (action.equals("sendAnalytics"))
                {
                    Logger.sendAnalytics(new WLRequestListener() {

                        final _cls1 this$1;

                        public void onFailure(WLFailResponse wlfailresponse)
                        {
                            callbackContext.error(wlfailresponse.getResponseText());
                        }

                        public void onSuccess(WLResponse wlresponse)
                        {
                            callbackContext.success();
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    continue; /* Loop/switch isn't completed */
                }
                if (action.equals("processAutomaticTrigger"))
                {
                    Logger.processAutomaticTrigger();
                    callbackContext.success();
                    continue; /* Loop/switch isn't completed */
                }
                if (!action.equals("setNativeOptions"))
                {
                    break MISSING_BLOCK_LABEL_706;
                }
                obj = null;
                obj2 = new JSONObject();
                Object obj1 = args.getJSONObject(0);
                obj2 = obj1;
_L9:
                obj1 = obj;
                if (!((JSONObject) (obj2)).has("maxFileSize"))
                {
                    break MISSING_BLOCK_LABEL_169;
                }
                Logger.setMaxFileSize(((JSONObject) (obj2)).getInt("maxFileSize"));
                obj1 = obj;
_L10:
                obj = obj1;
                if (!((JSONObject) (obj2)).has("level"))
                {
                    break MISSING_BLOCK_LABEL_197;
                }
                Logger.setLevel(com.worklight.common.Logger.LEVEL.fromString(((JSONObject) (obj2)).getString("level").toUpperCase()));
                obj = obj1;
_L11:
                if (!((JSONObject) (obj2)).has("levelFromServer")) goto _L4; else goto _L3
_L3:
                cordova.getActivity().getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().putString("levelFromServer", ((JSONObject) (obj2)).getString("levelFromServer").toUpperCase()).commit();
_L12:
                obj1 = obj;
                if (!((JSONObject) (obj2)).has("capture"))
                {
                    break MISSING_BLOCK_LABEL_274;
                }
                Logger.setCapture(((JSONObject) (obj2)).getBoolean("capture"));
                obj1 = obj;
_L13:
                if (!((JSONObject) (obj2)).has("captureFromServer")) goto _L6; else goto _L5
_L5:
                cordova.getActivity().getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().putBoolean("logPersistenceFromServer", ((JSONObject) (obj2)).getBoolean("captureFromServer")).commit();
_L14:
                obj = obj1;
                if (!((JSONObject) (obj2)).has("analyticsCapture"))
                {
                    break MISSING_BLOCK_LABEL_348;
                }
                Logger.setAnalyticsCapture(((JSONObject) (obj2)).getBoolean("analyticsCapture"));
                obj = obj1;
_L15:
                obj1 = obj;
                if (!((JSONObject) (obj2)).has("filters"))
                {
                    break MISSING_BLOCK_LABEL_373;
                }
                Logger.setFilters(Logger.JSONObjectToHashMap(((JSONObject) (obj2)).getJSONObject("filters")));
                obj1 = obj;
_L16:
                if (!((JSONObject) (obj2)).has("filtersFromServer")) goto _L8; else goto _L7
_L7:
                obj = Logger.HashMapToJSONObject(Logger.JSONObjectToHashMap(((JSONObject) (obj2)).getJSONObject("filtersFromServer")));
                cordova.getActivity().getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().putString("filtersFromServer", ((JSONObject) (obj)).toString()).commit();
_L17:
                obj = obj1;
                if (!((JSONObject) (obj2)).has("autoSendLogs"))
                {
                    break MISSING_BLOCK_LABEL_458;
                }
                Logger.setAutoSendLogs(((JSONObject) (obj2)).getBoolean("autoSendLogs"));
                obj = obj1;
_L18:
                if (obj != null)
                {
                    obj1 = (new StringBuilder()).append("Could not parse parameter(s) for action 'setNativeOptions'.  Array is ").append(args.toString()).toString();
                    LoggerPlugin.logger.error(((String) (obj1)), ((Throwable) (obj)));
                }
                try
                {
                    callbackContext.success(getCurrentConfiguration());
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    callbackContext.error((new StringBuilder()).append("Could not create object with current settings due to: ").append(((JSONException) (obj)).getLocalizedMessage()).toString());
                }
                continue; /* Loop/switch isn't completed */
                obj;
                  goto _L9
                obj1;
                  goto _L10
                obj;
                  goto _L11
_L4:
                try
                {
                    cordova.getActivity().getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().remove("levelFromServer").commit();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
                  goto _L12
                obj1;
                  goto _L13
_L6:
                try
                {
                    cordova.getActivity().getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().remove("logPersistenceFromServer").commit();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
                  goto _L14
                obj;
                  goto _L15
                obj1;
                  goto _L16
_L8:
                try
                {
                    cordova.getActivity().getSharedPreferences(Logger.SHARED_PREF_KEY, 0).edit().remove("filtersFromServer").commit();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
                  goto _L17
                obj;
                  goto _L18
                Object obj3;
                Object obj4;
                com.worklight.common.Logger.LEVEL level;
                long l;
                if (action.equals("getStatus"))
                {
                    try
                    {
                        callbackContext.success(getCurrentConfiguration());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        callbackContext.error((new StringBuilder()).append("Could not create object with current settings due to: ").append(((JSONException) (obj)).getLocalizedMessage()).toString());
                    }
                    continue; /* Loop/switch isn't completed */
                }
                if (!action.equals("log"))
                {
                    break MISSING_BLOCK_LABEL_1154;
                }
                level = com.worklight.common.Logger.LEVEL.TRACE;
                obj4 = null;
                obj2 = "";
                obj3 = new JSONObject();
                l = (new Date()).getTime();
                obj = level;
                String s = args.getString(0);
                obj1 = s;
                if (s == null)
                {
                    break MISSING_BLOCK_LABEL_861;
                }
                obj1 = s;
                obj = level;
                if (!s.startsWith("_"))
                {
                    break MISSING_BLOCK_LABEL_861;
                }
                obj = level;
                obj1 = s.substring(1);
                obj = level;
                obj1 = com.worklight.common.Logger.LEVEL.fromString(((String) (obj1)).toUpperCase());
                obj = obj1;
                if (obj1 != null)
                {
                    break MISSING_BLOCK_LABEL_886;
                }
                obj = obj1;
                obj1 = com.worklight.common.Logger.LEVEL.TRACE;
                obj = obj1;
_L19:
                JSONException jsonexception;
                long l1;
                try
                {
                    obj1 = args.getString(1);
                }
                catch (JSONException jsonexception1)
                {
                    LoggerPlugin.logger.error((new StringBuilder()).append("Could not parse element at index 1 for action 'log'.  Array is ").append(args.toString()).toString(), jsonexception1);
                    jsonexception1 = ((JSONException) (obj4));
                }
                obj4 = args.getString(2);
                obj2 = obj4;
_L20:
                obj4 = args.getJSONObject(3);
                obj3 = obj4;
_L21:
                l1 = args.getLong(4);
                l = l1;
_L22:
                Logger.getInstance(((String) (obj1))).doLog(((com.worklight.common.Logger.LEVEL) (obj)), ((String) (obj2)), l, ((JSONObject) (obj3)), null);
                callbackContext.success();
                continue; /* Loop/switch isn't completed */
                jsonexception;
                LoggerPlugin.logger.error((new StringBuilder()).append("Could not parse element at index 0 for action 'log'.  Array is ").append(args.toString()).toString(), jsonexception);
                  goto _L19
                JSONException jsonexception2;
                jsonexception2;
                LoggerPlugin.logger.error((new StringBuilder()).append("Could not parse element at index 2 for action 'log'.  Array is ").append(args.toString()).toString(), jsonexception2);
                  goto _L20
                jsonexception2;
                LoggerPlugin.logger.error((new StringBuilder()).append("Could not parse element at index 3 for action 'log'.  Array is ").append(args.toString()).toString(), jsonexception2);
                  goto _L21
                jsonexception2;
                LoggerPlugin.logger.error((new StringBuilder()).append("Could not parse element at index 4 for action 'log'.  Array is ").append(args.toString()).toString(), jsonexception2);
                  goto _L22
                callbackContext.error((new StringBuilder()).append("Invalid action: ").append(action).toString());
                if (true) goto _L24; else goto _L23
_L23:
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                this$0 = LoggerPlugin.this;
                action = s;
                callbackContext = callbackcontext;
                args = jsonarray;
                super();
            }
        });
        return true;
    }



}
