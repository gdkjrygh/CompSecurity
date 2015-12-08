// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pdy extends qlq
{

    public pec a;
    public pgp b;
    public ped c;
    public plj d;
    public Boolean e;
    public Boolean f;

    public pdy()
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
        if (b != null)
        {
            i = j + qlp.c(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(3, c);
        }
        i = j;
        if (a != null)
        {
            i = j + qlp.c(8, a);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(9, d);
        }
        i = j;
        if (e != null)
        {
            e.booleanValue();
            i = j + (qlp.c(10) + 1);
        }
        j = i;
        if (f != null)
        {
            f.booleanValue();
            j = i + (qlp.c(12) + 1);
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
                if (b == null)
                {
                    b = new pgp();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new ped();
                }
                qlo1.a(c);
                break;

            case 66: // 'B'
                if (a == null)
                {
                    a = new pec();
                }
                qlo1.a(a);
                break;

            case 74: // 'J'
                if (d == null)
                {
                    d = new plj();
                }
                qlo1.a(d);
                break;

            case 80: // 'P'
                e = Boolean.valueOf(qlo1.f());
                break;

            case 96: // '`'
                f = Boolean.valueOf(qlo1.f());
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
            qlp1.a(3, c);
        }
        if (a != null)
        {
            qlp1.a(8, a);
        }
        if (d != null)
        {
            qlp1.a(9, d);
        }
        if (e != null)
        {
            qlp1.a(10, e.booleanValue());
        }
        if (f != null)
        {
            qlp1.a(12, f.booleanValue());
        }
        super.a(qlp1);
    }
}
