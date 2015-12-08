// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


public final class i extends Enum
{

    public static final i yA;
    private static final i yB[];
    public static final i yv;
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
        return (i[])yB.clone();
    }

    static 
    {
        yv = new i("NONE", 0);
        yw = new i("BATCH_BY_SESSION", 1);
        yx = new i("BATCH_BY_TIME", 2);
        yy = new i("BATCH_BY_BRUTE_FORCE", 3);
        yz = new i("BATCH_BY_COUNT", 4);
        yA = new i("BATCH_BY_SIZE", 5);
        yB = (new i[] {
            yv, yw, yx, yy, yz, yA
        });
    }
}
