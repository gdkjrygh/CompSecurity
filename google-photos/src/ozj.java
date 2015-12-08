// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ozj extends qlq
{

    public oyh a;
    public String b;
    private String c;
    private ozi d;

    public ozj()
    {
        a = null;
        c = null;
        b = null;
        d = null;
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
        if (c != null)
        {
            j = i + qlp.b(2, c);
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.b(3, b);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(4, d);
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
                    a = new oyh();
                }
                qlo1.a(a);
                break;

            case 18: // '\022'
                c = qlo1.g();
                break;

            case 26: // '\032'
                b = qlo1.g();
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new ozi();
                }
                qlo1.a(d);
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
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (b != null)
        {
            qlp1.a(3, b);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }
}
