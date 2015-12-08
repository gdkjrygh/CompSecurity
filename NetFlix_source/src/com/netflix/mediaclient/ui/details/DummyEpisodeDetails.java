// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DummyEpisodeDetails
    implements EpisodeDetails
{

    private final int epNumber;

    public DummyEpisodeDetails(int i)
    {
        epNumber = i;
    }

    public static List createDummyArray()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < 100; i++)
        {
            arraylist.add(new DummyEpisodeDetails(i));
        }

        return arraylist;
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
        return (new Random()).nextInt(100);
    }

    public String getBoxshotURL()
    {
        return null;
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
        return epNumber;
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
        return null;
    }

    public String getId()
    {
        return String.valueOf(epNumber);
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
        return null;
    }

    public String getParentTitle()
    {
        return null;
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
        return null;
    }

    public String getPlayableTitle()
    {
        return null;
    }

    public float getPredictedRating()
    {
        return 0.0F;
    }

    public String getQuality()
    {
        return null;
    }

    public int getRuntime()
    {
        return 100;
    }

    public String getSeasonId()
    {
        return null;
    }

    public int getSeasonNumber()
    {
        return 0;
    }

    public String getShowId()
    {
        return null;
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
        return "GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB GKB";
    }

    public String getTitle()
    {
        return (new StringBuilder()).append("Episode ").append(epNumber).toString();
    }

    public String getTvCardUrl()
    {
        return null;
    }

    public VideoType getType()
    {
        return null;
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
        return true;
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
