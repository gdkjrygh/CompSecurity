// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.json;

import com.spotify.mobile.android.cosmos.JacksonModel;
import ent;
import enu;
import enw;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.json:
//            ArtistJacksonModel, TrackJacksonModel

public class ArtistEntityJacksonModel
    implements JacksonModel, enu
{

    private final ArtistJacksonModel mHeader;
    private final boolean mIsLoading;
    private final TrackJacksonModel mItems[];
    private final int mUnfilteredLength;
    private final int mUnrangedLength;

    public ArtistEntityJacksonModel(ArtistJacksonModel artistjacksonmodel, TrackJacksonModel atrackjacksonmodel[], boolean flag, int i, int j)
    {
        mHeader = artistjacksonmodel;
        mItems = atrackjacksonmodel;
        mIsLoading = flag;
        mUnfilteredLength = i;
        mUnrangedLength = j;
    }

    public ent getHeader()
    {
        return mHeader;
    }

    public enw[] getItems()
    {
        return mItems;
    }

    public volatile Object[] getItems()
    {
        return getItems();
    }

    public int getUnfilteredLength()
    {
        return mUnfilteredLength;
    }

    public int getUnrangedLength()
    {
        return mUnrangedLength;
    }

    public boolean isLoading()
    {
        return mIsLoading;
    }
}
