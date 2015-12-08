// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;

public class c
{

    private static final String a = com/cardinalblue/android/b/c.getSimpleName();

    public c()
    {
    }

    public static String a()
    {
        return "Android";
    }

    public static String a(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "version unavailable";
        }
        return context;
    }

    public static String b()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public static String b(Context context)
    {
        return (new StringBuilder()).append("android-").append(a(context)).toString();
    }

    public static String c()
    {
        return Build.MODEL;
    }

    public static String c(Context context)
    {
        Object obj = context.getResources();
        obj = ((Resources) (obj)).getText(((Resources) (obj)).getIdentifier("application_name", "string", context.getPackageName())).toString();
        context = a(context);
        return (new StringBuilder()).append(((String) (obj))).append(" ").append(context).append(" (Android ").append(android.os.Build.VERSION.RELEASE).append(", ").append(Build.BRAND).append(" ").append(Build.DEVICE).append("/").append(Build.DISPLAY).append("/").append(Build.MODEL).append(")").toString();
    }

    public static float d(Context context)
    {
        return context.getResources().getDisplayMetrics().density;
    }

}
