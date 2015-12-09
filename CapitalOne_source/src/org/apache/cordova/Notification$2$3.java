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

class this._cls1
    implements android.content.nClickListener
{

    final Status this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.us.OK, 3));
    }

    xt()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/apache/cordova/Notification$2

/* anonymous class */
    class Notification._cls2
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
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(cordova.getActivity());
            builder.setMessage(message);
            builder.setTitle(title);
            builder.setCancelable(true);
            if (fButtons.length > 0)
            {
                builder.setNegativeButton(fButtons[0], new Notification._cls2._cls1());
            }
            if (fButtons.length > 1)
            {
                builder.setNeutralButton(fButtons[1], new Notification._cls2._cls2());
            }
            if (fButtons.length > 2)
            {
                builder.setPositiveButton(fButtons[2], new Notification._cls2._cls3());
            }
            builder.setOnCancelListener(new Notification._cls2._cls4());
            builder.create();
            builder.show();
        }

            
            {
                this$0 = final_notification;
                cordova = cordovainterface;
                message = s;
                title = s1;
                fButtons = as;
                callbackContext = CallbackContext.this;
                super();
            }

        // Unreferenced inner class org/apache/cordova/Notification$2$1

/* anonymous class */
        class Notification._cls2._cls1
            implements android.content.DialogInterface.OnClickListener
        {

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
        }


        // Unreferenced inner class org/apache/cordova/Notification$2$2

/* anonymous class */
        class Notification._cls2._cls2
            implements android.content.DialogInterface.OnClickListener
        {

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
        }


        // Unreferenced inner class org/apache/cordova/Notification$2$4

/* anonymous class */
        class Notification._cls2._cls4
            implements android.content.DialogInterface.OnCancelListener
        {

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
        }

    }

}
