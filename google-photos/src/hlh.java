// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hlh extends qlq
{

    public String a;
    public String b[];
    public String c[];

    public hlh()
    {
        a = null;
        b = qmb.f;
        c = qmb.f;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
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
                j = 0;
                int k = 0;
                int i1;
                int k1;
                for (i1 = 0; j < b.length; i1 = k1)
                {
                    String s = b[j];
                    int i2 = k;
                    k1 = i1;
                    if (s != null)
                    {
                        k1 = i1 + 1;
                        i2 = k + qlp.a(s);
                    }
                    j++;
                    k = i2;
                }

                j = i + k + i1 * 1;
            }
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                int l = 0;
                int j1 = 0;
                for (i = ((flag) ? 1 : 0); i < c.length;)
                {
                    String s1 = c[i];
                    int j2 = l;
                    int l1 = j1;
                    if (s1 != null)
                    {
                        l1 = j1 + 1;
                        j2 = l + qlp.a(s1);
                    }
                    i++;
                    l = j2;
                    j1 = l1;
                }

                i = j + l + j1 * 1;
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
                int i1 = qmb.b(qlo1, 26);
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
        if (a != null)
        {
            qlp1.a(1, a);
        }
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
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                String s1 = c[j];
                if (s1 != null)
                {
                    qlp1.a(3, s1);
                }
            }

        }
        super.a(qlp1);
    }
}
