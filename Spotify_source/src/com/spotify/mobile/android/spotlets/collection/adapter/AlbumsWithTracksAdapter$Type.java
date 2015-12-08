// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.adapter;


public final class Y extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/spotify/mobile/android/spotlets/collection/adapter/AlbumsWithTracksAdapter$Type, s);
    }

    public static Y[] values()
    {
        return (Y[])d.clone();
    }

    static 
    {
        a = new <init>("TRACK", 0);
        b = new <init>("ALBUM", 1);
        c = new <init>("PLACEHOLDER", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
