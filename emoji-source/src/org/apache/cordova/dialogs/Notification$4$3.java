// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.dialogs;

import android.content.DialogInterface;
import android.widget.EditText;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.dialogs:
//            Notification

class val.promptInput
    implements android.content.nClickListener
{

    final val.promptInput this$1;
    final EditText val$promptInput;
    final JSONObject val$result;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        JSONObject jsonobject;
        val$result.put("buttonIndex", 3);
        jsonobject = val$result;
        if (val$promptInput.getText().toString().trim().length() != 0) goto _L2; else goto _L1
_L1:
        dialoginterface = defaultText;
_L3:
        jsonobject.put("input1", dialoginterface);
_L4:
        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.us.OK, val$result));
        return;
_L2:
        dialoginterface = val$promptInput.getText();
          goto _L3
        dialoginterface;
        dialoginterface.printStackTrace();
          goto _L4
    }

    l.callbackContext()
    {
        this$1 = final_callbackcontext;
        val$result = jsonobject;
        val$promptInput = EditText.this;
        super();
    }

    // Unreferenced inner class org/apache/cordova/dialogs/Notification$4

/* anonymous class */
    class Notification._cls4
        implements Runnable
    {

        final Notification this$0;
        final JSONArray val$buttonLabels;
        final CallbackContext val$callbackContext;
        final CordovaInterface val$cordova;
        final String val$defaultText;
        final String val$message;
        final String val$title;

        public void run()
        {
            final EditText promptInput = new EditText(cordova.getActivity());
            promptInput.setHint(defaultText);
            android.app.AlertDialog.Builder builder = Notification.access$000(Notification.this, cordova);
            builder.setMessage(message);
            builder.setTitle(title);
            builder.setCancelable(true);
            builder.setView(promptInput);
            final JSONObject result = new JSONObject();
            if (buttonLabels.length() > 0)
            {
                try
                {
                    builder.setNegativeButton(buttonLabels.getString(0), new Notification._cls4._cls1());
                }
                catch (JSONException jsonexception2) { }
            }
            if (buttonLabels.length() > 1)
            {
                try
                {
                    builder.setNeutralButton(buttonLabels.getString(1), new Notification._cls4._cls2());
                }
                catch (JSONException jsonexception1) { }
            }
            if (buttonLabels.length() > 2)
            {
                try
                {
                    builder.setPositiveButton(buttonLabels.getString(2), promptInput. new Notification._cls4._cls3());
                }
                catch (JSONException jsonexception) { }
            }
            builder.setOnCancelListener(new Notification._cls4._cls4());
            Notification.access$100(Notification.this, builder);
        }

            
            {
                this$0 = final_notification;
                cordova = cordovainterface;
                defaultText = s;
                message = s1;
                title = s2;
                buttonLabels = jsonarray;
                callbackContext = CallbackContext.this;
                super();
            }

        // Unreferenced inner class org/apache/cordova/dialogs/Notification$4$1

/* anonymous class */
        class Notification._cls4._cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final Notification._cls4 this$1;
            final EditText val$promptInput;
            final JSONObject val$result;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                JSONObject jsonobject;
                result.put("buttonIndex", 1);
                jsonobject = result;
                if (promptInput.getText().toString().trim().length() != 0) goto _L2; else goto _L1
_L1:
                dialoginterface = defaultText;
_L3:
                jsonobject.put("input1", dialoginterface);
_L4:
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, result));
                return;
_L2:
                dialoginterface = promptInput.getText();
                  goto _L3
                dialoginterface;
                dialoginterface.printStackTrace();
                  goto _L4
            }

                    
                    {
                        this$1 = Notification._cls4.this;
                        result = jsonobject;
                        promptInput = edittext;
                        super();
                    }
        }


        // Unreferenced inner class org/apache/cordova/dialogs/Notification$4$2

/* anonymous class */
        class Notification._cls4._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final Notification._cls4 this$1;
            final EditText val$promptInput;
            final JSONObject val$result;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                JSONObject jsonobject;
                result.put("buttonIndex", 2);
                jsonobject = result;
                if (promptInput.getText().toString().trim().length() != 0) goto _L2; else goto _L1
_L1:
                dialoginterface = defaultText;
_L3:
                jsonobject.put("input1", dialoginterface);
_L4:
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, result));
                return;
_L2:
                dialoginterface = promptInput.getText();
                  goto _L3
                dialoginterface;
                dialoginterface.printStackTrace();
                  goto _L4
            }

                    
                    {
                        this$1 = Notification._cls4.this;
                        result = jsonobject;
                        promptInput = edittext;
                        super();
                    }
        }


        // Unreferenced inner class org/apache/cordova/dialogs/Notification$4$4

/* anonymous class */
        class Notification._cls4._cls4
            implements android.content.DialogInterface.OnCancelListener
        {

            final Notification._cls4 this$1;
            final EditText val$promptInput;
            final JSONObject val$result;

            public void onCancel(DialogInterface dialoginterface)
            {
                dialoginterface.dismiss();
                JSONObject jsonobject;
                result.put("buttonIndex", 0);
                jsonobject = result;
                if (promptInput.getText().toString().trim().length() != 0) goto _L2; else goto _L1
_L1:
                dialoginterface = defaultText;
_L3:
                jsonobject.put("input1", dialoginterface);
_L4:
                callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, result));
                return;
_L2:
                dialoginterface = promptInput.getText();
                  goto _L3
                dialoginterface;
                dialoginterface.printStackTrace();
                  goto _L4
            }

                    
                    {
                        this$1 = Notification._cls4.this;
                        result = jsonobject;
                        promptInput = edittext;
                        super();
                    }
        }

    }

}
