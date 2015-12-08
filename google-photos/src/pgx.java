// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pgx extends qlq
{

    private static volatile pgx a[];
    private Long b;
    private Long c;
    private Boolean d;
    private Integer e;
    private String f;

    public pgx()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    public static pgx[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pgx[0];
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
            i = j + qlp.d(1, b.longValue());
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.d(2, c.longValue());
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (qlp.c(3) + 1);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.e(4, e.intValue());
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

            case 8: // '\b'
                b = Long.valueOf(qlo1.j());
                break;

            case 16: // '\020'
                c = Long.valueOf(qlo1.j());
                break;

            case 24: // '\030'
                d = Boolean.valueOf(qlo1.f());
                break;

            case 32: // ' '
                e = Integer.valueOf(qlo1.i());
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
            qlp1.a(1, b.longValue());
        }
        if (c != null)
        {
            qlp1.a(2, c.longValue());
        }
        if (d != null)
        {
            qlp1.a(3, d.booleanValue());
        }
        if (e != null)
        {
            qlp1.a(4, e.intValue());
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        super.a(qlp1);
    }
}
