// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import com.netflix.mediaclient.servicemgr.Playable;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.Asset;

class TitlePlayable
    implements Playable
{

    private int mDuration;
    private int mEndtime;
    private boolean mEpisode;
    private int mEpisodeNumber;
    private boolean mIsAutoPlayEnabled;
    private boolean mIsNextPlayableEpisode;
    private boolean mIsPinProtected;
    private String mParentId;
    private String mParentTitle;
    private String mPlayableId;
    private int mPlaybackBookmark;
    private int mSeasonNumber;
    private boolean mSocialDoNotShareVisible;
    private String mTitle;
    private long mWatchedDate;

    TitlePlayable(Asset asset)
    {
        mPlayableId = asset.getPlayableId();
        mParentId = asset.getParentId();
        mEpisode = asset.isEpisode();
        mTitle = asset.getTitle();
        mParentTitle = asset.getParentTitle();
        mWatchedDate = asset.getWatchedDate();
        mPlaybackBookmark = asset.getPlaybackBookmark();
        mSocialDoNotShareVisible = asset.isSocialDoNotShareVisible();
        mSeasonNumber = asset.getSeasonNumber();
        mEpisodeNumber = asset.getEpisodeNumber();
        mDuration = asset.getDuration();
        mIsAutoPlayEnabled = asset.isAutoPlayEnabled();
        mIsNextPlayableEpisode = asset.isNextPlayableEpisode();
        mIsPinProtected = asset.isPinProtected();
    }

    public String getBoxshotURL()
    {
        return null;
    }

    public int getEndtime()
    {
        return mEndtime;
    }

    public int getEpisodeNumber()
    {
        return mEpisodeNumber;
    }

    public VideoType getErrorType()
    {
        return null;
    }

    public boolean getFbDntShare()
    {
        return mSocialDoNotShareVisible;
    }

    public String getHorzDispUrl()
    {
        return null;
    }

    public String getId()
    {
        return mPlayableId;
    }

    public String getParentId()
    {
        return mParentId;
    }

    public String getParentTitle()
    {
        return mParentTitle;
    }

    public int getPlayableBookmarkPosition()
    {
        return mPlaybackBookmark;
    }

    public long getPlayableBookmarkUpdateTime()
    {
        return mWatchedDate;
    }

    public String getPlayableId()
    {
        return mPlayableId;
    }

    public String getPlayableTitle()
    {
        return mTitle;
    }

    public int getRuntime()
    {
        return mDuration;
    }

    public int getSeasonNumber()
    {
        return mSeasonNumber;
    }

    public String getSquareUrl()
    {
        return null;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getTvCardUrl()
    {
        return null;
    }

    public VideoType getType()
    {
        return null;
    }

    public boolean isAutoPlayEnabled()
    {
        return mIsAutoPlayEnabled;
    }

    public boolean isNextPlayableEpisode()
    {
        return mIsNextPlayableEpisode;
    }

    public boolean isPinProtected()
    {
        return mIsPinProtected;
    }

    public boolean isPlayableEpisode()
    {
        return mEpisode;
    }

    public boolean isUserConnectedToFacebook()
    {
        return mSocialDoNotShareVisible;
    }
}
