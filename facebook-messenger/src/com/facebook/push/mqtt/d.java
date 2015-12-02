// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import com.facebook.debug.log.b;
import com.facebook.push.mqtt.abtest.a;
import com.facebook.push.mqtt.abtest.e;
import com.google.common.base.Preconditions;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.push.mqtt:
//            e, b, c, h

public class d
{

    private static final Class a = com/facebook/push/mqtt/d;
    private final ScheduledExecutorService b;
    private final Context c;
    private final com.facebook.common.time.a d;
    private final a e;
    private h f;
    private Runnable g;
    private ScheduledFuture h;
    private long i;
    private int j;
    private long k;

    public d(Context context, com.facebook.common.time.a a1, ScheduledExecutorService scheduledexecutorservice, a a2)
    {
        c = context;
        d = a1;
        b = scheduledexecutorservice;
        e = a2;
        j = 0;
    }

    private void a(com.facebook.push.mqtt.e e1)
    {
        com.facebook.debug.log.b.a(a, "set strategy to %s", new Object[] {
            e1
        });
        f();
        e e2 = e.a();
        if (e1 == e.BACK_TO_BACK)
        {
            f = new com.facebook.push.mqtt.b(e2.e(), e2.f());
            return;
        }
        if (e1 == e.BACK_OFF)
        {
            f = new c(e2.g(), e2.h());
            return;
        } else
        {
            e1 = (new StringBuilder()).append("Invalid strategy ").append(e1).append(" specified.").toString();
            com.facebook.debug.log.b.b(a, e1);
            throw new IllegalArgumentException(e1);
        }
    }

    private void f()
    {
        g();
        f = null;
        i = 0x8000000000000000L;
    }

    private void g()
    {
        if (h != null)
        {
            h.cancel(false);
        }
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        a(e.BACK_TO_BACK);
        j = 0;
        k = d.a();
        b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        g = runnable;
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }

    public boolean b()
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        com.facebook.debug.log.b.a(a, "next");
        if (f != null) goto _L2; else goto _L1
_L1:
        com.facebook.debug.log.b.d(a, "next is called before having a strategy.");
        boolean flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        long l1 = d.a();
        if (i <= l1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        com.facebook.debug.log.b.b(a, "Retry attempt already scheduled. Next retry due in %d seconds.", new Object[] {
            Long.valueOf((i - l1) / 1000L)
        });
        flag = true;
        continue; /* Loop/switch isn't completed */
        flag = f.b();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        if (f.getClass() == com/facebook/push/mqtt/b)
        {
            com.facebook.debug.log.b.c(a, "Auto switching from B2B to back off retry strategy.");
            a(e.BACK_OFF);
            flag = f.b();
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        com.facebook.debug.log.b.d(a, "No more retry!");
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        throw exception;
        int l = f.a();
        i = (long)l * 1000L + d.a();
        com.facebook.debug.log.b.c(a, f.toString());
        g();
        com.facebook.debug.log.b.b(a, "Scheduling retry in %d", new Object[] {
            Integer.valueOf(l)
        });
        h = b.schedule(g, l, TimeUnit.SECONDS);
        j = j + 1;
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        com.facebook.debug.log.b.a(a, "stop retry");
        f();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int d()
    {
        return j;
    }

    public long e()
    {
        return k;
    }

}
