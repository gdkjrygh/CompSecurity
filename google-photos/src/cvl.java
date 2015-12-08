// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvl extends qlw
{

    private static volatile cvl e[];
    public String a;
    public String b;
    public String c;
    public boolean d;

    public cvl()
    {
        a = "";
        b = "";
        c = "";
        d = false;
        G = -1;
    }

    public static cvl[] b()
    {
        if (e == null)
        {
            synchronized (qlu.a)
            {
                if (e == null)
                {
                    e = new cvl[0];
                }
            }
        }
        return e;
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
        if (!c.equals(""))
        {
            i = j + qlp.b(3, c);
        }
        j = i;
        if (d)
        {
            boolean flag = d;
            j = i + (qlp.c(4) + 1);
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

            case 26: // '\032'
                c = qlo1.g();
                break;

            case 32: // ' '
                d = qlo1.f();
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
        if (!c.equals(""))
        {
            qlp1.a(3, c);
        }
        if (d)
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }
}
