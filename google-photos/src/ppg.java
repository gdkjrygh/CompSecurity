// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ppg extends qlq
{

    private poo a;
    private Long b;
    private Integer c;
    private Integer d;
    private String e;
    private String f;

    public ppg()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.c(1, a);
        }
        j = i + qlp.e(2, b.longValue());
        i = j;
        if (c != null)
        {
            i = j + qlp.e(3, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.e(4, d.intValue());
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.b(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + qlp.b(6, f);
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
                if (a == null)
                {
                    a = new poo();
                }
                qlo1.a(a);
                break;

            case 16: // '\020'
                b = Long.valueOf(qlo1.j());
                break;

            case 24: // '\030'
                c = Integer.valueOf(qlo1.i());
                break;

            case 32: // ' '
                d = Integer.valueOf(qlo1.i());
                break;

            case 42: // '*'
                e = qlo1.g();
                break;

            case 50: // '2'
                f = qlo1.g();
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
        qlp1.b(2, b.longValue());
        if (c != null)
        {
            qlp1.a(3, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(4, d.intValue());
        }
        if (e != null)
        {
            qlp1.a(5, e);
        }
        if (f != null)
        {
            qlp1.a(6, f);
        }
        super.a(qlp1);
    }
}
