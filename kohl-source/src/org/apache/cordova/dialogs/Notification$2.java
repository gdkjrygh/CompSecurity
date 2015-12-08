// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.dialogs;

import android.content.DialogInterface;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.PluginResult;

// Referenced classes of package org.apache.cordova.dialogs:
//            Notification

class val.callbackContext
    implements Runnable
{

    final Notification this$0;
    final String val$buttonLabel;
    final CallbackContext val$callbackContext;
    final CordovaInterface val$cordova;
    final String val$message;
    final String val$title;

    public void run()
    {
        android.app.lder lder = Notification.access$000(Notification.this, val$cordova);
        lder.setMessage(val$message);
        lder.setTitle(val$title);
        lder.setCancelable(true);
        lder.setPositiveButton(val$buttonLabel, new android.content.DialogInterface.OnClickListener() {

            final Notification._cls2 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 0));
            }

            
            {
                this$1 = Notification._cls2.this;
                super();
            }
        });
        lder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final Notification._cls2 this$1;

            public void onCancel(DialogInterface dialoginterface)
            {
                dialoginterface.dismiss();
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 0));
            }

            
            {
                this$1 = Notification._cls2.this;
                super();
            }
        });
        Notification.access$100(Notification.this, lder);
    }

    _cls2.this._cls1()
    {
        this$0 = final_notification;
        val$cordova = cordovainterface;
        val$message = s;
        val$title = s1;
        val$buttonLabel = s2;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
