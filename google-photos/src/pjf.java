// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pjf extends qlq
{

    public String a;
    public String b[];
    public String c[];
    public qfz d;

    public pjf()
    {
        a = null;
        b = qmb.f;
        c = qmb.f;
        d = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int k2 = super.a() + qlp.b(1, a);
        int j;
        int k;
        if (b != null && b.length > 0)
        {
            int i = 0;
            k = 0;
            int l;
            int j1;
            for (l = 0; i < b.length; l = j1)
            {
                String s = b[i];
                int l1 = k;
                j1 = l;
                if (s != null)
                {
                    j1 = l + 1;
                    l1 = k + qlp.a(s);
                }
                i++;
                k = l1;
            }

            k = k2 + k + l * 1;
        } else
        {
            k = k2;
        }
        j = k;
        if (d != null)
        {
            j = k + qlp.c(3, d);
        }
        k = j;
        if (c != null)
        {
            k = j;
            if (c.length > 0)
            {
                int i1 = 0;
                int k1 = 0;
                for (k = ((flag) ? 1 : 0); k < c.length;)
                {
                    String s1 = c[k];
                    int j2 = i1;
                    int i2 = k1;
                    if (s1 != null)
                    {
                        i2 = k1 + 1;
                        j2 = i1 + qlp.a(s1);
                    }
                    k++;
                    i1 = j2;
                    k1 = i2;
                }

                k = j + i1 + k1 * 1;
            }
        }
        return k;
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
                int l = qmb.b(qlo1, 18);
                String as[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = qlo1.g();
                    qlo1.a();
                }

                as[l] = qlo1.g();
                b = as;
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new qfz();
                }
                qlo1.a(d);
                break;

            case 34: // '"'
                int i1 = qmb.b(qlo1, 34);
                String as1[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                as1 = new String[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, as1, 0, k);
                    i1 = k;
                }
                for (; i1 < as1.length - 1; i1++)
                {
                    as1[i1] = qlo1.g();
                    qlo1.a();
                }

                as1[i1] = qlo1.g();
                c = as1;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        qlp1.a(1, a);
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                String s = b[i];
                if (s != null)
                {
                    qlp1.a(2, s);
                }
            }

        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                String s1 = c[j];
                if (s1 != null)
                {
                    qlp1.a(4, s1);
                }
            }

        }
        super.a(qlp1);
    }
}
