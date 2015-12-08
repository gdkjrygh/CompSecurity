// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvp extends qlw
{

    public cvr a[];
    public cvo b[];
    public int c;
    public cvq d[];
    public String e;
    private int f;

    public cvp()
    {
        f = 0;
        a = cvr.b();
        b = cvo.b();
        c = 0;
        d = cvq.b();
        e = "";
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a() + qlp.e(1, f);
        int i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (j = 0; j < a.length;)
                {
                    cvr cvr1 = a[j];
                    int k = i;
                    if (cvr1 != null)
                    {
                        k = i + qlp.c(2, cvr1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    cvo cvo1 = b[j];
                    int l = i;
                    if (cvo1 != null)
                    {
                        l = i + qlp.c(3, cvo1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (c != 0)
        {
            i = j + qlp.e(4, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i1 >= d.length)
                    {
                        break;
                    }
                    cvq cvq1 = d[i1];
                    j = i;
                    if (cvq1 != null)
                    {
                        j = i + qlp.c(5, cvq1);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (!e.equals(""))
        {
            i = j + qlp.b(6, e);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
        return b(qlo1);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        qlp1.a(1, f);
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                cvr cvr1 = a[i];
                if (cvr1 != null)
                {
                    qlp1.a(2, cvr1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                cvo cvo1 = b[j];
                if (cvo1 != null)
                {
                    qlp1.a(3, cvo1);
                }
            }

        }
        if (c != 0)
        {
            qlp1.a(4, c);
        }
        if (d != null && d.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < d.length; k++)
            {
                cvq cvq1 = d[k];
                if (cvq1 != null)
                {
                    qlp1.a(5, cvq1);
                }
            }

        }
        if (!e.equals(""))
        {
            qlp1.a(6, e);
        }
        super.a(qlp1);
    }

    public final cvp b(qlo qlo1)
    {
        do
        {
            int i = qlo1.a();
            switch (i)
            {
            default:
                if (qmb.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                f = qlo1.i();
                break;

            case 18: // '\022'
                int i1 = qmb.b(qlo1, 18);
                cvr acvr[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                acvr = new cvr[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, acvr, 0, j);
                    i1 = j;
                }
                for (; i1 < acvr.length - 1; i1++)
                {
                    acvr[i1] = new cvr();
                    qlo1.a(acvr[i1]);
                    qlo1.a();
                }

                acvr[i1] = new cvr();
                qlo1.a(acvr[i1]);
                a = acvr;
                break;

            case 26: // '\032'
                int j1 = qmb.b(qlo1, 26);
                cvo acvo[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                acvo = new cvo[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, acvo, 0, k);
                    j1 = k;
                }
                for (; j1 < acvo.length - 1; j1++)
                {
                    acvo[j1] = new cvo();
                    qlo1.a(acvo[j1]);
                    qlo1.a();
                }

                acvo[j1] = new cvo();
                qlo1.a(acvo[j1]);
                b = acvo;
                break;

            case 32: // ' '
                c = qlo1.i();
                break;

            case 42: // '*'
                int k1 = qmb.b(qlo1, 42);
                cvq acvq[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                acvq = new cvq[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, acvq, 0, l);
                    k1 = l;
                }
                for (; k1 < acvq.length - 1; k1++)
                {
                    acvq[k1] = new cvq();
                    qlo1.a(acvq[k1]);
                    qlo1.a();
                }

                acvq[k1] = new cvq();
                qlo1.a(acvq[k1]);
                d = acvq;
                break;

            case 50: // '2'
                e = qlo1.g();
                break;
            }
        } while (true);
    }
}
