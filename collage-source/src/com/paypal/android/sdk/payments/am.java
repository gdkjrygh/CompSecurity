// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.util.Log;
import com.paypal.android.sdk.ap;
import com.paypal.android.sdk.bB;
import com.paypal.android.sdk.bF;
import com.paypal.android.sdk.bI;
import com.paypal.android.sdk.bK;
import com.paypal.android.sdk.bY;
import com.paypal.android.sdk.ce;
import com.paypal.android.sdk.cl;
import com.paypal.android.sdk.co;
import com.paypal.android.sdk.cq;
import com.paypal.android.sdk.cy;
import com.paypal.android.sdk.da;
import com.paypal.android.sdk.ea;
import com.paypal.android.sdk.ed;
import com.paypal.android.sdk.ee;
import com.paypal.android.sdk.ej;
import com.paypal.android.sdk.fl;
import com.paypal.android.sdk.fn;
import com.paypal.android.sdk.fo;
import com.paypal.android.sdk.fp;
import com.paypal.android.sdk.fq;
import com.paypal.android.sdk.fs;
import com.paypal.android.sdk.ft;
import com.paypal.android.sdk.fu;
import com.paypal.android.sdk.fz;
import com.paypal.android.sdk.gb;
import java.util.UUID;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalService, di, ac, ak, 
//            PayPalConfiguration

final class am
    implements da
{

    private PayPalService a;

    private am(PayPalService paypalservice)
    {
        a = paypalservice;
        super();
    }

    am(PayPalService paypalservice, byte byte0)
    {
        this(paypalservice);
    }

    private static bI a(String s, String s1, long l)
    {
        return new bI(s, s1, System.currentTimeMillis() + 1000L * l, true);
    }

    public final void a()
    {
        PayPalService.y();
    }

    public final void a(fl fl1)
    {
        PayPalService.y();
        a.a(ej.j, fl1.k(), fl1.u());
        if (fl1.v() && (a.c().h == null || a.c().h.a())) goto _L2; else goto _L1
_L1:
        a.h();
_L4:
        PayPalService.e(a).a(di.a(fl1));
        PayPalService.e(a).a();
        return;
_L2:
        ee.a(a.c().h, a.e());
        if (a.c().e != null)
        {
            PayPalService.d(a).a(a.c().e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(fn fn1)
    {
        PayPalService.y();
        a.a(ej.v, fn1.k());
        PayPalService.e(a).a(fn1.a);
        PayPalService.e(a).a();
    }

    public final void a(fo fo1)
    {
        PayPalService.y();
        PayPalService.e(a).a(fo1);
        PayPalService.e(a).a();
    }

    public final void a(fp fp1)
    {
        PayPalService.y();
        a.a(ej.j, fp1.k(), fp1.E());
        PayPalService.e(a).a(di.a(fp1));
        boolean flag;
        if (fp1.u() == null || !fp1.B())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (!fp1.B())
            {
                a.t();
            }
            PayPalService.e(a).a();
            return;
        } else
        {
            String s = UUID.randomUUID().toString();
            a.b().b(new gb(a.b(), a.a(), a.c().c.b(), s, fp1.v(), fp1.u(), fp1.w(), fp1.x(), fp1.y()));
            return;
        }
    }

    public final void a(fq fq1)
    {
        fq1 = fq1.q().b();
        PayPalService.y();
        (new StringBuilder("DeleteCreditCardRequest Error:")).append(fq1);
        Log.e("paypal.sdk", fq1);
    }

    public final void a(fs fs1)
    {
        PayPalService.y();
        PayPalService.e(a).a(fs1);
        PayPalService.e(a).a();
    }

    public final void a(ft ft1)
    {
        PayPalService.y();
        a.c().j = ft1.g;
        PayPalService.c(a).a();
    }

    public final void a(fu fu1)
    {
        long l = 840L;
        PayPalService.y();
        long l1 = fu1.f;
        bB bb;
        if (l1 <= 840L)
        {
            l = l1;
        }
        if (fu1.c == null)
        {
            a.c().h = a(fu1.d, fu1.e, l);
        } else
        {
            a.c().j = fu1.g;
            a.c().f = new bK(fu1.c, fu1.e);
        }
        a.c().g = null;
        bb = new bB();
        if (fu1.a.a())
        {
            bb.a(fu1.a.b());
            bb.a(cq.a);
        } else
        {
            bb.a(fu1.a.d());
            bb.a(cq.b);
        }
        a.c().e = bb;
        if (fu1.a.a())
        {
            a.c().d = fu1.a.b();
            a.a(ej.l, Boolean.valueOf(fu1.b), fu1.k());
        } else
        {
            a.c().d = fu1.a.d().a(ea.a());
            a.a(ej.m, Boolean.valueOf(fu1.b), fu1.k());
        }
        PayPalService.c(a).a();
    }

    public final void a(fz fz1)
    {
        PayPalService.y();
        a.a(ej.b, fz1.k());
        a.c().c = a(fz1.a, fz1.b, fz1.c);
        a.c().i = fz1.d;
        PayPalService.a(a, false);
        if (PayPalService.b(a) != null)
        {
            PayPalService.y();
            PayPalService.b(a).a();
            PayPalService.a(a, null);
        }
    }

    public final void a(gb gb1)
    {
        PayPalService.y();
        gb1 = new bF(PayPalService.f(a), gb1.u(), gb1.a, gb1.w(), gb1.v(), gb1.x(), gb1.y(), gb1.z());
        PayPalService.d(a).a(gb1, PayPalService.a(a).k());
        PayPalService.e(a).a();
    }

    public final void b(fl fl1)
    {
        String s = fl1.q().b();
        PayPalService.y();
        (new StringBuilder("ApproveAndExecuteSfoPaymentRequest Error: ")).append(s);
        PayPalService.c(a, fl1);
    }

    public final void b(fn fn1)
    {
        String s = fn1.q().b();
        PayPalService.y();
        (new StringBuilder("ConsentRequest Error:")).append(s);
        Log.e("paypal.sdk", s);
        PayPalService.e(a).a(PayPalService.b(a, fn1));
    }

    public final void b(fo fo1)
    {
        String s = fo1.q().b();
        PayPalService.y();
        (new StringBuilder("CreateSfoPaymentRequest Error: ")).append(s);
        Log.e("paypal.sdk", s);
        PayPalService.e(a).a(PayPalService.b(a, fo1));
    }

    public final void b(fp fp1)
    {
        String s = fp1.q().b();
        PayPalService.y();
        (new StringBuilder("CreditCardPaymentRequest Error:")).append(s);
        PayPalService.c(a, fp1);
    }

    public final void b(fs fs1)
    {
        String s = fs1.q().b();
        PayPalService.y();
        (new StringBuilder("GetAppInfoRequest Error: ")).append(s);
        Log.e("paypal.sdk", s);
        PayPalService.e(a).a(PayPalService.b(a, fs1));
    }

    public final void b(ft ft1)
    {
        String s = ft1.q().b();
        PayPalService.y();
        (new StringBuilder("LoginChallengeRequest Error:")).append(s);
        Log.e("paypal.sdk", s);
        PayPalService.c(a).a(PayPalService.b(a, ft1));
    }

    public final void b(fu fu1)
    {
        String s = fu1.q().b();
        PayPalService.y();
        (new StringBuilder("LoginRequest Error: ")).append(s);
        Log.e("paypal.sdk", s);
        a.h();
        bY by = fu1.a;
        boolean flag = fu1.b;
        if (by.a())
        {
            PayPalService.a(a, ej.l, flag, s, fu1.k(), null);
        } else
        {
            PayPalService.a(a, ej.m, flag, s, fu1.k(), null);
        }
        PayPalService.d(a).b();
        if (fu1.h)
        {
            a.c().j = fu1.g;
            a.c().g = new cy(fu1.i);
        }
        PayPalService.c(a).a(PayPalService.b(a, fu1));
    }

    public final void b(fz fz1)
    {
        PayPalService.a(a, fz1);
    }

    public final void b(gb gb1)
    {
        gb1 = gb1.q().b();
        PayPalService.y();
        (new StringBuilder("TokenizeCreditCardRequest Error:")).append(gb1);
        Log.e("paypal.sdk", gb1);
        PayPalService.e(a).a();
    }
}
