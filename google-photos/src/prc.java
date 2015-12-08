// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class prc extends qlq
{

    private static volatile prc a[];
    private prd b;
    private String c;
    private String d;
    private ppz e;
    private String f;
    private String g;

    public prc()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        F = null;
        G = -1;
    }

    public static prc[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new prc[0];
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
            i = j + qlp.c(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.b(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.c(4, e);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.b(5, f);
        }
        j = i;
        if (g != null)
        {
            j = i + qlp.b(6, g);
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
                if (b == null)
                {
                    b = new prd();
                }
                qlo1.a(b);
                break;

            case 18: // '\022'
                c = qlo1.g();
                break;

            case 26: // '\032'
                d = qlo1.g();
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new ppz();
                }
                qlo1.a(e);
                break;

            case 42: // '*'
                f = qlo1.g();
                break;

            case 50: // '2'
                g = qlo1.g();
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
            qlp1.a(2, c);
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (e != null)
        {
            qlp1.a(4, e);
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        if (g != null)
        {
            qlp1.a(6, g);
        }
        super.a(qlp1);
    }
}
