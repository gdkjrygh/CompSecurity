// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnu extends qlq
{

    private static volatile pnu a[];
    private String b;
    private pnv c[];

    public pnu()
    {
        b = null;
        c = pnv.b();
        F = null;
        G = -1;
    }

    public static pnu[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pnu[0];
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
        int j = super.a();
        int i = j;
        if (b != null)
        {
            i = j + qlp.b(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    pnv pnv1 = c[j];
                    int k = i;
                    if (pnv1 != null)
                    {
                        k = i + qlp.c(2, pnv1);
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
                b = qlo1.g();
                break;

            case 18: // '\022'
                int k = qmb.b(qlo1, 18);
                pnv apnv[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                apnv = new pnv[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, apnv, 0, j);
                    k = j;
                }
                for (; k < apnv.length - 1; k++)
                {
                    apnv[k] = new pnv();
                    qlo1.a(apnv[k]);
                    qlo1.a();
                }

                apnv[k] = new pnv();
                qlo1.a(apnv[k]);
                c = apnv;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                pnv pnv1 = c[i];
                if (pnv1 != null)
                {
                    qlp1.a(2, pnv1);
                }
            }

        }
        super.a(qlp1);
    }
}
