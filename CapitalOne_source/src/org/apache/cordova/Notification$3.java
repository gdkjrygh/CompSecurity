// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import org.apache.cordova.api.CordovaInterface;

// Referenced classes of package org.apache.cordova:
//            Notification

class val.message
    implements Runnable
{

    final Notification this$0;
    final CordovaInterface val$cordova;
    final String val$message;
    final String val$title;

    public void run()
    {
        spinnerDialog = ProgressDialog.show(val$cordova.getActivity(), val$title, val$message, true, true, new android.content.DialogInterface.OnCancelListener() {

            final Notification._cls3 this$1;

            public void onCancel(DialogInterface dialoginterface)
            {
                spinnerDialog = null;
            }

            
            {
                this$1 = Notification._cls3.this;
                super();
            }
        });
    }

    rface()
    {
        this$0 = final_notification;
        val$cordova = cordovainterface;
        val$title = s;
        val$message = String.this;
        super();
    }
}
