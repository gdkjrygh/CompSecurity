// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.adapters;


public final class mReleaseType extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    private final com.spotify.mobile.android.spotlets.artist.model.on mReleaseType;
    private final d mSection;

    static com.spotify.mobile.android.spotlets.artist.model.on a(mReleaseType mreleasetype)
    {
        return mreleasetype.mReleaseType;
    }

    static mReleaseType b(mReleaseType mreleasetype)
    {
        return mreleasetype.mSection;
    }

    public static mSection valueOf(String s)
    {
        return (mSection)Enum.valueOf(com/spotify/mobile/android/spotlets/artist/adapters/ArtistSectionedListAdapter$ReleasesSection, s);
    }

    public static mSection[] values()
    {
        return (mSection[])e.clone();
    }

    static 
    {
        a = new <init>("ALBUMS", 0, <init>, com.spotify.mobile.android.spotlets.artist.model.on);
        b = new <init>("SINGLES", 1, <init>, com.spotify.mobile.android.spotlets.artist.model.on);
        c = new <init>("COMPILATIONS", 2, <init>, com.spotify.mobile.android.spotlets.artist.model.on);
        d = new <init>("APPEARS_ON", 3, <init>, com.spotify.mobile.android.spotlets.artist.model.on);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i,  , com.spotify.mobile.android.spotlets.artist.model.on on)
    {
        super(s, i);
        mSection = ;
        mReleaseType = on;
    }
}
