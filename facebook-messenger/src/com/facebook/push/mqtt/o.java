// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.c.k;
import com.facebook.debug.log.b;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ev;
import com.google.common.a.fi;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import com.google.common.c.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.push.mqtt:
//            q, r

public class o
{

    static final String a = (new StringBuilder()).append(com/facebook/push/mqtt/o.getCanonicalName()).append(".ACTION_INEXACT_ALARM").toString();
    static final String b = (new StringBuilder()).append(com/facebook/push/mqtt/o.getCanonicalName()).append(".ACTION_CUTOFF_ALARM").toString();
    private static final Class c = com/facebook/push/mqtt/o;
    private static final fi d = fi.a(Long.valueOf(0xdbba0L), Long.valueOf(0x1b7740L), Long.valueOf(0x36ee80L), Long.valueOf(0x2932e00L), Long.valueOf(0x5265c00L));
    private final Context e;
    private final AlarmManager f;
    private final com.facebook.common.time.a g;
    private final int h;
    private final Map i = ik.a();
    private final PendingIntent j;
    private final PendingIntent k;
    private boolean l;

    public o(Context context, AlarmManager alarmmanager, com.facebook.common.time.a a1, int i1)
    {
        l = false;
        e = context;
        f = alarmmanager;
        g = a1;
        h = i1;
        context = new q(this, null);
        context = new k(ev.a(a, context, b, context));
        alarmmanager = new IntentFilter();
        alarmmanager.addAction(a);
        alarmmanager.addAction(b);
        e.registerReceiver(context, alarmmanager);
        context = new Intent(a);
        context.setPackage(e.getPackageName());
        j = PendingIntent.getBroadcast(e, 0, context, 0);
        context = new Intent(b);
        context.setPackage(e.getPackageName());
        k = PendingIntent.getBroadcast(e, 0, context, 0);
    }

    static Class a()
    {
        return c;
    }

    static void a(o o1)
    {
        o1.h();
    }

    private void a(r r1)
    {
        if (r1.c() != 0)
        {
            com.facebook.debug.log.b.d(c, "Rescheduling un-expired task %d!", new Object[] {
                Integer.valueOf(r1.d())
            });
        }
        int i1 = com.google.common.c.a.a(r1.b() / b());
        r1.a(i1);
        i.put(r1.a(), r1);
        com.facebook.debug.log.b.c(c, "Scheduled task %d for %d cycle(s) expiring in %d seconds.", new Object[] {
            Integer.valueOf(r1.d()), Integer.valueOf(i1), Long.valueOf(((long)i1 * b()) / 1000L)
        });
    }

    private void a(List list)
    {
        for (list = list.iterator(); list.hasNext(); a((r)list.next())) { }
    }

    private long b()
    {
        return 0xdbba0L;
    }

    private long c()
    {
        return (b() * (long)h) / 100L;
    }

    private void d()
    {
        if (!l)
        {
            l = true;
            e();
            f();
        }
    }

    private void e()
    {
        com.facebook.debug.b.a.b(d.contains(Long.valueOf(b())));
        f.setInexactRepeating(0, g.a() + b(), b(), j);
        com.facebook.debug.log.b.c(c, "Resetting inexact alarm for %d seconds", new Object[] {
            Long.valueOf(b() / 1000L)
        });
    }

    private void f()
    {
        long l1 = b() + c();
        f.set(0, g.a() + l1, k);
        com.facebook.debug.log.b.c(c, "Resetting cutoff alarm for %d seconds", new Object[] {
            Long.valueOf(l1 / 1000L)
        });
    }

    private void g()
    {
        com.facebook.debug.log.b.c(c, "Canceling alarms.");
        f.cancel(j);
        f.cancel(k);
        l = false;
    }

    private void h()
    {
        for (Iterator iterator = i().iterator(); iterator.hasNext(); ((r)iterator.next()).a().run()) { }
    }

    private es i()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = es.e();
        Iterator iterator = i.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            r r1 = (r)iterator.next();
            r1.a(r1.c() - 1);
            if (r1.c() <= 0)
            {
                com.facebook.debug.log.b.c(c, "Expiring task %d", new Object[] {
                    Integer.valueOf(r1.d())
                });
                ((et) (obj)).b(r1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_94;
        obj;
        throw obj;
        obj = ((et) (obj)).b();
        a(((List) (obj)));
        if (!i.isEmpty())
        {
            break MISSING_BLOCK_LABEL_124;
        }
        g();
_L1:
        this;
        JVM INSTR monitorexit ;
        return ((es) (obj));
        f();
          goto _L1
    }

    public void a(Runnable runnable, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        Preconditions.checkNotNull(runnable);
        Preconditions.checkArgument(a(l1));
        if (i.isEmpty())
        {
            d();
        }
        a(new r(runnable, l1));
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }

    public boolean a(long l1)
    {
        return d.contains(Long.valueOf(l1));
    }

    public boolean a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        runnable = (r)i.remove(runnable);
        if (runnable != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        com.facebook.debug.log.b.b(c, "Canceled task %d", new Object[] {
            Integer.valueOf(runnable.d())
        });
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        runnable;
        throw runnable;
    }

}
