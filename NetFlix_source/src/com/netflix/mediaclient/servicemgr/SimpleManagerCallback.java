// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            ManagerCallback, EpisodeDetails, KidsCharacterDetails, LoLoMo, 
//            MovieDetails, SearchResults, SeasonDetails, ShowDetails, 
//            VideoList

public abstract class SimpleManagerCallback
    implements ManagerCallback
{

    public SimpleManagerCallback()
    {
    }

    public void onCWVideosFetched(List list, int i)
    {
    }

    public void onConnectWithFacebookComplete(int i, String s)
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

    public void onLoginComplete(int i, String s)
    {
    }

    public void onLogoutComplete(int i)
    {
    }

    public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
    {
    }

    public void onPinVerified(boolean flag, int i)
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

    public void onResourceFetched(String s, String s1, int i)
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
