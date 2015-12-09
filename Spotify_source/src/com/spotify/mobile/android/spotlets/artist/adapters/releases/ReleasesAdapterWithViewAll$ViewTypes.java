// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.adapters.releases;


final class  extends Enum
{

    public static final b a;
    public static final b b;
    private static final int c = values().length;
    private static final values d[];

    static int a()
    {
        return c;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/spotify/mobile/android/spotlets/artist/adapters/releases/ReleasesAdapterWithViewAll$ViewTypes, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    static 
    {
        a = new <init>("REGULAR", 0);
        b = new <init>("VIEW_ALL", 1);
        d = (new d[] {
            a, b
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
