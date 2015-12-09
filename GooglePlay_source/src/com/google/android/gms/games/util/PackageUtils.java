// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GooglePlayServicesUtil;

public final class PackageUtils
{

    public static String getVersionName(Context context, String s)
    {
        context = context.getPackageManager();
        try
        {
            context = context.getPackageInfo(s, 128).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static boolean isPackageInstalled(Context context, String s)
    {
        return isPackageInstalled(context.getPackageManager(), s);
    }

    private static boolean isPackageInstalled(PackageManager packagemanager, String s)
    {
        try
        {
            packagemanager.getPackageInfo(s, 1);
        }
        // Misplaced declaration of an exception variable
        catch (PackageManager packagemanager)
        {
            return false;
        }
        return true;
    }

    public static boolean isPackageRestricted(Context context, String s)
    {
        while (!GooglePlayServicesUtil.isRestrictedUserProfile(context) || isPackageInstalled(context, s)) 
        {
            return false;
        }
        return true;
    }
}
