// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class cvv extends qlw
{

    public float a;
    public byte b[];

    public cvv()
    {
        a = 0.0F;
        b = qmb.h;
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
        if (!Arrays.equals(b, qmb.h))
        {
            j = i + qlp.b(2, b);
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

            case 18: // '\022'
                b = qlo1.h();
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
        if (!Arrays.equals(b, qmb.h))
        {
            qlp1.a(2, b);
        }
        super.a(qlp1);
    }
}
