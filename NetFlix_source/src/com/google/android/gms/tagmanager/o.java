// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.gn;

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

        final o Xj;

        public void a(com.google.android.gms.internal.it.a a1)
        {
            com.google.android.gms.internal.c.j j;
            if (a1.aaZ != null)
            {
                j = a1.aaZ;
            } else
            {
                com.google.android.gms.internal.c.f f1 = a1.fK;
                j = new com.google.android.gms.internal.c.j();
                j.fK = f1;
                j.fJ = null;
                j.fL = f1.fg;
            }
            o.a(Xj, j, a1.aaY, true);
        }

        public void a(bg.a a1)
        {
            if (!o.b(Xj))
            {
                o.a(Xj, 0L);
            }
        }

        public void i(Object obj)
        {
            a((com.google.android.gms.internal.it.a)obj);
        }

        public void kl()
        {
        }

        private b()
        {
            Xj = o.this;
            super();
        }

    }

    private class c
        implements bg
    {

        final o Xj;

        public void a(bg.a a1)
        {
            if (o.f(Xj) != null)
            {
                Xj.a(o.f(Xj));
            } else
            {
                Xj.a(Xj.ac(Status.By));
            }
            o.a(Xj, 0x36ee80L);
        }

        public void b(com.google.android.gms.internal.c.j j)
        {
label0:
            {
                synchronized (Xj)
                {
                    if (j.fK != null)
                    {
                        break MISSING_BLOCK_LABEL_59;
                    }
                    if (o.c(Xj).fK != null)
                    {
                        break label0;
                    }
                    bh.w("Current resource is null; network resource is also null");
                    o.a(Xj, 0x36ee80L);
                }
                return;
            }
            j.fK = o.c(Xj).fK;
            o.a(Xj, j, o.a(Xj).currentTimeMillis(), false);
            bh.y((new StringBuilder()).append("setting refresh time to current time: ").append(o.d(Xj)).toString());
            if (!o.e(Xj))
            {
                o.a(Xj, j);
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

        public void kl()
        {
        }

        private c()
        {
            Xj = o.this;
            super();
        }

    }

    private class d
        implements n.a
    {

        final o Xj;

        public void br(String s)
        {
            Xj.br(s);
        }

        public String ke()
        {
            return Xj.ke();
        }

        public void kg()
        {
            if (o.g(Xj).cS())
            {
                o.a(Xj, 0L);
            }
        }

        private d()
        {
            Xj = o.this;
            super();
        }

    }

    static interface e
        extends Releasable
    {

        public abstract void a(bg bg);

        public abstract void bu(String s);

        public abstract void d(long l, String s);
    }

    static interface f
        extends Releasable
    {

        public abstract void a(bg bg);

        public abstract void b(com.google.android.gms.internal.it.a a1);

        public abstract cq.c ca(int i);

        public abstract void km();
    }


    private final Looper AS;
    private final String WJ;
    private long WO;
    private final TagManager WW;
    private final d WZ;
    private final gl Wv;
    private final cf Xa;
    private final int Xb;
    private f Xc;
    private volatile n Xd;
    private volatile boolean Xe;
    private com.google.android.gms.internal.c.j Xf;
    private String Xg;
    private e Xh;
    private a Xi;
    private final Context mContext;

    o(Context context, TagManager tagmanager, Looper looper, String s, int i, f f1, e e1, 
            gl gl1, cf cf)
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
        WW = tagmanager;
        context = looper;
        if (looper == null)
        {
            context = Looper.getMainLooper();
        }
        AS = context;
        WJ = s;
        Xb = i;
        Xc = f1;
        Xh = e1;
        WZ = new d();
        Xf = new com.google.android.gms.internal.c.j();
        Wv = gl1;
        Xa = cf;
        if (kk())
        {
            br(cd.kT().kV());
        }
    }

    public o(Context context, TagManager tagmanager, Looper looper, String s, int i, r r)
    {
        this(context, tagmanager, looper, s, i, ((f) (new cp(context, s))), ((e) (new co(context, s, r))), gn.ft(), ((cf) (new bf(30, 0xdbba0L, 5000L, "refreshing", gn.ft()))));
    }

    private void C(boolean flag)
    {
        Xc.a(new b());
        Xh.a(new c());
        cq.c c1 = Xc.ca(Xb);
        if (c1 != null)
        {
            Xd = new n(WW, AS, new Container(mContext, WW.getDataLayer(), WJ, 0L, c1), WZ);
        }
        Xi = new a(flag) {

            final o Xj;
            final boolean Xk;

            public boolean b(Container container)
            {
                if (!Xk) goto _L2; else goto _L1
_L1:
                if (container.getLastRefreshTime() + 0x2932e00L < o.a(Xj).currentTimeMillis()) goto _L4; else goto _L3
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
                Xj = o.this;
                Xk = flag;
                super();
            }
        };
        if (kk())
        {
            Xh.d(0L, "");
            return;
        } else
        {
            Xc.km();
            return;
        }
    }

    static gl a(o o1)
    {
        return o1.Wv;
    }

    private void a(com.google.android.gms.internal.c.j j)
    {
        this;
        JVM INSTR monitorenter ;
        if (Xc != null)
        {
            com.google.android.gms.internal.it.a a1 = new com.google.android.gms.internal.it.a();
            a1.aaY = WO;
            a1.fK = new com.google.android.gms.internal.c.f();
            a1.aaZ = j;
            Xc.b(a1);
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
        flag = Xe;
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (isReady())
        {
            if (Xd != null);
        }
        Xf = j;
        WO = l;
        t(Math.max(0L, Math.min(0x2932e00L, (WO + 0x2932e00L) - Wv.currentTimeMillis())));
        j = new Container(mContext, WW.getDataLayer(), WJ, l, j);
        if (Xd != null)
        {
            break; /* Loop/switch isn't completed */
        }
        Xd = new n(WW, AS, j, WZ);
_L5:
        if (!isReady() && Xi.b(j))
        {
            a(((Result) (Xd)));
        }
        if (true) goto _L3; else goto _L4
        j;
        throw j;
_L4:
        Xd.a(j);
          goto _L5
    }

    static void a(o o1, long l)
    {
        o1.t(l);
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
        return o1.Xe;
    }

    static com.google.android.gms.internal.c.j c(o o1)
    {
        return o1.Xf;
    }

    static long d(o o1)
    {
        return o1.WO;
    }

    static boolean e(o o1)
    {
        return o1.kk();
    }

    static n f(o o1)
    {
        return o1.Xd;
    }

    static cf g(o o1)
    {
        return o1.Xa;
    }

    private boolean kk()
    {
        cd cd1 = cd.kT();
        return (cd1.kU() == cd.a.YU || cd1.kU() == cd.a.YV) && WJ.equals(cd1.getContainerId());
    }

    private void t(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (Xh != null) goto _L2; else goto _L1
_L1:
        bh.z("Refresh requested, but no network load scheduler.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Xh.d(l, Xf.fL);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected ContainerHolder ac(Status status)
    {
        if (Xd != null)
        {
            return Xd;
        }
        if (status == Status.By)
        {
            bh.w("timer expired: setting result to failure");
        }
        return new n(status);
    }

    void br(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Xg = s;
        if (Xh != null)
        {
            Xh.bu(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    protected Result d(Status status)
    {
        return ac(status);
    }

    String ke()
    {
        this;
        JVM INSTR monitorenter ;
        String s = Xg;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void kh()
    {
        Object obj = Xc.ca(Xb);
        if (obj != null)
        {
            obj = new Container(mContext, WW.getDataLayer(), WJ, 0L, ((cq.c) (obj)));
            a(new n(WW, AS, ((Container) (obj)), new n.a() {

                final o Xj;

                public void br(String s)
                {
                    Xj.br(s);
                }

                public String ke()
                {
                    return Xj.ke();
                }

                public void kg()
                {
                    bh.z("Refresh ignored: container loaded as default only.");
                }

            
            {
                Xj = o.this;
                super();
            }
            }));
        } else
        {
            bh.w("Default was requested, but no default container was found");
            a(ac(new Status(10, "Default was requested, but no default container was found", null)));
        }
        Xh = null;
        Xc = null;
    }

    public void ki()
    {
        C(false);
    }

    public void kj()
    {
        C(true);
    }
}
