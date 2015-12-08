// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pmw extends qlq
{

    private pmv a[];
    private String b;
    private String c;
    private pmx d;

    public pmw()
    {
        a = pmv.b();
        b = null;
        c = null;
        d = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    pmv pmv1 = a[k];
                    j = i;
                    if (pmv1 != null)
                    {
                        j = i + qlp.c(1, pmv1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.b(3, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(4, d);
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
                int k = qmb.b(qlo1, 10);
                pmv apmv[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apmv = new pmv[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apmv, 0, j);
                    k = j;
                }
                for (; k < apmv.length - 1; k++)
                {
                    apmv[k] = new pmv();
                    qlo1.a(apmv[k]);
                    qlo1.a();
                }

                apmv[k] = new pmv();
                qlo1.a(apmv[k]);
                a = apmv;
                break;

            case 18: // '\022'
                b = qlo1.g();
                break;

            case 26: // '\032'
                c = qlo1.g();
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new pmx();
                }
                qlo1.a(d);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                pmv pmv1 = a[i];
                if (pmv1 != null)
                {
                    qlp1.a(1, pmv1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }
}
