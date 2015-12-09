// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.BrowseWebClient;
import com.netflix.mediaclient.service.browse.SimpleBrowseAgentCallback;
import com.netflix.mediaclient.service.browse.cache.HardCache;
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClient;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.LoMoUtils;
import com.netflix.mediaclient.servicemgr.ProfileType;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            FetchVideosRequest, AddToQueueRequest, AddToQueueRequestNoLolomo, FetchCWVideosRequest, 
//            FetchEpisodeDetailsRequest, FetchEpisodesRequest, FetchGenreListsRequest, FetchGenresRequest, 
//            FetchIQVideosRequest, FetchKidsCharacterDetailsRequest, FetchLoLoMoSummaryRequest, FetchLoMosRequest, 
//            FetchMovieDetailsRequest, FetchPostPlayVideosRequest, FetchSeasonDetailsRequest, FetchSeasonsRequest, 
//            FetchShowDetailsRequest, HideVideoRequest, LogBillboardActivityRequest, PrefetchGenreLoLoMoRequest, 
//            PrefetchHomeLoLoMoRequest, RefreshCWRequest, RefreshKidsCharacterDetails, RemoveFromQueueRequest, 
//            RemoveFromQueueRequestNoLolomo, FetchSearchRequest, SetVideoRatingRequest

public final class BrowseVolleyWebClient
    implements BrowseWebClient
{

    private static final int GENRE_LIST_MAX = 30;
    private static final int MOVIE_DETAILS_MAX_SIMILARS = 50;
    public static final int SEARCH_RESULTS_MAX = 10;
    private final List cwKeysCache;
    private final HardCache hardCache;
    private final List iqKeysCache;
    private final NetflixService service;
    private final SoftCache softCache;
    private final SoftCache weakSeasonsCache;
    private final FalcorVolleyWebClient webclient;

    public BrowseVolleyWebClient(HardCache hardcache, SoftCache softcache, SoftCache softcache1, List list, List list1, NetflixService netflixservice, FalcorVolleyWebClient falcorvolleywebclient)
    {
        service = netflixservice;
        webclient = falcorvolleywebclient;
        hardCache = hardcache;
        softCache = softcache;
        weakSeasonsCache = softcache1;
        cwKeysCache = list;
        iqKeysCache = list1;
    }

    private void fetchVideosAndInjectSocialData(String s, final LoMo lomo, final int fromVideoFinal, int i, final BrowseAgentCallback cb)
    {
        fetchVideosInternal(s, lomo, fromVideoFinal, i, new SimpleBrowseAgentCallback() {

            final BrowseVolleyWebClient this$0;
            final BrowseAgentCallback val$cb;
            final int val$fromVideoFinal;
            final LoMo val$lomo;

            public void onVideosFetched(List list, int j)
            {
                if (j == 0 && fromVideoFinal == 0)
                {
                    PrefetchHomeLoLoMoRequest.injectSocialData(lomo, list);
                }
                cb.onVideosFetched(list, j);
            }

            
            {
                this$0 = BrowseVolleyWebClient.this;
                fromVideoFinal = i;
                lomo = lomo1;
                cb = browseagentcallback;
                super();
            }
        });
    }

    private void fetchVideosInternal(String s, LoMo lomo, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchVideosRequest(service.getApplicationContext(), service.getConfiguration(), s, lomo, i, j, browseagentcallback);
        webclient.sendRequest(s);
    }

    public void addToQueue(String s, int i, int j, int k, boolean flag, BrowseAgentCallback browseagentcallback)
    {
        if (flag)
        {
            s = new AddToQueueRequest(service.getApplicationContext(), service.getConfiguration(), hardCache, softCache, iqKeysCache, s, i, j, k, browseagentcallback);
            if (s.canProceed())
            {
                webclient.sendRequest(s);
                return;
            } else
            {
                s.onFailure(-67);
                return;
            }
        } else
        {
            s = new AddToQueueRequestNoLolomo(service.getApplicationContext(), service.getConfiguration(), hardCache, softCache, s, k, browseagentcallback);
            webclient.sendRequest(s);
            return;
        }
    }

    public void fetchCWVideos(int i, int j, BrowseAgentCallback browseagentcallback)
    {
        browseagentcallback = new FetchCWVideosRequest(service.getApplicationContext(), service.getConfiguration(), hardCache, softCache, weakSeasonsCache, i, j, 50, service.isCurrentProfileFacebookConnected(), browseagentcallback);
        webclient.sendRequest(browseagentcallback);
    }

    public void fetchEpisodeDetails(String s, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchEpisodeDetailsRequest(service.getApplicationContext(), service.getConfiguration(), s, service.isCurrentProfileFacebookConnected(), browseagentcallback);
        webclient.sendRequest(s);
    }

    public void fetchEpisodes(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchEpisodesRequest(service.getApplicationContext(), service.getConfiguration(), s, i, j, service.isCurrentProfileFacebookConnected(), browseagentcallback);
        webclient.sendRequest(s);
    }

    public void fetchGenreLists(BrowseAgentCallback browseagentcallback)
    {
        browseagentcallback = new FetchGenreListsRequest(service.getApplicationContext(), service.getConfiguration(), 0, 30, browseagentcallback);
        webclient.sendRequest(browseagentcallback);
    }

    public void fetchGenreVideos(LoMo lomo, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        FalcorVolleyWebClient falcorvolleywebclient = webclient;
        android.content.Context context = service.getApplicationContext();
        com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface = service.getConfiguration();
        String s;
        if (LoMoType.FLAT_GENRE.equals(lomo.getType()))
        {
            s = "flatGenre";
        } else
        {
            s = "glists";
        }
        falcorvolleywebclient.sendRequest(new FetchVideosRequest(context, configurationagentinterface, s, lomo, i, j, browseagentcallback));
    }

    public void fetchGenres(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchGenresRequest(service.getApplicationContext(), service.getConfiguration(), hardCache, softCache, s, i, j, browseagentcallback);
        webclient.sendRequest(s);
    }

    public void fetchIQVideos(int i, int j, BrowseAgentCallback browseagentcallback)
    {
        browseagentcallback = new FetchIQVideosRequest(service.getApplicationContext(), service.getConfiguration(), hardCache, softCache, i, j, browseagentcallback);
        webclient.sendRequest(browseagentcallback);
    }

    public void fetchKidsCharacterDetails(String s, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchKidsCharacterDetailsRequest(service.getApplicationContext(), service.getConfiguration(), s, browseagentcallback);
        webclient.sendRequest(s);
    }

    public void fetchLoLoMoSummary(String s, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchLoLoMoSummaryRequest(service.getApplicationContext(), service.getConfiguration(), hardCache, s, browseagentcallback);
        webclient.sendRequest(s);
    }

    public void fetchLoMos(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchLoMosRequest(service.getApplicationContext(), service.getConfiguration(), hardCache, i, j, browseagentcallback);
        webclient.sendRequest(s);
    }

    public void fetchMovieDetails(String s, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchMovieDetailsRequest(service.getApplicationContext(), service.getConfiguration(), s, 0, 50, service.isCurrentProfileFacebookConnected(), browseagentcallback);
        webclient.sendRequest(s);
    }

    public void fetchPostPlayVideos(String s, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchPostPlayVideosRequest(service.getApplicationContext(), service.getConfiguration(), s, service.isCurrentProfileFacebookConnected(), browseagentcallback);
        webclient.sendRequest(s);
    }

    public void fetchSeasonDetails(String s, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchSeasonDetailsRequest(service.getApplicationContext(), service.getConfiguration(), s, browseagentcallback);
        webclient.sendRequest(s);
    }

    public void fetchSeasons(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchSeasonsRequest(service.getApplicationContext(), service.getConfiguration(), s, i, j, browseagentcallback);
        webclient.sendRequest(s);
    }

    public void fetchShowDetails(String s, String s1, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchShowDetailsRequest(service.getApplicationContext(), service.getConfiguration(), s, s1, service.isCurrentProfileFacebookConnected(), browseagentcallback);
        webclient.sendRequest(s);
    }

    public void fetchSimilarVideosForPerson(String s, int i, BrowseAgentCallback browseagentcallback)
    {
        webclient.sendRequest(new FetchSimilarVideosRequest.FetchSimilarVideosForPersonRequest(service.getApplicationContext(), service.getConfiguration(), s, i, browseagentcallback));
    }

    public void fetchSimilarVideosForQuerySuggestion(String s, int i, BrowseAgentCallback browseagentcallback)
    {
        webclient.sendRequest(new FetchSimilarVideosRequest.FetchSimilarVideosForQuerySuggestionRequest(service.getApplicationContext(), service.getConfiguration(), s, i, browseagentcallback));
    }

    public void fetchVideos(LoMo lomo, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        if (LoMoUtils.shouldInjectSocialData(lomo, service.isCurrentProfileFacebookConnected()))
        {
            fetchVideosAndInjectSocialData("lists", lomo, i, j, browseagentcallback);
            return;
        } else
        {
            fetchVideosInternal("lists", lomo, i, j, browseagentcallback);
            return;
        }
    }

    public void hideVideo(String s, BrowseAgentCallback browseagentcallback)
    {
        s = new HideVideoRequest(service.getApplicationContext(), service.getConfiguration(), hardCache, softCache, s, browseagentcallback);
        webclient.sendRequest(s);
    }

    public final boolean isSynchronous()
    {
        return webclient.isSynchronous();
    }

    public void logBillboardActivity(Video video, com.netflix.mediaclient.service.browse.BrowseAgent.BillboardActivityType billboardactivitytype)
    {
        video = new LogBillboardActivityRequest(service.getApplicationContext(), service.getConfiguration(), video, billboardactivitytype);
        webclient.sendRequest(video);
    }

    public void prefetchGenreLoLoMo(String s, int i, int j, int k, int l, BrowseAgentCallback browseagentcallback)
    {
        boolean flag = KidsUtils.isKoPExperience(service.getConfiguration(), service.getCurrentProfile());
        s = new PrefetchGenreLoLoMoRequest(service.getApplicationContext(), service.getConfiguration(), flag, hardCache, softCache, s, i, j, k, l, browseagentcallback);
        webclient.sendRequest(s);
    }

    public void prefetchLoLoMo(String s, int i, int j, int k, int l, int i1, int j1, 
            boolean flag, BrowseAgentCallback browseagentcallback)
    {
        s = new PrefetchHomeLoLoMoRequest(service.getApplicationContext(), service.getConfiguration(), hardCache, softCache, weakSeasonsCache, i, j, k, l, i1, j1, 50, flag, service.isCurrentProfileFacebookConnected(), browseagentcallback);
        webclient.sendRequest(s);
    }

    public void refreshCWList(int i, int j, BrowseAgentCallback browseagentcallback)
    {
        browseagentcallback = new RefreshCWRequest(service.getApplicationContext(), service.getConfiguration(), hardCache, softCache, weakSeasonsCache, cwKeysCache, i, j, 50, service.isCurrentProfileFacebookConnected(), browseagentcallback);
        if (browseagentcallback.canProceed())
        {
            webclient.sendRequest(browseagentcallback);
            return;
        } else
        {
            browseagentcallback.onFailure(-68);
            return;
        }
    }

    public void refreshIQList(int i, int j, BrowseAgentCallback browseagentcallback)
    {
        throw new IllegalStateException(" refreshIQList not implemented");
    }

    public void refreshKidsCharacterDetils(String s, BrowseAgentCallback browseagentcallback)
    {
        s = new RefreshKidsCharacterDetails(service.getApplicationContext(), service.getConfiguration(), s, browseagentcallback);
        webclient.sendRequest(s);
    }

    public void removeFromQueue(String s, int i, int j, boolean flag, BrowseAgentCallback browseagentcallback)
    {
        if (flag)
        {
            s = new RemoveFromQueueRequest(service.getApplicationContext(), service.getConfiguration(), hardCache, softCache, iqKeysCache, s, i, j, browseagentcallback);
            if (s.canProceed())
            {
                webclient.sendRequest(s);
                return;
            } else
            {
                s.onFailure(-67);
                return;
            }
        } else
        {
            s = new RemoveFromQueueRequestNoLolomo(service.getApplicationContext(), service.getConfiguration(), hardCache, softCache, s, browseagentcallback);
            webclient.sendRequest(s);
            return;
        }
    }

    public void searchNetflix(String s, ProfileType profiletype, BrowseAgentCallback browseagentcallback)
    {
        s = new FetchSearchRequest(service.getApplicationContext(), service.getConfiguration(), s, 0, 10, profiletype, browseagentcallback);
        webclient.sendRequest(s);
    }

    public void setVideoRating(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        s = new SetVideoRatingRequest(service.getApplicationContext(), service.getConfiguration(), hardCache, softCache, s, i, j, browseagentcallback);
        webclient.sendRequest(s);
    }
}
