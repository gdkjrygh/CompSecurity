// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pok extends qlq
{

    private static volatile pok b[];
    public String a;
    private Integer c;
    private Integer d;
    private Integer e;

    public pok()
    {
        a = null;
        c = null;
        d = null;
        e = null;
        F = null;
        G = -1;
    }

    public static pok[] b()
    {
        if (b == null)
        {
            synchronized (qlu.a)
            {
                if (b == null)
                {
                    b = new pok[0];
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
        int j = super.a() + qlp.b(1, a);
        int i = j;
        if (c != null)
        {
            i = j + qlp.e(2, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.e(3, d.intValue());
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.e(4, e.intValue());
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
                a = qlo1.g();
                break;

            case 16: // '\020'
                c = Integer.valueOf(qlo1.i());
                break;

            case 24: // '\030'
                d = Integer.valueOf(qlo1.i());
                break;

            case 32: // ' '
                e = Integer.valueOf(qlo1.i());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a);
        if (c != null)
        {
            qlp1.a(2, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(3, d.intValue());
        }
        if (e != null)
        {
            qlp1.a(4, e.intValue());
        }
        super.a(qlp1);
    }
}
