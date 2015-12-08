// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.metrics;


public final class mStrValue extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    private final String mStrValue;

    public static mStrValue valueOf(String s)
    {
        return (mStrValue)Enum.valueOf(com/spotify/mobile/android/porcelain/metrics/PorcelainMetricsLogger$InteractionAction, s);
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
        a = new <init>("NAVIGATE_FORWARD", 0, "navigate-forward");
        b = new <init>("PLAY", 1, "play");
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
