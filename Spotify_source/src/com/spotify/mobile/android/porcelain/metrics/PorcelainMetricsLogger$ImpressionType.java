// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.metrics;


public final class mStrValue extends Enum
{

    public static final b a;
    private static b b;
    private static final b c[];
    private final String mStrValue;

    public static mStrValue valueOf(String s)
    {
        return (mStrValue)Enum.valueOf(com/spotify/mobile/android/porcelain/metrics/PorcelainMetricsLogger$ImpressionType, s);
    }

    public static mStrValue[] values()
    {
        return (mStrValue[])c.clone();
    }

    public final String toString()
    {
        return mStrValue;
    }

    static 
    {
        a = new <init>("PAGE", 0, "page");
        b = new <init>("ITEM", 1, "item");
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mStrValue = s1;
    }
}
