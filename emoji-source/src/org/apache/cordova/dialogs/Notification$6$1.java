// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.dialogs;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import org.apache.cordova.CordovaInterface;

// Referenced classes of package org.apache.cordova.dialogs:
//            Notification

class this._cls1
    implements android.content.nCancelListener
{

    final ressDialog this$1;

    public void onCancel(DialogInterface dialoginterface)
    {
        notification.progressDialog = null;
    }

    l.message()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/apache/cordova/dialogs/Notification$6

/* anonymous class */
    class Notification._cls6
        implements Runnable
    {

        final Notification this$0;
        final CordovaInterface val$cordova;
        final String val$message;
        final Notification val$notification;
        final String val$title;

        public void run()
        {
            notification.progressDialog = Notification.access$200(Notification.this, cordova);
            notification.progressDialog.setProgressStyle(1);
            notification.progressDialog.setTitle(title);
            notification.progressDialog.setMessage(message);
            notification.progressDialog.setCancelable(true);
            notification.progressDialog.setMax(100);
            notification.progressDialog.setProgress(0);
            notification.progressDialog.setOnCancelListener(new Notification._cls6._cls1());
            notification.progressDialog.show();
        }

            
            {
                this$0 = final_notification1;
                notification = notification2;
                cordova = cordovainterface;
                title = s;
                message = String.this;
                super();
            }
    }

}
