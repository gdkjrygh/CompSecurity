// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import com.soundcloud.android.properties.ApplicationProperties;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.utils:
//            ErrorUtils, AndroidUtils, DeviceHelper

public class BugReporter
{

    private static final String EMAIL_MESSAGE_FORMAT_RFC822 = "message/rfc822";
    private static final String LOGCAT_FILE_NAME = "logcat.txt";
    private final ApplicationProperties applicationProperties;
    private final DeviceHelper deviceHelper;
    private final Resources resources;

    public BugReporter(ApplicationProperties applicationproperties, DeviceHelper devicehelper, Resources resources1)
    {
        applicationProperties = applicationproperties;
        deviceHelper = devicehelper;
        resources = resources1;
    }

    private void deletePreviousLogcatDump()
    {
        (new File(Environment.getExternalStorageDirectory(), "logcat.txt")).delete();
    }

    private void sendLogs(Context context, String s, String s1, String s2, String s3)
    {
        deletePreviousLogcatDump();
        File file = new File(Environment.getExternalStorageDirectory(), "logcat.txt");
        try
        {
            Object obj = String.format("logcat -v time -df %s", new Object[] {
                file.getAbsolutePath()
            });
            Runtime.getRuntime().exec(((String) (obj)));
            obj = new Intent("android.intent.action.SEND");
            ((Intent) (obj)).setType("message/rfc822");
            ((Intent) (obj)).putExtra("android.intent.extra.EMAIL", new String[] {
                s
            });
            ((Intent) (obj)).putExtra("android.intent.extra.SUBJECT", s1);
            ((Intent) (obj)).putExtra("android.intent.extra.TEXT", s2);
            ((Intent) (obj)).putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
            context.startActivity(Intent.createChooser(((Intent) (obj)), s3));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ErrorUtils.handleSilentException(s);
        }
        AndroidUtils.showToast(context, 0x7f0702b0, new Object[0]);
    }

    private void showFeedbackDialog(final Context context, int i)
    {
        final String feedbackOptions[] = resources.getStringArray(i);
        (new android.support.v7.app.AlertDialog.Builder(context)).setTitle(0x7f07030d).setItems(feedbackOptions, new _cls1()).show();
    }

    public void showGeneralFeedbackDialog(Context context)
    {
        showFeedbackDialog(context, 0x7f08000c);
    }

    public void showSignInFeedbackDialog(Context context)
    {
        showFeedbackDialog(context, 0x7f08000d);
    }





    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final BugReporter this$0;
        final Context val$context;
        final String val$feedbackOptions[];

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = feedbackOptions[i];
            String s = resources.getString(0x7f0702ac, new Object[] {
                dialoginterface
            });
            String s1 = resources.getString(0x7f0702ab);
            if (dialoginterface.equals(resources.getString(0x7f0702ae)))
            {
                dialoginterface = applicationProperties.getPlaybackFeedbackEmail();
            } else
            {
                dialoginterface = applicationProperties.getFeedbackEmail();
            }
            sendLogs(context, dialoginterface, s, deviceHelper.getUserAgent(), s1);
        }

        _cls1()
        {
            this$0 = BugReporter.this;
            feedbackOptions = as;
            context = context1;
            super();
        }
    }

}
