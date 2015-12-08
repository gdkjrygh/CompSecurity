// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cns
{

    public int a;
    public int b;
    public boolean c;
    public nny d;
    public int e;
    public boolean f;
    private cnt g;
    private cod h;
    private boolean i;
    private byte j[];

    public cns()
    {
        a = -1;
        b = -1;
        c = true;
    }

    cns(cnq cnq1)
    {
        a = -1;
        b = -1;
        c = true;
        a = cnq1.b;
        b = cnq1.c;
        g = cnq1.d;
        h = cnq1.f;
        c = cnq1.g;
        i = cnq1.h;
        j = cnq.a(cnq1);
        d = cnq1.e;
        e = cnq1.j;
        f = cnq1.k;
    }

    public final cnq a()
    {
        cnt cnt1 = (cnt)c.a(g, "mType", null);
        cod cod1 = (cod)c.a(h, "mInterval", null);
        if (cnt1 != cnt.f)
        {
            c.a(d, "mMediaIdentifier", null);
        }
        nny nny = d;
        return new cnq(a, b, cnt1, nny, cod1, c, i, j, e, f);
    }

    public final cns a(cnt cnt1)
    {
        g = (cnt)b.a(cnt1, "type", null);
        return this;
    }

    public final cns a(cod cod1)
    {
        h = (cod)b.a(cod1, "interval", null);
        return this;
    }

    public final cns a(pyg pyg)
    {
        if (pyg == null)
        {
            j = null;
            return this;
        } else
        {
            j = qlw.a(pyg);
            return this;
        }
    }
}
