// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.batterystatus;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BatteryListener extends CordovaPlugin
{

    private static final String LOG_TAG = "BatteryManager";
    private CallbackContext batteryCallbackContext;
    BroadcastReceiver receiver;

    public BatteryListener()
    {
        batteryCallbackContext = null;
        receiver = null;
    }

    private JSONObject getBatteryInfo(Intent intent)
    {
        JSONObject jsonobject;
        boolean flag;
        flag = false;
        jsonobject = new JSONObject();
        jsonobject.put("level", intent.getIntExtra("level", 0));
        if (intent.getIntExtra("plugged", -1) > 0)
        {
            flag = true;
        }
        try
        {
            jsonobject.put("isPlugged", flag);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("BatteryManager", intent.getMessage(), intent);
            return jsonobject;
        }
        return jsonobject;
    }

    private void removeBatteryListener()
    {
        if (receiver == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        webView.getContext().unregisterReceiver(receiver);
        receiver = null;
        return;
        Exception exception;
        exception;
        Log.e("BatteryManager", (new StringBuilder()).append("Error unregistering battery receiver: ").append(exception.getMessage()).toString(), exception);
        return;
    }

    private void sendUpdate(JSONObject jsonobject, boolean flag)
    {
        if (batteryCallbackContext != null)
        {
            jsonobject = new PluginResult(org.apache.cordova.PluginResult.Status.OK, jsonobject);
            jsonobject.setKeepCallback(flag);
            batteryCallbackContext.sendPluginResult(jsonobject);
        }
    }

    private void updateBatteryInfo(Intent intent)
    {
        sendUpdate(getBatteryInfo(intent), true);
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
    {
        if (s.equals("start"))
        {
            if (batteryCallbackContext != null)
            {
                callbackcontext.error("Battery listener already running.");
                return true;
            }
            batteryCallbackContext = callbackcontext;
            s = new IntentFilter();
            s.addAction("android.intent.action.BATTERY_CHANGED");
            if (receiver == null)
            {
                receiver = new BroadcastReceiver() {

                    final BatteryListener this$0;

                    public void onReceive(Context context, Intent intent)
                    {
                        updateBatteryInfo(intent);
                    }

            
            {
                this$0 = BatteryListener.this;
                super();
            }
                };
                webView.getContext().registerReceiver(receiver, s);
            }
            s = new PluginResult(org.apache.cordova.PluginResult.Status.NO_RESULT);
            s.setKeepCallback(true);
            callbackcontext.sendPluginResult(s);
            return true;
        }
        if (s.equals("stop"))
        {
            removeBatteryListener();
            sendUpdate(new JSONObject(), false);
            batteryCallbackContext = null;
            callbackcontext.success();
            return true;
        } else
        {
            return false;
        }
    }

    public void onDestroy()
    {
        removeBatteryListener();
    }

    public void onReset()
    {
        removeBatteryListener();
    }

}
