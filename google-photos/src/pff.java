// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pff extends qlq
{

    private static volatile pff d[];
    public Integer a;
    public byte b[];
    public Long c;

    public pff()
    {
        a = null;
        b = null;
        c = null;
        F = null;
        G = -1;
    }

    public static pff[] b()
    {
        if (d == null)
        {
            synchronized (qlu.a)
            {
                if (d == null)
                {
                    d = new pff[0];
                }
            }
        }
        return d;
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
            i = j + qlp.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.e(3, c.longValue());
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
                a = Integer.valueOf(qlo1.i());
                break;

            case 18: // '\022'
                b = qlo1.h();
                break;

            case 24: // '\030'
                c = Long.valueOf(qlo1.j());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a.intValue());
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.b(3, c.longValue());
        }
        super.a(qlp1);
    }
}
