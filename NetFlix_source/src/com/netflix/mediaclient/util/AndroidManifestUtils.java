// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public final class AndroidManifestUtils
{

    public static final String APP_PACKAGE_NAME = "com.netflix.mediaclient";

    private AndroidManifestUtils()
    {
    }

    public static String getVersion(Context context)
    {
        String s = getVersionName(context);
        if (s == null)
        {
            return "";
        }
        int i = s.indexOf(" ");
        context = s;
        if (i > 0)
        {
            context = s.substring(0, i);
        }
        return context;
    }

    public static int getVersionCode(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context cannot be null!");
        }
        int i;
        try
        {
            context = context.getPackageManager().getPackageInfo("com.netflix.mediaclient", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        if (context == null)
        {
            return -1;
        }
        i = ((PackageInfo) (context)).versionCode;
        return i;
    }

    public static String getVersionName(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context cannot be null!");
        }
        try
        {
            context = context.getPackageManager().getPackageInfo("com.netflix.mediaclient", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (context == null)
        {
            return null;
        }
        context = ((PackageInfo) (context)).versionName;
        return context;
    }
}
