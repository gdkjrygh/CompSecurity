// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;

public final class f
{

    private static ApplicationInfo a;
    private static PackageInfo b;
    private static String c;
    private static String d;

    public f()
    {
    }

    public static ApplicationInfo a(Context context)
    {
        if (a == null)
        {
            PackageManager packagemanager = context.getPackageManager();
            try
            {
                a = packagemanager.getApplicationInfo(context.getPackageName(), 128);
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return a;
    }

    public static PackageInfo a(Context context, String s, int i)
    {
        context = context.getPackageManager();
        try
        {
            context = context.getPackageInfo(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static Uri a(Context context, String s)
    {
        if (s == null)
        {
            return Uri.parse(f(context));
        } else
        {
            return Uri.withAppendedPath(Uri.parse(f(context)), s);
        }
    }

    public static PackageInfo b(Context context)
    {
        if (b == null && context != null)
        {
            PackageManager packagemanager = context.getPackageManager();
            try
            {
                b = packagemanager.getPackageInfo(context.getPackageName(), 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return b;
    }

    public static boolean c(Context context)
    {
        return "com.aviary.android.feather".equals(context.getPackageName());
    }

    public static boolean d(Context context)
    {
        return false;
    }

    public static String e(Context context)
    {
        if (d == null)
        {
            d = (new StringBuilder()).append(context.getPackageName()).append(".AviaryCdsProvider").toString();
        }
        return d;
    }

    public static String f(Context context)
    {
        if (c == null)
        {
            c = (new StringBuilder()).append("content://").append(e(context)).toString();
        }
        return c;
    }
}
