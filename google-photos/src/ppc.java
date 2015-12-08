// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ppc extends qlq
{

    private static volatile ppc a[];
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private Integer j;
    private ppd k;

    public ppc()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        F = null;
        G = -1;
    }

    public static ppc[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new ppc[0];
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
        int i1 = super.a() + qlp.b(1, c);
        int l = i1;
        if (d != null)
        {
            l = i1 + qlp.b(2, d);
        }
        i1 = l;
        if (e != null)
        {
            i1 = l + qlp.b(3, e);
        }
        l = i1;
        if (f != null)
        {
            l = i1 + qlp.b(4, f);
        }
        i1 = l;
        if (g != null)
        {
            i1 = l + qlp.b(5, g);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + qlp.b(6, i);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + qlp.e(7, j.intValue());
        }
        l = i1;
        if (h != null)
        {
            l = i1 + qlp.b(8, h);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + qlp.b(9, b);
        }
        l = i1;
        if (k != null)
        {
            l = i1 + qlp.c(10, k);
        }
        return l;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int l = qlo1.a();
            switch (l)
            {
            default:
                if (super.a(qlo1, l))
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

            case 26: // '\032'
                e = qlo1.g();
                break;

            case 34: // '"'
                f = qlo1.g();
                break;

            case 42: // '*'
                g = qlo1.g();
                break;

            case 50: // '2'
                i = qlo1.g();
                break;

            case 56: // '8'
                j = Integer.valueOf(qlo1.i());
                break;

            case 66: // 'B'
                h = qlo1.g();
                break;

            case 74: // 'J'
                b = qlo1.g();
                break;

            case 82: // 'R'
                if (k == null)
                {
                    k = new ppd();
                }
                qlo1.a(k);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, c);
        if (d != null)
        {
            qlp1.a(2, d);
        }
        if (e != null)
        {
            qlp1.a(3, e);
        }
        if (f != null)
        {
            qlp1.a(4, f);
        }
        if (g != null)
        {
            qlp1.a(5, g);
        }
        if (i != null)
        {
            qlp1.a(6, i);
        }
        if (j != null)
        {
            qlp1.a(7, j.intValue());
        }
        if (h != null)
        {
            qlp1.a(8, h);
        }
        if (b != null)
        {
            qlp1.a(9, b);
        }
        if (k != null)
        {
            qlp1.a(10, k);
        }
        super.a(qlp1);
    }
}
