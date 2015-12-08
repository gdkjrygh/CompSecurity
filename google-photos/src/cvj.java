// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvj extends qlw
{

    private static volatile cvj f[];
    public String a;
    public String b;
    public String c;
    public long d;
    public String e;

    public cvj()
    {
        a = "";
        b = "";
        c = "";
        d = 0L;
        e = "";
        G = -1;
    }

    public static cvj[] b()
    {
        if (f == null)
        {
            synchronized (qlu.a)
            {
                if (f == null)
                {
                    f = new cvj[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (!a.equals(""))
        {
            i = j + qlp.b(1, a);
        }
        j = i;
        if (!c.equals(""))
        {
            j = i + qlp.b(2, c);
        }
        i = j;
        if (d != 0L)
        {
            i = j + qlp.e(3, d);
        }
        j = i;
        if (!e.equals(""))
        {
            j = i + qlp.b(4, e);
        }
        i = j;
        if (!b.equals(""))
        {
            i = j + qlp.b(5, b);
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
                if (qmb.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = qlo1.g();
                break;

            case 18: // '\022'
                c = qlo1.g();
                break;

            case 24: // '\030'
                d = qlo1.j();
                break;

            case 34: // '"'
                e = qlo1.g();
                break;

            case 42: // '*'
                b = qlo1.g();
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (!a.equals(""))
        {
            qlp1.a(1, a);
        }
        if (!c.equals(""))
        {
            qlp1.a(2, c);
        }
        if (d != 0L)
        {
            qlp1.b(3, d);
        }
        if (!e.equals(""))
        {
            qlp1.a(4, e);
        }
        if (!b.equals(""))
        {
            qlp1.a(5, b);
        }
        super.a(qlp1);
    }
}
