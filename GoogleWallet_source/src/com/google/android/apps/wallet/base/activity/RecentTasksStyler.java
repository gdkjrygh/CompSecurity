// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.activity;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.apps.wallet.util.async.ThreadPreconditions;

public final class RecentTasksStyler
{

    private static Bitmap icon = null;

    public static void styleRecentTasksEntry(Activity activity)
    {
        ThreadPreconditions.checkOnUiThread();
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            return;
        }
        Resources resources = activity.getResources();
        String s = resources.getString(activity.getApplicationInfo().labelRes);
        int i = resources.getColor(com.google.android.apps.walletnfcrel.R.color.primary);
        if (icon == null)
        {
            icon = BitmapFactory.decodeResource(resources, com.google.android.apps.walletnfcrel.R.drawable.ic_wallet_logo_white_36in48dp);
        }
        activity.setTaskDescription(new android.app.ActivityManager.TaskDescription(s, icon, i));
    }

}
