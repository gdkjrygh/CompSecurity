// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.service.ServiceAgent;
import com.netflix.mediaclient.service.browse.cache.BrowseCache;
import com.netflix.mediaclient.service.browse.cache.HardBrowseCache;
import com.netflix.mediaclient.service.browse.cache.HardCache;
import com.netflix.mediaclient.service.browse.cache.SoftBrowseCache;
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.service.configuration.ConfigurationAgent;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcher;
import com.netflix.mediaclient.service.user.UserAgentBroadcastIntents;
import com.netflix.mediaclient.service.webclient.model.CWVideo;
import com.netflix.mediaclient.service.webclient.model.EpisodeDetails;
import com.netflix.mediaclient.service.webclient.model.KidsCharacterDetails;
import com.netflix.mediaclient.service.webclient.model.MovieDetails;
import com.netflix.mediaclient.service.webclient.model.ShowDetails;
import com.netflix.mediaclient.service.webclient.model.leafs.ListOfMoviesSummary;
import com.netflix.mediaclient.servicemgr.LoLoMo;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.ProfileType;
import com.netflix.mediaclient.servicemgr.SearchResults;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.servicemgr.VideoList;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseWebClientFactory, BrowseWebClient, DataDumper, BrowseAgentCallback, 
//            SimpleBrowseAgentCallback

public class BrowseAgent extends ServiceAgent
    implements com.netflix.mediaclient.service.ServiceAgent.BrowseAgentInterface
{
    private class AddToQueueTask extends FetchTask
    {

        private final boolean iqInCache;
        final BrowseAgent this$0;
        private final int trackId;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            mBrowseWebClient.addToQueue(getCategory(), getFromIndex(), getToIndex(), trackId, iqInCache, webClientCallback);
        }


        public AddToQueueTask(String s, int i, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, BrowseAgent.mPrefetchFromVideo, BrowseAgent.mPrefetchToVideo, browseagentcallback);
            trackId = i;
            iqInCache = areIqIdsInCache();
        }
    }

    public static final class BillboardActivityType extends Enum
    {

        private static final BillboardActivityType $VALUES[];
        public static final BillboardActivityType ACTION;
        public static final BillboardActivityType IMPRESSION;
        private final String name;

        public static BillboardActivityType valueOf(String s)
        {
            return (BillboardActivityType)Enum.valueOf(com/netflix/mediaclient/service/browse/BrowseAgent$BillboardActivityType, s);
        }

        public static BillboardActivityType[] values()
        {
            return (BillboardActivityType[])$VALUES.clone();
        }

        public String getName()
        {
            return name;
        }

        static 
        {
            IMPRESSION = new BillboardActivityType("IMPRESSION", 0, "impression");
            ACTION = new BillboardActivityType("ACTION", 1, "action");
            $VALUES = (new BillboardActivityType[] {
                IMPRESSION, ACTION
            });
        }

        private BillboardActivityType(String s, int i, String s1)
        {
            super(s, i);
            name = s1;
        }
    }

    private abstract class CachedFetchTask extends FetchTask
    {

        private static final String TAG = "CachedFetchTask";
        private final String cacheKey;
        private Object cacheVal;
        private final BrowseCache primaryCache;
        private final BrowseCache secondaryCache;
        final BrowseAgent this$0;

        protected String getCacheKey()
        {
            return cacheKey;
        }

        protected Object getCachedValue()
        {
            cacheVal = primaryCache.get(cacheKey);
            if (cacheVal == null)
            {
                cacheVal = secondaryCache.get(cacheKey);
            }
            return cacheVal;
        }

        protected void updateCacheIfNecessary(Object obj, int i)
        {
            if (cacheVal == null && i == 0)
            {
                primaryCache.put(cacheKey, obj);
            }
        }

        public CachedFetchTask(String s, int i, int j, BrowseAgentCallback browseagentcallback)
        {
            this(s, i, j, browseagentcallback, true);
        }

        public CachedFetchTask(String s, int i, int j, BrowseAgentCallback browseagentcallback, boolean flag)
        {
            this$0 = BrowseAgent.this;
            super(s, i, j, browseagentcallback);
            if (flag)
            {
                browseagentcallback = softCache;
            } else
            {
                browseagentcallback = hardCache;
            }
            primaryCache = browseagentcallback;
            if (flag)
            {
                browseagent = hardCache;
            } else
            {
                browseagent = softCache;
            }
            secondaryCache = BrowseAgent.this;
            cacheKey = BrowseAgent.buildBrowseCacheKey(BrowseAgent.getCacheKeyFromClassName(getClass()), s, String.valueOf(i), String.valueOf(j));
        }
    }

    private class FetchCWVideosTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            List list = (List)getCachedValue();
            if (list == null)
            {
                cwKeysCache.add(getCacheKey());
                mBrowseWebClient.fetchCWVideos(getFromIndex(), getToIndex(), webClientCallback);
                return;
            } else
            {
                webClientCallback.onCWVideosFetched(list, 0);
                return;
            }
        }

        public FetchCWVideosTask(int i, int j, BrowseAgentCallback browseagentcallback, boolean flag)
        {
            this$0 = BrowseAgent.this;
            super("continueWatching", i, j, browseagentcallback, flag);
        }
    }

    private class FetchEpisodeDetailsTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            Object obj = (com.netflix.mediaclient.servicemgr.EpisodeDetails)getCachedValue();
            if (obj == null)
            {
                obj = BrowseAgent.buildEpisodeDetailsCacheKey(getCategory());
                if (Log.isLoggable("nf_service_browseagent", 3))
                {
                    Log.d("nf_bookmark", (new StringBuilder()).append("looking for episode with key: ").append(((String) (obj))).toString());
                }
                obj = (WeakReference)weakEpisodesCache.get(((String) (obj)));
                if (obj != null && ((WeakReference) (obj)).get() != null)
                {
                    obj = (com.netflix.mediaclient.servicemgr.EpisodeDetails)((WeakReference) (obj)).get();
                    updateEpisodeWithLatestShowInformation(hardCache, softCache, ((com.netflix.mediaclient.servicemgr.EpisodeDetails) (obj)));
                    webClientCallback.onEpisodeDetailsFetched(((com.netflix.mediaclient.servicemgr.EpisodeDetails) (obj)), 0);
                    return;
                } else
                {
                    mBrowseWebClient.fetchEpisodeDetails(getCategory(), webClientCallback);
                    return;
                }
            } else
            {
                updateEpisodeWithLatestShowInformation(hardCache, softCache, ((com.netflix.mediaclient.servicemgr.EpisodeDetails) (obj)));
                webClientCallback.onEpisodeDetailsFetched(((com.netflix.mediaclient.servicemgr.EpisodeDetails) (obj)), 0);
                return;
            }
        }

        public FetchEpisodeDetailsTask(String s, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, 0, browseagentcallback);
        }
    }

    private class FetchEpisodesTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            List list = (List)getCachedValue();
            if (list == null)
            {
                mBrowseWebClient.fetchEpisodes(getCategory(), getFromIndex(), getToIndex(), webClientCallback);
                return;
            } else
            {
                updateEpisodesWithLatestShowInformation(hardCache, softCache, list);
                webClientCallback.onEpisodesFetched(list, 0);
                return;
            }
        }

        public FetchEpisodesTask(String s, int i, int j, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, i, j, browseagentcallback);
        }
    }

    private class FetchGenreListsTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            List list = (List)getCachedValue();
            if (list == null)
            {
                mBrowseWebClient.fetchGenreLists(webClientCallback);
                return;
            } else
            {
                webClientCallback.onGenreListsFetched(list, 0);
                return;
            }
        }

        public FetchGenreListsTask(BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super("genreList", 0, 0, browseagentcallback, false);
        }
    }

    private class FetchGenreVideosTask extends CachedFetchTask
    {

        private final LoMo lomo;
        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            List list = (List)getCachedValue();
            if (list == null)
            {
                mBrowseWebClient.fetchGenreVideos(lomo, getFromIndex(), getToIndex(), webClientCallback);
                return;
            } else
            {
                webClientCallback.onVideosFetched(list, 0);
                return;
            }
        }

        public FetchGenreVideosTask(LoMo lomo1, int i, int j, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(lomo1.getId(), i, j, browseagentcallback);
            lomo = lomo1;
        }
    }

    private class FetchGenresTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            List list = (List)getCachedValue();
            if (list == null)
            {
                mBrowseWebClient.fetchGenres(getCategory(), getFromIndex(), getToIndex(), webClientCallback);
                return;
            } else
            {
                webClientCallback.onGenresFetched(list, 0);
                return;
            }
        }

        public FetchGenresTask(String s, int i, int j, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, i, j, browseagentcallback);
        }
    }

    private class FetchIQVideosTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            List list = (List)getCachedValue();
            if (list == null)
            {
                iqKeysCache.add(getCacheKey());
                mBrowseWebClient.fetchIQVideos(getFromIndex(), getToIndex(), webClientCallback);
                return;
            } else
            {
                webClientCallback.onVideosFetched(list, 0);
                return;
            }
        }

        public FetchIQVideosTask(int i, int j, BrowseAgentCallback browseagentcallback, boolean flag)
        {
            this$0 = BrowseAgent.this;
            super("queue", i, j, browseagentcallback, flag);
        }
    }

    private class FetchKidsCharacterDetailsTask extends CachedFetchTask
    {

        String mCharacterId;
        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            if ((com.netflix.mediaclient.servicemgr.KidsCharacterDetails)getCachedValue() == null)
            {
                mBrowseWebClient.fetchKidsCharacterDetails(getCategory(), webClientCallback);
                return;
            } else
            {
                refreshKidsCharacterDetail(mCharacterId, webClientCallback);
                return;
            }
        }

        public FetchKidsCharacterDetailsTask(String s, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, 0, browseagentcallback);
            mCharacterId = s;
        }
    }

    private class FetchLoLoMoSummaryTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            LoLoMo lolomo = (LoLoMo)getCachedValue();
            if (lolomo == null)
            {
                mBrowseWebClient.fetchLoLoMoSummary(getCategory(), webClientCallback);
                return;
            } else
            {
                webClientCallback.onLoLoMoSummaryFetched(lolomo, 0);
                return;
            }
        }

        public FetchLoLoMoSummaryTask(String s, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, 0, browseagentcallback);
        }
    }

    private class FetchLoMosTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            List list = (List)getCachedValue();
            if (list == null)
            {
                mBrowseWebClient.fetchLoMos(getCategory(), getFromIndex(), getToIndex(), webClientCallback);
                return;
            } else
            {
                webClientCallback.onLoMosFetched(list, 0);
                return;
            }
        }

        public FetchLoMosTask(String s, int i, int j, BrowseAgentCallback browseagentcallback, boolean flag)
        {
            this$0 = BrowseAgent.this;
            super(s, i, j, browseagentcallback, flag);
        }
    }

    private class FetchMovieDetailsTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            com.netflix.mediaclient.servicemgr.MovieDetails moviedetails = (com.netflix.mediaclient.servicemgr.MovieDetails)getCachedValue();
            if (moviedetails == null)
            {
                mBrowseWebClient.fetchMovieDetails(getCategory(), webClientCallback);
                return;
            } else
            {
                webClientCallback.onMovieDetailsFetched(moviedetails, 0);
                return;
            }
        }

        public FetchMovieDetailsTask(String s, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, 0, browseagentcallback);
        }
    }

    private class FetchPostPlayTask extends FetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            mBrowseWebClient.fetchPostPlayVideos(getCategory(), webClientCallback);
        }

        public FetchPostPlayTask(String s, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, 0, browseagentcallback);
        }
    }

    private class FetchSeasonDetailsTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            Object obj = (SeasonDetails)getCachedValue();
            if (obj == null)
            {
                obj = BrowseAgent.buildSeasonDetailsCacheKey(getCategory());
                obj = (WeakReference)weakSeasonsCache.get(((String) (obj)));
                if (obj != null && ((WeakReference) (obj)).get() != null)
                {
                    obj = (SeasonDetails)((WeakReference) (obj)).get();
                    webClientCallback.onSeasonDetailsFetched(((SeasonDetails) (obj)), 0);
                    return;
                } else
                {
                    mBrowseWebClient.fetchSeasonDetails(getCategory(), webClientCallback);
                    return;
                }
            } else
            {
                webClientCallback.onSeasonDetailsFetched(((SeasonDetails) (obj)), 0);
                return;
            }
        }

        public FetchSeasonDetailsTask(String s, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, 0, browseagentcallback);
        }
    }

    private class FetchSeasonsTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            List list = (List)getCachedValue();
            if (list == null)
            {
                mBrowseWebClient.fetchSeasons(getCategory(), getFromIndex(), getToIndex(), webClientCallback);
                return;
            } else
            {
                putInWeakSeasonsCache(list);
                webClientCallback.onSeasonsFetched(list, 0);
                return;
            }
        }

        public FetchSeasonsTask(String s, int i, int j, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, i, j, browseagentcallback);
        }
    }

    private class FetchShowDetailsTask extends CachedFetchTask
    {

        private final String mCurrentEpisodeId;
        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            com.netflix.mediaclient.servicemgr.ShowDetails showdetails = (com.netflix.mediaclient.servicemgr.ShowDetails)getCachedValue();
            if (showdetails == null || StringUtils.isNotEmpty(mCurrentEpisodeId))
            {
                mBrowseWebClient.fetchShowDetails(getCategory(), mCurrentEpisodeId, webClientCallback);
                return;
            } else
            {
                webClientCallback.onShowDetailsFetched(showdetails, 0);
                return;
            }
        }


        public FetchShowDetailsTask(String s, String s1, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, 0, browseagentcallback);
            mCurrentEpisodeId = s1;
        }
    }

    private class FetchSimilarVideosForPersonTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            VideoList videolist = (VideoList)getCachedValue();
            if (videolist == null)
            {
                mBrowseWebClient.fetchSimilarVideosForPerson(getCategory(), getToIndex(), webClientCallback);
                return;
            } else
            {
                webClientCallback.onSimilarVideosFetched(videolist, 0);
                return;
            }
        }

        public FetchSimilarVideosForPersonTask(String s, int i, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, i, browseagentcallback);
        }
    }

    private class FetchSimilarVideosForQuerySuggestionTask extends CachedFetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            VideoList videolist = (VideoList)getCachedValue();
            if (videolist == null)
            {
                mBrowseWebClient.fetchSimilarVideosForQuerySuggestion(getCategory(), getToIndex(), webClientCallback);
                return;
            } else
            {
                webClientCallback.onSimilarVideosFetched(videolist, 0);
                return;
            }
        }

        public FetchSimilarVideosForQuerySuggestionTask(String s, int i, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, i, browseagentcallback);
        }
    }

    private static abstract class FetchTask
        implements Runnable
    {

        private final BrowseAgentCallback callback;
        private final String category;
        private final int from;
        private final int to;

        protected BrowseAgentCallback getCallback()
        {
            return callback;
        }

        protected String getCategory()
        {
            return category;
        }

        protected int getFromIndex()
        {
            return from;
        }

        protected int getToIndex()
        {
            return to;
        }

        public FetchTask(String s, int i, int j, BrowseAgentCallback browseagentcallback)
        {
            category = s;
            from = i;
            to = j;
            callback = browseagentcallback;
        }
    }

    private class FetchVideosTask extends CachedFetchTask
    {

        private final LoMo lomo;
        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            List list = (List)getCachedValue();
            if (list == null)
            {
                mBrowseWebClient.fetchVideos(lomo, getFromIndex(), getToIndex(), webClientCallback);
                return;
            } else
            {
                webClientCallback.onVideosFetched(list, 0);
                return;
            }
        }

        public FetchVideosTask(LoMo lomo1, int i, int j, BrowseAgentCallback browseagentcallback, boolean flag)
        {
            this$0 = BrowseAgent.this;
            super(lomo1.getId(), i, j, browseagentcallback, flag);
            lomo = lomo1;
        }
    }

    private class HideVideoTask extends FetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            mBrowseWebClient.hideVideo(getCategory(), webClientCallback);
        }

        public HideVideoTask(String s, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, 0, browseagentcallback);
        }
    }

    private class LogBillboardActivityTask
        implements Runnable
    {

        final BrowseAgent this$0;
        private final BillboardActivityType type;
        private final Video video;

        public void run()
        {
            mBrowseWebClient.logBillboardActivity(video, type);
        }

        public LogBillboardActivityTask(Video video1, BillboardActivityType billboardactivitytype)
        {
            this$0 = BrowseAgent.this;
            super();
            video = video1;
            type = billboardactivitytype;
        }
    }

    public final class PlayReceiver extends BroadcastReceiver
    {

        final BrowseAgent this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null)
            {
                context = intent.getAction();
                Log.i("nf_bookmark", (new StringBuilder()).append("PlayReceiver inovoked and received Intent with Action ").append(context).toString());
                if (BrowseAgent.canDoDataFetches())
                {
                    if ("com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_STOP".equals(context))
                    {
                        Log.i("nf_bookmark", "Refreshing CW for LOCAL_PLAYER_PLAY_STOP...");
                        updateCachedCwData(Asset.fromIntent(intent));
                        return;
                    }
                    if ("com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_START".equals(context))
                    {
                        refreshEpisodesData(Asset.fromIntent(intent));
                        return;
                    }
                }
            }
        }

        public PlayReceiver()
        {
            this$0 = BrowseAgent.this;
            super();
        }
    }

    private class PrefetchGenreLoLoMoTask extends FetchTask
    {

        final int mFromLoMo;
        final boolean mIncludeBoxshots;
        final int mToLoMo;
        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            mBrowseWebClient.prefetchGenreLoLoMo(getCategory(), mFromLoMo, mToLoMo, getFromIndex(), getToIndex(), webClientCallback);
        }

        public PrefetchGenreLoLoMoTask(String s, int i, int j, int k, int l, boolean flag, 
                BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, k, l, browseagentcallback);
            mFromLoMo = i;
            mToLoMo = j;
            mIncludeBoxshots = flag;
        }
    }

    private class PrefetchLoLoMoTask extends FetchTask
    {

        final int mFromCWVideo;
        final int mFromLoMo;
        final boolean mIncludeBoxshots;
        final boolean mIncludeExtraCharacters;
        final int mToCWVideo;
        final int mToLoMo;
        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            mBrowseWebClient.prefetchLoLoMo(getCategory(), mFromLoMo, mToLoMo, getFromIndex(), getToIndex(), mFromCWVideo, mToCWVideo, mIncludeExtraCharacters, webClientCallback);
        }

        public PrefetchLoLoMoTask(int i, int j, int k, int l, int i1, int j1, 
                boolean flag, boolean flag1, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super("lolomo", k, l, browseagentcallback);
            mFromLoMo = i;
            mToLoMo = j;
            mFromCWVideo = i1;
            mToCWVideo = j1;
            mIncludeBoxshots = flag1;
            mIncludeExtraCharacters = flag;
        }
    }

    private class RefreshCWTask extends FetchTask
    {

        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            if (canRefreshCW(hardCache) && cacheHasLolomoId(hardCache))
            {
                mBrowseWebClient.refreshCWList(getFromIndex(), getToIndex(), webClientCallback);
                return;
            } else
            {
                Log.d("nf_service_browseagent", "Cache has no CW item so doing nothing for CW refresh");
                return;
            }
        }

        public RefreshCWTask()
        {
            this$0 = BrowseAgent.this;
            super("refreshCW", BrowseAgent.mPrefetchFromCWVideo, BrowseAgent.mPrefetchToCWVideo, null);
        }
    }

    private class RefreshKidsCharacterDetailsTask extends FetchTask
    {

        String mCharacterId;
        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            mBrowseWebClient.refreshKidsCharacterDetils(getCategory(), webClientCallback);
        }

        public RefreshKidsCharacterDetailsTask(String s, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, 0, browseagentcallback);
            mCharacterId = s;
        }
    }

    private class RemoveFromQueueTask extends FetchTask
    {

        private final boolean iqInCache;
        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            mBrowseWebClient.removeFromQueue(getCategory(), getFromIndex(), getToIndex(), iqInCache, webClientCallback);
        }


        public RemoveFromQueueTask(String s, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, BrowseAgent.mPrefetchFromVideo, BrowseAgent.mPrefetchToVideo, browseagentcallback);
            iqInCache = areIqIdsInCache();
        }
    }

    private class SearchNetflixTask extends CachedFetchTask
    {

        private final BrowseAgentCallback callback;
        private final String query;
        final BrowseAgent this$0;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        private String sanitizeQuery(String s)
        {
            String s1 = s.replaceAll("\\s+", " ");
            if (Log.isLoggable("nf_service_browseagent", 2))
            {
                Log.v("nf_service_browseagent", (new StringBuilder()).append("Sanitized query from: \"").append(s).append("\" to \"").append(s1).append("\"").toString());
            }
            return s1;
        }

        public void run()
        {
            Object obj = (SearchResults)getCachedValue();
            if (obj == null)
            {
                obj = ProfileType.STANDARD;
                UserProfile userprofile = getUserAgent().getCurrentProfile();
                if (userprofile != null)
                {
                    obj = userprofile.getProfileType();
                }
                mBrowseWebClient.searchNetflix(query, ((ProfileType) (obj)), webClientCallback);
                return;
            } else
            {
                webClientCallback.onSearchResultsFetched(((SearchResults) (obj)), 0);
                return;
            }
        }


        public SearchNetflixTask(String s, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, 0, browseagentcallback);
            query = sanitizeQuery(s);
            callback = browseagentcallback;
        }
    }

    private class SetVideoRatingTask extends CachedFetchTask
    {

        private final int newRating;
        final BrowseAgent this$0;
        private final int trackId;
        private final BrowseAgentCallback webClientCallback = new _cls1();

        public void run()
        {
            mBrowseWebClient.setVideoRating(getCategory(), newRating, trackId, webClientCallback);
        }

        public SetVideoRatingTask(String s, int i, int j, BrowseAgentCallback browseagentcallback)
        {
            this$0 = BrowseAgent.this;
            super(s, 0, 0, browseagentcallback);
            newRating = i;
            trackId = j;
        }
    }


    public static final String BOOKMARK_TAG = "nf_bookmark";
    public static final String CACHE_KEY_CW_LIST_ID = "continueWatching_list_id";
    public static final String CACHE_KEY_CW_LOMO_INDEX = "cw_lomo_index";
    public static final String CACHE_KEY_CW_LOMO_SUMMARY = "cw_lomo_summary";
    public static final String CACHE_KEY_GENRE_LOLOMO_ID = "genre_lolomo_id";
    public static final String CACHE_KEY_IQ_LIST_ID = "queue_list_id";
    public static final String CACHE_KEY_IQ_LOMO_INDEX = "iq_lomo_index";
    public static final String CACHE_KEY_IQ_LOMO_SUMMARY = "iq_lomo_summary";
    public static final String CACHE_KEY_LOLOMO_ID = "lolomo_id";
    public static final String CACHE_KEY_PREFIX_CW_VIDEOS = getCacheKeyFromClassName(com/netflix/mediaclient/service/browse/BrowseAgent$FetchCWVideosTask);
    public static final String CACHE_KEY_PREFIX_EPISODE_DETAILS = getCacheKeyFromClassName(com/netflix/mediaclient/service/browse/BrowseAgent$FetchEpisodeDetailsTask);
    public static final String CACHE_KEY_PREFIX_GENRE_LOMO = getCacheKeyFromClassName(com/netflix/mediaclient/service/browse/BrowseAgent$FetchGenresTask);
    public static final String CACHE_KEY_PREFIX_GENRE_VIDEOS = getCacheKeyFromClassName(com/netflix/mediaclient/service/browse/BrowseAgent$FetchGenreVideosTask);
    public static final String CACHE_KEY_PREFIX_IQ_VIDEOS = getCacheKeyFromClassName(com/netflix/mediaclient/service/browse/BrowseAgent$FetchIQVideosTask);
    private static final String CACHE_KEY_PREFIX_KIDS_CDP = getCacheKeyFromClassName(com/netflix/mediaclient/service/browse/BrowseAgent$FetchKidsCharacterDetailsTask);
    public static final String CACHE_KEY_PREFIX_LOMO = getCacheKeyFromClassName(com/netflix/mediaclient/service/browse/BrowseAgent$FetchLoMosTask);
    public static final String CACHE_KEY_PREFIX_MDP = getCacheKeyFromClassName(com/netflix/mediaclient/service/browse/BrowseAgent$FetchMovieDetailsTask);
    public static final String CACHE_KEY_PREFIX_SDP = getCacheKeyFromClassName(com/netflix/mediaclient/service/browse/BrowseAgent$FetchShowDetailsTask);
    private static final String CACHE_KEY_PREFIX_SEASON_DETAILS = getCacheKeyFromClassName(com/netflix/mediaclient/service/browse/BrowseAgent$FetchSeasonDetailsTask);
    public static final String CACHE_KEY_PREFIX_VIDEOS = getCacheKeyFromClassName(com/netflix/mediaclient/service/browse/BrowseAgent$FetchVideosTask);
    public static final String CHARACTERS_KEY = "characters";
    public static final String CONTINUE_WATCHING_KEY = "continueWatching";
    public static final String GENRE_LIST_KEY = "genreList";
    public static final String INSTANT_QUEUE_KEY = "queue";
    public static final String LOLOMO_KEY = "lolomo";
    private static final int MARGIN_FOR_BOOKMARK_RESET_SECONDS = 30;
    private static final int MAX_NUM_EPISODES_ITEMS;
    private static final int MAX_NUM_SEASONS_ITEMS;
    private static final int MAX_NUM_SOFTCACHE_ITEMS;
    static final String SEPERATOR = "_";
    private static final String TAG = "nf_service_browseagent";
    private static final boolean USE_HARD_CACHE_CONST = false;
    private static final boolean USE_SOFT_CACHE_CONST = true;
    private static boolean isCurrentProfileActive;
    private static int mPrefetchFromCWVideo;
    private static int mPrefetchFromVideo;
    private static int mPrefetchToCWVideo;
    private static int mPrefetchToVideo;
    private List cwKeysCache;
    private DataDumper dataDumper;
    private HardCache hardCache;
    private List iqKeysCache;
    private BrowseWebClient mBrowseWebClient;
    private final PlayReceiver mPlayReceiver = new PlayReceiver();
    public final BroadcastReceiver mUserAgentIntentReceiver = new BroadcastReceiver() {

        final BrowseAgent this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null)
            {
                context = intent.getAction();
                Log.i("nf_service_browseagent", (new StringBuilder()).append("UserAgentIntentReceiver inovoked and received Intent with Action ").append(intent.getAction()).toString());
                if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE".equals(context))
                {
                    handleProfileActive();
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE".equals(context))
                {
                    handleProfileDeactive();
                    return;
                }
            }
        }

            
            {
                this$0 = BrowseAgent.this;
                super();
            }
    };
    private SoftCache softCache;
    private SoftCache weakEpisodesCache;
    private SoftCache weakSeasonsCache;

    public BrowseAgent()
    {
    }

    public static boolean areIqIdsInCache(HardCache hardcache)
    {
        if (StringUtils.isEmpty(getLoLoMoId(hardcache)))
        {
            Log.d("nf_service_browseagent", "LoLoMoId missing in cache");
            return false;
        }
        if (StringUtils.isEmpty(getIQLoMoIndex(hardcache)))
        {
            Log.d("nf_service_browseagent", "IQ index missing in cache");
            return false;
        }
        if (StringUtils.isEmpty(getIQLoMoId(hardcache)))
        {
            Log.d("nf_service_browseagent", "IQ LoMo Id missing in cache");
            return false;
        } else
        {
            return true;
        }
    }

    public static String buildBrowseCacheKey(String s, String s1, String s2, String s3)
    {
        return (new StringBuilder()).append(s).append("_").append(s1).append("_").append(s2).append("_").append(s3).toString();
    }

    public static String buildBrowseGenreLoLoMoCacheKey(String s)
    {
        return buildBrowseCacheKey("genre_lolomo_id", s, "0", "0");
    }

    private static String buildEpisodeDetailsCacheKey(String s)
    {
        return buildBrowseCacheKey(CACHE_KEY_PREFIX_EPISODE_DETAILS, s, "0", "0");
    }

    private static String buildSeasonDetailsCacheKey(String s)
    {
        return buildBrowseCacheKey(CACHE_KEY_PREFIX_SEASON_DETAILS, s, "0", "0");
    }

    public static String buildStillUrlFromPos(String s, int i, int j)
    {
        if (StringUtils.isEmpty(s))
        {
            return null;
        }
        int k = i;
        if (i < 10)
        {
            k = (new Random()).nextInt(j);
        }
        String s1 = String.valueOf(k / 10);
        StringBuilder stringbuilder = (new StringBuilder(s)).append("/00000");
        stringbuilder.replace(stringbuilder.length() - s1.length(), stringbuilder.length(), s1);
        stringbuilder.append(".jpg");
        if (Log.isLoggable("nf_service_browseagent", 3))
        {
            Log.d("nf_bookmark", (new StringBuilder()).append("baseUrl:").append(s).append(" stillPos:").append(s1).append(" stillUrl:").append(stringbuilder.toString()).toString());
        }
        return stringbuilder.toString();
    }

    private boolean cacheHasLolomoId(HardCache hardcache)
    {
        if (StringUtils.isEmpty(getLoLoMoId(hardcache)))
        {
            Log.d("nf_service_browseagent", "LoLoMoId missing in cache");
            return false;
        } else
        {
            return true;
        }
    }

    private static boolean canDoDataFetches()
    {
        if (!isCurrentProfileActive)
        {
            Log.d("nf_service_browseagent", "wrong state - canDoDataFetches false - skipping browse request");
        }
        return isCurrentProfileActive;
    }

    private boolean canRefreshCW(HardCache hardcache)
    {
        if (StringUtils.isEmpty(getCWLoMoIndex(hardcache)))
        {
            Log.d("nf_service_browseagent", "CW index missing in cache - cannot refresh CW");
            return false;
        }
        if (StringUtils.isEmpty(getCWLoMoId(hardcache)))
        {
            Log.d("nf_service_browseagent", "CW id missing in cache - cannot refresh CW");
            return false;
        } else
        {
            return true;
        }
    }

    public static int computePlayPos(int i, int j, int k)
    {
        if (j > 0 && i >= j)
        {
            j = 0;
        } else
        {
            if (k > 0 && i >= k - 30)
            {
                return 0;
            }
            j = i;
            if (i < 0)
            {
                return 0;
            }
        }
        return j;
    }

    public static String getCWLoMoId(HardCache hardcache)
    {
        return (String)hardcache.get("continueWatching_list_id");
    }

    public static String getCWLoMoIndex(HardCache hardcache)
    {
        return (String)hardcache.get("cw_lomo_index");
    }

    public static ListOfMoviesSummary getCWLoMoSummary(HardCache hardcache)
    {
        return (ListOfMoviesSummary)hardcache.get("cw_lomo_summary");
    }

    private static String getCacheKeyFromClassName(Class class1)
    {
        return class1.getSimpleName();
    }

    public static Object getFromCaches(HardCache hardcache, SoftCache softcache, String s)
    {
        Object obj = softcache.get(s);
        softcache = ((SoftCache) (obj));
        if (obj == null)
        {
            softcache = ((SoftCache) (hardcache.get(s)));
        }
        return softcache;
    }

    public static String getGenreLoLoMoId(HardCache hardcache, String s)
    {
        return (String)hardcache.get(buildBrowseGenreLoLoMoCacheKey(s));
    }

    public static String getIQLoMoId(HardCache hardcache)
    {
        return (String)hardcache.get("queue_list_id");
    }

    public static String getIQLoMoIndex(HardCache hardcache)
    {
        return (String)hardcache.get("iq_lomo_index");
    }

    public static ListOfMoviesSummary getIQLoMoSummary(HardCache hardcache)
    {
        return (ListOfMoviesSummary)hardcache.get("iq_lomo_summary");
    }

    public static KidsCharacterDetails getKidsCharacterDetailsFromCache(String s, HardCache hardcache, SoftCache softcache)
    {
        return (KidsCharacterDetails)getFromCaches(hardcache, softcache, buildBrowseCacheKey(CACHE_KEY_PREFIX_KIDS_CDP, s, "0", "0"));
    }

    public static String getLoLoMoId(HardCache hardcache)
    {
        return (String)hardcache.get("lolomo_id");
    }

    private EpisodeDetails getNextPlayableEpisode(EpisodeDetails episodedetails, long l)
    {
        if (computePlayPos(episodedetails.getBookmarkPosition(), episodedetails.getEndtime(), episodedetails.getRuntime()) == episodedetails.getBookmarkPosition())
        {
            return episodedetails;
        }
        Object obj = buildEpisodeDetailsCacheKey(episodedetails.getNextEpisodeId());
        if (Log.isLoggable("nf_service_browseagent", 3))
        {
            Log.d("nf_bookmark", (new StringBuilder()).append("looking for episode with key: ").append(((String) (obj))).toString());
        }
        obj = (WeakReference)weakEpisodesCache.get(((String) (obj)));
        if (obj != null)
        {
            obj = (EpisodeDetails)((WeakReference) (obj)).get();
            ((EpisodeDetails) (obj)).bookmark.setLastModified(l);
            episodedetails = ((EpisodeDetails) (obj));
            if (Log.isLoggable("nf_service_browseagent", 3))
            {
                Log.d("nf_bookmark", String.format("nextPlayableEpisode %s title %s", new Object[] {
                    ((EpisodeDetails) (obj)).getId(), ((EpisodeDetails) (obj)).getTitle()
                }));
                episodedetails = ((EpisodeDetails) (obj));
            }
        } else
        {
            if (Log.isLoggable("nf_service_browseagent", 3))
            {
                Log.d("nf_bookmark", "next episode does not exist in cache - expecting cwRefresh to have it on next update");
            }
            episodedetails.bookmark.setLastModified(0L);
        }
        return episodedetails;
    }

    private void handleProfileActive()
    {
        Log.i("nf_service_browseagent", "Flushing all caches...");
        flushCaches();
        isCurrentProfileActive = true;
    }

    private void handleProfileDeactive()
    {
        isCurrentProfileActive = false;
    }

    private void initCaches()
    {
        softCache = new SoftBrowseCache(MAX_NUM_SOFTCACHE_ITEMS);
        hardCache = new HardBrowseCache();
        weakSeasonsCache = new SoftBrowseCache(MAX_NUM_SEASONS_ITEMS);
        weakEpisodesCache = new SoftBrowseCache(MAX_NUM_EPISODES_ITEMS);
        cwKeysCache = new ArrayList();
        iqKeysCache = new ArrayList();
        mBrowseWebClient = BrowseWebClientFactory.create(hardCache, softCache, weakSeasonsCache, cwKeysCache, iqKeysCache, getService(), getResourceFetcher().getApiNextWebClient());
    }

    private Boolean isKidsCharacterDetailsNew(com.netflix.mediaclient.servicemgr.KidsCharacterDetails kidscharacterdetails, com.netflix.mediaclient.servicemgr.KidsCharacterDetails kidscharacterdetails1)
    {
        if (Log.isLoggable("nf_service_browseagent", 3))
        {
            String s1 = kidscharacterdetails.getCharacterId();
            String s2 = kidscharacterdetails.getPlayableId();
            String s;
            if (kidscharacterdetails1 == null)
            {
                s = "n/a";
            } else
            {
                s = kidscharacterdetails1.getPlayableId();
            }
            Log.d("nf_service_browseagent", String.format("charId: %s, cachePlayableId:%s, newPlayableId:%s", new Object[] {
                s1, s2, s
            }));
        }
        if (kidscharacterdetails1 == null)
        {
            return Boolean.valueOf(false);
        }
        boolean flag;
        if (!StringUtils.safeEquals(kidscharacterdetails.getPlayableId(), kidscharacterdetails1.getPlayableId()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    private void launchTask(Runnable runnable)
    {
        if (Log.isLoggable("nf_service_browseagent", 2))
        {
            Log.v("nf_service_browseagent", (new StringBuilder()).append("Launching task: ").append(runnable.getClass().getSimpleName()).toString());
        }
        if (mBrowseWebClient.isSynchronous())
        {
            (new BackgroundTask()).execute(runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    private boolean needToPrefetch()
    {
        return getLoLoMoId(hardCache) == null;
    }

    private boolean needToPrefetchGenre(String s)
    {
        return getGenreLoLoMoId(hardCache, s) == null;
    }

    public static void putCWLoMoId(HardCache hardcache, Object obj)
    {
        hardcache.put("continueWatching_list_id", obj);
    }

    public static void putCWLoMoIndex(HardCache hardcache, Object obj)
    {
        hardcache.put("cw_lomo_index", obj);
    }

    public static void putCWLoMoSummary(HardCache hardcache, Object obj)
    {
        hardcache.put("cw_lomo_summary", obj);
    }

    public static void putIQLoMoId(HardCache hardcache, Object obj)
    {
        hardcache.put("queue_list_id", obj);
    }

    public static void putIQLoMoIndex(HardCache hardcache, Object obj)
    {
        hardcache.put("iq_lomo_index", obj);
    }

    public static void putIQLoMoSummary(HardCache hardcache, Object obj)
    {
        hardcache.put("iq_lomo_summary", obj);
    }

    public static void putInBrowseCache(BrowseCache browsecache, String s, Object obj)
    {
        browsecache.put(s, obj);
    }

    private void putInWeakEpisodesCache(com.netflix.mediaclient.servicemgr.EpisodeDetails episodedetails)
    {
        String s = buildEpisodeDetailsCacheKey(episodedetails.getId());
        if (Log.isLoggable("nf_service_browseagent", 3))
        {
            Log.d("nf_bookmark", (new StringBuilder()).append("putting episode in weakEpisodesCache: ").append(episodedetails.getTitle()).append(", cache key: ").append(s).toString());
        }
        episodedetails = new WeakReference(episodedetails);
        putInBrowseCache(weakEpisodesCache, s, episodedetails);
    }

    private void putInWeakEpisodesCache(List list)
    {
        for (list = list.iterator(); list.hasNext(); putInWeakEpisodesCache((com.netflix.mediaclient.servicemgr.EpisodeDetails)list.next())) { }
    }

    private void putInWeakSeasonsCache(List list)
    {
        String s;
        Object obj;
        for (list = list.iterator(); list.hasNext(); putInBrowseCache(weakSeasonsCache, s, obj))
        {
            obj = (SeasonDetails)list.next();
            s = buildSeasonDetailsCacheKey(((SeasonDetails) (obj)).getId());
            obj = new WeakReference(obj);
        }

    }

    private void refreshCacheWithLastPlayed(Asset asset)
    {
        int i = asset.getPlaybackBookmark();
        if (i > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        Object obj;
        long l;
        boolean flag;
        s = asset.getPlayableId();
        flag = asset.isEpisode();
        obj = asset.getParentId();
        l = System.currentTimeMillis();
        if (StringUtils.isEmpty(s) || flag && StringUtils.isEmpty(((String) (obj)))) goto _L1; else goto _L3
_L3:
        EpisodeDetails episodedetails;
        if (Log.isLoggable("nf_service_browseagent", 3))
        {
            Log.d("nf_bookmark", String.format("%s bookmarkpos %d", new Object[] {
                s, Integer.valueOf(i)
            }));
        }
        asset = null;
        episodedetails = null;
        if (flag) goto _L5; else goto _L4
_L4:
        asset = buildBrowseCacheKey(CACHE_KEY_PREFIX_MDP, s, "0", "0");
        obj = (MovieDetails)getFromCaches(hardCache, softCache, asset);
        asset = episodedetails;
        if (obj != null)
        {
            asset = episodedetails;
            if (((MovieDetails) (obj)).bookmark != null)
            {
                if (Log.isLoggable("nf_service_browseagent", 3))
                {
                    Log.d("nf_bookmark", String.format("%s movie bookmarkPos %d to newPos %d, oldtime %d to newTime %d", new Object[] {
                        s, Integer.valueOf(((MovieDetails) (obj)).getBookmarkPosition()), Integer.valueOf(i), Long.valueOf(((MovieDetails) (obj)).bookmark.getLastModified()), Long.valueOf(l)
                    }));
                }
                ((MovieDetails) (obj)).setBookmarkPosition(i);
                ((MovieDetails) (obj)).bookmark.setLastModified(l);
                asset = episodedetails;
                if (Log.isLoggable("nf_service_browseagent", 3))
                {
                    Log.d("nf_bookmark", String.format("%s, bookmarkpos %d playpos %d endtime %d runtime %d", new Object[] {
                        s, Integer.valueOf(i), Integer.valueOf(computePlayPos(i, ((MovieDetails) (obj)).getEndtime(), ((MovieDetails) (obj)).getRuntime())), Integer.valueOf(((MovieDetails) (obj)).getEndtime()), Integer.valueOf(((MovieDetails) (obj)).getRuntime())
                    }));
                    asset = episodedetails;
                }
            }
        }
_L9:
        updateCwOnPlay(s, i, l, asset);
        return;
_L5:
        obj = buildBrowseCacheKey(CACHE_KEY_PREFIX_SDP, ((String) (obj)), "0", "0");
        obj = (ShowDetails)getFromCaches(hardCache, softCache, ((String) (obj)));
        if (obj == null) goto _L1; else goto _L6
_L6:
        Object obj1 = buildEpisodeDetailsCacheKey(s);
        if (Log.isLoggable("nf_service_browseagent", 3))
        {
            Log.d("nf_bookmark", (new StringBuilder()).append("looking for episode with key: ").append(((String) (obj1))).toString());
        }
        obj1 = (WeakReference)weakEpisodesCache.get(((String) (obj1)));
        if (obj1 != null)
        {
            asset = (EpisodeDetails)((WeakReference) (obj1)).get();
        }
        if (asset == null || ((EpisodeDetails) (asset)).bookmark == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("nf_service_browseagent", 3))
        {
            Log.d("nf_bookmark", String.format("%s episode bookmarkPos %d to newPos %d, oldtime %d to newTime %d", new Object[] {
                s, Integer.valueOf(asset.getBookmarkPosition()), Integer.valueOf(i), Long.valueOf(((EpisodeDetails) (asset)).bookmark.getLastModified()), Long.valueOf(l)
            }));
        }
        ((EpisodeDetails) (asset)).bookmark.setBookmarkPosition(i);
        ((EpisodeDetails) (asset)).bookmark.setLastModified(l);
        if (Log.isLoggable("nf_service_browseagent", 3))
        {
            Log.d("nf_bookmark", String.format("id %s, bookmarkpos %d playpos %d endtime %d runtime %d", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(computePlayPos(i, asset.getEndtime(), asset.getRuntime())), Integer.valueOf(asset.getEndtime()), Integer.valueOf(asset.getRuntime())
            }));
        }
        episodedetails = getNextPlayableEpisode(asset, l);
        if (Log.isLoggable("nf_service_browseagent", 3))
        {
            Log.d("nf_bookmark", String.format("next playable episode: %s - %s, S%d: E%d", new Object[] {
                episodedetails.getId(), episodedetails.getTitle(), Integer.valueOf(episodedetails.getSeasonNumber()), Integer.valueOf(episodedetails.getEpisodeNumber())
            }));
        }
        flag = StringUtils.safeEquals(((ShowDetails) (obj)).currentEpisode.getId(), asset.getId());
        updateShowOnEpisodePlay(((ShowDetails) (obj)), episodedetails);
        updateSeasonsInformation(weakSeasonsCache, episodedetails.getSeasonId(), episodedetails.getEpisodeNumber());
        if (!asset.hasSameSeasonAndEpisodeNumbers(episodedetails)) goto _L8; else goto _L7
_L7:
        asset = episodedetails;
        if (flag) goto _L9; else goto _L8
_L8:
        sendEpisodeRefreshBrodcast(episodedetails.getSeasonNumber(), episodedetails.getEpisodeNumber());
        asset = episodedetails;
          goto _L9
        if (!StringUtils.safeEquals(s, ((ShowDetails) (obj)).getCurrentEpisodeId())) goto _L1; else goto _L10
_L10:
        ((ShowDetails) (obj)).currentEpisodeBookmark.setBookmarkPosition(i);
        ((ShowDetails) (obj)).currentEpisodeBookmark.setLastModified(l);
        asset = episodedetails;
        if (Log.isLoggable("nf_service_browseagent", 3))
        {
            Log.d("nf_bookmark", "Episode details don't exist; updated sdp currentEpisode");
            asset = episodedetails;
        }
          goto _L9
    }

    private void registerPlayReceiver()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_START");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_STOP");
        getContext().registerReceiver(mPlayReceiver, intentfilter);
    }

    private void registerUserAgentIntentReceiver()
    {
        LocalBroadcastManager.getInstance(getContext()).registerReceiver(mUserAgentIntentReceiver, UserAgentBroadcastIntents.getNotificationIntentFilter());
    }

    private void sendCwRefreshBrodcast()
    {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.BA_CW_REFRESH");
        getContext().sendBroadcast(intent);
        Log.v("nf_service_browseagent", "Intent CW_REFRESH sent");
    }

    private void sendIqRefreshBrodcast()
    {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.BA_IQ_REFRESH");
        getContext().sendBroadcast(intent);
        Log.v("nf_service_browseagent", "Intent IQ_REFRESH sent");
    }

    private void unregisterPlayReceiver()
    {
        try
        {
            getContext().unregisterReceiver(mPlayReceiver);
            return;
        }
        catch (Exception exception)
        {
            Log.i("nf_service_browseagent", (new StringBuilder()).append("unregisterPlayReceiver ").append(exception).toString());
        }
    }

    private void unregisterUserAgentIntentReceiver()
    {
        try
        {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(mUserAgentIntentReceiver);
            return;
        }
        catch (Exception exception)
        {
            Log.i("nf_service_browseagent", (new StringBuilder()).append("unregisterUserAgentIntentReceiver ").append(exception).toString());
        }
    }

    private void updateCwForNewEpisode(CWVideo cwvideo, EpisodeDetails episodedetails)
    {
        if (Log.isLoggable("nf_service_browseagent", 2))
        {
            Log.v("nf_service_browseagent", (new StringBuilder()).append("Updating CWVideo episode info with details: ").append(episodedetails.detail).toString());
        }
        cwvideo.currentEpisode = episodedetails.detail;
        cwvideo.currentEpisodeBookmark = episodedetails.bookmark;
    }

    private void updateCwOnPlay(String s, int i, long l, EpisodeDetails episodedetails)
    {
        Object obj;
        obj = buildBrowseCacheKey(CACHE_KEY_PREFIX_CW_VIDEOS, "continueWatching", String.valueOf(mPrefetchFromCWVideo), String.valueOf(mPrefetchToCWVideo));
        obj = (List)hardCache.get(((String) (obj)));
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L8:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L3
_L3:
        CWVideo cwvideo;
        boolean flag1;
        cwvideo = (CWVideo)((Iterator) (obj)).next();
        flag1 = false;
        if (!cwvideo.getPlayableId().equals(s)) goto _L5; else goto _L4
_L4:
        boolean flag;
        flag = true;
        updateCwPlayable(cwvideo, i, l, episodedetails);
_L6:
        if (flag && cwvideo.bookmarkStill != null)
        {
            cwvideo.bookmarkStill.stillUrl = buildStillUrlFromPos(cwvideo.getBaseUrl(), cwvideo.getPlayableBookmarkPosition(), cwvideo.getEndtime());
        }
        continue; /* Loop/switch isn't completed */
_L5:
        flag = flag1;
        if (episodedetails != null)
        {
            flag = flag1;
            if (StringUtils.safeEquals(cwvideo.getParentId(), episodedetails.getParentId()))
            {
                if (Log.isLoggable("nf_service_browseagent", 2))
                {
                    Log.v("nf_service_browseagent", (new StringBuilder()).append("Updating CW video for new episode in same show, id: ").append(cwvideo.getParentId()).toString());
                }
                flag = true;
                updateCwForNewEpisode(cwvideo, episodedetails);
            }
        }
        if (true) goto _L6; else goto _L2
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void updateCwPlayable(CWVideo cwvideo, int i, long l, EpisodeDetails episodedetails)
    {
        if (VideoType.MOVIE.equals(cwvideo.getType()))
        {
            if (Log.isLoggable("nf_service_browseagent", 3))
            {
                Log.d("nf_bookmark", String.format("cw movie bookmarkPos  updated from %d to %d", new Object[] {
                    Integer.valueOf(cwvideo.getBookmarkPosition()), Integer.valueOf(i)
                }));
            }
            cwvideo.bookmark.setBookmarkPosition(i);
            cwvideo.bookmark.setLastModified(l);
        } else
        {
            if (episodedetails != null)
            {
                cwvideo.currentEpisode = episodedetails.detail;
                cwvideo.currentEpisodeBookmark = episodedetails.bookmark;
            } else
            {
                cwvideo.currentEpisodeBookmark.setBookmarkPosition(i);
                cwvideo.currentEpisodeBookmark.setLastModified(l);
            }
            if (Log.isLoggable("nf_service_browseagent", 3))
            {
                Log.d("nf_bookmark", String.format("cw %s updated - ce %s bookmarkTime %d bookmarkPos %d", new Object[] {
                    cwvideo.getId(), cwvideo.getCurrentEpisodeId(), Long.valueOf(cwvideo.getBookmarkLastUpdateTime()), Integer.valueOf(cwvideo.getBookmarkPosition())
                }));
                return;
            }
        }
    }

    private void updateEpisodesWithLatestShowInformation(HardCache hardcache, SoftCache softcache, List list)
    {
        if (list.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s = ((com.netflix.mediaclient.servicemgr.EpisodeDetails)list.get(0)).getShowId();
        hardcache = (ShowDetails)getFromCaches(hardcache, softcache, buildBrowseCacheKey(CACHE_KEY_PREFIX_SDP, s, "0", "0"));
        if (hardcache != null && ((ShowDetails) (hardcache)).socialEvidence != null)
        {
            softcache = list.iterator();
            while (softcache.hasNext()) 
            {
                ((EpisodeDetails)(com.netflix.mediaclient.servicemgr.EpisodeDetails)softcache.next()).showSocialEvidence = ((ShowDetails) (hardcache)).socialEvidence;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void updateSeasonWithSdp(final com.netflix.mediaclient.servicemgr.ShowDetails showDetails)
    {
        if (showDetails == null)
        {
            return;
        } else
        {
            fetchSeasons(showDetails.getId(), 0, showDetails.getNumOfSeasons() - 1, new SimpleBrowseAgentCallback() {

                final BrowseAgent this$0;
                final com.netflix.mediaclient.servicemgr.ShowDetails val$showDetails;

                public void onSeasonsFetched(List list, int i)
                {
                    if (i == 0)
                    {
                        list = list.iterator();
                        do
                        {
                            if (!list.hasNext())
                            {
                                break;
                            }
                            SeasonDetails seasondetails = (SeasonDetails)list.next();
                            if (seasondetails.getSeasonNumber() == showDetails.getCurrentSeasonNumber())
                            {
                                com.netflix.mediaclient.service.webclient.model.SeasonDetails seasondetails1 = (com.netflix.mediaclient.service.webclient.model.SeasonDetails)seasondetails;
                                if (seasondetails1.detail != null)
                                {
                                    if (Log.isLoggable("nf_service_browseagent", 3))
                                    {
                                        Log.d("nf_service_browseagent", String.format("currentepisode being overwitten from %d to %d", new Object[] {
                                            Integer.valueOf(seasondetails.getCurrentEpisodeNumber()), Integer.valueOf(showDetails.getCurrentEpisodeNumber())
                                        }));
                                    }
                                    seasondetails1.detail.currentEpisodeNumber = showDetails.getCurrentEpisodeNumber();
                                }
                            }
                        } while (true);
                    }
                }

            
            {
                this$0 = BrowseAgent.this;
                showDetails = showdetails;
                super();
            }
            });
            return;
        }
    }

    public static void updateSeasonsInformation(SoftCache softcache, String s, int i)
    {
        softcache = (WeakReference)softcache.get(buildSeasonDetailsCacheKey(s));
        if (softcache != null)
        {
            softcache = (com.netflix.mediaclient.service.webclient.model.SeasonDetails)softcache.get();
            ((com.netflix.mediaclient.service.webclient.model.SeasonDetails) (softcache)).detail.currentEpisodeNumber = i;
            if (Log.isLoggable("nf_service_browseagent", 3))
            {
                Log.d("nf_bookmark", (new StringBuilder()).append("updateSeasonsInformation: seasonId:").append(s).append(" currentEpisode:").append(softcache.getCurrentEpisodeNumber()).toString());
            }
        }
    }

    private static void updateShowOnEpisodePlay(ShowDetails showdetails, EpisodeDetails episodedetails)
    {
        showdetails.currentEpisode = episodedetails.detail;
        showdetails.currentEpisodeBookmark = episodedetails.bookmark;
    }

    public void addToQueue(String s, int i, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new AddToQueueTask(s, i, browseagentcallback));
    }

    public boolean areIqIdsInCache()
    {
        return areIqIdsInCache(hardCache);
    }

    public void destroy()
    {
        unregisterUserAgentIntentReceiver();
        unregisterPlayReceiver();
        super.destroy();
    }

    public void doInit()
    {
        initCaches();
        isCurrentProfileActive = false;
        registerUserAgentIntentReceiver();
        registerPlayReceiver();
        dataDumper = new DataDumper(mBrowseWebClient, hardCache, softCache);
        initCompleted(0);
    }

    public void dumpHomeLoLoMosAndVideos(String s, String s1)
    {
        dataDumper.dumpHomeLoLoMosAndVideos(s, s1);
    }

    public void dumpHomeLoLoMosAndVideosToLog()
    {
        dataDumper.dumpHomeLoLoMosAndVideosToLog();
    }

    public void dumpHomeLoMos()
    {
        dataDumper.dumpHomeLoMos();
    }

    public void fetchCWVideos(int i, int j, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchCWVideosTask(i, j, browseagentcallback, true));
    }

    public void fetchEpisodeDetails(String s, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchEpisodeDetailsTask(s, browseagentcallback));
    }

    public void fetchEpisodes(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchEpisodesTask(s, i, j, browseagentcallback));
    }

    public void fetchGenreList(BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchGenreListsTask(browseagentcallback));
    }

    public void fetchGenreVideos(LoMo lomo, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchGenreVideosTask(lomo, i, j, browseagentcallback));
    }

    public void fetchGenres(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchGenresTask(s, i, j, browseagentcallback));
    }

    public void fetchIQVideos(int i, int j, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchIQVideosTask(i, j, browseagentcallback, true));
    }

    public void fetchKidsCharacterDetails(String s, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchKidsCharacterDetailsTask(s, browseagentcallback));
    }

    public void fetchLoLoMoSummary(String s, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchLoLoMoSummaryTask(s, browseagentcallback));
    }

    public void fetchLoMos(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchLoMosTask(s, i, j, browseagentcallback, true));
    }

    public void fetchMovieDetails(String s, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchMovieDetailsTask(s, browseagentcallback));
    }

    public void fetchPostPlayVideos(String s, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchPostPlayTask(s, browseagentcallback));
    }

    public void fetchSeasonDetails(String s, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchSeasonDetailsTask(s, browseagentcallback));
    }

    public void fetchSeasons(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchSeasonsTask(s, i, j, browseagentcallback));
    }

    public void fetchShowDetails(String s, String s1, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchShowDetailsTask(s, s1, browseagentcallback));
    }

    public void fetchSimilarVideosForPerson(String s, int i, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchSimilarVideosForPersonTask(s, i, browseagentcallback));
    }

    public void fetchSimilarVideosForQuerySuggestion(String s, int i, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchSimilarVideosForQuerySuggestionTask(s, i, browseagentcallback));
    }

    public void fetchVideos(LoMo lomo, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new FetchVideosTask(lomo, i, j, browseagentcallback, true));
    }

    public void flushCaches()
    {
        initCaches();
    }

    public void hideVideo(String s, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new HideVideoTask(s, browseagentcallback));
    }

    public void logBillboardActivity(Video video, BillboardActivityType billboardactivitytype)
    {
        launchTask(new LogBillboardActivityTask(video, billboardactivitytype));
    }

    public void prefetchGenreLoLoMo(String s, int i, int j, int k, int l, boolean flag, BrowseAgentCallback browseagentcallback)
    {
        if (Log.isLoggable("nf_service_browseagent", 4))
        {
            Log.i("nf_service_browseagent", "Request to prefetchGenre  LoLoMo");
        }
        if (!needToPrefetchGenre(s))
        {
            browseagentcallback.onGenreLoLoMoPrefetched(0);
            return;
        } else
        {
            launchTask(new PrefetchGenreLoLoMoTask(s, i, j, k, l, flag, browseagentcallback));
            return;
        }
    }

    public void prefetchLoLoMo(int i, int j, int k, int l, int i1, int j1, boolean flag, 
            boolean flag1, BrowseAgentCallback browseagentcallback)
    {
        if (Log.isLoggable("nf_service_browseagent", 4))
        {
            Log.i("nf_service_browseagent", "Request to prefetch LoLoMo");
        }
        if (!needToPrefetch())
        {
            browseagentcallback.onLoLoMoPrefetched(0);
            return;
        } else
        {
            mPrefetchToCWVideo = j1;
            mPrefetchFromCWVideo = i1;
            mPrefetchToVideo = l;
            mPrefetchFromVideo = k;
            launchTask(new PrefetchLoLoMoTask(i, j, k, l, i1, j1, flag, flag1, browseagentcallback));
            return;
        }
    }

    public void refreshCW()
    {
        Log.v("nf_service_browseagent", "Refreshing CW data from server...");
        launchTask(new RefreshCWTask());
    }

    public void refreshEpisodesData(Asset asset)
    {
        Log.d("nf_bookmark", "Refreshing episodes data");
        String s = asset.getPlayableId();
        boolean flag = asset.isEpisode();
        asset = asset.getParentId();
        if (StringUtils.isEmpty(s) || flag && StringUtils.isEmpty(asset))
        {
            if (Log.isLoggable("nf_service_browseagent", 3))
            {
                Log.d("nf_bookmark", String.format("populate cache - parentId %s or videoId %s null - skip!", new Object[] {
                    asset, s
                }));
            }
        } else
        if (!flag)
        {
            if (Log.isLoggable("nf_service_browseagent", 3))
            {
                Log.d("nf_bookmark", String.format("populate cache - parentId %s or videoId %s is Movie - skip!", new Object[] {
                    asset, s
                }));
                return;
            }
        } else
        {
            Object obj = buildBrowseCacheKey(CACHE_KEY_PREFIX_SDP, asset, "0", "0");
            obj = (ShowDetails)getFromCaches(hardCache, softCache, ((String) (obj)));
            if (obj == null || ((ShowDetails) (obj)).currentEpisode == null)
            {
                Log.w("nf_bookmark", String.format("populate cache - parentId %s or videoId %s null - SDP missing skip!", new Object[] {
                    asset, s
                }));
                return;
            }
            String s1 = ((ShowDetails) (obj)).currentEpisode.getSeasonId();
            int i = ((ShowDetails) (obj)).getCurrentEpisodeNumber();
            int j = (i / 40) * 40;
            int k = (j + 40) - 1;
            if (Log.isLoggable("nf_service_browseagent", 3))
            {
                Log.d("nf_bookmark", String.format("populate cache - Show %s, ce %s seasonId %s ceNum %d, reqStart %d reqEnd %d", new Object[] {
                    asset, s, s1, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
                }));
            }
            fetchEpisodes(s1, j, k, new SimpleBrowseAgentCallback() {

                final BrowseAgent this$0;

                public void onEpisodesFetched(List list, int l)
                {
                    if (Log.isLoggable("nf_service_browseagent", 3))
                    {
                        Log.d("nf_bookmark", String.format("populate cache - onEpisodesFetched statusCode %d", new Object[] {
                            Integer.valueOf(l)
                        }));
                    }
                }

            
            {
                this$0 = BrowseAgent.this;
                super();
            }
            });
            return;
        }
    }

    public void refreshKidsCharacterDetail(String s, BrowseAgentCallback browseagentcallback)
    {
        Log.d("nf_service_browseagent", (new StringBuilder()).append("refreshKidsCharacterDetail id:").append(s).toString());
        KidsCharacterDetails kidscharacterdetails = getKidsCharacterDetailsFromCache(s, hardCache, softCache);
        if (kidscharacterdetails == null)
        {
            Log.d("nf_service_browseagent", String.format("refreshKidsCharacterDetail id:%s, cache null - skip", new Object[] {
                s
            }));
            browseagentcallback.onKidsCharacterDetailsFetched(kidscharacterdetails, Boolean.valueOf(true), 0);
            return;
        } else
        {
            launchTask(new RefreshKidsCharacterDetailsTask(s, browseagentcallback));
            return;
        }
    }

    public void removeFromQueue(String s, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new RemoveFromQueueTask(s, browseagentcallback));
    }

    public void searchNetflix(String s, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new SearchNetflixTask(s, browseagentcallback));
    }

    public void sendEpisodeRefreshBrodcast(int i, int j)
    {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.BA_EPISODE_REFRESH");
        intent.putExtra("curSeasonNumber", i);
        intent.putExtra("curEpisodeNumber", j);
        getContext().sendBroadcast(intent);
        Log.v("nf_service_browseagent", "Intent EPISODE_REFRESH sent");
    }

    public void sendHomeRefreshBrodcast()
    {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO");
        getContext().sendBroadcast(intent);
        Log.v("nf_service_browseagent", "Intent REFRESH_HOME sent");
    }

    public void setVideoRating(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        launchTask(new SetVideoRatingTask(s, i, j, browseagentcallback));
    }

    public void updateCachedCwData(Asset asset)
    {
        Log.v("nf_service_browseagent", (new StringBuilder()).append("Updating cached CW data with asset: ").append(asset).toString());
        refreshCacheWithLastPlayed(asset);
        refreshCW();
    }

    public void updateCachedVideoPosition(Asset asset)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Updating video positions for asset: ");
        String s;
        if (asset == null)
        {
            s = "null";
        } else
        {
            s = asset.getTitle();
        }
        Log.v("nf_service_browseagent", stringbuilder.append(s).toString());
        refreshCacheWithLastPlayed(asset);
    }

    protected void updateEpisodeWithLatestShowInformation(HardCache hardcache, SoftCache softcache, com.netflix.mediaclient.servicemgr.EpisodeDetails episodedetails)
    {
        EpisodeDetails episodedetails1 = (EpisodeDetails)episodedetails;
        episodedetails = episodedetails.getShowId();
        hardcache = (ShowDetails)getFromCaches(hardcache, softcache, buildBrowseCacheKey(CACHE_KEY_PREFIX_SDP, episodedetails, "0", "0"));
        if (hardcache != null && episodedetails1.detail != null)
        {
            if (((ShowDetails) (hardcache)).rating != null)
            {
                episodedetails1.rating = ((ShowDetails) (hardcache)).rating;
            }
            if (((ShowDetails) (hardcache)).socialEvidence != null)
            {
                episodedetails1.showSocialEvidence = ((ShowDetails) (hardcache)).socialEvidence;
            }
            if (((ShowDetails) (hardcache)).detail != null)
            {
                episodedetails1.detail.predictedRating = ((ShowDetails) (hardcache)).detail.predictedRating;
                return;
            }
        }
    }

    static 
    {
        char c = '\u012C';
        int i;
        if (ConfigurationAgent.shouldUseLowMemConfig())
        {
            i = 150;
        } else
        {
            i = 300;
        }
        MAX_NUM_SOFTCACHE_ITEMS = i;
        if (ConfigurationAgent.shouldUseLowMemConfig())
        {
            i = 25;
        } else
        {
            i = 50;
        }
        MAX_NUM_SEASONS_ITEMS = i;
        i = c;
        if (ConfigurationAgent.shouldUseLowMemConfig())
        {
            i = 75;
        }
        MAX_NUM_EPISODES_ITEMS = i;
    }


























































    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$AddToQueueTask$1

/* anonymous class */
    class AddToQueueTask._cls1 extends SimpleBrowseAgentCallback
    {

        final AddToQueueTask this$1;

        public void onQueueAdd(int i)
        {
            if (i == 0)
            {
                if (iqInCache)
                {
                    sendIqRefreshBrodcast();
                }
                LogUtils.reportAddToQueueActionEnded(getContext(), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success, null, null);
            } else
            {
                com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs logreporterrorargs = new com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs(i, ActionOnUIError.displayedError, "", null);
                LogUtils.reportAddToQueueActionEnded(getContext(), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.failed, logreporterrorargs.getError(), null);
            }
            getMainHandler().post(i. new Runnable() {

                final AddToQueueTask._cls1 this$2;
                final int val$statusCode;

                public void run()
                {
    class AddToQueueTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onQueueAdd(statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = AddToQueueTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchCWVideosTask$1

/* anonymous class */
    class FetchCWVideosTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchCWVideosTask this$1;

        public void onCWVideosFetched(final List requestedVideos, int i)
        {
            updateCacheIfNecessary(requestedVideos, i);
            getMainHandler().post(i. new Runnable() {

                final FetchCWVideosTask._cls1 this$2;
                final List val$requestedVideos;
                final int val$statusCode;

                public void run()
                {
    class FetchCWVideosTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onCWVideosFetched(requestedVideos, statusCode);
                    if (-64 == statusCode)
                    {
                        Log.e("nf_service_browseagent", "Map cache miss for CW - refresh");
                        sendHomeRefreshBrodcast();
                    }
                }

            
            {
                this$2 = final__pcls1;
                requestedVideos = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchCWVideosTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchEpisodeDetailsTask$1

/* anonymous class */
    class FetchEpisodeDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchEpisodeDetailsTask this$1;

        public void onEpisodeDetailsFetched(com.netflix.mediaclient.servicemgr.EpisodeDetails episodedetails, final int statusCode)
        {
            updateCacheIfNecessary(episodedetails, statusCode);
            getMainHandler().post(episodedetails. new Runnable() {

                final FetchEpisodeDetailsTask._cls1 this$2;
                final com.netflix.mediaclient.servicemgr.EpisodeDetails val$episodeDetails;
                final int val$statusCode;

                public void run()
                {
    class FetchEpisodeDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {
                    if (statusCode == 0 && episodeDetails != null)
                    {
                        updateEpisodeWithLatestShowInformation(hardCache, softCache, episodeDetails);
                    }
                    getCallback().onEpisodeDetailsFetched(episodeDetails, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = i;
                episodeDetails = com.netflix.mediaclient.servicemgr.EpisodeDetails.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchEpisodeDetailsTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchEpisodesTask$1

/* anonymous class */
    class FetchEpisodesTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchEpisodesTask this$1;

        public void onEpisodesFetched(List list, final int statusCode)
        {
            updateCacheIfNecessary(list, statusCode);
            getMainHandler().post(list. new Runnable() {

                final FetchEpisodesTask._cls1 this$2;
                final List val$requestedEpisodes;
                final int val$statusCode;

                public void run()
                {
    class FetchEpisodesTask._cls1 extends SimpleBrowseAgentCallback
    {
                    if (statusCode == 0 && requestedEpisodes != null)
                    {
                        putInWeakEpisodesCache(requestedEpisodes);
                        updateEpisodesWithLatestShowInformation(hardCache, softCache, requestedEpisodes);
                    }
                    getCallback().onEpisodesFetched(requestedEpisodes, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = i;
                requestedEpisodes = List.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchEpisodesTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchGenreListsTask$1

/* anonymous class */
    class FetchGenreListsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchGenreListsTask this$1;

        public void onGenreListsFetched(final List requestedGenreLists, int i)
        {
            updateCacheIfNecessary(requestedGenreLists, i);
            getMainHandler().post(i. new Runnable() {

                final FetchGenreListsTask._cls1 this$2;
                final List val$requestedGenreLists;
                final int val$statusCode;

                public void run()
                {
    class FetchGenreListsTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onGenreListsFetched(requestedGenreLists, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                requestedGenreLists = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchGenreListsTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchGenreVideosTask$1

/* anonymous class */
    class FetchGenreVideosTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchGenreVideosTask this$1;

        public void onVideosFetched(final List requestedVideos, int i)
        {
            updateCacheIfNecessary(requestedVideos, i);
            getMainHandler().post(i. new Runnable() {

                final FetchGenreVideosTask._cls1 this$2;
                final List val$requestedVideos;
                final int val$statusCode;

                public void run()
                {
    class FetchGenreVideosTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onVideosFetched(requestedVideos, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                requestedVideos = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchGenreVideosTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchGenresTask$1

/* anonymous class */
    class FetchGenresTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchGenresTask this$1;

        public void onGenresFetched(final List requestedGenres, int i)
        {
            updateCacheIfNecessary(requestedGenres, i);
            getMainHandler().post(i. new Runnable() {

                final FetchGenresTask._cls1 this$2;
                final List val$requestedGenres;
                final int val$statusCode;

                public void run()
                {
    class FetchGenresTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onGenresFetched(requestedGenres, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                requestedGenres = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchGenresTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchIQVideosTask$1

/* anonymous class */
    class FetchIQVideosTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchIQVideosTask this$1;

        public void onVideosFetched(final List requestedVideos, int i)
        {
            updateCacheIfNecessary(requestedVideos, i);
            getMainHandler().post(i. new Runnable() {

                final FetchIQVideosTask._cls1 this$2;
                final List val$requestedVideos;
                final int val$statusCode;

                public void run()
                {
    class FetchIQVideosTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onVideosFetched(requestedVideos, statusCode);
                    if (-64 == statusCode)
                    {
                        Log.d("nf_service_browseagent", "Map cache miss for IQ - refresh");
                        sendHomeRefreshBrodcast();
                    }
                }

            
            {
                this$2 = final__pcls1;
                requestedVideos = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchIQVideosTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchKidsCharacterDetailsTask$1

/* anonymous class */
    class FetchKidsCharacterDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchKidsCharacterDetailsTask this$1;

        public void onKidsCharacterDetailsFetched(final com.netflix.mediaclient.servicemgr.KidsCharacterDetails kidsCharacterDetails, final Boolean dataChanged, int i)
        {
            updateCacheIfNecessary(kidsCharacterDetails, i);
            getMainHandler().post(i. new Runnable() {

                final FetchKidsCharacterDetailsTask._cls1 this$2;
                final Boolean val$dataChanged;
                final com.netflix.mediaclient.servicemgr.KidsCharacterDetails val$kidsCharacterDetails;
                final int val$statusCode;

                public void run()
                {
    class FetchKidsCharacterDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onKidsCharacterDetailsFetched(kidsCharacterDetails, dataChanged, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                kidsCharacterDetails = kidscharacterdetails;
                dataChanged = boolean1;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchKidsCharacterDetailsTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchLoLoMoSummaryTask$1

/* anonymous class */
    class FetchLoLoMoSummaryTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchLoLoMoSummaryTask this$1;

        public void onLoLoMoSummaryFetched(final LoLoMo summary, int i)
        {
            updateCacheIfNecessary(summary, i);
            getMainHandler().post(i. new Runnable() {

                final FetchLoLoMoSummaryTask._cls1 this$2;
                final int val$statusCode;
                final LoLoMo val$summary;

                public void run()
                {
    class FetchLoLoMoSummaryTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onLoLoMoSummaryFetched(summary, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                summary = lolomo;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchLoLoMoSummaryTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchLoMosTask$1

/* anonymous class */
    class FetchLoMosTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchLoMosTask this$1;

        public void onLoMosFetched(final List requestedLoMos, int i)
        {
            updateCacheIfNecessary(requestedLoMos, i);
            getMainHandler().post(i. new Runnable() {

                final FetchLoMosTask._cls1 this$2;
                final List val$requestedLoMos;
                final int val$statusCode;

                public void run()
                {
    class FetchLoMosTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onLoMosFetched(requestedLoMos, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                requestedLoMos = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchLoMosTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchMovieDetailsTask$1

/* anonymous class */
    class FetchMovieDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchMovieDetailsTask this$1;

        public void onMovieDetailsFetched(final com.netflix.mediaclient.servicemgr.MovieDetails movieDetails, int i)
        {
            updateCacheIfNecessary(movieDetails, i);
            getMainHandler().post(i. new Runnable() {

                final FetchMovieDetailsTask._cls1 this$2;
                final com.netflix.mediaclient.servicemgr.MovieDetails val$movieDetails;
                final int val$statusCode;

                public void run()
                {
    class FetchMovieDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onMovieDetailsFetched(movieDetails, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                movieDetails = moviedetails;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchMovieDetailsTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchPostPlayTask$1

/* anonymous class */
    class FetchPostPlayTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchPostPlayTask this$1;

        public void onPostPlayVideosFetched(final List postPlayVideos, int i)
        {
            getMainHandler().post(i. new Runnable() {

                final FetchPostPlayTask._cls1 this$2;
                final List val$postPlayVideos;
                final int val$statusCode;

                public void run()
                {
    class FetchPostPlayTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onPostPlayVideosFetched(postPlayVideos, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                postPlayVideos = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchPostPlayTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchSeasonDetailsTask$1

/* anonymous class */
    class FetchSeasonDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchSeasonDetailsTask this$1;

        public void onSeasonDetailsFetched(final SeasonDetails seasonDetails, int i)
        {
            updateCacheIfNecessary(seasonDetails, i);
            getMainHandler().post(i. new Runnable() {

                final FetchSeasonDetailsTask._cls1 this$2;
                final SeasonDetails val$seasonDetails;
                final int val$statusCode;

                public void run()
                {
    class FetchSeasonDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onSeasonDetailsFetched(seasonDetails, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                seasonDetails = seasondetails;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchSeasonDetailsTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchSeasonsTask$1

/* anonymous class */
    class FetchSeasonsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchSeasonsTask this$1;

        public void onSeasonsFetched(List list, final int statusCode)
        {
            updateCacheIfNecessary(list, statusCode);
            getMainHandler().post(list. new Runnable() {

                final FetchSeasonsTask._cls1 this$2;
                final List val$requestedSeasons;
                final int val$statusCode;

                public void run()
                {
    class FetchSeasonsTask._cls1 extends SimpleBrowseAgentCallback
    {
                    if (statusCode == 0 && requestedSeasons != null)
                    {
                        putInWeakSeasonsCache(requestedSeasons);
                    }
                    getCallback().onSeasonsFetched(requestedSeasons, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = i;
                requestedSeasons = List.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchSeasonsTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchShowDetailsTask$1

/* anonymous class */
    class FetchShowDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchShowDetailsTask this$1;

        public void onShowDetailsFetched(final com.netflix.mediaclient.servicemgr.ShowDetails showDetails, int i)
        {
            if (i == 0)
            {
                if (StringUtils.isEmpty(mCurrentEpisodeId))
                {
                    updateCacheIfNecessary(showDetails, i);
                } else
                {
                    updateSeasonWithSdp(showDetails);
                }
            }
            getMainHandler().post(i. new Runnable() {

                final FetchShowDetailsTask._cls1 this$2;
                final com.netflix.mediaclient.servicemgr.ShowDetails val$showDetails;
                final int val$statusCode;

                public void run()
                {
    class FetchShowDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onShowDetailsFetched(showDetails, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                showDetails = showdetails;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchShowDetailsTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchSimilarVideosForPersonTask$1

/* anonymous class */
    class FetchSimilarVideosForPersonTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchSimilarVideosForPersonTask this$1;

        public void onSimilarVideosFetched(final VideoList videoList, int i)
        {
            updateCacheIfNecessary(videoList, i);
            getMainHandler().post(i. new Runnable() {

                final FetchSimilarVideosForPersonTask._cls1 this$2;
                final int val$statusCode;
                final VideoList val$videoList;

                public void run()
                {
    class FetchSimilarVideosForPersonTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onSimilarVideosFetched(videoList, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                videoList = videolist;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchSimilarVideosForPersonTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchSimilarVideosForQuerySuggestionTask$1

/* anonymous class */
    class FetchSimilarVideosForQuerySuggestionTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchSimilarVideosForQuerySuggestionTask this$1;

        public void onSimilarVideosFetched(final VideoList videoList, int i)
        {
            updateCacheIfNecessary(videoList, i);
            getMainHandler().post(i. new Runnable() {

                final FetchSimilarVideosForQuerySuggestionTask._cls1 this$2;
                final int val$statusCode;
                final VideoList val$videoList;

                public void run()
                {
    class FetchSimilarVideosForQuerySuggestionTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onSimilarVideosFetched(videoList, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                videoList = videolist;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchSimilarVideosForQuerySuggestionTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchVideosTask$1

/* anonymous class */
    class FetchVideosTask._cls1 extends SimpleBrowseAgentCallback
    {

        final FetchVideosTask this$1;

        public void onVideosFetched(final List requestedVideos, int i)
        {
            updateCacheIfNecessary(requestedVideos, i);
            getMainHandler().post(i. new Runnable() {

                final FetchVideosTask._cls1 this$2;
                final List val$requestedVideos;
                final int val$statusCode;

                public void run()
                {
    class FetchVideosTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onVideosFetched(requestedVideos, statusCode);
                    if (-64 == statusCode)
                    {
                        Log.e("nf_service_browseagent", "Map cache miss on FetchVideos - refresh");
                        sendHomeRefreshBrodcast();
                    }
                }

            
            {
                this$2 = final__pcls1;
                requestedVideos = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = FetchVideosTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$HideVideoTask$1

/* anonymous class */
    class HideVideoTask._cls1 extends SimpleBrowseAgentCallback
    {

        final HideVideoTask this$1;

        public void onVideoHide(int i)
        {
            getMainHandler().post(i. new Runnable() {

                final HideVideoTask._cls1 this$2;
                final int val$statusCode;

                public void run()
                {
    class HideVideoTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onVideoHide(statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = HideVideoTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$PrefetchGenreLoLoMoTask$1

/* anonymous class */
    class PrefetchGenreLoLoMoTask._cls1 extends SimpleBrowseAgentCallback
    {

        final PrefetchGenreLoLoMoTask this$1;

        public void onGenreLoLoMoPrefetched(int i)
        {
            if (mIncludeBoxshots)
            {
                throw new RuntimeException("Unimplemented exception");
            } else
            {
                getMainHandler().post(i. new Runnable() {

                    final PrefetchGenreLoLoMoTask._cls1 this$2;
                    final int val$statusCode;

                    public void run()
                    {
    class PrefetchGenreLoLoMoTask._cls1 extends SimpleBrowseAgentCallback
    {
                        getCallback().onGenreLoLoMoPrefetched(statusCode);
                    }

            
            {
                this$2 = final__pcls1;
                statusCode = I.this;
                super();
            }
                });
                return;
            }
        }

            
            {
                this$1 = PrefetchGenreLoLoMoTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$PrefetchLoLoMoTask$1

/* anonymous class */
    class PrefetchLoLoMoTask._cls1 extends SimpleBrowseAgentCallback
    {

        final PrefetchLoLoMoTask this$1;

        public void onLoLoMoPrefetched(int i)
        {
            if (mIncludeBoxshots)
            {
                throw new RuntimeException("Unimplemented exception");
            } else
            {
                getMainHandler().post(i. new Runnable() {

                    final PrefetchLoLoMoTask._cls1 this$2;
                    final int val$statusCode;

                    public void run()
                    {
    class PrefetchLoLoMoTask._cls1 extends SimpleBrowseAgentCallback
    {
                        getCallback().onLoLoMoPrefetched(statusCode);
                    }

            
            {
                this$2 = final__pcls1;
                statusCode = I.this;
                super();
            }
                });
                return;
            }
        }

            
            {
                this$1 = PrefetchLoLoMoTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$RefreshCWTask$1

/* anonymous class */
    class RefreshCWTask._cls1 extends SimpleBrowseAgentCallback
    {

        final RefreshCWTask this$1;

        public void onCWListRefresh(int i)
        {
            sendCwRefreshBrodcast();
        }

            
            {
                this$1 = RefreshCWTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$RefreshKidsCharacterDetailsTask$1

/* anonymous class */
    class RefreshKidsCharacterDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final RefreshKidsCharacterDetailsTask this$1;

        public void onKidsCharacterDetailsFetched(final com.netflix.mediaclient.servicemgr.KidsCharacterDetails useNewData, Boolean boolean1, int i)
        {
            final KidsCharacterDetails mergedDetails = BrowseAgent.getKidsCharacterDetailsFromCache(mCharacterId, hardCache, softCache);
            if (mergedDetails == null)
            {
                Log.w("nf_service_browseagent", (new StringBuilder()).append("Cached character details are null, can't refresh - charId: ").append(mCharacterId).toString());
                return;
            }
            KidsCharacterDetails kidscharacterdetails = (KidsCharacterDetails)useNewData;
            useNewData = isKidsCharacterDetailsNew(mergedDetails, useNewData);
            if (boolean1.booleanValue() && mergedDetails != null)
            {
                mergedDetails.updateWatchNext(kidscharacterdetails);
            }
            getMainHandler().post(i. new Runnable() {

                final RefreshKidsCharacterDetailsTask._cls1 this$2;
                final com.netflix.mediaclient.servicemgr.KidsCharacterDetails val$mergedDetails;
                final int val$statusCode;
                final Boolean val$useNewData;

                public void run()
                {
    class RefreshKidsCharacterDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onKidsCharacterDetailsFetched(mergedDetails, useNewData, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                mergedDetails = kidscharacterdetails;
                useNewData = boolean1;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = RefreshKidsCharacterDetailsTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$RemoveFromQueueTask$1

/* anonymous class */
    class RemoveFromQueueTask._cls1 extends SimpleBrowseAgentCallback
    {

        final RemoveFromQueueTask this$1;

        public void onQueueRemove(int i)
        {
            if (i == 0)
            {
                if (iqInCache)
                {
                    sendIqRefreshBrodcast();
                }
                LogUtils.reportRemoveFromQueueActionEnded(getContext(), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success, null);
            } else
            {
                com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs logreporterrorargs = new com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs(i, ActionOnUIError.displayedError, "", null);
                LogUtils.reportRemoveFromQueueActionEnded(getContext(), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.failed, logreporterrorargs.getError());
            }
            getMainHandler().post(i. new Runnable() {

                final RemoveFromQueueTask._cls1 this$2;
                final int val$statusCode;

                public void run()
                {
    class RemoveFromQueueTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onQueueRemove(statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = RemoveFromQueueTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$SearchNetflixTask$1

/* anonymous class */
    class SearchNetflixTask._cls1 extends SimpleBrowseAgentCallback
    {

        final SearchNetflixTask this$1;

        public void onSearchResultsFetched(final SearchResults searchResults, int i)
        {
            updateCacheIfNecessary(searchResults, i);
            getMainHandler().post(i. new Runnable() {

                final SearchNetflixTask._cls1 this$2;
                final SearchResults val$searchResults;
                final int val$statusCode;

                public void run()
                {
    class SearchNetflixTask._cls1 extends SimpleBrowseAgentCallback
    {
                    callback.onSearchResultsFetched(searchResults, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                searchResults = searchresults;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = SearchNetflixTask.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$SetVideoRatingTask$1

/* anonymous class */
    class SetVideoRatingTask._cls1 extends SimpleBrowseAgentCallback
    {

        final SetVideoRatingTask this$1;

        public void onVideoRatingSet(int i)
        {
            getMainHandler().post(i. new Runnable() {

                final SetVideoRatingTask._cls1 this$2;
                final int val$statusCode;

                public void run()
                {
    class SetVideoRatingTask._cls1 extends SimpleBrowseAgentCallback
    {
                    getCallback().onVideoRatingSet(statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = SetVideoRatingTask.this;
                super();
            }
    }

}
