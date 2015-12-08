// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pon extends qlq
{

    private Integer a;
    private Integer b;

    public pon()
    {
        a = null;
        b = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        a.intValue();
        int j = qlp.c(1);
        b.intValue();
        return i + (j + 4) + (qlp.c(2) + 4);
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

            case 13: // '\r'
                a = Integer.valueOf(qlo1.k());
                break;

            case 21: // '\025'
                b = Integer.valueOf(qlo1.k());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.b(1, a.intValue());
        qlp1.b(2, b.intValue());
        super.a(qlp1);
    }
}
