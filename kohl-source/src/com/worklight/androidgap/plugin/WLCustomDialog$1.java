// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.DialogInterface;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLCustomDialog

class val.callbackContext
    implements Runnable
{

    final WLCustomDialog this$0;
    final JSONArray val$buttonLabels;
    final CallbackContext val$callbackContext;
    final CordovaInterface val$cordova;
    final String val$message;
    final String val$title;

    public void run()
    {
        android.app.er er = new android.app.er(val$cordova.getActivity());
        er.setMessage(val$message);
        er.setTitle(val$title);
        er.setCancelable(false);
        if (val$buttonLabels.length() > 0)
        {
            try
            {
                er.setNegativeButton(val$buttonLabels.getString(0), new android.content.DialogInterface.OnClickListener() {

                    final WLCustomDialog._cls1 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.dismiss();
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 1));
                    }

            
            {
                this$1 = WLCustomDialog._cls1.this;
                super();
            }
                });
            }
            catch (Exception exception2) { }
        }
        if (val$buttonLabels.length() > 1)
        {
            try
            {
                er.setNeutralButton(val$buttonLabels.getString(1), new android.content.DialogInterface.OnClickListener() {

                    final WLCustomDialog._cls1 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.dismiss();
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 2));
                    }

            
            {
                this$1 = WLCustomDialog._cls1.this;
                super();
            }
                });
            }
            catch (Exception exception1) { }
        }
        if (val$buttonLabels.length() > 2)
        {
            try
            {
                er.setPositiveButton(val$buttonLabels.getString(2), new android.content.DialogInterface.OnClickListener() {

                    final WLCustomDialog._cls1 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.dismiss();
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 3));
                    }

            
            {
                this$1 = WLCustomDialog._cls1.this;
                super();
            }
                });
            }
            catch (Exception exception) { }
        }
        er.create();
        er.show();
    }

    _cls3.this._cls1()
    {
        this$0 = final_wlcustomdialog;
        val$cordova = cordovainterface;
        val$message = s;
        val$title = s1;
        val$buttonLabels = jsonarray;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
