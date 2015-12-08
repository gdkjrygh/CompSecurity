// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ppf extends qlq
{

    private static volatile ppf a[];
    private Integer b;
    private Integer c;
    private Integer d;
    private String e;

    public ppf()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        F = null;
        G = -1;
    }

    public static ppf[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new ppf[0];
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
        int j = super.a() + qlp.e(1, b.intValue()) + qlp.e(2, c.intValue()) + qlp.e(3, d.intValue());
        int i = j;
        if (e != null)
        {
            i = j + qlp.b(4, e);
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
                b = Integer.valueOf(qlo1.i());
                break;

            case 16: // '\020'
                c = Integer.valueOf(qlo1.i());
                break;

            case 24: // '\030'
                d = Integer.valueOf(qlo1.i());
                break;

            case 34: // '"'
                e = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, b.intValue());
        qlp1.a(2, c.intValue());
        qlp1.a(3, d.intValue());
        if (e != null)
        {
            qlp1.a(4, e);
        }
        super.a(qlp1);
    }
}
