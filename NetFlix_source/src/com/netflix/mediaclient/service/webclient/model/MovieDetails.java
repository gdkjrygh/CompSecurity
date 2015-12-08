// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.webclient.model.branches.Movie;
import com.netflix.mediaclient.service.webclient.model.leafs.SocialEvidence;
import com.netflix.mediaclient.service.webclient.model.leafs.TrackableListSummary;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.List;

public class MovieDetails extends Movie
    implements com.netflix.mediaclient.servicemgr.MovieDetails
{

    private static final String TAG = "nf_service_browse_moviedetails";
    public TrackableListSummary similarListSummary;
    public List similarVideos;
    public boolean userConnectedToFacebook;

    public MovieDetails()
    {
    }

    public String getActors()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.actors;
        }
    }

    public String getBaseUrl()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.baseUrl;
        }
    }

    public String getBifUrl()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.bifUrl;
        }
    }

    public int getBookmarkPosition()
    {
        if (bookmark == null)
        {
            return 0;
        } else
        {
            return bookmark.getBookmarkPosition();
        }
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
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.restUrl;
        }
    }

    public String getCertification()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.certification;
        }
    }

    public String getCreators()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.directors;
        }
    }

    public int getEndtime()
    {
        if (detail == null)
        {
            return 0;
        } else
        {
            return detail.endtime;
        }
    }

    public int getEpisodeNumber()
    {
        return 0;
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
        if (socialEvidence == null)
        {
            return null;
        } else
        {
            return socialEvidence.getFacebookFriends();
        }
    }

    public boolean getFbDntShare()
    {
        return userConnectedToFacebook && socialEvidence != null && !socialEvidence.isVideoHidden();
    }

    public String getGenres()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.genres;
        }
    }

    public String getHighResolutionLandscapeBoxArtUrl()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.mdxHorzUrl;
        }
    }

    public String getHighResolutionPortraitBoxArtUrl()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.mdxVertUrl;
        }
    }

    public String getHorzDispUrl()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.horzDispUrl;
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
        int i = BrowseAgent.computePlayPos(getBookmarkPosition(), getEndtime(), getRuntime());
        if (Log.isLoggable("nf_service_browse_moviedetails", 3))
        {
            Log.d("nf_service_browse_moviedetails", String.format("id %s bookmark %d playPos %d endtime %d runtime %d", new Object[] {
                getId(), Integer.valueOf(getBookmarkPosition()), Integer.valueOf(i), Integer.valueOf(getEndtime()), Integer.valueOf(getRuntime())
            }));
        }
        return i;
    }

    public long getPlayableBookmarkUpdateTime()
    {
        if (bookmark == null)
        {
            return -1L;
        } else
        {
            return bookmark.getLastModified();
        }
    }

    public String getPlayableId()
    {
        return getId();
    }

    public String getPlayableTitle()
    {
        return getTitle();
    }

    public float getPredictedRating()
    {
        if (detail == null)
        {
            return -1F;
        } else
        {
            return detail.predictedRating;
        }
    }

    public String getQuality()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.quality;
        }
    }

    public int getRuntime()
    {
        if (detail == null)
        {
            return 0;
        } else
        {
            return detail.runtime;
        }
    }

    public int getSeasonNumber()
    {
        return 0;
    }

    public List getSimilars()
    {
        return similarVideos;
    }

    public int getSimilarsListPos()
    {
        return 0;
    }

    public String getSimilarsRequestId()
    {
        if (similarListSummary != null)
        {
            return similarListSummary.getRequestId();
        } else
        {
            return null;
        }
    }

    public int getSimilarsTrackId()
    {
        if (similarListSummary != null)
        {
            return similarListSummary.getTrackId();
        } else
        {
            return 0;
        }
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
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.storyImgUrl;
        }
    }

    public String getSynopsis()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.synopsis;
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
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.tvCardUrl;
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
        if (rating == null)
        {
            return -1F;
        } else
        {
            return rating.userRating;
        }
    }

    public int getYear()
    {
        if (detail == null)
        {
            return 0;
        } else
        {
            return detail.year;
        }
    }

    public boolean isAutoPlayEnabled()
    {
        if (detail == null)
        {
            return false;
        } else
        {
            return detail.isAutoPlayEnabled;
        }
    }

    public boolean isInQueue()
    {
        if (inQueue == null)
        {
            return false;
        } else
        {
            return inQueue.inQueue;
        }
    }

    public boolean isNextPlayableEpisode()
    {
        if (detail == null)
        {
            return false;
        } else
        {
            return detail.isNextPlayableEpisode;
        }
    }

    public boolean isPinProtected()
    {
        if (detail == null)
        {
            return false;
        } else
        {
            return detail.isPinProtected;
        }
    }

    public boolean isPlayableEpisode()
    {
        return VideoType.EPISODE.equals(getType());
    }

    public boolean isShared()
    {
        return userConnectedToFacebook && socialEvidence != null && !socialEvidence.isVideoHidden() && getPlayableBookmarkPosition() > 0;
    }

    public boolean isUserConnectedToFacebook()
    {
        return userConnectedToFacebook;
    }

    public boolean isVideoHd()
    {
        if (detail == null)
        {
            return false;
        } else
        {
            return detail.isHdAvailable;
        }
    }

    public void setBookmarkPosition(int i)
    {
        if (bookmark != null)
        {
            bookmark.setBookmarkPosition(i);
        }
    }

    public void setUserRating(float f)
    {
        rating.userRating = f;
    }
}
