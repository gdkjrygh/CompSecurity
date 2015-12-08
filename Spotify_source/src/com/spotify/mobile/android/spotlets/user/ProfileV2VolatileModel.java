// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class ProfileV2VolatileModel
    implements JacksonModel
{

    public final String mArtistUri;
    public final int mFollowersCount;
    public final int mFollowingCount;
    public final String mFullName;
    public final boolean mHasRecentShares;
    public final String mImageUrl;
    public final boolean mIsFollowing;
    public final boolean mIsVerified;
    public final int mPlaylistCount;
    public final String mUri;
    public final String mUserUri;

    public ProfileV2VolatileModel(String s, String s1, int i, int j, int k, String s2, boolean flag, 
            String s3, String s4, boolean flag1, boolean flag2)
    {
        mUri = s;
        mFullName = s1;
        mPlaylistCount = i;
        mImageUrl = s2;
        mFollowersCount = Math.max(0, j);
        mFollowingCount = Math.max(0, k);
        mIsFollowing = flag;
        mUserUri = s3;
        mArtistUri = s4;
        mHasRecentShares = flag1;
        mIsVerified = flag2;
    }
}
