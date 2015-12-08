// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pgd extends qlq
{

    private static volatile pgd b[];
    public pge a[];

    public pgd()
    {
        a = pge.b();
        F = null;
        G = -1;
    }

    public static pgd[] b()
    {
        if (b == null)
        {
            synchronized (qlu.a)
            {
                if (b == null)
                {
                    b = new pgd[0];
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
                    pge pge1 = a[j];
                    k = i;
                    if (pge1 != null)
                    {
                        k = i + qlp.c(1, pge1);
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
                pge apge[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apge = new pge[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apge, 0, j);
                    k = j;
                }
                for (; k < apge.length - 1; k++)
                {
                    apge[k] = new pge();
                    qlo1.a(apge[k]);
                    qlo1.a();
                }

                apge[k] = new pge();
                qlo1.a(apge[k]);
                a = apge;
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
                pge pge1 = a[i];
                if (pge1 != null)
                {
                    qlp1.a(1, pge1);
                }
            }

        }
        super.a(qlp1);
    }
}
