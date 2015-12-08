// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import com.EnterpriseMobileBanking.Utils.Log;
import java.util.List;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.PluginResult;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            NotificationPlugin

class this._cls1
    implements android.content.Listener
{

    final ss._cls000 this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.ginResult, 0));
        NotificationPlugin.access$000().remove(dialoginterface);
    }

    l.negativeButton()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/EnterpriseMobileBanking/Plugins/NotificationPlugin$1

/* anonymous class */
    class NotificationPlugin._cls1
        implements Runnable
    {

        final NotificationPlugin this$0;
        final CallbackContext val$callbackContext;
        final String val$message;
        final JSONObject val$negativeButton;
        final JSONObject val$neutralButton;
        final JSONObject val$positiveButton;
        final String val$title;

        public void run()
        {
            Object obj;
            final boolean hasNeutralButton;
            if (neutralButton != null)
            {
                hasNeutralButton = true;
            } else
            {
                hasNeutralButton = false;
            }
            obj = new android.app.AlertDialog.Builder(cordova.getContext());
            if (message != null)
            {
                ((android.app.AlertDialog.Builder) (obj)).setMessage(message);
            }
            if (title != null)
            {
                if (title.indexOf("SM") > 0)
                {
                    int i = title.indexOf("SM");
                    if (i >= 0)
                    {
                        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(title);
                        spannablestringbuilder.setSpan(new RelativeSizeSpan(0.6F), i, i + 2, 33);
                        spannablestringbuilder.setSpan(new SuperscriptSpan(), i, i + 2, 33);
                        ((android.app.AlertDialog.Builder) (obj)).setTitle(spannablestringbuilder);
                    }
                } else
                {
                    ((android.app.AlertDialog.Builder) (obj)).setTitle(title);
                }
            }
            ((android.app.AlertDialog.Builder) (obj)).setCancelable(true);
            if (positiveButton != null)
            {
                ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(Html.fromHtml(positiveButton.getString("text")).toString(), new NotificationPlugin._cls1._cls1());
            }
            if (!hasNeutralButton)
            {
                break MISSING_BLOCK_LABEL_207;
            }
            ((android.app.AlertDialog.Builder) (obj)).setNeutralButton(Html.fromHtml(neutralButton.getString("text")).toString(), new NotificationPlugin._cls1._cls2());
            if (negativeButton != null)
            {
                ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(Html.fromHtml(negativeButton.getString("text")), new NotificationPlugin._cls1._cls3());
            }
_L2:
            ((android.app.AlertDialog.Builder) (obj)).setOnCancelListener(new NotificationPlugin._cls1._cls4());
            obj = ((android.app.AlertDialog.Builder) (obj)).show();
            ((AlertDialog) (obj)).setCanceledOnTouchOutside(false);
            NotificationPlugin.access$000().add(obj);
            return;
            JSONException jsonexception;
            jsonexception;
            Log.v("NotificationPlugin", "problem getting button text");
            if (true) goto _L2; else goto _L1
_L1:
        }

            
            {
                this$0 = final_notificationplugin;
                neutralButton = jsonobject;
                message = s;
                title = s1;
                positiveButton = jsonobject1;
                callbackContext = callbackcontext;
                negativeButton = JSONObject.this;
                super();
            }

        // Unreferenced inner class com/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$2

/* anonymous class */
        class NotificationPlugin._cls1._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final NotificationPlugin._cls1 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 1));
                NotificationPlugin.access$000().remove(dialoginterface);
            }

                    
                    {
                        this$1 = NotificationPlugin._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$3

/* anonymous class */
        class NotificationPlugin._cls1._cls3
            implements android.content.DialogInterface.OnClickListener
        {

            final NotificationPlugin._cls1 this$1;
            final boolean val$hasNeutralButton;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                NotificationPlugin.access$000().remove(dialoginterface);
                dialoginterface = callbackContext;
                org.apache.cordova.api.PluginResult.Status status = org.apache.cordova.api.PluginResult.Status.OK;
                if (hasNeutralButton)
                {
                    i = 2;
                } else
                {
                    i = 1;
                }
                dialoginterface.sendPluginResult(new PluginResult(status, i));
            }

                    
                    {
                        this$1 = NotificationPlugin._cls1.this;
                        hasNeutralButton = flag;
                        super();
                    }
        }


        // Unreferenced inner class com/EnterpriseMobileBanking/Plugins/NotificationPlugin$1$4

/* anonymous class */
        class NotificationPlugin._cls1._cls4
            implements android.content.DialogInterface.OnCancelListener
        {

            final NotificationPlugin._cls1 this$1;
            final boolean val$hasNeutralButton;

            public void onCancel(DialogInterface dialoginterface)
            {
                if (negativeButton != null)
                {
                    CallbackContext callbackcontext = callbackContext;
                    org.apache.cordova.api.PluginResult.Status status = org.apache.cordova.api.PluginResult.Status.OK;
                    byte byte0;
                    if (hasNeutralButton)
                    {
                        byte0 = 2;
                    } else
                    {
                        byte0 = 1;
                    }
                    callbackcontext.sendPluginResult(new PluginResult(status, byte0));
                }
                NotificationPlugin.access$000().remove(dialoginterface);
            }

                    
                    {
                        this$1 = NotificationPlugin._cls1.this;
                        hasNeutralButton = flag;
                        super();
                    }
        }

    }

}
