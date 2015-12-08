// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyd extends qlq
{

    private Long a;
    private Boolean b;
    private String c;

    public oyd()
    {
        a = null;
        b = null;
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
            i = j + qlp.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (qlp.c(2) + 1);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.b(3, c);
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
                b = Boolean.valueOf(qlo1.f());
                break;

            case 26: // '\032'
                c = qlo1.g();
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
            qlp1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        super.a(qlp1);
    }
}
