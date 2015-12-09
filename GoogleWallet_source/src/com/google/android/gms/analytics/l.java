// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


public final class l extends Enum
{

    public static final l yH;
    public static final l yI;
    private static final l yJ[];

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
        return (l[])yJ.clone();
    }

    static 
    {
        yH = new l("NONE", 0);
        yI = new l("GZIP", 1);
        yJ = (new l[] {
            yH, yI
        });
    }
}
