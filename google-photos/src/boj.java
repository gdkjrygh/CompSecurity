// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class boj extends bmb
{

    private static final String x = boj.getSimpleName();
    private static final long y;
    private final bjf A;
    private final crx B;
    private final buf C;
    private final bws D;
    private final noj E;
    private final cis F;
    private final noq G;
    private final mmr H;
    private final btq I;
    private final brh J;
    private final brp K;
    private final bne L;
    private final bmz M;
    private final bmn N;
    private final bxj O;
    private final bnp P;
    private final bze Q;
    private final bph R = new bok(this);
    private final bqt S = new bop(this);
    private final bsg T = new boy(this);
    private final bpz U = new bos(this);
    public final boz a;
    public final blw b;
    public final bqa e;
    public final btd f;
    public final bsa g;
    public final blj h;
    public final brr i = new brr(this);
    public final bra j;
    public final brl k;
    public final bzv l;
    public final bmg m;
    public final bvz n;
    public final bps o;
    public final brv p;
    final bnm q;
    public final bmq r;
    public final bss s;
    public final cet t = new bot(this);
    public final cep u = new bou(this);
    public final cgo v = new bov(this);
    public final cew w = new bow(this);
    private final Context z;

    public boj(Context context, Bundle bundle, bww bww1, cah cah, boz boz1, blw blw1, bjf bjf1, 
            crx crx1, cjs cjs, ckx ckx, ckx ckx1, ckt ckt, chq chq, cuu cuu, 
            cko cko, dfb dfb, dfb dfb1, bny bny, dfl dfl, dfl dfl1, Executor executor, 
            dfk dfk1, buf buf1, bqz bqz, bnl bnl1, bld bld, bmm bmm, bws bws1, 
            dct dct, boolean flag, noj noj1, cag cag1, can can, cap cap, csz csz, 
            czc czc, okq okq, okq okq1, File file, ddh ddh, ddf ddf, cis cis1, 
            bzo bzo)
    {
        super(bww1);
        new boq(this, this, new bxg[] {
            bxg.c
        });
        new bor(this, this, new bxg[] {
            bxg.n
        });
        z = (Context)b.a(context, "context", null);
        a = (boz)b.a(boz1, "ui", null);
        b = (blw)b.a(blw1, "display", null);
        A = (bjf)b.a(bjf1, "batchAnalyzer", null);
        B = (crx)b.a(crx1, "posterStore", null);
        C = (buf)b.a(buf1, "stateTracker", null);
        D = (bws)b.a(bws1, "soundtrackUsageRecorder", null);
        E = (noj)b.a(noj1, "movieMakerProvider", null);
        F = (cis)b.a(cis1, "actionBarLogger", null);
        b.a(ckt, "clipEditorDecoderFactory", null);
        G = (noq)olm.a(context, noq);
        H = (mmr)olm.a(context, mmr);
        bww1 = new bwn(this, bundle, cag1, csz);
        n = new bvz(this, bww1, D, z.getResources().getString(c.aF), z.getResources().getString(c.br), z.getResources().getString(c.aP), new bwl(z));
        o = new bps(this, b);
        boz1 = new cyz(z.getResources(), c.d);
        blw1 = dfk1.a(boj, "decoder");
        e = new bqa(this, z, chq, new ctv(z, noj1, H.d(), cjs, ckx, ckx1, chq, cuu, buf1, executor, blw1, dfl1, cko), new cun(this, z, noj1, cag1, dfk1), buf1, dfb, bnl1, S, U, dct, b, D, i, G, c.b.ae);
        j = new bra(this, i, e);
        I = new btq(this, bundle, z, noj1, cag1, e, j, i, ckx, ckx1, chq, cuu, cko, cjs, dfl, bld, bmm, buf1, executor, blw1, flag, G);
        k = new brl(this, bundle, D, cag1, e, I, j, z, noj1, can, cap, cah, b, G);
        l = new bzv(this, z, j, noj1, ckx, ckx1, chq, cuu, cko, cjs, dfl, bld, bmm, buf1, bzo, cag1, executor, blw1, U, bnl1, flag);
        m = new bmg(this, z, noj1, b, dfb1);
        N = new bmn(this, z, b, noj1, cag1, new bol(this));
        b.a(bnl1, "gservicesSettings", null);
        blw1 = new bxr(this, bundle, cag1, boz1, bnl1, czc, bww1, bnl1.p());
        bjf1 = dfk1.a(2, boj, "poster-decoding");
        O = new bxj(context, this, dfb1, file, ddh, bnl1);
        new btl(this, z, dfb1, file, ddh, bnl1);
        g = new bsa(this, cag1, z, B, bjf1, b, i, T);
        h = new blj(this, bundle, b, ckx1);
        new bsk(this, bnl1);
        p = new brv(this, dfk1.a(brv, "cache-cleanup"), okq, okq1, ddf);
        q = new bnm(this, bundle, z, b, cag1, bny, e, p, bww1, blw1, k, I);
        P = new bnp(this, bundle, z, noj1, bnl1, cah, b, cag1, e, O, p, q);
        M = new bmz(this, l, b, bnl1, q);
        J = new brh(this, new bom(this), l, q);
        K = new brp(this, new bon(this), noj1, H.d());
        L = new bne(this, l, q, new boo(this));
        r = new bmq(this, z, b, e, q, k);
        s = new bss(this, e, boz1);
        f = new btd(this, bundle, cag1, e, q, k);
        Q = new bze(this, bundle, z, b, E, cag1, e, h);
    }

    static blw a(boj boj1)
    {
        return boj1.b;
    }

    static long b()
    {
        return y;
    }

    static void b(boj boj1)
    {
        boj1.g();
    }

    static bzv c(boj boj1)
    {
        return boj1.l;
    }

    static bnm d(boj boj1)
    {
        return boj1.q;
    }

    static String d()
    {
        return x;
    }

    static bne e(boj boj1)
    {
        return boj1.L;
    }

    static buf f(boj boj1)
    {
        return boj1.C;
    }

    private void f()
    {
        c();
        e.k();
        c.l(false);
        b.u();
        bmn bmn1 = N;
        Object obj = bmn1.b;
        bmn1.g.d();
        obj = ((noj) (obj)).a(bmn1.c.b.U);
        if (obj == null)
        {
            bmn1.b();
            return;
        } else
        {
            bmn1.e.a(((mtf) (obj)));
            return;
        }
    }

    static Context g(boj boj1)
    {
        return boj1.z;
    }

    private void g()
    {
        boolean flag1 = true;
        c();
        boz boz1 = a;
        boolean flag;
        if (z.getResources().getConfiguration().orientation == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || b.b())
        {
            flag1 = false;
        }
        boz1.b(flag1);
    }

    static void h(boj boj1)
    {
        boj1.f();
    }

    static bze i(boj boj1)
    {
        return boj1.Q;
    }

    static boz j(boj boj1)
    {
        return boj1.a;
    }

    static bqa k(boj boj1)
    {
        return boj1.e;
    }

    static blj l(boj boj1)
    {
        return boj1.h;
    }

    static brl m(boj boj1)
    {
        return boj1.k;
    }

    public final void C_()
    {
        bjf bjf1 = A;
        b.b(R);
        super.C_();
        a.g();
    }

    public final boolean a(MenuItem menuitem)
    {
        int i1;
        c();
        i1 = menuitem.getItemId();
        if (i1 != 0x102002c) goto _L2; else goto _L1
_L1:
        F.a(pwp.e);
        b.a(true);
        b.u();
_L13:
        return false;
_L2:
        if (i1 == b.ga)
        {
            c();
            if (bpe.b(z))
            {
                menuitem = E.a(true, false, H.d());
                menuitem.putExtra("source_id", c.b.d);
            } else
            {
                menuitem = new Intent("android.intent.action.MAIN");
                menuitem.setComponent(new ComponentName(z, cti));
            }
            a.a(menuitem);
            return true;
        }
        if (i1 == b.gd)
        {
            F.a(pwp.k);
            f();
            return true;
        }
        if (i1 == b.gc)
        {
            G.a(22, 2);
            F.a(pwp.c);
            if (b.c())
            {
                k.b();
            }
            b.a(false);
            return true;
        }
        if (i1 != b.fZ) goto _L4; else goto _L3
_L3:
        G.a(26, 1);
        F.a(pwp.s);
        c();
        e.k();
        e.m();
        f.b();
        menuitem = M;
        menuitem.b = true;
        if (((bmz) (menuitem)).c.x() != bxd.c) goto _L6; else goto _L5
_L5:
        ((bmz) (menuitem)).a.b();
_L7:
        return true;
_L6:
        if (((bmz) (menuitem)).c.b.a == bxf.d)
        {
            menuitem.b();
        }
        if (true) goto _L7; else goto _L4
_L4:
        if (i1 == b.fY)
        {
            F.a(pwp.b);
            c();
            e.k();
            m.b.e();
            return true;
        }
        if (i1 != b.gf)
        {
            continue; /* Loop/switch isn't completed */
        }
        G.a(21, 1);
        F.a(pwp.v);
        c();
        e.k();
        e.m();
        f.b();
        if (!E.a(H.d())) goto _L9; else goto _L8
_L8:
        c.k(true);
        menuitem = K;
        if (((brp) (menuitem)).a.a(((brp) (menuitem)).b))
        {
            menuitem.e = true;
            menuitem.b();
        }
_L11:
        return true;
_L9:
        menuitem = J;
        menuitem.e = true;
        if (((brh) (menuitem)).c.x() == bxd.c)
        {
            ((brh) (menuitem)).b.b();
        } else
        if (((brh) (menuitem)).c.b.a == bxf.d)
        {
            menuitem.b();
        }
        if (true) goto _L11; else goto _L10
_L10:
        if (i1 != b.ge) goto _L13; else goto _L12
_L12:
        c();
        a.h();
        return true;
    }

    public final void e()
    {
        boolean flag;
        boolean flag2;
        boolean flag1 = false;
        Object obj = c;
        flag2 = ((bww) (obj)).b.c;
        ((bww) (obj)).b.c = false;
        obj = String.valueOf("init newSession:");
        boolean flag3 = c.c.d;
        String s1 = String.valueOf(c.b.a);
        (new StringBuilder(String.valueOf(obj).length() + 47 + String.valueOf(s1).length())).append(((String) (obj))).append(flag2).append(",isStoryboardReady:").append(flag3).append(",runningModeState:").append(s1);
        if (flag2 && c.b.G.e)
        {
            l.b();
        }
        super.e();
        obj = D;
        ((bws) (obj)).a(((bws) (obj)).b.a());
        flag = flag1;
        if (c.b.X != null)
        {
            flag = flag1;
            if (c.b.m == null)
            {
                flag = true;
            }
        }
        b.a(R);
        if (!ddy.b.a() || c.x() != bxd.c) goto _L2; else goto _L1
_L1:
        b.d();
        b.u();
        g();
        if (c.b.a == bxf.e)
        {
            P.a(true);
        }
_L4:
        a.g();
        return;
_L2:
        if (flag2 || !c.c() || flag || c.b.a != bxf.d)
        {
            b.d();
            P.a(flag2);
        } else
        if (e.j())
        {
            e.i();
            b.u();
            g();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        y = TimeUnit.MILLISECONDS.toMicros(4500L);
    }
}
