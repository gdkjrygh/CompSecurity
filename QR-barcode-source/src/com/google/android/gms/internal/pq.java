// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            pf

public final class pq
{

    public static final int awW[] = new int[0];
    public static final long awX[] = new long[0];
    public static final float awY[] = new float[0];
    public static final double awZ[] = new double[0];
    public static final boolean axa[] = new boolean[0];
    public static final String axb[] = new String[0];
    public static final byte axc[][] = new byte[0][];
    public static final byte axd[] = new byte[0];

    public static final int b(pf pf1, int i)
        throws IOException
    {
        int j = 1;
        int k = pf1.getPosition();
        pf1.gn(i);
        while (pf1.qi() == i) 
        {
            pf1.gn(i);
            j++;
        }
        pf1.gr(k);
        return j;
    }

    static int gH(int i)
    {
        return i & 7;
    }

    public static int gI(int i)
    {
        return i >>> 3;
    }

    static int x(int i, int j)
    {
        return i << 3 | j;
    }

}
