// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzob
{

    public static final int zzaNV[] = new int[0];
    public static final long zzaNW[] = new long[0];
    public static final float zzaNX[] = new float[0];
    public static final double zzaNY[] = new double[0];
    public static final boolean zzaNZ[] = new boolean[0];
    public static final String zzaOa[] = new String[0];
    public static final byte zzaOb[][] = new byte[0][];
    public static final byte zzaOc[] = new byte[0];

    static int zzC(int i, int j)
    {
        return i << 3 | j;
    }

    public static final int zzb(zznq zznq1, int i)
        throws IOException
    {
        int j = 1;
        int k = zznq1.getPosition();
        zznq1.zzjl(i);
        while (zznq1.zzzy() == i) 
        {
            zznq1.zzjl(i);
            j++;
        }
        zznq1.zzjp(k);
        return j;
    }

    static int zzjF(int i)
    {
        return i & 7;
    }

    public static int zzjG(int i)
    {
        return i >>> 3;
    }

}
