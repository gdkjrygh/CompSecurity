// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;


public class PlayableStats
{

    private int likesCount;
    private int repostsCount;

    public PlayableStats()
    {
    }

    public int getLikesCount()
    {
        return likesCount;
    }

    public int getRepostsCount()
    {
        return repostsCount;
    }

    public void setLikesCount(int i)
    {
        likesCount = i;
    }

    public void setRepostsCount(int i)
    {
        repostsCount = i;
    }
}
