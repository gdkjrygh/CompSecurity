// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class PlaylistModel
    implements JacksonModel
{

    private final String mCuratorName;
    private final String mCuratorUri;
    private final int mFollowersCount;
    private final String mImageUrl;
    private final String mName;
    private final String mUri;

    public PlaylistModel(String s, String s1, int i, String s2, String s3, String s4)
    {
        mUri = s;
        mName = s1;
        mFollowersCount = i;
        mImageUrl = s2;
        mCuratorUri = s3;
        mCuratorName = s4;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlaylistModel)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (PlaylistModel)obj;
            if (TextUtils.equals(mUri, ((PlaylistModel) (obj)).mUri) && TextUtils.equals(mName, ((PlaylistModel) (obj)).mName) && mFollowersCount == ((PlaylistModel) (obj)).mFollowersCount && TextUtils.equals(mImageUrl, ((PlaylistModel) (obj)).mImageUrl) && TextUtils.equals(mCuratorUri, ((PlaylistModel) (obj)).mCuratorUri) && TextUtils.equals(mCuratorName, ((PlaylistModel) (obj)).mCuratorName))
            {
                return true;
            }
        }
        return false;
    }

    public String getCuratorName()
    {
        return mCuratorName;
    }

    public String getCuratorUri()
    {
        return mCuratorUri;
    }

    public int getFollowersCount()
    {
        return mFollowersCount;
    }

    public String getImageUrl()
    {
        return mImageUrl;
    }

    public String getName()
    {
        return mName;
    }

    public String getUri()
    {
        return mUri;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        int j1;
        if (mUri != null)
        {
            i = mUri.hashCode();
        } else
        {
            i = 0;
        }
        if (mName != null)
        {
            j = mName.hashCode();
        } else
        {
            j = 0;
        }
        j1 = mFollowersCount;
        if (mImageUrl != null)
        {
            k = mImageUrl.hashCode();
        } else
        {
            k = 0;
        }
        if (mCuratorUri != null)
        {
            l = mCuratorUri.hashCode();
        } else
        {
            l = 0;
        }
        if (mCuratorName != null)
        {
            i1 = mCuratorName.hashCode();
        }
        return (l + (k + ((j + i * 31) * 31 + j1) * 31) * 31) * 31 + i1;
    }
}
