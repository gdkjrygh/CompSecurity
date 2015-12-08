// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.jw;

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

        final o aoB;

        public void a(com.google.android.gms.internal.ol.a a1)
        {
            com.google.android.gms.internal.c.j j;
            if (a1.ass != null)
            {
                j = a1.ass;
            } else
            {
                com.google.android.gms.internal.c.f f1 = a1.gs;
                j = new com.google.android.gms.internal.c.j();
                j.gs = f1;
                j.gr = null;
                j.gt = f1.version;
            }
            o.a(aoB, j, a1.asr, true);
        }

        public void a(bg.a a1)
        {
            if (!o.b(aoB))
            {
                o.a(aoB, 0L);
            }
        }

        public void l(Object obj)
        {
            a((com.google.android.gms.internal.ol.a)obj);
        }

        public void ob()
        {
        }

        private b()
        {
            aoB = o.this;
            super();
        }

    }

    private class c
        implements bg
    {

        final o aoB;

        public void a(bg.a a1)
        {
            if (o.f(aoB) != null)
            {
                aoB.b(o.f(aoB));
            } else
            {
                aoB.b(aoB.aE(Status.Jy));
            }
            o.a(aoB, 0x36ee80L);
        }

        public void b(com.google.android.gms.internal.c.j j)
        {
label0:
            {
                synchronized (aoB)
                {
                    if (j.gs != null)
                    {
                        break MISSING_BLOCK_LABEL_59;
                    }
                    if (o.c(aoB).gs != null)
                    {
                        break label0;
                    }
                    bh.T("Current resource is null; network resource is also null");
                    o.a(aoB, 0x36ee80L);
                }
                return;
            }
            j.gs = o.c(aoB).gs;
            o.a(aoB, j, o.a(aoB).currentTimeMillis(), false);
            bh.V((new StringBuilder()).append("setting refresh time to current time: ").append(o.d(aoB)).toString());
            if (!o.e(aoB))
            {
                o.a(aoB, j);
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

        public void ob()
        {
        }

        private c()
        {
            aoB = o.this;
            super();
        }

    }

    private class d
        implements n.a
    {

        final o aoB;

        public void cr(String s)
        {
            aoB.cr(s);
        }

        public String nU()
        {
            return aoB.nU();
        }

        public void nW()
        {
            if (o.g(aoB).eJ())
            {
                o.a(aoB, 0L);
            }
        }

        private d()
        {
            aoB = o.this;
            super();
        }

    }

    static interface e
        extends Releasable
    {

        public abstract void a(bg bg);

        public abstract void cu(String s);

        public abstract void e(long l, String s);
    }

    static interface f
        extends Releasable
    {

        public abstract void a(bg bg);

        public abstract void b(com.google.android.gms.internal.ol.a a1);

        public abstract cr.c ff(int i);

        public abstract void oc();
    }


    private final Looper IH;
    private a aoA;
    private final String aoc;
    private long aoh;
    private final TagManager aoo;
    private final d aor;
    private final cg aos;
    private final int aot;
    private f aou;
    private volatile n aov;
    private volatile boolean aow;
    private com.google.android.gms.internal.c.j aox;
    private String aoy;
    private e aoz;
    private final Context mContext;
    private final ju yD;

    o(Context context, TagManager tagmanager, Looper looper, String s, int i, f f1, e e1, 
            ju ju1, cg cg)
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
        aoo = tagmanager;
        context = looper;
        if (looper == null)
        {
            context = Looper.getMainLooper();
        }
        IH = context;
        aoc = s;
        aot = i;
        aou = f1;
        aoz = e1;
        aor = new d();
        aox = new com.google.android.gms.internal.c.j();
        yD = ju1;
        aos = cg;
        if (oa())
        {
            cr(ce.oJ().oL());
        }
    }

    public o(Context context, TagManager tagmanager, Looper looper, String s, int i, r r)
    {
        this(context, tagmanager, looper, s, i, ((f) (new cq(context, s))), ((e) (new cp(context, s, r))), jw.hA(), ((cg) (new bf(30, 0xdbba0L, 5000L, "refreshing", jw.hA()))));
    }

    private void T(boolean flag)
    {
        aou.a(new b());
        aoz.a(new c());
        cr.c c1 = aou.ff(aot);
        if (c1 != null)
        {
            aov = new n(aoo, IH, new Container(mContext, aoo.getDataLayer(), aoc, 0L, c1), aor);
        }
        aoA = new a(flag) {

            final o aoB;
            final boolean aoC;

            public boolean b(Container container)
            {
                if (!aoC) goto _L2; else goto _L1
_L1:
                if (container.getLastRefreshTime() + 0x2932e00L < o.a(aoB).currentTimeMillis()) goto _L4; else goto _L3
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
                aoB = o.this;
                aoC = flag;
                super();
            }
        };
        if (oa())
        {
            aoz.e(0L, "");
            return;
        } else
        {
            aou.oc();
            return;
        }
    }

    static ju a(o o1)
    {
        return o1.yD;
    }

    private void a(com.google.android.gms.internal.c.j j)
    {
        this;
        JVM INSTR monitorenter ;
        if (aou != null)
        {
            com.google.android.gms.internal.ol.a a1 = new com.google.android.gms.internal.ol.a();
            a1.asr = aoh;
            a1.gs = new com.google.android.gms.internal.c.f();
            a1.ass = j;
            aou.b(a1);
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
        flag = aow;
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (isReady())
        {
            if (aov != null);
        }
        aox = j;
        aoh = l;
        w(Math.max(0L, Math.min(0x2932e00L, (aoh + 0x2932e00L) - yD.currentTimeMillis())));
        j = new Container(mContext, aoo.getDataLayer(), aoc, l, j);
        if (aov != null)
        {
            break; /* Loop/switch isn't completed */
        }
        aov = new n(aoo, IH, j, aor);
_L5:
        if (!isReady() && aoA.b(j))
        {
            b(aov);
        }
        if (true) goto _L3; else goto _L4
        j;
        throw j;
_L4:
        aov.a(j);
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
        return o1.aow;
    }

    static com.google.android.gms.internal.c.j c(o o1)
    {
        return o1.aox;
    }

    static long d(o o1)
    {
        return o1.aoh;
    }

    static boolean e(o o1)
    {
        return o1.oa();
    }

    static n f(o o1)
    {
        return o1.aov;
    }

    static cg g(o o1)
    {
        return o1.aos;
    }

    private boolean oa()
    {
        ce ce1 = ce.oJ();
        return (ce1.oK() == ce.a.aqi || ce1.oK() == ce.a.aqj) && aoc.equals(ce1.getContainerId());
    }

    private void w(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (aoz != null) goto _L2; else goto _L1
_L1:
        bh.W("Refresh requested, but no network load scheduler.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aoz.e(l, aox.gt);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected ContainerHolder aE(Status status)
    {
        if (aov != null)
        {
            return aov;
        }
        if (status == Status.Jy)
        {
            bh.T("timer expired: setting result to failure");
        }
        return new n(status);
    }

    protected Result c(Status status)
    {
        return aE(status);
    }

    void cr(String s)
    {
        this;
        JVM INSTR monitorenter ;
        aoy = s;
        if (aoz != null)
        {
            aoz.cu(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    String nU()
    {
        this;
        JVM INSTR monitorenter ;
        String s = aoy;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void nX()
    {
        Object obj = aou.ff(aot);
        if (obj != null)
        {
            obj = new Container(mContext, aoo.getDataLayer(), aoc, 0L, ((cr.c) (obj)));
            b(new n(aoo, IH, ((Container) (obj)), new n.a() {

                final o aoB;

                public void cr(String s)
                {
                    aoB.cr(s);
                }

                public String nU()
                {
                    return aoB.nU();
                }

                public void nW()
                {
                    bh.W("Refresh ignored: container loaded as default only.");
                }

            
            {
                aoB = o.this;
                super();
            }
            }));
        } else
        {
            bh.T("Default was requested, but no default container was found");
            b(aE(new Status(10, "Default was requested, but no default container was found", null)));
        }
        aoz = null;
        aou = null;
    }

    public void nY()
    {
        T(false);
    }

    public void nZ()
    {
        T(true);
    }
}
