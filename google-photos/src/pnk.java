// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnk extends qlq
{

    private Long a;
    private Long b;
    private Long c;
    private String d;
    private String e;

    public pnk()
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
            i = j + qlp.e(3, c.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.b(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.b(5, e);
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

            case 24: // '\030'
                c = Long.valueOf(qlo1.j());
                break;

            case 34: // '"'
                d = qlo1.g();
                break;

            case 42: // '*'
                e = qlo1.g();
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
            qlp1.b(3, c.longValue());
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null)
        {
            qlp1.a(5, e);
        }
        super.a(qlp1);
    }
}
