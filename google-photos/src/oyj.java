// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyj extends qlq
{

    private static volatile oyj b[];
    public Long a;
    private String c;
    private String d;
    private Long e;

    public oyj()
    {
        c = null;
        d = null;
        a = null;
        e = null;
        F = null;
        G = -1;
    }

    public static oyj[] b()
    {
        if (b == null)
        {
            synchronized (qlu.a)
            {
                if (b == null)
                {
                    b = new oyj[0];
                }
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (c != null)
        {
            i = j + qlp.b(1, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.b(2, d);
        }
        i = j;
        if (a != null)
        {
            i = j + qlp.d(3, a.longValue());
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.d(4, e.longValue());
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

            case 10: // '\n'
                c = qlo1.g();
                break;

            case 18: // '\022'
                d = qlo1.g();
                break;

            case 24: // '\030'
                a = Long.valueOf(qlo1.j());
                break;

            case 32: // ' '
                e = Long.valueOf(qlo1.j());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (c != null)
        {
            qlp1.a(1, c);
        }
        if (d != null)
        {
            qlp1.a(2, d);
        }
        if (a != null)
        {
            qlp1.a(3, a.longValue());
        }
        if (e != null)
        {
            qlp1.a(4, e.longValue());
        }
        super.a(qlp1);
    }
}
