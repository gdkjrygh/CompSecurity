// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vungle.log.Logger;
import com.vungle.publisher.bo;
import com.vungle.publisher.bp;
import com.vungle.publisher.cp;
import com.vungle.publisher.event.EventBus;
import java.util.concurrent.atomic.AtomicBoolean;

public class NetworkBroadcastReceiver extends BroadcastReceiver
{

    public static final IntentFilter a = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    public Context b;
    cp c;
    EventBus d;
    private final AtomicBoolean e = new AtomicBoolean(false);

    NetworkBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        if (!intent.getBooleanExtra("noConnectivity", false)) goto _L4; else goto _L3
_L3:
        if (e.compareAndSet(true, false))
        {
            Logger.d("VungleNetwork", "lost connectivity");
            d.a(new bp());
        }
_L2:
        return;
_L4:
        if (intent.getBooleanExtra("isFailover", false))
        {
            Logger.d("VungleNetwork", "connectivity failover");
            return;
        }
        Logger.d("VungleNetwork", "connectivity established");
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        if (!e.compareAndSet(false, true)) goto _L2; else goto _L5
_L5:
        d.a(new bo());
        return;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
    }

}
