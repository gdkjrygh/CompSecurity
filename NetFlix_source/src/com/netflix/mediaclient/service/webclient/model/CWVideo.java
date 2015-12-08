// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.SocialEvidence;
import com.netflix.mediaclient.service.webclient.model.leafs.TrackableListSummary;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.List;

public class CWVideo
    implements com.netflix.mediaclient.servicemgr.CWVideo
{

    private static final String TAG = "nf_service_browse_cwvideo";
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark bookmark;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.BookmarkStill bookmarkStill;
    public com.netflix.mediaclient.service.webclient.model.branches.Episode.Detail currentEpisode;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark currentEpisodeBookmark;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.InQueue inQueue;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Rating rating;
    public TrackableListSummary similarListSummary;
    public List similarVideos;
    public SocialEvidence socialEvidence;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Summary summary;
    public boolean userConnectedToFacebook;

    public CWVideo()
    {
    }

    public String getBaseUrl()
    {
        String s;
        if (detail == null)
        {
            s = null;
        } else
        {
            s = detail.baseUrl;
        }
        if (currentEpisode == null)
        {
            return s;
        } else
        {
            return currentEpisode.baseUrl;
        }
    }

    public long getBookmarkLastUpdateTime()
    {
        long l = -1L;
        if (bookmark != null)
        {
            l = bookmark.getLastModified();
        }
        if (currentEpisodeBookmark != null)
        {
            l = currentEpisodeBookmark.getLastModified();
        }
        return l;
    }

    public int getBookmarkPosition()
    {
        int i = 0;
        if (bookmark != null)
        {
            i = bookmark.getBookmarkPosition();
        }
        if (currentEpisodeBookmark != null)
        {
            i = currentEpisodeBookmark.getBookmarkPosition();
        }
        return i;
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
        if (currentEpisode == null)
        {
            return -1;
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
            return detail.intrUrl;
        }
    }

    public String getNextEpisodeId()
    {
        if (currentEpisode == null)
        {
            return null;
        } else
        {
            return currentEpisode.getNextEpisodeId();
        }
    }

    public String getParentId()
    {
        return getId();
    }

    public String getParentTitle()
    {
        if (VideoType.MOVIE.equals(getType()))
        {
            return null;
        } else
        {
            return getTitle();
        }
    }

    public int getPlayableBookmarkPosition()
    {
        int i = BrowseAgent.computePlayPos(getBookmarkPosition(), getEndtime(), getRuntime());
        if (Log.isLoggable("nf_service_browse_cwvideo", 3))
        {
            Log.d("nf_service_browse_cwvideo", String.format("id %s bookmark %d playPos %d endtime %d runtime %d", new Object[] {
                getId(), Integer.valueOf(getBookmarkPosition()), Integer.valueOf(i), Integer.valueOf(getEndtime()), Integer.valueOf(getRuntime())
            }));
        }
        return i;
    }

    public long getPlayableBookmarkUpdateTime()
    {
        return getBookmarkLastUpdateTime();
    }

    public String getPlayableId()
    {
        if (VideoType.MOVIE.equals(getType()))
        {
            return getId();
        } else
        {
            return getCurrentEpisodeId();
        }
    }

    public String getPlayableTitle()
    {
        if (VideoType.MOVIE.equals(getType()))
        {
            return getTitle();
        } else
        {
            return getCurrentEpisodeTitle();
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
        if (currentEpisode == null)
        {
            return -1;
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

    public String getStillUrl()
    {
        if (bookmarkStill == null)
        {
            return null;
        } else
        {
            return bookmarkStill.stillUrl;
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
        if (currentEpisode != null)
        {
            return currentEpisode.isAutoPlayEnabled();
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isNextPlayableEpisode()
    {
        if (!VideoType.SHOW.equals(getType()) || currentEpisode == null)
        {
            return false;
        } else
        {
            return currentEpisode.isNextPlayableEpisode();
        }
    }

    public boolean isPinProtected()
    {
        if (!VideoType.MOVIE.equals(getType())) goto _L2; else goto _L1
_L1:
        if (detail != null) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        return detail.isPinProtected;
_L2:
        if (currentEpisode != null)
        {
            return currentEpisode.isPinProtected;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isPlayableEpisode()
    {
        return currentEpisode != null;
    }

    public boolean isUserConnectedToFacebook()
    {
        return userConnectedToFacebook;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CWVideo [summary=").append(summary).append(", bookmark=").append(bookmark).append(", currentEpisode=").append(currentEpisode).append(", currentEpisodeBookmark=").append(currentEpisodeBookmark).append(", inQueue=").append(inQueue).append(", rating=").append(rating).append(", stillUrl=").append(getStillUrl()).append(", ").append(super.toString()).append("]").toString();
    }
}
