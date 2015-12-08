// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import org.apache.cordova.api.CordovaInterface;

// Referenced classes of package org.apache.cordova:
//            Notification

class this._cls1
    implements android.content.nCancelListener
{

    final nerDialog this$1;

    public void onCancel(DialogInterface dialoginterface)
    {
        spinnerDialog = null;
    }

    l.message()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/apache/cordova/Notification$3

/* anonymous class */
    class Notification._cls3
        implements Runnable
    {

        final Notification this$0;
        final CordovaInterface val$cordova;
        final String val$message;
        final String val$title;

        public void run()
        {
            spinnerDialog = ProgressDialog.show(cordova.getActivity(), title, message, true, true, new Notification._cls3._cls1());
        }

            
            {
                this$0 = final_notification;
                cordova = cordovainterface;
                title = s;
                message = String.this;
                super();
            }
    }

}
