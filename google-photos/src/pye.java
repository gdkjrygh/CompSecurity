// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pye extends qlq
{

    public Integer a;
    public pxo b[];
    public long c[];
    public boolean d[];
    public pxp e[];
    public String f;
    public String g;
    public pyf h;
    public Integer i;
    public Integer j;

    public pye()
    {
        a = null;
        b = pxo.b();
        c = qmb.b;
        d = qmb.e;
        e = pxp.b();
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int l = super.a();
        int k = l;
        if (b != null)
        {
            k = l;
            if (b.length > 0)
            {
                k = l;
                for (l = 0; l < b.length;)
                {
                    pxo pxo1 = b[l];
                    int i1 = k;
                    if (pxo1 != null)
                    {
                        i1 = k + qlp.c(1, pxo1);
                    }
                    l++;
                    k = i1;
                }

            }
        }
        l = k;
        if (f != null)
        {
            l = k + qlp.b(2, f);
        }
        k = l;
        if (h != null)
        {
            k = l + qlp.c(3, h);
        }
        l = k;
        if (i != null)
        {
            l = k + qlp.e(4, i.intValue());
        }
        int j1 = l;
        if (j != null)
        {
            j1 = l + qlp.e(5, j.intValue());
        }
        k = j1;
        if (a != null)
        {
            k = j1 + qlp.e(6, a.intValue());
        }
        l = k;
        if (c != null)
        {
            l = k;
            if (c.length > 0)
            {
                l = 0;
                int k1 = 0;
                for (; l < c.length; l++)
                {
                    k1 += qlp.a(c[l]);
                }

                l = k + k1 + c.length * 1;
            }
        }
        k = l;
        if (d != null)
        {
            k = l;
            if (d.length > 0)
            {
                k = l + d.length * 1 + d.length * 1;
            }
        }
        l = k;
        if (e != null)
        {
            l = k;
            if (e.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    l = k;
                    if (l1 >= e.length)
                    {
                        break;
                    }
                    pxp pxp1 = e[l1];
                    l = k;
                    if (pxp1 != null)
                    {
                        l = k + qlp.c(9, pxp1);
                    }
                    l1++;
                    k = l;
                } while (true);
            }
        }
        k = l;
        if (g != null)
        {
            k = l + qlp.b(10, g);
        }
        return k;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int k = qlo1.a();
            switch (k)
            {
            default:
                if (super.a(qlo1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int j2 = qmb.b(qlo1, 10);
                pxo apxo[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                apxo = new pxo[j2 + l];
                j2 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, apxo, 0, l);
                    j2 = l;
                }
                for (; j2 < apxo.length - 1; j2++)
                {
                    apxo[j2] = new pxo();
                    qlo1.a(apxo[j2]);
                    qlo1.a();
                }

                apxo[j2] = new pxo();
                qlo1.a(apxo[j2]);
                b = apxo;
                break;

            case 18: // '\022'
                f = qlo1.g();
                break;

            case 26: // '\032'
                if (h == null)
                {
                    h = new pyf();
                }
                qlo1.a(h);
                break;

            case 32: // ' '
                i = Integer.valueOf(qlo1.i());
                break;

            case 40: // '('
                j = Integer.valueOf(qlo1.i());
                break;

            case 48: // '0'
                a = Integer.valueOf(qlo1.i());
                break;

            case 56: // '8'
                int k2 = qmb.b(qlo1, 56);
                long al[];
                int i1;
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                al = new long[k2 + i1];
                k2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, al, 0, i1);
                    k2 = i1;
                }
                for (; k2 < al.length - 1; k2++)
                {
                    al[k2] = qlo1.j();
                    qlo1.a();
                }

                al[k2] = qlo1.j();
                c = al;
                break;

            case 58: // ':'
                int l3 = qlo1.c(qlo1.i());
                int j1 = qlo1.o();
                int l2;
                for (l2 = 0; qlo1.m() > 0; l2++)
                {
                    qlo1.j();
                }

                qlo1.e(j1);
                long al1[];
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                al1 = new long[l2 + j1];
                l2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(c, 0, al1, 0, j1);
                    l2 = j1;
                }
                for (; l2 < al1.length; l2++)
                {
                    al1[l2] = qlo1.j();
                }

                c = al1;
                qlo1.d(l3);
                break;

            case 64: // '@'
                int i3 = qmb.b(qlo1, 64);
                boolean aflag[];
                int k1;
                if (d == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = d.length;
                }
                aflag = new boolean[i3 + k1];
                i3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(d, 0, aflag, 0, k1);
                    i3 = k1;
                }
                for (; i3 < aflag.length - 1; i3++)
                {
                    aflag[i3] = qlo1.f();
                    qlo1.a();
                }

                aflag[i3] = qlo1.f();
                d = aflag;
                break;

            case 66: // 'B'
                int i4 = qlo1.c(qlo1.i());
                int l1 = qlo1.o();
                int j3;
                for (j3 = 0; qlo1.m() > 0; j3++)
                {
                    qlo1.f();
                }

                qlo1.e(l1);
                boolean aflag1[];
                if (d == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = d.length;
                }
                aflag1 = new boolean[j3 + l1];
                j3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(d, 0, aflag1, 0, l1);
                    j3 = l1;
                }
                for (; j3 < aflag1.length; j3++)
                {
                    aflag1[j3] = qlo1.f();
                }

                d = aflag1;
                qlo1.d(i4);
                break;

            case 74: // 'J'
                int k3 = qmb.b(qlo1, 74);
                pxp apxp[];
                int i2;
                if (e == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = e.length;
                }
                apxp = new pxp[k3 + i2];
                k3 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(e, 0, apxp, 0, i2);
                    k3 = i2;
                }
                for (; k3 < apxp.length - 1; k3++)
                {
                    apxp[k3] = new pxp();
                    qlo1.a(apxp[k3]);
                    qlo1.a();
                }

                apxp[k3] = new pxp();
                qlo1.a(apxp[k3]);
                e = apxp;
                break;

            case 82: // 'R'
                g = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (b != null && b.length > 0)
        {
            for (int k = 0; k < b.length; k++)
            {
                pxo pxo1 = b[k];
                if (pxo1 != null)
                {
                    qlp1.a(1, pxo1);
                }
            }

        }
        if (f != null)
        {
            qlp1.a(2, f);
        }
        if (h != null)
        {
            qlp1.a(3, h);
        }
        if (i != null)
        {
            qlp1.a(4, i.intValue());
        }
        if (j != null)
        {
            qlp1.a(5, j.intValue());
        }
        if (a != null)
        {
            qlp1.a(6, a.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int l = 0; l < c.length; l++)
            {
                qlp1.b(7, c[l]);
            }

        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                qlp1.a(8, d[i1]);
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < e.length; j1++)
            {
                pxp pxp1 = e[j1];
                if (pxp1 != null)
                {
                    qlp1.a(9, pxp1);
                }
            }

        }
        if (g != null)
        {
            qlp1.a(10, g);
        }
        super.a(qlp1);
    }
}
