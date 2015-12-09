// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.FitbitMobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fitbit.e.a;

public class NetworkStateReceiver extends BroadcastReceiver
{

    private static final String a = "NetworkStateReceiver";

    public NetworkStateReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()))
        {
            com.fitbit.e.a.a("NetworkStateReceiver", "Global connectivity action.", new Object[0]);
            com.fitbit.multipledevice.a.a().b();
        }
    }
}
