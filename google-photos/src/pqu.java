// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pqu extends qlq
{

    private Boolean a;
    private pqb b;
    private pqb c;
    private pqb d;
    private pqn e;

    public pqu()
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
            a.booleanValue();
            i = j + (qlp.c(5) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.c(6, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(7, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(8, d);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.c(9, e);
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

            case 40: // '('
                a = Boolean.valueOf(qlo1.f());
                break;

            case 50: // '2'
                if (b == null)
                {
                    b = new pqb();
                }
                qlo1.a(b);
                break;

            case 58: // ':'
                if (c == null)
                {
                    c = new pqb();
                }
                qlo1.a(c);
                break;

            case 66: // 'B'
                if (d == null)
                {
                    d = new pqb();
                }
                qlo1.a(d);
                break;

            case 74: // 'J'
                if (e == null)
                {
                    e = new pqn();
                }
                qlo1.a(e);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(5, a.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(6, b);
        }
        if (c != null)
        {
            qlp1.a(7, c);
        }
        if (d != null)
        {
            qlp1.a(8, d);
        }
        if (e != null)
        {
            qlp1.a(9, e);
        }
        super.a(qlp1);
    }
}
