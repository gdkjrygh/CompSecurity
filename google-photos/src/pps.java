// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pps extends qlq
{

    private static volatile pps a[];
    private Double b;
    private String c;
    private ppu d[];

    public pps()
    {
        b = null;
        c = null;
        d = ppu.b();
        F = null;
        G = -1;
    }

    public static pps[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pps[0];
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
        b.doubleValue();
        int j = i + (qlp.c(1) + 8);
        i = j;
        if (c != null)
        {
            i = j + qlp.b(2, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    ppu ppu1 = d[j];
                    int k = i;
                    if (ppu1 != null)
                    {
                        k = i + qlp.c(3, ppu1);
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

            case 9: // '\t'
                b = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 18: // '\022'
                c = qlo1.g();
                break;

            case 26: // '\032'
                int k = qmb.b(qlo1, 26);
                ppu appu[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                appu = new ppu[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, appu, 0, j);
                    k = j;
                }
                for (; k < appu.length - 1; k++)
                {
                    appu[k] = new ppu();
                    qlo1.a(appu[k]);
                    qlo1.a();
                }

                appu[k] = new ppu();
                qlo1.a(appu[k]);
                d = appu;
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, b.doubleValue());
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                ppu ppu1 = d[i];
                if (ppu1 != null)
                {
                    qlp1.a(3, ppu1);
                }
            }

        }
        super.a(qlp1);
    }
}
