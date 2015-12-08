// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.c;

import android.graphics.Matrix;

public class f
{

    public f()
    {
    }

    public static void a(Matrix matrix, float af[])
    {
        float af1[] = new float[9];
        float[] _tmp = af1;
        af1[0] = 0.0F;
        af1[1] = 0.0F;
        af1[2] = 0.0F;
        af1[3] = 0.0F;
        af1[4] = 0.0F;
        af1[5] = 0.0F;
        af1[6] = 0.0F;
        af1[7] = 0.0F;
        af1[8] = 0.0F;
        matrix.getValues(af1);
        af[0] = af[0] * af1[0] + af1[2];
        af[1] = af[1] * af1[4] + af1[5];
        if (af.length == 4)
        {
            af[2] = af[2] * af1[0] + af1[2];
            float f1 = af[3];
            float f2 = af1[4];
            af[3] = af1[5] + f1 * f2;
        }
    }

    public static float[] a(Matrix matrix)
    {
        float af[] = new float[9];
        matrix.getValues(af);
        return (new float[] {
            af[0], af[4]
        });
    }
}
