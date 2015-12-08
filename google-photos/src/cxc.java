// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cxc
    implements cxd
{

    private dcs a;
    private dcs b;
    private int c;
    private int d;
    private float e[];
    private float f[];
    private float g[];
    private float h[];

    public cxc()
    {
        a = null;
        b = null;
    }

    private void a(cob cob1, float af[])
    {
        for (int i = 0; i < (c - 1) * d; i++)
        {
            af[i] = cob1.c[i];
        }

    }

    private void b(cob cob1, float af[])
    {
        int j = c;
        int k = d;
        for (int i = 0; i < d; i++)
        {
            af[i] = cob1.c[k * (j - 1) + i];
        }

    }

    public static boolean b(cob cob1, cob cob2)
    {
        return cob1 != null && cob2 != null && cob1.a == cob2.a && cob1.b == cob2.b;
    }

    public final float a(cob cob1, cob cob2)
    {
        if (a == null || b == null)
        {
            c = cob1.a;
            d = cob1.b;
            e = new float[(c - 1) * d];
            f = new float[(c - 1) * d];
            g = new float[d];
            h = new float[d];
            a = new dcs(c - 1, d, false, true);
            b = new dcs(1, d, false, false);
        } else
        {
            b.a(c, "mMatrixRows", cob1.a, "matrixA.getRows()");
            b.a(d, "mMatrixColumns", cob1.b, "matrixA.getColumns()");
        }
        a(cob1, e);
        a(cob2, f);
        b(cob1, g);
        b(cob2, h);
        return a.a(e, f) + b.a(g, h);
    }

    public final float a(cqh cqh, cof cof1, cqh cqh1, cof cof2)
    {
        return a((cob)cof1.c.a(cmm.j), (cob)cof2.c.a(cmm.j));
    }

    public final boolean b(cqh cqh, cof cof1, cqh cqh1, cof cof2)
    {
        return b((cob)cof1.c.a(cmm.j), (cob)cof2.c.a(cmm.j));
    }
}
