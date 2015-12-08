// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;


// Referenced classes of package com.google.protobuf.nano:
//            a

public final class j
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

    static int a(int i, int k)
    {
        return i << 3 | k;
    }

    public static final int a(a a1, int i)
    {
        int k = 1;
        int l = a1.j();
        a1.b(i);
        while (a1.a() == i) 
        {
            a1.b(i);
            k++;
        }
        a1.e(l);
        return k;
    }

    public static int b(int i)
    {
        return i >>> 3;
    }

}
