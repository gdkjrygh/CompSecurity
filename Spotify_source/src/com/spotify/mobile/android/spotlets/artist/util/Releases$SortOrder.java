// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.util;

import cva;
import ejk;

public final class mOrdering extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    cva mOrdering;

    public static mOrdering valueOf(String s)
    {
        return (mOrdering)Enum.valueOf(com/spotify/mobile/android/spotlets/artist/util/Releases$SortOrder, s);
    }

    public static mOrdering[] values()
    {
        return (mOrdering[])d.clone();
    }

    static 
    {
        a = new <init>("NAME", 0, cva.a(String.CASE_INSENSITIVE_ORDER).a(ejk.a()));
        b = new <init>("YEAR", 1, cva.b().a(ejk.b()));
        c = new <init>("NONE", 2, null);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i, cva cva1)
    {
        super(s, i);
        mOrdering = cva1;
    }
}
