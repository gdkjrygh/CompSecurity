// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.pandora.android.util.s;
import p.df.a;

public class InAppPurchaseReceiver extends WakefulBroadcastReceiver
{

    public InAppPurchaseReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("com.pandora.android.iap.InAppPurchaseReceiver.ACTION_CLICKED".equals(intent.getAction()))
        {
            a.a("InAppPurchaseReceiver", "onReceive ACTION_CLICKED");
            context.startActivity(s.b(context));
        } else
        if ("com.pandora.android.iap.InAppPurchaseReceiver.ACTION_REMOVED".equals(intent.getAction()))
        {
            a.a("InAppPurchaseReceiver", "onReceive ACTION_REMOVED");
            return;
        }
    }
}
