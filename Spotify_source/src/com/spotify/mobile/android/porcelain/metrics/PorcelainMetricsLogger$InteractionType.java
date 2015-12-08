// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.metrics;


public final class mStrValue extends Enum
{

    public static final a a;
    private static final a b[];
    private final String mStrValue;

    public static mStrValue valueOf(String s)
    {
        return (mStrValue)Enum.valueOf(com/spotify/mobile/android/porcelain/metrics/PorcelainMetricsLogger$InteractionType, s);
    }

    public static mStrValue[] values()
    {
        return (mStrValue[])b.clone();
    }

    public final String toString()
    {
        return mStrValue;
    }

    static 
    {
        a = new <init>("HIT", "hit");
        b = (new b[] {
            a
        });
    }

    private Y(String s, String s1)
    {
        super(s, 0);
        mStrValue = s1;
    }
}
