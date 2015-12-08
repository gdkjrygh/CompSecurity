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
        val$notification.progressDialog = Notification.access$200(Notification.this, val$cordova);
        val$notification.progressDialog.setProgressStyle(1);
        val$notification.progressDialog.setTitle(val$title);
        val$notification.progressDialog.setMessage(val$message);
        val$notification.progressDialog.setCancelable(true);
        val$notification.progressDialog.setMax(100);
        val$notification.progressDialog.setProgress(0);
        val$notification.progressDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final Notification._cls6 this$1;

            public void onCancel(DialogInterface dialoginterface)
            {
                notification.progressDialog = null;
            }

            
            {
                this$1 = Notification._cls6.this;
                super();
            }
        });
        val$notification.progressDialog.show();
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
