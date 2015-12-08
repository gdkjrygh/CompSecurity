// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.json;

import android.content.Context;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import ent;
import eos;
import fiz;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.json:
//            CoversJacksonModel

public class ArtistJacksonModel
    implements JacksonModel, ent
{

    private final String mCollectionUri;
    private final CoversJacksonModel mCovers;
    private final String mInferredOffline;
    private final boolean mIsFollowed;
    private final boolean mIsVariousArtist;
    private final String mName;
    private final int mNumAlbumsInCollection;
    private final int mNumTracksInCollection;
    private final String mOffline;
    private final int mSyncProgress;
    private final String mUri;

    public ArtistJacksonModel(String s, String s1, String s2, CoversJacksonModel coversjacksonmodel, String s3, String s4, int i, 
            int j, int k, boolean flag, boolean flag1)
    {
        mUri = s;
        mCollectionUri = s1;
        mName = s2;
        mCovers = coversjacksonmodel;
        mOffline = s3;
        mInferredOffline = s4;
        mSyncProgress = i;
        mNumTracksInCollection = j;
        mNumAlbumsInCollection = k;
        mIsFollowed = flag;
        mIsVariousArtist = flag1;
    }

    public String getCollectionUri()
    {
        return mCollectionUri;
    }

    public Covers getCovers()
    {
        return mCovers;
    }

    public String getHeader()
    {
        return null;
    }

    public String getImageUri()
    {
        if (mCovers != null)
        {
            return mCovers.getImageUri(com.spotify.mobile.android.spotlets.show.model.Covers.Size.b);
        } else
        {
            return "";
        }
    }

    public int getInferredOfflineState()
    {
        return com.spotify.mobile.android.provider.Metadata.OfflineSync.a(mInferredOffline);
    }

    public ent getItem()
    {
        return this;
    }

    public volatile Object getItem()
    {
        return getItem();
    }

    public String getName()
    {
        return mName;
    }

    public int getNumAlbumsInCollection()
    {
        return mNumAlbumsInCollection;
    }

    public int getNumTracksInCollection()
    {
        return mNumTracksInCollection;
    }

    public int getOfflineState()
    {
        return com.spotify.mobile.android.provider.Metadata.OfflineSync.a(mOffline);
    }

    public String getSubtitle(Flags flags, Context context)
    {
        return fiz.a(context, this, flags);
    }

    public int getSyncProgress()
    {
        return mSyncProgress;
    }

    public String getTargetUri(Flags flags)
    {
        return eos.a(flags, this);
    }

    public String getTitle()
    {
        return mName;
    }

    public String getUri()
    {
        return mUri;
    }

    public boolean isFollowed()
    {
        return mIsFollowed;
    }

    public boolean isHeader()
    {
        return false;
    }

    public boolean isVariousArtists()
    {
        return mIsVariousArtist;
    }
}
