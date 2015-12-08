// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.connect;


public final class mValue extends Enum
{

    public static final b a;
    public static final b b;
    private static b c;
    private static final b d[];
    private final String mValue;

    public static mValue valueOf(String s)
    {
        return (mValue)Enum.valueOf(com/spotify/mobile/android/connect/DiscoveryClient$DiscoveryConfiguration$FeatureFlagOverrideValue, s);
    }

    public static mValue[] values()
    {
        return (mValue[])d.clone();
    }

    static 
    {
        a = new <init>("NONE", 0, "NONE");
        c = new <init>("ENABLED", 1, "ENABLED");
        b = new <init>("DISABLED", 2, "DISABLED");
        d = (new d[] {
            a, c, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mValue = s1;
    }
}
