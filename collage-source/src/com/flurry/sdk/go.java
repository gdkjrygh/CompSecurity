// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            fz, fp, gd, hp, 
//            fj, gn, fy, hq, 
//            fi, fx

public abstract class go
{

    private static final String a = com/flurry/sdk/go.getSimpleName();
    private final int b = 0x7fffffff;
    private final List c = new ArrayList();
    private boolean d;
    private int e;
    private long f;
    private final Runnable g = new hq() {

        final go a;

        public void safeRun()
        {
            go.a(a);
        }

            
            {
                a = go.this;
                super();
            }
    };
    private final fy h = new fy() {

        final go a;

        public void a(fi fi1)
        {
            if (fi1.a)
            {
                go.a(a);
            }
        }

        public void notify(fx fx)
        {
            a((fi)fx);
        }

            
            {
                a = go.this;
                super();
            }
    };

    public go()
    {
        fz.a().a("com.flurry.android.sdk.NetworkStateEvent", h);
        f = 10000L;
        e = -1;
        fp.a().b(new hq() {

            final go a;

            public void safeRun()
            {
                a.a(go.b(a));
                go.a(a);
            }

            
            {
                a = go.this;
                super();
            }
        });
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (e < 0)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        gd.a(3, a, "Transmit is in progress");
          goto _L1
        Exception exception;
        exception;
        throw exception;
label0:
        {
            g();
            if (!c.isEmpty())
            {
                break label0;
            }
            f = 10000L;
            e = -1;
        }
          goto _L1
        e = 0;
        fp.a().b(new hq() {

            final go a;

            public void safeRun()
            {
                go.c(a);
            }

            
            {
                a = go.this;
                super();
            }
        });
          goto _L1
    }

    static void a(go go1)
    {
        go1.a();
    }

    static List b(go go1)
    {
        return go1.c;
    }

    static void c(go go1)
    {
        go1.e();
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        hp.b();
        if (!fj.a().c()) goto _L2; else goto _L1
_L1:
        if (e >= c.size()) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = c;
        int i = e;
        e = i + 1;
        obj = (gn)((List) (obj)).get(i);
        if (((gn) (obj)).e()) goto _L1; else goto _L5
_L5:
        if (obj != null) goto _L7; else goto _L6
_L6:
        f();
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        gd.a(3, a, "Network is not available, aborting transmission");
        break; /* Loop/switch isn't completed */
_L7:
        a(((gn) (obj)));
        if (true) goto _L8; else goto _L4
        obj;
        throw obj;
_L4:
        obj = null;
        if (true) goto _L5; else goto _L9
_L9:
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        g();
        b(c);
        if (!d) goto _L2; else goto _L1
_L1:
        gd.a(3, a, "Reporter paused");
        f = 10000L;
_L3:
        e = -1;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!c.isEmpty())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        gd.a(3, a, "All reports sent successfully");
        f = 10000L;
          goto _L3
        Exception exception;
        exception;
        throw exception;
        f = f << 1;
        gd.a(3, a, (new StringBuilder()).append("One or more reports failed to send, backing off: ").append(f).append("ms").toString());
        fp.a().b(g, f);
          goto _L3
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            gn gn1 = (gn)iterator.next();
            if (gn1.e() || gn1.f() >= 0x7fffffff || System.currentTimeMillis() > gn1.d())
            {
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_72;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    private void h()
    {
        fz.a().b("com.flurry.android.sdk.NetworkStateEvent", h);
    }

    protected abstract void a(gn gn1);

    protected abstract void a(List list);

    public void b()
    {
        fp.a().c(g);
        h();
    }

    public void b(gn gn1)
    {
        this;
        JVM INSTR monitorenter ;
        if (gn1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c.add(gn1);
        fp.a().b(new hq() {

            final go a;

            public void safeRun()
            {
                go.a(a);
            }

            
            {
                a = go.this;
                super();
            }
        });
        if (true) goto _L1; else goto _L3
_L3:
        gn1;
        throw gn1;
    }

    protected abstract void b(List list);

    public void c()
    {
        d = true;
    }

    protected void c(gn gn1)
    {
        this;
        JVM INSTR monitorenter ;
        gn1.a(true);
        fp.a().b(new hq() {

            final go a;

            public void safeRun()
            {
                go.c(a);
            }

            
            {
                a = go.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        gn1;
        throw gn1;
    }

    public void d()
    {
        d = false;
        fp.a().b(new hq() {

            final go a;

            public void safeRun()
            {
                go.a(a);
            }

            
            {
                a = go.this;
                super();
            }
        });
    }

    protected void d(gn gn1)
    {
        this;
        JVM INSTR monitorenter ;
        gn1.i();
        fp.a().b(new hq() {

            final go a;

            public void safeRun()
            {
                go.c(a);
            }

            
            {
                a = go.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        gn1;
        throw gn1;
    }

}
