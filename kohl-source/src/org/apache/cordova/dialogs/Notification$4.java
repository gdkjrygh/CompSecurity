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

class val.callbackContext
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
        final EditText promptInput = new EditText(val$cordova.getActivity());
        promptInput.setHint(val$defaultText);
        android.app.lder lder = Notification.access$000(Notification.this, val$cordova);
        lder.setMessage(val$message);
        lder.setTitle(val$title);
        lder.setCancelable(true);
        lder.setView(promptInput);
        final JSONObject result = new JSONObject();
        if (val$buttonLabels.length() > 0)
        {
            try
            {
                lder.setNegativeButton(val$buttonLabels.getString(0), new android.content.DialogInterface.OnClickListener() {

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
                });
            }
            catch (JSONException jsonexception2) { }
        }
        if (val$buttonLabels.length() > 1)
        {
            try
            {
                lder.setNeutralButton(val$buttonLabels.getString(1), new android.content.DialogInterface.OnClickListener() {

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
                });
            }
            catch (JSONException jsonexception1) { }
        }
        if (val$buttonLabels.length() > 2)
        {
            try
            {
                lder.setPositiveButton(val$buttonLabels.getString(2), new android.content.DialogInterface.OnClickListener() {

                    final Notification._cls4 this$1;
                    final EditText val$promptInput;
                    final JSONObject val$result;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.dismiss();
                        JSONObject jsonobject;
                        result.put("buttonIndex", 3);
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
                });
            }
            catch (JSONException jsonexception) { }
        }
        lder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

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
        });
        Notification.access$100(Notification.this, lder);
    }

    _cls4.val.promptInput()
    {
        this$0 = final_notification;
        val$cordova = cordovainterface;
        val$defaultText = s;
        val$message = s1;
        val$title = s2;
        val$buttonLabels = jsonarray;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
