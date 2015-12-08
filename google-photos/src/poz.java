// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class poz extends qlq
{

    private static volatile poz a[];
    private String b;
    private String c;
    private Boolean d;
    private Boolean e;
    private Boolean f;

    public poz()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    public static poz[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new poz[0];
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
            d.booleanValue();
            i = j + (qlp.c(3) + 1);
        }
        j = i;
        if (e != null)
        {
            e.booleanValue();
            j = i + (qlp.c(4) + 1);
        }
        i = j;
        if (f != null)
        {
            f.booleanValue();
            i = j + (qlp.c(5) + 1);
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

            case 24: // '\030'
                d = Boolean.valueOf(qlo1.f());
                break;

            case 32: // ' '
                e = Boolean.valueOf(qlo1.f());
                break;

            case 40: // '('
                f = Boolean.valueOf(qlo1.f());
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
            qlp1.a(3, d.booleanValue());
        }
        if (e != null)
        {
            qlp1.a(4, e.booleanValue());
        }
        if (f != null)
        {
            qlp1.a(5, f.booleanValue());
        }
        super.a(qlp1);
    }
}
