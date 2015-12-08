// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class ibi extends omp
    implements idf, nzi, nzu
{

    private mmr a;
    private ibd ag;
    private ibz ah;
    private oac ai;
    private mtj aj;
    private final nzh b;
    private final ide c;
    private final iau d;
    private int e;
    private PreferenceCategory f;
    private oay g;
    private oay h;

    public ibi()
    {
        b = new nzh(this, af);
        c = new ide(this, af, this);
        d = new iau(af);
        new nzt(this, af);
    }

    static ide a(ibi ibi1)
    {
        return ibi1.c;
    }

    static iau b(ibi ibi1)
    {
        return ibi1.d;
    }

    static ibz c(ibi ibi1)
    {
        return ibi1.ah;
    }

    static olq d(ibi ibi1)
    {
        return ibi1.ad;
    }

    static int e(ibi ibi1)
    {
        return ibi1.e;
    }

    private void t()
    {
        nwc nwc1 = c.c;
        oay oay1;
        boolean flag;
        if (nwc1.b)
        {
            b.a(g);
            g.b(a.e());
            g.c(p.bc);
            g.a(nwc1.c);
        } else
        {
            b.b(g);
        }
        h.b(a.e());
        h.c(p.bj);
        oay1 = h;
        if (!nwc1.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        oay1.a(flag);
        if (nwc1.e)
        {
            b.a(ag);
            ag.b(true);
            ag.a(nwc1.f);
            return;
        } else
        {
            b.b(ag);
            return;
        }
    }

    public final void a(nwc nwc1)
    {
        if (nwc1 == null)
        {
            return;
        } else
        {
            t();
            return;
        }
    }

    public final void au_()
    {
        super.au_();
        aj.a(new idh(e));
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        a = (mmr)ae.a(mmr);
        e = a.d();
        ah = (ibz)ae.a(ibz);
        aj = (mtj)ae.a(mtj);
    }

    public final void r()
    {
        if (ai == null)
        {
            ai = new oac(ad);
        }
        ag = new ibd(ad);
        ag.b(a(p.bb));
        ag.a_(a(p.ba));
        ag.a(Boolean.valueOf(true));
        ag.b(false);
        ag.b(4);
        ag.j = new ibk(this);
        g = ai.c(a(p.bd), a(p.bt));
        g.a(Boolean.valueOf(false));
        g.b(false);
        g.b(5);
        g.j = new ibl(this);
        b.a(g);
        h = ai.c(a(p.bk), a(p.bt));
        h.a(Boolean.valueOf(false));
        h.b(false);
        h.j = new ibj(this);
        if (f == null)
        {
            f = ai.a(p.bf);
            f.d("location_preference_category_key");
            f.b(7);
        }
        f.b(h);
        h.b(1);
        if (c.b())
        {
            t();
        }
    }

    public final void s()
    {
        c.c();
    }
}
