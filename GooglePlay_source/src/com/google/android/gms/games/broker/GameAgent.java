// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SyncResult;
import android.content.SyncStats;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.TransientDataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.cache.GameCache;
import com.google.android.gms.games.cache.GameCompareCache;
import com.google.android.gms.games.cache.GameCompareCacheKey;
import com.google.android.gms.games.cache.GameSearchCache;
import com.google.android.gms.games.cache.TransientDataHolderCache;
import com.google.android.gms.games.constants.AppUpdateType;
import com.google.android.gms.games.constants.DeviceType;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.AchievementState;
import com.google.android.gms.games.provider.ColumnSpec;
import com.google.android.gms.games.server.api.AchievementsApiInternal;
import com.google.android.gms.games.server.api.Application;
import com.google.android.gms.games.server.api.ApplicationGetMultipleFirstPartyResponse;
import com.google.android.gms.games.server.api.ApplicationGetUpdatesMultipleFirstPartyResponse;
import com.google.android.gms.games.server.api.ApplicationListFirstPartyResponse;
import com.google.android.gms.games.server.api.ApplicationSearchFirstPartyResponse;
import com.google.android.gms.games.server.api.ApplicationUpdatesFetchContext;
import com.google.android.gms.games.server.api.ApplicationUpdatesFetchList;
import com.google.android.gms.games.server.api.ApplicationsApi;
import com.google.android.gms.games.server.api.ApplicationsApiInternal;
import com.google.android.gms.games.server.api.FirstPartyApplication;
import com.google.android.gms.games.server.api.FirstPartyApplicationUpdates;
import com.google.android.gms.games.server.api.ImageAsset;
import com.google.android.gms.games.server.api.Instance;
import com.google.android.gms.games.server.api.InvalidId;
import com.google.android.gms.games.server.api.MarketApplication;
import com.google.android.gms.games.server.api.MarketBadge;
import com.google.android.gms.games.server.api.MarketInstance;
import com.google.android.gms.games.server.api.PlayerAchievement;
import com.google.android.gms.games.server.api.PlayerAchievementGetMultipleResponse;
import com.google.android.gms.games.server.api.Session;
import com.google.android.gms.games.server.api.SessionBatch;
import com.google.android.gms.games.server.converter.ImageUrlBuilder;
import com.google.android.gms.games.server.finsky.SearchSuggestResponse;
import com.google.android.gms.games.server.finsky.SearchSuggestion;
import com.google.android.gms.games.service.GamesSyncAdapter;
import com.google.android.gms.games.util.AccountUtils;
import com.google.android.gms.games.util.PackageUtils;
import com.google.android.gms.games.util.PanoUtils;
import com.google.android.gms.games.utils.GamesDataUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, TransientCacheOwner, Agents, GamesClientContext

public final class GameAgent extends Lockable
    implements TransientCacheOwner
{
    private static final class ApplicationList
    {

        final ArrayList applications = new ArrayList();
        final ArrayList invalidIds = new ArrayList();
        final ArrayList updates = new ArrayList();

        public final void addInvalidIds(ArrayList arraylist)
        {
            invalidIds.addAll(arraylist);
        }

        public ApplicationList()
        {
        }
    }

    private final class ApplicationSessionsFlushData
    {

        public final ArrayList contentProviderOperations = new ArrayList();
        public final Context context;
        public final SessionBatch multipleRequest;
        final GameAgent this$0;
        public final ArrayList updateRequests = new ArrayList();

        public ApplicationSessionsFlushData(Context context1, String s, String s1, boolean flag)
        {
            this$0 = GameAgent.this;
            super();
            context = context1;
            multipleRequest = new SessionBatch(s1, Long.valueOf(GameAgent.getClock().currentTimeMillis()), s, Boolean.valueOf(flag), Long.valueOf(mRandom.nextLong()), updateRequests);
        }
    }

    static interface ApplicationSessionsQuery
    {

        public static final String PROJECTION[] = {
            "_id", "client_context_id", "end_time", "external_game_id", "session_id", "start_time", "ad_id", "limit_ad_tracking", "package_name", "package_uid"
        };

    }

    protected static interface FirstPartyGameListProcessor
        extends Runnable
    {

        public abstract void processGameList(ArrayList arraylist);
    }

    static final class GameRefreshRecord
    {

        final HashSet mAppUpdates;
        final String mExternalGameId;
        final String mNewSyncToken;
        final long mNewVersion;

        public GameRefreshRecord(String s, Long long1, String s1, ArrayList arraylist)
        {
            mExternalGameId = s;
            long l;
            if (long1 == null)
            {
                l = -1L;
            } else
            {
                l = long1.longValue();
            }
            mNewVersion = l;
            mNewSyncToken = s1;
            mAppUpdates = new HashSet(arraylist);
        }
    }

    private static final class ImageConfig
    {

        public final String assetUrlColumn;
        public final int dimenResId;

        public ImageConfig(String s, int i)
        {
            assetUrlColumn = s;
            dimenResId = i;
        }
    }

    private static interface InstanceQuery
    {

        public static final String PROJECTION[] = {
            "_id", "package_name", "installed"
        };

    }

    private final class StoreGamesProcessor
        implements FirstPartyGameListProcessor
    {

        private ArrayList mApps;
        private final ClientContext mClientContext;
        private final Context mContext;
        private final String mExternalPlayerId;
        private final boolean mKnownMuted;
        final GameAgent this$0;

        public final void processGameList(ArrayList arraylist)
        {
            mApps = arraylist;
            (new Thread(this)).start();
        }

        public final void run()
        {
            ArrayList arraylist = new ArrayList();
            long l = Agents.resolveExternalPlayerId(mContext, mClientContext, mExternalPlayerId);
            if (l == -1L)
            {
                GamesLog.e("GameAgent", (new StringBuilder("Failed to find record for player ")).append(mExternalPlayerId).append(" when storing game collection.").toString());
                return;
            }
            if (mKnownMuted)
            {
                arraylist.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(mClientContext)).withValue("muted", Integer.valueOf(0)).build());
            }
            int j = mApps.size();
            int i = 0;
            while (i < j) 
            {
                FirstPartyApplication firstpartyapplication = (FirstPartyApplication)mApps.get(i);
                Application application = firstpartyapplication.getGamesData();
                MarketApplication marketapplication = firstpartyapplication.getMarketData();
                if (application == null && marketapplication == null)
                {
                    GamesLog.w("GameAgent", "Received application with no app data and no Market data!");
                } else
                {
                    if (application != null && mKnownMuted)
                    {
                        ((FastContentValuesJsonResponse) (application)).mValues.put("muted", Integer.valueOf(1));
                    }
                    addGameOps(mContext, mClientContext, firstpartyapplication, application, marketapplication, Long.valueOf(l), mKnownMuted, arraylist);
                }
                i++;
            }
            Agents.applyContentOperations(mContext.getContentResolver(), arraylist, "GameAgent");
        }

        private StoreGamesProcessor(Context context, ClientContext clientcontext, String s, boolean flag)
        {
            this$0 = GameAgent.this;
            super();
            mContext = context;
            mClientContext = clientcontext;
            mExternalPlayerId = s;
            mKnownMuted = flag;
        }

        StoreGamesProcessor(Context context, ClientContext clientcontext, String s, boolean flag, byte byte0)
        {
            this(context, clientcontext, s, flag);
        }
    }

    private final class UpdatePlayedTimeRunnable
        implements Runnable
    {

        private final ClientContext mClientContext;
        final GameAgent this$0;

        public final void run()
        {
            try
            {
                ApplicationsApi applicationsapi = mApplicationsApi;
                ClientContext clientcontext = mClientContext;
                applicationsapi.mServer.performNoResponseRequestBlocking(clientcontext, 1, "applications/played", null);
                return;
            }
            catch (VolleyError volleyerror)
            {
                GamesLog.w("GameAgent", "Volley error when reporting played", volleyerror);
                return;
            }
            catch (GoogleAuthException googleauthexception)
            {
                GamesLog.w("GameAgent", "Auth exception while recording played", googleauthexception);
            }
        }

        public UpdatePlayedTimeRunnable(ClientContext clientcontext)
        {
            this$0 = GameAgent.this;
            super();
            mClientContext = new ClientContext(clientcontext);
            if (!mClientContext.hasScope("https://www.googleapis.com/auth/games") && mClientContext.hasScope("https://www.googleapis.com/auth/games.firstparty"))
            {
                mClientContext.addGrantedScope("https://www.googleapis.com/auth/games");
            }
        }
    }

    private static interface VersionQuery
    {

        public static final String PROJECTION[] = {
            "_id", "external_game_id", "metadata_version", "sync_token", "play_enabled_game"
        };

    }


    private static final Object ASSET_MAP_LOCK = new Object();
    static Map ASSET_URL_MAP;
    private static final String BACK_REF_SELECTION_ARGS[] = {
        "REPLACE_ME"
    };
    private static Map BADGE_ASSET_URL_MAP;
    private static final ColumnSpec EXTENDED_GAME_DATA_SPEC;
    private static final String EXTERNAL_ID_PROJECTION[] = {
        "external_game_id"
    };
    private static final Lockable.LockableLock GAMES_APPLICATION_SESSION = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_COMPARE_COMMON_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_COMPARE_DISJOINT_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_CUSTOM_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_DOWNLOADED_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_FEATURED_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_HIDDEN_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_INSTALLED_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_MULTIPLAYER_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_POPULAR_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_RECENTLY_PLAYED_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_RECOMMENDED_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_SEARCH_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock GAMES_SEARCH_SUGGESTION_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private static final String MUTE_CHECK_COLUMNS[] = {
        "external_game_id", "muted"
    };
    private static final AtomicLong sMutedVolleyCacheNonce = new AtomicLong(DefaultClock.getInstance().currentTimeMillis());
    private final AchievementsApiInternal mAchievementsApiInternal;
    public final Lockable mApplicationSessionLock;
    private final ApplicationsApi mApplicationsApi;
    private final ApplicationsApiInternal mApplicationsApiInternal;
    final GameCache mCache;
    public final Lockable mCacheLockables[];
    final Lockable mCompareCommonLock;
    final Lockable mCompareDisjointLock;
    private final GameCompareCache mCompareGamesCache;
    final Lockable mDownloadedLock;
    final Lockable mFeaturedLock;
    private final BaseApiaryServer mGamesSearchSuggestServer;
    public final Lockable mHiddenLock;
    final Lockable mInstalledLock;
    private final BaseApiaryServer mInternalApiaryServer;
    final Lockable mMultiplayerLock;
    final Lockable mNamedLock;
    final Lockable mPopularLock;
    private final Random mRandom = new Random(DefaultClock.getInstance().currentTimeMillis());
    private final GameCache mRecentGamesByPlayerCache;
    final Lockable mRecentlyPlayedLock;
    final Lockable mRecommendedLock;
    final GameSearchCache mSearchCache;
    final Lockable mSearchLock;
    final Lockable mSearchSuggestionLock;

    public GameAgent(Lockable lockable, BaseApiaryServer baseapiaryserver, BaseApiaryServer baseapiaryserver1, BaseApiaryServer baseapiaryserver2)
    {
        super("GameAgent", LOCK, lockable);
        mInternalApiaryServer = baseapiaryserver1;
        mApplicationsApi = new ApplicationsApi(baseapiaryserver);
        mApplicationsApiInternal = new ApplicationsApiInternal(baseapiaryserver1);
        mAchievementsApiInternal = new AchievementsApiInternal(baseapiaryserver1);
        mGamesSearchSuggestServer = baseapiaryserver2;
        mCache = new GameCache(EXTENDED_GAME_DATA_SPEC.mColumnNames);
        mRecentGamesByPlayerCache = new GameCache(EXTENDED_GAME_DATA_SPEC.mColumnNames);
        mSearchCache = new GameSearchCache(EXTENDED_GAME_DATA_SPEC.mColumnNames);
        mCompareGamesCache = new GameCompareCache(EXTENDED_GAME_DATA_SPEC.mColumnNames);
        mApplicationSessionLock = new Lockable("GamesApplicationSession", GAMES_APPLICATION_SESSION, lockable);
        mFeaturedLock = new Lockable("FeaturedGames", GAMES_FEATURED_LOCK, lockable);
        mMultiplayerLock = new Lockable("MultiplayerGames", GAMES_MULTIPLAYER_LOCK, lockable);
        mPopularLock = new Lockable("PopularGames", GAMES_POPULAR_LOCK, lockable);
        mRecentlyPlayedLock = new Lockable("RecentlyPlayedGames", GAMES_RECENTLY_PLAYED_LOCK, lockable);
        mRecommendedLock = new Lockable("RecommendedGames", GAMES_RECOMMENDED_LOCK, lockable);
        mDownloadedLock = new Lockable("DownloadedGames", GAMES_DOWNLOADED_LOCK, lockable);
        mInstalledLock = new Lockable("InstalledGames", GAMES_INSTALLED_LOCK, lockable);
        mHiddenLock = new Lockable("HiddenGames", GAMES_HIDDEN_LOCK, lockable);
        mSearchLock = new Lockable("GameSearch", GAMES_SEARCH_LOCK, lockable);
        mSearchSuggestionLock = new Lockable("GameSearchSuggestions", GAMES_SEARCH_SUGGESTION_LOCK, lockable);
        mNamedLock = new Lockable("NamedGamesCollection", GAMES_CUSTOM_LOCK, lockable);
        mCompareCommonLock = new Lockable("CommonGames", GAMES_COMPARE_COMMON_LOCK, lockable);
        mCompareDisjointLock = new Lockable("DisjointGames", GAMES_COMPARE_DISJOINT_LOCK, lockable);
        mCacheLockables = (new Lockable[] {
            this, mFeaturedLock, mMultiplayerLock, mPopularLock, mRecommendedLock, mDownloadedLock, mInstalledLock, mHiddenLock, mCompareCommonLock, mCompareDisjointLock
        });
    }

    private static void addBadgeImageUrls(Context context, MarketBadge marketbadge, ContentValues contentvalues)
    {
        synchronized (ASSET_MAP_LOCK)
        {
            if (BADGE_ASSET_URL_MAP == null)
            {
                buildAssetUrlMapsLocked(context);
                Asserts.checkNotNull(BADGE_ASSET_URL_MAP);
            }
        }
        marketbadge = marketbadge.getImages();
        int i = 0;
        for (int j = marketbadge.size(); i < j; i++)
        {
            Object obj1 = (ImageAsset)marketbadge.get(i);
            obj = (ImageConfig)BADGE_ASSET_URL_MAP.get(((ImageAsset) (obj1)).getName());
            if (obj != null)
            {
                obj1 = (new ImageUrlBuilder(((ImageAsset) (obj1)).getUrl())).setSize(context, ((ImageConfig) (obj)).dimenResId).build();
                contentvalues.put(((ImageConfig) (obj)).assetUrlColumn, ((String) (obj1)));
            }
        }

        break MISSING_BLOCK_LABEL_126;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void addGameBadgeOps(ClientContext clientcontext, MarketInstance marketinstance, String s, ArrayList arraylist, int i)
    {
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.GameBadges.getUriForExternalGameId(clientcontext, s)).build());
        if (marketinstance != null && marketinstance.getBadges() != null && marketinstance.getBadges().size() != 0)
        {
            clientcontext = com.google.android.gms.games.provider.GamesContractInternal.GameBadges.getContentUri(clientcontext);
            marketinstance = marketinstance.getBadges();
            int j = 0;
            int k = marketinstance.size();
            while (j < k) 
            {
                s = (MarketBadge)marketinstance.get(j);
                ContentValues contentvalues = new ContentValues(((FastContentValuesJsonResponse) (s)).mValues);
                ArrayList arraylist1 = s.getImages();
                if (arraylist1 == null || arraylist1.size() != 1)
                {
                    GamesLog.e("GameAgent", (new StringBuilder("Badge ")).append(s).append(" does not have exactly one image").toString());
                } else
                {
                    contentvalues.put("badge_icon_image_url", ((ImageAsset)arraylist1.get(0)).getUrl());
                    arraylist.add(ContentProviderOperation.newInsert(clientcontext).withValues(contentvalues).withValueBackReference("badge_game_id", i).build());
                }
                j++;
            }
        }
    }

    private long addGameOps(Context context, ClientContext clientcontext, FirstPartyApplication firstpartyapplication, Application application, MarketApplication marketapplication, Long long1, boolean flag, 
            boolean flag1, boolean flag2, ArrayList arraylist)
    {
        if (application == null && marketapplication == null)
        {
            return -1L;
        }
        android.net.Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(clientcontext);
        int j = arraylist.size();
        Instance instance = getTargetInstance(context, application, marketapplication);
        MarketInstance marketinstance = getTargetMarketInstance(instance, marketapplication);
        android.net.Uri uri1;
        Object obj;
        int k;
        if (firstpartyapplication == null)
        {
            marketapplication = null;
        } else
        {
            marketapplication = firstpartyapplication.getSnapshot();
        }
        obj = buildExtendedGameContentValues(context, firstpartyapplication, application, instance, marketinstance, flag, flag1, false, null, null);
        firstpartyapplication = ((ContentValues) (obj)).getAsString("external_game_id");
        ((ContentValues) (obj)).remove("gameplay_acl_status");
        if (flag2)
        {
            ((ContentValues) (obj)).put("muted", Integer.valueOf(1));
        }
        arraylist.add(ContentProviderOperation.newInsert(uri).withValues(((ContentValues) (obj))).withYieldAllowed(true).build());
        uri = com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(clientcontext);
        uri1 = com.google.android.gms.games.provider.GamesContractInternal.GameInstances.getContentUri(clientcontext);
        arraylist.add(ContentProviderOperation.newDelete(uri1).withSelection("instance_game_id=?", BACK_REF_SELECTION_ARGS).withSelectionBackReference(0, j).build());
        k = arraylist.size();
        if (application != null)
        {
            obj = application.getInstances();
            if (((ArrayList) (obj)).size() > 0)
            {
                Asserts.checkNotNull(instance);
                int l = ((ArrayList) (obj)).indexOf(instance);
                int i1 = ((ArrayList) (obj)).size();
                for (int i = 0; i < i1; i++)
                {
                    Object obj1 = (Instance)((ArrayList) (obj)).get(i);
                    ContentValues contentvalues = new ContentValues(((FastContentValuesJsonResponse) (obj1)).mValues);
                    obj1 = ((Instance) (obj1)).getAndroidInstance();
                    if (obj1 != null)
                    {
                        contentvalues.putAll(((FastContentValuesJsonResponse) (obj1)).mValues);
                        contentvalues.put("installed", Boolean.valueOf(PackageUtils.isPackageInstalled(context, contentvalues.getAsString("package_name"))));
                    }
                    if (marketinstance != null)
                    {
                        contentvalues.put("gamepad_support", Boolean.valueOf(((FastContentValuesJsonResponse) (marketinstance)).mValues.getAsBoolean("gamepad_support").booleanValue()));
                    }
                    arraylist.add(ContentProviderOperation.newInsert(uri1).withValues(contentvalues).withValueBackReference("instance_game_id", j).build());
                }

                arraylist.add(ContentProviderOperation.newUpdate(uri).withSelection("_id=?", BACK_REF_SELECTION_ARGS).withSelectionBackReference(0, j).withValueBackReference("target_instance", k + l).build());
            }
        } else
        if (marketinstance != null)
        {
            ContentValues contentvalues1 = Agents.extractValues(((FastContentValuesJsonResponse) (marketinstance)).mValues, new String[] {
                "gamepad_support"
            });
            contentvalues1.put("platform_type", Integer.valueOf(0));
            contentvalues1.put("instance_display_name", ((ContentValues) (obj)).getAsString("display_name"));
            obj = marketinstance.getId();
            flag = PackageUtils.isPackageInstalled(context, ((String) (obj)));
            contentvalues1.put("package_name", ((String) (obj)));
            contentvalues1.put("installed", Boolean.valueOf(flag));
            arraylist.add(ContentProviderOperation.newInsert(uri1).withValues(contentvalues1).withValueBackReference("instance_game_id", j).build());
            arraylist.add(ContentProviderOperation.newUpdate(uri).withSelection("_id=?", BACK_REF_SELECTION_ARGS).withSelectionBackReference(0, j).withValueBackReference("target_instance", k).build());
        }
        addGameBadgeOps(clientcontext, marketinstance, firstpartyapplication, arraylist, j);
        if (marketapplication != null && long1 != null)
        {
            arraylist.add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Snapshots.getContentUri(clientcontext)).withValues(((FastContentValuesJsonResponse) (marketapplication)).mValues).withValue("owner_id", long1).withValueBackReference("game_id", j).build());
        }
        if (application == null)
        {
            return -1L;
        } else
        {
            return ((Long)((FastContentValuesJsonResponse) (application)).mValues.get("metadata_version")).longValue();
        }
    }

    private static void addImageUrls(Context context, ArrayList arraylist, ContentValues contentvalues)
    {
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist1;
        int i;
        int k;
        int l;
        synchronized (ASSET_MAP_LOCK)
        {
            if (ASSET_URL_MAP == null)
            {
                buildAssetUrlMapsLocked(context);
                Asserts.checkNotNull(ASSET_URL_MAP);
            }
        }
        obj = context.getResources().getDisplayMetrics();
        k = Math.max(((DisplayMetrics) (obj)).widthPixels, ((DisplayMetrics) (obj)).heightPixels);
        obj = null;
        arraylist1 = new ArrayList();
        i = 0;
        l = arraylist.size();
_L3:
        Object obj1;
        if (i < l)
        {
            ImageAsset imageasset = (ImageAsset)arraylist.get(i);
            ArrayList arraylist2 = (ArrayList)ASSET_URL_MAP.get(imageasset.getName());
            if (arraylist2 != null)
            {
                int j = 0;
                int i1 = arraylist2.size();
                do
                {
                    obj1 = obj;
                    if (j >= i1)
                    {
                        break;
                    }
                    obj1 = (ImageConfig)arraylist2.get(j);
                    ImageUrlBuilder imageurlbuilder = new ImageUrlBuilder(imageasset.getUrl());
                    if (-1 == ((ImageConfig) (obj1)).dimenResId)
                    {
                        imageurlbuilder.mSize = k;
                    } else
                    {
                        imageurlbuilder.setSize(context, ((ImageConfig) (obj1)).dimenResId);
                    }
                    if ("SCREENSHOT".equals(imageasset.getName()))
                    {
                        arraylist1.add(imageurlbuilder.build());
                        obj = ((ImageConfig) (obj1)).assetUrlColumn;
                    } else
                    {
                        contentvalues.put(((ImageConfig) (obj1)).assetUrlColumn, imageurlbuilder.build());
                    }
                    j++;
                } while (true);
            } else
            {
                obj1 = obj;
                if ("VIDEO".equals(imageasset.getName()))
                {
                    contentvalues.put("video_url", imageasset.getUrl());
                    obj1 = obj;
                }
            }
            break MISSING_BLOCK_LABEL_282;
        }
        break; /* Loop/switch isn't completed */
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        i++;
        obj = obj1;
          goto _L3
        if (obj != null && arraylist1.size() > 0)
        {
            contentvalues.put(((String) (obj)), TextUtils.join(",", arraylist1));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private ArrayList assembleCacheValues(GamesClientContext gamesclientcontext, ArrayList arraylist, boolean flag)
    {
        Context context = gamesclientcontext.mContext;
        Object obj = gamesclientcontext.mClientContext;
        ContentValues contentvalues = Agents.getOwningPlayerValues(context, ((ClientContext) (obj)));
        int i1 = arraylist.size();
        ArrayList arraylist8 = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        ArrayList arraylist3 = new ArrayList();
        ArrayList arraylist4 = new ArrayList();
        ArrayList arraylist5 = new ArrayList();
        ArrayList arraylist6 = new ArrayList();
        ArrayList arraylist7 = new ArrayList();
        obj = com.google.android.gms.games.provider.GamesContractInternal.Images.getContentUri(((ClientContext) (obj)));
        for (int i = 0; i < i1; i++)
        {
            Object obj1 = (FirstPartyApplication)arraylist.get(i);
            Object obj2 = ((FirstPartyApplication) (obj1)).getGamesData();
            Object obj3 = ((FirstPartyApplication) (obj1)).getMarketData();
            Object obj4 = getTargetInstance(context, ((Application) (obj2)), ((MarketApplication) (obj3)));
            obj3 = getTargetMarketInstance(((Instance) (obj4)), ((MarketApplication) (obj3)));
            obj1 = buildExtendedGameContentValues(context, ((FirstPartyApplication) (obj1)), ((Application) (obj2)), ((Instance) (obj4)), ((MarketInstance) (obj3)), false, false, true, gamesclientcontext.mExternalCurrentPlayerId, contentvalues);
            if (obj1 == null || flag && !((ContentValues) (obj1)).getAsBoolean("installed").booleanValue())
            {
                continue;
            }
            obj2 = ((ContentValues) (obj1)).getAsString("game_icon_image_url");
            obj4 = ((ContentValues) (obj1)).getAsString("game_hi_res_image_url");
            Object obj5 = ((ContentValues) (obj1)).getAsString("featured_image_url");
            Object obj7 = ((ContentValues) (obj1)).getAsString("screenshot_image_urls");
            Object obj6 = ((ContentValues) (obj1)).getAsString("cover_icon_image_url");
            obj2 = Agents.addInsertImageOp(((android.net.Uri) (obj)), ((String) (obj2)), arraylist8);
            obj4 = Agents.addInsertImageOp(((android.net.Uri) (obj)), ((String) (obj4)), arraylist8);
            obj5 = Agents.addInsertImageOp(((android.net.Uri) (obj)), ((String) (obj5)), arraylist8);
            obj6 = Agents.addInsertImageOp(((android.net.Uri) (obj)), ((String) (obj6)), arraylist8);
            obj7 = Agents.addInsertImageOps(((android.net.Uri) (obj)), ((String) (obj7)), arraylist8);
            if (obj3 != null && ((MarketInstance) (obj3)).getBadges() != null && ((MarketInstance) (obj3)).getBadges().size() > 0)
            {
                obj3 = ((MarketInstance) (obj3)).getBadges();
                int k = 0;
                for (int j1 = ((ArrayList) (obj3)).size(); k < j1; k++)
                {
                    Object obj8 = (MarketBadge)((ArrayList) (obj3)).get(k);
                    ContentValues contentvalues1 = new ContentValues(((FastContentValuesJsonResponse) (obj8)).mValues);
                    addBadgeImageUrls(context, ((MarketBadge) (obj8)), contentvalues1);
                    obj8 = Agents.addInsertImageOp(((android.net.Uri) (obj)), contentvalues1.getAsString("badge_icon_image_url"), arraylist8);
                    ContentValues contentvalues2 = new ContentValues(((ContentValues) (obj1)));
                    contentvalues2.putAll(contentvalues1);
                    arraylist1.add(obj2);
                    arraylist2.add(obj4);
                    arraylist3.add(obj5);
                    arraylist4.add(obj7);
                    arraylist5.add(obj6);
                    arraylist6.add(obj8);
                    arraylist7.add(contentvalues2);
                }

            } else
            {
                arraylist1.add(obj2);
                arraylist2.add(obj4);
                arraylist3.add(obj5);
                arraylist4.add(obj7);
                arraylist5.add(obj6);
                arraylist6.add(null);
                arraylist7.add(obj1);
            }
        }

        int j;
        if (arraylist1.size() == arraylist7.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (arraylist2.size() == arraylist7.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (arraylist3.size() == arraylist7.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (arraylist4.size() == arraylist7.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (arraylist6.size() == arraylist7.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (arraylist5.size() == arraylist7.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        gamesclientcontext = Agents.applyContentOperationsWithResult(context.getContentResolver(), arraylist8, "GameAgent");
        j = 0;
        for (int l = arraylist7.size(); j < l; j++)
        {
            arraylist = (ContentValues)arraylist7.get(j);
            Agents.addImageUriColumn(arraylist, "game_icon_image_url", "game_icon_image_uri", gamesclientcontext, (Integer)arraylist1.get(j));
            Agents.addImageUriColumn(arraylist, "game_hi_res_image_url", "game_hi_res_image_uri", gamesclientcontext, (Integer)arraylist2.get(j));
            Agents.addImageUriColumn(arraylist, "featured_image_url", "featured_image_uri", gamesclientcontext, (Integer)arraylist3.get(j));
            Agents.addImageUriColumn(arraylist, "screenshot_image_urls", "screenshot_image_uris", gamesclientcontext, (ArrayList)arraylist4.get(j));
            Agents.replaceImageColumn(arraylist, "badge_icon_image_url", "badge_icon_image_uri", gamesclientcontext, (Integer)arraylist6.get(j));
            Agents.replaceImageColumn(arraylist, "cover_icon_image_url", "cover_icon_image_uri", gamesclientcontext, (Integer)arraylist5.get(j));
        }

        return arraylist7;
    }

    private static void buildAssetUrlMapsLocked(Context context)
    {
        ASSET_URL_MAP = new ArrayMap();
        BADGE_ASSET_URL_MAP = new ArrayMap();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new ImageConfig("game_icon_image_url", 0x7f0c00db));
        int i;
        if (PanoUtils.isPano(context))
        {
            i = 0x7f0c00da;
        } else
        {
            i = 0x7f0c00d9;
        }
        arraylist.add(new ImageConfig("game_hi_res_image_url", i));
        ASSET_URL_MAP.put("ICON", arraylist);
        context = new ArrayList();
        context.add(new ImageConfig("featured_image_url", -1));
        ASSET_URL_MAP.put("FEATURE_GRAPHIC", context);
        context = new ArrayList();
        context.add(new ImageConfig("screenshot_image_urls", -1));
        ASSET_URL_MAP.put("SCREENSHOT", context);
        context = new ImageConfig("badge_icon_image_url", 0x7f0c00db);
        BADGE_ASSET_URL_MAP.put("ICON", context);
    }

    private static ContentValues buildExtendedGameContentValues(Context context, FirstPartyApplication firstpartyapplication, Application application, Instance instance, MarketInstance marketinstance, boolean flag, boolean flag1, boolean flag2, 
            String s, ContentValues contentvalues)
    {
        Object obj;
        ContentValues contentvalues2;
        if (application != null)
        {
            ContentValues contentvalues1 = Agents.extractValues(((FastContentValuesJsonResponse) (application)).mValues, new String[] {
                "external_game_id", "display_name", "game_description", "developer_name", "achievement_total_count", "leaderboard_count", "muted", "identity_sharing_confirmed", "snapshots_enabled", "theme_color", 
                "video_url"
            });
            contentvalues1.put("primary_category", (String)((FastMapJsonResponse) (application.getCategory())).mValues.get("primary"));
            contentvalues1.put("secondary_category", (String)((FastMapJsonResponse) (application.getCategory())).mValues.get("secondary"));
            contentvalues1.put("play_enabled_game", Integer.valueOf(1));
            if (flag)
            {
                contentvalues1.put("metadata_version", Integer.valueOf(0));
            }
            if (flag1)
            {
                contentvalues1.put("metadata_sync_requested", Integer.valueOf(1));
            }
            contentvalues2 = contentvalues1;
            if (flag2)
            {
                contentvalues1.put("achievement_unlocked_count", firstpartyapplication.getUnlockedAchievementCount());
                contentvalues2 = contentvalues1;
            }
        } else
        if (marketinstance != null)
        {
            contentvalues2 = Agents.extractValues(((FastContentValuesJsonResponse) (marketinstance)).mValues, new String[] {
                "external_game_id", "display_name", "game_description", "developer_name"
            });
            obj = ((FastContentValuesJsonResponse) (marketinstance)).mValues.getAsString("primary_category");
            if (obj != null)
            {
                obj = ((String) (obj)).split(",");
                if (obj.length > 0)
                {
                    contentvalues2.put("primary_category", obj[0]);
                    if (obj.length > 1)
                    {
                        contentvalues2.put("secondary_category", obj[1]);
                    }
                }
            }
            contentvalues2.put("play_enabled_game", Integer.valueOf(0));
            contentvalues2.put("achievement_total_count", Integer.valueOf(0));
            if (flag2)
            {
                contentvalues2.put("achievement_unlocked_count", Integer.valueOf(0));
            }
            contentvalues2.put("leaderboard_count", Integer.valueOf(0));
            contentvalues2.put("metadata_version", Integer.valueOf(1));
            contentvalues2.put("identity_sharing_confirmed", Boolean.valueOf(false));
        } else
        {
            GamesLog.w("GameAgent", "Received application with no app data and no Market data!");
            return null;
        }
        contentvalues2.put("gameplay_acl_status", Integer.valueOf(1));
        if (firstpartyapplication == null)
        {
            obj = null;
        } else
        {
            obj = (Long)((FastMapJsonResponse) (firstpartyapplication)).mValues.get("lastPlayedTimeMillis");
        }
        if (obj != null)
        {
            contentvalues2.put("last_played_server_time", ((Long) (obj)));
        }
        if (marketinstance != null)
        {
            contentvalues2.putAll(Agents.extractValues(((FastContentValuesJsonResponse) (marketinstance)).mValues, new String[] {
                "availability", "owned", "formatted_price", "price_micros", "formatted_full_price", "full_price_micros"
            }));
        } else
        {
            contentvalues2.put("availability", Integer.valueOf(1));
            contentvalues2.put("owned", Boolean.valueOf(false));
        }
        if (flag2)
        {
            Object obj1 = null;
            obj = obj1;
            if (instance != null)
            {
                contentvalues2.putAll(((FastContentValuesJsonResponse) (instance)).mValues);
                obj = obj1;
                if (instance.getAndroidInstance() != null)
                {
                    contentvalues2.putAll(((FastContentValuesJsonResponse) (instance.getAndroidInstance())).mValues);
                    obj = contentvalues2.getAsString("package_name");
                }
            }
            instance = ((Instance) (obj));
            if (marketinstance != null)
            {
                contentvalues2.put("gamepad_support", Boolean.valueOf(((FastContentValuesJsonResponse) (marketinstance)).mValues.getAsBoolean("gamepad_support").booleanValue()));
                instance = ((Instance) (obj));
                if (obj == null)
                {
                    instance = marketinstance.getId();
                    contentvalues2.put("package_name", instance);
                }
            }
            if (instance != null && PackageUtils.isPackageInstalled(context, instance))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            contentvalues2.put("installed", Boolean.valueOf(flag));
            if (firstpartyapplication == null)
            {
                firstpartyapplication = null;
            } else
            {
                firstpartyapplication = firstpartyapplication.getSnapshot();
            }
            if (firstpartyapplication != null)
            {
                contentvalues2.putAll(((FastContentValuesJsonResponse) (firstpartyapplication)).mValues);
                if (contentvalues == null)
                {
                    firstpartyapplication = null;
                } else
                {
                    firstpartyapplication = contentvalues.getAsString("external_player_id");
                }
                if (firstpartyapplication != null && firstpartyapplication.equals(s))
                {
                    contentvalues2.putAll(contentvalues);
                }
            }
        }
        if (application != null)
        {
            addImageUrls(context, application.getAssets(), contentvalues2);
            return contentvalues2;
        } else
        {
            addImageUrls(context, marketinstance.getImages(), contentvalues2);
            return contentvalues2;
        }
    }

    private void cacheGameData(GamesClientContext gamesclientcontext, ArrayList arraylist, String s, TransientDataHolderCache transientdataholdercache, Object obj, long l)
    {
        transientdataholdercache.addCacheData(obj, assembleCacheValues(gamesclientcontext, arraylist, obj.equals("installed")), 0, null, s, 0, l);
    }

    public static int countInstalledGames(GamesClientContext gamesclientcontext)
    {
        int i;
        i = 0;
        android.net.Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(gamesclientcontext.mClientContext);
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(uri).query();
        Iterator iterator = (new GameBuffer(gamesclientcontext)).iterator();
_L1:
        boolean flag;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        flag = ((Game)iterator.next()).isInstanceInstalled();
        if (flag)
        {
            i++;
        }
          goto _L1
        gamesclientcontext.close();
        return i;
        Exception exception;
        exception;
        gamesclientcontext.close();
        throw exception;
    }

    private ApplicationList fetchAppUpdates(Context context, ClientContext clientcontext, SyncResult syncresult, Map map)
        throws GoogleAuthException
    {
        ApplicationList applicationlist;
        Object obj2;
        boolean flag;
        Object obj = null;
        flag = true;
        applicationlist = new ApplicationList();
        obj2 = new ArrayList();
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ((ArrayList) (obj2)).add(new ApplicationUpdatesFetchContext(s, (String)map.get(s))))
        {
            s = (String)iterator.next();
        }

        obj2 = new ApplicationUpdatesFetchList(((ArrayList) (obj2)));
        map = obj;
_L2:
        boolean flag1;
        if (!flag && map == null)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        flag1 = false;
        Object obj1;
        Object obj3;
        String s1;
        Boolean boolean1;
        String s2;
        StringBuilder stringbuilder;
        obj1 = mApplicationsApiInternal;
        obj3 = Agents.getCurrentRevision();
        s1 = DeviceType.fromContext(context);
        boolean1 = Boolean.valueOf(false);
        s2 = Agents.getLocaleString(context);
        stringbuilder = new StringBuilder("applicationUpdates");
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        ApplicationsApiInternal.append(stringbuilder, "clientRevision", ApplicationsApiInternal.enc(((String) (obj3))));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        ApplicationsApiInternal.append(stringbuilder, "deviceType", ApplicationsApiInternal.enc(s1));
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        ApplicationsApiInternal.append(stringbuilder, "includeMarketData", String.valueOf(boolean1));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        ApplicationsApiInternal.append(stringbuilder, "language", ApplicationsApiInternal.enc(s2));
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        ApplicationsApiInternal.append(stringbuilder, "pageToken", ApplicationsApiInternal.enc(map));
        ApplicationsApiInternal.append(stringbuilder, "platformType", ApplicationsApiInternal.enc("ANDROID"));
        map = stringbuilder.toString();
        obj3 = (ApplicationGetUpdatesMultipleFirstPartyResponse)((ApplicationsApiInternal) (obj1)).mServer.getResponseBlocking(clientcontext, 1, map, obj2, com/google/android/gms/games/server/api/ApplicationGetUpdatesMultipleFirstPartyResponse);
        obj1 = (String)((FastMapJsonResponse) (obj3)).mValues.get("nextPageToken");
        if (((ApplicationGetUpdatesMultipleFirstPartyResponse) (obj3)).getItems() != null)
        {
            map = ((ApplicationGetUpdatesMultipleFirstPartyResponse) (obj3)).getItems();
            applicationlist.updates.addAll(map);
        }
        flag = flag1;
        map = ((Map) (obj1));
        if (((ApplicationGetUpdatesMultipleFirstPartyResponse) (obj3)).getInvalidIds() == null) goto _L2; else goto _L1
_L1:
        applicationlist.addInvalidIds(((ApplicationGetUpdatesMultipleFirstPartyResponse) (obj3)).getInvalidIds());
        flag = flag1;
        map = ((Map) (obj1));
          goto _L2
        context;
        context = syncresult.stats;
        context.numIoExceptions = ((SyncStats) (context)).numIoExceptions + 1L;
        GamesLog.e("GameAgent", "Unable to retrieve applications from network");
        return applicationlist;
    }

    private boolean flushPendingOp(ClientContext clientcontext, String s, ApplicationSessionsFlushData applicationsessionsflushdata)
        throws GoogleAuthException
    {
        try
        {
            ApplicationsApiInternal applicationsapiinternal = mApplicationsApiInternal;
            applicationsessionsflushdata = applicationsessionsflushdata.multipleRequest;
            StringBuilder stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("applications/%1$s/sessions", new Object[] {
                ApplicationsApiInternal.enc(s)
            });
            s = stringbuilder.toString();
            applicationsapiinternal.mServer.performNoResponseRequestBlocking(clientcontext, 1, s, applicationsessionsflushdata);
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(clientcontext, "GameAgent");
            }
            if (ErrorUtils.isTransientError(clientcontext))
            {
                return false;
            } else
            {
                GamesLog.e("GameAgent", "Encountered hard error while submitting pending operations.");
                return true;
            }
        }
        return true;
    }

    private FirstPartyApplication getApplicationFromNetwork1P(GamesClientContext gamesclientcontext, boolean flag)
        throws GoogleAuthException, VolleyError
    {
        String s = Agents.getLocaleString(gamesclientcontext.mContext);
        String s1 = DeviceType.fromContext(gamesclientcontext.mContext);
        com.google.android.gms.games.server.api.ApplicationFetchList applicationfetchlist = Agents.getFetchList(gamesclientcontext.mExternalTargetGameId);
        gamesclientcontext = mApplicationsApiInternal.getMultipleBlocking$50e8dc84(gamesclientcontext.mClientContext, Agents.getCurrentRevision(), s1, Boolean.valueOf(flag), s, null, "ANDROID", Boolean.valueOf(Agents.isPlusRequired$9c10cfc()), applicationfetchlist).getItems();
        if (gamesclientcontext == null || gamesclientcontext.size() == 0)
        {
            throw new VolleyError(new NetworkResponse(404, null, null, false));
        } else
        {
            return (FirstPartyApplication)gamesclientcontext.get(0);
        }
    }

    protected static Clock getClock()
    {
        return DefaultClock.getInstance();
    }

    private static String getExternalIdForPackage(Context context, ClientContext clientcontext, String s)
    {
        Object obj = null;
        clientcontext = context.getContentResolver().query(com.google.android.gms.games.provider.GamesContractInternal.GameInstances.getContentUri(clientcontext), EXTERNAL_ID_PROJECTION, "package_name=?", new String[] {
            s
        }, null);
        context = obj;
        if (clientcontext.moveToFirst())
        {
            context = clientcontext.getString(0);
        }
        clientcontext.close();
        return context;
        context;
        clientcontext.close();
        throw context;
    }

    public static DataHolder getGameInstances(GamesClientContext gamesclientcontext)
    {
        android.net.Uri uri = com.google.android.gms.games.provider.GamesContractInternal.GameInstances.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId);
        return (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(uri).query();
    }

    public static long getMostRecentConnectionTime(Context context, ClientContext clientcontext)
    {
        long l;
        l = -1L;
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(clientcontext);
        context = (new Agents.QueryBuilder(context)).setQuerySpec(clientcontext);
        context.mProjection = (new String[] {
            "last_connection_local_time"
        });
        context.mSortOrder = "last_connection_local_time DESC";
        context = context.queryCursor();
        if (context.moveToFirst())
        {
            l = context.getLong(0);
        }
        context.close();
        return l;
        clientcontext;
        context.close();
        throw clientcontext;
    }

    private static Instance getTargetInstance(Context context, Application application, MarketApplication marketapplication)
    {
        ArrayList arraylist;
        int i;
        int j;
        int k;
        int l;
        int k2;
        int j3;
        if (application == null || application.getInstances() == null || application.getInstances().size() == 0)
        {
            return null;
        }
        k2 = -1;
        j = -1;
        k = -1;
        l = -1;
        arraylist = application.getInstances();
        i = 0;
        j3 = arraylist.size();
_L9:
        com.google.android.gms.games.server.api.InstanceAndroidDetails instanceandroiddetails;
        int l1;
        int i2;
        int j2;
        int i3;
        if (i >= j3)
        {
            break MISSING_BLOCK_LABEL_581;
        }
        application = (Instance)arraylist.get(i);
        instanceandroiddetails = application.getAndroidInstance();
        l1 = j;
        i2 = l;
        j2 = k;
        i3 = k2;
        if (instanceandroiddetails == null) goto _L2; else goto _L1
_L1:
        int l2;
        if (PackageUtils.isPackageInstalled(context, ((FastContentValuesJsonResponse) (instanceandroiddetails)).mValues.getAsString("package_name")))
        {
            return application;
        }
        l2 = 0;
        if (marketapplication != null && marketapplication.getInstances() != null && marketapplication.getInstances().size() != 0) goto _L4; else goto _L3
_L3:
        application = null;
_L5:
        int j1 = j;
        int k1 = l;
        int i1 = k;
        if (application != null)
        {
            Object obj = (Boolean)((FastContentValuesJsonResponse) (application)).mValues.get("owned");
            application = (Integer)((FastContentValuesJsonResponse) (application)).mValues.get("availability");
            String s;
            if (application != null && application.intValue() == 0)
            {
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            i2 = j;
            j2 = k;
            if (l1 != 0)
            {
                i1 = j;
                if (j < 0)
                {
                    i1 = i;
                }
                i2 = i1;
                j2 = k;
                if (obj != null)
                {
                    i2 = i1;
                    j2 = k;
                    if (((Boolean) (obj)).booleanValue())
                    {
                        i2 = i1;
                        j2 = k;
                        if (k < 0)
                        {
                            j2 = i;
                            i2 = i1;
                        }
                    }
                }
            }
            l2 = l1;
            j1 = i2;
            k1 = l;
            i1 = j2;
            if (obj != null)
            {
                l2 = l1;
                j1 = i2;
                k1 = l;
                i1 = j2;
                if (((Boolean) (obj)).booleanValue())
                {
                    l2 = l1;
                    j1 = i2;
                    k1 = l;
                    i1 = j2;
                    if (l < 0)
                    {
                        k1 = i;
                        i1 = j2;
                        j1 = i2;
                        l2 = l1;
                    }
                }
            }
        }
        l1 = j1;
        i2 = k1;
        j2 = i1;
        i3 = k2;
        if (k2 < 0)
        {
            l1 = j1;
            i2 = k1;
            j2 = i1;
            i3 = k2;
            if (l2 != 0)
            {
                application = (Boolean)((FastContentValuesJsonResponse) (instanceandroiddetails)).mValues.get("preferred");
                l1 = j1;
                i2 = k1;
                j2 = i1;
                i3 = k2;
                if (application != null)
                {
                    l1 = j1;
                    i2 = k1;
                    j2 = i1;
                    i3 = k2;
                    if (application.booleanValue())
                    {
                        i3 = i;
                        j2 = i1;
                        i2 = k1;
                        l1 = j1;
                    }
                }
            }
        }
_L2:
        i++;
        j = l1;
        l = i2;
        k = j2;
        k2 = i3;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = marketapplication.getInstances();
        s = ((FastContentValuesJsonResponse) (application.getAndroidInstance())).mValues.getAsString("package_name");
        j1 = ((ArrayList) (obj)).size();
        i1 = 0;
_L7:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_570;
        }
        application = (MarketInstance)((ArrayList) (obj)).get(i1);
        if (!s.equals(application.getId())) goto _L6; else goto _L5
_L6:
        i1++;
          goto _L7
        application = null;
          goto _L5
        if (k > 0)
        {
            return (Instance)arraylist.get(k);
        }
        if (k2 > 0)
        {
            return (Instance)arraylist.get(k2);
        }
        if (j > 0)
        {
            return (Instance)arraylist.get(j);
        }
        if (l > 0)
        {
            return (Instance)arraylist.get(l);
        }
        return (Instance)arraylist.get(0);
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static MarketInstance getTargetMarketInstance(Instance instance, MarketApplication marketapplication)
    {
        if (marketapplication == null || marketapplication.getInstances() == null || marketapplication.getInstances().size() == 0)
        {
            return null;
        }
        marketapplication = marketapplication.getInstances();
        if (instance == null || instance.getAndroidInstance() == null)
        {
            return (MarketInstance)marketapplication.get(0);
        }
        instance = ((FastContentValuesJsonResponse) (instance.getAndroidInstance())).mValues.getAsString("package_name");
        int i = 0;
        for (int j = marketapplication.size(); i < j; i++)
        {
            MarketInstance marketinstance = (MarketInstance)marketapplication.get(i);
            if (instance.equals(marketinstance.getId()))
            {
                return marketinstance;
            }
        }

        return (MarketInstance)marketapplication.get(0);
    }

    private DataHolder loadGameData(GamesClientContext gamesclientcontext, GameCache gamecache, String s, boolean flag, String s1, boolean flag1, int i, 
            boolean flag2, FirstPartyGameListProcessor firstpartygamelistprocessor)
        throws GoogleAuthException
    {
        Object obj2 = gamesclientcontext.mContext;
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        Object obj1;
        long l;
        if (flag)
        {
            obj1 = gamesclientcontext.mExternalTargetPlayerId;
        } else
        {
            obj1 = gamesclientcontext.mExternalCurrentPlayerId;
        }
        gamecache.enableCaching(obj1);
        l = DefaultClock.getInstance().currentTimeMillis();
        if (gamesclientcontext.mForceReload)
        {
            gamecache.clearData(s);
        }
        if (gamecache.hasEnoughData(s, l, i, flag2))
        {
            return gamecache.getData(s, null);
        }
        Object obj = null;
        boolean flag3 = gamecache.hasData(s, l);
        if (flag2 || flag3)
        {
            obj = gamecache.getNextPageToken(s, l);
        }
        String s2;
        Boolean boolean1;
        Integer integer;
        Boolean boolean2;
        StringBuilder stringbuilder;
        try
        {
            s2 = DeviceType.fromContext(((Context) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "GameAgent");
            if (flag3)
            {
                gamecache.setStatusCode(s, 3);
            }
            return gamecache.getData(s, null);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        obj = ApplicationsApiInternal.urlForListByPlayer(((String) (obj1)), s1, Agents.getCurrentRevision(), s2, Boolean.valueOf(flag1), Agents.getLocaleString(((Context) (obj2))), Integer.valueOf(i), ((String) (obj)), "ANDROID", Boolean.valueOf(Agents.isPlusRequired$9c10cfc()));
_L4:
        obj1 = obj;
        if ("hidden".equals(s1))
        {
            obj1 = (new StringBuilder()).append(((String) (obj))).append("&nonce=").append(sMutedVolleyCacheNonce.get()).toString();
        }
        s1 = (ApplicationListFirstPartyResponse)mInternalApiaryServer.getResponseBlocking(clientcontext, 0, ((String) (obj1)), null, com/google/android/gms/games/server/api/ApplicationListFirstPartyResponse);
        obj = s1.getItems();
        if (firstpartygamelistprocessor != null)
        {
            firstpartygamelistprocessor.processGameList(((ArrayList) (obj)));
        }
        cacheGameData(gamesclientcontext, ((ArrayList) (obj)), s1.getNextPageToken(), gamecache, s, l);
        return gamecache.getData(s, null);
_L2:
        obj1 = Agents.getCurrentRevision();
        boolean1 = Boolean.valueOf(flag1);
        obj2 = Agents.getLocaleString(((Context) (obj2)));
        integer = Integer.valueOf(i);
        boolean2 = Boolean.valueOf(Agents.isPlusRequired$9c10cfc());
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("applications/%1$s", new Object[] {
            ApplicationsApiInternal.enc(s1)
        });
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_365;
        }
        ApplicationsApiInternal.append(stringbuilder, "clientRevision", ApplicationsApiInternal.enc(((String) (obj1))));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_383;
        }
        ApplicationsApiInternal.append(stringbuilder, "deviceType", ApplicationsApiInternal.enc(s2));
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        ApplicationsApiInternal.append(stringbuilder, "filterPlayable", String.valueOf(boolean1));
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        ApplicationsApiInternal.append(stringbuilder, "language", ApplicationsApiInternal.enc(((String) (obj2))));
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_437;
        }
        ApplicationsApiInternal.append(stringbuilder, "maxResults", String.valueOf(integer));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        ApplicationsApiInternal.append(stringbuilder, "pageToken", ApplicationsApiInternal.enc(((String) (obj))));
        ApplicationsApiInternal.append(stringbuilder, "platformType", ApplicationsApiInternal.enc("ANDROID"));
        if (boolean2 == null)
        {
            break MISSING_BLOCK_LABEL_487;
        }
        ApplicationsApiInternal.append(stringbuilder, "plusRequired", String.valueOf(boolean2));
        obj = stringbuilder.toString();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int recordApplicationSession(GamesClientContext gamesclientcontext, String s, long l, long l1, String s1, boolean flag)
    {
        Context context = gamesclientcontext.mContext;
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        android.net.Uri uri = com.google.android.gms.games.provider.GamesContractInternal.ApplicationSessions.getContentUri(clientcontext);
        long l2 = System.currentTimeMillis();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("client_context_id", Long.valueOf(Agents.resolveClientContextId(context, clientcontext)));
        contentvalues.put("end_time", Long.valueOf(l2 + (l1 - l)));
        contentvalues.put("external_game_id", gamesclientcontext.mExternalTargetGameId);
        contentvalues.put("session_id", s);
        contentvalues.put("start_time", Long.valueOf(l2));
        contentvalues.put("ad_id", s1);
        contentvalues.put("limit_ad_tracking", Boolean.valueOf(flag));
        context.getContentResolver().insert(uri, contentvalues);
        return 0;
    }

    public static void refreshAllGameMetadata(Context context, ClientContext clientcontext)
    {
        android.net.Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(clientcontext);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("metadata_version", Integer.valueOf(0));
        contentvalues.putNull("sync_token");
        context.getContentResolver().update(uri, contentvalues, null, null);
        GamesSyncAdapter.requestSync$1221cb0a(clientcontext);
    }

    public static int setIdentitySharingConfirmed(GamesClientContext gamesclientcontext)
    {
        int i = 0;
        android.net.Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("identity_sharing_confirmed", Boolean.valueOf(true));
        if (gamesclientcontext.mContext.getContentResolver().update(uri, contentvalues, null, null) != 1)
        {
            i = 1;
        }
        return i;
    }

    public static long updateConnectionTime(GamesClientContext gamesclientcontext)
    {
        Context context = gamesclientcontext.mContext;
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        android.net.Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(clientcontext, gamesclientcontext.mExternalTargetGameId);
        long l = Agents.queryLong$34bc2a06(context, uri, "last_connection_local_time");
        boolean flag;
        if (l == -1L)
        {
            GamesLog.w("GameAgent", (new StringBuilder("Attempting to update connection time for game ")).append(gamesclientcontext.mExternalTargetGameId).append(" which has no local record!").toString());
            long l1;
            try
            {
                gamesclientcontext.resolveTargetGameId();
            }
            // Misplaced declaration of an exception variable
            catch (GamesClientContext gamesclientcontext)
            {
                return -1L;
            }
        }
        l1 = DefaultClock.getInstance().currentTimeMillis();
        if (l1 - l > 0x2932e00L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gamesclientcontext = new ContentValues();
        gamesclientcontext.put("last_connection_local_time", Long.valueOf(l1));
        if (flag)
        {
            gamesclientcontext.put("metadata_sync_requested", Integer.valueOf(1));
        }
        context.getContentResolver().update(uri, gamesclientcontext, null, null);
        if (flag)
        {
            GamesSyncAdapter.requestSync$1221cb0a(clientcontext);
        }
        return l;
    }

    public static void updateMetadataVersions(Context context, ClientContext clientcontext, ArrayList arraylist)
    {
        ArrayList arraylist1 = new ArrayList();
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            GameRefreshRecord gamerefreshrecord = (GameRefreshRecord)arraylist.get(i);
            arraylist1.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(clientcontext, gamerefreshrecord.mExternalGameId)).withValue("metadata_version", Long.valueOf(gamerefreshrecord.mNewVersion)).withValue("sync_token", gamerefreshrecord.mNewSyncToken).withValue("metadata_sync_requested", Integer.valueOf(0)).withYieldAllowed(Agents.shouldAllowYieldAtIndex(i)).build());
        }

        Agents.applyContentOperations(context.getContentResolver(), arraylist1, "GameAgent");
    }

    final long addGameOps$2e0f2217(Context context, ClientContext clientcontext, FirstPartyApplication firstpartyapplication, Application application, MarketApplication marketapplication, boolean flag, boolean flag1, 
            ArrayList arraylist)
    {
        return addGameOps(context, clientcontext, firstpartyapplication, application, marketapplication, null, flag, flag1, false, arraylist);
    }

    public final void clearRecentlyPlayedCache()
    {
        mRecentGamesByPlayerCache.clearData("played");
    }

    public final void clearTransientCaches()
    {
        mCache.clear();
        mRecentGamesByPlayerCache.clear();
        mSearchCache.clear();
    }

    final ApplicationList fetchFirstPartyApplications(Context context, ClientContext clientcontext, SyncResult syncresult, ArrayList arraylist)
        throws GoogleAuthException
    {
        ApplicationList applicationlist;
        com.google.android.gms.games.server.api.ApplicationFetchList applicationfetchlist;
        boolean flag;
        Object obj = null;
        flag = true;
        applicationlist = new ApplicationList();
        applicationfetchlist = Agents.getFetchList(arraylist);
        arraylist = obj;
_L2:
        boolean flag1;
        if (!flag && arraylist == null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        flag1 = false;
        String s;
        ApplicationGetMultipleFirstPartyResponse applicationgetmultiplefirstpartyresponse;
        applicationgetmultiplefirstpartyresponse = mApplicationsApiInternal.getMultipleBlocking$50e8dc84(clientcontext, Agents.getCurrentRevision(), DeviceType.fromContext(context), Boolean.valueOf(true), Agents.getLocaleString(context), arraylist, "ANDROID", Boolean.valueOf(Agents.isPlusRequired$9c10cfc()), applicationfetchlist);
        s = (String)((FastMapJsonResponse) (applicationgetmultiplefirstpartyresponse)).mValues.get("nextPageToken");
        if (applicationgetmultiplefirstpartyresponse.getItems() != null)
        {
            arraylist = applicationgetmultiplefirstpartyresponse.getItems();
            applicationlist.applications.addAll(arraylist);
        }
        arraylist = s;
        flag = flag1;
        if (applicationgetmultiplefirstpartyresponse.getInvalidIds() == null) goto _L2; else goto _L1
_L1:
        applicationlist.addInvalidIds(applicationgetmultiplefirstpartyresponse.getInvalidIds());
        arraylist = s;
        flag = flag1;
          goto _L2
        context;
        context = syncresult.stats;
        context.numIoExceptions = ((SyncStats) (context)).numIoExceptions + 1L;
        GamesLog.e("GameAgent", "Unable to retrieve applications from network");
        return applicationlist;
    }

    public final DataHolder getExtendedGame(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        Object obj;
        FirstPartyApplication firstpartyapplication;
        ArrayList arraylist;
        int i;
        try
        {
            firstpartyapplication = getApplicationFromNetwork1P(gamesclientcontext, true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            GamesLog.e("GameAgent", (new StringBuilder("Unable to retrieve 1P application ")).append(gamesclientcontext.mExternalTargetGameId).append(" from network").toString());
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(((VolleyError) (obj)), "GameAgent");
            }
            if (ErrorUtils.hasStatusCode(((VolleyError) (obj)), 404))
            {
                GamesLog.e("GameAgent", String.format("Game ID (%s) was not found on server", new Object[] {
                    gamesclientcontext.mExternalTargetGameId
                }));
                return DataHolder.empty(9);
            } else
            {
                return DataHolder.empty(4);
            }
        }
        obj = new TransientDataHolder(EXTENDED_GAME_DATA_SPEC.mColumnNames);
        arraylist = new ArrayList();
        arraylist.add(firstpartyapplication);
        gamesclientcontext = assembleCacheValues(gamesclientcontext, arraylist, false);
        i = 0;
        for (int j = gamesclientcontext.size(); i < j; i++)
        {
            ((TransientDataHolder) (obj)).addRow((ContentValues)gamesclientcontext.get(i));
        }

        return ((TransientDataHolder) (obj)).build(0);
    }

    public final DataHolder getGame(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        ClientContext clientcontext;
        String s1;
        int i;
        i = 0;
        clientcontext = gamesclientcontext.mClientContext;
        s1 = gamesclientcontext.mExternalTargetGameId;
        if (!gamesclientcontext.mIsFirstParty) goto _L2; else goto _L1
_L1:
        Object obj = getApplicationFromNetwork1P(gamesclientcontext, false);
        Object obj2 = ((FirstPartyApplication) (obj)).getGamesData();
        Object obj3 = ((FirstPartyApplication) (obj)).getMarketData();
        Object obj1 = obj;
_L3:
        if (obj2 != null)
        {
            obj = new ArrayList();
            addGameOps$2e0f2217(gamesclientcontext.mContext, clientcontext, ((FirstPartyApplication) (obj1)), ((Application) (obj2)), ((MarketApplication) (obj3)), false, true, ((ArrayList) (obj)));
            Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), ((ArrayList) (obj)), "GameAgent");
        }
        StringBuilder stringbuilder;
        boolean flag;
        if (s == null)
        {
            flag = true;
        } else
        {
            obj = com.google.android.gms.games.provider.GamesContractInternal.GameInstances.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId);
            if (Agents.resolveExternalId(gamesclientcontext.mContext, ((android.net.Uri) (obj)), "package_name=?", new String[] {
    s
}) != -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (!flag)
        {
            GamesLog.e("GameAgent", (new StringBuilder("Application ID ")).append(s1).append(" is not associated with package ").append(s).append(". Check the application ID in your manifest.").toString());
            return DataHolder.empty(8);
        } else
        {
            s = com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(clientcontext, s1);
            gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(s);
            gamesclientcontext.mStatusCode = i;
            return gamesclientcontext.query();
        }
_L2:
        obj2 = Agents.getLocaleString(gamesclientcontext.mContext);
        obj = mApplicationsApi;
        obj1 = gamesclientcontext.mClientContext;
        obj3 = gamesclientcontext.mExternalTargetGameId;
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("applications/%1$s", new Object[] {
            ApplicationsApi.enc(((String) (obj3)))
        });
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        ApplicationsApi.append(stringbuilder, "language", ApplicationsApi.enc(((String) (obj2))));
        ApplicationsApi.append(stringbuilder, "platformType", ApplicationsApi.enc("ANDROID"));
        obj2 = stringbuilder.toString();
        obj2 = (Application)((ApplicationsApi) (obj)).mServer.getResponseBlocking(((ClientContext) (obj1)), 0, ((String) (obj2)), null, com/google/android/gms/games/server/api/Application);
        obj3 = null;
        obj1 = null;
          goto _L3
        obj2;
        obj = null;
        obj1 = null;
_L4:
        GamesLog.e("GameAgent", (new StringBuilder("Unable to retrieve application ")).append(s1).append(" from network").toString());
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(((VolleyError) (obj2)), "GameAgent");
        }
        i = 3;
        obj3 = null;
        obj2 = obj;
          goto _L3
        obj2;
        Object obj4 = null;
        obj1 = obj;
        obj = obj4;
          goto _L4
        VolleyError volleyerror;
        volleyerror;
        obj1 = obj;
        obj = obj2;
        obj2 = volleyerror;
          goto _L4
    }

    public final ArrayList getGamesToRefresh(GamesClientContext gamesclientcontext, SyncResult syncresult)
        throws GoogleAuthException
    {
        Context context;
        ClientContext clientcontext;
        ArrayMap arraymap;
        ArrayMap arraymap1;
        ContentResolver contentresolver;
        Object obj;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        arraymap = new ArrayMap();
        arraymap1 = new ArrayMap();
        gamesclientcontext = new ArrayList();
        contentresolver = context.getContentResolver();
        obj = contentresolver.query(com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(clientcontext), VersionQuery.PROJECTION, "metadata_sync_requested=1", null, null);
        while (((Cursor) (obj)).moveToNext()) 
        {
            String s = ((Cursor) (obj)).getString(1);
            long l = ((Cursor) (obj)).getLong(2);
            String s1 = ((Cursor) (obj)).getString(3);
            gamesclientcontext.add(s);
            arraymap.put(s, Long.valueOf(l));
            arraymap1.put(s, s1);
        }
        break MISSING_BLOCK_LABEL_150;
        gamesclientcontext;
        ((Cursor) (obj)).close();
        throw gamesclientcontext;
        ((Cursor) (obj)).close();
        obj = new ArrayList();
        if (gamesclientcontext.size() != 0)
        {
            ApplicationList applicationlist = fetchAppUpdates(context, clientcontext, syncresult, arraymap1);
            ArrayList arraylist = new ArrayList();
            int i = 0;
            int j = applicationlist.updates.size();
            while (i < j) 
            {
                FirstPartyApplicationUpdates firstpartyapplicationupdates = (FirstPartyApplicationUpdates)applicationlist.updates.get(i);
                String s2 = (String)((FastMapJsonResponse) (firstpartyapplicationupdates)).mValues.get("applicationId");
                Long long1 = (Long)arraymap.get(s2);
                syncresult = (Long)((FastMapJsonResponse) (firstpartyapplicationupdates)).mValues.get("lastMetadataUpdatedTimestamp");
                gamesclientcontext = firstpartyapplicationupdates.getApplication();
                if (gamesclientcontext != null)
                {
                    syncresult = Long.valueOf(addGameOps$2e0f2217(context, clientcontext, gamesclientcontext, gamesclientcontext.getGamesData(), gamesclientcontext.getMarketData(), false, false, arraylist));
                }
                if (firstpartyapplicationupdates.getItems() == null)
                {
                    gamesclientcontext = new ArrayList();
                } else
                {
                    gamesclientcontext = firstpartyapplicationupdates.getItems();
                }
                if (!arraymap1.containsKey(s2))
                {
                    if (long1 == null || syncresult != null && syncresult.longValue() > long1.longValue())
                    {
                        gamesclientcontext = ArrayUtils.toArrayList(AppUpdateType.ALL_TYPES);
                    } else
                    {
                        gamesclientcontext = ArrayUtils.toArrayList(AppUpdateType.INSTANCE_TYPES);
                    }
                }
                if (gamesclientcontext.size() > 0)
                {
                    ((ArrayList) (obj)).add(new GameRefreshRecord(s2, syncresult, (String)((FastMapJsonResponse) (firstpartyapplicationupdates)).mValues.get("syncToken"), gamesclientcontext));
                }
                i++;
            }
            i = 0;
            for (int k = applicationlist.invalidIds.size(); i < k; i++)
            {
                arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(clientcontext, ((InvalidId)applicationlist.invalidIds.get(i)).getId())).build());
            }

            if (arraylist.size() > 0)
            {
                Agents.applyContentOperations(contentresolver, arraylist, "GameAgent");
                return ((ArrayList) (obj));
            }
        }
        return ((ArrayList) (obj));
    }

    public final Lockable getLockableForCollection(int i)
    {
        switch (i)
        {
        default:
            return mNamedLock;

        case 0: // '\0'
            return mFeaturedLock;

        case 1: // '\001'
            return mMultiplayerLock;

        case 2: // '\002'
            return mPopularLock;

        case 3: // '\003'
            return mRecentlyPlayedLock;

        case 4: // '\004'
            return mRecommendedLock;

        case 5: // '\005'
            return mDownloadedLock;

        case 6: // '\006'
            return mInstalledLock;

        case 7: // '\007'
            return mHiddenLock;
        }
    }

    public final DataHolder isGameMuted(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        Object obj;
        int i;
        int j;
        boolean flag;
        long l;
        boolean flag2;
        mHiddenLock.assertLockedByCurrentThread();
        flag = false;
        flag2 = false;
        j = 1;
        mCache.enableCaching(gamesclientcontext.mExternalCurrentPlayerId);
        l = DefaultClock.getInstance().currentTimeMillis();
        i = 0;
        obj = mCache.getNextPageToken("hidden", l);
_L4:
        int k;
        boolean flag1;
        k = ((flag) ? 1 : 0);
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (j == 0)
        {
            k = ((flag) ? 1 : 0);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
        }
        flag1 = false;
        obj = null;
        DataHolder dataholder = loadGameCollection(gamesclientcontext, 25, 7, true);
        obj = dataholder;
        if (dataholder.mStatusCode == 0)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        obj = dataholder;
        i = dataholder.mStatusCode;
        k = i;
        if (dataholder != null)
        {
            dataholder.close();
            k = i;
        }
        obj = new HashMap();
        ((HashMap) (obj)).put("external_game_id", gamesclientcontext.mExternalTargetGameId);
        ((HashMap) (obj)).put("muted", Boolean.valueOf(flag2));
        return DataHolder.builder(MUTE_CHECK_COLUMNS).withRow(((HashMap) (obj))).build(k);
        obj = dataholder;
        j = dataholder.mRowCount;
        k = i;
_L2:
        boolean flag3;
        flag3 = flag2;
        if (k >= j)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        obj = dataholder;
        String s = dataholder.getString("external_game_id", k, dataholder.getWindowIndex(k));
        obj = dataholder;
        if (!gamesclientcontext.mExternalTargetGameId.equals(s))
        {
            break MISSING_BLOCK_LABEL_297;
        }
        flag3 = true;
        obj = dataholder;
        s = mCache.getNextPageToken("hidden", l);
        j = ((flag1) ? 1 : 0);
        i = k;
        flag2 = flag3;
        obj = s;
        if (dataholder != null)
        {
            dataholder.close();
            j = ((flag1) ? 1 : 0);
            i = k;
            flag2 = flag3;
            obj = s;
        }
        continue; /* Loop/switch isn't completed */
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        gamesclientcontext;
        if (obj != null)
        {
            ((DataHolder) (obj)).close();
        }
        throw gamesclientcontext;
        if (true) goto _L4; else goto _L3
_L3:
    }

    DataHolder loadCommonOrDisjointGames(GamesClientContext gamesclientcontext, String s, int i, boolean flag)
        throws GoogleAuthException
    {
        Object obj = gamesclientcontext.mContext;
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        String s2 = gamesclientcontext.mExternalTargetPlayerId;
        String s3 = gamesclientcontext.mExternalCurrentPlayerId;
        mCompareGamesCache.enableCaching(s3);
        GameCompareCacheKey gamecomparecachekey = new GameCompareCacheKey(s2, s);
        long l = DefaultClock.getInstance().currentTimeMillis();
        if (gamesclientcontext.mForceReload)
        {
            mCompareGamesCache.clearData(gamecomparecachekey);
        }
        if (mCompareGamesCache.hasEnoughData(gamecomparecachekey, l, i, flag))
        {
            return mCompareGamesCache.getData(gamecomparecachekey, null);
        }
        String s1 = null;
        if (flag || mCompareGamesCache.hasData(gamecomparecachekey, l))
        {
            s1 = mCompareGamesCache.getNextPageToken(gamecomparecachekey, l);
        }
        ApplicationsApiInternal applicationsapiinternal;
        String s4;
        String s5;
        Boolean boolean1;
        Integer integer;
        StringBuilder stringbuilder;
        try
        {
            applicationsapiinternal = mApplicationsApiInternal;
            s4 = Agents.getCurrentRevision();
            s5 = DeviceType.fromContext(((Context) (obj)));
            boolean1 = Boolean.valueOf(false);
            obj = Agents.getLocaleString(((Context) (obj)));
            integer = Integer.valueOf(i);
            stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("players/%1$s/players/%2$s/applications/%3$s", new Object[] {
                ApplicationsApiInternal.enc(s3), ApplicationsApiInternal.enc(s2), ApplicationsApiInternal.enc(s)
            });
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "GameAgent");
            if (mCompareGamesCache.hasData(gamecomparecachekey, l))
            {
                mCompareGamesCache.setStatusCode(gamecomparecachekey, 3);
            }
            return mCompareGamesCache.getData(gamecomparecachekey, null);
        }
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        ApplicationsApiInternal.append(stringbuilder, "clientRevision", ApplicationsApiInternal.enc(s4));
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_259;
        }
        ApplicationsApiInternal.append(stringbuilder, "deviceType", ApplicationsApiInternal.enc(s5));
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        ApplicationsApiInternal.append(stringbuilder, "filterPlayable", String.valueOf(boolean1));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        ApplicationsApiInternal.append(stringbuilder, "language", ApplicationsApiInternal.enc(((String) (obj))));
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        ApplicationsApiInternal.append(stringbuilder, "maxResults", String.valueOf(integer));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_331;
        }
        ApplicationsApiInternal.append(stringbuilder, "pageToken", ApplicationsApiInternal.enc(s1));
        ApplicationsApiInternal.append(stringbuilder, "platformType", ApplicationsApiInternal.enc("ANDROID"));
        s = stringbuilder.toString();
        s = (ApplicationListFirstPartyResponse)applicationsapiinternal.mServer.getResponseBlocking(clientcontext, 0, s, null, com/google/android/gms/games/server/api/ApplicationListFirstPartyResponse);
        cacheGameData(gamesclientcontext, s.getItems(), s.getNextPageToken(), mCompareGamesCache, gamecomparecachekey, l);
        return mCompareGamesCache.getData(gamecomparecachekey, null);
    }

    public final DataHolder loadGameCollection(GamesClientContext gamesclientcontext, int i, int j, boolean flag)
        throws GoogleAuthException
    {
        GameCache gamecache;
        Object obj;
        boolean flag2;
        getLockableForCollection(j).assertLockedByCurrentThread();
        flag2 = true;
        obj = null;
        gamecache = mCache;
        j;
        JVM INSTR tableswitch 0 7: default 68
    //                   0 95
    //                   1 192
    //                   2 203
    //                   3 214
    //                   4 234
    //                   5 245
    //                   6 256
    //                   7 267;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        GamesLog.e("GameAgent", (new StringBuilder("Unexpected collection type: ")).append(j).toString());
        return DataHolder.empty(1);
_L2:
        String s;
        boolean flag1;
        s = "featured";
        flag1 = false;
_L11:
        Object obj1 = gamesclientcontext;
        if (gamesclientcontext.mExternalTargetPlayerId == null)
        {
            obj1 = gamesclientcontext;
            if (flag1)
            {
                String s1 = gamesclientcontext.mExternalCurrentPlayerId;
                obj1 = s1;
                if (s1 == null)
                {
                    GamesLog.v("GameAgent", "External player id is null while loading collection");
                    obj1 = gamesclientcontext.mClientContext.getResolvedAccountName();
                }
                gamesclientcontext = gamesclientcontext.getBuilder();
                gamesclientcontext.mExternalTargetPlayerId = ((String) (obj1));
                obj1 = gamesclientcontext.build();
            }
        }
        return loadGameData(((GamesClientContext) (obj1)), gamecache, s, flag1, s, flag2, i, flag, ((FirstPartyGameListProcessor) (obj)));
_L3:
        s = "multiplayer";
        flag1 = false;
        continue; /* Loop/switch isn't completed */
_L4:
        s = "all";
        flag1 = false;
        continue; /* Loop/switch isn't completed */
_L5:
        s = "played";
        gamecache = mRecentGamesByPlayerCache;
        flag1 = true;
        flag2 = false;
        continue; /* Loop/switch isn't completed */
_L6:
        s = "recommended";
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L7:
        s = "downloaded";
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L8:
        s = "installed";
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L9:
        flag2 = false;
        obj = new StoreGamesProcessor(gamesclientcontext.mContext, gamesclientcontext.mClientContext, gamesclientcontext.getExternalPlayerId(), true, (byte)0);
        flag1 = true;
        s = "hidden";
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final DataHolder loadGameSearchSuggestions(Context context, ClientContext clientcontext, String s)
    {
        String s1;
        mSearchSuggestionLock.assertLockedByCurrentThread();
        if (s.length() < 3)
        {
            return DataHolder.empty(0);
        }
        s1 = s;
        s = URLEncoder.encode(s, "UTF-8");
        s1 = s;
_L2:
        context = Agents.getLocale(context);
        int i;
        try
        {
            context = (SearchSuggestResponse)mGamesSearchSuggestServer.getResponseBlocking(clientcontext, 0, String.format("/SuggRequest?json=1&query=%1$s&hl=%2$s&gl=%3$s", new Object[] {
                s1, context.getLanguage(), context.getCountry()
            }), null, com/google/android/gms/games/server/finsky/SearchSuggestResponse);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return DataHolder.empty(1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return DataHolder.empty(4);
        }
        context = (ArrayList)((SearchSuggestResponse) (context)).mConcreteTypeArrays.get("suggestions");
        clientcontext = new TransientDataHolder(com.google.android.gms.games.provider.GamesContractInternal.GameSearchSuggestions.ALL_COLUMNS, "suggestion", null, null);
        i = 0;
        for (int j = context.size(); i < j; i++)
        {
            s = new ContentValues();
            s.put("suggestion", (String)((FastMapJsonResponse) ((SearchSuggestion)context.get(i))).mValues.get("suggestion"));
            clientcontext.addRow(s);
        }

        return clientcontext.build(0);
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    DataHolder loadRecentlyPlayedGamesForSignedInUser(GamesClientContext gamesclientcontext, int i, boolean flag)
        throws GoogleAuthException
    {
        String s1;
        Context context;
        ClientContext clientcontext;
        Object obj2;
        long l1;
        s1 = gamesclientcontext.mExternalCurrentPlayerId;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        mRecentGamesByPlayerCache.enableCaching(s1);
        if (gamesclientcontext.mForceReload)
        {
            clearRecentlyPlayedCache();
        }
        l1 = DefaultClock.getInstance().currentTimeMillis();
        if (mRecentGamesByPlayerCache.hasEnoughData("played", l1, i, flag))
        {
            return mRecentGamesByPlayerCache.getData("played", null);
        }
        Object obj = null;
        flag = mRecentGamesByPlayerCache.hasData("played", l1);
        if (flag)
        {
            obj = mRecentGamesByPlayerCache.getNextPageToken("played", l1);
        }
        try
        {
            obj2 = mApplicationsApiInternal;
            obj = ApplicationsApiInternal.urlForListByPlayer("me", "played", Agents.getCurrentRevision(), DeviceType.fromContext(context), Boolean.valueOf(false), Agents.getLocaleString(context), Integer.valueOf(i), ((String) (obj)), "ANDROID", Boolean.valueOf(Agents.isPlusRequired$9c10cfc()));
            obj2 = (ApplicationListFirstPartyResponse)((ApplicationsApiInternal) (obj2)).mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/games/server/api/ApplicationListFirstPartyResponse);
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            GamesLog.e("GameAgent", "Unable to retrieve list of recently played games");
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "GameAgent");
            }
            if (flag)
            {
                mRecentGamesByPlayerCache.setStatusCode("played", 3);
                return mRecentGamesByPlayerCache.getData("played", null);
            } else
            {
                gamesclientcontext = (new Agents.QueryBuilder(context)).setQuerySpec(com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(clientcontext), "last_played_server_time > 0", null);
                gamesclientcontext.mSortOrder = "last_played_server_time DESC";
                gamesclientcontext.mStatusCode = 500;
                return gamesclientcontext.query();
            }
        }
        obj = ((ApplicationListFirstPartyResponse) (obj2)).getItems();
        if ((obj == null || ((ArrayList) (obj)).size() == 0) && !flag)
        {
            return DataHolder.empty(0);
        }
        (new StoreGamesProcessor(context, clientcontext, s1, false, (byte)0)).processGameList(((ArrayList) (obj)));
        if (obj2 != null && ((ApplicationListFirstPartyResponse) (obj2)).getItems() != null && ((ApplicationListFirstPartyResponse) (obj2)).getItems().size() != 0) goto _L2; else goto _L1
_L1:
        mRecentGamesByPlayerCache.enableCaching(s1);
        cacheGameData(gamesclientcontext, ((ApplicationListFirstPartyResponse) (obj2)).getItems(), ((ApplicationListFirstPartyResponse) (obj2)).getNextPageToken(), mRecentGamesByPlayerCache, "played", l1);
        return mRecentGamesByPlayerCache.getData("played", null);
_L2:
        Object obj1;
        ArrayList arraylist;
        ArrayMap arraymap;
        ArrayList arraylist1;
        com.google.android.gms.games.server.api.ApplicationFetchList applicationfetchlist;
        arraylist = ((ApplicationListFirstPartyResponse) (obj2)).getItems();
        obj1 = new ArrayList();
        arraymap = new ArrayMap();
        int j = arraylist.size();
        for (i = 0; i < j; i++)
        {
            Object obj3 = (FirstPartyApplication)arraylist.get(i);
            if (((FirstPartyApplication) (obj3)).getUnlockedAchievementCount() != null)
            {
                continue;
            }
            obj3 = ((FirstPartyApplication) (obj3)).getGamesData();
            if (obj3 != null)
            {
                obj3 = ((Application) (obj3)).getId();
                ((ArrayList) (obj1)).add(obj3);
                arraymap.put(obj3, Integer.valueOf(0));
            }
        }

        if (((ArrayList) (obj1)).size() == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        applicationfetchlist = Agents.getFetchList(((ArrayList) (obj1)));
        obj1 = null;
        i = 1;
        arraylist1 = new ArrayList();
_L4:
        if (obj1 == null && i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = mAchievementsApiInternal.getMultipleBlocking$446ccc86(clientcontext, "me", AchievementState.fromInt(0), Agents.getLocaleString(context), ((String) (obj1)), applicationfetchlist);
        arraylist1.addAll(((PlayerAchievementGetMultipleResponse) (obj1)).getItems());
        obj1 = (String)((FastMapJsonResponse) (obj1)).mValues.get("nextPageToken");
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
        VolleyError volleyerror;
        break; /* Loop/switch isn't completed */
        volleyerror;
        GamesLog.e("GameAgent", "Unable to retrieve list of achievements");
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(volleyerror, "GameAgent");
        }
        if (true) goto _L1; else goto _L5
_L5:
        int k = arraylist1.size();
        for (i = 0; i < k; i++)
        {
            String s = (String)((FastContentValuesJsonResponse) ((PlayerAchievement)arraylist1.get(i))).mValues.get("external_game_id");
            if (s != null)
            {
                arraymap.put(s, Integer.valueOf(((Integer)arraymap.get(s)).intValue() + 1));
            }
        }

        k = arraylist.size();
        i = 0;
        while (i < k) 
        {
            FirstPartyApplication firstpartyapplication = (FirstPartyApplication)arraylist.get(i);
            if (firstpartyapplication.getGamesData() != null)
            {
                int l = ((Integer)arraymap.get(firstpartyapplication.getGamesData().getId())).intValue();
                ((FastMapJsonResponse) (firstpartyapplication)).mValues.put("unlockedAchievementCount", Integer.valueOf(l));
            }
            i++;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final boolean registerGame(Context context, ClientContext clientcontext, String s, boolean flag)
    {
        for (int i = 0; i < 10; i++)
        {
            mCacheLockables[i].assertLockedByCurrentThread();
        }

        if (getExternalIdForPackage(context, clientcontext, s) != null)
        {
            return true;
        }
        Object obj1 = context.getPackageManager();
        ApplicationInfo applicationinfo;
        try
        {
            applicationinfo = ((PackageManager) (obj1)).getApplicationInfo(s, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("GameAgent", "Caller attempted to insert game data for non-existent package.", context);
            return false;
        }
        if (applicationinfo == null)
        {
            return false;
        }
        Object obj = applicationinfo.metaData;
        if (obj == null || !((Bundle) (obj)).containsKey("com.google.android.gms.games.APP_ID"))
        {
            if (flag)
            {
                GamesLog.e("GameAgent", "Using Google Play games services requires a metadata tag with the name \"com.google.android.gms.games.APP_ID\" in the application tag of your manifest");
            }
            return false;
        }
        String s1 = ((Bundle) (obj)).getString("com.google.android.gms.games.APP_ID");
        obj = (String)((PackageManager) (obj1)).getApplicationLabel(applicationinfo);
        obj1 = ((PackageManager) (obj1)).getApplicationIcon(applicationinfo);
        if (TextUtils.isEmpty(s1))
        {
            GamesLog.e("GameAgent", "Using Google Play games services requires a metadata tag with the name \"com.google.android.gms.games.APP_ID\" in the application tag of your manifest");
            return false;
        }
        if (obj == null)
        {
            GamesLog.e("GameAgent", "Your application doesn't have a name associated to it.");
            return false;
        }
        if (obj1 == null)
        {
            GamesLog.e("GameAgent", "Your application doesn't have an icon associated to it.");
            return false;
        }
        long l1 = Agents.resolveExternalGameId(context, clientcontext, s1);
        long l = l1;
        if (l1 == -1L)
        {
            byte abyte0[] = DataUtils.loadImageBytes(((BitmapDrawable)obj1).getBitmap());
            obj1 = new ContentValues();
            ((ContentValues) (obj1)).put("external_game_id", s1);
            ((ContentValues) (obj1)).put("display_name", ((String) (obj)));
            ((ContentValues) (obj1)).put("primary_category", "unknown");
            ((ContentValues) (obj1)).put("icon_image_bytes", abyte0);
            ((ContentValues) (obj1)).put("metadata_version", Integer.valueOf(0));
            ((ContentValues) (obj1)).put("metadata_sync_requested", Integer.valueOf(1));
            ((ContentValues) (obj1)).put("play_enabled_game", Integer.valueOf(1));
            ((ContentValues) (obj1)).put("availability", Integer.valueOf(0));
            android.net.Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(clientcontext);
            l = ContentUris.parseId(context.getContentResolver().insert(uri, ((ContentValues) (obj1))));
        }
        if (l == -1L)
        {
            GamesLog.e("GameAgent", (new StringBuilder("Failed to insert game record for ")).append(s1).toString());
            return false;
        } else
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("instance_game_id", Long.valueOf(l));
            contentvalues.put("instance_display_name", ((String) (obj)));
            contentvalues.put("package_name", s);
            contentvalues.put("platform_type", Integer.valueOf(0));
            obj = com.google.android.gms.games.provider.GamesContractInternal.GameInstances.getContentUri(clientcontext);
            context.getContentResolver().insert(((android.net.Uri) (obj)), contentvalues);
            updateGameInstancePackage(context, clientcontext, s, true);
            GamesSyncAdapter.requestSync$1221cb0a(clientcontext);
            return true;
        }
    }

    public final DataHolder searchForGames(GamesClientContext gamesclientcontext, String s, int i, boolean flag)
        throws GoogleAuthException
    {
        mSearchLock.assertLockedByCurrentThread();
        mSearchCache.enableCaching(gamesclientcontext.mExternalCurrentPlayerId);
        long l = DefaultClock.getInstance().currentTimeMillis();
        if (gamesclientcontext.mForceReload)
        {
            mSearchCache.clearData(s);
        }
        if (mSearchCache.hasEnoughData(s, l, i, flag))
        {
            return mSearchCache.getData(s, null);
        }
        Object obj = null;
        if (flag || mSearchCache.hasData(s, l))
        {
            obj = mSearchCache.getNextPageToken(s, l);
        }
        Object obj1 = gamesclientcontext.mContext;
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        ApplicationsApiInternal applicationsapiinternal;
        String s1;
        String s2;
        Boolean boolean1;
        Integer integer;
        Boolean boolean2;
        StringBuilder stringbuilder;
        try
        {
            applicationsapiinternal = mApplicationsApiInternal;
            s1 = Agents.getCurrentRevision();
            s2 = DeviceType.fromContext(((Context) (obj1)));
            boolean1 = Boolean.valueOf(true);
            obj1 = Agents.getLocaleString(((Context) (obj1)));
            integer = Integer.valueOf(i);
            boolean2 = Boolean.valueOf(Agents.isPlusRequired$9c10cfc());
            stringbuilder = new StringBuilder("applications/search");
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "GameAgent");
            if (mSearchCache.hasData(s, l))
            {
                mSearchCache.setStatusCode(s, 3);
            }
            return mSearchCache.getData(s, null);
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        ApplicationsApiInternal.append(stringbuilder, "clientRevision", ApplicationsApiInternal.enc(s1));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        ApplicationsApiInternal.append(stringbuilder, "deviceType", ApplicationsApiInternal.enc(s2));
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        ApplicationsApiInternal.append(stringbuilder, "filterPlayable", String.valueOf(boolean1));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        ApplicationsApiInternal.append(stringbuilder, "language", ApplicationsApiInternal.enc(((String) (obj1))));
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        ApplicationsApiInternal.append(stringbuilder, "maxResults", String.valueOf(integer));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        ApplicationsApiInternal.append(stringbuilder, "pageToken", ApplicationsApiInternal.enc(((String) (obj))));
        if (boolean2 == null)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        ApplicationsApiInternal.append(stringbuilder, "plusRequired", String.valueOf(boolean2));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        ApplicationsApiInternal.append(stringbuilder, "q", ApplicationsApiInternal.enc(s));
        obj = stringbuilder.toString();
        obj = (ApplicationSearchFirstPartyResponse)applicationsapiinternal.mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/games/server/api/ApplicationSearchFirstPartyResponse);
        cacheGameData(gamesclientcontext, ((ApplicationSearchFirstPartyResponse) (obj)).getItems(), (String)((FastMapJsonResponse) (obj)).mValues.get("nextPageToken"), mSearchCache, s, l);
        return mSearchCache.getData(s, null);
    }

    public final int setGameMuteStatus(GamesClientContext gamesclientcontext, boolean flag)
        throws GoogleAuthException
    {
        String s;
        Object obj;
        int i;
        boolean flag1;
        i = 1;
        s = gamesclientcontext.mExternalTargetGameId;
        obj = gamesclientcontext.mClientContext;
        mHiddenLock.assertLockedByCurrentThread();
        flag1 = false;
        Object obj1 = Agents.getFetchList(s);
        if (!flag) goto _L2; else goto _L1
_L1:
        mApplicationsApiInternal.mServer.performNoResponseRequestBlocking(((ClientContext) (obj)), 1, "players/me/applications/mute", obj1);
          goto _L3
_L10:
        obj1 = new ContentValues();
        ((ContentValues) (obj1)).put("muted", Integer.valueOf(i));
        obj = com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(((ClientContext) (obj)), s);
        gamesclientcontext.mContext.getContentResolver().update(((android.net.Uri) (obj)), ((ContentValues) (obj1)), null, null);
        sMutedVolleyCacheNonce.incrementAndGet();
        mCache.enableCaching(gamesclientcontext.mClientContext.getResolvedAccountName());
        mCache.clearData("hidden");
        int j = ((flag1) ? 1 : 0);
        if (gamesclientcontext.mExternalCurrentPlayerId == null) goto _L5; else goto _L4
_L4:
        mCache.enableCaching(gamesclientcontext.mExternalCurrentPlayerId);
        mCache.clearData("hidden");
        for (gamesclientcontext = mSearchCache.getCacheKeys().iterator(); gamesclientcontext.hasNext(); mSearchCache.modifyMatchingIntRowValue(obj, "external_game_id", s, "muted", i))
        {
            obj = (String)gamesclientcontext.next();
        }

          goto _L6
_L5:
        return j;
_L2:
        try
        {
            mApplicationsApiInternal.mServer.performNoResponseRequestBlocking(((ClientContext) (obj)), 1, "players/me/applications/unmute", obj1);
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "GameAgent");
            }
            j = 6;
        }
        if (true) goto _L5; else goto _L6
_L6:
        String s1;
        for (gamesclientcontext = mCache.getCacheKeys().iterator(); gamesclientcontext.hasNext(); mCache.modifyMatchingIntRowValue(s1, "external_game_id", s, "muted", i))
        {
            s1 = (String)gamesclientcontext.next();
        }

        gamesclientcontext = mRecentGamesByPlayerCache.getCacheKeys().iterator();
_L8:
        j = ((flag1) ? 1 : 0);
        if (!gamesclientcontext.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        String s2 = (String)gamesclientcontext.next();
        mRecentGamesByPlayerCache.modifyMatchingIntRowValue(s2, "external_game_id", s, "muted", i);
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L5; else goto _L3
_L3:
        if (!flag)
        {
            i = 0;
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final int submitPendingApplicationSession(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        Context context;
        ArrayList arraylist;
        Object obj;
        android.net.Uri uri;
        android.database.AbstractWindowedCursor abstractwindowedcursor;
        byte byte0;
        context = gamesclientcontext.mContext;
        gamesclientcontext = gamesclientcontext.mClientContext;
        uri = com.google.android.gms.games.provider.GamesContractInternal.ApplicationSessions.getContentUri(gamesclientcontext);
        obj = AccountUtils.getResolvedAccountName(gamesclientcontext);
        byte0 = 0;
        arraylist = new ArrayList();
        obj = (new Agents.QueryBuilder(context)).setQuerySpec(uri, "account_name=?", new String[] {
            obj
        });
        obj.mProjection = ApplicationSessionsQuery.PROJECTION;
        obj.mSortOrder = "external_game_id";
        abstractwindowedcursor = ((Agents.QueryBuilder) (obj)).queryCursor();
        obj = new ArrayMap();
_L1:
        Object obj1;
        Object obj2;
        Object obj3;
        long l;
        if (!abstractwindowedcursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_343;
        }
        l = abstractwindowedcursor.getLong(0);
        obj1 = abstractwindowedcursor.getString(3);
        obj2 = abstractwindowedcursor.getString(8);
        obj3 = abstractwindowedcursor.getString(6);
        long l1;
        long l2;
        boolean flag;
        if (abstractwindowedcursor.getInt(7) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l1 = abstractwindowedcursor.getLong(2);
        l2 = abstractwindowedcursor.getLong(5);
        if (!((Map) (obj)).containsKey(obj1))
        {
            ((Map) (obj)).put(obj1, new ApplicationSessionsFlushData(context, ((String) (obj2)), ((String) (obj3)), flag));
        }
        obj2 = (ApplicationSessionsFlushData)((Map) (obj)).get(obj1);
        obj3 = new Session(Long.valueOf(l2), Long.valueOf(l1 - l2));
        ((ApplicationSessionsFlushData) (obj2)).updateRequests.add(obj3);
        obj1 = (ApplicationSessionsFlushData)((Map) (obj)).get(obj1);
        obj2 = ContentUris.withAppendedId(uri, l);
        flag = Agents.shouldAllowYieldAtIndex(((ApplicationSessionsFlushData) (obj1)).contentProviderOperations.size());
        obj2 = ContentProviderOperation.newDelete(((android.net.Uri) (obj2))).withYieldAllowed(flag).build();
        ((ApplicationSessionsFlushData) (obj1)).contentProviderOperations.add(obj2);
          goto _L1
        gamesclientcontext;
        abstractwindowedcursor.close();
        throw gamesclientcontext;
        abstractwindowedcursor.close();
        for (Iterator iterator = ((Map) (obj)).keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            ApplicationSessionsFlushData applicationsessionsflushdata = (ApplicationSessionsFlushData)((Map) (obj)).get(s);
            if (flushPendingOp(gamesclientcontext, s, applicationsessionsflushdata))
            {
                arraylist.addAll(applicationsessionsflushdata.contentProviderOperations);
            } else
            {
                byte0 = 5;
            }
        }

        Agents.applyContentOperations(context.getContentResolver(), arraylist, "GameAgent");
        return byte0;
    }

    public final String updateGameInstancePackage(Context context, ClientContext clientcontext, String s, boolean flag)
    {
        String s1;
        for (int i = 0; i < 10; i++)
        {
            mCacheLockables[i].assertLockedByCurrentThread();
        }

        mCache.clear();
        s1 = getExternalIdForPackage(context, clientcontext, s);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        return context;
_L2:
        ContentResolver contentresolver;
        ArrayList arraylist;
        long l;
        contentresolver = context.getContentResolver();
        arraylist = new ArrayList();
        l = -1L;
        context = contentresolver.query(com.google.android.gms.games.provider.GamesContractInternal.GameInstances.getUriForExternalGameId(clientcontext, s1), InstanceQuery.PROJECTION, null, null, null);
_L5:
        String s2;
        long l1;
        do
        {
            if (!context.moveToNext())
            {
                break MISSING_BLOCK_LABEL_192;
            }
            l1 = context.getLong(0);
            s2 = context.getString(1);
            if (s.equals(s2))
            {
                arraylist.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.GameInstances.getUriForId(clientcontext, l1)).withValue("installed", Boolean.valueOf(flag)).build());
            }
        } while (l >= 0L);
        boolean flag1;
        if (context.getInt(2) > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (s.equals(s2))
        {
            flag1 = flag;
        }
        break MISSING_BLOCK_LABEL_308;
        l1 = l;
        if (l >= 0L)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        context.moveToFirst();
        l1 = context.getLong(0);
        context.close();
        if (l1 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        arraylist.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(clientcontext, s1)).withValue("target_instance", Long.valueOf(l1)).build());
        context = s1;
        if (arraylist.size() <= 0) goto _L4; else goto _L3
_L3:
        Agents.applyContentOperations(contentresolver, arraylist, "GameAgent");
        return s1;
        clientcontext;
        context.close();
        throw clientcontext;
        if (flag1)
        {
            l = l1;
        }
          goto _L5
    }

    static 
    {
        EXTENDED_GAME_DATA_SPEC = ColumnSpec.builder().withColumnsFrom(GamesDataUtils.EXTENDED_GAME_SPEC).withColumnsFrom(GamesDataUtils.SNAPSHOT_METADATA_SPEC).withColumnsFrom(GamesDataUtils.PLAYER_SPEC).build();
    }



}
