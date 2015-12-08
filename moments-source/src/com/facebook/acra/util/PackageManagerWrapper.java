// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.acra.ACRA;

public final class PackageManagerWrapper
{

    private final Context context;

    public PackageManagerWrapper(Context context1)
    {
        context = context1;
    }

    public final PackageInfo getPackageInfo()
    {
        return getPackageInfo(context.getPackageName(), 0);
    }

    public final PackageInfo getPackageInfo(String s, int i)
    {
        PackageManager packagemanager = context.getPackageManager();
        if (packagemanager == null)
        {
            return null;
        }
        try
        {
            s = packagemanager.getPackageInfo(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = ACRA.LOG_TAG;
            (new StringBuilder("Failed to find PackageInfo for current App : ")).append(context.getPackageName());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public final boolean hasPermission(String s)
    {
        PackageManager packagemanager = context.getPackageManager();
        if (packagemanager != null)
        {
            int i;
            try
            {
                i = packagemanager.checkPermission(s, context.getPackageName());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            if (i == 0)
            {
                return true;
            }
        }
        return false;
    }
}
