// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;

import android.os.Bundle;
import android.os.RemoteException;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.executors.i;
import com.facebook.common.time.a;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import com.google.common.d.a.s;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.fbservice.service:
//            k, m, z, l, 
//            n, ac, u, OperationResult, 
//            ad, e, FutureOperationResult, j, 
//            OperationType, o, i

public class h
{

    static final ae a = com.facebook.f.n.a("android_soft_error_on_orca_service_exceptions");
    private static final Class b = com/facebook/fbservice/service/h;
    private final Class c;
    private final javax.inject.a d;
    private final javax.inject.a e;
    private final javax.inject.a f;
    private final o g;
    private final com.facebook.auth.viewercontext.e h;
    private final com.facebook.common.e.h i;
    private final d j;
    private final av k;
    private final a l;
    private final LinkedList m = hq.b();
    private final Map n = ik.a();
    private final LinkedList o = hq.b();
    private final AtomicBoolean p = new AtomicBoolean(false);
    private i q;
    private m r;
    private boolean s;

    public h(Class class1, javax.inject.a a1, javax.inject.a a2, javax.inject.a a3, o o1, com.facebook.auth.viewercontext.e e1, com.facebook.common.e.h h1, 
            d d1, av av1, a a4)
    {
        s = false;
        c = class1;
        d = a1;
        e = a2;
        f = a3;
        g = o1;
        h = e1;
        i = h1;
        j = d1;
        k = av1;
        l = a4;
    }

    static i a(h h1)
    {
        return h1.q;
    }

    static m a(h h1, m m1)
    {
        h1.r = m1;
        return m1;
    }

    private void a(long l1)
    {
        q.schedule(new k(this), l1, TimeUnit.MILLISECONDS);
    }

    static void a(h h1, long l1)
    {
        h1.a(l1);
    }

    static void a(h h1, m m1, OperationResult operationresult)
    {
        h1.b(m1, operationresult);
    }

    private void a(m m1, OperationResult operationresult)
    {
        this;
        JVM INSTR monitorenter ;
        com.facebook.fbservice.service.m.a(m1, operationresult);
        com.facebook.fbservice.service.m.b(m1, l.a());
        o.add(com.facebook.fbservice.service.m.d(m1));
        operationresult = com.facebook.fbservice.service.m.e(m1).iterator();
_L1:
        z z1;
        if (!operationresult.hasNext())
        {
            break MISSING_BLOCK_LABEL_80;
        }
        z1 = (z)operationresult.next();
        try
        {
            z1.b(com.facebook.fbservice.service.m.f(m1));
        }
        catch (RemoteException remoteexception) { }
          goto _L1
        com.facebook.fbservice.service.m.a(m1, null);
        this;
        JVM INSTR monitorexit ;
        return;
        m1;
        throw m1;
    }

    private void a(m m1, s s1)
    {
        com.facebook.fbservice.service.m.a(m1, s1);
        r = m1;
        com.google.common.d.a.i.a(com.facebook.fbservice.service.m.a(m1), new l(this, m1), q);
    }

    static m b(h h1)
    {
        return h1.r;
    }

    static void b(h h1, m m1, OperationResult operationresult)
    {
        h1.a(m1, operationresult);
    }

    private void b(m m1, OperationResult operationresult)
    {
        this;
        JVM INSTR monitorenter ;
        if (com.facebook.fbservice.service.m.e(m1) == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        m1 = com.facebook.fbservice.service.m.e(m1).iterator();
_L1:
        z z1;
        if (!m1.hasNext())
        {
            break MISSING_BLOCK_LABEL_52;
        }
        z1 = (z)m1.next();
        try
        {
            z1.a(operationresult);
        }
        catch (RemoteException remoteexception) { }
          goto _L1
        this;
        JVM INSTR monitorexit ;
        return;
        m1;
        throw m1;
    }

    static o c(h h1)
    {
        return h1.g;
    }

    private void d()
    {
_L9:
        if (r != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (!m.isEmpty())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (!s)
        {
            s = true;
            for (Iterator iterator = ((Set)e.b()).iterator(); iterator.hasNext(); ((com.facebook.fbservice.service.n)iterator.next()).a(c)) { }
        }
        break MISSING_BLOCK_LABEL_84;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
_L2:
        e();
        return;
        ac ac1;
        m m1;
        s = false;
        ac1 = (ac)m.removeFirst();
        m1 = (m)n.get(ac1.b());
        if (m1 != null) goto _L4; else goto _L3
_L3:
        com.facebook.debug.log.b.d(b, "No holder for queued operation!");
        this;
        JVM INSTR monitorexit ;
          goto _L5
_L4:
        com.facebook.fbservice.service.m.a(m1, l.a());
        this;
        JVM INSTR monitorexit ;
        e e1;
        com.facebook.debug.d.e.b(5L);
        e1 = com.facebook.debug.d.e.a((new StringBuilder()).append("BlueService (").append(ac1.a()).append(")").toString());
        if (p.get())
        {
            throw new Exception("Queue stopped");
        }
          goto _L6
        Throwable throwable;
        throwable;
        com.facebook.debug.log.b.d(b, "Exception during service", throwable);
        a(throwable, ac1.a());
        a(m1, com.facebook.fbservice.service.OperationResult.a(com.facebook.fbservice.service.u.a(throwable), com.facebook.fbservice.service.u.b(throwable)));
        e1.a(0L);
        Exception exception1;
        ViewerContext viewercontext;
        Object obj;
        if (com.facebook.debug.log.b.b(3))
        {
            com.facebook.debug.d.e.a(b);
        } else
        {
            com.facebook.debug.d.e.b();
        }
          goto _L5
_L6:
        viewercontext = (ViewerContext)ac1.c().getParcelable("overridden_viewer_context");
        if (viewercontext == null)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        h.b(viewercontext);
        obj = new ad(ac1.a(), ac1.c(), com.facebook.fbservice.service.m.b(m1));
        obj = ((com.facebook.fbservice.service.e)d.b()).a(((ad) (obj)));
        if (viewercontext == null)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        h.d();
        if (!(obj instanceof FutureOperationResult)) goto _L8; else goto _L7
_L7:
        a(m1, ((FutureOperationResult)obj).a());
_L12:
        e1.a(0L);
        if (com.facebook.debug.log.b.b(3))
        {
            com.facebook.debug.d.e.a(b);
        } else
        {
            com.facebook.debug.d.e.b();
        }
_L5:
        if (true) goto _L9; else goto _L8
        obj;
        if (viewercontext == null) goto _L11; else goto _L10
_L10:
        h.d();
_L11:
        throw obj;
        exception1;
        e1.a(0L);
        if (com.facebook.debug.log.b.b(3))
        {
            com.facebook.debug.d.e.a(b);
        } else
        {
            com.facebook.debug.d.e.b();
        }
        throw exception1;
_L8:
        a(m1, ((OperationResult) (obj)));
          goto _L12
    }

    static void d(h h1)
    {
        h1.d();
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        long l1;
        l1 = l.a();
        iterator = o.iterator();
_L1:
        ac ac1;
        m m1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_118;
        }
        ac1 = (ac)iterator.next();
        m1 = (m)n.get(ac1.b());
        if (m1 != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        com.facebook.debug.log.b.d(b, "No holder for recently completed operation!");
        iterator.remove();
        if (l1 - com.facebook.fbservice.service.m.c(m1) <= 30000L)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        n.remove(ac1.b());
        iterator.remove();
          goto _L1
        Exception exception;
        exception;
        throw exception;
        if (o.size() > 0)
        {
            a(15000L);
        }
        this;
        JVM INSTR monitorexit ;
    }

    Class a()
    {
        return c;
    }

    void a(ac ac1)
    {
        Object obj;
        boolean flag;
        if (!p.get())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Cannot add an operation after queue was stopped");
        this;
        JVM INSTR monitorenter ;
        obj = new m(ac1, l.a());
        com.facebook.fbservice.service.m.a(((m) (obj)), new j(this, ((m) (obj))));
        m.add(ac1);
        n.put(ac1.b(), obj);
        this;
        JVM INSTR monitorexit ;
        for (obj = ((Set)e.b()).iterator(); ((Iterator) (obj)).hasNext(); ((com.facebook.fbservice.service.n)((Iterator) (obj)).next()).a(c, ac1)) { }
        break MISSING_BLOCK_LABEL_138;
        ac1;
        this;
        JVM INSTR monitorexit ;
        throw ac1;
        a(0L);
        return;
    }

    void a(Throwable throwable, OperationType operationtype)
    {
        if (!j.a(a, false))
        {
            return;
        }
        if (throwable instanceof IOException)
        {
            throwable = (new cb("orca_service_exception")).b("type", throwable.getClass().getSimpleName()).b("msg", throwable.getMessage());
            if (operationtype != null)
            {
                throwable.b("operation", operationtype.a());
            }
            k.a(throwable);
            return;
        } else
        {
            i.a("BlueServiceQueue", "Failed BlueService operation", throwable);
            return;
        }
    }

    boolean a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = n.containsKey(s1);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        throw s1;
    }

    boolean a(String s1, z z1)
    {
        this;
        JVM INSTR monitorenter ;
        s1 = (m)n.get(s1);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        if (com.facebook.fbservice.service.m.f(s1) == null) goto _L2; else goto _L1
_L1:
        s1 = com.facebook.fbservice.service.m.f(s1);
_L3:
        this;
        JVM INSTR monitorexit ;
        if (s1 != null)
        {
            try
            {
                z1.b(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        return true;
_L2:
        com.facebook.fbservice.service.m.e(s1).add(z1);
        s1 = null;
          goto _L3
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    void b()
    {
        boolean flag;
        if (!p.get())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Queue cannot be started after stopped");
        q = (i)f.b();
        g.a(this);
    }

    void c()
    {
        if (!p.getAndSet(true))
        {
            q.execute(new com.facebook.fbservice.service.i(this));
        }
    }

}
