// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class Permissions
{

    private static String a[] = null;

    public Permissions()
    {
    }

    public static Boolean check(Context context, String s)
    {
        int i = 0;
        if (a == null)
        {
            try
            {
                a = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (a != null)
        {
            for (; i < a.length; i++)
            {
                if (a[i].equals(s))
                {
                    return Boolean.valueOf(true);
                }
            }

        }
        return Boolean.valueOf(false);
    }

}
