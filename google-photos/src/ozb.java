// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ozb extends qlq
{

    private static volatile ozb c[];
    public String a;
    public String b;
    private String d;

    public ozb()
    {
        a = null;
        b = null;
        d = null;
        F = null;
        G = -1;
    }

    public static ozb[] b()
    {
        if (c == null)
        {
            synchronized (qlu.a)
            {
                if (c == null)
                {
                    c = new ozb[0];
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
            i = j + qlp.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.b(2, b);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(3, d);
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

            case 18: // '\022'
                b = qlo1.g();
                break;

            case 26: // '\032'
                d = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        super.a(qlp1);
    }
}
