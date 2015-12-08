// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pni extends qlq
{

    private Boolean a;
    private pnk b;
    private long c[];
    private String d;
    private Integer e;
    private String f;
    private pnj g;

    public pni()
    {
        a = null;
        b = null;
        c = qmb.b;
        d = null;
        e = null;
        f = null;
        g = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i = super.a();
        int j = i;
        if (a != null)
        {
            a.booleanValue();
            j = i + (qlp.c(1) + 1);
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < c.length; j++)
                {
                    k += qlp.a(c[j]);
                }

                j = i + k + c.length * 1;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.e(5, e.intValue());
        }
        i = j;
        if (g != null)
        {
            i = j + qlp.c(6, g);
        }
        j = i;
        if (f != null)
        {
            j = i + qlp.b(7, f);
        }
        return j;
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

            case 8: // '\b'
                a = Boolean.valueOf(qlo1.f());
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new pnk();
                }
                qlo1.a(b);
                break;

            case 24: // '\030'
                int l = qmb.b(qlo1, 24);
                long al[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                al = new long[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, al, 0, j);
                    l = j;
                }
                for (; l < al.length - 1; l++)
                {
                    al[l] = qlo1.j();
                    qlo1.a();
                }

                al[l] = qlo1.j();
                c = al;
                break;

            case 26: // '\032'
                int j1 = qlo1.c(qlo1.i());
                int k = qlo1.o();
                int i1;
                for (i1 = 0; qlo1.m() > 0; i1++)
                {
                    qlo1.j();
                }

                qlo1.e(k);
                long al1[];
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                al1 = new long[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, al1, 0, k);
                    i1 = k;
                }
                for (; i1 < al1.length; i1++)
                {
                    al1[i1] = qlo1.j();
                }

                c = al1;
                qlo1.d(j1);
                break;

            case 34: // '"'
                d = qlo1.g();
                break;

            case 40: // '('
                e = Integer.valueOf(qlo1.i());
                break;

            case 50: // '2'
                if (g == null)
                {
                    g = new pnj();
                }
                qlo1.a(g);
                break;

            case 58: // ':'
                f = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                qlp1.b(3, c[i]);
            }

        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null)
        {
            qlp1.a(5, e.intValue());
        }
        if (g != null)
        {
            qlp1.a(6, g);
        }
        if (f != null)
        {
            qlp1.a(7, f);
        }
        super.a(qlp1);
    }
}
