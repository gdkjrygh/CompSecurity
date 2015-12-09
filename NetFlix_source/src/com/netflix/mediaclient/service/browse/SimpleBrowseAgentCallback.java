// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;
import com.netflix.mediaclient.servicemgr.LoLoMo;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.SearchResults;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.VideoList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgentCallback

public abstract class SimpleBrowseAgentCallback
    implements BrowseAgentCallback
{

    public SimpleBrowseAgentCallback()
    {
    }

    public void onCWListRefresh(int i)
    {
    }

    public void onCWVideosFetched(List list, int i)
    {
    }

    public void onEpisodeDetailsFetched(EpisodeDetails episodedetails, int i)
    {
    }

    public void onEpisodesFetched(List list, int i)
    {
    }

    public void onGenreListsFetched(List list, int i)
    {
    }

    public void onGenreLoLoMoPrefetched(int i)
    {
    }

    public void onGenresFetched(List list, int i)
    {
    }

    public void onIQListRefresh(int i)
    {
    }

    public void onKidsCharacterDetailsFetched(KidsCharacterDetails kidscharacterdetails, Boolean boolean1, int i)
    {
    }

    public void onLoLoMoPrefetched(int i)
    {
    }

    public void onLoLoMoSummaryFetched(LoLoMo lolomo, int i)
    {
    }

    public void onLoMosFetched(List list, int i)
    {
    }

    public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
    {
    }

    public void onPostPlayVideosFetched(List list, int i)
    {
    }

    public void onQueueAdd(int i)
    {
    }

    public void onQueueRemove(int i)
    {
    }

    public void onSearchResultsFetched(SearchResults searchresults, int i)
    {
    }

    public void onSeasonDetailsFetched(SeasonDetails seasondetails, int i)
    {
    }

    public void onSeasonsFetched(List list, int i)
    {
    }

    public void onShowDetailsFetched(ShowDetails showdetails, int i)
    {
    }

    public void onSimilarVideosFetched(VideoList videolist, int i)
    {
    }

    public void onVideoHide(int i)
    {
    }

    public void onVideoRatingSet(int i)
    {
    }

    public void onVideosFetched(List list, int i)
    {
    }
}
