// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.adapter;


public final class A extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/spotify/mobile/android/ui/adapter/SettingsAdapter$Group, s);
    }

    public static A[] values()
    {
        return (A[])i.clone();
    }

    static 
    {
        a = new <init>("PLAYBACK", 0);
        b = new <init>("SPOTIFY_CONNECT", 1);
        c = new <init>("SOCIAL", 2);
        d = new <init>("MUSIC_QUALITY", 3);
        e = new <init>("NOTIFICATIONS", 4);
        f = new <init>("ADVERTISEMENTS", 5);
        g = new <init>("ABOUT", 6);
        h = new <init>("OTHER", 7);
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private A(String s, int j)
    {
        super(s, j);
    }
}
