// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class iao extends omp
    implements idf, nzi, nzu
{

    private oac a;
    private ibz ag;
    private mtj ah;
    private mmr b;
    private final nzh c;
    private final ide d;
    private final iau e;
    private int f;
    private oay g;
    private oay h;

    public iao()
    {
        c = new nzh(this, af);
        d = new ide(this, af, this);
        e = new iau(af);
        new nzt(this, af);
    }

    static ide a(iao iao1)
    {
        return iao1.d;
    }

    static iau b(iao iao1)
    {
        return iao1.e;
    }

    private void b(nwc nwc1)
    {
        g.b(b.e());
        g.a(nwc1.a);
        g.c(p.aX);
        if (nwc1.g)
        {
            c.a(h);
            h.b(true);
            boolean flag = nwc1.h;
            h.a(flag);
            h.c(p.bp);
            return;
        } else
        {
            c.b(h);
            return;
        }
    }

    static ibz c(iao iao1)
    {
        return iao1.ag;
    }

    public final void a(nwc nwc1)
    {
        while (nwc1 == null || !d.b()) 
        {
            return;
        }
        b(d.c);
    }

    public final void au_()
    {
        super.au_();
        ah.a(new idh(f));
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        b = (mmr)ae.a(mmr);
        f = b.d();
        ag = (ibz)ae.a(ibz);
        ah = (mtj)ae.a(mtj);
    }

    public final void r()
    {
        if (a == null)
        {
            a = new oac(ad);
        }
        g = a.c(a(p.aY), a(p.bt));
        g.a(Boolean.valueOf(true));
        g.b(false);
        g.j = new iap(this);
        c.a(g);
        h = a.c(a(p.bq), a(p.bt));
        h.a(Boolean.valueOf(true));
        h.b(false);
        h.j = new iaq(this);
        if (d.b())
        {
            b(d.c);
        }
    }

    public final void s()
    {
        d.c();
    }
}
