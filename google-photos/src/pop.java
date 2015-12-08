// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pop extends qlq
{

    private Double a;
    private Double b;
    private Double c;
    private Double d;

    public pop()
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
        int i = super.a();
        a.doubleValue();
        int j = qlp.c(1);
        b.doubleValue();
        int k = qlp.c(2);
        c.doubleValue();
        int l = qlp.c(3);
        d.doubleValue();
        return i + (j + 8) + (k + 8) + (l + 8) + (qlp.c(4) + 8);
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

            case 9: // '\t'
                a = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 17: // '\021'
                b = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 25: // '\031'
                c = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;

            case 33: // '!'
                d = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a.doubleValue());
        qlp1.a(2, b.doubleValue());
        qlp1.a(3, c.doubleValue());
        qlp1.a(4, d.doubleValue());
        super.a(qlp1);
    }
}
