// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import com.worklight.androidgap.directupdate.WLDirectUpdateManager;
import com.worklight.androidgap.directupdate.WLDirectUpdatePluginDefaultListener;
import com.worklight.androidgap.directupdate.WLDirectUpdatePluginListener;
import com.worklight.androidgap.directupdate.WLDirectUpdateProgressDialog;
import com.worklight.androidgap.directupdate.WLDirectUpdateStatus;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WLDirectUpdatePlugin extends CordovaPlugin
    implements WLDirectUpdatePluginListener
{

    WLDirectUpdateProgressDialog progressDialog;

    public WLDirectUpdatePlugin()
    {
        progressDialog = new WLDirectUpdateProgressDialog();
    }

    private void executeDirectUpdate(CallbackContext callbackcontext, long l, long l1, long l2, 
            String s)
    {
        WLDirectUpdateManager.getInstance().start(cordova.getActivity().getApplicationContext(), s, l, l1, l2, new WLDirectUpdatePluginDefaultListener(callbackcontext, this));
    }

    private void hideProgressDialog(CallbackContext callbackcontext)
    {
        progressDialog.hide();
        callbackcontext.success();
    }

    private void sendJSONResult(CallbackContext callbackcontext, JSONObject jsonobject, boolean flag)
    {
        jsonobject = new PluginResult(org.apache.cordova.PluginResult.Status.OK, jsonobject);
        jsonobject.setKeepCallback(flag);
        callbackcontext.sendPluginResult(jsonobject);
    }

    private void showProgressDialog(CallbackContext callbackcontext, int i)
    {
        Runnable runnable = new Runnable() {

            final WLDirectUpdatePlugin this$0;

            public void run()
            {
                WLDirectUpdateManager.getInstance().stop();
            }

            
            {
                this$0 = WLDirectUpdatePlugin.this;
                super();
            }
        };
        progressDialog.show(cordova.getActivity(), runnable, i / 1024);
        callbackcontext.success();
    }

    private void updateProgressDialog(CallbackContext callbackcontext, int i)
    {
        progressDialog.update(i / 1024);
        callbackcontext.success();
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        boolean flag = false;
        if (s.equals("start"))
        {
            executeDirectUpdate(callbackcontext, jsonarray.getLong(0), jsonarray.getLong(1), jsonarray.getLong(2), jsonarray.getString(3));
            flag = true;
        } else
        {
            if (s.equals("stop"))
            {
                WLDirectUpdateManager.getInstance().stop();
                callbackcontext.success();
                return true;
            }
            if (s.equals("showProgressDialog"))
            {
                showProgressDialog(callbackcontext, jsonarray.getInt(0));
                return true;
            }
            if (s.equals("hideProgressDialog"))
            {
                hideProgressDialog(callbackcontext);
                return true;
            }
            if (s.equals("updateProgressDialog"))
            {
                updateProgressDialog(callbackcontext, jsonarray.getInt(2));
                return true;
            }
        }
        return flag;
    }

    public void onFinish(CallbackContext callbackcontext, WLDirectUpdateStatus wldirectupdatestatus)
    {
        if (wldirectupdatestatus == WLDirectUpdateStatus.SUCCESS)
        {
            webView.clearCache(true);
        }
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("operation", "finish");
            jsonobject.put("status", wldirectupdatestatus.toString());
        }
        // Misplaced declaration of an exception variable
        catch (WLDirectUpdateStatus wldirectupdatestatus)
        {
            callbackcontext.error("onFinish Exception");
        }
        sendJSONResult(callbackcontext, jsonobject, false);
    }

    public void onProgress(CallbackContext callbackcontext, WLDirectUpdateStatus wldirectupdatestatus, long l, long l1)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("operation", "progress");
            jsonobject.put("status", wldirectupdatestatus.toString());
            jsonobject.put("totalSize", l);
            jsonobject.put("completedSize", l1);
        }
        // Misplaced declaration of an exception variable
        catch (WLDirectUpdateStatus wldirectupdatestatus)
        {
            callbackcontext.error("onProgress Exception");
        }
        sendJSONResult(callbackcontext, jsonobject, true);
    }

    public void onStart(CallbackContext callbackcontext, long l)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("operation", "start");
            jsonobject.put("totalSize", l);
        }
        catch (JSONException jsonexception)
        {
            callbackcontext.error("onStart Exception");
        }
        sendJSONResult(callbackcontext, jsonobject, true);
    }
}
