// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public final class jk extends Enum
{

    public static final jk a;
    public static final jk b;
    public static final jk c;
    private static final jk f[];
    public final int d;
    public final boolean e;

    private jk(String s, int i, int j, boolean flag)
    {
        super(s, i);
        d = j;
        e = flag;
    }

    public static jk valueOf(String s)
    {
        return (jk)Enum.valueOf(com/flurry/sdk/jk, s);
    }

    public static jk[] values()
    {
        return (jk[])f.clone();
    }

    static 
    {
        a = new jk("DeviceId", 0, 0, true);
        b = new jk("Sha1Imei", 1, 5, false);
        c = new jk("AndroidAdvertisingId", 2, 13, true);
        f = (new jk[] {
            a, b, c
        });
    }
}
