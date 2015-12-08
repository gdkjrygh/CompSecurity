// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class nij extends omp
    implements mti, ngj, nig, nin
{

    private nga a;
    private mmv b;
    private mtj c;
    private mwx d;
    private int e;
    private int f;
    private long g;

    public nij()
    {
        c = (new mtj(this, af)).a(this);
        d = new mwx(af);
        e = -1;
        g = 0x8000000000000000L;
    }

    static long a(nij nij1, long l)
    {
        nij1.g = 0x8000000000000000L;
        return 0x8000000000000000L;
    }

    static void a(nij nij1)
    {
        nij1.u();
    }

    private void t()
    {
        if (g != 0x8000000000000000L)
        {
            long l = Math.max(g - System.currentTimeMillis(), 0L);
            d.a(new nik(this), l);
        }
    }

    private void u()
    {
        Object obj = b.a(e);
        String s = ((mmx) (obj)).b("account_name");
        obj = ((mmx) (obj)).b("effective_gaia_id");
        a.a(s, ((String) (obj)));
    }

    public final void a()
    {
        a.b();
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            e = bundle.getInt("account_id");
            f = bundle.getInt("retry_count");
            g = bundle.getLong("next_retry_time_ms");
            t();
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
label0:
        {
            if ("oob".equals(s))
            {
                if (mue1 != null)
                {
                    break label0;
                }
                a.b();
            }
            return;
        }
        if (mue1.c())
        {
            a.d();
            return;
        }
        s = b.a(e).b("account_name");
        mue1 = mue1.a();
        mua = (mvf)mue1.getParcelable("oob_response");
        if (mua != null)
        {
            a.e();
            mua = (pnh)mua.a(new pnh());
            boolean flag = mue1.getBoolean("allow_non_google_accounts");
            if (nif.a(mua))
            {
                nif.a(ad, h(), mua, flag);
                return;
            } else
            {
                mua = h();
                mue1 = new njf();
                Bundle bundle = new Bundle();
                bundle.putString("AccountName", s);
                mue1.f(bundle);
                s = mua.a();
                s.a(mue1, "signup");
                s.a("signup");
                s.b();
                return;
            }
        } else
        {
            u();
            return;
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        String s = b.a(e).b("account_name");
        a.a(ad.getString(p.bB));
        pmv pmv1 = new pmv();
        pmv1.a = 2;
        c.a(new nim(ad, "oob", s, null, pmv1, null, flag, flag1));
    }

    public final void c(Bundle bundle)
    {
        b = (mmv)ae.a(mmv);
        a = (nga)ae.a(nga);
        ae.a(nig, this);
        ae.a(nin, this);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("account_id", e);
        bundle.putInt("retry_count", f);
        bundle.putLong("next_retry_time_ms", g);
    }

    public final void f_(int i)
    {
        boolean flag1 = true;
        boolean flag = false;
        e = i;
        mmx mmx1 = b.a(i);
        String s = mmx1.b("account_name");
        if (mmx1.c("PlusiAccountUpdateExtension.oob_required"))
        {
            i = b.a(s);
            mmx1 = b.a(i);
            mtj mtj1 = c;
            olq olq1 = ad;
            if (mmx1.a("page_count", 0) <= 0)
            {
                flag1 = false;
            }
            mtj1.a(new nim(olq1, "oob", s, null, null, null, flag1, false));
        } else
        {
            if (mmx1.c("gplus_skinny_page"))
            {
                a.e();
                nio.b(h(), s);
                return;
            }
            if (f == 5)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                f = f + 1;
                g = 2000L * (1L << f) + System.currentTimeMillis();
                t();
                i = 1;
            }
            if (i == 0)
            {
                a.b(a(p.bA), "G+ upgrade failed");
                return;
            }
        }
    }

    public final void r()
    {
        u();
    }
}
