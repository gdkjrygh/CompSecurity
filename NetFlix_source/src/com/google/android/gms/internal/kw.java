// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            kn

public final class kw
{

    public static final int aea[] = new int[0];
    public static final long aeb[] = new long[0];
    public static final float aec[] = new float[0];
    public static final double aed[] = new double[0];
    public static final boolean aee[] = new boolean[0];
    public static final String aef[] = new String[0];
    public static final byte aeg[][] = new byte[0][];
    public static final byte aeh[] = new byte[0];

    public static final int b(kn kn1, int i)
        throws IOException
    {
        int j = 1;
        int k = kn1.getPosition();
        kn1.cQ(i);
        do
        {
            if (kn1.ms() <= 0 || kn1.mh() != i)
            {
                kn1.cT(k);
                return j;
            }
            kn1.cQ(i);
            j++;
        } while (true);
    }

    static int de(int i)
    {
        return i & 7;
    }

    public static int df(int i)
    {
        return i >>> 3;
    }

    static int l(int i, int j)
    {
        return i << 3 | j;
    }

}
