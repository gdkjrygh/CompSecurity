// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.text.ClipboardManager;
import android.text.format.DateFormat;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.Toast;
import com.worklight.androidgap.api.WL;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.common.WLSimpleDataSharing;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.api.WLClient;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginManager;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.plugin:
//            FIPSHttpPlugin, BusyIndicator

public class WLApp extends CordovaPlugin
{
    public static final class ACTION extends Enum
    {

        private static final ACTION $VALUES[];
        public static final ACTION broadcastNativeNotification;
        public static final ACTION clearHistory;
        public static final ACTION clearSessionCookies;
        public static final ACTION clearSharedToken;
        public static final ACTION copyToClipboard;
        public static final ACTION deleteCookie;
        public static final ACTION getAvailableSpace;
        public static final ACTION getCookies;
        public static final ACTION getDeviceLocale;
        public static final ACTION getInitParameters;
        public static final ACTION getSDKVersion;
        public static final ACTION getScreenHeight;
        public static final ACTION getScreenSize;
        public static final ACTION getScreenWidth;
        public static final ACTION getServerUrl;
        public static final ACTION getSharedToken;
        public static final ACTION getSkinPath;
        public static final ACTION openURL;
        public static final ACTION readUserPref;
        public static final ACTION reload;
        public static final ACTION reloadApp;
        public static final ACTION setCookie;
        public static final ACTION setServerUrl;
        public static final ACTION setSharedToken;
        public static final ACTION setWLClientConfig;
        public static final ACTION toast;
        public static final ACTION writeUserPref;

        public static ACTION fromString(String s)
        {
            try
            {
                s = valueOf(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        }

        public static ACTION valueOf(String s)
        {
            return (ACTION)Enum.valueOf(com/worklight/androidgap/plugin/WLApp$ACTION, s);
        }

        public static ACTION[] values()
        {
            return (ACTION[])$VALUES.clone();
        }

        static 
        {
            writeUserPref = new ACTION("writeUserPref", 0);
            readUserPref = new ACTION("readUserPref", 1);
            getSkinPath = new ACTION("getSkinPath", 2);
            getScreenHeight = new ACTION("getScreenHeight", 3);
            getScreenWidth = new ACTION("getScreenWidth", 4);
            getScreenSize = new ACTION("getScreenSize", 5);
            openURL = new ACTION("openURL", 6);
            getDeviceLocale = new ACTION("getDeviceLocale", 7);
            clearSessionCookies = new ACTION("clearSessionCookies", 8);
            copyToClipboard = new ACTION("copyToClipboard", 9);
            toast = new ACTION("toast", 10);
            clearHistory = new ACTION("clearHistory", 11);
            reload = new ACTION("reload", 12);
            getAvailableSpace = new ACTION("getAvailableSpace", 13);
            getInitParameters = new ACTION("getInitParameters", 14);
            reloadApp = new ACTION("reloadApp", 15);
            broadcastNativeNotification = new ACTION("broadcastNativeNotification", 16);
            setSharedToken = new ACTION("setSharedToken", 17);
            getSharedToken = new ACTION("getSharedToken", 18);
            clearSharedToken = new ACTION("clearSharedToken", 19);
            setWLClientConfig = new ACTION("setWLClientConfig", 20);
            setServerUrl = new ACTION("setServerUrl", 21);
            getServerUrl = new ACTION("getServerUrl", 22);
            getSDKVersion = new ACTION("getSDKVersion", 23);
            getCookies = new ACTION("getCookies", 24);
            setCookie = new ACTION("setCookie", 25);
            deleteCookie = new ACTION("deleteCookie", 26);
            $VALUES = (new ACTION[] {
                writeUserPref, readUserPref, getSkinPath, getScreenHeight, getScreenWidth, getScreenSize, openURL, getDeviceLocale, clearSessionCookies, copyToClipboard, 
                toast, clearHistory, reload, getAvailableSpace, getInitParameters, reloadApp, broadcastNativeNotification, setSharedToken, getSharedToken, clearSharedToken, 
                setWLClientConfig, setServerUrl, getServerUrl, getSDKVersion, getCookies, setCookie, deleteCookie
            });
        }

        private ACTION(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String APPCENTER_URL_PREFIX = "ibmappctr://";
    private static final String COOKIE_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.ms";
    private static final String MARKET_ANDROID_WEB_URL = "https://market.android.com/";
    private static final String MARKET_URL_PREFIX = "market://";
    private static final String RESOURCE_BUNDLE = "com/worklight/wlclient/messages";
    private static final String RESULT_ERROR = "result:error";
    private static final String RESULT_HEIGHT = "height";
    private static final String RESULT_WIDTH = "width";
    private static Logger logger = Logger.getInstance("wlapp");

    public WLApp()
    {
    }

    private String broadcastNativeNotification(String s)
    {
        cordova.getActivity().getApplicationContext().sendBroadcast(new Intent(s));
        return org.apache.cordova.PluginResult.Status.OK.name();
    }

    private boolean callback(String s, CallbackContext callbackcontext)
    {
        if ("result:error".equals(s))
        {
            callbackcontext.error(org.apache.cordova.PluginResult.Status.ERROR.name());
            return true;
        } else
        {
            callbackcontext.success(s);
            return true;
        }
    }

    private boolean callback(JSONArray jsonarray, CallbackContext callbackcontext)
    {
        if (jsonarray == null)
        {
            callbackcontext.error(org.apache.cordova.PluginResult.Status.ERROR.name());
            return true;
        } else
        {
            callbackcontext.success(jsonarray);
            return true;
        }
    }

    private String clearHistory()
    {
        cordova.getActivity().runOnUiThread(new Runnable() {

            final WLApp this$0;

            public void run()
            {
                webView.clearHistory();
            }

            
            {
                this$0 = WLApp.this;
                super();
            }
        });
        return org.apache.cordova.PluginResult.Status.OK.name();
    }

    private String clearSessionCookie()
    {
        CookieSyncManager.createInstance(cordova.getActivity());
        CookieManager.getInstance().removeSessionCookie();
        return org.apache.cordova.PluginResult.Status.OK.name();
    }

    private JSONObject cookieToJson(Cookie cookie)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("name", cookie.getName());
        jsonobject.put("value", cookie.getValue());
        if (cookie.getDomain() != null)
        {
            jsonobject.put("domain", cookie.getDomain());
        }
        if (cookie.getPath() != null)
        {
            jsonobject.put("path", cookie.getPath());
        }
        if (cookie.getExpiryDate() != null)
        {
            jsonobject.put("expires", DateFormat.format("yyyy-MM-dd'T'HH:mm:ss.ms", cookie.getExpiryDate()));
        }
        return jsonobject;
    }

    private String copyToClipboard(String s)
    {
        ((ClipboardManager)cordova.getActivity().getSystemService("clipboard")).setText(s);
        logger.debug((new StringBuilder()).append("Copied text: ").append(s).toString());
        return showToast(ResourceBundle.getBundle("com/worklight/wlclient/messages", Locale.getDefault()).getString("WLClient.copy"));
    }

    private String deleteCookie(String s)
    {
        Iterator iterator = WLClient.getInstance().getCookieStore().getCookies().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((Cookie)iterator.next()).getName().equals(s))
            {
                iterator.remove();
            }
        } while (true);
        return org.apache.cordova.PluginResult.Status.OK.name();
    }

    private JSONArray getCookies()
    {
        JSONArray jsonarray;
        Iterator iterator;
        jsonarray = new JSONArray();
        iterator = WLClient.getInstance().getCookieStore().getCookies().iterator();
_L2:
        Object obj = jsonarray;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (Cookie)iterator.next();
        if (!((Cookie) (obj)).isSecure())
        {
            jsonarray.put(cookieToJson(((Cookie) (obj))));
        }
        if (true) goto _L2; else goto _L1
        obj;
        obj = null;
_L1:
        return ((JSONArray) (obj));
    }

    private JSONObject getInitParamaters(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray == null || jsonarray.length() == 0)
        {
            return null;
        }
        JSONObject jsonobject = new JSONObject();
        jsonarray = jsonarray.getString(0).split(",");
        for (int i = 0; i < jsonarray.length; i++)
        {
            String s = WLConfig.getInstance().readWLPref(jsonarray[i].trim());
            jsonobject.put(jsonarray[i], s);
        }

        jsonobject.put("freeSpace", WLUtils.getFreeSpaceOnDevice());
        return jsonobject;
    }

    private JSONObject getScreenHeight()
        throws JSONException
    {
        Display display = ((WindowManager)cordova.getActivity().getSystemService("window")).getDefaultDisplay();
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("height", display.getHeight());
        return jsonobject;
    }

    private JSONObject getScreenSize()
        throws JSONException
    {
        Display display = ((WindowManager)cordova.getActivity().getSystemService("window")).getDefaultDisplay();
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("height", display.getHeight());
        jsonobject.put("width", display.getWidth());
        return jsonobject;
    }

    private JSONObject getScreenWidth()
        throws JSONException
    {
        Display display = ((WindowManager)cordova.getActivity().getSystemService("window")).getDefaultDisplay();
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("width", display.getWidth());
        return jsonobject;
    }

    private String getServerUrl()
    {
        return WL.getInstance().getServerUrl().toString();
    }

    private String getSkinPath(String s, String s1)
    {
        String s2 = (new String((new StringBuilder()).append(WLConfig.getInstance().getWebResourcesUrl()).append("/").append(s).append("/").append(s1).toString())).replace("/android_asset/", "");
        try
        {
            cordova.getActivity().getAssets().open(s2);
        }
        catch (IOException ioexception)
        {
            logger.warn((new StringBuilder()).append("\"default\" skin will be used, because skin named ").append(s).append(" was not found. Add a skin or change android/js/skinLoader.js to return existing skin.").toString());
            s = "default";
        }
        return (new StringBuilder()).append(WLConfig.getInstance().getWebUrl()).append("/").append(s).append("/").append(s1).toString();
    }

    private Cookie jsonToCookie(JSONObject jsonobject)
        throws JSONException, ParseException
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.ms");
        BasicClientCookie basicclientcookie = new BasicClientCookie(jsonobject.getString("name"), jsonobject.getString("value"));
        if (jsonobject.has("domain"))
        {
            basicclientcookie.setDomain(jsonobject.getString("domain"));
        }
        if (jsonobject.has("path"))
        {
            basicclientcookie.setPath(jsonobject.getString("path"));
        }
        if (jsonobject.has("expires"))
        {
            basicclientcookie.setExpiryDate(simpledateformat.parse(jsonobject.getString("expires")));
        }
        return basicclientcookie;
    }

    private String openURL(String s)
    {
        try
        {
            Intent intent;
            if (s.indexOf("market://") > -1 || s.indexOf("ibmappctr://") > -1)
            {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
            } else
            {
                intent = new Intent("android.intent.action.VIEW", Uri.parse((new URL(s)).toExternalForm()));
            }
            cordova.getActivity().startActivity(intent);
            return org.apache.cordova.PluginResult.Status.OK.name();
        }
        catch (MalformedURLException malformedurlexception)
        {
            logger.error((new StringBuilder()).append("WL.App.openURL failed to open web page with URL ").append(s).append(", because of incorrect URL format.").toString());
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            if (s.indexOf("market://") > -1)
            {
                s = new Intent("android.intent.action.VIEW", Uri.parse(s.replace("market://", "https://market.android.com/")));
                cordova.getActivity().startActivity(s);
                return org.apache.cordova.PluginResult.Status.OK.name();
            }
            logger.error((new StringBuilder()).append("WL.App.openURL failed to open web page with URL ").append(s).append(", because of incorrect URL format.").toString());
        }
        return "result:error";
    }

    private String setCookie(JSONObject jsonobject)
    {
        WLClient.getInstance().getCookieStore().addCookie(jsonToCookie(jsonobject));
        jsonobject = org.apache.cordova.PluginResult.Status.OK.name();
        return jsonobject;
        jsonobject;
_L2:
        return "result:error";
        jsonobject;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String setServerUrl(String s)
    {
        try
        {
            WL.getInstance().setServerUrl(new URL(s));
            if (FIPSHttpPlugin.isFipsEnabled())
            {
                FIPSHttpPlugin.resetCookies();
            }
            s = org.apache.cordova.PluginResult.Status.OK.name();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "result:error";
        }
        return s;
    }

    private String showToast(String s)
    {
        Toast.makeText(cordova.getActivity(), s, 1).show();
        return org.apache.cordova.PluginResult.Status.OK.name();
    }

    private String webViewReload()
    {
        cordova.getActivity().runOnUiThread(new Runnable() {

            final WLApp this$0;

            public void run()
            {
                webView.loadUrl(WL.getInstance().getMainHtmlFilePath());
            }

            
            {
                this$0 = WLApp.this;
                super();
            }
        });
        return org.apache.cordova.PluginResult.Status.OK.name();
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        ACTION action = ACTION.fromString(s);
        static class _cls3
        {

            static final int $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[];

            static 
            {
                $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION = new int[ACTION.values().length];
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.writeUserPref.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.readUserPref.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.getSkinPath.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.getScreenHeight.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.getScreenWidth.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.getScreenSize.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.openURL.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.getDeviceLocale.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.clearSessionCookies.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.copyToClipboard.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.toast.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.setServerUrl.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.getServerUrl.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.clearHistory.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.reload.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.getAvailableSpace.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.getInitParameters.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.reloadApp.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.setSharedToken.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.getSharedToken.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.clearSharedToken.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.getSDKVersion.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.getCookies.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.setCookie.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$WLApp$ACTION[ACTION.deleteCookie.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (action != null)
        {
            switch (_cls3..SwitchMap.com.worklight.androidgap.plugin.WLApp.ACTION[action.ordinal()])
            {
            default:
                callbackcontext.error((new StringBuilder()).append("Invalid action: ").append(s).toString());
                return true;

            case 1: // '\001'
                WLConfig.getInstance().writeWLPref(jsonarray.getString(0), jsonarray.getString(1));
                return callback(org.apache.cordova.PluginResult.Status.OK.name(), callbackcontext);

            case 2: // '\002'
                callbackcontext.success(WLConfig.getInstance().readWLPref(jsonarray.getString(0)));
                return true;

            case 3: // '\003'
                callbackcontext.success(getSkinPath(jsonarray.getString(0), jsonarray.getString(1)));
                return true;

            case 4: // '\004'
                callbackcontext.success(getScreenHeight());
                return true;

            case 5: // '\005'
                callbackcontext.success(getScreenWidth());
                return true;

            case 6: // '\006'
                callbackcontext.success(getScreenSize());
                return true;

            case 7: // '\007'
                return callback(openURL(jsonarray.getString(0)), callbackcontext);

            case 8: // '\b'
                return callback(Locale.getDefault().toString(), callbackcontext);

            case 9: // '\t'
                return callback(clearSessionCookie(), callbackcontext);

            case 10: // '\n'
                return callback(copyToClipboard(jsonarray.getString(0)), callbackcontext);

            case 11: // '\013'
                return callback(showToast(jsonarray.getString(0)), callbackcontext);

            case 12: // '\f'
                return callback(setServerUrl(jsonarray.getString(0)), callbackcontext);

            case 13: // '\r'
                return callback(getServerUrl(), callbackcontext);

            case 14: // '\016'
                return callback(clearHistory(), callbackcontext);

            case 15: // '\017'
                return callback(webViewReload(), callbackcontext);

            case 16: // '\020'
                return callback(Long.toString(WLUtils.getFreeSpaceOnDevice()), callbackcontext);

            case 17: // '\021'
                callbackcontext.success(getInitParamaters(jsonarray));
                return true;

            case 18: // '\022'
                return callback(reloadApp(), callbackcontext);

            case 19: // '\023'
                (new WLSimpleDataSharing(cordova.getActivity())).setSharedToken(jsonarray.getString(0), jsonarray.getString(1));
                callbackcontext.success();
                return true;

            case 20: // '\024'
                return callback((new WLSimpleDataSharing(cordova.getActivity())).getSharedToken(jsonarray.getString(0)), callbackcontext);

            case 21: // '\025'
                (new WLSimpleDataSharing(cordova.getActivity())).clearSharedToken(jsonarray.getString(0));
                callbackcontext.success();
                return true;

            case 22: // '\026'
                return callback(Integer.toString(WLUtils.getSDKVersion()), callbackcontext);

            case 23: // '\027'
                return callback(getCookies(), callbackcontext);

            case 24: // '\030'
                return callback(setCookie(jsonarray.getJSONObject(0)), callbackcontext);

            case 25: // '\031'
                return callback(deleteCookie(jsonarray.getString(0)), callbackcontext);
            }
        } else
        {
            callbackcontext.error("Null action");
            return true;
        }
    }

    String reloadApp()
    {
        BusyIndicator busyindicator = (BusyIndicator)webView.pluginManager.getPlugin("NativeBusyIndicator");
        if (busyindicator.isShowing())
        {
            busyindicator.hide();
        }
        clearSessionCookie();
        WLConfig.getInstance().writeWLPref("exitOnSkinLoader", "false");
        return webViewReload();
    }

}
