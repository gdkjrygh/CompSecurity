// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lf;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ce, cq, cp, bf, 
//            n, Container, TagManager, bh, 
//            cg, r, ContainerHolder, bg

class o extends com.google.android.gms.common.api.BaseImplementation.AbstractPendingResult
{
    static interface a
    {

        public abstract boolean b(Container container);
    }

    private class b
        implements bg
    {

        final o aqL;

        public void a(com.google.android.gms.internal.pu.a a1)
        {
            com.google.android.gms.internal.c.j j;
            if (a1.auC != null)
            {
                j = a1.auC;
            } else
            {
                com.google.android.gms.internal.c.f f1 = a1.gs;
                j = new com.google.android.gms.internal.c.j();
                j.gs = f1;
                j.gr = null;
                j.gt = f1.version;
            }
            o.a(aqL, j, a1.auB, true);
        }

        public void a(bg.a a1)
        {
            if (!o.b(aqL))
            {
                o.a(aqL, 0L);
            }
        }

        public void l(Object obj)
        {
            a((com.google.android.gms.internal.pu.a)obj);
        }

        public void ps()
        {
        }

        private b()
        {
            aqL = o.this;
            super();
        }

    }

    private class c
        implements bg
    {

        final o aqL;

        public void a(bg.a a1)
        {
            if (o.f(aqL) != null)
            {
                aqL.b(o.f(aqL));
            } else
            {
                aqL.b(aqL.aD(Status.Kz));
            }
            o.a(aqL, 0x36ee80L);
        }

        public void b(com.google.android.gms.internal.c.j j)
        {
label0:
            {
                synchronized (aqL)
                {
                    if (j.gs != null)
                    {
                        break MISSING_BLOCK_LABEL_59;
                    }
                    if (o.c(aqL).gs != null)
                    {
                        break label0;
                    }
                    bh.T("Current resource is null; network resource is also null");
                    o.a(aqL, 0x36ee80L);
                }
                return;
            }
            j.gs = o.c(aqL).gs;
            o.a(aqL, j, o.a(aqL).currentTimeMillis(), false);
            bh.V((new StringBuilder()).append("setting refresh time to current time: ").append(o.d(aqL)).toString());
            if (!o.e(aqL))
            {
                o.a(aqL, j);
            }
            o1;
            JVM INSTR monitorexit ;
            return;
            j;
            o1;
            JVM INSTR monitorexit ;
            throw j;
        }

        public void l(Object obj)
        {
            b((com.google.android.gms.internal.c.j)obj);
        }

        public void ps()
        {
        }

        private c()
        {
            aqL = o.this;
            super();
        }

    }

    private class d
        implements n.a
    {

        final o aqL;

        public void ct(String s)
        {
            aqL.ct(s);
        }

        public String pl()
        {
            return aqL.pl();
        }

        public void pn()
        {
            if (o.g(aqL).fe())
            {
                o.a(aqL, 0L);
            }
        }

        private d()
        {
            aqL = o.this;
            super();
        }

    }

    static interface e
        extends Releasable
    {

        public abstract void a(bg bg);

        public abstract void cw(String s);

        public abstract void e(long l, String s);
    }

    static interface f
        extends Releasable
    {

        public abstract void a(bg bg);

        public abstract void b(com.google.android.gms.internal.pu.a a1);

        public abstract cr.c fH(int i);

        public abstract void pt();
    }


    private final Looper JF;
    private final d aqB;
    private final cg aqC;
    private final int aqD;
    private f aqE;
    private volatile n aqF;
    private volatile boolean aqG;
    private com.google.android.gms.internal.c.j aqH;
    private String aqI;
    private e aqJ;
    private a aqK;
    private final String aqm;
    private long aqr;
    private final TagManager aqy;
    private final Context mContext;
    private final ld wb;

    o(Context context, TagManager tagmanager, Looper looper, String s, int i, f f1, e e1, 
            ld ld1, cg cg)
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
        aqy = tagmanager;
        context = looper;
        if (looper == null)
        {
            context = Looper.getMainLooper();
        }
        JF = context;
        aqm = s;
        aqD = i;
        aqE = f1;
        aqJ = e1;
        aqB = new d();
        aqH = new com.google.android.gms.internal.c.j();
        wb = ld1;
        aqC = cg;
        if (pr())
        {
            ct(ce.qa().qc());
        }
    }

    public o(Context context, TagManager tagmanager, Looper looper, String s, int i, r r)
    {
        this(context, tagmanager, looper, s, i, ((f) (new cq(context, s))), ((e) (new cp(context, s, r))), lf._mthif(), ((cg) (new bf(30, 0xdbba0L, 5000L, "refreshing", lf._mthif()))));
    }

    private void V(boolean flag)
    {
        aqE.a(new b());
        aqJ.a(new c());
        cr.c c1 = aqE.fH(aqD);
        if (c1 != null)
        {
            aqF = new n(aqy, JF, new Container(mContext, aqy.getDataLayer(), aqm, 0L, c1), aqB);
        }
        aqK = new a(flag) {

            final o aqL;
            final boolean aqM;

            public boolean b(Container container)
            {
                if (!aqM) goto _L2; else goto _L1
_L1:
                if (container.getLastRefreshTime() + 0x2932e00L < o.a(aqL).currentTimeMillis()) goto _L4; else goto _L3
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
                aqL = o.this;
                aqM = flag;
                super();
            }
        };
        if (pr())
        {
            aqJ.e(0L, "");
            return;
        } else
        {
            aqE.pt();
            return;
        }
    }

    static ld a(o o1)
    {
        return o1.wb;
    }

    private void a(com.google.android.gms.internal.c.j j)
    {
        this;
        JVM INSTR monitorenter ;
        if (aqE != null)
        {
            com.google.android.gms.internal.pu.a a1 = new com.google.android.gms.internal.pu.a();
            a1.auB = aqr;
            a1.gs = new com.google.android.gms.internal.c.f();
            a1.auC = j;
            aqE.b(a1);
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
        flag = aqG;
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (isReady())
        {
            if (aqF != null);
        }
        aqH = j;
        aqr = l;
        w(Math.max(0L, Math.min(0x2932e00L, (aqr + 0x2932e00L) - wb.currentTimeMillis())));
        j = new Container(mContext, aqy.getDataLayer(), aqm, l, j);
        if (aqF != null)
        {
            break; /* Loop/switch isn't completed */
        }
        aqF = new n(aqy, JF, j, aqB);
_L5:
        if (!isReady() && aqK.b(j))
        {
            b(aqF);
        }
        if (true) goto _L3; else goto _L4
        j;
        throw j;
_L4:
        aqF.a(j);
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
        return o1.aqG;
    }

    static com.google.android.gms.internal.c.j c(o o1)
    {
        return o1.aqH;
    }

    static long d(o o1)
    {
        return o1.aqr;
    }

    static boolean e(o o1)
    {
        return o1.pr();
    }

    static n f(o o1)
    {
        return o1.aqF;
    }

    static cg g(o o1)
    {
        return o1.aqC;
    }

    private boolean pr()
    {
        ce ce1 = ce.qa();
        return (ce1.qb() == ce.a.asr || ce1.qb() == ce.a.ass) && aqm.equals(ce1.getContainerId());
    }

    private void w(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (aqJ != null) goto _L2; else goto _L1
_L1:
        bh.W("Refresh requested, but no network load scheduler.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aqJ.e(l, aqH.gt);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected ContainerHolder aD(Status status)
    {
        if (aqF != null)
        {
            return aqF;
        }
        if (status == Status.Kz)
        {
            bh.T("timer expired: setting result to failure");
        }
        return new n(status);
    }

    protected Result c(Status status)
    {
        return aD(status);
    }

    void ct(String s)
    {
        this;
        JVM INSTR monitorenter ;
        aqI = s;
        if (aqJ != null)
        {
            aqJ.cw(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    String pl()
    {
        this;
        JVM INSTR monitorenter ;
        String s = aqI;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void po()
    {
        Object obj = aqE.fH(aqD);
        if (obj != null)
        {
            obj = new Container(mContext, aqy.getDataLayer(), aqm, 0L, ((cr.c) (obj)));
            b(new n(aqy, JF, ((Container) (obj)), new n.a() {

                final o aqL;

                public void ct(String s)
                {
                    aqL.ct(s);
                }

                public String pl()
                {
                    return aqL.pl();
                }

                public void pn()
                {
                    bh.W("Refresh ignored: container loaded as default only.");
                }

            
            {
                aqL = o.this;
                super();
            }
            }));
        } else
        {
            bh.T("Default was requested, but no default container was found");
            b(aD(new Status(10, "Default was requested, but no default container was found", null)));
        }
        aqJ = null;
        aqE = null;
    }

    public void pp()
    {
        V(false);
    }

    public void pq()
    {
        V(true);
    }
}
