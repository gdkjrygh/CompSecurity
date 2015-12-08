// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            lz

public final class mi
{

    public static final int ana[] = new int[0];
    public static final long anb[] = new long[0];
    public static final float anc[] = new float[0];
    public static final double and[] = new double[0];
    public static final boolean ane[] = new boolean[0];
    public static final String anf[] = new String[0];
    public static final byte ang[][] = new byte[0][];
    public static final byte anh[] = new byte[0];

    public static final int b(lz lz1, int i)
        throws IOException
    {
        int j = 1;
        int k = lz1.getPosition();
        lz1.ev(i);
        do
        {
            if (lz1.nI() <= 0 || lz1.nw() != i)
            {
                lz1.ez(k);
                return j;
            }
            lz1.ev(i);
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
