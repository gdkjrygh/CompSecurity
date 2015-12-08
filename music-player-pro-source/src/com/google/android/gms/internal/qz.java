// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qo

public final class qz
{

    public static final int azj[] = new int[0];
    public static final long azk[] = new long[0];
    public static final float azl[] = new float[0];
    public static final double azm[] = new double[0];
    public static final boolean azn[] = new boolean[0];
    public static final String azo[] = new String[0];
    public static final byte azp[][] = new byte[0][];
    public static final byte azq[] = new byte[0];

    public static final int b(qo qo1, int i)
        throws IOException
    {
        int j = 1;
        int k = qo1.getPosition();
        qo1.gQ(i);
        while (qo1.rz() == i) 
        {
            qo1.gQ(i);
            j++;
        }
        qo1.gU(k);
        return j;
    }

    static int hk(int i)
    {
        return i & 7;
    }

    public static int hl(int i)
    {
        return i >>> 3;
    }

    static int y(int i, int j)
    {
        return i << 3 | j;
    }

}
