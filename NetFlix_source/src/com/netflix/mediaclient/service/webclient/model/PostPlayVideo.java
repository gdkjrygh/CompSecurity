// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;

import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.SocialEvidence;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.List;

public class PostPlayVideo
    implements com.netflix.mediaclient.servicemgr.PostPlayVideo
{
    public class PostPlayContext
    {

        String requestId;
        final PostPlayVideo this$0;
        int trackId;

        public PostPlayContext()
        {
            this$0 = PostPlayVideo.this;
            super();
        }
    }


    public com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark bookmark;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail;
    public com.netflix.mediaclient.service.webclient.model.branches.Episode.Detail episodeDetail;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.InQueue inQueue;
    public PostPlayContext postplayContext;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Rating rating;
    public SocialEvidence socialEvidence;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Summary summary;
    public boolean userConnectedToFacebook;

    public PostPlayVideo()
    {
    }

    private String getSynopsisNarrative(com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail1)
    {
        if (detail1.synopsisNarrative != null)
        {
            return detail1.synopsisNarrative;
        } else
        {
            return detail1.synopsis;
        }
    }

    public String getActors()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.directors;
        }
    }

    public String getBifUrl()
    {
        if (!VideoType.MOVIE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (detail != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return detail.bifUrl;
_L2:
        if (episodeDetail != null)
        {
            return episodeDetail.bifUrl;
        }
        if (true) goto _L3; else goto _L5
_L5:
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
        if (!VideoType.MOVIE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (detail != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return detail.restUrl;
_L2:
        if (episodeDetail != null)
        {
            return episodeDetail.restUrl;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public String getCertification()
    {
        if (VideoType.EPISODE.equals(getType()) || detail == null)
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
        if (!VideoType.MOVIE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (detail != null) goto _L4; else goto _L3
_L3:
        return 0;
_L4:
        return detail.endtime;
_L2:
        if (episodeDetail != null)
        {
            return episodeDetail.endtime;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public int getEpisodeNumber()
    {
        if (episodeDetail == null)
        {
            return 0;
        } else
        {
            return episodeDetail.getEpisodeNumber();
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
        if (!VideoType.EPISODE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (episodeDetail != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return episodeDetail.mdxHorzUrl;
_L2:
        if (detail != null)
        {
            return detail.mdxHorzUrl;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public String getHighResolutionPortraitBoxArtUrl()
    {
        if (!VideoType.EPISODE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (episodeDetail != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return episodeDetail.mdxVertUrl;
_L2:
        if (detail != null)
        {
            return detail.mdxVertUrl;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public String getHorzDispUrl()
    {
        if (!VideoType.EPISODE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (episodeDetail != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return episodeDetail.horzDispUrl;
_L2:
        if (detail != null)
        {
            return detail.horzDispUrl;
        }
        if (true) goto _L3; else goto _L5
_L5:
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
        if (!VideoType.EPISODE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (episodeDetail != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return episodeDetail.getInterestingUrl();
_L2:
        if (detail != null)
        {
            return detail.storyImgUrl;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public String getParentId()
    {
        if (episodeDetail == null)
        {
            return null;
        } else
        {
            return episodeDetail.getShowId();
        }
    }

    public String getParentTitle()
    {
        if (episodeDetail == null)
        {
            return null;
        } else
        {
            return episodeDetail.getShowTitle();
        }
    }

    public int getPlayableBookmarkPosition()
    {
        int i;
        if (bookmark == null)
        {
            i = -1;
        } else
        {
            i = bookmark.getBookmarkPosition();
        }
        return BrowseAgent.computePlayPos(i, getEndtime(), getRuntime());
    }

    public long getPlayableBookmarkUpdateTime()
    {
        if (bookmark == null)
        {
            return 0L;
        } else
        {
            return bookmark.getLastModified();
        }
    }

    public String getPlayableId()
    {
        if (VideoType.SHOW.equals(getType()))
        {
            if (episodeDetail == null)
            {
                return null;
            } else
            {
                return episodeDetail.getId();
            }
        } else
        {
            return getId();
        }
    }

    public String getPlayableTitle()
    {
        if (VideoType.MOVIE.equals(getType()))
        {
            return getTitle();
        }
        if (episodeDetail == null)
        {
            return null;
        } else
        {
            return episodeDetail.getTitle();
        }
    }

    public String getPostPlayRequestId()
    {
        if (postplayContext == null)
        {
            return null;
        } else
        {
            return postplayContext.requestId;
        }
    }

    public int getPostPlayTrackId()
    {
        if (postplayContext == null)
        {
            return 0;
        } else
        {
            return postplayContext.trackId;
        }
    }

    public float getPredictedRating()
    {
        if (VideoType.EPISODE.equals(getType()) || detail == null)
        {
            return 0.0F;
        } else
        {
            return detail.predictedRating;
        }
    }

    public String getQuality()
    {
        return null;
    }

    public int getRuntime()
    {
        if (!VideoType.MOVIE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (detail != null) goto _L4; else goto _L3
_L3:
        return 0;
_L4:
        return detail.endtime;
_L2:
        if (episodeDetail != null)
        {
            return episodeDetail.endtime;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public int getSeasonNumber()
    {
        if (episodeDetail == null)
        {
            return 0;
        } else
        {
            return episodeDetail.getSeasonNumber();
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
        if (!VideoType.EPISODE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (episodeDetail != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return episodeDetail.storyImgUrl;
_L2:
        if (detail != null)
        {
            return detail.storyImgUrl;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public String getSynopsis()
    {
        if (!VideoType.EPISODE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (episodeDetail != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return episodeDetail.synopsis;
_L2:
        if (detail != null)
        {
            return getSynopsisNarrative(detail);
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public String getTitle()
    {
        if (!VideoType.EPISODE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (episodeDetail != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return episodeDetail.getTitle();
_L2:
        if (summary != null)
        {
            return summary.getTitle();
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public String getTvCardUrl()
    {
        if (!VideoType.EPISODE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (episodeDetail != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return episodeDetail.tvCardUrl;
_L2:
        if (detail != null)
        {
            return detail.tvCardUrl;
        }
        if (true) goto _L3; else goto _L5
_L5:
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
        if (VideoType.EPISODE.equals(getType()) || rating == null)
        {
            return 0.0F;
        } else
        {
            return rating.userRating;
        }
    }

    public int getYear()
    {
        if (!VideoType.EPISODE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (episodeDetail != null) goto _L4; else goto _L3
_L3:
        return 0;
_L4:
        return episodeDetail.year;
_L2:
        if (detail != null)
        {
            return detail.year;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isAutoPlayEnabled()
    {
        if (!VideoType.MOVIE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (detail != null) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        return detail.isAutoPlayEnabled;
_L2:
        if (episodeDetail != null)
        {
            return episodeDetail.isAutoPlayEnabled();
        }
        if (true) goto _L3; else goto _L5
_L5:
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
        if (VideoType.MOVIE.equals(getType()) || episodeDetail == null)
        {
            return false;
        } else
        {
            return episodeDetail.isNextPlayableEpisode();
        }
    }

    public boolean isPinProtected()
    {
        if (!VideoType.EPISODE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (episodeDetail != null) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        return episodeDetail.isPinProtected;
_L2:
        if (detail != null)
        {
            return detail.isPinProtected;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isPlayableEpisode()
    {
        return !VideoType.MOVIE.equals(getType());
    }

    public boolean isUserConnectedToFacebook()
    {
        return userConnectedToFacebook;
    }

    public boolean isVideoHd()
    {
        if (VideoType.MOVIE.equals(getType()))
        {
            return detail.isHdAvailable;
        }
        if (episodeDetail == null)
        {
            return false;
        } else
        {
            return episodeDetail.isHdAvailable;
        }
    }

    public void setUserRating(float f)
    {
    }
}
