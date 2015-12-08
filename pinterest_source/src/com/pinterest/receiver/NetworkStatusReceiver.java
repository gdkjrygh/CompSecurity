// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;
import com.pinterest.networking.events.ConnectivityChanged;

public class NetworkStatusReceiver extends BroadcastReceiver
{

    public NetworkStatusReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        PLog.info("NetworkStatusReceiver.onReceive", new Object[0]);
        Events.post(new ConnectivityChanged(null));
    }
}
