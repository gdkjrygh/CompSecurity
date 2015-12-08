// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public final class hti
    implements hth, mmt, omb, ops, opv
{

    private final ar a;
    private final int b;
    private boolean c;
    private boolean d;
    private mtj e;
    private noz f;
    private mmr g;
    private htb h;

    public hti(Activity activity, opd opd1, int i)
    {
        a = (ar)activity;
        b = i;
        opd1.a(this);
    }

    static void a(hti hti1, mue mue1)
    {
        if (mue1 == null || mue1.c())
        {
            if (hti1.f.a())
            {
                noy.a("result", mue1);
            }
        } else
        {
            hto hto1 = hto.valueOf(mue1.a().getString("extra_people_grouping_status"));
            int i = mue1.a().getInt("account_id");
            if (hti1.f.a())
            {
                noy.a(i);
                noy.a("status", hto1);
            }
            if (i == hti1.g.d())
            {
                hti1.h.a(i, hto1);
                if (hto1 == hto.c)
                {
                    hti1.b();
                    return;
                }
            }
        }
    }

    private void b()
    {
        if (c)
        {
            return;
        } else
        {
            c = true;
            hte hte1 = new hte();
            a.c().a().a(b, hte1, "com.google.android.apps.photos.search.peoplegroupingonboarding.existing.onboarding_fragment").b();
            return;
        }
    }

    private void c()
    {
        am am = a.c().a("com.google.android.apps.photos.search.peoplegroupingonboarding.existing.onboarding_fragment");
        if (am == null)
        {
            return;
        } else
        {
            a.c().a().a(am).c();
            return;
        }
    }

    public final void a()
    {
        if (g.e())
        {
            h.a(g.d(), hto.b);
        }
        c();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = ((mtj)olm1.a(mtj)).a("ReportLocationTask", new htj(this));
        f = noz.a(context, 3, "EUPGOM", new String[0]);
        g = ((mmr)olm1.a(mmr)).a(this);
        h = (htb)olm1.a(htb);
        if (bundle != null)
        {
            c = bundle.getBoolean("has_added_fragment", false);
            d = bundle.getBoolean("is_loading_complete", false);
        }
    }

    public final void a(boolean flag, mms mms, mms mms1, int i, int j)
    {
        boolean flag1 = true;
        if (j != -1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && !c)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            mms = h.c(j);
            if (mms == hto.a)
            {
                e.b("ReportLocationTask");
                e.a(new htp(g.d(), 0));
                return;
            }
            if (mms == hto.c)
            {
                b();
                return;
            } else
            {
                c();
                return;
            }
        } else
        {
            c();
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("has_added_fragment", c);
        bundle.putBoolean("is_loading_complete", d);
    }
}
