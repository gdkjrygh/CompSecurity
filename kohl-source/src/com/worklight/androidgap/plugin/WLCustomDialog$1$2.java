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

class this._cls1
    implements android.content.lickListener
{

    final  this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova..OK, 2));
    }

    l.callbackContext()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/worklight/androidgap/plugin/WLCustomDialog$1

/* anonymous class */
    class WLCustomDialog._cls1
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
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(cordova.getActivity());
            builder.setMessage(message);
            builder.setTitle(title);
            builder.setCancelable(false);
            if (buttonLabels.length() > 0)
            {
                try
                {
                    builder.setNegativeButton(buttonLabels.getString(0), new WLCustomDialog._cls1._cls1());
                }
                catch (Exception exception2) { }
            }
            if (buttonLabels.length() > 1)
            {
                try
                {
                    builder.setNeutralButton(buttonLabels.getString(1), new WLCustomDialog._cls1._cls2());
                }
                catch (Exception exception1) { }
            }
            if (buttonLabels.length() > 2)
            {
                try
                {
                    builder.setPositiveButton(buttonLabels.getString(2), new WLCustomDialog._cls1._cls3());
                }
                catch (Exception exception) { }
            }
            builder.create();
            builder.show();
        }

            
            {
                this$0 = final_wlcustomdialog;
                cordova = cordovainterface;
                message = s;
                title = s1;
                buttonLabels = jsonarray;
                callbackContext = CallbackContext.this;
                super();
            }

        // Unreferenced inner class com/worklight/androidgap/plugin/WLCustomDialog$1$1

/* anonymous class */
        class WLCustomDialog._cls1._cls1
            implements android.content.DialogInterface.OnClickListener
        {

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
        }


        // Unreferenced inner class com/worklight/androidgap/plugin/WLCustomDialog$1$3

/* anonymous class */
        class WLCustomDialog._cls1._cls3
            implements android.content.DialogInterface.OnClickListener
        {

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
        }

    }

}
