// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class php extends qlq
{

    private static volatile php a[];
    private phq b[];

    public php()
    {
        b = phq.b();
        F = null;
        G = -1;
    }

    public static php[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new php[0];
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
        int k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= b.length)
                    {
                        break;
                    }
                    phq phq1 = b[j];
                    k = i;
                    if (phq1 != null)
                    {
                        k = i + qlp.c(1, phq1);
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
                phq aphq[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aphq = new phq[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aphq, 0, j);
                    k = j;
                }
                for (; k < aphq.length - 1; k++)
                {
                    aphq[k] = new phq();
                    qlo1.a(aphq[k]);
                    qlo1.a();
                }

                aphq[k] = new phq();
                qlo1.a(aphq[k]);
                b = aphq;
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
                phq phq1 = b[i];
                if (phq1 != null)
                {
                    qlp1.a(1, phq1);
                }
            }

        }
        super.a(qlp1);
    }
}
