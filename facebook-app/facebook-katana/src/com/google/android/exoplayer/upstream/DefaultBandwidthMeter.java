// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.os.Handler;
import com.facebook.tools.dextr.runtime.detour.HandlerDetour;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Clock;
import com.google.android.exoplayer.util.SlidingPercentile;
import com.google.android.exoplayer.util.SystemClock;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            BandwidthMeter

public final class DefaultBandwidthMeter
    implements BandwidthMeter
{

    private final Handler a;
    private final BandwidthMeter.EventListener b;
    private final Clock c;
    private final SlidingPercentile d;
    private long e;
    private long f;
    private long g;
    private int h;

    public DefaultBandwidthMeter()
    {
        this(null, null);
    }

    private DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventlistener)
    {
        this(handler, eventlistener, ((Clock) (new SystemClock())));
    }

    private DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventlistener, Clock clock)
    {
        this(handler, eventlistener, clock, 2000);
    }

    private DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventlistener, Clock clock, int i)
    {
        a = handler;
        b = eventlistener;
        c = clock;
        d = new SlidingPercentile(i);
        g = -1L;
    }

    private void a(int i, long l, long l1)
    {
        if (a != null && b != null)
        {
            HandlerDetour.a(a, new _cls1(i, l, l1), 0x51b8ac04);
        }
    }

    public final long a()
    {
        this;
        JVM INSTR monitorenter ;
        long l = g;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        e = e + (long)i;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (h == 0)
        {
            f = c.a();
        }
        h = h + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        int i;
        long l;
        long l1;
        boolean flag;
        if (h > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        l1 = c.a();
        i = (int)(l1 - f);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        f1 = (e * 8000L) / (long)i;
        d.a((int)Math.sqrt(e), f1);
        f1 = d.a(0.5F);
        if (Float.isNaN(f1))
        {
            l = -1L;
        } else
        {
            l = (long)f1;
        }
        g = l;
        a(i, e, g);
        h = h - 1;
        if (h > 0)
        {
            f = l1;
        }
        e = 0L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private class _cls1
        implements Runnable
    {

        final int a;
        final long b;
        final long c;
        final DefaultBandwidthMeter d;

        public void run()
        {
        }

        _cls1(int i, long l, long l1)
        {
            d = DefaultBandwidthMeter.this;
            a = i;
            b = l;
            c = l1;
            super();
        }
    }

}
