// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ppm extends qlq
{

    private Long a;
    private Long b;
    private String c;
    private Integer d;
    private ppn e;

    public ppm()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.b(3, c);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.c(4, e);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.e(5, d.intValue());
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

            case 8: // '\b'
                a = Long.valueOf(qlo1.j());
                break;

            case 16: // '\020'
                b = Long.valueOf(qlo1.j());
                break;

            case 26: // '\032'
                c = qlo1.g();
                break;

            case 34: // '"'
                if (e == null)
                {
                    e = new ppn();
                }
                qlo1.a(e);
                break;

            case 40: // '('
                d = Integer.valueOf(qlo1.i());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.b(1, a.longValue());
        }
        if (b != null)
        {
            qlp1.b(2, b.longValue());
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (e != null)
        {
            qlp1.a(4, e);
        }
        if (d != null)
        {
            qlp1.a(5, d.intValue());
        }
        super.a(qlp1);
    }
}
