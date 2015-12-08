// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.service.webclient.model.CWVideo;
import com.netflix.mediaclient.service.webclient.model.EpisodeDetails;
import com.netflix.mediaclient.service.webclient.model.PostPlayVideo;
import com.netflix.mediaclient.service.webclient.model.SeasonDetails;
import com.netflix.mediaclient.servicemgr.VideoType;

public class BrowseVideoSentinels
{

    private static final CWVideo cwVideoSentinel = new CWVideo();
    private static final EpisodeDetails episodeDetailsSentinel = new EpisodeDetails();
    private static final PostPlayVideo postPlayVideoSentinel = new PostPlayVideo();
    private static final SeasonDetails seasonDetailsSentinel = new SeasonDetails();
    private static final com.netflix.mediaclient.service.webclient.model.branches.Video.Summary videoSummarySentinel = new com.netflix.mediaclient.service.webclient.model.branches.Video.Summary();

    private BrowseVideoSentinels()
    {
        videoSummarySentinel.setErrorType(VideoType.UNAVAILABLE);
        episodeDetailsSentinel.summary = new com.netflix.mediaclient.service.webclient.model.branches.Video.Summary();
        episodeDetailsSentinel.summary.setErrorType(VideoType.UNAVAILABLE);
        seasonDetailsSentinel.detail = new com.netflix.mediaclient.service.webclient.model.branches.Season.Detail();
        seasonDetailsSentinel.detail.setErrorType(VideoType.UNAVAILABLE);
        cwVideoSentinel.summary = new com.netflix.mediaclient.service.webclient.model.branches.Video.Summary();
        cwVideoSentinel.summary.setErrorType(VideoType.UNAVAILABLE);
    }

    public static CWVideo getUnavailableCwVideo()
    {
        return cwVideoSentinel;
    }

    public static EpisodeDetails getUnavailableEpisodeDetails()
    {
        return episodeDetailsSentinel;
    }

    public static PostPlayVideo getUnavailablePostPlayVideo()
    {
        return postPlayVideoSentinel;
    }

    public static SeasonDetails getUnavailableSeasonsDetails()
    {
        return seasonDetailsSentinel;
    }

    public static com.netflix.mediaclient.service.webclient.model.branches.Video.Summary getUnavailableVideoSummary()
    {
        return videoSummarySentinel;
    }

}
