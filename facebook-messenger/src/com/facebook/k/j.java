// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.k;

import android.content.IntentFilter;
import android.support.v4.a.e;
import com.facebook.base.broadcast.l;
import com.facebook.common.hardware.f;
import com.facebook.common.hardware.h;
import com.facebook.common.hardware.k;
import com.facebook.common.time.a;
import java.util.PriorityQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

// Referenced classes of package com.facebook.k:
//            k, l, n

public class j
{

    private final e a;
    private final f b;
    private final ScheduledExecutorService c;
    private final k d;
    private final a e;
    private com.facebook.base.broadcast.j f;
    private l g;
    private final PriorityQueue h = new PriorityQueue();
    private final h i = new com.facebook.k.k(this);
    private ScheduledFuture j;

    public j(e e1, f f1, ScheduledExecutorService scheduledexecutorservice, k k1, com.facebook.base.broadcast.j j1, a a1)
    {
        a = e1;
        b = f1;
        c = scheduledexecutorservice;
        d = k1;
        f = j1;
        e = a1;
        a.a(new com.facebook.k.l(this), new IntentFilter("com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED"));
    }

    private void a()
    {
        if (j != null)
        {
            j.cancel(false);
        }
        j = null;
    }

    static void a(j j1)
    {
        j1.b();
    }

    static k b(j j1)
    {
        return j1.d;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!h.isEmpty())
        {
            a();
            c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void c()
    {
        d();
        n n1;
        for (; h.size() > 0; c.submit(n1.a))
        {
            n1 = (n)h.poll();
        }

    }

    private void d()
    {
        g.c();
        b.a(i);
    }
}
