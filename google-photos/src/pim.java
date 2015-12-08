// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pim extends qlq
{

    private static volatile pim a[];
    private qjh b[];
    private pzc c;
    private String d;
    private String e;

    public pim()
    {
        b = qjh.b();
        c = null;
        d = null;
        e = null;
        F = null;
        G = -1;
    }

    public static pim[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pim[0];
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
                    qjh qjh1 = b[k];
                    j = i;
                    if (qjh1 != null)
                    {
                        j = i + qlp.c(1, qjh1);
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
        j = i;
        if (d != null)
        {
            j = i + qlp.b(3, d);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.b(4, e);
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
                qjh aqjh[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aqjh = new qjh[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aqjh, 0, j);
                    k = j;
                }
                for (; k < aqjh.length - 1; k++)
                {
                    aqjh[k] = new qjh();
                    qlo1.a(aqjh[k]);
                    qlo1.a();
                }

                aqjh[k] = new qjh();
                qlo1.a(aqjh[k]);
                b = aqjh;
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new pzc();
                }
                qlo1.a(c);
                break;

            case 26: // '\032'
                d = qlo1.g();
                break;

            case 34: // '"'
                e = qlo1.g();
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
                qjh qjh1 = b[i];
                if (qjh1 != null)
                {
                    qlp1.a(1, qjh1);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (e != null)
        {
            qlp1.a(4, e);
        }
        super.a(qlp1);
    }
}
