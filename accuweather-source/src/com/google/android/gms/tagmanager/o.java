// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ik;
import com.google.android.gms.internal.im;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cd, cp, co, bf, 
//            n, Container, TagManager, bh, 
//            cf, r, ContainerHolder, bg

class o extends com.google.android.gms.common.api.a.a
{
    static interface a
    {

        public abstract boolean b(Container container);
    }

    private class b
        implements bg
    {

        final o aeP;

        public void a(com.google.android.gms.internal.lf.a a1)
        {
            com.google.android.gms.internal.c.j j;
            if (a1.aiE != null)
            {
                j = a1.aiE;
            } else
            {
                com.google.android.gms.internal.c.f f1 = a1.fK;
                j = new com.google.android.gms.internal.c.j();
                j.fK = f1;
                j.fJ = null;
                j.fL = f1.fg;
            }
            o.a(aeP, j, a1.aiD, true);
        }

        public void a(bg.a a1)
        {
            if (!o.b(aeP))
            {
                o.a(aeP, 0L);
            }
        }

        public void i(Object obj)
        {
            a((com.google.android.gms.internal.lf.a)obj);
        }

        public void lq()
        {
        }

        private b()
        {
            aeP = o.this;
            super();
        }

    }

    private class c
        implements bg
    {

        final o aeP;

        public void a(bg.a a1)
        {
            if (o.f(aeP) != null)
            {
                aeP.b(o.f(aeP));
            } else
            {
                aeP.b(aeP.ap(Status.En));
            }
            o.a(aeP, 0x36ee80L);
        }

        public void b(com.google.android.gms.internal.c.j j)
        {
label0:
            {
                synchronized (aeP)
                {
                    if (j.fK != null)
                    {
                        break MISSING_BLOCK_LABEL_59;
                    }
                    if (o.c(aeP).fK != null)
                    {
                        break label0;
                    }
                    bh.A("Current resource is null; network resource is also null");
                    o.a(aeP, 0x36ee80L);
                }
                return;
            }
            j.fK = o.c(aeP).fK;
            o.a(aeP, j, o.a(aeP).currentTimeMillis(), false);
            bh.C((new StringBuilder()).append("setting refresh time to current time: ").append(o.d(aeP)).toString());
            if (!o.e(aeP))
            {
                o.a(aeP, j);
            }
            o1;
            JVM INSTR monitorexit ;
            return;
            j;
            o1;
            JVM INSTR monitorexit ;
            throw j;
        }

        public void i(Object obj)
        {
            b((com.google.android.gms.internal.c.j)obj);
        }

        public void lq()
        {
        }

        private c()
        {
            aeP = o.this;
            super();
        }

    }

    private class d
        implements n.a
    {

        final o aeP;

        public void bJ(String s)
        {
            aeP.bJ(s);
        }

        public String lj()
        {
            return aeP.lj();
        }

        public void ll()
        {
            if (o.g(aeP).dj())
            {
                o.a(aeP, 0L);
            }
        }

        private d()
        {
            aeP = o.this;
            super();
        }

    }

    static interface e
        extends Releasable
    {

        public abstract void a(bg bg);

        public abstract void bM(String s);

        public abstract void e(long l, String s);
    }

    static interface f
        extends Releasable
    {

        public abstract void a(bg bg);

        public abstract void b(com.google.android.gms.internal.lf.a a1);

        public abstract cq.c dn(int i);

        public abstract void lr();
    }


    private final Looper DC;
    private final TagManager aeC;
    private final d aeF;
    private final cf aeG;
    private final int aeH;
    private f aeI;
    private volatile n aeJ;
    private volatile boolean aeK;
    private com.google.android.gms.internal.c.j aeL;
    private String aeM;
    private e aeN;
    private a aeO;
    private final ik aec;
    private final String aeq;
    private long aev;
    private final Context mContext;

    o(Context context, TagManager tagmanager, Looper looper, String s, int i, f f1, e e1, 
            ik ik1, cf cf)
    {
        Looper looper1;
        if (looper == null)
        {
            looper1 = Looper.getMainLooper();
        } else
        {
            looper1 = looper;
        }
        super(looper1);
        mContext = context;
        aeC = tagmanager;
        context = looper;
        if (looper == null)
        {
            context = Looper.getMainLooper();
        }
        DC = context;
        aeq = s;
        aeH = i;
        aeI = f1;
        aeN = e1;
        aeF = new d();
        aeL = new com.google.android.gms.internal.c.j();
        aec = ik1;
        aeG = cf;
        if (lp())
        {
            bJ(cd.lY().ma());
        }
    }

    public o(Context context, TagManager tagmanager, Looper looper, String s, int i, r r)
    {
        this(context, tagmanager, looper, s, i, ((f) (new cp(context, s))), ((e) (new co(context, s, r))), im.fW(), ((cf) (new bf(30, 0xdbba0L, 5000L, "refreshing", im.fW()))));
    }

    private void H(boolean flag)
    {
        aeI.a(new b());
        aeN.a(new c());
        cq.c c1 = aeI.dn(aeH);
        if (c1 != null)
        {
            aeJ = new n(aeC, DC, new Container(mContext, aeC.getDataLayer(), aeq, 0L, c1), aeF);
        }
        aeO = new a(flag) {

            final o aeP;
            final boolean aeQ;

            public boolean b(Container container)
            {
                if (!aeQ) goto _L2; else goto _L1
_L1:
                if (container.getLastRefreshTime() + 0x2932e00L < o.a(aeP).currentTimeMillis()) goto _L4; else goto _L3
_L3:
                return true;
_L4:
                return false;
_L2:
                if (container.isDefault())
                {
                    return false;
                }
                if (true) goto _L3; else goto _L5
_L5:
            }

            
            {
                aeP = o.this;
                aeQ = flag;
                super();
            }
        };
        if (lp())
        {
            aeN.e(0L, "");
            return;
        } else
        {
            aeI.lr();
            return;
        }
    }

    static ik a(o o1)
    {
        return o1.aec;
    }

    private void a(com.google.android.gms.internal.c.j j)
    {
        this;
        JVM INSTR monitorenter ;
        if (aeI != null)
        {
            com.google.android.gms.internal.lf.a a1 = new com.google.android.gms.internal.lf.a();
            a1.aiD = aev;
            a1.fK = new com.google.android.gms.internal.c.f();
            a1.aiE = j;
            aeI.b(a1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        j;
        throw j;
    }

    private void a(com.google.android.gms.internal.c.j j, long l, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = aeK;
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (isReady())
        {
            if (aeJ != null);
        }
        aeL = j;
        aev = l;
        w(Math.max(0L, Math.min(0x2932e00L, (aev + 0x2932e00L) - aec.currentTimeMillis())));
        j = new Container(mContext, aeC.getDataLayer(), aeq, l, j);
        if (aeJ != null)
        {
            break; /* Loop/switch isn't completed */
        }
        aeJ = new n(aeC, DC, j, aeF);
_L5:
        if (!isReady() && aeO.b(j))
        {
            b(aeJ);
        }
        if (true) goto _L3; else goto _L4
        j;
        throw j;
_L4:
        aeJ.a(j);
          goto _L5
    }

    static void a(o o1, long l)
    {
        o1.w(l);
    }

    static void a(o o1, com.google.android.gms.internal.c.j j)
    {
        o1.a(j);
    }

    static void a(o o1, com.google.android.gms.internal.c.j j, long l, boolean flag)
    {
        o1.a(j, l, flag);
    }

    static boolean b(o o1)
    {
        return o1.aeK;
    }

    static com.google.android.gms.internal.c.j c(o o1)
    {
        return o1.aeL;
    }

    static long d(o o1)
    {
        return o1.aev;
    }

    static boolean e(o o1)
    {
        return o1.lp();
    }

    static n f(o o1)
    {
        return o1.aeJ;
    }

    static cf g(o o1)
    {
        return o1.aeG;
    }

    private boolean lp()
    {
        cd cd1 = cd.lY();
        return (cd1.lZ() == cd.a.agz || cd1.lZ() == cd.a.agA) && aeq.equals(cd1.getContainerId());
    }

    private void w(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (aeN != null) goto _L2; else goto _L1
_L1:
        bh.D("Refresh requested, but no network load scheduler.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aeN.e(l, aeL.fL);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected ContainerHolder ap(Status status)
    {
        if (aeJ != null)
        {
            return aeJ;
        }
        if (status == Status.En)
        {
            bh.A("timer expired: setting result to failure");
        }
        return new n(status);
    }

    void bJ(String s)
    {
        this;
        JVM INSTR monitorenter ;
        aeM = s;
        if (aeN != null)
        {
            aeN.bM(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    protected Result c(Status status)
    {
        return ap(status);
    }

    String lj()
    {
        this;
        JVM INSTR monitorenter ;
        String s = aeM;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void lm()
    {
        Object obj = aeI.dn(aeH);
        if (obj != null)
        {
            obj = new Container(mContext, aeC.getDataLayer(), aeq, 0L, ((cq.c) (obj)));
            b(new n(aeC, DC, ((Container) (obj)), new n.a() {

                final o aeP;

                public void bJ(String s)
                {
                    aeP.bJ(s);
                }

                public String lj()
                {
                    return aeP.lj();
                }

                public void ll()
                {
                    bh.D("Refresh ignored: container loaded as default only.");
                }

            
            {
                aeP = o.this;
                super();
            }
            }));
        } else
        {
            bh.A("Default was requested, but no default container was found");
            b(ap(new Status(10, "Default was requested, but no default container was found", null)));
        }
        aeN = null;
        aeI = null;
    }

    public void ln()
    {
        H(false);
    }

    public void lo()
    {
        H(true);
    }
}
