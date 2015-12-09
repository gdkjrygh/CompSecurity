// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class BusyIndicator extends Plugin
{

    private ProgressDialog spinnerDialog;

    public BusyIndicator()
    {
        spinnerDialog = null;
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        org.apache.cordova.api.PluginResult.Status status;
        status = org.apache.cordova.api.PluginResult.Status.OK;
        s1 = new PluginResult(status, "");
        if (!s.equals("show"))
        {
            break MISSING_BLOCK_LABEL_40;
        }
        show(jsonarray.getString(0));
        jsonarray = s1;
        break MISSING_BLOCK_LABEL_95;
        if (!s.equals("hide"))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        hide();
        jsonarray = s1;
        break MISSING_BLOCK_LABEL_95;
        jsonarray = s1;
        try
        {
            if (s.equals("isVisible"))
            {
                jsonarray = new PluginResult(status, isVisible());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new PluginResult(org.apache.cordova.api.PluginResult.Status.JSON_EXCEPTION);
        }
        return jsonarray;
    }

    public void hide()
    {
        if (spinnerDialog != null)
        {
            spinnerDialog.dismiss();
            spinnerDialog = null;
        }
    }

    public boolean isSynch(String s)
    {
        return true;
    }

    public boolean isVisible()
    {
        return spinnerDialog != null && spinnerDialog.isShowing();
    }

    public void show(String s)
    {
        if (spinnerDialog != null)
        {
            spinnerDialog.dismiss();
            spinnerDialog = null;
        }
        s = new Runnable() {

            final BusyIndicator this$0;
            private final CordovaInterface val$ctx;
            private final String val$text;

            public void run()
            {
                spinnerDialog = new ProgressDialog((Context)ctx);
                spinnerDialog.setCancelable(true);
                spinnerDialog.setCanceledOnTouchOutside(false);
                spinnerDialog.setIndeterminate(true);
                spinnerDialog.setMessage((new StringBuilder(String.valueOf(text))).append(" ").toString());
                spinnerDialog.show();
            }

            
            {
                this$0 = BusyIndicator.this;
                ctx = cordovainterface;
                text = s;
                super();
            }
        };
        ((Activity)cordova).runOnUiThread(s);
    }


}
