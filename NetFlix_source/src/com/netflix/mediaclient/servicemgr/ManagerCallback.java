// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            EpisodeDetails, KidsCharacterDetails, LoLoMo, MovieDetails, 
//            SearchResults, SeasonDetails, ShowDetails, VideoList

public interface ManagerCallback
{

    public abstract void onCWVideosFetched(List list, int i);

    public abstract void onConnectWithFacebookComplete(int i, String s);

    public abstract void onEpisodeDetailsFetched(EpisodeDetails episodedetails, int i);

    public abstract void onEpisodesFetched(List list, int i);

    public abstract void onGenreListsFetched(List list, int i);

    public abstract void onGenreLoLoMoPrefetched(int i);

    public abstract void onGenresFetched(List list, int i);

    public abstract void onKidsCharacterDetailsFetched(KidsCharacterDetails kidscharacterdetails, Boolean boolean1, int i);

    public abstract void onLoLoMoPrefetched(int i);

    public abstract void onLoLoMoSummaryFetched(LoLoMo lolomo, int i);

    public abstract void onLoMosFetched(List list, int i);

    public abstract void onLoginComplete(int i, String s);

    public abstract void onLogoutComplete(int i);

    public abstract void onMovieDetailsFetched(MovieDetails moviedetails, int i);

    public abstract void onPinVerified(boolean flag, int i);

    public abstract void onPostPlayVideosFetched(List list, int i);

    public abstract void onQueueAdd(int i);

    public abstract void onQueueRemove(int i);

    public abstract void onResourceFetched(String s, String s1, int i);

    public abstract void onSearchResultsFetched(SearchResults searchresults, int i);

    public abstract void onSeasonDetailsFetched(SeasonDetails seasondetails, int i);

    public abstract void onSeasonsFetched(List list, int i);

    public abstract void onShowDetailsFetched(ShowDetails showdetails, int i);

    public abstract void onSimilarVideosFetched(VideoList videolist, int i);

    public abstract void onVideoHide(int i);

    public abstract void onVideoRatingSet(int i);

    public abstract void onVideosFetched(List list, int i);
}
