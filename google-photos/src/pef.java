// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pef extends qlq
{

    private static volatile pef c[];
    public peu a[];
    public peg b;
    private pgs d;

    public pef()
    {
        d = null;
        a = peu.b();
        b = null;
        F = null;
        G = -1;
    }

    public static pef[] b()
    {
        if (c == null)
        {
            synchronized (qlu.a)
            {
                if (c == null)
                {
                    c = new pef[0];
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
        if (d != null)
        {
            i = j + qlp.c(1, d);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    peu peu1 = a[j];
                    int k = i;
                    if (peu1 != null)
                    {
                        k = i + qlp.c(2, peu1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(3, b);
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
                if (d == null)
                {
                    d = new pgs();
                }
                qlo1.a(d);
                break;

            case 18: // '\022'
                int k = qmb.b(qlo1, 18);
                peu apeu[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                apeu = new peu[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, apeu, 0, j);
                    k = j;
                }
                for (; k < apeu.length - 1; k++)
                {
                    apeu[k] = new peu();
                    qlo1.a(apeu[k]);
                    qlo1.a();
                }

                apeu[k] = new peu();
                qlo1.a(apeu[k]);
                a = apeu;
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new peg();
                }
                qlo1.a(b);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (d != null)
        {
            qlp1.a(1, d);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                peu peu1 = a[i];
                if (peu1 != null)
                {
                    qlp1.a(2, peu1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(3, b);
        }
        super.a(qlp1);
    }
}
