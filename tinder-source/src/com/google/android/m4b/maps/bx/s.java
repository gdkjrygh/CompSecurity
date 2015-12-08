// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public final class s
{

    public static final s j = new s();
    public final int a;
    public final int b[];
    public final int c;
    public final int d;
    public final int e;
    public final int f[];
    public final int g[];
    public final float h[];
    public TreeSet i;
    public final float k[];
    private final int l;

    private s()
    {
        b = new int[0];
        a = 1;
        e = 21;
        l = -1;
        d = 21;
        c = 22;
        h = new float[0];
        k = new float[0];
        i = new TreeSet();
        f = new int[0];
        g = new int[0];
    }

    public s(int ai[], int i1, int j1, int k1)
    {
        b = ai;
        a = j1;
        float f3 = 1.0F / (float)j1;
        e = k1;
        k1 = b.length;
        l = b[0];
        d = b[k1 - 1];
        c = i1;
        h = new float[d + 1];
        k = new float[d + 1];
        Arrays.fill(h, -1F);
        Arrays.fill(k, -1F);
        i = new TreeSet();
        i1 = c;
        float f1 = c;
        for (j1 = 0; j1 < k1; j1++)
        {
            i.add(Integer.valueOf(b[j1]));
            if (h[b[j1]] >= 0.0F)
            {
                continue;
            }
            float f2 = (float)j1 * f3 + (float)c;
            for (; i1 < b[j1]; i1++)
            {
                h[i1] = f1;
                k[i1] = f2;
            }

            h[i1] = f2;
            f1 = f2;
        }

        f = new int[d + 1];
        g = new int[d + 1];
        Arrays.fill(f, -1);
        Arrays.fill(g, -1);
        ai = i.iterator();
        for (i1 = -1; ai.hasNext(); i1 = j1)
        {
            j1 = ((Integer)ai.next()).intValue();
            f[j1] = i1;
            if (i1 >= 0)
            {
                g[i1] = j1;
            }
        }

    }

}
