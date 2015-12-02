// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{

    public static ArrayList a = null;

    public static ArrayList a(Context context)
    {
        try
        {
            context = context.getPackageManager().getInstalledPackages(0);
            a = new ArrayList();
            context = context.iterator();
            do
            {
                if (!context.hasNext())
                {
                    break;
                }
                PackageInfo packageinfo = (PackageInfo)context.next();
                if (!a(packageinfo))
                {
                    a.add(packageinfo.packageName);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        context = a;
        return context;
    }

    private static boolean a(PackageInfo packageinfo)
    {
        int i = packageinfo.applicationInfo.flags;
        packageinfo = packageinfo.applicationInfo;
        return (i & 1) != 0;
    }

}
