// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyf extends qlq
{

    private static volatile oyf a[];
    private String b;
    private String c;
    private oyd d;
    private ozo e;
    private Long f;
    private oyg g;

    public oyf()
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

    public static oyf[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new oyf[0];
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
            j = i + qlp.b(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.c(4, e);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.d(5, f.longValue());
        }
        j = i;
        if (g != null)
        {
            j = i + qlp.c(7, g);
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
                b = qlo1.g();
                break;

            case 18: // '\022'
                c = qlo1.g();
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new oyd();
                }
                qlo1.a(d);
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new ozo();
                }
                qlo1.a(e);
                break;

            case 40: // '('
                f = Long.valueOf(qlo1.j());
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new oyg();
                }
                qlo1.a(g);
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
            qlp1.a(5, f.longValue());
        }
        if (g != null)
        {
            qlp1.a(7, g);
        }
        super.a(qlp1);
    }
}
