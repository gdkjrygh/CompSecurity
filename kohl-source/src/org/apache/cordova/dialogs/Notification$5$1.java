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

    final nerDialog this$1;

    public void onCancel(DialogInterface dialoginterface)
    {
        notification.spinnerDialog = null;
    }

    l.message()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/apache/cordova/dialogs/Notification$5

/* anonymous class */
    class Notification._cls5
        implements Runnable
    {

        final Notification this$0;
        final CordovaInterface val$cordova;
        final String val$message;
        final Notification val$notification;
        final String val$title;

        public void run()
        {
            notification.spinnerDialog = Notification.access$200(Notification.this, cordova);
            notification.spinnerDialog.setTitle(title);
            notification.spinnerDialog.setMessage(message);
            notification.spinnerDialog.setCancelable(true);
            notification.spinnerDialog.setIndeterminate(true);
            notification.spinnerDialog.setOnCancelListener(new Notification._cls5._cls1());
            notification.spinnerDialog.show();
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
