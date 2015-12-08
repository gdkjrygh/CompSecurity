// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pey extends qlq
{

    private static volatile pey h[];
    public pgk a;
    public pgg b;
    public pfp c[];
    public pgf d;
    public pgc e;
    public pez f[];
    public pfe g[];

    public pey()
    {
        a = null;
        b = null;
        c = pfp.b();
        d = null;
        e = null;
        f = pez.b();
        g = pfe.b();
        F = null;
        G = -1;
    }

    public static pey[] b()
    {
        if (h == null)
        {
            synchronized (qlu.a)
            {
                if (h == null)
                {
                    h = new pey[0];
                }
            }
        }
        return h;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        boolean flag = false;
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i + qlp.c(1, a);
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
                for (j = 0; j < c.length;)
                {
                    pfp pfp1 = c[j];
                    int i1 = i;
                    if (pfp1 != null)
                    {
                        i1 = i + qlp.c(6, pfp1);
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
            i = j + qlp.c(8, d);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.c(9, e);
        }
        i = j;
        if (f != null)
        {
            i = j;
            if (f.length > 0)
            {
                i = j;
                for (int k = 0; k < f.length;)
                {
                    pez pez1 = f[k];
                    int j1 = i;
                    if (pez1 != null)
                    {
                        j1 = i + qlp.c(10, pez1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (g != null)
        {
            k1 = i;
            if (g.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= g.length)
                    {
                        break;
                    }
                    pfe pfe1 = g[l];
                    k1 = i;
                    if (pfe1 != null)
                    {
                        k1 = i + qlp.c(11, pfe1);
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
                if (a == null)
                {
                    a = new pgk();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new pgg();
                }
                qlo1.a(b);
                break;

            case 50: // '2'
                int i1 = qmb.b(qlo1, 50);
                pfp apfp[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                apfp = new pfp[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, apfp, 0, j);
                    i1 = j;
                }
                for (; i1 < apfp.length - 1; i1++)
                {
                    apfp[i1] = new pfp();
                    qlo1.a(apfp[i1]);
                    qlo1.a();
                }

                apfp[i1] = new pfp();
                qlo1.a(apfp[i1]);
                c = apfp;
                break;

            case 66: // 'B'
                if (d == null)
                {
                    d = new pgf();
                }
                qlo1.a(d);
                break;

            case 74: // 'J'
                if (e == null)
                {
                    e = new pgc();
                }
                qlo1.a(e);
                break;

            case 82: // 'R'
                int j1 = qmb.b(qlo1, 82);
                pez apez[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                apez = new pez[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(f, 0, apez, 0, k);
                    j1 = k;
                }
                for (; j1 < apez.length - 1; j1++)
                {
                    apez[j1] = new pez();
                    qlo1.a(apez[j1]);
                    qlo1.a();
                }

                apez[j1] = new pez();
                qlo1.a(apez[j1]);
                f = apez;
                break;

            case 90: // 'Z'
                int k1 = qmb.b(qlo1, 90);
                pfe apfe[];
                int l;
                if (g == null)
                {
                    l = 0;
                } else
                {
                    l = g.length;
                }
                apfe = new pfe[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(g, 0, apfe, 0, l);
                    k1 = l;
                }
                for (; k1 < apfe.length - 1; k1++)
                {
                    apfe[k1] = new pfe();
                    qlo1.a(apfe[k1]);
                    qlo1.a();
                }

                apfe[k1] = new pfe();
                qlo1.a(apfe[k1]);
                g = apfe;
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
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                pfp pfp1 = c[i];
                if (pfp1 != null)
                {
                    qlp1.a(6, pfp1);
                }
            }

        }
        if (d != null)
        {
            qlp1.a(8, d);
        }
        if (e != null)
        {
            qlp1.a(9, e);
        }
        if (f != null && f.length > 0)
        {
            for (int j = 0; j < f.length; j++)
            {
                pez pez1 = f[j];
                if (pez1 != null)
                {
                    qlp1.a(10, pez1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < g.length; k++)
            {
                pfe pfe1 = g[k];
                if (pfe1 != null)
                {
                    qlp1.a(11, pfe1);
                }
            }

        }
        super.a(qlp1);
    }
}
