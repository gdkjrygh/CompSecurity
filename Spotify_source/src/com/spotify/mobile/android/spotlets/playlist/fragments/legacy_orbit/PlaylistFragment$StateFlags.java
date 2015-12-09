// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;


final class  extends Enum
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

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/spotlets/playlist/fragments/legacy_orbit/PlaylistFragment$StateFlags, s);
    }

    public static [] values()
    {
        return ([])m.clone();
    }

    static 
    {
        a = new <init>("VIEW_CREATED", 0);
        b = new <init>("METADATA_LOADED", 1);
        c = new <init>("TRACKS_LOADED", 2);
        d = new <init>("TRACKS_LOADED_WITH_FILTER", 3);
        e = new <init>("HAVE_TRACKS", 4);
        f = new <init>("HAVE_FILTER", 5);
        g = new <init>("FILTER_FOCUSED", 6);
        h = new <init>("FILTER_UPDATE_LOADED", 7);
        i = new <init>("LIST_IS_SETUP", 8);
        j = new <init>("LIST_SCROLLED_TO_POSITION", 9);
        k = new <init>("LIST_SCROLLED_TOP_OFFSET", 10);
        l = new <init>("LIST_IS_SHOWN", 11);
        m = (new m[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
