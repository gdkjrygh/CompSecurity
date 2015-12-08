// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.plugin.gcm;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gcm.GCMRegistrar;
import java.util.Iterator;
import java.util.Set;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PushPlugin extends CordovaPlugin
{

    public static final String EXIT = "exit";
    public static final String REGISTER = "register";
    public static final String TAG = "PushPlugin";
    public static final String UNREGISTER = "unregister";
    private static Bundle gCachedExtras = null;
    private static String gECB;
    private static boolean gForeground = false;
    private static String gSenderID;
    private static CordovaWebView gWebView;

    public PushPlugin()
    {
    }

    private static JSONObject convertBundleToJson(Bundle bundle)
    {
        JSONObject jsonobject;
        JSONObject jsonobject1;
        Iterator iterator;
        jsonobject = (new JSONObject()).put("event", "message");
        jsonobject1 = new JSONObject();
        iterator = bundle.keySet().iterator();
_L3:
        String s;
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_316;
        }
        s = (String)iterator.next();
        obj = bundle.get(s);
        if (!s.equals("from") && !s.equals("collapse_key")) goto _L2; else goto _L1
_L1:
        jsonobject.put(s, obj);
          goto _L3
_L2:
label0:
        {
            if (!s.equals("foreground"))
            {
                break label0;
            }
            jsonobject.put(s, bundle.getBoolean("foreground"));
        }
          goto _L3
label1:
        {
            if (!s.equals("coldstart"))
            {
                break label1;
            }
            jsonobject.put(s, bundle.getBoolean("coldstart"));
        }
          goto _L3
        if (s.equals("message") || s.equals("msgcnt") || s.equals("soundname"))
        {
            jsonobject.put(s, obj);
        }
        if (!(obj instanceof String)) goto _L3; else goto _L4
_L4:
        Object obj1;
        boolean flag;
        obj1 = (String)obj;
        flag = ((String) (obj1)).startsWith("{");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        jsonobject1.put(s, new JSONObject(((String) (obj1))));
          goto _L3
        obj1;
        try
        {
            jsonobject1.put(s, obj);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.e("PushPlugin", "extrasToJSON: JSON exception");
            return null;
        }
          goto _L3
        flag = ((String) (obj1)).startsWith("[");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        jsonobject1.put(s, new JSONArray(((String) (obj1))));
          goto _L3
        Exception exception;
        exception;
        jsonobject1.put(s, obj);
          goto _L3
        jsonobject1.put(s, obj);
          goto _L3
        jsonobject.put("payload", jsonobject1);
        Log.v("PushPlugin", (new StringBuilder()).append("extrasToJSON: ").append(jsonobject.toString()).toString());
        return jsonobject;
    }

    private Context getApplicationContext()
    {
        return cordova.getActivity().getApplicationContext();
    }

    public static boolean isActive()
    {
        return gWebView != null;
    }

    public static boolean isInForeground()
    {
        return gForeground;
    }

    public static void sendExtras(Bundle bundle)
    {
label0:
        {
            if (bundle != null)
            {
                if (gECB == null || gWebView == null)
                {
                    break label0;
                }
                sendJavascript(convertBundleToJson(bundle));
            }
            return;
        }
        Log.v("PushPlugin", "sendExtras: caching extras to send at a later time.");
        gCachedExtras = bundle;
    }

    public static void sendJavascript(JSONObject jsonobject)
    {
        jsonobject = (new StringBuilder()).append("javascript:").append(gECB).append("(").append(jsonobject.toString()).append(")").toString();
        Log.v("PushPlugin", (new StringBuilder()).append("sendJavascript: ").append(jsonobject).toString());
        if (gECB != null && gWebView != null)
        {
            gWebView.sendJavascript(jsonobject);
        }
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
    {
        Log.v("PushPlugin", (new StringBuilder()).append("execute: action=").append(s).toString());
        if (!"register".equals(s))
        {
            break MISSING_BLOCK_LABEL_259;
        }
        Log.v("PushPlugin", (new StringBuilder()).append("execute: data=").append(jsonarray.toString()).toString());
        s = jsonarray.getJSONObject(0);
        gWebView = webView;
        Log.v("PushPlugin", (new StringBuilder()).append("execute: jo=").append(s.toString()).toString());
        gECB = (String)s.get("ecb");
        gSenderID = (String)s.get("senderID");
        Log.v("PushPlugin", (new StringBuilder()).append("execute: ECB=").append(gECB).append(" senderID=").append(gSenderID).toString());
        GCMRegistrar.register(getApplicationContext(), new String[] {
            gSenderID
        });
        boolean flag = true;
        try
        {
            callbackcontext.success();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("PushPlugin", (new StringBuilder()).append("execute: Got JSON Exception ").append(s.getMessage()).toString());
            flag = false;
            callbackcontext.error(s.getMessage());
        }
        if (gCachedExtras != null)
        {
            Log.v("PushPlugin", "sending cached extras");
            sendExtras(gCachedExtras);
            gCachedExtras = null;
        }
        return flag;
        if ("unregister".equals(s))
        {
            GCMRegistrar.unregister(getApplicationContext());
            Log.v("PushPlugin", "UNREGISTER");
            callbackcontext.success();
            return true;
        } else
        {
            Log.e("PushPlugin", (new StringBuilder()).append("Invalid action : ").append(s).toString());
            callbackcontext.error((new StringBuilder()).append("Invalid action : ").append(s).toString());
            return false;
        }
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        gForeground = true;
    }

    public void onDestroy()
    {
        super.onDestroy();
        gForeground = false;
        gECB = null;
        gWebView = null;
    }

    public void onPause(boolean flag)
    {
        super.onPause(flag);
        gForeground = false;
        ((NotificationManager)cordova.getActivity().getSystemService("notification")).cancelAll();
    }

    public void onResume(boolean flag)
    {
        super.onResume(flag);
        gForeground = true;
    }

}
