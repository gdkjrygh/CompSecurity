// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.api.legacy.model.PlayableStats;

public class ApiTrackStats extends PlayableStats
{

    private int commentsCount;
    private int playbackCount;

    public ApiTrackStats()
    {
    }

    public int getCommentsCount()
    {
        return commentsCount;
    }

    public int getPlaybackCount()
    {
        return playbackCount;
    }

    public void setCommentsCount(int i)
    {
        commentsCount = i;
    }

    public void setPlaybackCount(int i)
    {
        playbackCount = i;
    }
}
