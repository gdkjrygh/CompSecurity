// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pjg extends qlq
{

    private static volatile pjg b[];
    public pkr a;
    private pjy c[];
    private pjw d;

    public pjg()
    {
        c = pjy.b();
        a = null;
        d = null;
        F = null;
        G = -1;
    }

    public static pjg[] b()
    {
        if (b == null)
        {
            synchronized (qlu.a)
            {
                if (b == null)
                {
                    b = new pjg[0];
                }
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= c.length)
                    {
                        break;
                    }
                    pjy pjy1 = c[k];
                    j = i;
                    if (pjy1 != null)
                    {
                        j = i + qlp.c(1, pjy1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (a != null)
        {
            i = j + qlp.c(2, a);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(3, d);
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
                int k = qmb.b(qlo1, 10);
                pjy apjy[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                apjy = new pjy[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, apjy, 0, j);
                    k = j;
                }
                for (; k < apjy.length - 1; k++)
                {
                    apjy[k] = new pjy();
                    qlo1.a(apjy[k]);
                    qlo1.a();
                }

                apjy[k] = new pjy();
                qlo1.a(apjy[k]);
                c = apjy;
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new pkr();
                }
                qlo1.a(a);
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new pjw();
                }
                qlo1.a(d);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                pjy pjy1 = c[i];
                if (pjy1 != null)
                {
                    qlp1.a(1, pjy1);
                }
            }

        }
        if (a != null)
        {
            qlp1.a(2, a);
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        super.a(qlp1);
    }
}
