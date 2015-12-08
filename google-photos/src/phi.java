// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class phi extends qlq
{

    private static volatile phi a[];
    private Long b;
    private Boolean c;
    private Boolean d;

    public phi()
    {
        b = null;
        c = null;
        d = null;
        F = null;
        G = -1;
    }

    public static phi[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new phi[0];
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
            b.longValue();
            i = j + (qlp.c(1) + 8);
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
            d.booleanValue();
            i = j + (qlp.c(3) + 1);
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
                b = Long.valueOf(qlo1.l());
                break;

            case 16: // '\020'
                c = Boolean.valueOf(qlo1.f());
                break;

            case 24: // '\030'
                d = Boolean.valueOf(qlo1.f());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.c(1, b.longValue());
        }
        if (c != null)
        {
            qlp1.a(2, c.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(3, d.booleanValue());
        }
        super.a(qlp1);
    }
}
