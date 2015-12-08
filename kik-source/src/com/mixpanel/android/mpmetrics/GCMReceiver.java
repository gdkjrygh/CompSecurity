// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            t, i, v, j

public class GCMReceiver extends BroadcastReceiver
{

    String a;

    public GCMReceiver()
    {
        a = "MPGCMReceiver";
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj = intent.getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(obj)) goto _L2; else goto _L1
_L1:
        context = intent.getStringExtra("registration_id");
        if (intent.getStringExtra("error") == null) goto _L4; else goto _L3
_L3:
        Log.e(a, (new StringBuilder("Error when registering for GCM: ")).append(intent.getStringExtra("error")).toString());
_L6:
        return;
_L4:
        if (context != null)
        {
            boolean flag = t.a;
            v.a(new i(this, context));
            return;
        }
        if (intent.getStringExtra("unregistered") == null) goto _L6; else goto _L5
_L5:
        boolean flag1 = t.a;
        v.a(new j(this));
        return;
_L2:
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(obj)) goto _L6; else goto _L7
_L7:
        String s = intent.getExtras().getString("mp_message");
        if (s == null) goto _L6; else goto _L8
_L8:
        Object obj1;
        PackageManager packagemanager;
        boolean flag2 = t.a;
        packagemanager = context.getPackageManager();
        obj1 = packagemanager.getLaunchIntentForPackage(context.getPackageName());
        obj = "";
        intent = ((Intent) (obj));
        ApplicationInfo applicationinfo = packagemanager.getApplicationInfo(context.getPackageName(), 0);
        intent = ((Intent) (obj));
        obj = packagemanager.getApplicationLabel(applicationinfo);
        intent = ((Intent) (obj));
        int k = applicationinfo.icon;
        intent = ((Intent) (obj));
_L10:
        obj1 = PendingIntent.getActivity(context.getApplicationContext(), 0, ((Intent) (obj1)), 0x8000000);
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
            Notification notification = new Notification(k, s, System.currentTimeMillis());
            notification.flags = notification.flags | 0x10;
            notification.setLatestEventInfo(context, intent, s, ((PendingIntent) (obj1)));
            notificationmanager.notify(0, notification);
            return;
        }
        break; /* Loop/switch isn't completed */
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        k = 0x1080093;
        if (true) goto _L10; else goto _L9
_L9:
        NotificationManager notificationmanager1 = (NotificationManager)context.getSystemService("notification");
        context = (new android.app.Notification.Builder(context)).setSmallIcon(k).setTicker(s).setWhen(System.currentTimeMillis()).setContentTitle(intent).setContentText(s).setContentIntent(((PendingIntent) (obj1)));
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            context = context.getNotification();
        } else
        {
            context = context.build();
        }
        context.flags = ((Notification) (context)).flags | 0x10;
        notificationmanager1.notify(0, context);
        return;
    }
}
