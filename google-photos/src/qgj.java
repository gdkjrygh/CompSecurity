// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qgj extends qlq
{

    public qdz a;
    public qor b;
    public String c;
    public String d;

    public qgj()
    {
        a = null;
        b = null;
        c = null;
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
        if (b != null)
        {
            j = i + qlp.c(4, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.b(5, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.b(6, d);
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
                    a = new qdz();
                }
                qlo1.a(a);
                break;

            case 34: // '"'
                if (b == null)
                {
                    b = new qor();
                }
                qlo1.a(b);
                break;

            case 42: // '*'
                c = qlo1.g();
                break;

            case 50: // '2'
                d = qlo1.g();
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
            qlp1.a(4, b);
        }
        if (c != null)
        {
            qlp1.a(5, c);
        }
        if (d != null)
        {
            qlp1.a(6, d);
        }
        super.a(qlp1);
    }
}
