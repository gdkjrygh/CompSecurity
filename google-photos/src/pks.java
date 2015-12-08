// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pks extends qlq
{

    public pki a[];
    public pjg b;
    public pym c;
    private pjg d[];

    public pks()
    {
        a = pki.b();
        b = null;
        d = pjg.b();
        c = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    pki pki1 = a[j];
                    int k = i;
                    if (pki1 != null)
                    {
                        k = i + qlp.c(1, pki1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(2, b);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    pjg pjg1 = d[l];
                    j = i;
                    if (pjg1 != null)
                    {
                        j = i + qlp.c(3, pjg1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(4, c);
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
                int l = qmb.b(qlo1, 10);
                pki apki[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apki = new pki[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apki, 0, j);
                    l = j;
                }
                for (; l < apki.length - 1; l++)
                {
                    apki[l] = new pki();
                    qlo1.a(apki[l]);
                    qlo1.a();
                }

                apki[l] = new pki();
                qlo1.a(apki[l]);
                a = apki;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new pjg();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                int i1 = qmb.b(qlo1, 26);
                pjg apjg[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                apjg = new pjg[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, apjg, 0, k);
                    i1 = k;
                }
                for (; i1 < apjg.length - 1; i1++)
                {
                    apjg[i1] = new pjg();
                    qlo1.a(apjg[i1]);
                    qlo1.a();
                }

                apjg[i1] = new pjg();
                qlo1.a(apjg[i1]);
                d = apjg;
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new pym();
                }
                qlo1.a(c);
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
                pki pki1 = a[i];
                if (pki1 != null)
                {
                    qlp1.a(1, pki1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                pjg pjg1 = d[j];
                if (pjg1 != null)
                {
                    qlp1.a(3, pjg1);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        super.a(qlp1);
    }
}
