// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class peu extends qlq
{

    private static volatile peu c[];
    public peq a[];
    public peh b[];
    private pgs d;
    private String e;

    public peu()
    {
        d = null;
        e = null;
        a = peq.b();
        b = peh.b();
        F = null;
        G = -1;
    }

    public static peu[] b()
    {
        if (c == null)
        {
            synchronized (qlu.a)
            {
                if (c == null)
                {
                    c = new peu[0];
                }
            }
        }
        return c;
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
        if (d != null)
        {
            i = j + qlp.c(1, d);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.b(2, e);
        }
        i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (int k = 0; k < a.length;)
                {
                    peq peq1 = a[k];
                    int i1 = i;
                    if (peq1 != null)
                    {
                        i1 = i + qlp.c(3, peq1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (b != null)
        {
            j1 = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    peh peh1 = b[l];
                    j1 = i;
                    if (peh1 != null)
                    {
                        j1 = i + qlp.c(4, peh1);
                    }
                    l++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
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
                    d = new pgs();
                }
                qlo1.a(d);
                break;

            case 18: // '\022'
                e = qlo1.g();
                break;

            case 26: // '\032'
                int l = qmb.b(qlo1, 26);
                peq apeq[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apeq = new peq[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apeq, 0, j);
                    l = j;
                }
                for (; l < apeq.length - 1; l++)
                {
                    apeq[l] = new peq();
                    qlo1.a(apeq[l]);
                    qlo1.a();
                }

                apeq[l] = new peq();
                qlo1.a(apeq[l]);
                a = apeq;
                break;

            case 34: // '"'
                int i1 = qmb.b(qlo1, 34);
                peh apeh[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                apeh = new peh[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, apeh, 0, k);
                    i1 = k;
                }
                for (; i1 < apeh.length - 1; i1++)
                {
                    apeh[i1] = new peh();
                    qlo1.a(apeh[i1]);
                    qlo1.a();
                }

                apeh[i1] = new peh();
                qlo1.a(apeh[i1]);
                b = apeh;
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
        if (e != null)
        {
            qlp1.a(2, e);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                peq peq1 = a[i];
                if (peq1 != null)
                {
                    qlp1.a(3, peq1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                peh peh1 = b[j];
                if (peh1 != null)
                {
                    qlp1.a(4, peh1);
                }
            }

        }
        super.a(qlp1);
    }
}
