// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cwd extends qlw
{

    public float a;
    public float b;

    public cwd()
    {
        a = 0.0F;
        b = 0.0F;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (Float.floatToIntBits(a) != Float.floatToIntBits(0.0F))
        {
            float f = a;
            i = j + (qlp.c(1) + 4);
        }
        j = i;
        if (Float.floatToIntBits(b) != Float.floatToIntBits(0.0F))
        {
            float f1 = b;
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
                if (qmb.a(qlo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 13: // '\r'
                a = Float.intBitsToFloat(qlo1.k());
                break;

            case 21: // '\025'
                b = Float.intBitsToFloat(qlo1.k());
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        if (Float.floatToIntBits(a) != Float.floatToIntBits(0.0F))
        {
            qlp1.a(1, a);
        }
        if (Float.floatToIntBits(b) != Float.floatToIntBits(0.0F))
        {
            qlp1.a(2, b);
        }
        super.a(qlp1);
    }
}
