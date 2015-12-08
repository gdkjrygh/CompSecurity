// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.notification;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Application;
import com.pinterest.kit.application.Resources;
import java.util.List;

public class AppRater
{

    private static final boolean ALWAYS_SHOW = false;
    private static final String APP_NAME = Resources.string(0x7f07005d);
    private static final String APP_PACKAGE = Application.context().getPackageName();
    private static final String DIALOG_LATER_BT = Resources.string(0x7f07031a);
    private static final String DIALOG_MESSAGE = Resources.string(0x7f07047d, new Object[] {
        APP_NAME
    });
    private static final String DIALOG_NO_BT = Resources.string(0x7f070398);
    private static final String DIALOG_RATE_BT = Resources.string(0x7f07047c);
    private static final String DIALOG_TITLE = Resources.string(0x7f07047f, new Object[] {
        APP_NAME
    });
    private static final int LIMIT_DAYS = 7;
    private static final int LIMIT_EVENTS = 10;
    private static final int LIMIT_LAUNCHES = 5;
    private static final float REMIND_IN_DAYS = 1F;
    private static final long __LIMIT_MILLIS = 0x240c8400L;
    private static final String __MARKET_URI = String.format("market://details?id=%s", new Object[] {
        APP_PACKAGE
    });
    private static final String __PREF_DONT_SHOW = "ARater__DONT_SHOW";
    private static final String __PREF_EVENTS = "ARater__EVENTS";
    private static final String __PREF_LAUNCHES = "ARater__LAUNCHES";
    private static final String __PREF_LAUNCH_DATE = "ARater__LAUNCH_DATE";
    private static final String __PREF_NAME = "ARater";
    private static final String __PREF_REMINDED_DATE = "ARater__REMINDED_DATE";
    private static final long __REMINDED_MILLIS = 0x5265c00L;

    public AppRater()
    {
    }

    public static void conditionalShowRateDialog(Context context)
    {
        SharedPreferences sharedpreferences;
        if (context != null)
        {
            if (!(sharedpreferences = context.getSharedPreferences("ARater", 0)).getBoolean("ARater__DONT_SHOW", false))
            {
                long l = sharedpreferences.getLong("ARater__LAUNCH_DATE", 0L);
                long l1 = sharedpreferences.getLong("ARater__REMINDED_DATE", 0L);
                long l2 = sharedpreferences.getLong("ARater__LAUNCHES", 0L);
                long l3 = sharedpreferences.getLong("ARater__EVENTS", 0L);
                if (System.currentTimeMillis() >= l + 0x240c8400L && l2 >= 5L && l3 >= 10L && (l1 == 0L || System.currentTimeMillis() >= 0x5265c00L + l1))
                {
                    showRateDialog(context);
                    return;
                }
            }
        }
    }

    public static void registerEvent(Context context)
    {
        if (context != null)
        {
            if (!(context = context.getSharedPreferences("ARater", 0)).getBoolean("ARater__DONT_SHOW", false))
            {
                android.content.SharedPreferences.Editor editor = context.edit();
                editor.putLong("ARater__EVENTS", context.getLong("ARater__EVENTS", 0L) + 1L);
                editor.commit();
                return;
            }
        }
    }

    public static void registerLaunch(Context context)
    {
        if (context != null)
        {
            if (!(context = context.getSharedPreferences("ARater", 0)).getBoolean("ARater__DONT_SHOW", false))
            {
                android.content.SharedPreferences.Editor editor = context.edit();
                editor.putLong("ARater__LAUNCHES", context.getLong("ARater__LAUNCHES", 0L) + 1L);
                if (context.getLong("ARater__LAUNCH_DATE", 0L) == 0L)
                {
                    editor.putLong("ARater__LAUNCH_DATE", System.currentTimeMillis());
                }
                editor.commit();
                return;
            }
        }
    }

    public static void showRateDialog(final Context context)
    {
        Intent intent;
        if (context != null)
        {
            if (context.getPackageManager().queryIntentActivities(intent = new Intent("android.intent.action.VIEW", Uri.parse(__MARKET_URI)), 0x10000).size() != 0)
            {
                final android.content.SharedPreferences.Editor editor = context.getSharedPreferences("ARater", 0).edit();
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
                builder.setTitle(DIALOG_TITLE);
                builder.setMessage(DIALOG_MESSAGE);
                if (ModelHelper.isValid(DIALOG_RATE_BT))
                {
                    builder.setPositiveButton(DIALOG_RATE_BT, new _cls1());
                }
                if (ModelHelper.isValid(DIALOG_LATER_BT))
                {
                    builder.setNeutralButton(DIALOG_LATER_BT, new _cls2());
                }
                if (ModelHelper.isValid(DIALOG_NO_BT))
                {
                    builder.setNegativeButton(DIALOG_NO_BT, new _cls3());
                }
                builder.setOnCancelListener(new _cls4());
                builder.create().show();
                return;
            }
        }
    }



    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final Context val$context;
        final android.content.SharedPreferences.Editor val$editor;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AppRater.__MARKET_URI)));
            if (editor != null)
            {
                editor.putBoolean("ARater__DONT_SHOW", true);
                editor.commit();
            }
            dialoginterface.dismiss();
        }

        _cls1()
        {
            context = context1;
            editor = editor1;
            super();
        }
    }


    private class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        final android.content.SharedPreferences.Editor val$editor;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            if (editor != null)
            {
                editor.putLong("ARater__REMINDED_DATE", System.currentTimeMillis());
                editor.commit();
            }
            dialoginterface.dismiss();
        }

        _cls2()
        {
            editor = editor1;
            super();
        }
    }


    private class _cls3
        implements android.content.DialogInterface.OnClickListener
    {

        final android.content.SharedPreferences.Editor val$editor;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            if (editor != null)
            {
                editor.putBoolean("ARater__DONT_SHOW", true);
                editor.commit();
            }
            dialoginterface.dismiss();
        }

        _cls3()
        {
            editor = editor1;
            super();
        }
    }


    private class _cls4
        implements android.content.DialogInterface.OnCancelListener
    {

        final android.content.SharedPreferences.Editor val$editor;

        public final void onCancel(DialogInterface dialoginterface)
        {
            if (editor != null)
            {
                editor.putBoolean("ARater__DONT_SHOW", true);
                editor.commit();
            }
            dialoginterface.dismiss();
        }

        _cls4()
        {
            editor = editor1;
            super();
        }
    }

}
