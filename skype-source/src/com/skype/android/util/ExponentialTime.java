// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.util.Random;

public class ExponentialTime
{

    private final int a;
    private final int b;
    private final float c;
    private final float d;
    private final Random e;
    private int f;

    public ExponentialTime()
    {
        this((byte)0);
    }

    private ExponentialTime(byte byte0)
    {
        a = 500;
        b = 5000;
        c = 2.718282F;
        d = 0.1196266F;
        f = 500;
        e = new Random(System.nanoTime());
    }

    public final int a()
    {
        int i = f;
        float f2 = (float)f * c;
        float f1 = f2;
        if (f2 > (float)b)
        {
            f1 = b;
        }
        if ((double)d < 1.0000000000000001E-05D)
        {
            f = (int)f1;
        } else
        {
            f = (int)Math.round(e.nextGaussian() * (double)f1 * (double)d + (double)f1);
        }
        if (f < a)
        {
            f = a;
        }
        if (f > b)
        {
            f = b;
        }
        return i;
    }

    public final void b()
    {
        e.setSeed(System.nanoTime());
        f = a;
    }
}
