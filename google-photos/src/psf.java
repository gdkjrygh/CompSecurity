// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class psf extends qlq
{

    private static volatile psf a[];
    private String b;
    private String c;
    private Boolean d;
    private Boolean e;
    private String f;
    private String g;
    private String h;
    private pqc i;

    public psf()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        F = null;
        G = -1;
    }

    public static psf[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new psf[0];
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
        int k = qlp.b(1, b);
        int l = qlp.b(2, c);
        d.booleanValue();
        int i1 = qlp.c(3);
        e.booleanValue();
        k = j + k + l + (i1 + 1) + (qlp.c(4) + 1);
        j = k;
        if (f != null)
        {
            j = k + qlp.b(5, f);
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
                b = qlo1.g();
                break;

            case 18: // '\022'
                c = qlo1.g();
                break;

            case 24: // '\030'
                d = Boolean.valueOf(qlo1.f());
                break;

            case 32: // ' '
                e = Boolean.valueOf(qlo1.f());
                break;

            case 42: // '*'
                f = qlo1.g();
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
        qlp1.a(1, b);
        qlp1.a(2, c);
        qlp1.a(3, d.booleanValue());
        qlp1.a(4, e.booleanValue());
        if (f != null)
        {
            qlp1.a(5, f);
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
