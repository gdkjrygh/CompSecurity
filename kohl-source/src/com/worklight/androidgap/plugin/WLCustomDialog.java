// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.content.DialogInterface;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.PluginResult;
import org.apache.cordova.dialogs.Notification;
import org.json.JSONArray;

public class WLCustomDialog extends Notification
{

    public WLCustomDialog()
    {
    }

    public void confirm(String s, String s1, JSONArray jsonarray, CallbackContext callbackcontext)
    {
        this;
        JVM INSTR monitorenter ;
        s = new Runnable() {

            final WLCustomDialog this$0;
            final JSONArray val$buttonLabels;
            final CallbackContext val$callbackContext;
            final CordovaInterface val$cordova;
            final String val$message;
            final String val$title;

            public void run()
            {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(cordova.getActivity());
                builder.setMessage(message);
                builder.setTitle(title);
                builder.setCancelable(false);
                if (buttonLabels.length() > 0)
                {
                    try
                    {
                        builder.setNegativeButton(buttonLabels.getString(0), new android.content.DialogInterface.OnClickListener() {

                            final _cls1 this$1;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                dialoginterface.dismiss();
                                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 1));
                            }

            
            {
                this$1 = _cls1.this;
                super();
            }
                        });
                    }
                    catch (Exception exception2) { }
                }
                if (buttonLabels.length() > 1)
                {
                    try
                    {
                        builder.setNeutralButton(buttonLabels.getString(1), new android.content.DialogInterface.OnClickListener() {

                            final _cls1 this$1;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                dialoginterface.dismiss();
                                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 2));
                            }

            
            {
                this$1 = _cls1.this;
                super();
            }
                        });
                    }
                    catch (Exception exception1) { }
                }
                if (buttonLabels.length() > 2)
                {
                    try
                    {
                        builder.setPositiveButton(buttonLabels.getString(2), new android.content.DialogInterface.OnClickListener() {

                            final _cls1 this$1;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                dialoginterface.dismiss();
                                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 3));
                            }

            
            {
                this$1 = _cls1.this;
                super();
            }
                        });
                    }
                    catch (Exception exception) { }
                }
                builder.create();
                builder.show();
            }

            
            {
                this$0 = WLCustomDialog.this;
                cordova = cordovainterface;
                message = s;
                title = s1;
                buttonLabels = jsonarray;
                callbackContext = callbackcontext;
                super();
            }
        };
        cordova.getActivity().runOnUiThread(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
