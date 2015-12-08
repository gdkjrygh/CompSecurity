// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyv extends qlq
{

    public oze a;
    public oyp b[];
    private ozg c[];
    private String d[];

    public oyv()
    {
        a = null;
        b = oyp.b();
        c = ozg.b();
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
            i = j + qlp.c(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    oyp oyp1 = b[j];
                    int k = i;
                    if (oyp1 != null)
                    {
                        k = i + qlp.c(2, oyp1);
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
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (j = 0; j < c.length;)
                {
                    ozg ozg1 = c[j];
                    int l = i;
                    if (ozg1 != null)
                    {
                        l = i + qlp.c(3, ozg1);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int i1 = 0;
                int j1 = 0;
                for (j = ((flag) ? 1 : 0); j < d.length;)
                {
                    String s = d[j];
                    int l1 = i1;
                    int k1 = j1;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        l1 = i1 + qlp.a(s);
                    }
                    j++;
                    i1 = l1;
                    j1 = k1;
                }

                j = i + i1 + j1 * 1;
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
                if (a == null)
                {
                    a = new oze();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                int i1 = qmb.b(qlo1, 18);
                oyp aoyp[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aoyp = new oyp[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aoyp, 0, j);
                    i1 = j;
                }
                for (; i1 < aoyp.length - 1; i1++)
                {
                    aoyp[i1] = new oyp();
                    qlo1.a(aoyp[i1]);
                    qlo1.a();
                }

                aoyp[i1] = new oyp();
                qlo1.a(aoyp[i1]);
                b = aoyp;
                break;

            case 26: // '\032'
                int j1 = qmb.b(qlo1, 26);
                ozg aozg[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aozg = new ozg[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, aozg, 0, k);
                    j1 = k;
                }
                for (; j1 < aozg.length - 1; j1++)
                {
                    aozg[j1] = new ozg();
                    qlo1.a(aozg[j1]);
                    qlo1.a();
                }

                aozg[j1] = new ozg();
                qlo1.a(aozg[j1]);
                c = aozg;
                break;

            case 34: // '"'
                int k1 = qmb.b(qlo1, 34);
                String as[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                as = new String[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, as, 0, l);
                    k1 = l;
                }
                for (; k1 < as.length - 1; k1++)
                {
                    as[k1] = qlo1.g();
                    qlo1.a();
                }

                as[k1] = qlo1.g();
                d = as;
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
                oyp oyp1 = b[i];
                if (oyp1 != null)
                {
                    qlp1.a(2, oyp1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                ozg ozg1 = c[j];
                if (ozg1 != null)
                {
                    qlp1.a(3, ozg1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < d.length; k++)
            {
                String s = d[k];
                if (s != null)
                {
                    qlp1.a(4, s);
                }
            }

        }
        super.a(qlp1);
    }
}
