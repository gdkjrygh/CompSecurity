// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class gmx
    implements omb, ops, opt, opu, opv
{

    final am a;
    final int b;
    grg c;
    boolean d;
    private final nug e = new gmy(this);
    private final nug f = new gmz(this);
    private egp g;
    private jem h;

    gmx(am am1, opd opd1, int i)
    {
        d = true;
        a = am1;
        b = i;
        opd1.a(this);
    }

    private jem a()
    {
        if (h != null)
        {
            return h;
        } else
        {
            h = (jem)a.h().a(b);
            return h;
        }
    }

    public final void V_()
    {
        c.a.a(e);
        g.a().a(f);
    }

    public final void X_()
    {
        g.a().a(f, true);
        c.a.a(e, true);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        g = (egp)olm1.a(egp);
        c = (grg)olm1.a(grg);
        if (bundle != null)
        {
            d = bundle.getBoolean("is_visible");
        }
    }

    void a(ekp ekp1, boolean flag)
    {
        boolean flag1;
        if (ekp1 != null && ekp1.c() == euv.c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && g.b() && flag1)
        {
            jem jem1 = a();
            ekp1 = jem1;
            if (jem1 == null)
            {
                h = new jem();
                a.h().a().a(af.p, h).b();
                a.h().b();
                ekp1 = h;
            }
            if (((am) (ekp1)).J)
            {
                a.h().a().e(ekp1).b();
            }
        } else
        {
            ekp1 = a();
            if (ekp1 != null && !((am) (ekp1)).J)
            {
                a.h().a().d(ekp1).b();
                a.h().b();
                return;
            }
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("is_visible", d);
    }
}
