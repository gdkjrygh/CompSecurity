// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

public final class cd
{

    private static final ce a;

    public static Intent a(Context context, ComponentName componentname)
    {
        String s = b(context, componentname);
        if (s == null)
        {
            return null;
        }
        componentname = new ComponentName(componentname.getPackageName(), s);
        if (b(context, componentname) == null)
        {
            return ee.a(componentname);
        } else
        {
            return (new Intent()).setComponent(componentname);
        }
    }

    public static void a(Activity activity)
    {
        Intent intent = b(activity);
        if (intent == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Activity ")).append(activity.getClass().getSimpleName()).append(" does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> ").append(" element in your manifest?)").toString());
        } else
        {
            b(activity, intent);
            return;
        }
    }

    public static boolean a(Activity activity, Intent intent)
    {
        return a.a(activity, intent);
    }

    public static Intent b(Activity activity)
    {
        return a.a(activity);
    }

    public static String b(Context context, ComponentName componentname)
    {
        componentname = context.getPackageManager().getActivityInfo(componentname, 128);
        return a.a(context, componentname);
    }

    public static void b(Activity activity, Intent intent)
    {
        a.b(activity, intent);
    }

    public static String c(Activity activity)
    {
        try
        {
            activity = b(activity, activity.getComponentName());
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new IllegalArgumentException(activity);
        }
        return activity;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new cf();
        } else
        {
            a = new ce();
        }
    }
}
