// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.animator;

import android.view.animation.Interpolator;

public class BezierEasingInterpolator
    implements Interpolator
{

    private final float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private String h;

    public BezierEasingInterpolator(float f1, float f2, float f3, long l)
    {
        h = (new StringBuilder()).append(getClass().getSimpleName()).append(' ').append('[').append(f1).append(',').append(0.0F).append(',').append(f2).append(',').append(f3).append(']').toString();
        a = 1.0F / (0.2F * (float)l);
        b = 3F * f1;
        c = (f2 - f1) * 3F - b;
        d = 1.0F - b - c;
        e = 0.0F;
        f = (f3 - 0.0F) * 3F - e;
        g = 1.0F - e - f;
    }

    private float a(float f1)
    {
        return ((d * f1 + c) * f1 + b) * f1;
    }

    public float getInterpolation(float f1)
    {
        float f2;
        int i;
        i = 0;
        f2 = f1;
_L6:
        if (i >= 8) goto _L2; else goto _L1
_L1:
        float f3;
        float f4;
        f4 = a(f2) - f1;
        f3 = f2;
        if (Math.abs(f4) < a) goto _L4; else goto _L3
_L3:
        f3 = (3F * d * f2 + 2.0F * c) * f2 + b;
        if ((double)Math.abs(f3) < 9.9999999999999995E-07D) goto _L2; else goto _L5
_L5:
        f3 = f4 / f3;
        i++;
        f2 -= f3;
          goto _L6
_L2:
        if (f1 >= 0.0F) goto _L8; else goto _L7
_L7:
        f3 = 0.0F;
_L4:
        return ((g * f3 + f) * f3 + e) * f3;
_L8:
        if (f1 <= 1.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        f3 = 1.0F;
        if (true) goto _L4; else goto _L9
_L12:
        f3 = f2;
        float f5;
        if (f4 >= f5) goto _L4; else goto _L10
_L10:
        float f6;
        f6 = a(f2);
        f3 = f2;
        if (Math.abs(f6 - f1) < a) goto _L4; else goto _L11
_L11:
        if (f1 <= f6)
        {
            f5 = f2;
            f2 = f4;
        }
        f4 = f2;
        f2 = (f5 - f2) * 0.5F + f2;
          goto _L12
_L9:
        f2 = f1;
        f4 = 0.0F;
        f5 = 1.0F;
          goto _L12
    }

    public String toString()
    {
        return h;
    }
}
