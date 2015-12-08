// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.env;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.vungle.log.Logger;
import com.vungle.publisher.af;
import com.vungle.publisher.aj;
import com.vungle.publisher.ak;
import com.vungle.publisher.as;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.bb;
import com.vungle.publisher.bt;
import com.vungle.publisher.by;
import com.vungle.publisher.cz;
import com.vungle.publisher.db;
import com.vungle.publisher.db.DatabaseBroadcastReceiver;
import com.vungle.publisher.device.ExternalStorageStateBroadcastReceiver;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.net.NetworkBroadcastReceiver;
import com.vungle.publisher.protocol.ProtocolHttpGateway;
import dagger.Lazy;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class SdkState
{
    static class AdThrottleEndRunnable
        implements Runnable
    {

        EventBus a;

        public void run()
        {
            a.a(new ak());
        }

        AdThrottleEndRunnable()
        {
        }
    }

    public static class EndAdEventListener extends by
    {

        SdkState a;

        public void onEvent(as as)
        {
            Logger.d("VungleEvent", "SdkState received end ad event");
            a.b(true);
        }

        EndAdEventListener()
        {
        }
    }


    Context a;
    DatabaseBroadcastReceiver b;
    bt c;
    public EventBus d;
    ExternalStorageStateBroadcastReceiver e;
    NetworkBroadcastReceiver f;
    ScheduledPriorityExecutor g;
    AdThrottleEndRunnable h;
    ProtocolHttpGateway i;
    com.vungle.publisher.db.model.LoggedException.Factory j;
    public Lazy k;
    public final AtomicBoolean l = new AtomicBoolean();
    public long m;
    public SharedPreferences n;
    private long o;
    private final AtomicInteger p = new AtomicInteger();

    public SdkState()
    {
    }

    public static boolean a()
    {
        boolean flag;
        if (!TextUtils.isEmpty(cz.a("com.vungle.debug")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Logger.d("VungleAd", "in debug mode");
            return flag;
        } else
        {
            Logger.v("VungleAd", "not in debug mode");
            return flag;
        }
    }

    static boolean a(SdkState sdkstate, int i1)
    {
        boolean flag = false;
        if (sdkstate.p.compareAndSet(i1, 0))
        {
            sdkstate.o = 0L;
            flag = true;
        }
        return flag;
    }

    public static long d()
    {
        return SystemClock.elapsedRealtime();
    }

    public final void a(boolean flag)
    {
        Object obj = e;
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentfilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentfilter.addDataScheme("file");
        ((ExternalStorageStateBroadcastReceiver) (obj)).a.registerReceiver(((android.content.BroadcastReceiver) (obj)), intentfilter);
        obj = f;
        ((NetworkBroadcastReceiver) (obj)).b.registerReceiver(((android.content.BroadcastReceiver) (obj)), NetworkBroadcastReceiver.a);
        obj = b;
        ((DatabaseBroadcastReceiver) (obj)).a.registerReceiver(((android.content.BroadcastReceiver) (obj)), new IntentFilter("com.vungle.publisher.db.DUMP_TABLES"));
        c.r();
        g.a(com.vungle.publisher.async.ScheduledPriorityExecutor.b.l);
        boolean flag1;
        if (db.a(p))
        {
            o = System.currentTimeMillis();
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            ProtocolHttpGateway protocolhttpgateway = i;
            long l1 = o;
            protocolhttpgateway.e.a(new com.vungle.publisher.protocol.ProtocolHttpGateway._cls6(protocolhttpgateway, l1), com.vungle.publisher.async.ScheduledPriorityExecutor.b.m);
        }
        if (flag)
        {
            d.a(new af());
        }
    }

    public final void b(boolean flag)
    {
        if (l.compareAndSet(true, false))
        {
            Logger.d("VungleAd", "ending playing ad onResume()");
            ((EndAdEventListener)k.get()).unregister();
            long l1 = SystemClock.elapsedRealtime();
            Logger.v("VungleAd", (new StringBuilder("setting last ad end millis: ")).append(l1).toString());
            n.edit().putLong("VgLastViewedTime", l1).apply();
            m = 0L;
            int i1 = e();
            if (i1 > 0)
            {
                d.a(new aj());
                g.a(h, i1 * 1000);
            }
            if (!flag)
            {
                d.a(new bb(m));
            }
        }
    }

    public final boolean b()
    {
        boolean flag = true;
        long l1 = SystemClock.elapsedRealtime();
        long l2 = c();
        int i1 = (int)((SystemClock.elapsedRealtime() - c()) / 1000L);
        if (i1 < 0)
        {
            Logger.d("VungleAd", (new StringBuilder("negative adDelayElapsedSeconds ")).append(i1).append(", currentTimestampMillis ").append(l1).append(", lastAdEndMillis ").append(l2).toString());
            return true;
        }
        int j1 = e();
        if (i1 < j1)
        {
            flag = false;
        }
        if (flag)
        {
            Logger.v("VungleAd", (new StringBuilder()).append(i1).append(" / ").append(j1).append(" ad delay seconds elapsed").toString());
            return flag;
        } else
        {
            Logger.d("VungleAd", (new StringBuilder()).append(i1).append(" / ").append(j1).append(" ad delay seconds elapsed").toString());
            return flag;
        }
    }

    public final long c()
    {
        long l1 = n.getLong("VgLastViewedTime", 0L);
        Logger.v("VungleAd", (new StringBuilder("returning last ad end millis: ")).append(l1).toString());
        return l1;
    }

    public final int e()
    {
        return n.getInt("VgAdDelayDuration", 0);
    }

    public final long f()
    {
        long l1 = System.currentTimeMillis();
        long l2 = o;
        int i1 = p.get();
        Object obj = e;
        try
        {
            ((ExternalStorageStateBroadcastReceiver) (obj)).a.unregisterReceiver(((android.content.BroadcastReceiver) (obj)));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Logger.w("VungleDevice", "error unregistering external storage state broadcast receiver - not registered");
        }
        obj = f;
        try
        {
            ((NetworkBroadcastReceiver) (obj)).b.unregisterReceiver(((android.content.BroadcastReceiver) (obj)));
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            Logger.w("VungleNetwork", "error unregistering network broadcast receiver - not registered");
        }
        obj = b;
        try
        {
            ((DatabaseBroadcastReceiver) (obj)).a.unregisterReceiver(((android.content.BroadcastReceiver) (obj)));
        }
        catch (IllegalArgumentException illegalargumentexception2)
        {
            Logger.w("VungleDumpDatabase", "error unregistering database broadcast receiver - not registered");
        }
        g.a(new _cls1(i1, l2, l1), com.vungle.publisher.async.ScheduledPriorityExecutor.b.k, 10000L);
        return l1;
    }

    /* member class not found */
    class _cls1 {}

}
