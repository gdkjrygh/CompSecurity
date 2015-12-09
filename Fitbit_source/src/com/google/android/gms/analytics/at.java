// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.analytics:
//            u, as, p, y, 
//            af, r, ai, ad, 
//            ap, ae

class at extends u
{

    private static final Object a = new Object();
    private static at p;
    private Context b;
    private ad c;
    private volatile af d;
    private int e;
    private boolean f;
    private boolean g;
    private String h;
    private boolean i;
    private boolean j;
    private ae k;
    private Handler l;
    private as m;
    private boolean n;
    private boolean o;

    private at()
    {
        e = 1800;
        f = true;
        i = true;
        j = true;
        k = new ae() {

            final at a;

            public void a(boolean flag)
            {
                a.a(flag, at.a(a));
            }

            
            {
                a = at.this;
                super();
            }
        };
        n = false;
        o = false;
    }

    static boolean a(at at1)
    {
        return at1.i;
    }

    static int b(at at1)
    {
        return at1.e;
    }

    public static at c()
    {
        if (p == null)
        {
            p = new at();
        }
        return p;
    }

    static boolean c(at at1)
    {
        return at1.n;
    }

    static Handler d(at at1)
    {
        return at1.l;
    }

    static Object f()
    {
        return a;
    }

    private void g()
    {
        m = new as(this);
        m.a(b);
    }

    private void h()
    {
        l = new Handler(b.getMainLooper(), new android.os.Handler.Callback() {

            final at a;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && at.f().equals(message.obj))
                {
                    y.a().a(true);
                    a.a();
                    y.a().a(false);
                    if (at.b(a) > 0 && !at.c(a))
                    {
                        at.d(a).sendMessageDelayed(at.d(a).obtainMessage(1, at.f()), at.b(a) * 1000);
                    }
                }
                return true;
            }

            
            {
                a = at.this;
                super();
            }
        });
        if (e > 0)
        {
            l.sendMessageDelayed(l.obtainMessage(1, a), e * 1000);
        }
    }

    void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (d != null) goto _L2; else goto _L1
_L1:
        com.google.android.gms.analytics.p.c("Dispatch call queued. Dispatch will run once initialization is complete.");
        f = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        y.a().a(y.a.S);
        d.a();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l != null) goto _L2; else goto _L1
_L1:
        com.google.android.gms.analytics.p.c("Dispatch period set with null handler. Dispatch will run once initialization is complete.");
        e = i1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        y.a().a(y.a.T);
        if (!n && i && e > 0)
        {
            l.removeMessages(1, a);
        }
        e = i1;
        if (i1 <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!n && i)
        {
            l.sendMessageDelayed(l.obtainMessage(1, a), i1 * 1000);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void a(Context context, af af1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = b;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b = context.getApplicationContext();
        if (d == null)
        {
            d = af1;
            if (f)
            {
                a();
                f = false;
            }
            if (g)
            {
                e();
                g = false;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(n, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void a(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (n != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = i;
        if (flag2 != flag1) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag && flag1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (e > 0)
        {
            l.removeMessages(1, a);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (e > 0)
        {
            l.sendMessageDelayed(l.obtainMessage(1, a), e * 1000);
        }
        StringBuilder stringbuilder = (new StringBuilder()).append("PowerSaveMode ");
        Object obj;
        if (!flag && flag1)
        {
            obj = "terminated.";
        } else
        {
            obj = "initiated.";
        }
        com.google.android.gms.analytics.p.c(stringbuilder.append(((String) (obj))).toString());
        n = flag;
        i = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!n && i && e > 0)
        {
            l.removeMessages(1, a);
            l.sendMessage(l.obtainMessage(1, a));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    ad d()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        if (b == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        c = new r(k, b, new ai());
        c.a(o);
        if (h != null)
        {
            c.d().a(h);
            h = null;
        }
        ad ad1;
        if (l == null)
        {
            h();
        }
        if (m == null && j)
        {
            g();
        }
        ad1 = c;
        this;
        JVM INSTR monitorexit ;
        return ad1;
    }

    void e()
    {
        if (d == null)
        {
            com.google.android.gms.analytics.p.c("setForceLocalDispatch() queued. It will be called once initialization is complete.");
            g = true;
            return;
        } else
        {
            y.a().a(y.a.af);
            d.c();
            return;
        }
    }

}
