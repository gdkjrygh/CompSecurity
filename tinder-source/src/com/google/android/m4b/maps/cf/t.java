// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;

import android.opengl.Matrix;

public final class t
{

    private float a[];

    public t()
    {
        a = new float[16];
        Matrix.setIdentityM(a, 0);
    }

    public final String toString()
    {
        float af[] = a;
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < 16; i++)
        {
            float f = af[i];
            stringbuffer.append((new StringBuilder(17)).append(f).append("  ").toString());
            if (i % 4 == 3)
            {
                stringbuffer.append("\n");
            }
        }

        return stringbuffer.toString();
    }
}
