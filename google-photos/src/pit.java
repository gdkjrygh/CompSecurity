// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pit extends qlq
{

    private static volatile pit a[];
    private String b;
    private Boolean c;
    private String d;

    public pit()
    {
        b = null;
        c = null;
        d = null;
        F = null;
        G = -1;
    }

    public static pit[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pit[0];
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
            i = j + qlp.b(1, b);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (qlp.c(2) + 1);
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
                b = qlo1.g();
                break;

            case 16: // '\020'
                c = Boolean.valueOf(qlo1.f());
                break;

            case 26: // '\032'
                d = qlo1.g();
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
            qlp1.a(2, c.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        super.a(qlp1);
    }
}
