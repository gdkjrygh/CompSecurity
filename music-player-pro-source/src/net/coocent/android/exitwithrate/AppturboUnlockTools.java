// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.exitwithrate;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.List;

public class AppturboUnlockTools
{

    public AppturboUnlockTools()
    {
    }

    public static boolean isAppturboUnlockable(Context context)
    {
        context = context.getPackageManager().getInstalledPackages(0).iterator();
        PackageInfo packageinfo;
        do
        {
            if (!context.hasNext())
            {
                return false;
            }
            packageinfo = (PackageInfo)context.next();
        } while (!packageinfo.packageName.equalsIgnoreCase("com.appturbo.appturboCA2015") && !packageinfo.packageName.equalsIgnoreCase("com.appturbo.appoftheday2015"));
        return true;
    }
}
