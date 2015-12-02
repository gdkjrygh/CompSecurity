// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.analytics.cj;
import com.facebook.debug.log.b;
import com.facebook.mqtt.messages.k;
import com.facebook.push.mqtt.abtest.a;
import com.facebook.push.mqtt.abtest.e;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.facebook.push.mqtt:
//            ao, aq

public class ap
{

    private static final Class a = com/facebook/push/mqtt/ap;
    private final ScheduledExecutorService b;
    private final a c;
    private final cj d;
    private final com.facebook.common.time.a e;
    private final Map f = ik.a();

    ap(ScheduledExecutorService scheduledexecutorservice, a a1, cj cj1, com.facebook.common.time.a a2)
    {
        b = scheduledexecutorservice;
        c = a1;
        d = cj1;
        e = a2;
    }

    private void a(ao ao1)
    {
        com.facebook.debug.log.b.c(a, "Response %s timed out for operation %d", new Object[] {
            ao1.b().name(), Integer.valueOf(ao1.c())
        });
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (f.get(Integer.valueOf(ao1.c())) != ao1)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        f.remove(Integer.valueOf(ao1.c()));
        e e1 = c.a();
        d.a(ao1.b().name(), ao1.c(), (long)e1.d() * 1000L);
_L2:
        ao1.a(new TimeoutException());
        obj = c.a();
        int i = ao1.b().toInt();
        if ((((e) (obj)).l() & 1 << i) != 0)
        {
            com.facebook.debug.log.b.c(a, "Disconnecting client %h due to request timeout", new Object[] {
                ao1.a()
            });
            ao1.a().e();
        }
        return;
        com.facebook.debug.log.b.d(a, "Duplicate operation ID %d for operation %s and client %h.", new Object[] {
            Integer.valueOf(ao1.c()), ao1.b().name(), ao1.a()
        });
        if (true) goto _L2; else goto _L1
_L1:
        ao1;
        obj;
        JVM INSTR monitorexit ;
        throw ao1;
    }

    static void a(ap ap1, ao ao1)
    {
        ap1.a(ao1);
    }

    public ao a(com.facebook.mqtt.b b1, k k1, int i)
    {
        Preconditions.checkNotNull(b1);
        b1 = new ao(b1, k1, i, e.a());
        ao ao1;
        synchronized (f)
        {
            ao1 = (ao)f.put(Integer.valueOf(i), b1);
        }
        if (ao1 != null)
        {
            ao1.a(new TimeoutException());
            com.facebook.debug.log.b.e(a, "Unexpected duplicate message ID %d for operation %s.", new Object[] {
                Integer.valueOf(ao1.c()), ao1.b().name()
            });
        }
        k1 = c.a();
        b1.a(b.schedule(new aq(this, b1), k1.d(), TimeUnit.SECONDS));
        return b1;
        b1;
        k1;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void a(Throwable throwable)
    {
        java.util.ArrayList arraylist = hq.a();
        synchronized (f)
        {
            arraylist.addAll(f.values());
            f.clear();
        }
        com.facebook.debug.log.b.a(a, "Aborting %d pending operations.", new Object[] {
            Integer.valueOf(arraylist.size())
        });
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((ao)((Iterator) (obj)).next()).a(throwable)) { }
        break MISSING_BLOCK_LABEL_99;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    public boolean a(int i)
    {
        ao ao1;
        synchronized (f)
        {
            ao1 = (ao)f.remove(Integer.valueOf(i));
        }
        if (ao1 != null)
        {
            ao1.f();
            d.b(ao1.b().name(), e.a() - ao1.e());
            return true;
        } else
        {
            com.facebook.debug.log.b.b(a, "Operation %d not found.", new Object[] {
                Integer.valueOf(i)
            });
            return false;
        }
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
