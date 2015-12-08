// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ppu extends qlq
{

    private static volatile ppu a[];
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public ppu()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    public static ppu[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new ppu[0];
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
        int j = super.a() + qlp.b(1, b) + qlp.b(2, c);
        int i = j;
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

            case 10: // '\n'
                b = qlo1.g();
                break;

            case 18: // '\022'
                c = qlo1.g();
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
        qlp1.a(1, b);
        qlp1.a(2, c);
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
