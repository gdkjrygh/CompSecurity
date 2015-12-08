// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvr extends qlw
{

    private static volatile cvr f[];
    public String a;
    public String b;
    public long c;
    public int d;
    public boolean e;

    public cvr()
    {
        a = "";
        b = "";
        c = 0L;
        d = 0;
        e = false;
        G = -1;
    }

    public static cvr[] b()
    {
        if (f == null)
        {
            synchronized (qlu.a)
            {
                if (f == null)
                {
                    f = new cvr[0];
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
        if (!b.equals(""))
        {
            j = i + qlp.b(2, b);
        }
        i = j;
        if (c != 0L)
        {
            i = j + qlp.d(3, c);
        }
        j = i;
        if (d != 0)
        {
            j = i + qlp.e(4, d);
        }
        i = j;
        if (e)
        {
            boolean flag = e;
            i = j + (qlp.c(5) + 1);
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
                b = qlo1.g();
                break;

            case 24: // '\030'
                c = qlo1.j();
                break;

            case 32: // ' '
                d = qlo1.i();
                break;

            case 40: // '('
                e = qlo1.f();
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
        if (!b.equals(""))
        {
            qlp1.a(2, b);
        }
        if (c != 0L)
        {
            qlp1.a(3, c);
        }
        if (d != 0)
        {
            qlp1.a(4, d);
        }
        if (e)
        {
            qlp1.a(5, e);
        }
        super.a(qlp1);
    }
}
