// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.dialogs;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import org.apache.cordova.CordovaInterface;

// Referenced classes of package org.apache.cordova.dialogs:
//            Notification

class val.message
    implements Runnable
{

    final Notification this$0;
    final CordovaInterface val$cordova;
    final String val$message;
    final Notification val$notification;
    final String val$title;

    public void run()
    {
        val$notification.spinnerDialog = Notification.access$200(Notification.this, val$cordova);
        val$notification.spinnerDialog.setTitle(val$title);
        val$notification.spinnerDialog.setMessage(val$message);
        val$notification.spinnerDialog.setCancelable(true);
        val$notification.spinnerDialog.setIndeterminate(true);
        val$notification.spinnerDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final Notification._cls5 this$1;

            public void onCancel(DialogInterface dialoginterface)
            {
                notification.spinnerDialog = null;
            }

            
            {
                this$1 = Notification._cls5.this;
                super();
            }
        });
        val$notification.spinnerDialog.show();
    }

    _cls1.this._cls1()
    {
        this$0 = final_notification1;
        val$notification = notification2;
        val$cordova = cordovainterface;
        val$title = s;
        val$message = String.this;
        super();
    }
}
