// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;

public final class mlk extends mlj
    implements TimeInterpolator
{

    public mlk(float f, float f1, float f2, float f3)
    {
        b = 0.0F;
        a = 0.0F;
        c = f;
        d = f1;
        e = f2;
        this.f = f3;
        h = 1.0F;
        g = 1.0F;
    }

    public final float getInterpolation(float f)
    {
        float f1;
        float f2;
        f1 = (f - super.a) / (super.g - super.a);
        if (f1 <= 0.0F)
        {
            f2 = 0.0F;
            break MISSING_BLOCK_LABEL_25;
        }
        if (f1 >= 1.0F)
        {
            f2 = 1.0F;
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
        f5 = 0.0F;
        f3 = 1.0F;
        f2 = 0.0F;
_L6:
        if (i >= 8) goto _L2; else goto _L1
_L1:
        f7 = a(f1);
        f9 = (a(f1 + 1E-06F) - f7) / 1E-06F;
        if (Math.abs(f7 - f) < 1E-06F) goto _L4; else goto _L3
_L3:
        f5 = f7;
        if (Math.abs(f9) < 1E-06F) goto _L2; else goto _L5
_L5:
        if (f7 < f)
        {
            f2 = f1;
        } else
        {
            f3 = f1;
        }
        f5 = (f7 - f) / f9;
        i++;
        f1 -= f5;
        f5 = f7;
          goto _L6
_L2:
        float f10 = f3;
        int j = 0;
        float f8 = f5;
        f3 = f2;
        f5 = f10;
        do
        {
            f2 = f1;
            if (Math.abs(f8 - f) <= 1E-06F)
            {
                continue; /* Loop/switch isn't completed */
            }
            f2 = f1;
            if (j >= 8)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (f8 < f)
            {
                f2 = (f1 + f5) / 2.0F;
                f3 = f1;
                f1 = f2;
            } else
            {
                f2 = (f1 + f3) / 2.0F;
                f5 = f1;
                f1 = f2;
            }
            f8 = a(f1);
            j++;
        } while (true);
_L8:
        float f3;
        float f5;
        float f7;
        float f9;
        int i;
        if (f2 == 0.0F)
        {
            return super.b;
        }
        if (f2 == 1.0F)
        {
            return super.h;
        } else
        {
            f = super.b;
            f += (super.d - f) * f2;
            f1 = super.d;
            f1 += (super.f - f1) * f2;
            float f4 = super.f;
            float f6 = super.h;
            f += (f1 - f) * f2;
            return f + ((f1 + ((f4 + (f6 - f4) * f2) - f1) * f2) - f) * f2;
        }
_L4:
        f2 = f1;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
