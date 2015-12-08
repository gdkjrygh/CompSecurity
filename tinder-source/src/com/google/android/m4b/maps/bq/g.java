// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.aa.ax;
import java.util.Map;

public final class g
{
    public static interface a
    {

        public abstract void a();
    }


    private static final Map a;

    public static int a(int i, int j)
    {
        a(i);
        a(j);
        int k = j & 0x1f;
        j >>= 5;
        return (i & 0x1f & (j ^ 0x1f) | k) + ((i >> 5 & (k ^ 0x1f) | j) << 5);
    }

    public static int a(a.b b, boolean flag)
    {
        b = (Integer)a.get(b);
        if (b == null)
        {
            return 0;
        }
        if (flag)
        {
            return b.intValue();
        } else
        {
            return b.intValue() << 5;
        }
    }

    private static void a(int i)
    {
        if (i >> 10 != 0)
        {
            throw new IllegalArgumentException((new StringBuilder(42)).append("the modifier [").append(i).append("] is out of bound").toString());
        }
        if ((i & 0x1f & i >> 5) != 0)
        {
            throw new IllegalArgumentException((new StringBuilder(44)).append("the modifier [").append(i).append("] has conflict bits").toString());
        } else
        {
            return;
        }
    }

    public static boolean a(a.b b)
    {
        return a.containsKey(b);
    }

    static 
    {
        java.util.HashMap hashmap = ax.a(5);
        a = hashmap;
        hashmap.put(a.b.c, Integer.valueOf(1));
    }
}
