// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pmy extends qlq
{

    private static volatile pmy c[];
    public pnd a;
    public pmv b;
    private pnc d;
    private pmx e;
    private pnb f;

    public pmy()
    {
        a = null;
        d = null;
        e = null;
        b = null;
        f = null;
        F = null;
        G = -1;
    }

    public static pmy[] b()
    {
        if (c == null)
        {
            synchronized (qlu.a)
            {
                if (c == null)
                {
                    c = new pmy[0];
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
            i = j + qlp.c(1, a);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(2, d);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.c(3, e);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.c(4, b);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.c(5, f);
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
                if (a == null)
                {
                    a = new pnd();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                if (d == null)
                {
                    d = new pnc();
                }
                qlo1.a(d);
                break;

            case 26: // '\032'
                if (e == null)
                {
                    e = new pmx();
                }
                qlo1.a(e);
                break;

            case 34: // '"'
                if (b == null)
                {
                    b = new pmv();
                }
                qlo1.a(b);
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new pnb();
                }
                qlo1.a(f);
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
        if (d != null)
        {
            qlp1.a(2, d);
        }
        if (e != null)
        {
            qlp1.a(3, e);
        }
        if (b != null)
        {
            qlp1.a(4, b);
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        super.a(qlp1);
    }
}
