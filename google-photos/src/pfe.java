// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pfe extends qlq
{

    private static volatile pfe c[];
    public Long a;
    public pff b[];

    public pfe()
    {
        a = null;
        b = pff.b();
        F = null;
        G = -1;
    }

    public static pfe[] b()
    {
        if (c == null)
        {
            synchronized (qlu.a)
            {
                if (c == null)
                {
                    c = new pfe[0];
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
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    pff pff1 = b[j];
                    int k = i;
                    if (pff1 != null)
                    {
                        k = i + qlp.c(2, pff1);
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
                a = Long.valueOf(qlo1.j());
                break;

            case 18: // '\022'
                int k = qmb.b(qlo1, 18);
                pff apff[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                apff = new pff[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, apff, 0, j);
                    k = j;
                }
                for (; k < apff.length - 1; k++)
                {
                    apff[k] = new pff();
                    qlo1.a(apff[k]);
                    qlo1.a();
                }

                apff[k] = new pff();
                qlo1.a(apff[k]);
                b = apff;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.b(1, a.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                pff pff1 = b[i];
                if (pff1 != null)
                {
                    qlp1.a(2, pff1);
                }
            }

        }
        super.a(qlp1);
    }
}
