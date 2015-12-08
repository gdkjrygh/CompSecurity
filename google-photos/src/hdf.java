// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hdf extends qlq
{

    public String a[];
    private String b[];
    private String c[];

    public hdf()
    {
        a = qmb.f;
        b = qmb.f;
        c = qmb.f;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i3 = super.a();
        int i;
        int k;
        if (b != null && b.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int k1;
            for (l = 0; i < b.length; l = k1)
            {
                String s = b[i];
                int j2 = j;
                k1 = l;
                if (s != null)
                {
                    k1 = l + 1;
                    j2 = j + qlp.a(s);
                }
                i++;
                j = j2;
            }

            i = i3 + j + l * 1;
        } else
        {
            i = i3;
        }
        k = i;
        if (c != null)
        {
            k = i;
            if (c.length > 0)
            {
                k = 0;
                int i1 = 0;
                int l1;
                int k2;
                for (l1 = 0; k < c.length; l1 = k2)
                {
                    String s1 = c[k];
                    i3 = i1;
                    k2 = l1;
                    if (s1 != null)
                    {
                        k2 = l1 + 1;
                        i3 = i1 + qlp.a(s1);
                    }
                    k++;
                    i1 = i3;
                }

                k = i + i1 + l1 * 1;
            }
        }
        i = k;
        if (a != null)
        {
            i = k;
            if (a.length > 0)
            {
                int j1 = 0;
                int i2 = 0;
                for (i = ((flag) ? 1 : 0); i < a.length;)
                {
                    String s2 = a[i];
                    i3 = j1;
                    int l2 = i2;
                    if (s2 != null)
                    {
                        l2 = i2 + 1;
                        i3 = j1 + qlp.a(s2);
                    }
                    i++;
                    j1 = i3;
                    i2 = l2;
                }

                i = k + j1 + i2 * 1;
            }
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
                int i1 = qmb.b(qlo1, 10);
                String as[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                as = new String[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, as, 0, j);
                    i1 = j;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = qlo1.g();
                    qlo1.a();
                }

                as[i1] = qlo1.g();
                b = as;
                break;

            case 18: // '\022'
                int j1 = qmb.b(qlo1, 18);
                String as1[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                as1 = new String[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, as1, 0, k);
                    j1 = k;
                }
                for (; j1 < as1.length - 1; j1++)
                {
                    as1[j1] = qlo1.g();
                    qlo1.a();
                }

                as1[j1] = qlo1.g();
                c = as1;
                break;

            case 26: // '\032'
                int k1 = qmb.b(qlo1, 26);
                String as2[];
                int l;
                if (a == null)
                {
                    l = 0;
                } else
                {
                    l = a.length;
                }
                as2 = new String[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(a, 0, as2, 0, l);
                    k1 = l;
                }
                for (; k1 < as2.length - 1; k1++)
                {
                    as2[k1] = qlo1.g();
                    qlo1.a();
                }

                as2[k1] = qlo1.g();
                a = as2;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                String s = b[i];
                if (s != null)
                {
                    qlp1.a(1, s);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                String s1 = c[j];
                if (s1 != null)
                {
                    qlp1.a(2, s1);
                }
            }

        }
        if (a != null && a.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < a.length; k++)
            {
                String s2 = a[k];
                if (s2 != null)
                {
                    qlp1.a(3, s2);
                }
            }

        }
        super.a(qlp1);
    }
}
