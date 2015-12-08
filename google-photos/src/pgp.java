// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pgp extends qlq
{

    public String a;
    public String b;
    public pgq c;
    private Long d;

    public pgp()
    {
        a = null;
        b = null;
        d = null;
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
            i = j + qlp.b(1, a);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.e(2, d.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(3, c);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.b(4, b);
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
                a = qlo1.g();
                break;

            case 16: // '\020'
                d = Long.valueOf(qlo1.j());
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new pgq();
                }
                qlo1.a(c);
                break;

            case 34: // '"'
                b = qlo1.g();
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
        if (d != null)
        {
            qlp1.b(2, d.longValue());
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (b != null)
        {
            qlp1.a(4, b);
        }
        super.a(qlp1);
    }
}
