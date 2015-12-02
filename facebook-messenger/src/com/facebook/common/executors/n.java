// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import com.facebook.debug.log.b;
import com.google.common.a.hy;
import com.google.common.a.ik;
import com.google.common.d.a.s;
import com.google.common.d.a.u;
import com.google.common.d.a.w;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.common.executors:
//            o, r, q, p

public class n
{

    private static final Class a = com/facebook/common/executors/n;
    private static final ThreadLocal b = new o();
    private final u c;
    private final Map d = ik.a();
    private final ConcurrentMap e = (new hy()).h().n();

    public n(ExecutorService executorservice)
    {
        c = w.a(executorservice);
    }

    static Class a()
    {
        return a;
    }

    static void a(n n1, q q1, r r1)
    {
        n1.a(q1, r1);
    }

    private void a(q q1, r r1)
    {
        this;
        JVM INSTR monitorenter ;
        r1.c = null;
        e.remove(q1.b, q1);
        a(r1);
        this;
        JVM INSTR monitorexit ;
        return;
        q1;
        throw q1;
    }

    private void a(r r1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = r1.c;
        if (obj == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        AtomicInteger atomicinteger;
        atomicinteger = (AtomicInteger)b.get();
        atomicinteger.incrementAndGet();
        if (!r1.b.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        d.remove(r1.a);
_L4:
        atomicinteger.decrementAndGet();
        if (true) goto _L1; else goto _L3
        r1;
        throw r1;
_L3:
        if (atomicinteger.get() <= 2)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        obj = c;
_L5:
        q q1 = (q)r1.b.remove();
        r1.c = c.b(q1);
        r1.c.a(new p(this, q1, r1), ((java.util.concurrent.Executor) (obj)));
          goto _L4
        r1;
        atomicinteger.decrementAndGet();
        throw r1;
        obj = w.a();
          goto _L5
    }

    public s a(Object obj)
    {
        obj = (q)e.get(obj);
        if (obj != null)
        {
            return q.a(((q) (obj)));
        } else
        {
            return null;
        }
    }

    public s a(Object obj, Object obj1, Callable callable, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        r r1 = (r)d.get(obj);
        if (r1 != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        r1 = new r(obj);
        d.put(obj, r1);
        if (e.containsKey(obj1))
        {
            com.facebook.debug.log.b.d(a, (new StringBuilder()).append("Already contains a callable for key ").append(obj1).toString());
        }
        obj = new q(obj, obj1, callable, s1, null);
        e.put(obj1, obj);
        r1.b.add(obj);
        a(r1);
        obj = q.a(((q) (obj)));
        this;
        JVM INSTR monitorexit ;
        return ((s) (obj));
        obj;
        throw obj;
    }

}
