// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;

public class a
{

    private static final String a = com/qihoo360/mobilesafe/a/a.getSimpleName();

    public a()
    {
    }

    public static int a(String s, PackageInfo packageinfo)
    {
        boolean flag;
        try
        {
            flag = a(packageinfo);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0;
        }
        return !flag ? 2 : 1;
    }

    public static int a(String s, PackageManager packagemanager)
    {
        boolean flag;
        try
        {
            flag = a(packagemanager.getPackageInfo(s, 0));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0;
        }
        return !flag ? 2 : 1;
    }

    public static List a(PackageManager packagemanager)
    {
        try
        {
            packagemanager = packagemanager.getInstalledApplications(0);
        }
        // Misplaced declaration of an exception variable
        catch (PackageManager packagemanager)
        {
            return null;
        }
        return packagemanager;
    }

    public static boolean a(PackageInfo packageinfo)
    {
        return (packageinfo.applicationInfo.flags & 1) == 0 || (packageinfo.applicationInfo.flags & 0x80) != 0;
    }

    public static int[] a(int ai[], int ai1[])
    {
        if (ai == null)
        {
            return ai1;
        }
        if (ai1 == null)
        {
            return ai;
        } else
        {
            int ai2[] = new int[ai.length + ai1.length];
            System.arraycopy(ai, 0, ai2, 0, ai.length);
            System.arraycopy(ai1, 0, ai2, ai.length, ai1.length);
            return ai2;
        }
    }

    public static String[] a(String as[], String as1[])
    {
        if (as == null)
        {
            return as1;
        }
        if (as1 == null)
        {
            return as;
        } else
        {
            String as2[] = new String[as.length + as1.length];
            System.arraycopy(as, 0, as2, 0, as.length);
            System.arraycopy(as1, 0, as2, as.length, as1.length);
            return as2;
        }
    }

    public static final String b(String s, PackageManager packagemanager)
    {
        Object obj = null;
        try
        {
            s = packagemanager.getPackageInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = null;
        }
        packagemanager = obj;
        if (s != null)
        {
            packagemanager = ((PackageInfo) (s)).sharedUserId;
        }
        return packagemanager;
    }

}
