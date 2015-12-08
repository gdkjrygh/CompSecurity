// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pne extends qlq
{

    public pmy a[];
    public String b;
    public String c;
    private pmw d;
    private pmv e[];

    public pne()
    {
        d = null;
        a = pmy.b();
        e = pmv.b();
        b = null;
        c = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i = super.a();
        int j = i;
        if (d != null)
        {
            j = i + qlp.c(1, d);
        }
        i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    pmy pmy1 = a[j];
                    int k = i;
                    if (pmy1 != null)
                    {
                        k = i + qlp.c(2, pmy1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= e.length)
                    {
                        break;
                    }
                    pmv pmv1 = e[l];
                    j = i;
                    if (pmv1 != null)
                    {
                        j = i + qlp.c(3, pmv1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.b(4, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.b(5, c);
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
                if (d == null)
                {
                    d = new pmw();
                }
                qlo1.a(d);
                break;

            case 18: // '\022'
                int l = qmb.b(qlo1, 18);
                pmy apmy[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apmy = new pmy[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apmy, 0, j);
                    l = j;
                }
                for (; l < apmy.length - 1; l++)
                {
                    apmy[l] = new pmy();
                    qlo1.a(apmy[l]);
                    qlo1.a();
                }

                apmy[l] = new pmy();
                qlo1.a(apmy[l]);
                a = apmy;
                break;

            case 26: // '\032'
                int i1 = qmb.b(qlo1, 26);
                pmv apmv[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                apmv = new pmv[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, apmv, 0, k);
                    i1 = k;
                }
                for (; i1 < apmv.length - 1; i1++)
                {
                    apmv[i1] = new pmv();
                    qlo1.a(apmv[i1]);
                    qlo1.a();
                }

                apmv[i1] = new pmv();
                qlo1.a(apmv[i1]);
                e = apmv;
                break;

            case 34: // '"'
                b = qlo1.g();
                break;

            case 42: // '*'
                c = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (d != null)
        {
            qlp1.a(1, d);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                pmy pmy1 = a[i];
                if (pmy1 != null)
                {
                    qlp1.a(2, pmy1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                pmv pmv1 = e[j];
                if (pmv1 != null)
                {
                    qlp1.a(3, pmv1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(4, b);
        }
        if (c != null)
        {
            qlp1.a(5, c);
        }
        super.a(qlp1);
    }
}
