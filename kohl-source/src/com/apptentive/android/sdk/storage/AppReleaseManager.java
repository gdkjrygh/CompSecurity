// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.AppRelease;
import com.apptentive.android.sdk.util.JsonDiffer;
import com.apptentive.android.sdk.util.Util;
import org.json.JSONException;

public class AppReleaseManager
{

    public AppReleaseManager()
    {
    }

    private static AppRelease generateCurrentAppRelease(Context context)
    {
        AppRelease apprelease = new AppRelease();
        try
        {
            PackageInfo packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            apprelease.setVersion(packageinfo.versionName);
            apprelease.setIdentifier(packageinfo.packageName);
            apprelease.setBuildNumber(String.valueOf(packageinfo.versionCode));
            apprelease.setTargetSdkVersion(String.valueOf(packageinfo.applicationInfo.targetSdkVersion));
            apprelease.setAppStore(Util.getInstallerPackageName(context));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("Can't load PackageInfo.", context, new Object[0]);
            return apprelease;
        }
        return apprelease;
    }

    public static AppRelease getStoredAppRelease(Context context)
    {
        context = context.getSharedPreferences("APPTENTIVE", 0).getString("app_release", null);
        try
        {
            context = new AppRelease(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    private static void storeAppRelease(Context context, AppRelease apprelease)
    {
        context.getSharedPreferences("APPTENTIVE", 0).edit().putString("app_release", apprelease.toString()).commit();
    }

    public static AppRelease storeAppReleaseAndReturnDiff(Context context)
    {
        AppRelease apprelease;
        Object obj;
        obj = getStoredAppRelease(context);
        apprelease = generateCurrentAppRelease(context);
        obj = JsonDiffer.getDiff(((org.json.JSONObject) (obj)), apprelease);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        storeAppRelease(context, apprelease);
        context = new AppRelease(obj.toString());
        return context;
        context;
        Log.e("Error casting to AppRelease.", context, new Object[0]);
        return null;
    }
}
