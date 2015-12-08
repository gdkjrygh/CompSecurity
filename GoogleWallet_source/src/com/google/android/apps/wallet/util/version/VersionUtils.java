// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.version;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.apps.wallet.logging.WLog;

public final class VersionUtils
{

    private static final String TAG = com/google/android/apps/wallet/util/version/VersionUtils.getSimpleName();

    private VersionUtils()
    {
    }

    public static int getVersionCode(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        int i;
        try
        {
            i = packagemanager.getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            WLog.e(TAG, "package manager returned exception fetching version code. Using defaults", context);
            return 999;
        }
        return i;
    }

    public static String getVersionName(Context context)
    {
        Object obj1 = context.getPackageManager();
        Object obj = "NOT_AVAILABLE";
        try
        {
            context = ((PackageManager) (obj1)).getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            WLog.e(TAG, "package manager returned exception fetching version name. Using defaults", context);
            return ((String) (obj));
        }
        obj1 = context;
        obj = context;
        if (context.contains("depot"))
        {
            obj1 = "head";
        }
        return ((String) (obj1));
    }

}
