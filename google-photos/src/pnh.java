// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnh extends qlq
{

    public pne a;
    public Boolean b;
    public Boolean c;
    private String d;
    private Boolean e;
    private pne f;
    private String g;
    private String h;

    public pnh()
    {
        a = null;
        b = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        c = null;
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
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (qlp.c(2) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(3, d);
        }
        j = i;
        if (e != null)
        {
            e.booleanValue();
            j = i + (qlp.c(4) + 1);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.c(5, f);
        }
        j = i;
        if (g != null)
        {
            j = i + qlp.b(6, g);
        }
        i = j;
        if (h != null)
        {
            i = j + qlp.b(7, h);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (qlp.c(8) + 1);
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
                    a = new pne();
                }
                qlo1.a(a);
                break;

            case 16: // '\020'
                b = Boolean.valueOf(qlo1.f());
                break;

            case 26: // '\032'
                d = qlo1.g();
                break;

            case 32: // ' '
                e = Boolean.valueOf(qlo1.f());
                break;

            case 42: // '*'
                if (f == null)
                {
                    f = new pne();
                }
                qlo1.a(f);
                break;

            case 50: // '2'
                g = qlo1.g();
                break;

            case 58: // ':'
                h = qlo1.g();
                break;

            case 64: // '@'
                c = Boolean.valueOf(qlo1.f());
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
        if (b != null)
        {
            qlp1.a(2, b.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (e != null)
        {
            qlp1.a(4, e.booleanValue());
        }
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
        if (c != null)
        {
            qlp1.a(8, c.booleanValue());
        }
        super.a(qlp1);
    }
}
