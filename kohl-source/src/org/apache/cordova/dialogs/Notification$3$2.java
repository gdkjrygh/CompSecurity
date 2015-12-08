// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.dialogs;

import android.content.DialogInterface;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova.dialogs:
//            Notification

class this._cls1
    implements android.content.nClickListener
{

    final nResult this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.us.OK, 2));
    }

    l.callbackContext()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/apache/cordova/dialogs/Notification$3

/* anonymous class */
    class Notification._cls3
        implements Runnable
    {

        final Notification this$0;
        final JSONArray val$buttonLabels;
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
            if (buttonLabels.length() > 0)
            {
                try
                {
                    builder.setNegativeButton(buttonLabels.getString(0), new Notification._cls3._cls1());
                }
                catch (JSONException jsonexception2) { }
            }
            if (buttonLabels.length() > 1)
            {
                try
                {
                    builder.setNeutralButton(buttonLabels.getString(1), new Notification._cls3._cls2());
                }
                catch (JSONException jsonexception1) { }
            }
            if (buttonLabels.length() > 2)
            {
                try
                {
                    builder.setPositiveButton(buttonLabels.getString(2), new Notification._cls3._cls3());
                }
                catch (JSONException jsonexception) { }
            }
            builder.setOnCancelListener(new Notification._cls3._cls4());
            Notification.access$100(Notification.this, builder);
        }

            
            {
                this$0 = final_notification;
                cordova = cordovainterface;
                message = s;
                title = s1;
                buttonLabels = jsonarray;
                callbackContext = CallbackContext.this;
                super();
            }

        // Unreferenced inner class org/apache/cordova/dialogs/Notification$3$1

/* anonymous class */
        class Notification._cls3._cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final Notification._cls3 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 1));
            }

                    
                    {
                        this$1 = Notification._cls3.this;
                        super();
                    }
        }


        // Unreferenced inner class org/apache/cordova/dialogs/Notification$3$3

/* anonymous class */
        class Notification._cls3._cls3
            implements android.content.DialogInterface.OnClickListener
        {

            final Notification._cls3 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 3));
            }

                    
                    {
                        this$1 = Notification._cls3.this;
                        super();
                    }
        }


        // Unreferenced inner class org/apache/cordova/dialogs/Notification$3$4

/* anonymous class */
        class Notification._cls3._cls4
            implements android.content.DialogInterface.OnCancelListener
        {

            final Notification._cls3 this$1;

            public void onCancel(DialogInterface dialoginterface)
            {
                dialoginterface.dismiss();
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, 0));
            }

                    
                    {
                        this$1 = Notification._cls3.this;
                        super();
                    }
        }

    }

}
