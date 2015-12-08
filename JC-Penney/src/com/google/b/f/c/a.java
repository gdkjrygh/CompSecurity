// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.c;

import java.lang.reflect.Array;

// Referenced classes of package com.google.b.f.c:
//            b

public final class a
{

    private final b a[];
    private int b;
    private final int c;
    private final int d;

    a(int i, int j)
    {
        a = new b[i];
        int k = 0;
        for (int l = a.length; k < l; k++)
        {
            a[k] = new b((j + 4) * 17 + 1);
        }

        d = j * 17;
        c = i;
        b = -1;
    }

    void a()
    {
        b = b + 1;
    }

    public byte[][] a(int i, int j)
    {
        int k = c;
        int i1 = d;
        byte abyte0[][] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            k * j, i1 * i
        });
        i1 = c * j;
        for (int l = 0; l < i1; l++)
        {
            abyte0[i1 - l - 1] = a[l / j].a(i);
        }

        return abyte0;
    }

    b b()
    {
        return a[b];
    }
}
