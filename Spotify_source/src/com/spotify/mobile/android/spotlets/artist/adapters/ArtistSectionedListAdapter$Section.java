// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.adapters;


public final class mPreferredAdapter extends Enum
{

    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;
    public static final m e;
    public static final m f;
    public static final m g;
    public static final m h;
    public static final m i;
    public static final m j;
    public static final m k;
    public static final m l;
    public static final m m;
    private static final m n[];
    private final dAdapter mPreferredAdapter;
    private final int mTitleStringId;

    static boolean a(mPreferredAdapter mpreferredadapter)
    {
        return mpreferredadapter.mPreferredAdapter != dAdapter.a;
    }

    static int b(dAdapter.a a1)
    {
        return a1.mTitleStringId;
    }

    static dAdapter c(mTitleStringId mtitlestringid)
    {
        return mtitlestringid.mPreferredAdapter;
    }

    public static mPreferredAdapter valueOf(String s)
    {
        return (mPreferredAdapter)Enum.valueOf(com/spotify/mobile/android/spotlets/artist/adapters/ArtistSectionedListAdapter$Section, s);
    }

    public static mPreferredAdapter[] values()
    {
        return (mPreferredAdapter[])n.clone();
    }

    static 
    {
        a = new <init>("CUSTOM_MESSAGE", 0, 0, dAdapter.b);
        b = new <init>("LATEST_RELEASE", 1, 0x7f08034b, dAdapter.b);
        c = new <init>("TOP_TRACKS", 2, 0x7f08034c, dAdapter.b);
        d = new <init>("RADIO", 3, 0, dAdapter.a);
        e = new <init>("RELATED_ARTISTS", 4, 0x7f0800c8, dAdapter.b);
        f = new <init>("ON_TOUR", 5, 0x7f080351, dAdapter.b);
        g = new <init>("ALBUMS", 6, 0x7f0800c9, dAdapter.a);
        h = new <init>("SINGLES", 7, 0x7f0800ce, dAdapter.a);
        i = new <init>("COMPILATIONS", 8, 0x7f0800cb, dAdapter.a);
        j = new <init>("PLAYLISTS", 9, 0x7f0800cd, dAdapter.b);
        k = new <init>("APPEARS_ON", 10, 0x7f0800ca, dAdapter.b);
        l = new <init>("BIOGRAPHY", 11, 0x7f0800c7, dAdapter.b);
        m = new <init>("MERCHANDISE", 12, 0x7f0800cc, dAdapter.b);
        n = (new n[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
    }

    private dAdapter(String s, int i1, int j1, dAdapter dadapter)
    {
        super(s, i1);
        mTitleStringId = j1;
        mPreferredAdapter = dadapter;
    }
}
