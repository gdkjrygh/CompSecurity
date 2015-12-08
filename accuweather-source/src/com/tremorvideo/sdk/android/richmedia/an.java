// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;


public class an
{

    public static float a(float f)
    {
        return 1.0F - (float)Math.cos(((double)f * 3.1415926535897931D) / 2D);
    }

    public static float a(int i, int j, float f)
    {
        if ((i & 2) != 2) goto _L2; else goto _L1
_L1:
        if ((j & 1) != 1) goto _L4; else goto _L3
_L3:
        float f1 = c(f);
_L6:
        return f1;
_L4:
        return b(f);
_L2:
        f1 = f;
        if ((j & 1) == 1)
        {
            return a(f);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static int a(float f, float f1, float f2)
    {
        return Math.round((1.0F - f2) * f + f1 * f2);
    }

    public static int a(float f, float f1, int i, int j, float f2)
    {
        return a(f, f1, a(i, j, f2));
    }

    public static int a(String s)
    {
        int j = 5381;
        for (int i = 0; i < s.length(); i++)
        {
            j = j + (j << 5) + s.charAt(i);
        }

        return j;
    }

    public static float b(float f)
    {
        return (float)(-Math.cos((double)f * 1.5707963267948966D + 1.5707963267948966D));
    }

    public static float b(float f, float f1, float f2)
    {
        return (1.0F - f2) * f + f1 * f2;
    }

    public static float b(float f, float f1, int i, int j, float f2)
    {
        return b(f, f1, a(i, j, f2));
    }

    public static float c(float f)
    {
        return (float)(1.0D - Math.cos((double)f * 3.1415926535897931D)) / 2.0F;
    }
}
