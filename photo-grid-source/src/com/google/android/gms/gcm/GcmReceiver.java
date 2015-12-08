// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Base64;

public class GcmReceiver extends WakefulBroadcastReceiver
{

    private static String a = "gcm.googleapis.com/refresh";

    public GcmReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (android.os.Build.VERSION.SDK_INT <= 18)
        {
            intent.removeCategory(context.getPackageName());
        }
        String s = intent.getStringExtra("from");
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction()) || "google.com/iid".equals(s) || a.equals(s))
        {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        s = intent.getStringExtra("gcm.rawData64");
        if (s != null)
        {
            intent.putExtra("rawData", Base64.decode(s, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()))
        {
            startWakefulService(context, intent);
        } else
        {
            startWakefulService(context, intent);
        }
        if (isOrderedBroadcast())
        {
            setResultCode(-1);
        }
    }

}
