// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.DialogInterface;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.PluginResult;

// Referenced classes of package org.apache.cordova:
//            Notification

class text
    implements Runnable
{

    final Notification this$0;
    final CallbackContext val$callbackContext;
    final CordovaInterface val$cordova;
    final String val$fButtons[];
    final String val$message;
    final String val$title;

    public void run()
    {
        android.app.lder lder = new android.app.lder(val$cordova.getActivity());
        lder.setMessage(val$message);
        lder.setTitle(val$title);
        lder.setCancelable(true);
        if (val$fButtons.length > 0)
        {
            lder.setNegativeButton(val$fButtons[0], new android.content.DialogInterface.OnClickListener() {

                final Notification._cls2 this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.dismiss();
                    callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 1));
                }

            
            {
                this$1 = Notification._cls2.this;
                super();
            }
            });
        }
        if (val$fButtons.length > 1)
        {
            lder.setNeutralButton(val$fButtons[1], new android.content.DialogInterface.OnClickListener() {

                final Notification._cls2 this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.dismiss();
                    callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 2));
                }

            
            {
                this$1 = Notification._cls2.this;
                super();
            }
            });
        }
        if (val$fButtons.length > 2)
        {
            lder.setPositiveButton(val$fButtons[2], new android.content.DialogInterface.OnClickListener() {

                final Notification._cls2 this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.dismiss();
                    callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 3));
                }

            
            {
                this$1 = Notification._cls2.this;
                super();
            }
            });
        }
        lder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final Notification._cls2 this$1;

            public void onCancel(DialogInterface dialoginterface)
            {
                dialoginterface.dismiss();
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 0));
            }

            
            {
                this$1 = Notification._cls2.this;
                super();
            }
        });
        lder.create();
        lder.show();
    }

    text()
    {
        this$0 = final_notification;
        val$cordova = cordovainterface;
        val$message = s;
        val$title = s1;
        val$fButtons = as;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
