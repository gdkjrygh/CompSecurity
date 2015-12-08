// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.List;

class DummyMdxVideoDetails
    implements EpisodeDetails
{

    DummyMdxVideoDetails()
    {
    }

    public String getActors()
    {
        return null;
    }

    public String getBifUrl()
    {
        return null;
    }

    public int getBookmarkPosition()
    {
        return 0;
    }

    public String getBoxshotURL()
    {
        return "http://dummyimage.com/150x214/bb0000/884444.png&text=Boxshot+Img";
    }

    public String getCatalogIdUrl()
    {
        return null;
    }

    public String getCertification()
    {
        return null;
    }

    public String getCreators()
    {
        return null;
    }

    public int getEndtime()
    {
        return 0;
    }

    public String getEpisodeIdUrl()
    {
        return null;
    }

    public int getEpisodeNumber()
    {
        return 6;
    }

    public VideoType getErrorType()
    {
        return null;
    }

    public List getFacebookFriends()
    {
        return null;
    }

    public boolean getFbDntShare()
    {
        return false;
    }

    public String getGenres()
    {
        return null;
    }

    public String getHighResolutionLandscapeBoxArtUrl()
    {
        return null;
    }

    public String getHighResolutionPortraitBoxArtUrl()
    {
        return null;
    }

    public String getHorzDispUrl()
    {
        return "http://dummyimage.com/665x375/bb0000/884444.png&text=Horz+Disp+Img";
    }

    public String getId()
    {
        return "70178217";
    }

    public String getInterestingUrl()
    {
        return null;
    }

    public String getNextEpisodeId()
    {
        return null;
    }

    public String getNextEpisodeTitle()
    {
        return null;
    }

    public String getParentId()
    {
        return "70178217";
    }

    public String getParentTitle()
    {
        return "Dummy parent title - extra long version of the string to test textView ellipsize functionality";
    }

    public int getPlayableBookmarkPosition()
    {
        return 0;
    }

    public long getPlayableBookmarkUpdateTime()
    {
        return 0L;
    }

    public String getPlayableId()
    {
        return "70178217";
    }

    public String getPlayableTitle()
    {
        return "Dummy playable title";
    }

    public float getPredictedRating()
    {
        return 3.5F;
    }

    public String getQuality()
    {
        return null;
    }

    public int getRuntime()
    {
        return 4980;
    }

    public String getSeasonId()
    {
        return "70178217";
    }

    public int getSeasonNumber()
    {
        return 5;
    }

    public String getShowId()
    {
        return "70248301";
    }

    public String getSquareUrl()
    {
        return null;
    }

    public String getStoryUrl()
    {
        return null;
    }

    public String getSynopsis()
    {
        return null;
    }

    public String getTitle()
    {
        return "Dummy MDX Title, Super Extra-Long Version";
    }

    public String getTvCardUrl()
    {
        return "http://dummyimage.com/265x149/0000ff/ffffff.png&text=TV+Card+Img";
    }

    public VideoType getType()
    {
        return VideoType.EPISODE;
    }

    public float getUserRating()
    {
        return 0.0F;
    }

    public int getYear()
    {
        return 0;
    }

    public boolean isAutoPlayEnabled()
    {
        return false;
    }

    public boolean isInQueue()
    {
        return false;
    }

    public boolean isNextPlayableEpisode()
    {
        return false;
    }

    public boolean isPinProtected()
    {
        return false;
    }

    public boolean isPlayableEpisode()
    {
        return false;
    }

    public boolean isUserConnectedToFacebook()
    {
        return false;
    }

    public boolean isVideoHd()
    {
        return true;
    }

    public void setUserRating(float f)
    {
    }
}
