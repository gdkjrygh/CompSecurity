// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pxp extends qlq
{

    private static volatile pxp c[];
    public Long a;
    public Long b;
    private Boolean d;

    public pxp()
    {
        a = null;
        b = null;
        d = null;
        F = null;
        G = -1;
    }

    public static pxp[] b()
    {
        if (c == null)
        {
            synchronized (qlu.a)
            {
                if (c == null)
                {
                    c = new pxp[0];
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
            i = j + qlp.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.e(2, b.longValue());
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

            case 8: // '\b'
                a = Long.valueOf(qlo1.j());
                break;

            case 16: // '\020'
                b = Long.valueOf(qlo1.j());
                break;

            case 24: // '\030'
                d = Boolean.valueOf(qlo1.f());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.b(1, a.longValue());
        }
        if (b != null)
        {
            qlp1.b(2, b.longValue());
        }
        if (d != null)
        {
            qlp1.a(3, d.booleanValue());
        }
        super.a(qlp1);
    }
}
