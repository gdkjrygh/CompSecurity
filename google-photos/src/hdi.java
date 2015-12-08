// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hdi extends qlq
{

    public String a[];
    public String b[];
    public String c[];
    public String d[];

    public hdi()
    {
        a = qmb.f;
        b = qmb.f;
        c = qmb.f;
        d = qmb.f;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int l3 = super.a();
        int j;
        int k;
        if (a != null && a.length > 0)
        {
            int i = 0;
            k = 0;
            int l;
            int l1;
            for (l = 0; i < a.length; l = l1)
            {
                String s = a[i];
                int l2 = k;
                l1 = l;
                if (s != null)
                {
                    l1 = l + 1;
                    l2 = k + qlp.a(s);
                }
                i++;
                k = l2;
            }

            k = l3 + k + l * 1;
        } else
        {
            k = l3;
        }
        j = k;
        if (d != null)
        {
            j = k;
            if (d.length > 0)
            {
                j = 0;
                int i1 = 0;
                int i2;
                int i3;
                for (i2 = 0; j < d.length; i2 = i3)
                {
                    String s1 = d[j];
                    l3 = i1;
                    i3 = i2;
                    if (s1 != null)
                    {
                        i3 = i2 + 1;
                        l3 = i1 + qlp.a(s1);
                    }
                    j++;
                    i1 = l3;
                }

                j = k + i1 + i2 * 1;
            }
        }
        k = j;
        if (b != null)
        {
            k = j;
            if (b.length > 0)
            {
                k = 0;
                int j1 = 0;
                int j2;
                int j3;
                for (j2 = 0; k < b.length; j2 = j3)
                {
                    String s2 = b[k];
                    l3 = j1;
                    j3 = j2;
                    if (s2 != null)
                    {
                        j3 = j2 + 1;
                        l3 = j1 + qlp.a(s2);
                    }
                    k++;
                    j1 = l3;
                }

                k = j + j1 + j2 * 1;
            }
        }
        j = k;
        if (c != null)
        {
            j = k;
            if (c.length > 0)
            {
                int k1 = 0;
                int k2 = 0;
                for (j = ((flag) ? 1 : 0); j < c.length;)
                {
                    String s3 = c[j];
                    l3 = k1;
                    int k3 = k2;
                    if (s3 != null)
                    {
                        k3 = k2 + 1;
                        l3 = k1 + qlp.a(s3);
                    }
                    j++;
                    k1 = l3;
                    k2 = k3;
                }

                j = k + k1 + k2 * 1;
            }
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

            case 10: // '\n'
                int j1 = qmb.b(qlo1, 10);
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    j1 = j;
                }
                for (; j1 < as.length - 1; j1++)
                {
                    as[j1] = qlo1.g();
                    qlo1.a();
                }

                as[j1] = qlo1.g();
                a = as;
                break;

            case 18: // '\022'
                int k1 = qmb.b(qlo1, 18);
                String as1[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                as1 = new String[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, as1, 0, k);
                    k1 = k;
                }
                for (; k1 < as1.length - 1; k1++)
                {
                    as1[k1] = qlo1.g();
                    qlo1.a();
                }

                as1[k1] = qlo1.g();
                d = as1;
                break;

            case 26: // '\032'
                int l1 = qmb.b(qlo1, 26);
                String as2[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                as2 = new String[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, as2, 0, l);
                    l1 = l;
                }
                for (; l1 < as2.length - 1; l1++)
                {
                    as2[l1] = qlo1.g();
                    qlo1.a();
                }

                as2[l1] = qlo1.g();
                b = as2;
                break;

            case 34: // '"'
                int i2 = qmb.b(qlo1, 34);
                String as3[];
                int i1;
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                as3 = new String[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, as3, 0, i1);
                    i2 = i1;
                }
                for (; i2 < as3.length - 1; i2++)
                {
                    as3[i2] = qlo1.g();
                    qlo1.a();
                }

                as3[i2] = qlo1.g();
                c = as3;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    qlp1.a(1, s);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = 0; j < d.length; j++)
            {
                String s1 = d[j];
                if (s1 != null)
                {
                    qlp1.a(2, s1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int k = 0; k < b.length; k++)
            {
                String s2 = b[k];
                if (s2 != null)
                {
                    qlp1.a(3, s2);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < c.length; l++)
            {
                String s3 = c[l];
                if (s3 != null)
                {
                    qlp1.a(4, s3);
                }
            }

        }
        super.a(qlp1);
    }
}
