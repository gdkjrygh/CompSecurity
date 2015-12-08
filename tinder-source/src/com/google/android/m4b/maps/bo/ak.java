// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            am, g, j, ay, 
//            ac

public final class ak
{

    private final int a[];
    private final int b[];

    ak(int ai[], int ai1[])
    {
        a = ai;
        b = ai1;
    }

    public static ak a(DataInput datainput, ac ac)
    {
        int k = am.a(datainput);
        if (k % 3 != 0)
        {
            throw new IOException((new StringBuilder(44)).append("Malformed TriangleList, ").append(k).append(" vertices").toString());
        }
        int ai[] = new int[k * 3];
        for (int i = 0; i < k; i++)
        {
            g.a(datainput, ac, ai, i);
        }

        return new ak(ai, null);
    }

    public final int a()
    {
        return a.length / 9;
    }

    public final void a(int i, g g1, g g2, g g3)
    {
        int k = i * 9;
        int ai[] = a;
        i = k + 1;
        g1.a = ai[k];
        ai = a;
        k = i + 1;
        g1.b = ai[i];
        ai = a;
        i = k + 1;
        g1.c = ai[k];
        g1 = a;
        k = i + 1;
        g2.a = g1[i];
        g1 = a;
        i = k + 1;
        g2.b = g1[k];
        g1 = a;
        k = i + 1;
        g2.c = g1[i];
        g1 = a;
        i = k + 1;
        g3.a = g1[k];
        g3.b = a[i];
        g3.c = a[i + 1];
    }

    public final void a(int i, g g1, g g2, g g3, g g4)
    {
        int k = i * 9;
        int ai[] = a;
        i = k + 1;
        g2.a = ai[k] - g1.a;
        ai = a;
        k = i + 1;
        g2.b = ai[i] - g1.b;
        ai = a;
        i = k + 1;
        g2.c = ai[k] - g1.c;
        g2 = a;
        k = i + 1;
        g3.a = g2[i] - g1.a;
        g2 = a;
        i = k + 1;
        g3.b = g2[k] - g1.b;
        g2 = a;
        k = i + 1;
        g3.c = g2[i] - g1.c;
        g2 = a;
        i = k + 1;
        g4.a = g2[k] - g1.a;
        g4.b = a[i] - g1.b;
        g4.c = a[i + 1] - g1.c;
    }

    public final void a(ay ay1)
    {
        for (int i = 0; i < a(); i++)
        {
            g ag[] = new g[3];
            ag[0] = new g();
            ag[1] = new g();
            ag[2] = new g();
            a(i, ag[0], ag[1], ag[2]);
            ay1.a(new j(ag));
        }

    }

    public final int b()
    {
        int k = a.length;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.length;
        }
        return (i + k) * 4 + 28;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ak)
        {
            obj = (ak)obj;
            flag = flag1;
            if (Arrays.equals(a, ((ak) (obj)).a))
            {
                flag = flag1;
                if (Arrays.equals(b, ((ak) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(a) + Arrays.hashCode(b);
    }
}
