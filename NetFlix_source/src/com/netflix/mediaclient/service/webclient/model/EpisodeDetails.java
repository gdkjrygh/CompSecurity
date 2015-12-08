// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.webclient.model.branches.Episode;
import com.netflix.mediaclient.service.webclient.model.leafs.SocialEvidence;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.List;

public class EpisodeDetails extends Episode
    implements com.netflix.mediaclient.servicemgr.EpisodeDetails
{

    private static final String TAG = "EpisodeDetails";
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Rating rating;
    public SocialEvidence showSocialEvidence;
    public boolean userConnectedToFacebook;

    public EpisodeDetails()
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
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.getBoxshotURL();
        }
    }

    public String getCatalogIdUrl()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.getShowRestUrl();
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
        return null;
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

    public String getEpisodeIdUrl()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.restUrl;
        }
    }

    public int getEpisodeNumber()
    {
        if (detail == null)
        {
            return -1;
        } else
        {
            return detail.getEpisodeNumber();
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
        return null;
    }

    public boolean getFbDntShare()
    {
        return userConnectedToFacebook && showSocialEvidence != null && !showSocialEvidence.isVideoHidden();
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

    public String getInterestingUrl()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.getInterestingUrl();
        }
    }

    public String getNextEpisodeId()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.getNextEpisodeId();
        }
    }

    public String getNextEpisodeTitle()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.getNextEpisodeTitle();
        }
    }

    public String getParentId()
    {
        return getShowId();
    }

    public String getParentTitle()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.getShowTitle();
        }
    }

    public int getPlayableBookmarkPosition()
    {
        int i = BrowseAgent.computePlayPos(getBookmarkPosition(), getEndtime(), getRuntime());
        if (Log.isLoggable("EpisodeDetails", 3))
        {
            Log.d("EpisodeDetails", String.format("id %s bookmark %d playPos %d endtime %d runtime %d", new Object[] {
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

    public String getSeasonId()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.getSeasonId();
        }
    }

    public int getSeasonNumber()
    {
        if (detail == null)
        {
            return -1;
        } else
        {
            return detail.getSeasonNumber();
        }
    }

    public String getShowId()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.getShowId();
        }
    }

    public String getSquareUrl()
    {
        return null;
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
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.getTitle();
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

    public boolean hasSameSeasonAndEpisodeNumbers(EpisodeDetails episodedetails)
    {
        if (getSeasonNumber() != episodedetails.getSeasonNumber())
        {
            Log.v("EpisodeDetails", String.format("Season number does not match: %d, %d", new Object[] {
                Integer.valueOf(getSeasonNumber()), Integer.valueOf(episodedetails.getSeasonNumber())
            }));
            return false;
        }
        if (getEpisodeNumber() != episodedetails.getEpisodeNumber())
        {
            Log.v("EpisodeDetails", String.format("Episode number does not match: %d, %d", new Object[] {
                Integer.valueOf(getEpisodeNumber()), Integer.valueOf(episodedetails.getEpisodeNumber())
            }));
            return false;
        } else
        {
            Log.v("EpisodeDetails", String.format("Episode and season numbers match: s%d, e%d", new Object[] {
                Integer.valueOf(getSeasonNumber()), Integer.valueOf(getEpisodeNumber())
            }));
            return true;
        }
    }

    public boolean isAutoPlayEnabled()
    {
        if (detail == null)
        {
            return false;
        } else
        {
            return detail.isAutoPlayEnabled();
        }
    }

    public boolean isInQueue()
    {
        return false;
    }

    public boolean isNextPlayableEpisode()
    {
        if (detail == null)
        {
            return false;
        } else
        {
            return detail.isNextPlayableEpisode();
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
        return true;
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
        if (rating != null)
        {
            rating.userRating = f;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("EpisodeDetails [summary=").append(summary).append(", detail=").append(detail).append("]").toString();
    }
}
