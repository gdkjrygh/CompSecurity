// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


public final class l extends Enum
{

    public static final l yI;
    public static final l yJ;
    private static final l yK[];

    private l(String s, int i)
    {
        super(s, i);
    }

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(com/google/android/gms/analytics/l, s);
    }

    public static l[] values()
    {
        return (l[])yK.clone();
    }

    static 
    {
        yI = new l("NONE", 0);
        yJ = new l("GZIP", 1);
        yK = (new l[] {
            yI, yJ
        });
    }
}
