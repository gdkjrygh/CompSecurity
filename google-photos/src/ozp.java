// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ozp extends qlq
{

    private static volatile ozp a[];
    private Boolean b;
    private Integer c;
    private Double d;
    private String e;
    private ozr f;
    private ozo g;

    public ozp()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        F = null;
        G = -1;
    }

    public static ozp[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new ozp[0];
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
            b.booleanValue();
            i = j + (qlp.c(1) + 1);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.e(2, c.intValue());
        }
        i = j;
        if (d != null)
        {
            d.doubleValue();
            i = j + (qlp.c(3) + 8);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.b(4, e);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.c(5, f);
        }
        j = i;
        if (g != null)
        {
            j = i + qlp.c(6, g);
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
                b = Boolean.valueOf(qlo1.f());
                break;

            case 16: // '\020'
                c = Integer.valueOf(qlo1.i());
                break;

            case 25: // '\031'
                d = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 34: // '"'
                e = qlo1.g();
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new ozr();
                }
                qlo1.a(f);
                break;

            case 50: // '2'
                if (g == null)
                {
                    g = new ozo();
                }
                qlo1.a(g);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(2, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(3, d.doubleValue());
        }
        if (e != null)
        {
            qlp1.a(4, e);
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        if (g != null)
        {
            qlp1.a(6, g);
        }
        super.a(qlp1);
    }
}
