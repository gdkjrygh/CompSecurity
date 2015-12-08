// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Color;

public final class i
{

    public static final i a = new i(new int[] {
        0xffff0000, -23296, -256, 0xff008000, 0xff0000ff, 0xff4b0082, 0xffee82ee
    });
    public static final i b = new i(new int[] {
        0xff004586, -48626, -11488, 0xff579d1c, 0xff7e0021, 0xff7e0021
    });
    public static final i c = new i(new int[] {
        0xff9999ff, 0xff993366, -52
    });
    public static final i d = new i(new int[] {
        0xffa3a3a3, 0xff7a7a7a, 0xff282828, 0xff484848
    });
    private final int e[];
    private final Integer f[];

    public transient i(int ai[])
    {
        e = ai;
        f = new Integer[ai.length];
        for (int j = 0; j < ai.length; j++)
        {
            f[j] = Integer.valueOf(ai[j]);
        }

    }

    public static i a(int j, int k, int l)
    {
        if (l < 2)
        {
            throw new IllegalArgumentException("paletteSize");
        }
        int ai[] = new int[l];
        int i1 = Color.alpha(j);
        int j1 = Color.red(j);
        int k1 = Color.green(j);
        int l1 = Color.blue(j);
        int i2 = Color.alpha(k);
        int j2 = Color.red(k);
        int k2 = Color.green(k);
        k = Color.blue(k);
        for (j = 0; j < l; j++)
        {
            ai[j] = Color.argb((j * (i2 - i1)) / l + i1, (j * (j2 - j1)) / l + j1, (j * (k2 - k1)) / l + k1, (j * (k - l1)) / l + l1);
        }

        return new i(ai);
    }

    public final int a()
    {
        return e.length;
    }

    public final int a(int j)
    {
        return e[j % e.length];
    }

    final Integer b(int j)
    {
        return f[j % e.length];
    }

    public final int[] b()
    {
        return e;
    }

}
