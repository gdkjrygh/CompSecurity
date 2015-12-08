// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.protocol.nflx;

import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.protocol.nflx:
//            NflxHandler

private static class mShowId
{

    public static <init> DELAYED;
    private final String mCatalogId;
    private final boolean mHandleWithDelay;
    private final String mShowId;
    private final VideoType mVideoType;

    public static mShowId createFromEpisode(String s, String s1)
    {
        if (StringUtils.safeEquals(s, s1))
        {
            return new <init>(false, s);
        } else
        {
            return new <init>(false, s, s1);
        }
    }

    public static <init> createFromMovie(String s)
    {
        return new <init>(false, VideoType.MOVIE, s);
    }

    public static <init> createFromShow(String s)
    {
        return new <init>(false, VideoType.SHOW, s);
    }

    public String getCatalogId()
    {
        return mCatalogId;
    }

    public String getShowId()
    {
        return mShowId;
    }

    public VideoType getVideoType()
    {
        return mVideoType;
    }

    public boolean handleWithDelay()
    {
        return mHandleWithDelay;
    }

    static 
    {
        DELAYED = new <init>(true, VideoType.UNAVAILABLE, null);
    }

    private A(boolean flag, VideoType videotype, String s)
    {
        mHandleWithDelay = flag;
        mVideoType = videotype;
        mCatalogId = s;
        mShowId = null;
    }

    private mShowId(boolean flag, String s)
    {
        mHandleWithDelay = flag;
        mVideoType = VideoType.SHOW;
        mCatalogId = s;
        mShowId = null;
    }

    private mShowId(boolean flag, String s, String s1)
    {
        mHandleWithDelay = flag;
        mVideoType = VideoType.EPISODE;
        mCatalogId = s1;
        mShowId = s;
    }
}
