// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pfz extends qlq
{

    public Float a;
    public Float b;

    public pfz()
    {
        a = null;
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
            a.floatValue();
            i = j + (qlp.c(1) + 4);
        }
        j = i;
        if (b != null)
        {
            b.floatValue();
            j = i + (qlp.c(2) + 4);
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

            case 13: // '\r'
                a = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;

            case 21: // '\025'
                b = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a.floatValue());
        }
        if (b != null)
        {
            qlp1.a(2, b.floatValue());
        }
        super.a(qlp1);
    }
}
