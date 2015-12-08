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

class this._cls1
    implements android.content.nClickListener
{

    final nResult this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.us.OK, 0));
    }

    l.callbackContext()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/apache/cordova/dialogs/Notification$2

/* anonymous class */
    class Notification._cls2
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
            android.app.AlertDialog.Builder builder = Notification.access$000(Notification.this, cordova);
            builder.setMessage(message);
            builder.setTitle(title);
            builder.setCancelable(true);
            builder.setPositiveButton(buttonLabel, new Notification._cls2._cls1());
            builder.setOnCancelListener(new Notification._cls2._cls2());
            Notification.access$100(Notification.this, builder);
        }

            
            {
                this$0 = final_notification;
                cordova = cordovainterface;
                message = s;
                title = s1;
                buttonLabel = s2;
                callbackContext = CallbackContext.this;
                super();
            }

        // Unreferenced inner class org/apache/cordova/dialogs/Notification$2$2

/* anonymous class */
        class Notification._cls2._cls2
            implements android.content.DialogInterface.OnCancelListener
        {

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
        }

    }

}
