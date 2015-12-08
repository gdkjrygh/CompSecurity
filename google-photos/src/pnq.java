// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnq extends qlq
{

    private static volatile pnq a[];
    private Double b;
    private Double c;
    private String d;
    private String e;
    private String f;

    public pnq()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    public static pnq[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pnq[0];
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
            b.doubleValue();
            i = j + (qlp.c(1) + 8);
        }
        j = i;
        if (c != null)
        {
            c.doubleValue();
            j = i + (qlp.c(2) + 8);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.b(4, e);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.b(5, f);
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

            case 9: // '\t'
                b = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 17: // '\021'
                c = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 26: // '\032'
                d = qlo1.g();
                break;

            case 34: // '"'
                e = qlo1.g();
                break;

            case 42: // '*'
                f = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b.doubleValue());
        }
        if (c != null)
        {
            qlp1.a(2, c.doubleValue());
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (e != null)
        {
            qlp1.a(4, e);
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        super.a(qlp1);
    }
}
