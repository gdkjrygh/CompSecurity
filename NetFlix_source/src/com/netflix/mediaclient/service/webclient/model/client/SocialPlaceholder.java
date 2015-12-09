// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.client;

import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.List;

public abstract class SocialPlaceholder
    implements VideoDetails
{

    private final LoMo lomo;

    public SocialPlaceholder(LoMo lomo1)
    {
        lomo = lomo1;
    }

    public String getActors()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getBifUrl()
    {
        throw new RuntimeException("Not implemented");
    }

    public long getBookmarkCreationTime()
    {
        throw new RuntimeException("Not implemented");
    }

    public int getBookmarkPosition()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getBoxshotURL()
    {
        return null;
    }

    public String getCatalogIdUrl()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getCertification()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getCreators()
    {
        throw new RuntimeException("Not implemented");
    }

    public int getEndtime()
    {
        throw new RuntimeException("Not implemented");
    }

    public int getEpisodeNumber()
    {
        throw new RuntimeException("Not implemented");
    }

    public VideoType getErrorType()
    {
        throw new RuntimeException("Not implemented");
    }

    public List getFacebookFriends()
    {
        return lomo.getFacebookFriends();
    }

    public boolean getFbDntShare()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getGenres()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getHighResolutionLandscapeBoxArtUrl()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getHighResolutionPortraitBoxArtUrl()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getHorzDispUrl()
    {
        return null;
    }

    public String getId()
    {
        return lomo.getId();
    }

    public String getParentId()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getParentTitle()
    {
        throw new RuntimeException("Not implemented");
    }

    public int getPlayableBookmarkPosition()
    {
        throw new RuntimeException("Not implemented");
    }

    public long getPlayableBookmarkUpdateTime()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getPlayableId()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getPlayableTitle()
    {
        throw new RuntimeException("Not implemented");
    }

    public float getPredictedRating()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getQuality()
    {
        throw new RuntimeException("Not implemented");
    }

    public int getRuntime()
    {
        throw new RuntimeException("Not implemented");
    }

    public int getSeasonNumber()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getSquareUrl()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getStoryUrl()
    {
        return null;
    }

    public String getSynopsis()
    {
        throw new RuntimeException("Not implemented");
    }

    public String getTitle()
    {
        return lomo.getTitle();
    }

    public String getTvCardUrl()
    {
        throw new RuntimeException("Not implemented");
    }

    public VideoType getType()
    {
        throw new RuntimeException("Not implemented");
    }

    public float getUserRating()
    {
        throw new RuntimeException("Not implemented");
    }

    public int getYear()
    {
        throw new RuntimeException("Not implemented");
    }

    public boolean isAutoPlayEnabled()
    {
        throw new RuntimeException("Not implemented");
    }

    public boolean isInQueue()
    {
        throw new RuntimeException("Not implemented");
    }

    public boolean isNextPlayableEpisode()
    {
        throw new RuntimeException("Not implemented");
    }

    public boolean isPinProtected()
    {
        throw new RuntimeException("Not implemented");
    }

    public boolean isPlayableEpisode()
    {
        throw new RuntimeException("Not implemented");
    }

    public boolean isUserConnectedToFacebook()
    {
        throw new RuntimeException("Not implemented");
    }

    public boolean isVideoHd()
    {
        throw new RuntimeException("Not implemented");
    }

    public void setUserRating(float f)
    {
        throw new RuntimeException("Not implemented");
    }
}
