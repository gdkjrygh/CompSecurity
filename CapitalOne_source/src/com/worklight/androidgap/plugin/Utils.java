// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.ClipboardManager;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.Toast;
import com.worklight.androidgap.WLDroidGap;
import com.worklight.common.WLUtils;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utils extends Plugin
{

    private static final String ACTION_CLEAR_HISTORY = "clearHistory";
    private static final String ACTION_CLEAR_SESSION_COOKIES = "clearSessionCookies";
    private static final String ACTION_COPY_TO_CLIPBOARD = "copyToClipboard";
    private static final String ACTION_GET_AVAILABLE_SPACE = "getAvailableSpace";
    private static final String ACTION_GET_LOCALE = "getDeviceLocale";
    private static final String ACTION_GET_SCREEN_HEIGHT = "getScreenHeight";
    private static final String ACTION_GET_SCREEN_WIDTH = "getScreenWidth";
    private static final String ACTION_LOAD_SKIN = "loadSkin";
    private static final String ACTION_OPEN_URL = "openURL";
    private static final String ACTION_READ_PREF = "readPref";
    private static final String ACTION_TOAST = "toast";
    private static final String ACTION_WEBVIEW_RELOAD = "reload";
    private static final String ACTION_WRITE_PREF = "writePref";
    private static final String MARKET_ANDROID_WEB_URL = "https://market.android.com/";
    private static final String MARKET_URL_PREFIX = "market://";
    private static final String RESULT_HEIGHT = "height";
    private static final String RESULT_WIDTH = "width";
    private Activity myactivity;

    public Utils()
    {
        myactivity = null;
    }

    private void showWrongSkinDialog()
    {
        WLUtils.showDialog(myactivity, "Device Unsupported", "The application is not supported on this device. You may face problems while using it.", "OK");
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        JSONObject jsonobject;
        s1 = org.apache.cordova.api.PluginResult.Status.OK;
        jsonobject = new JSONObject();
        if (!"openURL".equals(s)) goto _L2; else goto _L1
_L1:
        openURL(jsonarray.getString(0));
_L5:
        return new PluginResult(s1, jsonobject);
_L2:
        if (!"getScreenWidth".equals(s)) goto _L4; else goto _L3
_L3:
        jsonobject.put("width", getScreenWidth());
          goto _L5
_L4:
label0:
        {
            if (!"getScreenHeight".equals(s))
            {
                break label0;
            }
            jsonobject.put("height", getScreenHeight());
        }
          goto _L5
label1:
        {
            if (!"loadSkin".equals(s) || myactivity.isFinishing())
            {
                break label1;
            }
            loadSkin(jsonarray.getString(0), jsonarray.getString(1));
        }
          goto _L5
label2:
        {
            if ("readPref".equals(s))
            {
                return new PluginResult(s1, WLUtils.readWLPref(myactivity, jsonarray.getString(0)));
            }
            if (!"writePref".equals(s))
            {
                break label2;
            }
            WLUtils.writeWLPref(myactivity, jsonarray.getString(0), jsonarray.getString(1));
        }
          goto _L5
label3:
        {
            if ("getDeviceLocale".equals(s))
            {
                return new PluginResult(s1, Locale.getDefault().toString());
            }
            if (!"clearSessionCookies".equals(s))
            {
                break label3;
            }
            CookieSyncManager.createInstance(myactivity);
            CookieManager.getInstance().removeSessionCookie();
        }
          goto _L5
label4:
        {
            if (!"copyToClipboard".equals(s))
            {
                break label4;
            }
            ((ClipboardManager)myactivity.getSystemService("clipboard")).setText(jsonarray.getString(0));
            Toast.makeText(myactivity, "The text was sucessfully copied.", 1).show();
            WLUtils.debug((new StringBuilder("Copied text: ")).append(jsonarray.getString(0)).toString());
        }
          goto _L5
label5:
        {
            if (!"toast".equals(s))
            {
                break label5;
            }
            Toast.makeText(myactivity, jsonarray.getString(0), 1).show();
        }
          goto _L5
label6:
        {
            if (!"clearHistory".equals(s))
            {
                break label6;
            }
            ((WLDroidGap)myactivity).clearHistory();
        }
          goto _L5
        try
        {
            if ("getAvailableSpace".equals(s))
            {
                return new PluginResult(s1, WLUtils.getFreeSpaceOnDevice());
            }
            if ("reload".equals(s))
            {
                webView.reload();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new PluginResult(org.apache.cordova.api.PluginResult.Status.JSON_EXCEPTION);
        }
          goto _L5
    }

    public int getScreenHeight()
    {
        return ((WindowManager)myactivity.getSystemService("window")).getDefaultDisplay().getHeight();
    }

    public int getScreenWidth()
    {
        return ((WindowManager)myactivity.getSystemService("window")).getDefaultDisplay().getWidth();
    }

    public boolean isSynch(String s)
    {
        return true;
    }

    public void loadSkin(String s, String s1)
    {
        String s2 = s;
        if (!(new File((new StringBuilder(String.valueOf(((WLDroidGap)myactivity).getLocalStorageWebRoot()))).append("/").append(s).toString())).exists())
        {
            WLUtils.error((new StringBuilder("No skin defined for ")).append(s).append(", will load default skin.").toString());
            s2 = "default";
            showWrongSkinDialog();
        }
        s = (new StringBuilder(String.valueOf(((WLDroidGap)myactivity).getWebUrl()))).append("/").append(s2).append("/").append(s1).toString();
        webView.loadUrl(s);
    }

    public void openURL(String s)
    {
        Intent intent;
        if (s.indexOf("market://") <= -1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
_L1:
        myactivity.startActivity(intent);
        return;
        try
        {
            intent = new Intent("android.intent.action.VIEW", Uri.parse((new URL(s)).toExternalForm()));
        }
        catch (MalformedURLException malformedurlexception)
        {
            WLUtils.error((new StringBuilder("Failed to openURL '")).append(s).append("'; Invalid URL format.").toString());
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            if (s.indexOf("market://") > -1)
            {
                s = new Intent("android.intent.action.VIEW", Uri.parse(s.replace("market://", "https://market.android.com/")));
                myactivity.startActivity(s);
                return;
            } else
            {
                WLUtils.error((new StringBuilder("Failed to openURL '")).append(s).append("'; Invalid URL format.").toString());
                return;
            }
        }
          goto _L1
    }

    public void setContext(CordovaInterface cordovainterface)
    {
        myactivity = (Activity)cordovainterface;
    }
}
