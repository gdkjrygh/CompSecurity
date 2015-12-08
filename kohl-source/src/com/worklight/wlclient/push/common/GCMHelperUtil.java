// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push.common;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import com.worklight.common.Logger;

public class GCMHelperUtil
{

    private static final String APP_VERSION = "appVersion";
    private static final String REGISTRATION_ID = "registrationId";
    private static final String WL_PREFS = "WLPrefs";
    private static Logger logger = Logger.getInstance("GCMHelperUtil");

    public GCMHelperUtil()
    {
    }

    public static void checkManifest(Context context, String s, String s1)
    {
        verifyPermission(context, (new StringBuilder()).append(context.getPackageName()).append(".permission.C2D_MESSAGE").toString());
        verifyPermission(context, "com.google.android.c2dm.permission.RECEIVE");
        verifyIntentService(context, s);
        verifyBroadcastReceiver(context, s1);
    }

    private static int getAppVersion(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Could not get package name: ").append(context).toString());
        }
        return i;
    }

    private static SharedPreferences getGCMPreferences(Context context)
    {
        return context.getSharedPreferences("WLPrefs", 0);
    }

    public static String getRegistrationId(Context context)
    {
        SharedPreferences sharedpreferences = getGCMPreferences(context);
        String s = sharedpreferences.getString("registrationId", "");
        if (s.isEmpty())
        {
            logger.debug("Registration not found");
            s = "";
        } else
        if (sharedpreferences.getInt("appVersion", 0x80000000) != getAppVersion(context))
        {
            logger.debug("App version changed.");
            return "";
        }
        return s;
    }

    public static boolean isIntentServiceDefinedInManifest(Context context, String s)
    {
        PackageManager packagemanager;
        packagemanager = context.getPackageManager();
        if (packagemanager == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        context = packagemanager.getServiceInfo(new ComponentName(context.getPackageName(), s), 4);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        boolean flag = context.isEnabled();
        return flag;
        context;
        return false;
    }

    private static boolean isPermitionGranted(Context context, String s)
    {
        boolean flag1 = false;
        PackageManager packagemanager = context.getPackageManager();
        boolean flag = flag1;
        if (packagemanager != null)
        {
            flag = flag1;
            if (packagemanager.checkPermission(s, context.getPackageName()) == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    private static boolean isReceiverDefinedInManifest(Context context, String s)
    {
        PackageManager packagemanager;
        packagemanager = context.getPackageManager();
        if (packagemanager == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        context = packagemanager.getReceiverInfo(new ComponentName(context.getPackageName(), s), 2);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        boolean flag = context.isEnabled();
        return flag;
        context;
        return false;
    }

    public static boolean isRegistered(Context context)
    {
        return getRegistrationId(context).length() > 0;
    }

    public static void register(Context context, String s)
    {
        logger.debug((new StringBuilder()).append("Registering with GCM server with senderId: ").append(s).toString());
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gsf");
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        intent.putExtra("sender", s);
        context.startService(intent);
    }

    public static void setRegistrationId(Context context, String s)
    {
        SharedPreferences sharedpreferences = getGCMPreferences(context);
        int i = getAppVersion(context);
        logger.debug((new StringBuilder()).append("Saving regId on app version ").append(i).toString());
        context = sharedpreferences.edit();
        context.putString("registrationId", s);
        context.putInt("appVersion", i);
        context.commit();
    }

    public static void unregister(Context context)
    {
        logger.debug("Unregistering from GCM Server");
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.setPackage("com.google.android.gsf");
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        context.startService(intent);
    }

    private static void verifyBroadcastReceiver(Context context, String s)
    {
        if (!isReceiverDefinedInManifest(context, s))
        {
            throw new IllegalStateException((new StringBuilder()).append("Android Manifest Error: Missing broadcast receiver in manifest: ").append(s).toString());
        } else
        {
            return;
        }
    }

    private static void verifyIntentService(Context context, String s)
    {
        if (!isIntentServiceDefinedInManifest(context, s))
        {
            throw new IllegalStateException((new StringBuilder()).append("Android Manifest Error: Missing intent service in manifest: ").append(s).toString());
        } else
        {
            return;
        }
    }

    private static void verifyPermission(Context context, String s)
    {
        if (!isPermitionGranted(context, s))
        {
            throw new IllegalStateException((new StringBuilder()).append("Android Manifest Error: Missing permission in manifest: ").append(s).toString());
        } else
        {
            return;
        }
    }

}
