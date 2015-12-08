// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

public final class ClientLibraryUtils
{

    public static int getClientVersion(Context context, String s)
    {
        context = getPackageInfo(context, s);
        if (context != null && ((PackageInfo) (context)).applicationInfo != null)
        {
            if ((context = ((PackageInfo) (context)).applicationInfo.metaData) != null)
            {
                return context.getInt("com.google.android.gms.version", -1);
            }
        }
        return -1;
    }

    private static PackageInfo getPackageInfo(Context context, String s)
    {
        context = context.getPackageManager();
        try
        {
            context = context.getPackageInfo(s, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static boolean isPackageStopped(Context context, String s)
    {
        boolean flag = false;
        context = context.getPackageManager();
        int i;
        try
        {
            i = context.getApplicationInfo(s, 0).flags;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if ((i & 0x200000) != 0)
        {
            flag = true;
        }
        return flag;
    }
}
