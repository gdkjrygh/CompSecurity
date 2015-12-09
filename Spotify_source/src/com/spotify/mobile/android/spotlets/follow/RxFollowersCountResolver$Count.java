// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.follow;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class mFollowingCount
    implements JacksonModel
{

    private final int mFollowersCount;
    private final int mFollowingCount;

    public int getFollowersCount()
    {
        return mFollowersCount;
    }

    public int getFollowingCount()
    {
        return mFollowingCount;
    }

    public (int i, int j)
    {
        mFollowersCount = Math.max(0, i);
        mFollowingCount = Math.max(0, j);
    }
}
