// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.statusbar;

import android.app.Activity;
import android.util.Log;
import android.view.Window;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONException;

public class StatusBar extends CordovaPlugin
{

    private static final String TAG = "StatusBar";

    public StatusBar()
    {
    }

    public boolean execute(String s, final CordovaArgs window, CallbackContext callbackcontext)
        throws JSONException
    {
        Log.v("StatusBar", (new StringBuilder()).append("Executing action: ").append(s).toString());
        window = cordova.getActivity().getWindow();
        if ("_ready".equals(s))
        {
            boolean flag;
            if ((window.getAttributes().flags & 0x400) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, flag));
        }
        if ("show".equals(s))
        {
            cordova.getActivity().runOnUiThread(new Runnable() {

                final StatusBar this$0;
                final Window val$window;

                public void run()
                {
                    window.clearFlags(1024);
                }

            
            {
                this$0 = StatusBar.this;
                window = window1;
                super();
            }
            });
            return true;
        }
        if ("hide".equals(s))
        {
            cordova.getActivity().runOnUiThread(new Runnable() {

                final StatusBar this$0;
                final Window val$window;

                public void run()
                {
                    window.addFlags(1024);
                }

            
            {
                this$0 = StatusBar.this;
                window = window1;
                super();
            }
            });
            return true;
        } else
        {
            return false;
        }
    }

    public void initialize(final CordovaInterface cordova, CordovaWebView cordovawebview)
    {
        Log.v("StatusBar", "StatusBar: initialization");
        super.initialize(cordova, cordovawebview);
        this.cordova.getActivity().runOnUiThread(new Runnable() {

            final StatusBar this$0;
            final CordovaInterface val$cordova;

            public void run()
            {
                cordova.getActivity().getWindow().clearFlags(2048);
            }

            
            {
                this$0 = StatusBar.this;
                cordova = cordovainterface;
                super();
            }
        });
    }
}
