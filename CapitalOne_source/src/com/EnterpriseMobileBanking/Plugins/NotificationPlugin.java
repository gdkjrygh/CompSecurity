// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import com.EnterpriseMobileBanking.Utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.cordova.Notification;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NotificationPlugin extends Notification
{

    private static final String TAG = "NotificationPlugin";
    private static android.content.DialogInterface.OnCancelListener baseCancelListener = new android.content.DialogInterface.OnCancelListener() {

        public void onCancel(DialogInterface dialoginterface)
        {
            dialoginterface.dismiss();
            NotificationPlugin.dialogs.remove(dialoginterface);
        }

    };
    private static android.content.DialogInterface.OnClickListener baseCloseListener = new android.content.DialogInterface.OnClickListener() {

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface.dismiss();
            NotificationPlugin.dialogs.remove(dialoginterface);
        }

    };
    private static final List dialogs = new ArrayList();

    public NotificationPlugin()
    {
    }

    public static void alertOK(String s, String s1, Context context)
    {
        context = new android.app.AlertDialog.Builder(context);
        if (s1 != null)
        {
            context.setMessage(s1);
        }
        if (s != null)
        {
            context.setTitle(s);
        }
        context.setCancelable(true);
        context.setPositiveButton("OK", baseCloseListener);
        context.setOnCancelListener(baseCancelListener);
        dialogs.add(context.show());
    }

    public static void closeAllDialogs()
    {
        Iterator iterator = dialogs.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AlertDialog alertdialog = (AlertDialog)iterator.next();
            if (alertdialog.isShowing())
            {
                alertdialog.dismiss();
            }
        } while (true);
    }

    public void alert(final String title, final String message, final JSONObject positiveButton, final JSONObject neutralButton, final JSONObject negativeButton, final CallbackContext callbackContext)
    {
        this;
        JVM INSTR monitorenter ;
        CordovaInterface cordovainterface = cordova;
        title = new Runnable() {

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
                boolean flag;
                if (neutralButton != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
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
                    ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(Html.fromHtml(positiveButton.getString("text")).toString(), new android.content.DialogInterface.OnClickListener() {

                        final _cls1 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.dismiss();
                            callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 0));
                            NotificationPlugin.dialogs.remove(dialoginterface);
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                }
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_207;
                }
                ((android.app.AlertDialog.Builder) (obj)).setNeutralButton(Html.fromHtml(neutralButton.getString("text")).toString(), new android.content.DialogInterface.OnClickListener() {

                    final _cls1 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.dismiss();
                        callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, 1));
                        NotificationPlugin.dialogs.remove(dialoginterface);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                if (negativeButton != null)
                {
                    ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(Html.fromHtml(negativeButton.getString("text")), flag. new android.content.DialogInterface.OnClickListener() {

                        final _cls1 this$1;
                        final boolean val$hasNeutralButton;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.dismiss();
                            NotificationPlugin.dialogs.remove(dialoginterface);
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
                this$1 = final__pcls1;
                hasNeutralButton = Z.this;
                super();
            }
                    });
                }
_L2:
                ((android.app.AlertDialog.Builder) (obj)).setOnCancelListener(flag. new android.content.DialogInterface.OnCancelListener() {

                    final _cls1 this$1;
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
                        NotificationPlugin.dialogs.remove(dialoginterface);
                    }

            
            {
                this$1 = final__pcls1;
                hasNeutralButton = Z.this;
                super();
            }
                });
                obj = ((android.app.AlertDialog.Builder) (obj)).show();
                ((AlertDialog) (obj)).setCanceledOnTouchOutside(false);
                NotificationPlugin.dialogs.add(obj);
                return;
                JSONException jsonexception;
                jsonexception;
                Log.v("NotificationPlugin", "problem getting button text");
                if (true) goto _L2; else goto _L1
_L1:
            }

            
            {
                this$0 = NotificationPlugin.this;
                neutralButton = jsonobject;
                message = s;
                title = s1;
                positiveButton = jsonobject1;
                callbackContext = callbackcontext;
                negativeButton = jsonobject2;
                super();
            }
        };
        cordova.getActivity().runOnUiThread(title);
        this;
        JVM INSTR monitorexit ;
        return;
        title;
        throw title;
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        Object obj;
        String s1;
        obj = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK);
        if (!s.equals("show"))
        {
            break MISSING_BLOCK_LABEL_250;
        }
        obj = jsonarray.optString(0, null);
        s = jsonarray.optString(1, null);
        obj = Html.fromHtml(((String) (obj))).toString();
        s1 = Html.fromHtml(s).toString();
        s = new JSONArray();
        jsonarray = jsonarray.getJSONArray(2);
        s = jsonarray;
_L1:
        int j = s.length();
        jsonarray = new JSONObject[3];
        jsonarray[0] = null;
        jsonarray[1] = null;
        jsonarray[2] = null;
        int i = 0;
        while (i < j) 
        {
            try
            {
                jsonarray[i] = s.getJSONObject(i);
                Log.v("NotificationPlugin", jsonarray[i].toString());
            }
            catch (JSONException jsonexception)
            {
                Log.v("NotificationPlugin", (new StringBuilder()).append("Can't get JSONObeject from button: ").append(i).toString());
            }
            i++;
        }
        break MISSING_BLOCK_LABEL_176;
        jsonarray;
        Log.v("NotificationPlugin", "Can't get JSONArray of buttons from args");
          goto _L1
        if (jsonarray[2] == null && jsonarray[1] != null)
        {
            jsonarray[2] = jsonarray[1];
            jsonarray[1] = null;
        }
        Log.v("NotificationPlugin", jsonarray[0].toString());
        alert(((String) (obj)), s1, jsonarray[0], jsonarray[1], jsonarray[2], callbackcontext);
        s = new PluginResult(org.apache.cordova.api.PluginResult.Status.NO_RESULT);
        s.setKeepCallback(true);
        callbackcontext.sendPluginResult(s);
        return true;
        callbackcontext.sendPluginResult(((PluginResult) (obj)));
        return true;
    }


}
