// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzwq

public final class zzxb
{

    public static final int zzaHO[] = new int[0];
    public static final long zzaHP[] = new long[0];
    public static final float zzaHQ[] = new float[0];
    public static final double zzaHR[] = new double[0];
    public static final boolean zzaHS[] = new boolean[0];
    public static final String zzaHT[] = new String[0];
    public static final byte zzaHU[][] = new byte[0][];
    public static final byte zzaHV[] = new byte[0];

    static int zzD(int i, int j)
    {
        return i << 3 | j;
    }

    public static final int zzc(zzwq zzwq1, int i)
    {
        int j = 1;
        int k = zzwq1.getPosition();
        zzwq1.zzin(i);
        while (zzwq1.zzvu() == i) 
        {
            zzwq1.zzin(i);
            j++;
        }
        zzwq1.zzir(k);
        return j;
    }

    static int zziH(int i)
    {
        return i & 7;
    }

    public static int zziI(int i)
    {
        return i >>> 3;
    }

}
