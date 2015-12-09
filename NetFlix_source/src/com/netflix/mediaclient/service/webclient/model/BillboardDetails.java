// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;

import com.netflix.mediaclient.service.webclient.model.branches.Billboard;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.List;

public class BillboardDetails extends Billboard
    implements ShowDetails, MovieDetails, Video
{

    private static final String TAG = "BillboardDetails";

    public BillboardDetails()
    {
    }

    public String getActors()
    {
        if (billboardDetail == null)
        {
            return null;
        } else
        {
            return billboardDetail.actors;
        }
    }

    public String getBifUrl()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public String getBoxshotURL()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getBoxshotURL();
        }
    }

    public String getCatalogIdUrl()
    {
        if (billboardDetail == null)
        {
            return null;
        } else
        {
            return billboardDetail.restUrl;
        }
    }

    public String getCertification()
    {
        if (billboardDetail == null)
        {
            return null;
        } else
        {
            return billboardDetail.certification;
        }
    }

    public String getCreators()
    {
        if (billboardDetail == null)
        {
            return null;
        } else
        {
            return billboardDetail.directors;
        }
    }

    public String getCurrentEpisodeId()
    {
        return getId();
    }

    public int getCurrentEpisodeNumber()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public String getCurrentEpisodeTitle()
    {
        return getTitle();
    }

    public int getCurrentSeasonNumber()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public int getEndtime()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public int getEpisodeNumber()
    {
        return -1;
    }

    public VideoType getErrorType()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getErrorType();
        }
    }

    public List getFacebookFriends()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public boolean getFbDntShare()
    {
        return false;
    }

    public String getGenres()
    {
        if (billboardDetail == null)
        {
            return null;
        } else
        {
            return billboardDetail.genres;
        }
    }

    public String getHighResolutionLandscapeBoxArtUrl()
    {
        if (billboardDetail == null)
        {
            return null;
        } else
        {
            return billboardDetail.mdxHorzUrl;
        }
    }

    public String getHighResolutionPortraitBoxArtUrl()
    {
        if (billboardDetail == null)
        {
            return null;
        } else
        {
            return billboardDetail.mdxVertUrl;
        }
    }

    public String getHorzDispUrl()
    {
        if (billboardDetail == null)
        {
            return null;
        } else
        {
            return billboardDetail.horzDispUrl;
        }
    }

    public String getId()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getId();
        }
    }

    public int getNumOfEpisodes()
    {
        if (billboardDetail == null)
        {
            return -1;
        } else
        {
            return billboardDetail.episodeCount;
        }
    }

    public int getNumOfSeasons()
    {
        if (billboardDetail == null)
        {
            return -1;
        } else
        {
            return billboardDetail.seasonCount;
        }
    }

    public String getParentId()
    {
        return getId();
    }

    public String getParentTitle()
    {
        return getTitle();
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
        if (getType() == VideoType.SHOW)
        {
            return getCurrentEpisodeId();
        } else
        {
            return getId();
        }
    }

    public String getPlayableTitle()
    {
        if (getType() == VideoType.SHOW)
        {
            return getCurrentEpisodeTitle();
        } else
        {
            return getTitle();
        }
    }

    public float getPredictedRating()
    {
        if (billboardDetail == null)
        {
            return -1F;
        } else
        {
            return billboardDetail.predictedRating;
        }
    }

    public String getQuality()
    {
        if (billboardDetail == null)
        {
            return null;
        } else
        {
            return billboardDetail.quality;
        }
    }

    public int getRuntime()
    {
        if (billboardDetail == null)
        {
            return 0;
        } else
        {
            return billboardDetail.runtime;
        }
    }

    public int getSeasonNumber()
    {
        return -1;
    }

    public List getSimilars()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public int getSimilarsListPos()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public String getSimilarsRequestId()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public int getSimilarsTrackId()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public String getSquareUrl()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getSquareUrl();
        }
    }

    public String getStoryUrl()
    {
        if (billboardDetail == null)
        {
            return null;
        } else
        {
            return billboardDetail.storyImgUrl;
        }
    }

    public String getSynopsis()
    {
        if (billboardDetail == null)
        {
            return null;
        } else
        {
            return billboardDetail.synopsis;
        }
    }

    public String getTitle()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getTitle();
        }
    }

    public String getTvCardUrl()
    {
        if (billboardDetail == null)
        {
            return null;
        } else
        {
            return billboardDetail.tvCardUrl;
        }
    }

    public VideoType getType()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getType();
        }
    }

    public float getUserRating()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public int getYear()
    {
        if (billboardDetail == null)
        {
            return 0;
        } else
        {
            return billboardDetail.year;
        }
    }

    public boolean isAutoPlayEnabled()
    {
        if (billboardDetail == null)
        {
            return false;
        } else
        {
            return billboardDetail.isAutoPlayEnabled;
        }
    }

    public boolean isInQueue()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public boolean isNextPlayableEpisode()
    {
        if (billboardDetail == null)
        {
            return false;
        } else
        {
            return billboardDetail.isAutoPlayEnabled;
        }
    }

    public boolean isPinProtected()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public boolean isPlayableEpisode()
    {
        return false;
    }

    public boolean isShared()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public boolean isUserConnectedToFacebook()
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public boolean isVideoHd()
    {
        if (billboardDetail == null)
        {
            return false;
        } else
        {
            return billboardDetail.isHdAvailable;
        }
    }

    public void setUserRating(float f)
    {
        throw new IllegalStateException("Not implemented by BillboardDetails");
    }

    public String toString()
    {
        return (new StringBuilder()).append("BillboardDetails [getTitle()=").append(getTitle()).append(", getId()=").append(getId()).append(", getSynopsis()=").append(getSynopsis()).append(", getQuality()=").append(getQuality()).append(", getActors()=").append(getActors()).append(", getGenres()=").append(getGenres()).append(", getCertification()=").append(getCertification()).append(", getCreators()=").append(getCreators()).append(", getPredictedRating()=").append(getPredictedRating()).append(", getYear()=").append(getYear()).append(", getBoxshotURL()=").append(getBoxshotURL()).append(", getType()=").append(getType()).append(", getNumOfEpisodes()=").append(getNumOfEpisodes()).append(", getNumOfSeasons()=").append(getNumOfSeasons()).append("]").toString();
    }
}
