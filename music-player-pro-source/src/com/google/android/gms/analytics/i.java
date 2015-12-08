// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


public final class i extends Enum
{

    public static final i yA;
    public static final i yB;
    private static final i yC[];
    public static final i yw;
    public static final i yx;
    public static final i yy;
    public static final i yz;

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/google/android/gms/analytics/i, s);
    }

    public static i[] values()
    {
        return (i[])yC.clone();
    }

    static 
    {
        yw = new i("NONE", 0);
        yx = new i("BATCH_BY_SESSION", 1);
        yy = new i("BATCH_BY_TIME", 2);
        yz = new i("BATCH_BY_BRUTE_FORCE", 3);
        yA = new i("BATCH_BY_COUNT", 4);
        yB = new i("BATCH_BY_SIZE", 5);
        yC = (new i[] {
            yw, yx, yy, yz, yA, yB
        });
    }
}
