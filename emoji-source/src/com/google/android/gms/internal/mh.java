// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ly

public final class mh
{

    public static final int and[] = new int[0];
    public static final long ane[] = new long[0];
    public static final float anf[] = new float[0];
    public static final double ang[] = new double[0];
    public static final boolean anh[] = new boolean[0];
    public static final String ani[] = new String[0];
    public static final byte anj[][] = new byte[0][];
    public static final byte ank[] = new byte[0];

    public static final int b(ly ly1, int i)
        throws IOException
    {
        int j = 1;
        int k = ly1.getPosition();
        ly1.ev(i);
        do
        {
            if (ly1.nN() <= 0 || ly1.nB() != i)
            {
                ly1.ez(k);
                return j;
            }
            ly1.ev(i);
            j++;
        } while (true);
    }

    static int eN(int i)
    {
        return i & 7;
    }

    public static int eO(int i)
    {
        return i >>> 3;
    }

    static int u(int i, int j)
    {
        return i << 3 | j;
    }

}
