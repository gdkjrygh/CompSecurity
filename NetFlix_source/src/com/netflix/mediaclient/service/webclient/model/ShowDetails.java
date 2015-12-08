// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.webclient.model.branches.Show;
import com.netflix.mediaclient.service.webclient.model.leafs.SocialEvidence;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.List;

public class ShowDetails extends Show
    implements com.netflix.mediaclient.servicemgr.ShowDetails
{

    private static final String TAG = "nf_service_browse_showdetails";
    public com.netflix.mediaclient.service.webclient.model.branches.Episode.Detail currentEpisode;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark currentEpisodeBookmark;
    public boolean userConnectedToFacebook;

    public ShowDetails()
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

    public String getBifUrl()
    {
        if (currentEpisode == null)
        {
            return null;
        } else
        {
            return currentEpisode.bifUrl;
        }
    }

    public long getBookmarkCreationTime()
    {
        if (currentEpisodeBookmark == null)
        {
            return -1L;
        } else
        {
            return currentEpisodeBookmark.getLastModified();
        }
    }

    public int getBookmarkPosition()
    {
        if (currentEpisodeBookmark == null)
        {
            return 0;
        } else
        {
            return currentEpisodeBookmark.getBookmarkPosition();
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

    public String getCurrentEpisodeId()
    {
        if (currentEpisode == null)
        {
            return "null";
        } else
        {
            return currentEpisode.getId();
        }
    }

    public int getCurrentEpisodeNumber()
    {
        if (currentEpisode == null)
        {
            return -1;
        } else
        {
            return currentEpisode.getEpisodeNumber();
        }
    }

    public String getCurrentEpisodeTitle()
    {
        if (currentEpisode == null)
        {
            return "null";
        } else
        {
            return currentEpisode.getTitle();
        }
    }

    public int getCurrentSeasonNumber()
    {
        if (currentEpisode == null)
        {
            return -1;
        } else
        {
            return currentEpisode.getSeasonNumber();
        }
    }

    public int getEndtime()
    {
        if (currentEpisode == null)
        {
            return 0;
        } else
        {
            return currentEpisode.endtime;
        }
    }

    public int getEpisodeNumber()
    {
        if (currentEpisode == null)
        {
            return 0;
        } else
        {
            return currentEpisode.getEpisodeNumber();
        }
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
        if (summary == null)
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

    public int getNumOfEpisodes()
    {
        if (detail == null)
        {
            return -1;
        } else
        {
            return detail.episodeCount;
        }
    }

    public int getNumOfSeasons()
    {
        if (detail == null)
        {
            return -1;
        } else
        {
            return detail.seasonCount;
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
        int i = BrowseAgent.computePlayPos(getBookmarkPosition(), getEndtime(), getRuntime());
        if (Log.isLoggable("nf_service_browse_showdetails", 3))
        {
            Log.d("nf_service_browse_showdetails", String.format("id %s bookmark %d playPos %d endtime %d runtime %d", new Object[] {
                getId(), Integer.valueOf(getBookmarkPosition()), Integer.valueOf(i), Integer.valueOf(getEndtime()), Integer.valueOf(getRuntime())
            }));
        }
        return i;
    }

    public long getPlayableBookmarkUpdateTime()
    {
        return getBookmarkCreationTime();
    }

    public String getPlayableId()
    {
        return getCurrentEpisodeId();
    }

    public String getPlayableTitle()
    {
        return getCurrentEpisodeTitle();
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
        if (currentEpisode == null)
        {
            return 0;
        } else
        {
            return currentEpisode.runtime;
        }
    }

    public int getSeasonNumber()
    {
        if (currentEpisode == null)
        {
            return 0;
        } else
        {
            return currentEpisode.getSeasonNumber();
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
        if (currentEpisode == null)
        {
            return false;
        } else
        {
            return currentEpisode.isAutoPlayEnabled();
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
        if (currentEpisode == null)
        {
            return false;
        } else
        {
            return currentEpisode.isNextPlayableEpisode();
        }
    }

    public boolean isPinProtected()
    {
        if (currentEpisode == null)
        {
            return false;
        } else
        {
            return currentEpisode.isPinProtected;
        }
    }

    public boolean isPlayableEpisode()
    {
        return currentEpisode != null;
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
