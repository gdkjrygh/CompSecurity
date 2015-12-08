// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class plh extends qlq
{

    public String a;
    public pos b;
    private Integer c;

    public plh()
    {
        a = null;
        c = null;
        b = null;
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
        if (c != null)
        {
            j = i + qlp.e(2, c.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(3, b);
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

            case 10: // '\n'
                a = qlo1.g();
                break;

            case 16: // '\020'
                c = Integer.valueOf(qlo1.i());
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new pos();
                }
                qlo1.a(b);
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
            qlp1.a(2, c.intValue());
        }
        if (b != null)
        {
            qlp1.a(3, b);
        }
        super.a(qlp1);
    }
}
