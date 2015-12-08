// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oxq extends qlq
{

    private String a[];
    private String b[];

    public oxq()
    {
        a = qmb.f;
        b = qmb.f;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int k2 = super.a();
        int i;
        int k;
        if (a != null && a.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int j1;
            for (l = 0; i < a.length; l = j1)
            {
                String s = a[i];
                int l1 = j;
                j1 = l;
                if (s != null)
                {
                    j1 = l + 1;
                    l1 = j + qlp.a(s);
                }
                i++;
                j = l1;
            }

            i = k2 + j + l * 1;
        } else
        {
            i = k2;
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                int i1 = 0;
                int k1 = 0;
                for (k = ((flag) ? 1 : 0); k < b.length;)
                {
                    String s1 = b[k];
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

                k = i + i1 + k1 * 1;
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
                int l = qmb.b(qlo1, 10);
                String as[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = qlo1.g();
                    qlo1.a();
                }

                as[l] = qlo1.g();
                a = as;
                break;

            case 18: // '\022'
                int i1 = qmb.b(qlo1, 18);
                String as1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                as1 = new String[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, as1, 0, k);
                    i1 = k;
                }
                for (; i1 < as1.length - 1; i1++)
                {
                    as1[i1] = qlo1.g();
                    qlo1.a();
                }

                as1[i1] = qlo1.g();
                b = as1;
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
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                String s1 = b[j];
                if (s1 != null)
                {
                    qlp1.a(2, s1);
                }
            }

        }
        super.a(qlp1);
    }
}
