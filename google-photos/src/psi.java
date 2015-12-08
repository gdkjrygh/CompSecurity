// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class psi extends qlq
{

    private psf a;
    private String b;
    private String c;
    private prk d[];

    public psi()
    {
        a = null;
        b = null;
        c = null;
        d = prk.b();
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
            j = i + qlp.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    prk prk1 = d[j];
                    int k = i;
                    if (prk1 != null)
                    {
                        k = i + qlp.c(4, prk1);
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
                    a = new psf();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                b = qlo1.g();
                break;

            case 26: // '\032'
                c = qlo1.g();
                break;

            case 34: // '"'
                int k = qmb.b(qlo1, 34);
                prk aprk[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                aprk = new prk[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, aprk, 0, j);
                    k = j;
                }
                for (; k < aprk.length - 1; k++)
                {
                    aprk[k] = new prk();
                    qlo1.a(aprk[k]);
                    qlo1.a();
                }

                aprk[k] = new prk();
                qlo1.a(aprk[k]);
                d = aprk;
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
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                prk prk1 = d[i];
                if (prk1 != null)
                {
                    qlp1.a(4, prk1);
                }
            }

        }
        super.a(qlp1);
    }
}
