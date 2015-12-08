// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.user:
//            TopArtistModel

public class TopArtistsListModel
    implements JacksonModel
{

    private final TopArtistModel mTopArtists[];

    public TopArtistsListModel(TopArtistModel atopartistmodel[])
    {
        mTopArtists = atopartistmodel;
    }

    public TopArtistModel[] getTopArtists()
    {
        return mTopArtists;
    }
}
