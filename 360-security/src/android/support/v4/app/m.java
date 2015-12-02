// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;

class m
{

    public static Intent a(Activity activity)
    {
        return activity.getParentActivityIntent();
    }

    public static String a(ActivityInfo activityinfo)
    {
        return activityinfo.parentActivityName;
    }

    public static boolean a(Activity activity, Intent intent)
    {
        return activity.shouldUpRecreateTask(intent);
    }

    public static void b(Activity activity, Intent intent)
    {
        activity.navigateUpTo(intent);
    }
}
