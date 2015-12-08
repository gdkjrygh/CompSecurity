// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pqy extends qlq
{

    private static volatile pqy a[];
    private pqx b[];
    private pra c;

    public pqy()
    {
        b = pqx.b();
        c = null;
        F = null;
        G = -1;
    }

    public static pqy[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pqy[0];
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
        int i = super.a();
        int j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    pqx pqx1 = b[k];
                    j = i;
                    if (pqx1 != null)
                    {
                        j = i + qlp.c(1, pqx1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(2, c);
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
                pqx apqx[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                apqx = new pqx[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, apqx, 0, j);
                    k = j;
                }
                for (; k < apqx.length - 1; k++)
                {
                    apqx[k] = new pqx();
                    qlo1.a(apqx[k]);
                    qlo1.a();
                }

                apqx[k] = new pqx();
                qlo1.a(apqx[k]);
                b = apqx;
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new pra();
                }
                qlo1.a(c);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                pqx pqx1 = b[i];
                if (pqx1 != null)
                {
                    qlp1.a(1, pqx1);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        super.a(qlp1);
    }
}
