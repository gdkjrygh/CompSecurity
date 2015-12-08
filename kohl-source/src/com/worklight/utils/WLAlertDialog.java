// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Process;
import com.worklight.common.Logger;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.api.WLClient;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class WLAlertDialog
    implements Runnable
{

    public static final android.content.DialogInterface.OnClickListener exitListener = new android.content.DialogInterface.OnClickListener() {

        public void onClick(DialogInterface dialoginterface, int i)
        {
            Process.killProcess(Process.myPid());
        }

    };
    private static Logger logger = Logger.getInstance("wl.alertDialog");
    private android.content.DialogInterface.OnClickListener clickListener;
    private String message;
    private String positiveButtonText;
    private String title;

    public WLAlertDialog()
    {
    }

    public WLAlertDialog(String s, String s1)
    {
        init(s, s1, "WLClient.close");
    }

    public WLAlertDialog(String s, String s1, String s2)
    {
        init(s, s1, s2);
    }

    private void init(String s, String s1, String s2)
    {
        ResourceBundle resourcebundle;
        MissingResourceException missingresourceexception;
        try
        {
            resourcebundle = WLUtils.getMessagesBundle();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            logger.error(s.getMessage());
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        title = resourcebundle.getString(s);
        if (title == null)
        {
            title = s;
        }
_L4:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        message = resourcebundle.getString(s1);
        if (message == null)
        {
            message = s1;
        }
_L2:
        positiveButtonText = resourcebundle.getString(s2);
        if (positiveButtonText == null)
        {
            positiveButtonText = s2;
            return;
        }
        break; /* Loop/switch isn't completed */
        missingresourceexception;
        if (title == null)
        {
            title = s;
        }
        continue; /* Loop/switch isn't completed */
        s1;
        if (title == null)
        {
            title = s;
        }
        throw s1;
        s;
        if (message == null)
        {
            message = s1;
        }
        if (true) goto _L2; else goto _L1
        s;
        if (message == null)
        {
            message = s1;
        }
        throw s;
        s;
        if (positiveButtonText == null)
        {
            positiveButtonText = s2;
            return;
        }
          goto _L1
        s;
        if (positiveButtonText == null)
        {
            positiveButtonText = s2;
        }
        throw s;
_L1:
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public android.content.DialogInterface.OnClickListener getClickListener()
    {
        return clickListener;
    }

    public String getMessage()
    {
        return message;
    }

    public String getPositiveButtonText()
    {
        return positiveButtonText;
    }

    public String getTitle()
    {
        return title;
    }

    public void run()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder((Activity)WLClient.getInstance().getContext());
        builder.setMessage(message);
        builder.setTitle(title);
        builder.setPositiveButton(positiveButtonText, clickListener);
        builder.show();
    }

    public void setClickListener(android.content.DialogInterface.OnClickListener onclicklistener)
    {
        clickListener = onclicklistener;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setPositiveButtonText(String s)
    {
        positiveButtonText = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void show()
    {
        Activity activity = (Activity)WLClient.getInstance().getContext();
        if (activity == null)
        {
            return;
        }
        try
        {
            activity.runOnUiThread(this);
            return;
        }
        catch (Exception exception)
        {
            logger.error(exception.getMessage());
        }
        return;
    }

}
