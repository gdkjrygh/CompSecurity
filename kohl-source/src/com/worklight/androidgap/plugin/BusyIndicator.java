// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.app.ProgressDialog;
import java.util.concurrent.Semaphore;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class BusyIndicator extends CordovaPlugin
{

    public static final String ACTION_HIDE = "hide";
    public static final String ACTION_SHOW = "show";
    private final Semaphore available = new Semaphore(1, true);
    private boolean isShowing;
    private ProgressDialog spinnerDialog;

    public BusyIndicator()
    {
        spinnerDialog = null;
        isShowing = false;
    }

    private void acquireSemaphore()
    {
        try
        {
            available.acquire();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if (!"show".equals(s))
        {
            break MISSING_BLOCK_LABEL_26;
        }
        show(jsonarray.getString(0));
        callbackcontext.success("true");
        return true;
        if (!"hide".equals(s))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        hide();
        callbackcontext.success("true");
        return true;
        try
        {
            callbackcontext.error((new StringBuilder()).append("Invalid action: ").append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            callbackcontext.error((new StringBuilder()).append("Action: ").append(s).append(" failed. JSON Error is: ").append(jsonarray.getLocalizedMessage()).toString());
            return true;
        }
        return true;
    }

    public void hide()
    {
        acquireSemaphore();
        Runnable runnable = new Runnable() {

            final BusyIndicator this$0;

            public void run()
            {
                if (spinnerDialog != null)
                {
                    spinnerDialog.dismiss();
                    spinnerDialog = null;
                }
                isShowing = false;
                available.release();
            }

            
            {
                this$0 = BusyIndicator.this;
                super();
            }
        };
        cordova.getActivity().runOnUiThread(runnable);
    }

    public boolean isShowing()
    {
        return isShowing;
    }

    public void show(final String text)
    {
        acquireSemaphore();
        if (spinnerDialog != null)
        {
            spinnerDialog.dismiss();
            spinnerDialog = null;
        }
        text = new Runnable() {

            final BusyIndicator this$0;
            final String val$text;

            public void run()
            {
                spinnerDialog = new ProgressDialog(cordova.getActivity());
                spinnerDialog.setCancelable(false);
                spinnerDialog.setCanceledOnTouchOutside(false);
                spinnerDialog.setIndeterminate(true);
                spinnerDialog.setMessage((new StringBuilder()).append(text).append(" ").toString());
                if (!cordova.getActivity().isFinishing())
                {
                    spinnerDialog.show();
                    isShowing = true;
                }
                available.release();
            }

            
            {
                this$0 = BusyIndicator.this;
                text = s;
                super();
            }
        };
        cordova.getActivity().runOnUiThread(text);
    }



/*
    static ProgressDialog access$002(BusyIndicator busyindicator, ProgressDialog progressdialog)
    {
        busyindicator.spinnerDialog = progressdialog;
        return progressdialog;
    }

*/


/*
    static boolean access$102(BusyIndicator busyindicator, boolean flag)
    {
        busyindicator.isShowing = flag;
        return flag;
    }

*/

}
