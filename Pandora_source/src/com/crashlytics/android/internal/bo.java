// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


public final class bo extends Enum
{

    public static final bo a;
    public static final bo b;
    public static final bo c;
    public static final bo d;
    public static final bo e;
    private static final bo g[];
    public final int f;

    private bo(String s, int i, int j)
    {
        super(s, i);
        f = j;
    }

    public static bo valueOf(String s)
    {
        return (bo)Enum.valueOf(com/crashlytics/android/internal/bo, s);
    }

    public static bo[] values()
    {
        return (bo[])g.clone();
    }

    static 
    {
        a = new bo("WIFI_MAC_ADDRESS", 0, 1);
        b = new bo("BLUETOOTH_MAC_ADDRESS", 1, 2);
        c = new bo("ANDROID_ID", 2, 100);
        d = new bo("ANDROID_DEVICE_ID", 3, 101);
        e = new bo("ANDROID_SERIAL", 4, 102);
        g = (new bo[] {
            a, b, c, d, e
        });
    }
}
