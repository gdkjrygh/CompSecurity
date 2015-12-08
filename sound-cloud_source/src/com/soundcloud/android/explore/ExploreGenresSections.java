// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import java.util.List;

public class ExploreGenresSections
{

    private List mAudio;
    private List mMusic;

    public ExploreGenresSections()
    {
    }

    public List getAudio()
    {
        return mAudio;
    }

    public List getMusic()
    {
        return mMusic;
    }

    public void setAudio(List list)
    {
        mAudio = list;
    }

    public void setMusic(List list)
    {
        mMusic = list;
    }
}
