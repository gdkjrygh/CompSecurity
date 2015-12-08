// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pqw extends qlq
{

    private static volatile pqw a[];
    private pqz b;
    private pra c;
    private pqx d[];
    private pqy e[];

    public pqw()
    {
        b = null;
        c = null;
        d = pqx.b();
        e = pqy.b();
        F = null;
        G = -1;
    }

    public static pqw[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pqw[0];
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
            i = j + qlp.c(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(2, c);
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
                    pqx pqx1 = d[k];
                    int i1 = i;
                    if (pqx1 != null)
                    {
                        i1 = i + qlp.c(3, pqx1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (e != null)
        {
            j1 = i;
            if (e.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= e.length)
                    {
                        break;
                    }
                    pqy pqy1 = e[l];
                    j1 = i;
                    if (pqy1 != null)
                    {
                        j1 = i + qlp.c(4, pqy1);
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
                if (b == null)
                {
                    b = new pqz();
                }
                qlo1.a(b);
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new pra();
                }
                qlo1.a(c);
                break;

            case 26: // '\032'
                int l = qmb.b(qlo1, 26);
                pqx apqx[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                apqx = new pqx[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, apqx, 0, j);
                    l = j;
                }
                for (; l < apqx.length - 1; l++)
                {
                    apqx[l] = new pqx();
                    qlo1.a(apqx[l]);
                    qlo1.a();
                }

                apqx[l] = new pqx();
                qlo1.a(apqx[l]);
                d = apqx;
                break;

            case 34: // '"'
                int i1 = qmb.b(qlo1, 34);
                pqy apqy[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                apqy = new pqy[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, apqy, 0, k);
                    i1 = k;
                }
                for (; i1 < apqy.length - 1; i1++)
                {
                    apqy[i1] = new pqy();
                    qlo1.a(apqy[i1]);
                    qlo1.a();
                }

                apqy[i1] = new pqy();
                qlo1.a(apqy[i1]);
                e = apqy;
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
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                pqx pqx1 = d[i];
                if (pqx1 != null)
                {
                    qlp1.a(3, pqx1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                pqy pqy1 = e[j];
                if (pqy1 != null)
                {
                    qlp1.a(4, pqy1);
                }
            }

        }
        super.a(qlp1);
    }
}
