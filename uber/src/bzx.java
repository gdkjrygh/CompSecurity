// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.paypal.android.sdk.bB;
import com.paypal.android.sdk.bF;
import com.paypal.android.sdk.bI;
import com.paypal.android.sdk.bK;
import com.paypal.android.sdk.bY;
import com.paypal.android.sdk.ce;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalService;
import java.util.UUID;

public final class bzx
    implements btj
{

    private PayPalService a;

    private bzx(PayPalService paypalservice)
    {
        a = paypalservice;
        super();
    }

    public bzx(PayPalService paypalservice, byte byte0)
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

    public final void a(bvy bvy1)
    {
        PayPalService.y();
        a.a(buw.j, bvy1.k(), bvy1.u());
        if (bvy1.v() && (a.c().h == null || a.c().h.a())) goto _L2; else goto _L1
_L1:
        a.h();
_L4:
        PayPalService.g(a).a(ccm.a(bvy1));
        PayPalService.g(a).a();
        return;
_L2:
        bur.a(a.c().h, a.e());
        if (a.c().e != null)
        {
            PayPalService.f(a).a(a.c().e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(bwa bwa1)
    {
        PayPalService.y();
        a.a(buw.v, bwa1.k());
        PayPalService.g(a).a(bwa1.a);
        PayPalService.g(a).a();
    }

    public final void a(bwb bwb1)
    {
        PayPalService.y();
        PayPalService.g(a).a(bwb1);
        PayPalService.g(a).a();
    }

    public final void a(bwc bwc1)
    {
        PayPalService.y();
        a.a(buw.j, bwc1.k(), bwc1.E());
        PayPalService.g(a).a(ccm.a(bwc1));
        boolean flag;
        if (bwc1.u() == null || !bwc1.B())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (!bwc1.B())
            {
                a.t();
            }
            PayPalService.g(a).a();
            return;
        } else
        {
            String s = UUID.randomUUID().toString();
            a.b().b(new bwo(a.b(), a.a(), a.c().c.b(), s, bwc1.v(), bwc1.u(), bwc1.w(), bwc1.x(), bwc1.y()));
            return;
        }
    }

    public final void a(bwd bwd1)
    {
        bwd1 = bwd1.q().a();
        PayPalService.y();
        Log.e("paypal.sdk", bwd1);
    }

    public final void a(bwf bwf1)
    {
        PayPalService.y();
        PayPalService.g(a).a(bwf1);
        PayPalService.g(a).a();
    }

    public final void a(bwg bwg1)
    {
        PayPalService.y();
        a.c().j = bwg1.g;
        PayPalService.e(a).a();
    }

    public final void a(bwh bwh1)
    {
        long l = 840L;
        PayPalService.y();
        long l1 = bwh1.f;
        bB bb;
        if (l1 <= 840L)
        {
            l = l1;
        }
        if (bwh1.c == null)
        {
            a.c().h = a(bwh1.d, bwh1.e, l);
        } else
        {
            a.c().j = bwh1.g;
            a.c().f = new bK(bwh1.c, bwh1.e);
        }
        a.c().g = null;
        bb = new bB();
        if (bwh1.a.a())
        {
            bb.a(bwh1.a.b());
            bb.a(bta.a);
        } else
        {
            bb.a(bwh1.a.d());
            bb.a(bta.b);
        }
        a.c().e = bb;
        if (bwh1.a.a())
        {
            a.c().d = bwh1.a.b();
            a.a(buw.l, Boolean.valueOf(bwh1.b), bwh1.k());
        } else
        {
            a.c().d = bwh1.a.d().a(bun.a());
            a.a(buw.m, Boolean.valueOf(bwh1.b), bwh1.k());
        }
        PayPalService.e(a).a();
    }

    public final void a(bwm bwm1)
    {
        PayPalService.y();
        a.a(buw.b, bwm1.k());
        a.c().c = a(bwm1.a, bwm1.b, bwm1.c);
        a.c().i = bwm1.d;
        PayPalService.b(a);
        if (PayPalService.c(a) != null)
        {
            PayPalService.y();
            PayPalService.c(a).a();
            PayPalService.d(a);
        }
    }

    public final void a(bwo bwo1)
    {
        PayPalService.y();
        bwo1 = new bF(PayPalService.h(a), bwo1.u(), bwo1.a, bwo1.w(), bwo1.v(), bwo1.x(), bwo1.y(), bwo1.z());
        PayPalService.f(a).a(bwo1, PayPalService.a(a).k());
        PayPalService.g(a).a();
    }

    public final void b(bvy bvy1)
    {
        bvy1.q();
        PayPalService.y();
        PayPalService.b(a, bvy1);
    }

    public final void b(bwa bwa1)
    {
        String s = bwa1.q().a();
        PayPalService.y();
        Log.e("paypal.sdk", s);
        PayPalService.g(a).a(PayPalService.a(bwa1));
    }

    public final void b(bwb bwb1)
    {
        String s = bwb1.q().a();
        PayPalService.y();
        Log.e("paypal.sdk", s);
        PayPalService.g(a).a(PayPalService.a(bwb1));
    }

    public final void b(bwc bwc1)
    {
        bwc1.q();
        PayPalService.y();
        PayPalService.b(a, bwc1);
    }

    public final void b(bwf bwf1)
    {
        String s = bwf1.q().a();
        PayPalService.y();
        Log.e("paypal.sdk", s);
        PayPalService.g(a).a(PayPalService.a(bwf1));
    }

    public final void b(bwg bwg1)
    {
        String s = bwg1.q().a();
        PayPalService.y();
        Log.e("paypal.sdk", s);
        PayPalService.e(a).a(PayPalService.a(bwg1));
    }

    public final void b(bwh bwh1)
    {
        String s = bwh1.q().a();
        PayPalService.y();
        Log.e("paypal.sdk", s);
        a.h();
        bY by = bwh1.a;
        boolean flag = bwh1.b;
        if (by.a())
        {
            PayPalService.a(a, buw.l, flag, s, bwh1.k());
        } else
        {
            PayPalService.a(a, buw.m, flag, s, bwh1.k());
        }
        PayPalService.f(a).b();
        if (bwh1.h)
        {
            a.c().j = bwh1.g;
            a.c().g = new bti(bwh1.i);
        }
        PayPalService.e(a).a(PayPalService.a(bwh1));
    }

    public final void b(bwm bwm1)
    {
        PayPalService.a(a, bwm1);
    }

    public final void b(bwo bwo1)
    {
        bwo1 = bwo1.q().a();
        PayPalService.y();
        Log.e("paypal.sdk", bwo1);
        PayPalService.g(a).a();
    }
}
