// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pod extends qlq
{

    private static volatile pod a[];
    private String b;
    private pot c[];
    private ppc d[];
    private ppp e[];

    public pod()
    {
        b = null;
        c = pot.b();
        d = ppc.b();
        e = ppp.b();
        F = null;
        G = -1;
    }

    public static pod[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pod[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (b != null)
        {
            i = j + qlp.b(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    pot pot1 = c[j];
                    int i1 = i;
                    if (pot1 != null)
                    {
                        i1 = i + qlp.c(2, pot1);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = j;
                for (int k = 0; k < d.length;)
                {
                    ppc ppc1 = d[k];
                    int j1 = i;
                    if (ppc1 != null)
                    {
                        j1 = i + qlp.c(3, ppc1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (e != null)
        {
            k1 = i;
            if (e.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= e.length)
                    {
                        break;
                    }
                    ppp ppp1 = e[l];
                    k1 = i;
                    if (ppp1 != null)
                    {
                        k1 = i + qlp.c(4, ppp1);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
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
                b = qlo1.g();
                break;

            case 18: // '\022'
                int i1 = qmb.b(qlo1, 18);
                pot apot[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                apot = new pot[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, apot, 0, j);
                    i1 = j;
                }
                for (; i1 < apot.length - 1; i1++)
                {
                    apot[i1] = new pot();
                    qlo1.a(apot[i1]);
                    qlo1.a();
                }

                apot[i1] = new pot();
                qlo1.a(apot[i1]);
                c = apot;
                break;

            case 26: // '\032'
                int j1 = qmb.b(qlo1, 26);
                ppc appc[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                appc = new ppc[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, appc, 0, k);
                    j1 = k;
                }
                for (; j1 < appc.length - 1; j1++)
                {
                    appc[j1] = new ppc();
                    qlo1.a(appc[j1]);
                    qlo1.a();
                }

                appc[j1] = new ppc();
                qlo1.a(appc[j1]);
                d = appc;
                break;

            case 34: // '"'
                int k1 = qmb.b(qlo1, 34);
                ppp appp[];
                int l;
                if (e == null)
                {
                    l = 0;
                } else
                {
                    l = e.length;
                }
                appp = new ppp[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(e, 0, appp, 0, l);
                    k1 = l;
                }
                for (; k1 < appp.length - 1; k1++)
                {
                    appp[k1] = new ppp();
                    qlo1.a(appp[k1]);
                    qlo1.a();
                }

                appp[k1] = new ppp();
                qlo1.a(appp[k1]);
                e = appp;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (b != null)
        {
            qlp1.a(1, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                pot pot1 = c[i];
                if (pot1 != null)
                {
                    qlp1.a(2, pot1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = 0; j < d.length; j++)
            {
                ppc ppc1 = d[j];
                if (ppc1 != null)
                {
                    qlp1.a(3, ppc1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < e.length; k++)
            {
                ppp ppp1 = e[k];
                if (ppp1 != null)
                {
                    qlp1.a(4, ppp1);
                }
            }

        }
        super.a(qlp1);
    }
}
