// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.util;

import gfp;

public final class Playlists
{

    public static final gfp a;
    public static final gfp b;

    static 
    {
        a = new gfp(SortOrder.b.toString(), 0x7f080525, false);
        b = new gfp(SortOrder.a.toString(), 0x7f080521);
    }

    private class SortOrder extends Enum
    {

        public static final SortOrder a;
        public static final SortOrder b;
        private static final SortOrder c[];
        public cva mOrdering;

        public static SortOrder valueOf(String s)
        {
            return (SortOrder)Enum.valueOf(com/spotify/mobile/android/spotlets/artist/util/Playlists$SortOrder, s);
        }

        public static SortOrder[] values()
        {
            return (SortOrder[])c.clone();
        }

        static 
        {
            a = new SortOrder("NAME", 0, cva.a(String.CASE_INSENSITIVE_ORDER).a(eji.a()));
            b = new SortOrder("NONE", 1, null);
            c = (new SortOrder[] {
                a, b
            });
        }

        private SortOrder(String s, int i, cva cva1)
        {
            super(s, i);
            mOrdering = cva1;
        }
    }

}
