// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;
import com.netflix.mediaclient.servicemgr.LoLoMo;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.SearchResults;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.VideoList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgentCallback

public class BrowseAgentCallbackWrapper
    implements BrowseAgentCallback
{

    private static final String TAG = "TimingBrowseAgentCallback";
    private final BrowseAgentCallback callback;
    private final long start = System.nanoTime();

    public BrowseAgentCallbackWrapper(BrowseAgentCallback browseagentcallback)
    {
        callback = browseagentcallback;
    }

    private void handleResultTiming(String s)
    {
        long l = System.nanoTime();
        l = TimeUnit.MILLISECONDS.convert(l - start, TimeUnit.NANOSECONDS);
        if (Log.isLoggable("TimingBrowseAgentCallback", 2))
        {
            Log.v("TimingBrowseAgentCallback", String.format("%s took %d ms", new Object[] {
                s, Long.valueOf(l)
            }));
        }
    }

    private int wrapStatus(int i)
    {
        return i;
    }

    public void onCWListRefresh(int i)
    {
        handleResultTiming("onCWListRefresh");
        callback.onCWListRefresh(wrapStatus(i));
    }

    public void onCWVideosFetched(List list, int i)
    {
        handleResultTiming("onCWVideosFetched");
        callback.onCWVideosFetched(list, wrapStatus(i));
    }

    public void onEpisodeDetailsFetched(EpisodeDetails episodedetails, int i)
    {
        handleResultTiming("onEpisodeDetailsFetched");
        callback.onEpisodeDetailsFetched(episodedetails, wrapStatus(i));
    }

    public void onEpisodesFetched(List list, int i)
    {
        handleResultTiming("onEpisodesFetched");
        callback.onEpisodesFetched(list, wrapStatus(i));
    }

    public void onGenreListsFetched(List list, int i)
    {
        handleResultTiming("onGenreListsFetched");
        callback.onGenreListsFetched(list, wrapStatus(i));
    }

    public void onGenreLoLoMoPrefetched(int i)
    {
        handleResultTiming("onGenreLoLoMoPrefetched");
        callback.onGenreLoLoMoPrefetched(wrapStatus(i));
    }

    public void onGenresFetched(List list, int i)
    {
        handleResultTiming("onGenresFetched");
        callback.onGenresFetched(list, wrapStatus(i));
    }

    public void onIQListRefresh(int i)
    {
        handleResultTiming("onIQListRefresh");
        callback.onIQListRefresh(wrapStatus(i));
    }

    public void onKidsCharacterDetailsFetched(KidsCharacterDetails kidscharacterdetails, Boolean boolean1, int i)
    {
        handleResultTiming("onKidsCharacterDetailsFetched");
        callback.onKidsCharacterDetailsFetched(kidscharacterdetails, boolean1, wrapStatus(i));
    }

    public void onLoLoMoPrefetched(int i)
    {
        handleResultTiming("onLoLoMoPrefetched");
        callback.onLoLoMoPrefetched(wrapStatus(i));
    }

    public void onLoLoMoSummaryFetched(LoLoMo lolomo, int i)
    {
        handleResultTiming("onLoLoMoSummaryFetched");
        callback.onLoLoMoSummaryFetched(lolomo, wrapStatus(i));
    }

    public void onLoMosFetched(List list, int i)
    {
        handleResultTiming("onLoMosFetched");
        callback.onLoMosFetched(list, wrapStatus(i));
    }

    public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
    {
        handleResultTiming("onMovieDetailsFetched");
        callback.onMovieDetailsFetched(moviedetails, wrapStatus(i));
    }

    public void onPostPlayVideosFetched(List list, int i)
    {
        handleResultTiming("onPostPlayVideosFetched");
        callback.onPostPlayVideosFetched(list, wrapStatus(i));
    }

    public void onQueueAdd(int i)
    {
        handleResultTiming("onQueueAdd");
        callback.onQueueAdd(wrapStatus(i));
    }

    public void onQueueRemove(int i)
    {
        handleResultTiming("onQueueRemove");
        callback.onQueueRemove(wrapStatus(i));
    }

    public void onSearchResultsFetched(SearchResults searchresults, int i)
    {
        handleResultTiming("onSearchResultsFetched");
        callback.onSearchResultsFetched(searchresults, wrapStatus(i));
    }

    public void onSeasonDetailsFetched(SeasonDetails seasondetails, int i)
    {
        handleResultTiming("onSeasonDetailsFetched");
        callback.onSeasonDetailsFetched(seasondetails, wrapStatus(i));
    }

    public void onSeasonsFetched(List list, int i)
    {
        handleResultTiming("onSeasonsFetched");
        callback.onSeasonsFetched(list, wrapStatus(i));
    }

    public void onShowDetailsFetched(ShowDetails showdetails, int i)
    {
        handleResultTiming("onShowDetailsFetched");
        callback.onShowDetailsFetched(showdetails, wrapStatus(i));
    }

    public void onSimilarVideosFetched(VideoList videolist, int i)
    {
        handleResultTiming("onSimilarVideosFetched");
        callback.onSimilarVideosFetched(videolist, wrapStatus(i));
    }

    public void onVideoHide(int i)
    {
        handleResultTiming("onVideoHide");
        callback.onVideoHide(wrapStatus(i));
    }

    public void onVideoRatingSet(int i)
    {
        handleResultTiming("onVideoRatingSet");
        callback.onVideoRatingSet(wrapStatus(i));
    }

    public void onVideosFetched(List list, int i)
    {
        handleResultTiming("onVideosFetched");
        callback.onVideosFetched(list, wrapStatus(i));
    }
}
