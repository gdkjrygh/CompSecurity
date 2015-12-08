// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pfx extends qlq
{

    private static volatile pfx b[];
    public pfk a[];

    public pfx()
    {
        a = pfk.b();
        F = null;
        G = -1;
    }

    public static pfx[] b()
    {
        if (b == null)
        {
            synchronized (qlu.a)
            {
                if (b == null)
                {
                    b = new pfx[0];
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
        int k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= a.length)
                    {
                        break;
                    }
                    pfk pfk1 = a[j];
                    k = i;
                    if (pfk1 != null)
                    {
                        k = i + qlp.c(1, pfk1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
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
                pfk apfk[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apfk = new pfk[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apfk, 0, j);
                    k = j;
                }
                for (; k < apfk.length - 1; k++)
                {
                    apfk[k] = new pfk();
                    qlo1.a(apfk[k]);
                    qlo1.a();
                }

                apfk[k] = new pfk();
                qlo1.a(apfk[k]);
                a = apfk;
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
                pfk pfk1 = a[i];
                if (pfk1 != null)
                {
                    qlp1.a(1, pfk1);
                }
            }

        }
        super.a(qlp1);
    }
}
