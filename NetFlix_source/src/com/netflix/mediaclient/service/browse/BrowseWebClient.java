// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.ProfileType;
import com.netflix.mediaclient.servicemgr.Video;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgentCallback

public interface BrowseWebClient
{

    public abstract void addToQueue(String s, int i, int j, int k, boolean flag, BrowseAgentCallback browseagentcallback);

    public abstract void fetchCWVideos(int i, int j, BrowseAgentCallback browseagentcallback);

    public abstract void fetchEpisodeDetails(String s, BrowseAgentCallback browseagentcallback);

    public abstract void fetchEpisodes(String s, int i, int j, BrowseAgentCallback browseagentcallback);

    public abstract void fetchGenreLists(BrowseAgentCallback browseagentcallback);

    public abstract void fetchGenreVideos(LoMo lomo, int i, int j, BrowseAgentCallback browseagentcallback);

    public abstract void fetchGenres(String s, int i, int j, BrowseAgentCallback browseagentcallback);

    public abstract void fetchIQVideos(int i, int j, BrowseAgentCallback browseagentcallback);

    public abstract void fetchKidsCharacterDetails(String s, BrowseAgentCallback browseagentcallback);

    public abstract void fetchLoLoMoSummary(String s, BrowseAgentCallback browseagentcallback);

    public abstract void fetchLoMos(String s, int i, int j, BrowseAgentCallback browseagentcallback);

    public abstract void fetchMovieDetails(String s, BrowseAgentCallback browseagentcallback);

    public abstract void fetchPostPlayVideos(String s, BrowseAgentCallback browseagentcallback);

    public abstract void fetchSeasonDetails(String s, BrowseAgentCallback browseagentcallback);

    public abstract void fetchSeasons(String s, int i, int j, BrowseAgentCallback browseagentcallback);

    public abstract void fetchShowDetails(String s, String s1, BrowseAgentCallback browseagentcallback);

    public abstract void fetchSimilarVideosForPerson(String s, int i, BrowseAgentCallback browseagentcallback);

    public abstract void fetchSimilarVideosForQuerySuggestion(String s, int i, BrowseAgentCallback browseagentcallback);

    public abstract void fetchVideos(LoMo lomo, int i, int j, BrowseAgentCallback browseagentcallback);

    public abstract void hideVideo(String s, BrowseAgentCallback browseagentcallback);

    public abstract boolean isSynchronous();

    public abstract void logBillboardActivity(Video video, BrowseAgent.BillboardActivityType billboardactivitytype);

    public abstract void prefetchGenreLoLoMo(String s, int i, int j, int k, int l, BrowseAgentCallback browseagentcallback);

    public abstract void prefetchLoLoMo(String s, int i, int j, int k, int l, int i1, int j1, 
            boolean flag, BrowseAgentCallback browseagentcallback);

    public abstract void refreshCWList(int i, int j, BrowseAgentCallback browseagentcallback);

    public abstract void refreshIQList(int i, int j, BrowseAgentCallback browseagentcallback);

    public abstract void refreshKidsCharacterDetils(String s, BrowseAgentCallback browseagentcallback);

    public abstract void removeFromQueue(String s, int i, int j, boolean flag, BrowseAgentCallback browseagentcallback);

    public abstract void searchNetflix(String s, ProfileType profiletype, BrowseAgentCallback browseagentcallback);

    public abstract void setVideoRating(String s, int i, int j, BrowseAgentCallback browseagentcallback);
}
