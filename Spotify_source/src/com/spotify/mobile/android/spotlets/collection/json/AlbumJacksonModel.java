// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.json;

import android.content.Context;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import enr;
import ent;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.json:
//            CoversJacksonModel, ArtistJacksonModel

public class AlbumJacksonModel
    implements JacksonModel, enr
{

    private final ArtistJacksonModel mArtist;
    private final String mCollectionUri;
    private final String mCopyrights[];
    private final CoversJacksonModel mCovers;
    private final String mInferredOffline;
    private final boolean mIsAnyTrackPlayable;
    private final boolean mIsSavedToCollection;
    private final String mName;
    private final int mNumDiscs;
    private final int mNumTracks;
    private final int mNumTracksInCollection;
    private final String mOffline;
    private final int mSyncProgress;
    private final String mUri;
    private final int mYear;

    public AlbumJacksonModel(String s, String s1, String s2, String as[], ArtistJacksonModel artistjacksonmodel, CoversJacksonModel coversjacksonmodel, String s3, 
            String s4, int i, int j, int k, int l, int i1, boolean flag, 
            boolean flag1)
    {
        mUri = s;
        mCollectionUri = s1;
        mName = s2;
        mCopyrights = as;
        mArtist = artistjacksonmodel;
        mCovers = coversjacksonmodel;
        mOffline = s3;
        mInferredOffline = s4;
        mSyncProgress = i;
        mYear = j;
        mNumDiscs = k;
        mNumTracks = l;
        mNumTracksInCollection = i1;
        mIsAnyTrackPlayable = flag;
        mIsSavedToCollection = flag1;
    }

    public ent getArtist()
    {
        return mArtist;
    }

    public String getCollectionUri()
    {
        return mCollectionUri;
    }

    public String getCopyright()
    {
        return TextUtils.join("\n", mCopyrights);
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

    public enr getItem()
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

    public int getNumDiscs()
    {
        return mNumDiscs;
    }

    public int getNumTracks()
    {
        return mNumTracks;
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
        if (mArtist != null)
        {
            return mArtist.getName();
        } else
        {
            return "";
        }
    }

    public int getSyncProgress()
    {
        return mSyncProgress;
    }

    public String getTargetUri(Flags flags)
    {
        return getUri();
    }

    public String getTitle()
    {
        return mName;
    }

    public String getUri()
    {
        return mUri;
    }

    public int getYear()
    {
        return mYear;
    }

    public boolean isAnyTrackPlayable()
    {
        return mIsAnyTrackPlayable;
    }

    public boolean isHeader()
    {
        return false;
    }

    public boolean isSavedToCollection()
    {
        return mIsSavedToCollection;
    }
}
