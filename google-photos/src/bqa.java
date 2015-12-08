// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;

public class bqa extends bmb
{

    private static final String g = bqa.getSimpleName();
    private int A;
    private boolean B;
    private bqx C;
    private boolean D;
    private long E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    private final bqw J = new bqj(this);
    private final dcv K = new bqu(this);
    public final bto a = new bqb(this, this, bqv);
    public final bto b = new bqi(this, this, bqr);
    boolean e;
    boolean f;
    private final Context h;
    private final chq i;
    private final cve j;
    private final cve k;
    private final buf l;
    private final dfb m;
    private final bnl n;
    private final bqt o;
    private final bpz p;
    private final dct q;
    private final bqs r;
    private final bws s;
    private final brr t;
    private final cko u = new cko();
    private final noq v;
    private final bqy w = new bqy();
    private long x;
    private boolean y;
    private boolean z;

    public bqa(bmb bmb1, Context context, chq chq1, cve cve1, cve cve2, buf buf1, dfb dfb1, 
            bnl bnl1, bqt bqt1, bpz bpz1, dct dct1, bqs bqs1, bws bws1, brr brr1, 
            noq noq1, boolean flag)
    {
        super(bmb1);
        y = false;
        I = bqq.a;
        new bqk(this, this, new bxg[] {
            bxg.j
        });
        new bql(this, this, new bxg[] {
            bxg.c
        });
        new bqm(this, this, new bxg[] {
            bxg.d
        });
        new bqn(this, this, new bxg[] {
            bxg.r
        });
        new bqo(this, this, new bxg[] {
            bxg.e, bxg.q
        });
        new bqp(this, this, new bxg[] {
            bxg.t
        });
        new bqc(this, this, new bxg[] {
            bxg.m
        });
        new bqd(this, this, new bxg[] {
            bxg.b
        });
        new bqe(this, this, new bxg[] {
            bxg.u
        });
        h = (Context)b.a(context, "context", null);
        i = (chq)b.a(chq1, "renderContext", null);
        j = (cve)b.a(cve1, "storyboardPlayer", null);
        k = (cve)b.a(cve2, "previewPlayer", null);
        l = (buf)b.a(buf1, "stateTracker", null);
        m = (dfb)b.a(dfb1, "serialAsyncTaskRunner", null);
        n = (bnl)b.a(bnl1, "gservicesSettings", null);
        o = (bqt)b.a(bqt1, "listener", null);
        p = (bpz)b.a(bpz1, "onInvalidUriDetectedListener", null);
        q = (dct)b.a(dct1, "audioFocusHelper", null);
        r = (bqs)b.a(bqs1, "display", null);
        s = (bws)b.a(bws1, "soundtrackUsageRecorder", null);
        t = (brr)b.a(brr1, "spinnerController", null);
        v = (noq)b.a(noq1, "durationEventLogger", null);
        G = flag;
        w.a(new bqf(this));
    }

    private void A()
    {
        if (B)
        {
            q.a(K);
            B = false;
        }
    }

    static bqx a(bqa bqa1, bqx bqx1)
    {
        bqa1.C = bqx1;
        return bqx1;
    }

    static bqy a(bqa bqa1)
    {
        return bqa1.w;
    }

    private void a(long l1)
    {
label0:
        {
            c();
            if (!c.f())
            {
                bxf bxf1 = c.b.a;
                boolean flag;
                if (bxf1 == bxf.h || bxf1 == bxf.g || bxf1 == bxf.i)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            ((bqv)a.b).a(l1, c.m());
        }
        c.a(l1);
    }

    static void a(bqa bqa1, long l1)
    {
        bqa1.b(l1);
    }

    static void a(bqa bqa1, bqv bqv1)
    {
        int i1;
        bqv1.a(bqa1.J);
        boolean flag = bqa1.b();
        if (flag)
        {
            bqv1.d_(false);
        }
        bqv1.b(false);
        bqa1.b(bqa1.c.b.Y);
        bqa1.t.a("buffering", false);
        bqv1.e_(false);
        bqv1.f_(false);
        Object obj;
        if (lvd.a(bqa1.n.a, "moviemaker:low_performance_mode_enabled", false))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        i1;
        JVM INSTR tableswitch 1 1: default 112
    //                   1 313;
           goto _L1 _L2
_L1:
        i1 = 0xe1000;
_L10:
        bqv1.b_(i1);
        boolean flag1;
        if (bqa1.f && !flag)
        {
            ((bqr)bqa1.b.b).a(c.aE, 0);
        } else
        {
            ((bqr)bqa1.b.b).a();
        }
        obj = bqa1.c.b.a;
        if (obj == bxf.h || obj == bxf.g || obj == bxf.i)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        obj = bqa1.t;
        if (!bqa1.c.c.d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((brr) (obj)).a("storyboard", flag1);
        bqh.a[bqa1.I - 1];
        JVM INSTR tableswitch 1 7: default 276
    //                   1 349
    //                   2 359
    //                   3 369
    //                   4 369
    //                   5 429
    //                   6 439
    //                   7 448;
           goto _L3 _L4 _L5 _L6 _L6 _L7 _L8 _L9
_L3:
        break; /* Loop/switch isn't completed */
_L9:
        break MISSING_BLOCK_LABEL_448;
_L11:
        if (bqa1.c.b.b == bwy.d)
        {
            ((bqv)bqa1.a.b).K_();
        }
        return;
_L2:
        i1 = 0x38400;
          goto _L10
_L4:
        bqv1.c_(false);
          goto _L11
_L5:
        bqv1.c_(true);
          goto _L11
_L6:
        bqv1.c_(true);
        bqa1.x();
        bqa1.y();
        if (bqa1.c.f())
        {
            cok cok1 = bqa1.c.c.e.g;
            bqv1.a(cok1.a, cok1.b);
            bqa1.t();
        }
          goto _L11
_L7:
        bqv1.b(0);
          goto _L11
_L8:
        bqv1.M_();
          goto _L11
        bqv1.L_();
          goto _L11
        bqa1.d();
        bqa1.x();
        return;
    }

    static boolean a(bqa bqa1, boolean flag)
    {
        bqa1.y = flag;
        return flag;
    }

    static long b(bqa bqa1, long l1)
    {
        bqa1.E = l1;
        return l1;
    }

    static bqs b(bqa bqa1)
    {
        return bqa1.r;
    }

    private void b(long l1)
    {
        c();
        if (w.d())
        {
            w.a(l1);
        } else
        {
            x = l1;
        }
        a(l1);
    }

    static void b(bqa bqa1, bqv bqv1)
    {
        bqa1.c();
        bqv1.a(null);
        bqa1.e = false;
        bqa1.i.a();
    }

    static boolean b(bqa bqa1, boolean flag)
    {
        return flag;
    }

    static long c(bqa bqa1)
    {
        return bqa1.E;
    }

    static long c(bqa bqa1, long l1)
    {
        bqa1.x = 0L;
        return 0L;
    }

    static boolean c(bqa bqa1, boolean flag)
    {
        return flag;
    }

    static bqx d(bqa bqa1)
    {
        return bqa1.C;
    }

    static void d(bqa bqa1, long l1)
    {
        bqa1.a(l1);
    }

    static boolean d(bqa bqa1, boolean flag)
    {
        bqa1.F = false;
        return false;
    }

    static dfb e(bqa bqa1)
    {
        return bqa1.m;
    }

    static boolean e(bqa bqa1, boolean flag)
    {
        bqa1.B = false;
        return false;
    }

    static void f(bqa bqa1)
    {
        bqa1.v();
    }

    static brr g(bqa bqa1)
    {
        return bqa1.t;
    }

    static bto h(bqa bqa1)
    {
        return bqa1.a;
    }

    static boolean i(bqa bqa1)
    {
        return bqa1.e;
    }

    static boolean j(bqa bqa1)
    {
        return bqa1.F;
    }

    static cve k(bqa bqa1)
    {
        return bqa1.j;
    }

    static void l(bqa bqa1)
    {
        bqa1.x();
    }

    static void m(bqa bqa1)
    {
        bqa1.y();
    }

    static boolean n(bqa bqa1)
    {
        return bqa1.G;
    }

    static void o(bqa bqa1)
    {
        bqa1.w();
    }

    static noq p(bqa bqa1)
    {
        return bqa1.v;
    }

    static bto q(bqa bqa1)
    {
        return bqa1.b;
    }

    static bqt r(bqa bqa1)
    {
        return bqa1.o;
    }

    static void s(bqa bqa1)
    {
        bqa1.A();
    }

    static bpz t(bqa bqa1)
    {
        return bqa1.p;
    }

    static String u()
    {
        return g;
    }

    static boolean u(bqa bqa1)
    {
        int i1 = bqa1.A + 1;
        bqa1.A = i1;
        if (i1 > 1)
        {
            return false;
        } else
        {
            bqa1.z();
            bqa1.b(bqa1.c.b.Y);
            bqa1.A = i1;
            return true;
        }
    }

    static Context v(bqa bqa1)
    {
        return bqa1.h;
    }

    private void v()
    {
        boolean flag;
        flag = true;
        c();
        if (c.c.d || c.b.a != bxf.d) goto _L2; else goto _L1
_L1:
        return;
_L2:
        bqv bqv1;
        cqf cqf1;
        bqv1 = (bqv)a.b;
        cqf1 = c.c.e;
        if (cqf1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        c.c.w = null;
        if (I == bqq.c || I == bqq.d)
        {
            I = bqq.f;
            if (bqv1 != null)
            {
                bqv1.M_();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (!c.v()) goto _L1; else goto _L3
_L3:
        if (!c.c.m || !c.c.z)
        {
            F = true;
        }
        brr brr1 = t;
        if (c.c.z || c.c.A || !F || b())
        {
            flag = false;
        }
        brr1.a("downloading", flag);
        if (!F)
        {
            if (bqv1 != null)
            {
                x();
                cok cok1 = c.c.e.g;
                bqv1.a(cok1.a, cok1.b);
                bqv1.a(c.m());
                bqv1.a(false, 0);
            }
            if (w.d())
            {
                w.a(cqf1);
            } else
            if (e)
            {
                z();
            } else
            if (c.b.Z)
            {
                c.m(false);
                b(c.b.Y);
                z();
            } else
            {
                w.a();
                t();
            }
            if (I != bqq.d)
            {
                I = bqq.d;
                if (bqv1 != null)
                {
                    bqv1.j();
                }
            }
            if (bqv1 != null)
            {
                y();
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    static cko w(bqa bqa1)
    {
        return bqa1.u;
    }

    private void w()
    {
        c();
        w.a(k);
        z();
        ((bqv)a.b).c_(true);
        t.a("buffering", false);
        t.a("storyboard", false);
        if (G)
        {
            o.c();
        }
    }

    static dcv x(bqa bqa1)
    {
        return bqa1.K;
    }

    private void x()
    {
        boolean flag1 = true;
        boolean flag4 = false;
        bxf bxf1;
        boolean flag;
        boolean flag2;
        boolean flag3;
        if (!c.b.G.e)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        bxf1 = c.b.a;
        flag = flag1;
        if (bxf1 != bxf.h)
        {
            flag = flag1;
            if (bxf1 != bxf.g)
            {
                if (bxf1 == bxf.i)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
        }
        flag3 = flag2;
        if (!flag)
        {
            flag3 = flag2;
            if (c.c.e == null)
            {
                flag3 = false;
            }
        }
        if (b())
        {
            flag2 = flag4;
        } else
        {
            flag2 = flag3;
        }
        ((bqv)a.b).d_(flag2);
    }

    static dct y(bqa bqa1)
    {
        return bqa1.q;
    }

    private void y()
    {
        boolean flag;
        if (I == bqq.d && !c.b.G.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((bqv)a.b).f_(flag);
    }

    private void z()
    {
        c();
        if (!w.U_()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i.a();
        e = false;
        A = 0;
        if (!B)
        {
            dct dct1 = q;
            dcv dcv = K;
            b.a(dcv, "listener", null);
            c.b(dct1.c, "mClientListener", "audio focus already requested");
            boolean flag;
            if (dct1.a.requestAudioFocus(dct1.b, 3, 1) == 1)
            {
                dct1.c = dcv;
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        B = true;
        if (w.d())
        {
            if (!y)
            {
                w.T_();
            }
            if (z)
            {
                c();
                z = false;
                return;
            }
        } else
        {
            c();
            z = false;
            if (a.b())
            {
                bqv bqv1 = (bqv)a.b;
                bqv1.e_(true);
                bqy bqy1 = w;
                cqf cqf1 = c.c.e;
                cuc cuc1;
                if (y)
                {
                    cuc1 = cuc.b(x);
                } else
                {
                    cuc1 = cuc.a(x);
                }
                bqy1.a(cqf1, cuc1, bqv1.a(i));
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        Log.w(g, "Unable to obtain audio focus - cannot start playback");
        return;
    }

    public final void C_()
    {
        e = false;
        if (C != null)
        {
            C.cancel(true);
            D = true;
            C = null;
        }
        k();
        l.e.a(null);
        A();
        super.C_();
    }

    public final void a(Bitmap bitmap)
    {
        (new Handler(Looper.getMainLooper())).post(new bqg(this, bitmap));
    }

    public final void a(boolean flag)
    {
        c();
        I = bqq.g;
        if (flag)
        {
            r.n();
            return;
        } else
        {
            r.o();
            return;
        }
    }

    public boolean b()
    {
        return c.b.af || c.b.ae;
    }

    public final void d()
    {
        nom nom1 = c.b.m;
        if (nom1 != null && nom1.b != null && nom1.b.i != null && nom1.b.j != null)
        {
            ((bqv)a.b).a(nom1.b.i.intValue(), nom1.b.j.intValue());
        }
    }

    public final void e()
    {
label0:
        {
            boolean flag1 = false;
            super.e();
            if (D && c.c.d && c.f())
            {
                C = new bqx(this);
                m.a(C, new cqf[] {
                    c.c.e
                });
            }
            D = false;
            bxf bxf1 = c.b.a;
            boolean flag;
            boolean flag2;
            if (bxf1 == bxf.h || bxf1 == bxf.g || bxf1 == bxf.i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                w.a(k);
            } else
            {
                w.a(j);
            }
            if (!c.c.i)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            y = flag2;
            bxf1 = c.b.a;
            if (bxf1 != bxf.h && bxf1 != bxf.g)
            {
                flag = flag1;
                if (bxf1 != bxf.i)
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (flag)
        {
            w();
        }
    }

    public final void f()
    {
        b(0L);
        if (!w.U_())
        {
            z();
        }
    }

    public final void g()
    {
        c();
        I = bqq.g;
        ((bqv)a.b).L_();
    }

    public final void h()
    {
        c();
        r.t();
    }

    public final void i()
    {
        c();
        I = bqq.c;
        ((bqr)b.b).a();
        v();
    }

    public final boolean j()
    {
        c();
        if (I == bqq.e || I == bqq.g)
        {
            return false;
        } else
        {
            I = bqq.b;
            e = false;
            bqv bqv1 = (bqv)a.b;
            bqr bqr1 = (bqr)b.b;
            ((bqv)a.b).d_(false);
            bqr1.a();
            bqv1.c_(true);
            y();
            bqv1.j();
            return true;
        }
    }

    public final void k()
    {
        c();
        e = false;
        if (w.d())
        {
            w.a();
        }
    }

    public final void l()
    {
        if (w.d())
        {
            b(c.b.Y);
            k();
        }
    }

    public final void m()
    {
        ((bqv)a.b).a(false, 0);
        c.e(false);
    }

    public final void n()
    {
        f = false;
        ((bqr)b.b).a();
    }

    public final boolean o()
    {
        return c.b.b == bwy.b;
    }

    public final boolean p()
    {
        return c.b.b == bwy.d;
    }

    public final void q()
    {
        c();
        if (!c.c.d)
        {
            bxf bxf1 = c.b.a;
            boolean flag;
            if (bxf1 == bxf.h || bxf1 == bxf.g || bxf1 == bxf.i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                return;
            }
        }
        Object obj = c.c.k;
        if (obj != null && TextUtils.isEmpty(((cqa) (obj)).e.c))
        {
            s.a(((cqa) (obj)).e, 1);
        }
        y = false;
        obj = (bqv)a.b;
        if (e)
        {
            e = false;
            ((bqv) (obj)).b(false);
            ((bqv) (obj)).e_(false);
            t.a("buffering", false);
            y();
        } else
        if (w.U_())
        {
            w.b();
        } else
        if (!c.c.m)
        {
            ((bqv) (obj)).b(true);
            t.a("buffering", true);
            e = true;
        } else
        {
            y();
            z();
        }
        ((bqv) (obj)).a(false, 0);
    }

    public final void r()
    {
        H = true;
        k();
    }

    public final void s()
    {
        H = false;
        t();
    }

    public final void t()
    {
        if (!H)
        {
            c();
            if (c.c.d && c.c.e != null && c.b.b != bwy.c && !w.d())
            {
                i.a();
                z = true;
                if (a.b())
                {
                    bqv bqv1 = (bqv)a.b;
                    bqv1.e_(true);
                    w.a(c.c.e, cuc.b(c.b.Y), bqv1.a(i));
                    return;
                }
            }
        }
    }

    public String toString()
    {
        return b.a(getClass(), new Object[] {
            a.b, b.b, c.b.t, Boolean.valueOf(c.d())
        });
    }

}
