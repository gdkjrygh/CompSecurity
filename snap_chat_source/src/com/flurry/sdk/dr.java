// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public final class dr extends Enum
{

    public static final dr a;
    public static final dr b;
    public static final dr c;
    private static final dr f[];
    public final int d;
    public final boolean e;

    private dr(String s, int i, int j, boolean flag)
    {
        super(s, i);
        d = j;
        e = flag;
    }

    public static dr valueOf(String s)
    {
        return (dr)Enum.valueOf(com/flurry/sdk/dr, s);
    }

    public static dr[] values()
    {
        return (dr[])f.clone();
    }

    static 
    {
        a = new dr("PhoneId", 0, 0, true);
        b = new dr("Sha1Imei", 1, 5, false);
        c = new dr("AndroidAdvertisingId", 2, 13, true);
        f = (new dr[] {
            a, b, c
        });
    }
}
