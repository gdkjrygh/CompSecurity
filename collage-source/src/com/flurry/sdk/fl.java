// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public final class fl extends Enum
{

    public static final fl a;
    public static final fl b;
    public static final fl c;
    private static final fl f[];
    public final int d;
    public final boolean e;

    private fl(String s, int i, int j, boolean flag)
    {
        super(s, i);
        d = j;
        e = flag;
    }

    public static fl valueOf(String s)
    {
        return (fl)Enum.valueOf(com/flurry/sdk/fl, s);
    }

    public static fl[] values()
    {
        return (fl[])f.clone();
    }

    static 
    {
        a = new fl("DeviceId", 0, 0, true);
        b = new fl("Sha1Imei", 1, 5, false);
        c = new fl("AndroidAdvertisingId", 2, 13, true);
        f = (new fl[] {
            a, b, c
        });
    }
}
