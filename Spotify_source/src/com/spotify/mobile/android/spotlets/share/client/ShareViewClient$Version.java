// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.client;


public final class mNumber extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    int mNumber;

    public static mNumber valueOf(String s)
    {
        return (mNumber)Enum.valueOf(com/spotify/mobile/android/spotlets/share/client/ShareViewClient$Version, s);
    }

    public static mNumber[] values()
    {
        return (mNumber[])c.clone();
    }

    static 
    {
        a = new <init>("ONE", 0, 1);
        b = new <init>("TWO", 1, 2);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mNumber = j;
    }
}
