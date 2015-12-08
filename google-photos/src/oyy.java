// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyy extends qlq
{

    private String a;
    private oyz b[];
    private Boolean c;
    private Integer d;
    private String e;
    private String f;
    private String g;

    public oyy()
    {
        a = null;
        b = oyz.b();
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    oyz oyz1 = b[j];
                    int k = i;
                    if (oyz1 != null)
                    {
                        k = i + qlp.c(2, oyz1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (qlp.c(3) + 1);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.e(4, d.intValue());
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.b(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + qlp.b(6, f);
        }
        i = j;
        if (g != null)
        {
            i = j + qlp.b(7, g);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int i = qlo1.a();
            switch (i)
            {
            default:
                if (super.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = qlo1.g();
                break;

            case 18: // '\022'
                int k = qmb.b(qlo1, 18);
                oyz aoyz[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aoyz = new oyz[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aoyz, 0, j);
                    k = j;
                }
                for (; k < aoyz.length - 1; k++)
                {
                    aoyz[k] = new oyz();
                    qlo1.a(aoyz[k]);
                    qlo1.a();
                }

                aoyz[k] = new oyz();
                qlo1.a(aoyz[k]);
                b = aoyz;
                break;

            case 24: // '\030'
                c = Boolean.valueOf(qlo1.f());
                break;

            case 32: // ' '
                d = Integer.valueOf(qlo1.i());
                break;

            case 42: // '*'
                e = qlo1.g();
                break;

            case 50: // '2'
                f = qlo1.g();
                break;

            case 58: // ':'
                g = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                oyz oyz1 = b[i];
                if (oyz1 != null)
                {
                    qlp1.a(2, oyz1);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(4, d.intValue());
        }
        if (e != null)
        {
            qlp1.a(5, e);
        }
        if (f != null)
        {
            qlp1.a(6, f);
        }
        if (g != null)
        {
            qlp1.a(7, g);
        }
        super.a(qlp1);
    }
}
