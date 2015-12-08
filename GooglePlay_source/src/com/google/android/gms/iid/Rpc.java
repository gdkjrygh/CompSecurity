// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Process;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

public final class Rpc
{

    static String appIDServicePackageName = null;
    static int appIDUID = 0;
    static int myUID = 0;
    static int requestId = 0;

    public static String findAppIDPackage(Context context)
    {
        if (appIDServicePackageName != null)
        {
            return appIDServicePackageName;
        }
        myUID = Process.myUid();
        context = context.getPackageManager();
        Object obj = context.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (ResolveInfo)((Iterator) (obj)).next();
            if (context.checkPermission("com.google.android.c2dm.permission.RECEIVE", ((ResolveInfo) (obj1)).serviceInfo.packageName) == 0)
            {
                try
                {
                    ApplicationInfo applicationinfo = context.getApplicationInfo(((ResolveInfo) (obj1)).serviceInfo.packageName, 0);
                    Log.w("InstanceID/Rpc", (new StringBuilder("Found ")).append(applicationinfo.uid).toString());
                    appIDUID = applicationinfo.uid;
                    obj1 = ((ResolveInfo) (obj1)).serviceInfo.packageName;
                    appIDServicePackageName = ((String) (obj1));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    continue;
                }
                return ((String) (obj1));
            }
            Log.w("InstanceID/Rpc", (new StringBuilder("Possible malicious package ")).append(((ResolveInfo) (obj1)).serviceInfo.packageName).append(" declares com.google.android.c2dm.intent.REGISTER without permission").toString());
        } while (true);
        Log.w("InstanceID/Rpc", "Failed to resolve REGISTER intent, falling back");
        try
        {
            obj = context.getApplicationInfo("com.google.android.gms", 0);
            appIDServicePackageName = ((ApplicationInfo) (obj)).packageName;
            appIDUID = ((ApplicationInfo) (obj)).uid;
            obj = appIDServicePackageName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            try
            {
                context = context.getApplicationInfo("com.google.android.gsf", 0);
                appIDServicePackageName = ((ApplicationInfo) (context)).packageName;
                appIDUID = ((ApplicationInfo) (context)).uid;
                context = appIDServicePackageName;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("InstanceID/Rpc", "Both Google Play Services and legacy GSF package are missing");
                return null;
            }
            return context;
        }
        return ((String) (obj));
    }

}
