// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.util;

import cva;
import eji;

public final class mOrdering extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    public cva mOrdering;

    public static mOrdering valueOf(String s)
    {
        return (mOrdering)Enum.valueOf(com/spotify/mobile/android/spotlets/artist/util/Playlists$SortOrder, s);
    }

    public static mOrdering[] values()
    {
        return (mOrdering[])c.clone();
    }

    static 
    {
        a = new <init>("NAME", 0, cva.a(String.CASE_INSENSITIVE_ORDER).a(eji.a()));
        b = new <init>("NONE", 1, null);
        c = (new c[] {
            a, b
        });
    }

    private I(String s, int i, cva cva1)
    {
        super(s, i);
        mOrdering = cva1;
    }
}
