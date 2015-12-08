// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.browse.datasource;


public final class RequestType extends Enum
{

    public static final RequestType a;
    public static final RequestType b;
    public static final RequestType c;
    public static final RequestType d;
    public static final RequestType e;
    private static RequestType f;
    private static RequestType g;
    private static RequestType h;
    private static final RequestType i[];

    private RequestType(String s, int j)
    {
        super(s, j);
    }

    public static RequestType valueOf(String s)
    {
        return (RequestType)Enum.valueOf(com/spotify/mobile/android/spotlets/browse/datasource/RequestType, s);
    }

    public static RequestType[] values()
    {
        return (RequestType[])i.clone();
    }

    static 
    {
        a = new RequestType("FEATURED_PLAYLISTS", 0);
        b = new RequestType("GENRE", 1);
        c = new RequestType("GENRE_PLAYLISTS", 2);
        d = new RequestType("COLLECTION_FAVORITES", 3);
        e = new RequestType("NEW_RELEASES", 4);
        f = new RequestType("TRENDING_ARTISTS", 5);
        g = new RequestType("TOP_LISTS", 6);
        h = new RequestType("REGION_MAPPINGS", 7);
        i = (new RequestType[] {
            a, b, c, d, e, f, g, h
        });
    }
}
