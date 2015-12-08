// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.List;

public final class g
{

    public static int a(Context context, float f)
    {
        return (int)(context.getResources().getDisplayMetrics().density * f + 0.5F);
    }

    public static boolean a(Context context)
    {
        ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
        return context.getPackageName().equals(((android.app.ActivityManager.RunningTaskInfo)activitymanager.getRunningTasks(1).get(0)).topActivity.getPackageName());
    }

    public static int b(Context context, float f)
    {
        return (int)(context.getResources().getDisplayMetrics().scaledDensity * f + 0.5F);
    }
}
