// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.common.NetflixAlertDialog;

public class MdxErrorHandler
{
    public static interface ErrorHandlerCallbacks
    {

        public abstract void destroy();
    }


    private static final String ERROR_DIALOG_ID = "mdx_error_dialog_id";
    private final NetflixActivity activity;
    private final ErrorHandlerCallbacks callbacks;
    private final String tag;

    public MdxErrorHandler(String s, NetflixActivity netflixactivity, ErrorHandlerCallbacks errorhandlercallbacks)
    {
        tag = s;
        activity = netflixactivity;
        callbacks = errorhandlercallbacks;
    }

    private String getErrorMessage(int i, String s)
    {
        switch (i)
        {
        default:
            if (Log.isLoggable(tag, 5))
            {
                Log.w(tag, (new StringBuilder()).append("We do not have official error message for error code ").append(i).toString());
            }
            // fall through

        case 300: 
            return s;

        case 100: // 'd'
            return activity.getString(0x7f0c0171);

        case 104: // 'h'
            return activity.getString(0x7f0c0172);

        case 105: // 'i'
            return activity.getString(0x7f0c0173);

        case 200: 
        case 201: 
            return activity.getString(0x7f0c0174);
        }
    }

    private void handleError(int i, String s)
    {
        s = NetflixAlertDialog.newInstance(new com.netflix.mediaclient.ui.common.NetflixAlertDialog.AlertDialogDescriptor(activity, "mdx_error_dialog_id", getErrorMessage(i, s), false, false));
        activity.showDialog(s);
    }

    private void sendToast(int i, String s)
    {
        Toast.makeText(activity, getErrorMessage(i, s), 1).show();
    }

    public boolean handleDialogButton(String s, String s1)
    {
        if (Log.isLoggable(tag, 3))
        {
            Log.d(tag, (new StringBuilder()).append("User pressed button ").append(s1).append(" for dialog ").append(s).toString());
        }
        if ("mdx_error_dialog_id".equals(s))
        {
            Log.d(tag, "User accepted error message. Exit activity");
            callbacks.destroy();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean handleDialogCancel(String s)
    {
        if (Log.isLoggable(tag, 3))
        {
            Log.d(tag, (new StringBuilder()).append("User canceled error message for dialog ").append(s).toString());
        }
        if ("mdx_error_dialog_id".equals(s))
        {
            Log.d(tag, "User canceled error message. Exit activity");
            callbacks.destroy();
        }
        return false;
    }

    public void handleMdxError(int i, String s)
    {
        if (Log.isLoggable(tag, 3))
        {
            Log.d(tag, (new StringBuilder()).append("Error received. Code: ").append(i).append(", message: ").append(s).toString());
        }
        if (activity.destroyed())
        {
            return;
        }
        if (i >= 100 && i < 200)
        {
            Log.d(tag, "Displaying error dialog");
            handleError(i, s);
            return;
        }
        if (i >= 200 && i < 300)
        {
            Log.d(tag, "Showing toast msg");
            sendToast(i, s);
            callbacks.destroy();
            return;
        } else
        {
            Log.d(tag, "Showing toast msg");
            sendToast(i, s);
            return;
        }
    }
}
