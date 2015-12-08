// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pha extends qlq
{

    private static volatile pha a[];
    private Long b;
    private String c;

    public pha()
    {
        b = null;
        c = null;
        F = null;
        G = -1;
    }

    public static pha[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pha[0];
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
            j = i + qlp.b(2, c);
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

            case 9: // '\t'
                b = Long.valueOf(qlo1.l());
                break;

            case 18: // '\022'
                c = qlo1.g();
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
            qlp1.a(2, c);
        }
        super.a(qlp1);
    }
}
