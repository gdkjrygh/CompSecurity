// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ij;
import com.google.android.gms.internal.il;

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

        final o aeS;

        public void a(com.google.android.gms.internal.le.a a1)
        {
            com.google.android.gms.internal.c.j j;
            if (a1.aiH != null)
            {
                j = a1.aiH;
            } else
            {
                com.google.android.gms.internal.c.f f1 = a1.fK;
                j = new com.google.android.gms.internal.c.j();
                j.fK = f1;
                j.fJ = null;
                j.fL = f1.fg;
            }
            o.a(aeS, j, a1.aiG, true);
        }

        public void a(bg.a a1)
        {
            if (!o.b(aeS))
            {
                o.a(aeS, 0L);
            }
        }

        public void i(Object obj)
        {
            a((com.google.android.gms.internal.le.a)obj);
        }

        public void lv()
        {
        }

        private b()
        {
            aeS = o.this;
            super();
        }

    }

    private class c
        implements bg
    {

        final o aeS;

        public void a(bg.a a1)
        {
            if (o.f(aeS) != null)
            {
                aeS.b(o.f(aeS));
            } else
            {
                aeS.b(aeS.ap(Status.Eq));
            }
            o.a(aeS, 0x36ee80L);
        }

        public void b(com.google.android.gms.internal.c.j j)
        {
label0:
            {
                synchronized (aeS)
                {
                    if (j.fK != null)
                    {
                        break MISSING_BLOCK_LABEL_59;
                    }
                    if (o.c(aeS).fK != null)
                    {
                        break label0;
                    }
                    bh.A("Current resource is null; network resource is also null");
                    o.a(aeS, 0x36ee80L);
                }
                return;
            }
            j.fK = o.c(aeS).fK;
            o.a(aeS, j, o.a(aeS).currentTimeMillis(), false);
            bh.C((new StringBuilder()).append("setting refresh time to current time: ").append(o.d(aeS)).toString());
            if (!o.e(aeS))
            {
                o.a(aeS, j);
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

        public void lv()
        {
        }

        private c()
        {
            aeS = o.this;
            super();
        }

    }

    private class d
        implements n.a
    {

        final o aeS;

        public void bJ(String s)
        {
            aeS.bJ(s);
        }

        public String lo()
        {
            return aeS.lo();
        }

        public void lq()
        {
            if (o.g(aeS)._mthdo())
            {
                o.a(aeS, 0L);
            }
        }

        private d()
        {
            aeS = o.this;
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

        public abstract void b(com.google.android.gms.internal.le.a a1);

        public abstract cq.c dn(int i);

        public abstract void lw();
    }


    private final Looper DF;
    private final TagManager aeF;
    private final d aeI;
    private final cf aeJ;
    private final int aeK;
    private f aeL;
    private volatile n aeM;
    private volatile boolean aeN;
    private com.google.android.gms.internal.c.j aeO;
    private String aeP;
    private e aeQ;
    private a aeR;
    private final ij aef;
    private final String aet;
    private long aey;
    private final Context mContext;

    o(Context context, TagManager tagmanager, Looper looper, String s, int i, f f1, e e1, 
            ij ij1, cf cf)
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
        aeF = tagmanager;
        context = looper;
        if (looper == null)
        {
            context = Looper.getMainLooper();
        }
        DF = context;
        aet = s;
        aeK = i;
        aeL = f1;
        aeQ = e1;
        aeI = new d();
        aeO = new com.google.android.gms.internal.c.j();
        aef = ij1;
        aeJ = cf;
        if (lu())
        {
            bJ(cd.md().mf());
        }
    }

    public o(Context context, TagManager tagmanager, Looper looper, String s, int i, r r)
    {
        this(context, tagmanager, looper, s, i, ((f) (new cp(context, s))), ((e) (new co(context, s, r))), il.gb(), ((cf) (new bf(30, 0xdbba0L, 5000L, "refreshing", il.gb()))));
    }

    private void H(boolean flag)
    {
        aeL.a(new b());
        aeQ.a(new c());
        cq.c c1 = aeL.dn(aeK);
        if (c1 != null)
        {
            aeM = new n(aeF, DF, new Container(mContext, aeF.getDataLayer(), aet, 0L, c1), aeI);
        }
        aeR = new a(flag) {

            final o aeS;
            final boolean aeT;

            public boolean b(Container container)
            {
                if (!aeT) goto _L2; else goto _L1
_L1:
                if (container.getLastRefreshTime() + 0x2932e00L < o.a(aeS).currentTimeMillis()) goto _L4; else goto _L3
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
                aeS = o.this;
                aeT = flag;
                super();
            }
        };
        if (lu())
        {
            aeQ.e(0L, "");
            return;
        } else
        {
            aeL.lw();
            return;
        }
    }

    static ij a(o o1)
    {
        return o1.aef;
    }

    private void a(com.google.android.gms.internal.c.j j)
    {
        this;
        JVM INSTR monitorenter ;
        if (aeL != null)
        {
            com.google.android.gms.internal.le.a a1 = new com.google.android.gms.internal.le.a();
            a1.aiG = aey;
            a1.fK = new com.google.android.gms.internal.c.f();
            a1.aiH = j;
            aeL.b(a1);
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
        flag = aeN;
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (isReady())
        {
            if (aeM != null);
        }
        aeO = j;
        aey = l;
        w(Math.max(0L, Math.min(0x2932e00L, (aey + 0x2932e00L) - aef.currentTimeMillis())));
        j = new Container(mContext, aeF.getDataLayer(), aet, l, j);
        if (aeM != null)
        {
            break; /* Loop/switch isn't completed */
        }
        aeM = new n(aeF, DF, j, aeI);
_L5:
        if (!isReady() && aeR.b(j))
        {
            b(aeM);
        }
        if (true) goto _L3; else goto _L4
        j;
        throw j;
_L4:
        aeM.a(j);
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
        return o1.aeN;
    }

    static com.google.android.gms.internal.c.j c(o o1)
    {
        return o1.aeO;
    }

    static long d(o o1)
    {
        return o1.aey;
    }

    static boolean e(o o1)
    {
        return o1.lu();
    }

    static n f(o o1)
    {
        return o1.aeM;
    }

    static cf g(o o1)
    {
        return o1.aeJ;
    }

    private boolean lu()
    {
        cd cd1 = cd.md();
        return (cd1.me() == cd.a.agC || cd1.me() == cd.a.agD) && aet.equals(cd1.getContainerId());
    }

    private void w(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (aeQ != null) goto _L2; else goto _L1
_L1:
        bh.D("Refresh requested, but no network load scheduler.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aeQ.e(l, aeO.fL);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected ContainerHolder ap(Status status)
    {
        if (aeM != null)
        {
            return aeM;
        }
        if (status == Status.Eq)
        {
            bh.A("timer expired: setting result to failure");
        }
        return new n(status);
    }

    void bJ(String s)
    {
        this;
        JVM INSTR monitorenter ;
        aeP = s;
        if (aeQ != null)
        {
            aeQ.bM(s);
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

    String lo()
    {
        this;
        JVM INSTR monitorenter ;
        String s = aeP;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void lr()
    {
        Object obj = aeL.dn(aeK);
        if (obj != null)
        {
            obj = new Container(mContext, aeF.getDataLayer(), aet, 0L, ((cq.c) (obj)));
            b(new n(aeF, DF, ((Container) (obj)), new n.a() {

                final o aeS;

                public void bJ(String s)
                {
                    aeS.bJ(s);
                }

                public String lo()
                {
                    return aeS.lo();
                }

                public void lq()
                {
                    bh.D("Refresh ignored: container loaded as default only.");
                }

            
            {
                aeS = o.this;
                super();
            }
            }));
        } else
        {
            bh.A("Default was requested, but no default container was found");
            b(ap(new Status(10, "Default was requested, but no default container was found", null)));
        }
        aeQ = null;
        aeL = null;
    }

    public void ls()
    {
        H(false);
    }

    public void lt()
    {
        H(true);
    }
}
