// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class psb extends qlq
{

    private Integer a;
    private Integer b;

    public psb()
    {
        a = null;
        b = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        return super.a() + qlp.e(1, a.intValue()) + qlp.e(2, b.intValue());
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
                a = Integer.valueOf(qlo1.i());
                break;

            case 16: // '\020'
                b = Integer.valueOf(qlo1.i());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a.intValue());
        qlp1.a(2, b.intValue());
        super.a(qlp1);
    }
}
