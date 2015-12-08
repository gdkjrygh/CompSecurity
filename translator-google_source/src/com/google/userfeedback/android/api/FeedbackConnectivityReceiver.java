// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package com.google.userfeedback.android.api:
//            m, z, SendUserFeedbackService

public class FeedbackConnectivityReceiver extends BroadcastReceiver
{

    public FeedbackConnectivityReceiver()
    {
    }

    static void a(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        context = new ComponentName(context.getPackageName(), com/google/userfeedback/android/api/FeedbackConnectivityReceiver.getCanonicalName());
        if (1 != packagemanager.getComponentEnabledSetting(context))
        {
            packagemanager.setComponentEnabledSetting(context, 1, 1);
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        NetworkInfo networkinfo = (NetworkInfo)intent.getParcelableExtra("networkInfo");
        intent = networkinfo;
        if (networkinfo == null)
        {
            intent = connectivitymanager.getActiveNetworkInfo();
        }
        while (intent == null || !intent.isConnected() || !connectivitymanager.getBackgroundDataSetting() || m.c == null || m.c.g == null || !m.c.g.a()) 
        {
            return;
        }
        context.startService(new Intent(context, com/google/userfeedback/android/api/SendUserFeedbackService));
    }
}
