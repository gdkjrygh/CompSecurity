// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hdg extends qlq
{

    public Boolean a;
    public byte b[][];
    public String c[];
    public String d[];

    public hdg()
    {
        a = null;
        b = qmb.g;
        c = qmb.f;
        d = qmb.f;
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
            a.booleanValue();
            i = j + (qlp.c(1) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                j = 0;
                int k = 0;
                int j1;
                int i2;
                for (j1 = 0; j < b.length; j1 = i2)
                {
                    byte abyte0[] = b[j];
                    int l2 = k;
                    i2 = j1;
                    if (abyte0 != null)
                    {
                        i2 = j1 + 1;
                        l2 = k + qlp.a(abyte0);
                    }
                    j++;
                    k = l2;
                }

                j = i + k + j1 * 1;
            }
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = 0;
                int l = 0;
                int k1;
                int j2;
                for (k1 = 0; i < c.length; k1 = j2)
                {
                    String s = c[i];
                    int i3 = l;
                    j2 = k1;
                    if (s != null)
                    {
                        j2 = k1 + 1;
                        i3 = l + qlp.a(s);
                    }
                    i++;
                    l = i3;
                }

                i = j + l + k1 * 1;
            }
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int i1 = 0;
                int l1 = 0;
                for (j = ((flag) ? 1 : 0); j < d.length;)
                {
                    String s1 = d[j];
                    int j3 = i1;
                    int k2 = l1;
                    if (s1 != null)
                    {
                        k2 = l1 + 1;
                        j3 = i1 + qlp.a(s1);
                    }
                    j++;
                    i1 = j3;
                    l1 = k2;
                }

                j = i + i1 + l1 * 1;
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

            case 8: // '\b'
                a = Boolean.valueOf(qlo1.f());
                break;

            case 18: // '\022'
                int i1 = qmb.b(qlo1, 18);
                byte abyte0[][];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                abyte0 = new byte[i1 + j][];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, abyte0, 0, j);
                    i1 = j;
                }
                for (; i1 < abyte0.length - 1; i1++)
                {
                    abyte0[i1] = qlo1.h();
                    qlo1.a();
                }

                abyte0[i1] = qlo1.h();
                b = abyte0;
                break;

            case 26: // '\032'
                int j1 = qmb.b(qlo1, 26);
                String as[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                as = new String[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, as, 0, k);
                    j1 = k;
                }
                for (; j1 < as.length - 1; j1++)
                {
                    as[j1] = qlo1.g();
                    qlo1.a();
                }

                as[j1] = qlo1.g();
                c = as;
                break;

            case 34: // '"'
                int k1 = qmb.b(qlo1, 34);
                String as1[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                as1 = new String[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, as1, 0, l);
                    k1 = l;
                }
                for (; k1 < as1.length - 1; k1++)
                {
                    as1[k1] = qlo1.g();
                    qlo1.a();
                }

                as1[k1] = qlo1.g();
                d = as1;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null)
        {
            qlp1.a(1, a.booleanValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                byte abyte0[] = b[i];
                if (abyte0 != null)
                {
                    qlp1.a(2, abyte0);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                String s = c[j];
                if (s != null)
                {
                    qlp1.a(3, s);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < d.length; k++)
            {
                String s1 = d[k];
                if (s1 != null)
                {
                    qlp1.a(4, s1);
                }
            }

        }
        super.a(qlp1);
    }
}
