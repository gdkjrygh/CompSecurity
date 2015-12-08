// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package hu.dpal.phonegap.plugins;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.MotionEvent;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

public class CallbackProgressDialog extends ProgressDialog
{

    public static CallbackContext callbackContext;

    public CallbackProgressDialog(Context context)
    {
        super(context);
    }

    private void sendCallback()
    {
        PluginResult pluginresult = new PluginResult(org.apache.cordova.PluginResult.Status.OK);
        pluginresult.setKeepCallback(true);
        callbackContext.sendPluginResult(pluginresult);
    }

    public static CallbackProgressDialog show(Context context, CharSequence charsequence, CharSequence charsequence1, boolean flag, boolean flag1, android.content.DialogInterface.OnCancelListener oncancellistener, CallbackContext callbackcontext)
    {
        callbackContext = callbackcontext;
        context = new CallbackProgressDialog(context);
        context.setTitle(charsequence);
        context.setMessage(charsequence1);
        context.setIndeterminate(flag);
        context.setCancelable(flag1);
        context.setOnCancelListener(oncancellistener);
        context.show();
        return context;
    }

    public void onBackPressed()
    {
        sendCallback();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            sendCallback();
            return true;
        } else
        {
            return false;
        }
    }
}
