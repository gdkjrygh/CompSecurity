// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.List;

class k
{

    public static String a = "MixpanelAPI.ConfigurationChecker";

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

    public static boolean b(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return false;
        }
        Intent intent = new Intent(context, com/android/slyce/report/surveys/k);
        intent.addFlags(0x10000000);
        intent.addFlags(0x20000);
        if (context.getPackageManager().queryIntentActivities(intent, 0).size() == 0)
        {
            Log.w(a, (new StringBuilder()).append(com/android/slyce/report/surveys/k.getName()).append(" is not registered as an activity in your application, so surveys can't be shown.").toString());
            Log.i(a, "Please add the child tag <activity android:name=\"com.mixpanel.android.surveys.SurveyActivity\" /> to your <application> tag.");
            return false;
        } else
        {
            return true;
        }
    }

}
