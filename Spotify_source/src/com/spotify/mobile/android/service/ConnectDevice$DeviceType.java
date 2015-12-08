// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;


public final class A extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final l f;
    public static final l g;
    public static final l h;
    public static final l i;
    public static final l j;
    public static final l k;
    public static final l l;
    private static final l m[];

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/spotify/mobile/android/service/ConnectDevice$DeviceType, s);
    }

    public static A[] values()
    {
        return (A[])m.clone();
    }

    static 
    {
        a = new <init>("UNKNOWN", 0);
        b = new <init>("COMPUTER", 1);
        c = new <init>("TABLET", 2);
        d = new <init>("SMARTPHONE", 3);
        e = new <init>("SPEAKER", 4);
        f = new <init>("TV", 5);
        g = new <init>("AVR", 6);
        h = new <init>("STB", 7);
        i = new <init>("AUDIO_DONGLE", 8);
        j = new <init>("GAME_CONSOLE", 9);
        k = new <init>("CAST_VIDEO", 10);
        l = new <init>("CAST_AUDIO", 11);
        m = (new m[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }

    private A(String s, int i1)
    {
        super(s, i1);
    }
}
