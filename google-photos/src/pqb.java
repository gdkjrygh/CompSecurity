// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pqb extends qlq
{

    private static volatile pqb f[];
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public String e;
    private String g;
    private String h;
    private pqc i;

    public pqb()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        g = null;
        h = null;
        i = null;
        F = null;
        G = -1;
    }

    public static pqb[] b()
    {
        if (f == null)
        {
            synchronized (qlu.a)
            {
                if (f == null)
                {
                    f = new pqb[0];
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
        int k = qlp.b(1, a);
        int l = qlp.b(2, b);
        c.booleanValue();
        int i1 = qlp.c(3);
        d.booleanValue();
        k = j + k + l + (i1 + 1) + (qlp.c(4) + 1);
        j = k;
        if (e != null)
        {
            j = k + qlp.b(5, e);
        }
        k = j;
        if (g != null)
        {
            k = j + qlp.b(6, g);
        }
        j = k;
        if (h != null)
        {
            j = k + qlp.b(7, h);
        }
        k = j;
        if (i != null)
        {
            k = j + qlp.c(8, i);
        }
        return k;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int j = qlo1.a();
            switch (j)
            {
            default:
                if (super.a(qlo1, j))
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
                c = Boolean.valueOf(qlo1.f());
                break;

            case 32: // ' '
                d = Boolean.valueOf(qlo1.f());
                break;

            case 42: // '*'
                e = qlo1.g();
                break;

            case 50: // '2'
                g = qlo1.g();
                break;

            case 58: // ':'
                h = qlo1.g();
                break;

            case 66: // 'B'
                if (i == null)
                {
                    i = new pqc();
                }
                qlo1.a(i);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a);
        qlp1.a(2, b);
        qlp1.a(3, c.booleanValue());
        qlp1.a(4, d.booleanValue());
        if (e != null)
        {
            qlp1.a(5, e);
        }
        if (g != null)
        {
            qlp1.a(6, g);
        }
        if (h != null)
        {
            qlp1.a(7, h);
        }
        if (i != null)
        {
            qlp1.a(8, i);
        }
        super.a(qlp1);
    }
}
