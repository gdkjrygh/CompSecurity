// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.mixpanel.android.surveys.SurveyActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class c
{

    public static String a = "MixpanelAPI.ConfigurationChecker";

    c()
    {
    }

    private static String a(String s)
    {
        return (new StringBuilder()).append("<receiver android:name=\"com.mixpanel.android.mpmetrics.GCMReceiver\"\n          android:permission=\"com.google.android.c2dm.permission.SEND\" >\n    <intent-filter>\n       <action android:name=\"com.google.android.c2dm.intent.RECEIVE\" />\n       <action android:name=\"com.google.android.c2dm.intent.REGISTRATION\" />\n       <category android:name=\"").append(s).append("\" />\n").append("    </intent-filter>\n").append("</receiver>").toString();
    }

    public static boolean a(Context context)
    {
        if (context.getPackageManager().checkPermission("android.permission.INTERNET", context.getPackageName()) != 0)
        {
            Log.w(a, "Package does not have permission android.permission.INTERNET - Mixpanel will not work at all!");
            Log.i(a, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        } else
        {
            return true;
        }
    }

    private static boolean a(Context context, Set set, String s)
    {
        Object obj = context.getPackageManager();
        context = context.getPackageName();
        Intent intent = new Intent(s);
        intent.setPackage(context);
        obj = ((PackageManager) (obj)).queryBroadcastReceivers(intent, 32);
        if (((List) (obj)).isEmpty())
        {
            Log.w(a, (new StringBuilder()).append("No receivers for action ").append(s).toString());
            Log.i(a, (new StringBuilder()).append("You can fix by pasting the following into the <application> tag in your AndroidManifest.xml:\n").append(a(((String) (context)))).toString());
            return false;
        }
        for (context = ((List) (obj)).iterator(); context.hasNext();)
        {
            s = ((ResolveInfo)context.next()).activityInfo.name;
            if (!set.contains(s))
            {
                Log.w(a, (new StringBuilder()).append("Receiver ").append(s).append(" is not set with permission com.google.android.c2dm.permission.SEND").toString());
                Log.i(a, "Please add the attribute 'android:permission=\"com.google.android.c2dm.permission.SEND\"' to your <receiver> tag");
                return false;
            }
        }

        return true;
    }

    public static boolean b(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8) goto _L2; else goto _L1
_L1:
        Log.i(a, (new StringBuilder()).append("Mixpanel push notifications not supported in SDK ").append(android.os.Build.VERSION.SDK_INT).toString());
_L4:
        return false;
_L2:
        String s;
        PackageManager packagemanager;
        packagemanager = context.getPackageManager();
        s = context.getPackageName();
        String s1 = (new StringBuilder()).append(s).append(".permission.C2D_MESSAGE").toString();
        try
        {
            packagemanager.getPermissionInfo(s1, 4096);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w(a, (new StringBuilder()).append("Application does not define permission ").append(s1).toString());
            Log.i(a, (new StringBuilder()).append("You will need to add the following lines to your application manifest:\n<permission android:name=\"").append(s).append(".permission.C2D_MESSAGE\" android:protectionLevel=\"signature\" />\n").append("<uses-permission android:name=\"").append(s).append(".permission.C2D_MESSAGE\" />").toString());
            return false;
        }
        if (packagemanager.checkPermission("com.google.android.c2dm.permission.RECEIVE", s) != 0)
        {
            Log.w(a, "Package does not have permission com.google.android.c2dm.permission.RECEIVE");
            Log.i(a, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"com.google.android.c2dm.permission.RECEIVE\" />");
            return false;
        }
        if (packagemanager.checkPermission("android.permission.INTERNET", s) != 0)
        {
            Log.w(a, "Package does not have permission android.permission.INTERNET");
            Log.i(a, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        }
        if (packagemanager.checkPermission("android.permission.WAKE_LOCK", s) != 0)
        {
            Log.w(a, "Package does not have permission android.permission.WAKE_LOCK");
            Log.i(a, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.WAKE_LOCK\" />");
            return false;
        }
        if (packagemanager.checkPermission("android.permission.GET_ACCOUNTS", s) == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i(a, "Package does not have permission android.permission.GET_ACCOUNTS");
        Log.i(a, "Android versions below 4.1 require GET_ACCOUNTS to receive Mixpanel push notifications.\nDevices with later OS versions will still be able to receive messages, but if you'd like to support older devices, you'll need to add the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.GET_ACCOUNTS\" />");
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L4; else goto _L3
_L3:
        Object obj;
        ActivityInfo aactivityinfo[];
        try
        {
            obj = packagemanager.getPackageInfo(s, 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w(a, (new StringBuilder()).append("Could not get receivers for package ").append(s).toString());
            return false;
        }
        aactivityinfo = ((PackageInfo) (obj)).receivers;
        if (aactivityinfo == null || aactivityinfo.length == 0)
        {
            Log.w(a, (new StringBuilder()).append("No receiver for package ").append(s).toString());
            Log.i(a, (new StringBuilder()).append("You can fix this with the following into your <application> tag:\n").append(a(s)).toString());
            return false;
        }
        obj = new HashSet();
        int j = aactivityinfo.length;
        for (int i = 0; i < j; i++)
        {
            ActivityInfo activityinfo = aactivityinfo[i];
            if ("com.google.android.c2dm.permission.SEND".equals(activityinfo.permission))
            {
                ((Set) (obj)).add(activityinfo.name);
            }
        }

        if (((Set) (obj)).isEmpty())
        {
            Log.w(a, "No receiver allowed to receive com.google.android.c2dm.permission.SEND");
            Log.i(a, (new StringBuilder()).append("You can fix by pasting the following into the <application> tag in your AndroidManifest.xml:\n").append(a(s)).toString());
            return false;
        }
        if (!a(context, ((Set) (obj)), "com.google.android.c2dm.intent.RECEIVE"))
        {
            continue; /* Loop/switch isn't completed */
        }
        Class.forName("com.google.android.gms.common.e");
        boolean flag = true;
_L6:
        ClassNotFoundException classnotfoundexception;
        boolean flag1;
        if (!a(context, ((Set) (obj)), "com.google.android.c2dm.intent.REGISTRATION"))
        {
            Log.i(a, "(You can still receive push notifications on Lollipop/API 21 or greater with this configuration)");
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (flag || flag1)
        {
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
        classnotfoundexception;
        Log.w(a, "Google Play Services aren't included in your build- push notifications won't work on Lollipop/API 21 or greater");
        Log.i(a, "You can fix this by adding com.google.android.gms:play-services as a dependency of your gradle or maven project");
        flag = false;
          goto _L6
    }

    public static boolean c(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return false;
        }
        Intent intent = new Intent(context, com/mixpanel/android/surveys/SurveyActivity);
        intent.addFlags(0x10000000);
        intent.addFlags(0x20000);
        if (context.getPackageManager().queryIntentActivities(intent, 0).size() == 0)
        {
            Log.w(a, (new StringBuilder()).append(com/mixpanel/android/surveys/SurveyActivity.getName()).append(" is not registered as an activity in your application, so surveys can't be shown.").toString());
            Log.i(a, "Please add the child tag <activity android:name=\"com.mixpanel.android.surveys.SurveyActivity\" /> to your <application> tag.");
            return false;
        } else
        {
            return true;
        }
    }

}
