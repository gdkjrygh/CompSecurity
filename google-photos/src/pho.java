// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pho extends qlq
{

    private static volatile pho a[];
    private Long b;
    private php c[];

    public pho()
    {
        b = null;
        c = php.b();
        F = null;
        G = -1;
    }

    public static pho[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pho[0];
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
            i = j + qlp.e(1, b.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    php php1 = c[j];
                    int k = i;
                    if (php1 != null)
                    {
                        k = i + qlp.c(2, php1);
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

            case 8: // '\b'
                b = Long.valueOf(qlo1.j());
                break;

            case 18: // '\022'
                int k = qmb.b(qlo1, 18);
                php aphp[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aphp = new php[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aphp, 0, j);
                    k = j;
                }
                for (; k < aphp.length - 1; k++)
                {
                    aphp[k] = new php();
                    qlo1.a(aphp[k]);
                    qlo1.a();
                }

                aphp[k] = new php();
                qlo1.a(aphp[k]);
                c = aphp;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.b(1, b.longValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                php php1 = c[i];
                if (php1 != null)
                {
                    qlp1.a(2, php1);
                }
            }

        }
        super.a(qlp1);
    }
}
