// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.badge;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.pinterest.reporting.CrashReporting;

// Referenced classes of package com.pinterest.ui.badge:
//            AppBadgeBase

public class AppBadgeSamsung extends AppBadgeBase
{

    private static final String CONTENT_BADGE_COUNT = "badgecount";
    private static final String CONTENT_CLASS = "class";
    private static final String CONTENT_NAME = "package=? AND class=?";
    private static final String CONTENT_PACKAGE = "package";
    private static final String CONTENT_URI = "content://com.sec.badge/apps";
    private static final String INTENT_ACTION = "android.intent.action.BADGE_COUNT_UPDATE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "badge_count_class_name";
    private static final String INTENT_EXTRA_BADGE_COUNT = "badge_count";
    private static final String INTENT_EXTRA_PACKAGE_NAME = "badge_count_package_name";
    public static final String LAUNCHERS[] = {
        "com.sec.android.app.launcher", "com.sec.android.app.twlauncher"
    };

    public AppBadgeSamsung()
    {
    }

    private static boolean isIntentSupported()
    {
        return android.os.Build.VERSION.SDK_INT >= 22;
    }

    private void updateBadgeByContentProvider(Context context, int i)
    {
        String s = getPackageName(context);
        String s1 = getLaunchActivityName(context);
        context = context.getContentResolver();
        Uri uri = Uri.parse("content://com.sec.badge/apps");
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("package", s);
        contentvalues.put("class", s1);
        contentvalues.put("badgecount", Integer.valueOf(i));
        if (context.update(uri, contentvalues, "package=? AND class=?", new String[] {
    s, s1
}) == 0)
        {
            context.insert(uri, contentvalues);
        }
    }

    private void updateBadgeByIntent(Context context, int i)
    {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", getPackageName(context));
        intent.putExtra("badge_count_class_name", getLaunchActivityName(context));
        context.sendBroadcast(intent);
    }

    public boolean isSupported(Context context)
    {
        if (isIntentSupported())
        {
            return true;
        }
        try
        {
            Uri uri = Uri.parse("content://com.sec.badge/apps");
            context = context.getContentResolver().query(uri, null, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            CrashReporting.a(context);
            context = null;
        }
        if (context != null)
        {
            context.close();
            return true;
        } else
        {
            return false;
        }
    }

    public void updateBadge(Context context, int i)
    {
        if (isIntentSupported())
        {
            updateBadgeByIntent(context, i);
            return;
        } else
        {
            updateBadgeByContentProvider(context, i);
            return;
        }
    }

}
