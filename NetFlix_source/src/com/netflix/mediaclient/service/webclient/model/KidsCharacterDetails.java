// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.TrackableListSummary;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.List;

public class KidsCharacterDetails
    implements com.netflix.mediaclient.servicemgr.KidsCharacterDetails
{

    private static final String TAG = "nf_kidscharacter";
    public TrackableListSummary galleryListSummary;
    public List galleryVideos;
    public com.netflix.mediaclient.service.webclient.model.branches.KidsCharacter.KidsDetail kidsDetail;
    public com.netflix.mediaclient.service.webclient.model.branches.KidsCharacter.KidsSummary kidsSummary;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark watchNextBookmark;
    public com.netflix.mediaclient.service.webclient.model.branches.Episode.Detail watchNextEpisodeDetail;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Detail watchNextMovieDetail;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Summary watchNextSummary;

    public KidsCharacterDetails()
    {
    }

    private String getCharacterSquareUrl()
    {
        if (kidsSummary == null)
        {
            return null;
        } else
        {
            return kidsSummary.getSquareUrl();
        }
    }

    private boolean getHasWatchedRecently()
    {
        if (kidsDetail == null)
        {
            return false;
        } else
        {
            return kidsDetail.hasWatchedRecently;
        }
    }

    private com.netflix.mediaclient.service.webclient.model.branches.Video.Detail getWatchNextDetails()
    {
        if (VideoType.MOVIE.equals(getType()))
        {
            return watchNextMovieDetail;
        }
        if (VideoType.EPISODE.equals(getType()))
        {
            return watchNextEpisodeDetail;
        } else
        {
            return null;
        }
    }

    private String getWatchNextSquareUrl()
    {
        if (watchNextSummary == null)
        {
            return null;
        } else
        {
            return watchNextSummary.getSquareUrl();
        }
    }

    private Boolean isFirstPlay()
    {
        boolean flag = true;
        if (kidsDetail == null)
        {
            return Boolean.valueOf(true);
        }
        if (getHasWatchedRecently() || VideoType.EPISODE.equals(getType()) && getEpisodeNumber() != 1 || getPlayableBookmarkPosition() > 0)
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public String getBifUrl()
    {
        com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail = getWatchNextDetails();
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.bifUrl;
        }
    }

    public String getBoxshotURL()
    {
        if (watchNextSummary == null)
        {
            return null;
        } else
        {
            return watchNextSummary.getBoxshotURL();
        }
    }

    public String getCatalogIdUrl()
    {
        com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail = getWatchNextDetails();
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.restUrl;
        }
    }

    public String getCharacterId()
    {
        if (kidsSummary == null)
        {
            return null;
        } else
        {
            return kidsSummary.getId();
        }
    }

    public String getCharacterName()
    {
        if (kidsSummary == null)
        {
            return null;
        } else
        {
            return kidsSummary.getTitle();
        }
    }

    public String getCharacterSynopsis()
    {
        if (kidsDetail == null)
        {
            return null;
        } else
        {
            return kidsDetail.synopsis;
        }
    }

    public int getEndtime()
    {
        com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail = getWatchNextDetails();
        if (detail == null)
        {
            return -1;
        } else
        {
            return detail.endtime;
        }
    }

    public int getEpisodeNumber()
    {
        if (!VideoType.EPISODE.equals(getType()) || watchNextEpisodeDetail == null)
        {
            return 0;
        } else
        {
            return watchNextEpisodeDetail.getEpisodeNumber();
        }
    }

    public VideoType getErrorType()
    {
        if (watchNextSummary == null)
        {
            return VideoType.UNKNOWN;
        } else
        {
            return watchNextSummary.getErrorType();
        }
    }

    public boolean getFbDntShare()
    {
        return true;
    }

    public List getGallery()
    {
        return galleryVideos;
    }

    public String getGalleryRequestId()
    {
        if (galleryListSummary == null)
        {
            return null;
        } else
        {
            return galleryListSummary.getRequestId();
        }
    }

    public int getGalleryTrackId()
    {
        if (galleryListSummary == null)
        {
            return 0;
        } else
        {
            return galleryListSummary.getTrackId();
        }
    }

    public String getHighResolutionLandscapeBoxArtUrl()
    {
        com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail = getWatchNextDetails();
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
        com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail = getWatchNextDetails();
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
        com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail = getWatchNextDetails();
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
        return getPlayableId();
    }

    public String getParentId()
    {
        if (!VideoType.EPISODE.equals(getType()) || watchNextEpisodeDetail == null)
        {
            return null;
        } else
        {
            return watchNextEpisodeDetail.getShowId();
        }
    }

    public String getParentTitle()
    {
        if (!VideoType.EPISODE.equals(getType()) || watchNextEpisodeDetail == null)
        {
            return null;
        } else
        {
            return watchNextEpisodeDetail.getShowTitle();
        }
    }

    public int getPlayableBookmarkPosition()
    {
        int i;
        if (watchNextBookmark == null)
        {
            i = 0;
        } else
        {
            i = watchNextBookmark.getBookmarkPosition();
        }
        return BrowseAgent.computePlayPos(i, getEndtime(), getRuntime());
    }

    public long getPlayableBookmarkUpdateTime()
    {
        if (watchNextBookmark == null)
        {
            return 0L;
        } else
        {
            return watchNextBookmark.getLastModified();
        }
    }

    public String getPlayableId()
    {
        if (watchNextSummary == null)
        {
            return null;
        } else
        {
            return watchNextSummary.getId();
        }
    }

    public String getPlayableTitle()
    {
        if (watchNextSummary == null)
        {
            return null;
        } else
        {
            return watchNextSummary.getTitle();
        }
    }

    public int getRuntime()
    {
        com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail = getWatchNextDetails();
        if (detail == null)
        {
            return -1;
        } else
        {
            return detail.runtime;
        }
    }

    public int getSeasonNumber()
    {
        if (!VideoType.EPISODE.equals(getType()) || watchNextEpisodeDetail == null)
        {
            return 0;
        } else
        {
            return watchNextEpisodeDetail.getSeasonNumber();
        }
    }

    public String getSquareUrl()
    {
        if (watchNextSummary == null)
        {
            return null;
        } else
        {
            return watchNextSummary.getSquareUrl();
        }
    }

    public String getStoryUrl()
    {
        com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail = getWatchNextDetails();
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
        com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail = getWatchNextDetails();
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
        return getPlayableTitle();
    }

    public String getTvCardUrl()
    {
        if (watchNextSummary == null)
        {
            return null;
        } else
        {
            return watchNextSummary.getTvCardUrl();
        }
    }

    public VideoType getType()
    {
        if (watchNextSummary == null)
        {
            return VideoType.UNKNOWN;
        } else
        {
            return watchNextSummary.getType();
        }
    }

    public String getWatchNextDispUrl()
    {
        Log.d("nf_kidscharacter", String.format("[%s %s], firstPlay:%b (watchedRecently:%b), S%d:E%d, pos:%d", new Object[] {
            getType(), getPlayableId(), isFirstPlay(), Boolean.valueOf(getHasWatchedRecently()), Integer.valueOf(getSeasonNumber()), Integer.valueOf(getEpisodeNumber()), Integer.valueOf(getPlayableBookmarkPosition())
        }));
        if (isFirstPlay().booleanValue())
        {
            return getCharacterSquareUrl();
        } else
        {
            return getWatchNextSquareUrl();
        }
    }

    public boolean isAutoPlayEnabled()
    {
        com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail = getWatchNextDetails();
        if (detail == null)
        {
            return false;
        } else
        {
            return detail.isAutoPlayEnabled;
        }
    }

    public boolean isNextPlayableEpisode()
    {
        com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail = getWatchNextDetails();
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
        com.netflix.mediaclient.service.webclient.model.branches.Video.Detail detail = getWatchNextDetails();
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
        if (watchNextSummary == null)
        {
            return false;
        } else
        {
            return watchNextSummary.isEpisode();
        }
    }

    public boolean isUserConnectedToFacebook()
    {
        return false;
    }

    public String toString()
    {
        return (new StringBuilder()).append("KidsCharacterDetails [kidsSummary=").append(kidsSummary).append(", kidsDetail=").append(kidsDetail).append(", watchNextSummary=").append(watchNextSummary).append(", watchNextBookmark=").append(watchNextBookmark).append(", watchNextMovieDetail=").append(watchNextMovieDetail).append(", watchNextEpisodeDetail=").append(watchNextEpisodeDetail).append(", galleryListSummary=").append(galleryListSummary).append(", galleryVideos=").append(galleryVideos).append("]").toString();
    }

    public void updateWatchNext(KidsCharacterDetails kidscharacterdetails)
    {
        if (kidscharacterdetails == null)
        {
            return;
        } else
        {
            watchNextSummary = kidscharacterdetails.watchNextSummary;
            watchNextMovieDetail = kidscharacterdetails.watchNextMovieDetail;
            watchNextEpisodeDetail = kidscharacterdetails.watchNextEpisodeDetail;
            watchNextBookmark = kidscharacterdetails.watchNextBookmark;
            return;
        }
    }
}
