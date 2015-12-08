// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;


public final class A extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/spotify/mobile/android/spotlets/ads/FeaturedAction$Type, s);
    }

    public static A[] values()
    {
        return (A[])e.clone();
    }

    static 
    {
        a = new <init>("NONE", 0);
        b = new <init>("CLICK_TO_SAVE", 1);
        c = new <init>("MIDROLL_VIDEO_OFFER", 2);
        d = new <init>("PREROLL_VIDEO_OFFER", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
