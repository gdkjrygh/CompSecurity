// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pxq extends qlq
{

    public pxr a;
    public Long b;
    public pxw c;
    public pyc d[];

    public pxq()
    {
        a = null;
        b = null;
        c = null;
        d = pyc.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.c(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    pyc pyc1 = d[j];
                    int k = i;
                    if (pyc1 != null)
                    {
                        k = i + qlp.c(4, pyc1);
                    }
                    j++;
                    i = k;
                }

                j = i;
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
                    a = new pxr();
                }
                qlo1.a(a);
                break;

            case 16: // '\020'
                b = Long.valueOf(qlo1.j());
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new pxw();
                }
                qlo1.a(c);
                break;

            case 34: // '"'
                int k = qmb.b(qlo1, 34);
                pyc apyc[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                apyc = new pyc[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, apyc, 0, j);
                    k = j;
                }
                for (; k < apyc.length - 1; k++)
                {
                    apyc[k] = new pyc();
                    qlo1.a(apyc[k]);
                    qlo1.a();
                }

                apyc[k] = new pyc();
                qlo1.a(apyc[k]);
                d = apyc;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.b(2, b.longValue());
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                pyc pyc1 = d[i];
                if (pyc1 != null)
                {
                    qlp1.a(4, pyc1);
                }
            }

        }
        super.a(qlp1);
    }
}
