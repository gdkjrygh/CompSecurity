// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import b;

public class BuildInfo
{

    private BuildInfo()
    {
    }

    public static String getAndroidBuildFingerprint()
    {
        return Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), 128));
    }

    public static String getAndroidBuildId()
    {
        return Build.ID;
    }

    public static String getBrand()
    {
        return Build.BRAND;
    }

    public static String getBuildType()
    {
        return Build.TYPE;
    }

    public static String getDevice()
    {
        return Build.DEVICE;
    }

    public static String getDeviceManufacturer()
    {
        return Build.MANUFACTURER;
    }

    public static String getDeviceModel()
    {
        return Build.MODEL;
    }

    public static String getPackageLabel(Context context)
    {
        try
        {
            PackageManager packagemanager = context.getPackageManager();
            context = packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(context.getPackageName(), 128));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "";
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        return context.toString();
        return "";
    }

    public static String getPackageName(Context context)
    {
        if (context != null)
        {
            context = context.getPackageName();
        } else
        {
            context = null;
        }
        if (context != null)
        {
            return context;
        } else
        {
            return "";
        }
    }

    public static String getPackageVersionCode(Context context)
    {
        Object obj = "versionCode not available.";
        Object obj1;
        PackageInfo packageinfo;
        try
        {
            packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((String) (obj));
        }
        context = "";
        obj1 = context;
        obj = context;
        if (packageinfo.versionCode <= 0)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj = context;
        obj1 = Integer.toString(packageinfo.versionCode);
        return ((String) (obj1));
    }

    public static String getPackageVersionName(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "versionName not available";
        }
        return context;
    }

    public static int getSdkInt()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public static boolean hasLanguageApkSplits(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (((PackageInfo) (context = b.A(context))).splitNames != null)
        {
            int i = 0;
            while (i < ((PackageInfo) (context)).splitNames.length) 
            {
                String s = ((PackageInfo) (context)).splitNames[i];
                boolean flag;
                if (s.length() == 9 && s.startsWith("config."))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    return true;
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
