// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            EpisodeDetails, KidsCharacterDetails, LoLoMo, MovieDetails, 
//            SearchResults, SeasonDetails, ShowDetails, VideoList

public interface INetflixServiceCallback
{

    public abstract void onCWVideosFetched(int i, List list, int j);

    public abstract void onConnectWithFacebookComplete(int i, int j, String s);

    public abstract void onEpisodeDetailsFetched(int i, EpisodeDetails episodedetails, int j);

    public abstract void onEpisodesFetched(int i, List list, int j);

    public abstract void onGenreListsFetched(int i, List list, int j);

    public abstract void onGenreLoLoMoPrefetched(int i, int j);

    public abstract void onGenresFetched(int i, List list, int j);

    public abstract void onKidsCharacterDetailsFetched(int i, KidsCharacterDetails kidscharacterdetails, Boolean boolean1, int j);

    public abstract void onLoLoMoPrefetched(int i, int j);

    public abstract void onLoLoMoSummaryFetched(int i, LoLoMo lolomo, int j);

    public abstract void onLoMosFetched(int i, List list, int j);

    public abstract void onLoginComplete(int i, int j, String s);

    public abstract void onLogoutComplete(int i, int j);

    public abstract void onMovieDetailsFetched(int i, MovieDetails moviedetails, int j);

    public abstract void onPinVerified(int i, boolean flag, int j);

    public abstract void onPostPlayVideosFetched(int i, List list, int j);

    public abstract void onQueueAdd(int i, int j);

    public abstract void onQueueRemove(int i, int j);

    public abstract void onResourceFetched(int i, String s, String s1, int j);

    public abstract void onSearchResultsFetched(int i, SearchResults searchresults, int j);

    public abstract void onSeasonDetailsFetched(int i, SeasonDetails seasondetails, int j);

    public abstract void onSeasonsFetched(int i, List list, int j);

    public abstract void onServiceReady(int i, int j);

    public abstract void onShowDetailsFetched(int i, ShowDetails showdetails, int j);

    public abstract void onSimilarVideosFetched(int i, VideoList videolist, int j);

    public abstract void onVideoHide(int i, int j);

    public abstract void onVideoRatingSet(int i, int j);

    public abstract void onVideosFetched(int i, List list, int j);
}
