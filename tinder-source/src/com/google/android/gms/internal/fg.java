// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ew

public final class fg
{

    public static final int a[] = new int[0];
    public static final long b[] = new long[0];
    public static final float c[] = new float[0];
    public static final double d[] = new double[0];
    public static final boolean e[] = new boolean[0];
    public static final String f[] = new String[0];
    public static final byte g[][] = new byte[0][];
    public static final byte h[] = new byte[0];

    static int a(int i)
    {
        return i & 7;
    }

    static int a(int i, int j)
    {
        return i << 3 | j;
    }

    public static boolean a(ew ew1, int i)
        throws IOException
    {
        return ew1.b(i);
    }

    public static int b(int i)
    {
        return i >>> 3;
    }

    public static final int b(ew ew1, int i)
        throws IOException
    {
        int j = 1;
        int k = ew1.h();
        ew1.b(i);
        while (ew1.a() == i) 
        {
            ew1.b(i);
            j++;
        }
        ew1.e(k);
        return j;
    }

}
