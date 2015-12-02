// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import org.acra.ACRA;

public final class PackageManagerWrapper
{

    private final Context context;

    public PackageManagerWrapper(Context context1)
    {
        context = context1;
    }

    public PackageInfo getPackageInfo()
    {
        Object obj = context.getPackageManager();
        if (obj == null)
        {
            return null;
        }
        try
        {
            obj = ((PackageManager) (obj)).getPackageInfo(context.getPackageName(), 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.v(ACRA.LOG_TAG, (new StringBuilder()).append("Failed to find PackageInfo for current App : ").append(context.getPackageName()).toString());
            return null;
        }
        catch (RuntimeException runtimeexception)
        {
            return null;
        }
        return ((PackageInfo) (obj));
    }

    public boolean hasPermission(String s)
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
