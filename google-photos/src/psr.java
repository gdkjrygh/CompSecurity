// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class psr extends qlq
{

    private static volatile psr a[];
    private pqv b;
    private Long c;
    private Boolean d;
    private Boolean e;

    public psr()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        F = null;
        G = -1;
    }

    public static psr[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new psr[0];
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
            i = j + qlp.c(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.e(2, c.longValue());
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (qlp.c(3) + 1);
        }
        j = i;
        if (e != null)
        {
            e.booleanValue();
            j = i + (qlp.c(4) + 1);
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
                if (b == null)
                {
                    b = new pqv();
                }
                qlo1.a(b);
                break;

            case 16: // '\020'
                c = Long.valueOf(qlo1.j());
                break;

            case 24: // '\030'
                d = Boolean.valueOf(qlo1.f());
                break;

            case 32: // ' '
                e = Boolean.valueOf(qlo1.f());
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
        if (c != null)
        {
            qlp1.b(2, c.longValue());
        }
        if (d != null)
        {
            qlp1.a(3, d.booleanValue());
        }
        if (e != null)
        {
            qlp1.a(4, e.booleanValue());
        }
        super.a(qlp1);
    }
}
