// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;


public final class i
{

    public static final float a(int ai[])
    {
        int j = 0;
        long l1 = 0L;
        int l = ai.length;
        int k = 0;
        for (; j < l; j++)
        {
            int i1 = ai[j];
            k += i1;
            l1 += (long)i1 * (long)i1;
        }

        float f = (float)k / (float)ai.length;
        return (float)Math.sqrt(((float)l1 - f * (float)k) / (float)ai.length / (float)(k * k));
    }

    public static final String a(float f)
    {
        int k = (int)(100F * f);
        int j = k / 100;
        k = Math.abs(k);
        return (new StringBuilder(23)).append(j).append(".").append(k % 100).toString();
    }

    public static float b(float f)
    {
        float f1 = f - (float)((int)(f / 360F) * 360);
        if (f1 > 180F)
        {
            f = f1 - 360F;
        } else
        {
            f = f1;
            if (f1 <= -180F)
            {
                return f1 + 360F;
            }
        }
        return f;
    }

    public static final int b(int ai[])
    {
        boolean flag = false;
        int i1 = ai.length;
        int j = 0;
        int l = 0;
        for (; j < i1; j++)
        {
            l += ai[j];
        }

        i1 = l / 2;
        l = 0;
        for (int k = ((flag) ? 1 : 0); k < ai.length; k++)
        {
            l += ai[k];
            if (l >= i1)
            {
                return k;
            }
        }

        return -1;
    }

    public static float c(float f)
    {
        return b((float)Math.toDegrees(f));
    }

    public static final float c(int ai[])
    {
        int k = 0;
        int l = 0;
        int j = 0;
        for (; k < ai.length; k++)
        {
            l += ai[k] * k;
            j += ai[k];
        }

        return (float)l / (float)j;
    }
}
