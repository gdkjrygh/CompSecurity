// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SyncResult;
import android.content.SyncStats;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Patterns;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.server.apiary.DriveApiaryServer;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GamesSharedPrefs;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.cache.AppContentSectionAndCardCache;
import com.google.android.gms.games.cache.GameCache;
import com.google.android.gms.games.cache.GameSearchCache;
import com.google.android.gms.games.cache.LeaderboardScoreCache;
import com.google.android.gms.games.cache.PlayerCache;
import com.google.android.gms.games.cache.PlayerSearchCache;
import com.google.android.gms.games.cache.ScoreCacheKey;
import com.google.android.gms.games.cache.TransientDataHolderCache;
import com.google.android.gms.games.cache.XpEventStreamCache;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.constants.AppUpdateType;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.provider.ColumnSpec;
import com.google.android.gms.games.provider.GamesContractInternal;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.server.GamesServer;
import com.google.android.gms.games.server.GamesServerFactory;
import com.google.android.gms.games.server.api.FirstPartyApplication;
import com.google.android.gms.games.server.api.InvalidId;
import com.google.android.gms.games.server.api.QuestMetadata;
import com.google.android.gms.games.server.api.Request;
import com.google.android.gms.games.server.api.RequestEntity;
import com.google.android.gms.games.server.api.RoomLeaveDiagnostics;
import com.google.android.gms.games.server.api.RoomStatus;
import com.google.android.gms.games.server.api.TurnBasedMatch;
import com.google.android.gms.games.server.api.TurnBasedMatchDataRequest;
import com.google.android.gms.games.server.api.TurnBasedMatchResults;
import com.google.android.gms.games.server.api.TurnBasedMatchTurn;
import com.google.android.gms.games.service.GamesNotificationHelper;
import com.google.android.gms.games.service.IPlayGamesBridgeService;
import com.google.android.gms.games.signin.SignInCache;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.ui.popup.LevelPopup;
import com.google.android.gms.games.util.AccountUtils;
import com.google.android.gms.games.utils.UriUtils;
import com.google.android.gms.games.video.VideoConfiguration;
import com.google.android.gms.plus.server.PlusServer;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, AccountAgent, AchievementAgent, AppContentAgent, 
//            EventAgent, GameAgent, LeaderboardAgent, NotificationAgent, 
//            PlayCommonAgent, PlayerAgent, QuestAgent, RevisionAgent, 
//            AclAgent, RequestAgent, SnapshotAgent, StatsAgent, 
//            MultiplayerAgent, RealTimeAgent, TurnBasedAgent, VideoAgent, 
//            TransientCacheOwner, InboxCounter, GamesClientContext, Agents, 
//            ApiRateLimitUtil, AppContentContext, MultiplayerUtils

public final class DataBroker extends Lockable
{

    private static final Lockable.LockableLock AGENT_SET_LOCK = new Lockable.LockableLock();
    private static DataBroker sInstance;
    public final AccountAgent mAccountAgent = (AccountAgent)addAgent(new AccountAgent(this));
    public final AchievementAgent mAchievementAgent;
    public final AclAgent mAclAgent;
    public final AppContentAgent mCardStreamAgent;
    public final EventAgent mEventAgent;
    public final GameAgent mGameAgent;
    private final BaseApiaryServer mGameSearchSuggestServer;
    private final GamesServer mGamesServer;
    public final ArrayList mInboxCounters = new ArrayList();
    private final GamesServer mInternalGamesServer;
    private final BaseApiaryServer mInternalPlusServer;
    public final LeaderboardAgent mLeaderboardAgent;
    public final MultiplayerAgent mMultiplayerAgent;
    public final NotificationAgent mNotificationAgent = (NotificationAgent)addAgent(new NotificationAgent(this));
    private final PlayCommonAgent mPlayCommonAgent = (PlayCommonAgent)addAgent(new PlayCommonAgent(this));
    public final PlayerAgent mPlayerAgent;
    private final BaseApiaryServer mPlusServer;
    public final QuestAgent mQuestAgent;
    private final RealTimeAgent mRealTimeAgent;
    public final RequestAgent mRequestAgent;
    private final RevisionAgent mRevisionAgent;
    public final SnapshotAgent mSnapshotAgent;
    private final StatsAgent mStatsAgent;
    private final ArrayList mTransientCaches = new ArrayList();
    public final TurnBasedAgent mTurnBasedAgent;
    public final VideoAgent mVideoAgent = (VideoAgent)addAgent(new VideoAgent(this));

    private DataBroker(Context context)
    {
        super("DataBroker", AGENT_SET_LOCK, null);
        Context context1 = context.getApplicationContext();
        mGamesServer = new GamesServer(context1, false, ((Boolean)G.cacheEnabled.get()).booleanValue(), ((Boolean)G.verboseVolleyLogging.get()).booleanValue(), GamesServerFactory.getTraceToken());
        mInternalGamesServer = new GamesServer(context1, true, ((Boolean)G.cacheEnabled.get()).booleanValue(), ((Boolean)G.verboseVolleyLogging.get()).booleanValue(), GamesServerFactory.getTraceToken());
        mPlusServer = PlusServer.createPlusV1Server(context1);
        mInternalPlusServer = PlusServer.createPlusV1WhitelistedServer(context1);
        mGameSearchSuggestServer = new BaseApiaryServer(context1, (String)G.baseFinskyUrl.get(), "/suggest", false, ((Boolean)G.verboseVolleyLogging.get()).booleanValue(), null, null);
        context = new DriveApiaryServer(context, (String)com.google.android.gms.drive.G.serverUrl.get(), "/drive/v2/", ((Boolean)G.cacheEnabled.get()).booleanValue(), ((Boolean)G.verboseVolleyLogging.get()).booleanValue());
        mAchievementAgent = (AchievementAgent)addAgent(new AchievementAgent(this, mGamesServer, mInternalGamesServer));
        mCardStreamAgent = (AppContentAgent)addAgent(new AppContentAgent(this, mInternalGamesServer));
        mEventAgent = (EventAgent)addAgent(new EventAgent(this, mGamesServer, mInternalGamesServer));
        mGameAgent = (GameAgent)addAgent(new GameAgent(this, mGamesServer, mInternalGamesServer, mGameSearchSuggestServer));
        mLeaderboardAgent = (LeaderboardAgent)addAgent(new LeaderboardAgent(this, mGamesServer, mInternalGamesServer));
        mPlayerAgent = (PlayerAgent)addAgent(new PlayerAgent(this, mGamesServer, mInternalGamesServer, mPlusServer, mInternalPlusServer));
        mQuestAgent = (QuestAgent)addAgent(new QuestAgent(this, mGamesServer, mInternalGamesServer, mEventAgent));
        mRevisionAgent = (RevisionAgent)addAgent(new RevisionAgent(this, mInternalGamesServer));
        mAclAgent = (AclAgent)addAgent(new AclAgent(this, mInternalGamesServer));
        mRequestAgent = (RequestAgent)addAgent(new RequestAgent(this, mInternalGamesServer));
        mSnapshotAgent = (SnapshotAgent)addAgent(new SnapshotAgent(this, mGamesServer, mInternalGamesServer, context));
        mStatsAgent = (StatsAgent)addAgent(new StatsAgent(this, mGamesServer));
        mMultiplayerAgent = (MultiplayerAgent)addAgent(new MultiplayerAgent(this, mInternalGamesServer));
        mRealTimeAgent = (RealTimeAgent)addAgent(new RealTimeAgent(this, mGamesServer, mInternalGamesServer));
        mTurnBasedAgent = (TurnBasedAgent)addAgent(new TurnBasedAgent(this, mGamesServer, mInternalGamesServer));
    }

    public static DataBroker acquireBroker(Context context)
    {
        AndroidUtils.assertMainGmsProcess();
        AGENT_SET_LOCK.lock();
        if (sInstance == null)
        {
            sInstance = new DataBroker(context);
        }
        AGENT_SET_LOCK.unlock();
        return sInstance;
        context;
        AGENT_SET_LOCK.unlock();
        throw context;
    }

    private Object addAgent(Object obj)
    {
        if (obj instanceof TransientCacheOwner)
        {
            mTransientCaches.add((TransientCacheOwner)obj);
        }
        if (obj instanceof InboxCounter)
        {
            mInboxCounters.add((InboxCounter)obj);
        }
        return obj;
    }

    private boolean areQuestNotificationsEnabled(ClientContext clientcontext)
    {
        Object obj;
        Object obj1;
        boolean flag;
        obj1 = DataHolder.empty(0);
        flag = true;
        obj = obj1;
        clientcontext = loadContactSettings(clientcontext, false);
        obj = clientcontext;
        obj1 = clientcontext;
        if (((DataHolder) (clientcontext)).mRowCount <= 0)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj = clientcontext;
        obj1 = clientcontext;
        flag = clientcontext.getBoolean("quest_notifications_enabled", 0, clientcontext.getWindowIndex(0));
        clientcontext.close();
        return flag;
        clientcontext;
        obj1 = obj;
        GamesLog.e("DataBroker", "Failed to fetch contact settings", clientcontext);
        ((DataHolder) (obj)).close();
        return true;
        clientcontext;
        ((DataHolder) (obj1)).close();
        throw clientcontext;
    }

    private void clearTransientData_locked()
    {
        super.assertAllChildrenLockedByCurrentThread();
        int i = 0;
        for (int j = mTransientCaches.size(); i < j; i++)
        {
            ((TransientCacheOwner)mTransientCaches.get(i)).clearTransientCaches();
        }

    }

    public static GamesClientContext fetchPlayerIdFromAccountWhenMissing(GamesClientContext gamesclientcontext)
    {
label0:
        {
            Object obj;
label1:
            {
                String s = gamesclientcontext.mExternalCurrentPlayerId;
                if (s != null)
                {
                    obj = gamesclientcontext;
                    if (GamesClientContext.isPlayerIdGPlusEnabled(s))
                    {
                        break label1;
                    }
                }
                obj = AccountAgent.getExternalPlayerId(gamesclientcontext.mContext, gamesclientcontext.mClientContext);
                if (obj == null)
                {
                    break label0;
                }
                gamesclientcontext = gamesclientcontext.getBuilder();
                gamesclientcontext.mExternalCurrentPlayerId = ((String) (obj));
                obj = gamesclientcontext.build();
            }
            return ((GamesClientContext) (obj));
        }
        if ("593950602418".equals(gamesclientcontext.mExternalOwningGameId))
        {
            GamesClientContext.Builder builder = gamesclientcontext.getBuilder();
            builder.mExternalCurrentPlayerId = gamesclientcontext.getNoGPlusPlayerId();
            return builder.build();
        } else
        {
            GamesLog.w("DataBroker", "No player ID found and calling context is not the dest app");
            return gamesclientcontext;
        }
    }

    private void gainXp(GamesClientContext gamesclientcontext, long l, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
        throws GoogleAuthException
    {
        DataHolder.empty(1);
        acquireLocks(new Lockable[] {
            mPlayerAgent
        });
        Object obj;
        Object obj1;
        obj1 = mPlayerAgent;
        obj = ((PlayerAgent) (obj1)).getLocalPlayer(gamesclientcontext);
        if (obj != null) goto _L2; else goto _L1
_L1:
        GamesLog.e("PlayerAgent", (new StringBuilder("Could not find player ")).append(gamesclientcontext.mExternalTargetPlayerId).toString());
        popuplocationinfo = DataHolder.empty(1);
_L3:
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        Object obj2;
        Object obj3;
        int i;
        boolean flag;
        boolean flag2;
        if (((DataHolder) (popuplocationinfo)).mStatusCode == 1501)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        i = ((DataHolder) (popuplocationinfo)).mRowCount;
        if (i == 1)
        {
            break MISSING_BLOCK_LABEL_830;
        }
        popuplocationinfo.close();
        return;
_L2:
label0:
        {
            if (((Player) (obj)).getLevelInfo() != null)
            {
                break label0;
            }
            GamesLog.w("PlayerAgent", "Trying to add XP values to a player with no level info!");
            popuplocationinfo = DataHolder.empty(1);
        }
          goto _L3
        obj3 = ((Player) (obj)).getLevelInfo();
        obj2 = new ContentValues();
        l = ((PlayerLevelInfo) (obj3)).mCurrentXpTotal + l;
        ((ContentValues) (obj2)).put("current_xp_total", Long.valueOf(l));
        flag2 = false;
        flag = flag2;
        if (l < ((PlayerLevelInfo) (obj3)).mCurrentLevel.mMaxXp)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        obj3 = ((PlayerAgent) (obj1)).getCurrentAndNextLevels(gamesclientcontext, l);
        flag = flag2;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        ((ContentValues) (obj2)).put("current_level", Integer.valueOf(((PlayerLevel)((Pair) (obj3)).first).mLevelNumber));
        ((ContentValues) (obj2)).put("current_level_min_xp", Long.valueOf(((PlayerLevel)((Pair) (obj3)).first).mMinXp));
        ((ContentValues) (obj2)).put("current_level_max_xp", Long.valueOf(((PlayerLevel)((Pair) (obj3)).first).mMaxXp));
        ((ContentValues) (obj2)).put("last_level_up_timestamp", Long.valueOf(DefaultClock.getInstance().currentTimeMillis()));
        ((ContentValues) (obj2)).put("next_level", Integer.valueOf(((PlayerLevel)((Pair) (obj3)).second).mLevelNumber));
        ((ContentValues) (obj2)).put("next_level_max_xp", Long.valueOf(((PlayerLevel)((Pair) (obj3)).second).mMaxXp));
        flag = true;
label1:
        {
            obj2 = new Pair(obj2, Boolean.valueOf(flag));
            obj3 = com.google.android.gms.games.provider.GamesContractInternal.Players.getUriForExternalPlayerId(gamesclientcontext.mClientContext, gamesclientcontext.getExternalPlayerId());
            gamesclientcontext.mContext.getContentResolver().update(((Uri) (obj3)), (ContentValues)((Pair) (obj2)).first, null, null);
            ((PlayerAgent) (obj1)).mXpStreamEventStreamCache.clear();
            if (((Boolean)((Pair) (obj2)).second).booleanValue())
            {
                break label1;
            }
            popuplocationinfo = DataHolder.empty(0);
        }
          goto _L3
        obj1 = ((PlayerAgent) (obj1)).getLocalPlayer(gamesclientcontext);
        LevelPopup.show(gamesclientcontext, popuplocationinfo, (Player)((Player) (obj)).freeze(), (Player)((Player) (obj1)).freeze());
        obj = gamesclientcontext.mContext;
        popuplocationinfo = gamesclientcontext.mExternalTargetGameId;
        if (GamesNotificationHelper.shouldAllowLevelUpNotifications(((Context) (obj))))
        {
            break MISSING_BLOCK_LABEL_514;
        }
        popuplocationinfo = null;
_L4:
        if (popuplocationinfo != null)
        {
            break MISSING_BLOCK_LABEL_601;
        }
        popuplocationinfo = DataHolder.empty(1501);
          goto _L3
        i = ((Player) (obj1)).getLevelInfo().mCurrentLevel.mLevelNumber;
        obj = ((Context) (obj)).getResources();
        popuplocationinfo = new NotificationAgent.NotificationParams(popuplocationinfo, NotificationAgent.getNewLocalNotificationId(), ((Player) (obj1)).getPlayerId(), 16, ((Resources) (obj)).getString(0x7f1001d9), ((Resources) (obj)).getString(0x7f1001da), ((Resources) (obj)).getString(0x7f1001d8, new Object[] {
            Integer.valueOf(i)
        }), PlayerAgent.LEVEL_UP_ICON_URI);
          goto _L4
        if (((NotificationAgent.NotificationParams) (popuplocationinfo)).imageUri != null)
        {
            break MISSING_BLOCK_LABEL_794;
        }
        obj = null;
_L5:
        obj1 = new ContentValues();
        ((ContentValues) (obj1)).put("notification_id", ((NotificationAgent.NotificationParams) (popuplocationinfo)).externalNotificationId);
        ((ContentValues) (obj1)).put("external_game_id", ((NotificationAgent.NotificationParams) (popuplocationinfo)).externalGameId);
        ((ContentValues) (obj1)).put("external_sub_id", ((NotificationAgent.NotificationParams) (popuplocationinfo)).externalSubId);
        ((ContentValues) (obj1)).put("type", Integer.valueOf(((NotificationAgent.NotificationParams) (popuplocationinfo)).type));
        ((ContentValues) (obj1)).put("image_uri", ((String) (obj)));
        ((ContentValues) (obj1)).put("ticker", ((NotificationAgent.NotificationParams) (popuplocationinfo)).ticker);
        ((ContentValues) (obj1)).put("title", ((NotificationAgent.NotificationParams) (popuplocationinfo)).title);
        ((ContentValues) (obj1)).put("text", ((NotificationAgent.NotificationParams) (popuplocationinfo)).text);
        ((ContentValues) (obj1)).put("coalesced_text", ((NotificationAgent.NotificationParams) (popuplocationinfo)).text);
        ((ContentValues) (obj1)).put("acknowledged", Integer.valueOf(0));
        ((ContentValues) (obj1)).put("alert_level", Integer.valueOf(1));
        popuplocationinfo = DataHolder.builder(PlayerAgent.LEVEL_UP_NOTIFICATION_SPEC.mColumnNames);
        popuplocationinfo.withRow(((ContentValues) (obj1)));
        popuplocationinfo = popuplocationinfo.build(1501);
          goto _L3
        obj = ((NotificationAgent.NotificationParams) (popuplocationinfo)).imageUri.toString();
          goto _L5
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        throw gamesclientcontext;
        Context context;
        String s;
        String s1;
        String s2;
        boolean flag1;
        context = gamesclientcontext.mContext;
        s = UriUtils.getDataStoreNameFromClientContext(gamesclientcontext.mClientContext);
        s1 = gamesclientcontext.mClientContext.getResolvedAccountName();
        s2 = gamesclientcontext.mExternalTargetGameId;
        flag1 = GamesNotificationHelper.shouldUseNewPlayerNotifications(context);
        obj1 = null;
        obj = obj1;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_902;
        }
        obj = obj1;
        if (((DataHolder) (popuplocationinfo)).mRowCount > 0)
        {
            obj = GamesNotificationHelper.getIconTeleporter(context, s, popuplocationinfo);
        }
        IPlayGamesBridgeService iplaygamesbridgeservice;
        obj1 = new BlockingServiceConnection();
        iplaygamesbridgeservice = GamesNotificationHelper.getBridgeService(context, ((BlockingServiceConnection) (obj1)));
        if (iplaygamesbridgeservice == null)
        {
            break MISSING_BLOCK_LABEL_949;
        }
        iplaygamesbridgeservice.showLevelUpNotification(s, s1, s2, popuplocationinfo, ((com.google.android.gms.common.data.BitmapTeleporter) (obj)));
        GamesNotificationHelper.silentUnbind(context, ((BlockingServiceConnection) (obj1)));
_L7:
        popuplocationinfo.close();
        acquireLocks(new Lockable[] {
            mAchievementAgent, mPlayerAgent
        });
        gamesclientcontext = gamesclientcontext.getBuilder();
        gamesclientcontext.mForceReload = true;
        gamesclientcontext.mExternalTargetPlayerId = null;
        gamesclientcontext = gamesclientcontext.build();
        mAchievementAgent.submitPendingAchievementOps(gamesclientcontext, new SyncResult());
        mPlayerAgent.fetchPlayer(gamesclientcontext, true).close();
        releaseLocks(new Lockable[] {
            mAchievementAgent, mPlayerAgent
        });
        return;
        RemoteException remoteexception;
        remoteexception;
        GamesLog.e("GamesNotificationHelper", "Remote exception from bridge service", remoteexception);
        GamesNotificationHelper.silentUnbind(context, ((BlockingServiceConnection) (obj1)));
        if (true) goto _L7; else goto _L6
_L6:
        gamesclientcontext;
        popuplocationinfo.close();
        throw gamesclientcontext;
        gamesclientcontext;
        GamesNotificationHelper.silentUnbind(context, ((BlockingServiceConnection) (obj1)));
        throw gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mAchievementAgent, mPlayerAgent
        });
        throw gamesclientcontext;
    }

    private DataHolder getCachedGame(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mGameAgent
        });
        DataHolder.empty(1);
        Object obj;
        GameAgent gameagent;
        String s1;
        gameagent = mGameAgent;
        s1 = gamesclientcontext.mExternalTargetGameId;
        gamesclientcontext = DataHolder.empty(0);
        gameagent.mCache.enableCaching(s);
        Iterator iterator = gameagent.mCache.getCacheKeys().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_105;
            }
            obj = (String)iterator.next();
            obj = gameagent.mCache.findMatchingRows(obj, "external_game_id", s1);
        } while (((DataHolder) (obj)).mRowCount <= 0);
        gamesclientcontext = ((GamesClientContext) (obj));
        if (((DataHolder) (gamesclientcontext)).mRowCount != 0)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        gameagent.mSearchCache.enableCaching(s);
        obj = gameagent.mSearchCache.getCacheKeys().iterator();
        int i;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_182;
            }
            s = (String)((Iterator) (obj)).next();
            s = gameagent.mSearchCache.findMatchingRows(s, "external_game_id", s1);
            i = ((DataHolder) (s)).mRowCount;
        } while (i <= 0);
        gamesclientcontext = s;
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        throw gamesclientcontext;
    }

    private boolean maybeUpdateGameplayAclBasedOnPublicRank(GamesClientContext gamesclientcontext, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mAclAgent
        });
        AclAgent aclagent;
        Context context;
        ClientContext clientcontext;
        int i;
        aclagent = mAclAgent;
        context = gamesclientcontext.mContext;
        clientcontext = Agents.buildFirstPartyClientContext(gamesclientcontext.mClientContext);
        gamesclientcontext = gamesclientcontext.mExternalTargetGameId;
        i = Agents.queryInt(context, com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(clientcontext, gamesclientcontext), "gameplay_acl_status", 1);
          goto _L1
_L6:
        if (!flag) goto _L3; else goto _L2
_L2:
        GamesLog.i("AclAgent", "Gameplay ACL appears to now be public, updating status...");
_L4:
        aclagent.fetchGameplayAcl(context, clientcontext, gamesclientcontext);
        flag = true;
_L5:
        releaseLocks(new Lockable[] {
            mAclAgent
        });
        return flag;
_L3:
        GamesLog.i("AclAgent", "Gameplay ACL no longer appears to be public, updating status...");
          goto _L4
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mAclAgent
        });
        throw gamesclientcontext;
_L7:
        flag = false;
          goto _L5
_L1:
        if ((!flag || i == 3) && (flag || i == 2)) goto _L7; else goto _L6
    }

    private DataHolder requeryLeaderboard(GamesClientContext gamesclientcontext, String s, DataHolder dataholder)
    {
        int i;
        i = dataholder.mStatusCode;
        dataholder.close();
        acquireLocks(new Lockable[] {
            mLeaderboardAgent
        });
        gamesclientcontext = LeaderboardAgent.getLocalLeaderboard(gamesclientcontext, s, i);
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder acceptQuest(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        int i = mEventAgent.submitPendingEventsForGame(gamesclientcontext);
        if (i != 0) goto _L2; else goto _L1
_L1:
        gamesclientcontext = mQuestAgent.acceptQuest(gamesclientcontext, s);
_L4:
        releaseLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        return gamesclientcontext;
_L2:
        gamesclientcontext = DataHolder.empty(i);
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder acceptRequests(GamesClientContext gamesclientcontext, String as[])
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mRequestAgent
        });
        DataHolder.empty(1);
        ApiRateLimitUtil.clearSyncTimestamp(mRequestAgent);
        as = new ArrayList(Arrays.asList(as));
        as = mRequestAgent.updateRequests(gamesclientcontext, as, 0, true);
        GamesNotificationHelper.setUseNewPlayerNotifications(gamesclientcontext.mContext, false);
        releaseLocks(new Lockable[] {
            mRequestAgent
        });
        return as;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mRequestAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder acceptRoomInvite(GamesClientContext gamesclientcontext, String s, ConnectionInfo connectioninfo)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        s = mRealTimeAgent.acceptInvitation(gamesclientcontext, s, connectioninfo);
        GamesNotificationHelper.setUseNewPlayerNotifications(gamesclientcontext.mContext, false);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return s;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder acceptTurnBasedInvitation(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        s = mTurnBasedAgent.acceptInvitation(gamesclientcontext, s);
        GamesNotificationHelper.setUseNewPlayerNotifications(gamesclientcontext.mContext, false);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return s;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final volatile void acquireLockOnAllChildren()
    {
        super.acquireLockOnAllChildren();
    }

    public final int addNearbyPlayer(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent.mPlayersNearbyLock
        });
        int i = mPlayerAgent.addNearbyPlayer(gamesclientcontext, s);
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersNearbyLock
        });
        return i;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersNearbyLock
        });
        throw gamesclientcontext;
    }

    public final volatile void assertAllChildrenLockedByCurrentThread()
    {
        super.assertAllChildrenLockedByCurrentThread();
    }

    public final volatile void assertLockedByCurrentThread()
    {
        super.assertLockedByCurrentThread();
    }

    public final volatile void assertNoChildrenLockedByCurrentThread()
    {
        super.assertNoChildrenLockedByCurrentThread();
    }

    public final int cancelMatch(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        TurnBasedAgent turnbasedagent;
        Context context;
        ClientContext clientcontext;
        ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        turnbasedagent = mTurnBasedAgent;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        if (!TurnBasedAgent.hasPendingOps(context, clientcontext, s)) goto _L2; else goto _L1
_L1:
        GamesLog.w(TurnBasedAgent.TAG, (new StringBuilder("Cannot cancel while pending ops are present for ")).append(s).toString());
        int i = 6507;
_L4:
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return i;
_L2:
        int j = turnbasedagent.cancelMatchInternal(context, clientcontext, s);
        i = j;
        if (j != 5) goto _L4; else goto _L3
_L3:
        TurnBasedAgent.addPendingOp(gamesclientcontext, 6, s);
        i = j;
          goto _L4
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final boolean checkRevision(Context context, ClientContext clientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mRevisionAgent
        });
        boolean flag = mRevisionAgent.checkRevision(context, clientcontext);
        releaseLocks(new Lockable[] {
            mRevisionAgent
        });
        return flag;
        context;
        releaseLocks(new Lockable[] {
            mRevisionAgent
        });
        throw context;
    }

    public final DataHolder claimMilestone(GamesClientContext gamesclientcontext, String s, String s1)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        int i = mEventAgent.submitPendingEventsForGame(gamesclientcontext);
        if (i != 0) goto _L2; else goto _L1
_L1:
        gamesclientcontext = mQuestAgent.claimMilestone(gamesclientcontext, s, s1);
_L4:
        releaseLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        return gamesclientcontext;
_L2:
        gamesclientcontext = DataHolder.empty(i);
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        throw gamesclientcontext;
    }

    public final void clearDataForLocaleChange(Context context)
    {
        Object obj;
        obj = getClientContextsForAllDatastores(context);
        super.acquireLockOnAllChildren();
        clearTransientData_locked();
        Uri uri;
        for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); context.getContentResolver().delete(uri, null, null))
        {
            uri = GamesContractInternal.getClearLocaleDataContentUri((ClientContext)((Iterator) (obj)).next());
        }

        break MISSING_BLOCK_LABEL_62;
        context;
        super.releaseLockOnAllChildren();
        throw context;
        super.releaseLockOnAllChildren();
        return;
    }

    public final void clearPendingOps(Context context, String s)
    {
        Iterator iterator = getClientContextsForAllDatastores(context).iterator();
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (ClientContext)iterator.next();
        super.acquireLockOnAllChildren();
        obj = com.google.android.gms.games.provider.GamesContractInternal.ClientContexts.getContentUri(((ClientContext) (obj)));
        context.getContentResolver().delete(((Uri) (obj)), "package_name=?", new String[] {
            s
        });
        super.releaseLockOnAllChildren();
        if (true) goto _L2; else goto _L1
        context;
        super.releaseLockOnAllChildren();
        throw context;
_L1:
    }

    public final void clearRevisionCheck(Context context)
    {
        acquireLocks(new Lockable[] {
            mRevisionAgent
        });
        RevisionAgent.clearRevisionCheck(context);
        releaseLocks(new Lockable[] {
            mRevisionAgent
        });
        return;
        context;
        releaseLocks(new Lockable[] {
            mRevisionAgent
        });
        throw context;
    }

    public final void clearTransientData()
    {
        super.acquireLockOnAllChildren();
        clearTransientData_locked();
        super.releaseLockOnAllChildren();
        return;
        Exception exception;
        exception;
        super.releaseLockOnAllChildren();
        throw exception;
    }

    public final DataHolder commitSnapshot(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient, String s, SnapshotMetadataChange snapshotmetadatachange, DriveContents drivecontents)
    {
        acquireLocks(new Lockable[] {
            mSnapshotAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        gamesclientcontext = DataHolder.empty(2);
_L4:
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        return gamesclientcontext;
_L2:
        gamesclientcontext = mSnapshotAgent.commitSnapshot(gamesclientcontext, googleapiclient, s, snapshotmetadatachange, 2, drivecontents);
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        throw gamesclientcontext;
    }

    public final volatile int compareTo(Lockable lockable)
    {
        return super.compareTo(lockable);
    }

    public final DataHolder createRoom(GamesClientContext gamesclientcontext, int i, String as[], Bundle bundle, ConnectionInfo connectioninfo)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        as = new ArrayList(Arrays.asList(as));
        gamesclientcontext = mRealTimeAgent.createRoom(gamesclientcontext, i, as, bundle, connectioninfo);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder createTurnBasedMatch$d2d5e18(GamesClientContext gamesclientcontext, int i, String as[], Bundle bundle)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        as = new ArrayList(Arrays.asList(as));
        gamesclientcontext = mTurnBasedAgent.createMatch$46a5f9fd(gamesclientcontext, i, as, bundle);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final int declineInvitation(GamesClientContext gamesclientcontext, String s, int i)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        if (i != 0) goto _L2; else goto _L1
_L1:
        i = mRealTimeAgent.declineInvitation(gamesclientcontext, s);
_L3:
        GamesNotificationHelper.setUseNewPlayerNotifications(gamesclientcontext.mContext, false);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return i;
_L2:
        TurnBasedAgent turnbasedagent;
        turnbasedagent = mTurnBasedAgent;
        if (!TurnBasedAgent.hasPendingOps(gamesclientcontext.mContext, gamesclientcontext.mClientContext, s))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        GamesLog.w(TurnBasedAgent.TAG, (new StringBuilder("Cannot decline while pending ops are present for ")).append(s).toString());
        i = 6507;
          goto _L3
        i = turnbasedagent.declineInvitationInternal(gamesclientcontext, s, true);
          goto _L3
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final int deleteSnapshot(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient, String s)
    {
        acquireLocks(new Lockable[] {
            mSnapshotAgent
        });
        Uri uri;
        DriveId driveid;
        uri = com.google.android.gms.games.provider.GamesContractInternal.Snapshots.getUriForExternalSnapshotId(gamesclientcontext.mClientContext, s);
        driveid = SnapshotAgent.getDriveId(gamesclientcontext, googleapiclient, s);
        if (driveid != null) goto _L2; else goto _L1
_L1:
        GamesLog.w("SnapshotAgent", (new StringBuilder("Could not find Drive ID for snapshot ")).append(s).toString());
        char c = '\u0FA0';
_L4:
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        return c;
_L2:
        driveid.asDriveFile().delete(googleapiclient);
        gamesclientcontext.mContext.getContentResolver().delete(uri, null, null);
        GamesPlayLogger.logSnapshotAction(gamesclientcontext.mContext, gamesclientcontext.mClientContext.mCallingPackageName, gamesclientcontext.mExternalTargetGameId, AccountUtils.getResolvedAccountName(gamesclientcontext.mClientContext), 3, s, 4, -1L);
        c = '\0';
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        throw gamesclientcontext;
    }

    public final int dismissInvitation(GamesClientContext gamesclientcontext, String s, int i)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        if (i != 0) goto _L2; else goto _L1
_L1:
        i = mRealTimeAgent.dismissInvitation(gamesclientcontext, s);
_L3:
        GamesNotificationHelper.setUseNewPlayerNotifications(gamesclientcontext.mContext, false);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return i;
_L2:
        TurnBasedAgent turnbasedagent;
        ClientContext clientcontext;
        turnbasedagent = mTurnBasedAgent;
        Context context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        if (!TurnBasedAgent.hasPendingOps(context, clientcontext, s))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        GamesLog.w(TurnBasedAgent.TAG, (new StringBuilder("Cannot dismiss while pending ops are present for invitation ")).append(s).toString());
        i = 6507;
          goto _L3
        int j = turnbasedagent.dismissInternal(gamesclientcontext, s, com.google.android.gms.games.provider.GamesContractInternal.Invitations.getUriForExternalInvitationId(clientcontext, s));
        i = j;
        if (j != 5) goto _L3; else goto _L4
_L4:
        TurnBasedAgent.addPendingOp(gamesclientcontext, 1, s);
        i = j;
          goto _L3
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final int dismissMatch(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        TurnBasedAgent turnbasedagent;
        Context context;
        ClientContext clientcontext;
        turnbasedagent = mTurnBasedAgent;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        if (!TurnBasedAgent.hasPendingOps(context, clientcontext, s)) goto _L2; else goto _L1
_L1:
        GamesLog.w(TurnBasedAgent.TAG, (new StringBuilder("Cannot dismiss while pending ops are present for match ")).append(s).toString());
        int i = 6507;
_L4:
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return i;
_L2:
        int j = turnbasedagent.dismissInternal(gamesclientcontext, s, com.google.android.gms.games.provider.GamesContractInternal.Matches.getUriForExternalMatchId(clientcontext, s));
        i = j;
        if (j != 5) goto _L4; else goto _L3
_L3:
        TurnBasedAgent.addPendingOp(gamesclientcontext, 2, s);
        i = j;
          goto _L4
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final int dismissPlayerSuggestion(GamesClientContext gamesclientcontext)
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent.mPlayersSuggestedLock
        });
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext).mExternalCurrentPlayerId;
        if (gamesclientcontext != null) goto _L2; else goto _L1
_L1:
        int i = 2;
_L4:
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersSuggestedLock
        });
        return i;
_L2:
        i = PlayerAgent.dismissPlayerSuggestion$6321ef0a();
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersSuggestedLock
        });
        throw gamesclientcontext;
    }

    public final DataHolder dismissRequests(GamesClientContext gamesclientcontext, String as[])
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mRequestAgent
        });
        DataHolder.empty(1);
        ApiRateLimitUtil.clearSyncTimestamp(mRequestAgent);
        as = new ArrayList(Arrays.asList(as));
        as = mRequestAgent.updateRequests(gamesclientcontext, as, 1, true);
        GamesNotificationHelper.setUseNewPlayerNotifications(gamesclientcontext.mContext, false);
        releaseLocks(new Lockable[] {
            mRequestAgent
        });
        return as;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mRequestAgent
        });
        throw gamesclientcontext;
    }

    public final void dump(PrintWriter printwriter)
    {
        printwriter.println("Dumping DataBroker lock data");
        super.dumpLockInfo(printwriter, "  ");
    }

    public final volatile void dumpLockInfo(PrintWriter printwriter, String s)
    {
        super.dumpLockInfo(printwriter, s);
    }

    public final DataHolder fetchNotifyAcl(Context context, ClientContext clientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mAclAgent
        });
        DataHolder.empty(1);
        context = mAclAgent.fetchNotifyAcl(context, clientcontext);
        releaseLocks(new Lockable[] {
            mAclAgent
        });
        return context;
        context;
        releaseLocks(new Lockable[] {
            mAclAgent
        });
        throw context;
    }

    public final DataHolder finishMatch(GamesClientContext gamesclientcontext, String s, byte abyte0[], ParticipantResult aparticipantresult[])
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        if (aparticipantresult != null) goto _L2; else goto _L1
_L1:
        aparticipantresult = new ArrayList();
_L5:
        TurnBasedAgent turnbasedagent;
        Context context;
        ClientContext clientcontext;
        turnbasedagent = mTurnBasedAgent;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        if (!TurnBasedAgent.hasPendingOps(context, clientcontext, s)) goto _L4; else goto _L3
_L3:
        GamesLog.w(TurnBasedAgent.TAG, (new StringBuilder("Cannot finish match while pending ops are present for match ")).append(s).toString());
        gamesclientcontext = DataHolder.empty(6507);
_L8:
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return gamesclientcontext;
_L2:
        aparticipantresult = new ArrayList(Arrays.asList(aparticipantresult));
          goto _L5
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
_L4:
        int i = TurnBasedAgent.getLocalVersion(context, clientcontext, s);
        if (i != -1) goto _L7; else goto _L6
_L6:
        GamesLog.w(TurnBasedAgent.TAG, (new StringBuilder("No local record found for match ")).append(s).toString());
        gamesclientcontext = DataHolder.empty(1);
          goto _L8
_L11:
        Object obj;
        Object obj1;
        int j;
        obj = new TurnBasedMatchResults(((TurnBasedMatchDataRequest) (obj)), Integer.valueOf(i), TurnBasedAgent.convertToWireResults(aparticipantresult));
        obj1 = turnbasedagent.finishMatchInternal(context, clientcontext, s, ((TurnBasedMatchResults) (obj)));
        j = ((Integer)((Pair) (obj1)).first).intValue();
        obj1 = (TurnBasedMatch)((Pair) (obj1)).second;
        if (obj1 == null) goto _L10; else goto _L9
_L9:
        gamesclientcontext = turnbasedagent.storeAndReturnMatch(gamesclientcontext, ((TurnBasedMatch) (obj1)), j);
          goto _L8
_L13:
        obj = new TurnBasedMatchDataRequest(Base64Utils.encodeUrlSafe(abyte0));
          goto _L11
_L10:
        if (j != 6503)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        gamesclientcontext = turnbasedagent.getConflictMatch(gamesclientcontext, s, j);
          goto _L8
        if (j == 5)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        gamesclientcontext = DataHolder.empty(j);
          goto _L8
        TurnBasedAgent.addPendingOp(gamesclientcontext, 4, s, null, false, i, ((TurnBasedMatchResults) (obj)));
        gamesclientcontext = TurnBasedAgent.updateLocalMatchStateForPendingOp(context, clientcontext, s, null, abyte0, i, true, aparticipantresult);
          goto _L8
_L7:
        if (abyte0 != null) goto _L13; else goto _L12
_L12:
        obj = null;
          goto _L11
    }

    public final void forceResolveGames(GamesClientContext gamesclientcontext, com.google.android.gms.games.service.GamesSyncAdapter.GamesSyncResult gamessyncresult)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mGameAgent
        });
        GameAgent gameagent;
        Context context;
        ContentResolver contentresolver;
        Object obj;
        Object obj1;
        ArrayList arraylist;
        gameagent = mGameAgent;
        obj = gamessyncresult.syncResult;
        context = gamesclientcontext.mContext;
        gamesclientcontext = gamesclientcontext.mClientContext;
        arraylist = new ArrayList();
        contentresolver = context.getContentResolver();
        obj1 = contentresolver.query(com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(gamesclientcontext), GameAgent.VersionQuery.PROJECTION, "metadata_version<0", null, null);
        while (((Cursor) (obj1)).moveToNext()) 
        {
            arraylist.add(((Cursor) (obj1)).getString(1));
        }
        break MISSING_BLOCK_LABEL_125;
        gamesclientcontext;
        ((Cursor) (obj1)).close();
        throw gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        throw gamesclientcontext;
        int j;
        ((Cursor) (obj1)).close();
        if (arraylist.size() == 0)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        obj = gameagent.fetchFirstPartyApplications(context, gamesclientcontext, ((SyncResult) (obj)), arraylist);
        obj1 = new ArrayList();
        j = ((GameAgent.ApplicationList) (obj)).applications.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        FirstPartyApplication firstpartyapplication = (FirstPartyApplication)((GameAgent.ApplicationList) (obj)).applications.get(i);
        gameagent.addGameOps$2e0f2217(context, gamesclientcontext, firstpartyapplication, firstpartyapplication.getGamesData(), firstpartyapplication.getMarketData(), true, true, ((ArrayList) (obj1)));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        j = ((GameAgent.ApplicationList) (obj)).invalidIds.size();
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((ArrayList) (obj1)).add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(gamesclientcontext, ((InvalidId)((GameAgent.ApplicationList) (obj)).invalidIds.get(i)).getId())).build());
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (((ArrayList) (obj1)).size() > 0)
        {
            Agents.applyContentOperations(contentresolver, ((ArrayList) (obj1)), "GameAgent");
        }
        gamessyncresult.addOp(19);
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        return;
    }

    public final DataHolder getAchievements(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mAchievementAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = mAchievementAgent.fetchAchievements(gamesclientcontext);
        releaseLocks(new Lockable[] {
            mAchievementAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mAchievementAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getAchievementsInternal(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mAchievementAgent, mPlayerAgent
        });
        DataHolder.empty(1);
        mPlayerAgent.fetchPlayer(gamesclientcontext, false).close();
        AchievementAgent achievementagent = mAchievementAgent;
        Preconditions.checkArgument(gamesclientcontext.mIsFirstParty, "The internal achievements should only be called by first party contexts.");
        gamesclientcontext = achievementagent.fetchAchievements(gamesclientcontext);
        releaseLocks(new Lockable[] {
            mAchievementAgent, mPlayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mAchievementAgent, mPlayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getAdditionalScores(GamesClientContext gamesclientcontext, LeaderboardScoreBufferHeader leaderboardscorebufferheader, int i, int j)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mLeaderboardAgent
        });
        DataHolder.empty(1);
        LeaderboardAgent leaderboardagent;
        String s;
        int k;
        int l;
        int i1;
        long l1;
        leaderboardagent = mLeaderboardAgent;
        s = leaderboardscorebufferheader.getExternalLeaderboardId();
        k = leaderboardscorebufferheader.mBundle.getInt("time_span");
        l = leaderboardscorebufferheader.mBundle.getInt("leaderboard_collection");
        i1 = leaderboardscorebufferheader.mBundle.getInt("page_type");
        l1 = leaderboardagent.resolveInstanceId(gamesclientcontext, s, k, l);
        if (l1 != -1L) goto _L2; else goto _L1
_L1:
        GamesLog.e("LeaderboardAgent", (new StringBuilder("No instance found for leaderboard ")).append(s).append(" for ").append(LeaderboardCollection.fromInt(l)).append(" and ").append(TimeSpan.fromInt(k)).toString());
        gamesclientcontext = DataHolder.empty(4);
_L3:
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        return gamesclientcontext;
_L2:
        ScoreCacheKey scorecachekey;
        long l2;
label0:
        {
            l2 = DefaultClock.getInstance().currentTimeMillis();
            scorecachekey = new ScoreCacheKey(l1, i1);
            if (leaderboardagent.mScoreCache.hasData(scorecachekey, l2))
            {
                break label0;
            }
            gamesclientcontext = leaderboardagent.getRootPage(gamesclientcontext.getWithForceReload$528fa945(), s, k, l, i, i1);
        }
          goto _L3
        leaderboardscorebufferheader = leaderboardagent.mScoreCache;
        j;
        JVM INSTR tableswitch 0 1: default 434
    //                   0 295
    //                   1 408;
           goto _L4 _L5 _L6
_L4:
        throw new IllegalStateException((new StringBuilder("Unknown page direction ")).append(j).toString());
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        throw gamesclientcontext;
_L5:
        leaderboardscorebufferheader = leaderboardscorebufferheader.getNextPageToken(scorecachekey, l2);
_L11:
        if (leaderboardscorebufferheader == null) goto _L8; else goto _L7
_L7:
        leaderboardscorebufferheader = leaderboardagent.fetchScoresFromNetwork(gamesclientcontext, s, k, l, i, i1, leaderboardscorebufferheader, Agents.getLocaleString(gamesclientcontext.mContext));
        if (leaderboardscorebufferheader == null) goto _L10; else goto _L9
_L9:
        leaderboardagent.loadCachePage(gamesclientcontext.mContext, gamesclientcontext.mClientContext, l1, i1, leaderboardscorebufferheader, j);
_L8:
        gamesclientcontext = LeaderboardScoreBufferHeader.builder().withGameId(gamesclientcontext.mExternalTargetGameId).withLeaderboardId(s).withTimeSpan(k).withLeaderboardCollection(l).withPageType(i1).build();
        gamesclientcontext = leaderboardagent.mScoreCache.getData(scorecachekey, ((LeaderboardScoreBufferHeader) (gamesclientcontext)).mBundle);
          goto _L3
_L6:
        leaderboardscorebufferheader = leaderboardscorebufferheader.getPrevPageToken(scorecachekey, l2);
          goto _L11
_L10:
        leaderboardagent.mScoreCache.setStatusCode(scorecachekey, 3);
          goto _L8
    }

    public final GamesClientContext getBackgroundGamesContext(Context context, ClientContext clientcontext)
    {
        Preconditions.checkArgument(clientcontext.isCurrentContext(), "Must be GmsCore context");
        context = new GamesClientContext.Builder(context, clientcontext);
        context.mBackground = true;
        context.mForceReload = true;
        return fetchPlayerIdFromAccountWhenMissing(context.build());
    }

    public final DataHolder getCircledPlayers(GamesClientContext gamesclientcontext, int i, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent.mPlayersCircledLock
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        gamesclientcontext = DataHolder.empty(2);
_L4:
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersCircledLock
        });
        return gamesclientcontext;
_L2:
        gamesclientcontext = mPlayerAgent.getCircledPlayers(gamesclientcontext, i, flag);
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersCircledLock
        });
        throw gamesclientcontext;
    }

    public final HashSet getClientContextsForAllDatastores(Context context)
    {
        ArrayList arraylist;
        HashSet hashset;
        int i;
        arraylist = GamesSharedPrefs.getDataStoreNames(context);
        hashset = new HashSet();
        acquireLocks(new Lockable[] {
            mAccountAgent
        });
        i = 0;
        int j = arraylist.size();
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Account account = AccountAgent.getAccount(context, (String)arraylist.get(i));
        if (account == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        hashset.add(Agents.buildFirstPartyClientContext(context, account));
        i++;
          goto _L3
_L2:
        releaseLocks(new Lockable[] {
            mAccountAgent
        });
        return hashset;
        context;
        releaseLocks(new Lockable[] {
            mAccountAgent
        });
        throw context;
    }

    public final DataHolder getConnectedPlayers$10cce170(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent.mPlayersConnectedLock
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        gamesclientcontext = DataHolder.empty(2);
_L4:
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersConnectedLock
        });
        return gamesclientcontext;
_L2:
        gamesclientcontext = mPlayerAgent.getConnectedPlayers$10cce170(gamesclientcontext);
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersConnectedLock
        });
        throw gamesclientcontext;
    }

    public final String getCurrentPlayerId(Context context, ClientContext clientcontext)
    {
        acquireLocks(new Lockable[] {
            mAccountAgent
        });
        context = AccountAgent.getExternalPlayerId(context, clientcontext);
        releaseLocks(new Lockable[] {
            mAccountAgent
        });
        return context;
        context;
        releaseLocks(new Lockable[] {
            mAccountAgent
        });
        throw context;
    }

    public final DataHolder getEvents(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mEventAgent
        });
        DataHolder.empty(1);
        int i = mEventAgent.flushAndRefreshIfNeeded(gamesclientcontext);
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.EventInstances.getUriForExternalPlayerAndGameId(gamesclientcontext);
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(uri);
        gamesclientcontext.mSortOrder = "sorting_rank";
        gamesclientcontext.mStatusCode = i;
        gamesclientcontext = gamesclientcontext.query();
        releaseLocks(new Lockable[] {
            mEventAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mEventAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getEvents(GamesClientContext gamesclientcontext, String as[])
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mEventAgent
        });
        DataHolder.empty(1);
        int i = mEventAgent.flushAndRefreshIfNeeded(gamesclientcontext);
        QuerySpec queryspec = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.EventInstances.getUriForExternalPlayerAndGameId(gamesclientcontext));
        queryspec.addWhereIn("external_event_id", as);
        gamesclientcontext = new Agents.QueryBuilder(gamesclientcontext);
        gamesclientcontext.mQuery = queryspec;
        gamesclientcontext.mSortOrder = "sorting_rank";
        gamesclientcontext.mStatusCode = i;
        gamesclientcontext = gamesclientcontext.query();
        releaseLocks(new Lockable[] {
            mEventAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mEventAgent
        });
        throw gamesclientcontext;
    }

    public final Set getExperiments(GamesClientContext gamesclientcontext)
    {
        acquireLocks(new Lockable[] {
            mPlayCommonAgent
        });
        new HashSet();
        gamesclientcontext = PlayCommonAgent.getExperimentIds(gamesclientcontext);
        releaseLocks(new Lockable[] {
            mPlayCommonAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayCommonAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getExtendedGame(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mGameAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        gamesclientcontext = mGameAgent.getExtendedGame(gamesclientcontext);
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getFirstPartyInvitablePlayers(GamesClientContext gamesclientcontext, int i, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent.mPlayersCircledLock
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        gamesclientcontext = DataHolder.empty(2);
_L4:
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersCircledLock
        });
        return gamesclientcontext;
_L2:
        gamesclientcontext = mPlayerAgent.getCircledPlayers(gamesclientcontext, i, flag);
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersCircledLock
        });
        throw gamesclientcontext;
    }

    public final DataHolder getFirstPartyPlayers(GamesClientContext gamesclientcontext, String s, int i, boolean flag)
        throws GoogleAuthException
    {
        Lockable lockable;
        lockable = mPlayerAgent.getLockableForPlayersCollection(gamesclientcontext, s);
        acquireLocks(new Lockable[] {
            lockable
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        gamesclientcontext = DataHolder.empty(2);
_L3:
        releaseLocks(new Lockable[] {
            lockable
        });
        return gamesclientcontext;
_L2:
        PlayerAgent playeragent;
        playeragent = mPlayerAgent;
        playeragent.getLockableForPlayersCollection(gamesclientcontext, s).assertLockedByCurrentThread();
        String s1;
        long l;
        boolean flag1;
        if (s.equals("played_with") || s.equals("circled") || s.equals("you_may_know") || s.equals("nearby"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
label0:
        {
            Asserts.checkState(flag1);
            s1 = PlayerCache.getCacheKeyForFirstPartyCollection(gamesclientcontext.mExternalTargetGameId, s);
            if (!s.equals("nearby"))
            {
                break MISSING_BLOCK_LABEL_203;
            }
            playeragent.mNearbyCache.enableCaching(gamesclientcontext.mExternalCurrentPlayerId);
            l = DefaultClock.getInstance().currentTimeMillis();
            if (!playeragent.mNearbyCache.hasData(s1, l))
            {
                break label0;
            }
            gamesclientcontext = playeragent.mNearbyCache.getData(s1, null);
        }
          goto _L3
        gamesclientcontext = DataHolder.empty(0);
          goto _L3
        gamesclientcontext = playeragent.loadPlayerData$2fcfbbfc(gamesclientcontext, s1, s, i, flag);
          goto _L3
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            lockable
        });
        throw gamesclientcontext;
    }

    public final GamesClientContext getForegroundGamesContext$1ae37e10(Context context, ClientContext clientcontext, String s)
    {
        context = new GamesClientContext.Builder(context, clientcontext);
        context.mForceReload = true;
        if (!TextUtils.isEmpty(s))
        {
            context.mExternalTargetGameId = s;
            if (!clientcontext.isCurrentContext())
            {
                context.mExternalOwningGameId = s;
            }
        }
        return fetchPlayerIdFromAccountWhenMissing(context.build());
    }

    public final DataHolder getGame(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mGameAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = mGameAgent.getGame(gamesclientcontext, s);
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getGameInstances(GamesClientContext gamesclientcontext)
    {
        acquireLocks(new Lockable[] {
            mGameAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = GameAgent.getGameInstances(gamesclientcontext);
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getGameplayAcl(Context context, ClientContext clientcontext, String s)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mAclAgent
        });
        DataHolder.empty(1);
        context = mAclAgent.fetchGameplayAcl(context, clientcontext, s);
        releaseLocks(new Lockable[] {
            mAclAgent
        });
        return context;
        context;
        releaseLocks(new Lockable[] {
            mAclAgent
        });
        throw context;
    }

    public final int getInboxCounts(GamesClientContext gamesclientcontext, Bundle bundle)
    {
        GamesClientContext gamesclientcontext1;
        int i;
        int k;
        boolean flag;
        gamesclientcontext1 = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        if (gamesclientcontext1.mExternalCurrentPlayerId == null)
        {
            return 1;
        }
        flag = false;
        i = 0;
        k = mInboxCounters.size();
_L2:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        gamesclientcontext = (InboxCounter)mInboxCounters.get(i);
        acquireLocks(new Lockable[] {
            gamesclientcontext.getLockable()
        });
        boolean flag1;
        String s = gamesclientcontext.getActivityKey();
        bundle.putInt(s, gamesclientcontext.getInboxCount(gamesclientcontext1) + bundle.getInt(s, 0));
        flag1 = gamesclientcontext.hasInboxCountChanged();
        flag |= flag1;
        releaseLocks(new Lockable[] {
            gamesclientcontext.getLockable()
        });
        i++;
        if (true) goto _L2; else goto _L1
        bundle;
        releaseLocks(new Lockable[] {
            gamesclientcontext.getLockable()
        });
        throw bundle;
_L1:
        int j = 0;
        for (gamesclientcontext = bundle.keySet().iterator(); gamesclientcontext.hasNext();)
        {
            j += bundle.getInt((String)gamesclientcontext.next(), 0);
        }

        bundle.putInt("inbox_total_count", j);
        bundle.putBoolean("inbox_has_new_activity", flag);
        return 0;
    }

    public final DataHolder getInvitablePlayers(GamesClientContext gamesclientcontext, int i, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent.mPlayersVisibleLock
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        gamesclientcontext = DataHolder.empty(2);
_L4:
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersVisibleLock
        });
        return gamesclientcontext;
_L2:
        PlayerAgent playeragent = mPlayerAgent;
        boolean flag1;
        if (!gamesclientcontext.mIsFirstParty)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Asserts.checkState(flag1, "Calling visible from 1P context!");
        playeragent.mPlayersVisibleLock.assertLockedByCurrentThread();
        PlayerCache.getCacheKeyForCirclesVisibleToGame(gamesclientcontext.mClientContext);
        PlayerAgent.loadSyncedVisiblePeople$4bafd57d();
        gamesclientcontext = playeragent.loadPlayerData$2fcfbbfc(gamesclientcontext, PlayerCache.getCacheKeyForCirclesVisibleToGame(gamesclientcontext.mClientContext), "visible", i, flag);
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersVisibleLock
        });
        throw gamesclientcontext;
    }

    public final DataHolder getInvitation(GamesClientContext gamesclientcontext, String s)
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = MultiplayerAgent.getLocalInvitation(gamesclientcontext, s);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getInvitations(GamesClientContext gamesclientcontext, int i, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent, mNotificationAgent
        });
        DataHolder.empty(1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        NotificationAgent.notificationOpened(gamesclientcontext.mContext, gamesclientcontext.mClientContext);
        gamesclientcontext = MultiplayerAgent.getLocalInvitations(gamesclientcontext, i, mMultiplayerAgent.syncEntities(gamesclientcontext));
        releaseLocks(new Lockable[] {
            mMultiplayerAgent, mNotificationAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent, mNotificationAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getLeaderboard(GamesClientContext gamesclientcontext, String s, boolean flag)
        throws GoogleAuthException
    {
        int i;
        i = 0;
        acquireLocks(new Lockable[] {
            mLeaderboardAgent
        });
        DataHolder.empty(1);
        DataHolder dataholder = mLeaderboardAgent.getLeaderboard(gamesclientcontext, s, flag);
        DataHolder dataholder1;
        boolean flag1;
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        dataholder1 = dataholder;
        if (dataholder.mRowCount <= 0)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        flag1 = false;
        boolean flag3;
        for (flag = false; i < dataholder.mRowCount; flag = flag3)
        {
            int j = dataholder.getWindowIndex(i);
            boolean flag2 = flag1;
            flag3 = flag;
            if (dataholder.getInteger("collection", i, j) == 0)
            {
                if (!dataholder.hasNull("player_rank", i, j))
                {
                    flag = true;
                }
                flag2 = flag1;
                flag3 = flag;
                if (!dataholder.hasNull("player_raw_score", i, j))
                {
                    flag2 = true;
                    flag3 = flag;
                }
            }
            i++;
            flag1 = flag2;
        }

        break MISSING_BLOCK_LABEL_184;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        throw gamesclientcontext;
        dataholder1 = dataholder;
        if (flag1)
        {
            GamesLog.d("DataBroker", "User has public score, checking gameplay ACL status...");
            dataholder1 = dataholder;
            if (maybeUpdateGameplayAclBasedOnPublicRank(gamesclientcontext, flag))
            {
                dataholder1 = requeryLeaderboard(gamesclientcontext, s, dataholder);
            }
        }
        return dataholder1;
    }

    public final DataHolder getLeaderboards(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mLeaderboardAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = mLeaderboardAgent.getLeaderboards(gamesclientcontext);
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getLocalInvitations(GamesClientContext gamesclientcontext, int i, int j)
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = MultiplayerAgent.getLocalInvitations(gamesclientcontext, i, j);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getLocalRequestSummaries(GamesClientContext gamesclientcontext, int i, int j)
    {
        acquireLocks(new Lockable[] {
            mRequestAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = RequestAgent.getLocalRequestSummaries(gamesclientcontext, i, j);
        releaseLocks(new Lockable[] {
            mRequestAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mRequestAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getLocalRequests(GamesClientContext gamesclientcontext, int i, int j, int k, int l)
    {
        acquireLocks(new Lockable[] {
            mRequestAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = RequestAgent.getLocalRequests(gamesclientcontext, i, j, k, l);
        releaseLocks(new Lockable[] {
            mRequestAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mRequestAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getLocalTurnBasedMatches(GamesClientContext gamesclientcontext, int i, int j)
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = TurnBasedAgent.getLocalMatches(gamesclientcontext, i, j);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getNotifications(Context context, String s)
    {
        acquireLocks(new Lockable[] {
            mNotificationAgent
        });
        DataHolder.empty(1);
        context = NotificationAgent.getNotifications(context, s);
        releaseLocks(new Lockable[] {
            mNotificationAgent
        });
        return context;
        context;
        releaseLocks(new Lockable[] {
            mNotificationAgent
        });
        throw context;
    }

    public final DataHolder getPlayer(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = mPlayerAgent.fetchPlayer(gamesclientcontext, false);
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getPlayerCenteredPage(GamesClientContext gamesclientcontext, String s, int i, int j, int k)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mLeaderboardAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = mLeaderboardAgent.getRootPage(gamesclientcontext, s, i, j, k, 1);
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getPlayerScore(GamesClientContext gamesclientcontext, String s, int i, int j)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mLeaderboardAgent
        });
        DataHolder.empty(1);
        if (gamesclientcontext.mExternalCurrentPlayerId == null) goto _L2; else goto _L1
_L1:
        gamesclientcontext = mLeaderboardAgent.getPlayerScore(gamesclientcontext, s, i, j);
_L4:
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        return gamesclientcontext;
_L2:
        gamesclientcontext = DataHolder.empty(2);
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getPlayers(GamesClientContext gamesclientcontext, String s, int i, boolean flag)
        throws GoogleAuthException
    {
        Lockable lockable;
        lockable = mPlayerAgent.getLockableForPlayersCollection(gamesclientcontext, s);
        acquireLocks(new Lockable[] {
            lockable
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        gamesclientcontext = DataHolder.empty(2);
_L4:
        releaseLocks(new Lockable[] {
            lockable
        });
        return gamesclientcontext;
_L2:
        PlayerAgent playeragent = mPlayerAgent;
        ClientContext clientcontext;
        boolean flag1;
        if (!gamesclientcontext.mIsFirstParty)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Asserts.checkState(flag1, "Calling getPlayedWithPlayers from 1P context!");
        playeragent.getLockableForPlayersCollection(gamesclientcontext, s).assertLockedByCurrentThread();
        Asserts.checkState(s.equals("played_with"));
        clientcontext = gamesclientcontext.mClientContext;
        gamesclientcontext = playeragent.loadPlayerData$2fcfbbfc(gamesclientcontext, (new StringBuilder("players:")).append(s).append(':').append(clientcontext.mCallingPackageName).toString(), s, i, flag);
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            lockable
        });
        throw gamesclientcontext;
    }

    public final DataHolder getPlayersArray(GamesClientContext gamesclientcontext, String as[])
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = mPlayerAgent.getPlayersArray(gamesclientcontext, as);
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getRoom(Context context, ClientContext clientcontext, String s)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        context = mRealTimeAgent.getRoom(context, clientcontext, s);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return context;
        context;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw context;
    }

    public final DataHolder getSnapshotMetadataById(Context context, ClientContext clientcontext, String s)
    {
        acquireLocks(new Lockable[] {
            mSnapshotAgent
        });
        DataHolder.empty(1);
        context = SnapshotAgent.getSnapshotMetadataById(context, clientcontext, s);
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        return context;
        context;
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        throw context;
    }

    public final com.google.android.gms.games.service.GamesSyncAdapter.GamesSystemStats getSystemStats(GamesClientContext gamesclientcontext)
    {
        com.google.android.gms.games.service.GamesSyncAdapter.GamesSystemStats gamessystemstats;
        gamessystemstats = new com.google.android.gms.games.service.GamesSyncAdapter.GamesSystemStats();
        acquireLocks(new Lockable[] {
            mGameAgent
        });
        Context context = gamesclientcontext.mContext;
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        gamessystemstats.numInstalledGames = GameAgent.countInstalledGames(gamesclientcontext);
        gamessystemstats.numSignedInGames = SignInCache.countSignedInGames(context, clientcontext);
        gamessystemstats.lastPlayedTimestampMillis = GameAgent.getMostRecentConnectionTime(context, clientcontext);
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        return gamessystemstats;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getTopScoresPage(GamesClientContext gamesclientcontext, String s, int i, int j, int k)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mLeaderboardAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = mLeaderboardAgent.getRootPage(gamesclientcontext, s, i, j, k, 0);
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder getTurnBasedMatch(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        int i = mMultiplayerAgent.syncEntities(gamesclientcontext);
        gamesclientcontext = TurnBasedAgent.getLocalMatch(gamesclientcontext.mContext, gamesclientcontext.mClientContext, s, i);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final boolean hasExpiringQuests(GamesClientContext gamesclientcontext, long l)
    {
        if (!areQuestNotificationsEnabled(gamesclientcontext.mClientContext))
        {
            return false;
        }
        acquireLocks(new Lockable[] {
            mQuestAgent
        });
        boolean flag = QuestAgent.hasExpiringQuests(gamesclientcontext, l);
        releaseLocks(new Lockable[] {
            mQuestAgent
        });
        return flag;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mQuestAgent
        });
        throw gamesclientcontext;
    }

    public final boolean hasRecentGameActivity(Context context, ClientContext clientcontext)
    {
        acquireLocks(new Lockable[] {
            mGameAgent
        });
        long l;
        long l1;
        l = GameAgent.getMostRecentConnectionTime(context, clientcontext);
        l1 = System.currentTimeMillis();
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        long l2 = ((Long)G.mostRecentConnectionThresholdMillis.get()).longValue();
        if (l1 - l > l2) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        context;
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        throw context;
    }

    public final int incrementAchievement(GamesClientContext gamesclientcontext, String s, int i, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mAchievementAgent
        });
        s = mAchievementAgent.incrementAchievement(gamesclientcontext, s, i, popuplocationinfo, flag);
        releaseLocks(new Lockable[] {
            mAchievementAgent
        });
        if (((AchievementAgent.AchievementUpdateResult) (s)).xpGained > 0L)
        {
            gainXp(gamesclientcontext, ((AchievementAgent.AchievementUpdateResult) (s)).xpGained, popuplocationinfo);
        }
        return ((AchievementAgent.AchievementUpdateResult) (s)).statusCode;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mAchievementAgent
        });
        throw gamesclientcontext;
    }

    public final int incrementEvents(GamesClientContext gamesclientcontext, ArrayList arraylist)
    {
        acquireLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        ClientContext clientcontext;
        String s;
        Object obj;
        Object obj1;
        ArrayList arraylist1;
        int j;
        j = mEventAgent.incrementEvents(gamesclientcontext, arraylist);
        arraylist = mQuestAgent;
        arraylist = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        s = gamesclientcontext.mExternalTargetGameId;
        obj = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.QuestsEntities.getUriForExternalGameId(clientcontext, s));
        ((QuerySpec) (obj)).addWhere("quest_state", Integer.toString(3));
        ((QuerySpec) (obj)).addWhere("milestone_state", Integer.toString(2));
        obj1 = new Agents.QueryBuilder(arraylist);
        obj1.mQuery = ((QuerySpec) (obj));
        obj1.mProjection = QuestAgent.CompletedQuestsQuery.PROJECTION;
        obj = ((Agents.QueryBuilder) (obj1)).queryCursor();
        obj1 = new ArrayList();
        arraylist1 = new ArrayList();
        do
        {
            if (!((Cursor) (obj)).moveToNext())
            {
                break;
            }
            long l = ((Cursor) (obj)).getLong(3);
            if (((Cursor) (obj)).getLong(4) - l >= ((Cursor) (obj)).getLong(5))
            {
                ((ArrayList) (obj1)).add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Quests.getUriForId(clientcontext, ((Cursor) (obj)).getLong(0))).withValue("quest_state", Integer.valueOf(4)).withValue("quest_last_updated_ts", Long.valueOf(DefaultClock.getInstance().currentTimeMillis())).build());
                ((ArrayList) (obj1)).add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Milestones.getUriForId(clientcontext, ((Cursor) (obj)).getLong(1))).withValue("milestone_state", Integer.valueOf(3)).build());
                arraylist1.add(((Cursor) (obj)).getString(2));
            }
        } while (true);
          goto _L1
        gamesclientcontext;
        ((Cursor) (obj)).close();
        throw gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        throw gamesclientcontext;
_L1:
        int k;
        ((Cursor) (obj)).close();
        if (!((ArrayList) (obj1)).isEmpty())
        {
            Agents.applyContentOperations(arraylist.getContentResolver(), ((ArrayList) (obj1)), "QuestAgent");
        }
        k = arraylist1.size();
        int i = 0;
_L3:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        QuestAgent.notifyListeners(gamesclientcontext, s, (String)arraylist1.get(i), true);
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        releaseLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        return j;
    }

    public final DataHolder isGameMuted(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mGameAgent.mHiddenLock
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        gamesclientcontext = DataHolder.empty(2);
_L4:
        releaseLocks(new Lockable[] {
            mGameAgent.mHiddenLock
        });
        return gamesclientcontext;
_L2:
        gamesclientcontext = mGameAgent.isGameMuted(gamesclientcontext);
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent.mHiddenLock
        });
        throw gamesclientcontext;
    }

    public final volatile boolean isLockedByCurrentThread()
    {
        return super.isLockedByCurrentThread();
    }

    public final int launchGameForRecording(GamesClientContext gamesclientcontext, String s, VideoConfiguration videoconfiguration, boolean flag)
        throws GoogleAuthException
    {
        Object obj;
        Game game;
        Object obj1;
        int i;
        int j;
        if (s.equals(gamesclientcontext.mExternalTargetGameId))
        {
            String s1 = gamesclientcontext.mExternalCurrentPlayerId;
            obj = s1;
            if (s1 == null)
            {
                GamesLog.v("DataBroker", "launchGameForRecording external player id is null");
                obj = gamesclientcontext.mClientContext.getResolvedAccountName();
            }
            obj = getCachedGame(gamesclientcontext, ((String) (obj)));
        } else
        {
            obj = getGame(gamesclientcontext, s);
        }
        obj1 = null;
        j = ((DataHolder) (obj)).mStatusCode;
        game = obj1;
        i = j;
        if (j != 0) goto _L2; else goto _L1
_L1:
        i = ((DataHolder) (obj)).mRowCount;
        if (i != 1) goto _L4; else goto _L3
_L3:
        game = (Game)(new GameBuffer(((DataHolder) (obj)))).get(0).freeze();
        i = j;
_L2:
        ((DataHolder) (obj)).close();
        j = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        acquireLocks(new Lockable[] {
            mVideoAgent
        });
        j = mVideoAgent.launchGameForRecording(gamesclientcontext, s, videoconfiguration, game, flag);
        releaseLocks(new Lockable[] {
            mVideoAgent
        });
        return j;
_L4:
        GamesLog.e("DataBroker", (new StringBuilder("Unexpected game count: ")).append(i).toString());
        i = 1;
        game = obj1;
          goto _L2
        gamesclientcontext;
        ((DataHolder) (obj)).close();
        throw gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mVideoAgent
        });
        throw gamesclientcontext;
    }

    public final int leaveRoom(Context context, ClientContext clientcontext, String s, String s1, RoomLeaveDiagnostics roomleavediagnostics)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        int i;
        ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        i = mRealTimeAgent.leaveRoom(context, clientcontext, s, s1, roomleavediagnostics);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return i;
        context;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw context;
    }

    public final DataHolder leaveTurnBasedMatch(GamesClientContext gamesclientcontext, String s, boolean flag, String s1)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        TurnBasedAgent turnbasedagent;
        Context context;
        ClientContext clientcontext;
        ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        turnbasedagent = mTurnBasedAgent;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        if (!TurnBasedAgent.hasPendingOps(context, clientcontext, s)) goto _L2; else goto _L1
_L1:
        GamesLog.w(TurnBasedAgent.TAG, (new StringBuilder("Cannot leave while pending ops are present for ")).append(s).toString());
        gamesclientcontext = DataHolder.empty(6507);
_L3:
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return gamesclientcontext;
_L2:
        int i = TurnBasedAgent.getLocalVersion(context, clientcontext, s);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        GamesLog.w(TurnBasedAgent.TAG, (new StringBuilder("No local record found for match ")).append(s).toString());
        gamesclientcontext = DataHolder.empty(1);
          goto _L3
        int j = turnbasedagent.leaveMatchInternal(gamesclientcontext, s, i, flag, s1);
        if (j != 5)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        TurnBasedAgent.addPendingOp(gamesclientcontext, 5, s, s1, flag, i, null);
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(com.google.android.gms.games.provider.GamesContractInternal.MatchEntities.getUriForExternalMatchId(clientcontext, s));
        gamesclientcontext.mStatusCode = j;
        gamesclientcontext = gamesclientcontext.query();
          goto _L3
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder listVideos(GamesClientContext gamesclientcontext)
    {
        acquireLocks(new Lockable[] {
            mVideoAgent
        });
        gamesclientcontext = mVideoAgent.listVideos(gamesclientcontext);
        releaseLocks(new Lockable[] {
            mVideoAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mVideoAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder[] loadCardStream(GamesClientContext gamesclientcontext, AppContentContext appcontentcontext)
        throws GoogleAuthException
    {
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        acquireLocks(new Lockable[] {
            mCardStreamAgent
        });
        AppContentAgent appcontentagent;
        String s;
        long l;
        appcontentagent = mCardStreamAgent;
        s = appcontentcontext.screenName;
        l = DefaultClock.getInstance().elapsedRealtime();
        appcontentagent.enableCaches(gamesclientcontext.mExternalCurrentPlayerId);
        if (gamesclientcontext.mForceReload)
        {
            appcontentagent.mCardStreamCache.clearData(s);
        }
        if (!appcontentagent.mCardStreamCache.hasData(s, l)) goto _L2; else goto _L1
_L1:
        gamesclientcontext = appcontentagent.buildResponseFromCache(gamesclientcontext, s);
_L4:
        releaseLocks(new Lockable[] {
            mCardStreamAgent
        });
        Preconditions.checkNotNull(gamesclientcontext);
        return gamesclientcontext;
_L2:
        gamesclientcontext = appcontentagent.loadCardStream$3489344c(gamesclientcontext, appcontentcontext, l);
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mCardStreamAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder loadCommonGames(GamesClientContext gamesclientcontext, int i, boolean flag)
        throws GoogleAuthException
    {
        DataHolder.empty(1);
        acquireLocks(new Lockable[] {
            mGameAgent.mCompareCommonLock
        });
        GameAgent gameagent = mGameAgent;
        gameagent.mCompareCommonLock.assertLockedByCurrentThread();
        gamesclientcontext = gameagent.loadCommonOrDisjointGames(gamesclientcontext, "common", i, flag);
        releaseLocks(new Lockable[] {
            mGameAgent.mCompareCommonLock
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent.mCompareCommonLock
        });
        throw gamesclientcontext;
    }

    public final DataHolder loadContactSettings(ClientContext clientcontext, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent
        });
        DataHolder.empty(1);
        clientcontext = mPlayerAgent.loadContactSettings(clientcontext, flag);
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        return clientcontext;
        clientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        throw clientcontext;
    }

    public final DataHolder loadDisjointGames(GamesClientContext gamesclientcontext, int i, boolean flag)
        throws GoogleAuthException
    {
        DataHolder.empty(1);
        acquireLocks(new Lockable[] {
            mGameAgent.mCompareDisjointLock
        });
        GameAgent gameagent = mGameAgent;
        gameagent.mCompareDisjointLock.assertLockedByCurrentThread();
        gamesclientcontext = gameagent.loadCommonOrDisjointGames(gamesclientcontext, "disjoint", i, flag);
        releaseLocks(new Lockable[] {
            mGameAgent.mCompareDisjointLock
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent.mCompareDisjointLock
        });
        throw gamesclientcontext;
    }

    public final DataHolder loadGameCollection(GamesClientContext gamesclientcontext, int i, int j, boolean flag)
        throws GoogleAuthException
    {
        Lockable lockable;
        lockable = mGameAgent.getLockableForCollection(j);
        acquireLocks(new Lockable[] {
            lockable
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        gamesclientcontext = mGameAgent.loadGameCollection(gamesclientcontext, i, j, flag);
        releaseLocks(new Lockable[] {
            lockable
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            lockable
        });
        throw gamesclientcontext;
    }

    public final DataHolder loadGameSearchSuggestions(Context context, ClientContext clientcontext, String s)
    {
        acquireLocks(new Lockable[] {
            mGameAgent.mSearchSuggestionLock
        });
        DataHolder.empty(1);
        context = mGameAgent.loadGameSearchSuggestions(context, clientcontext, s);
        releaseLocks(new Lockable[] {
            mGameAgent.mSearchSuggestionLock
        });
        return context;
        context;
        releaseLocks(new Lockable[] {
            mGameAgent.mSearchSuggestionLock
        });
        throw context;
    }

    public final DataHolder loadMorePlayerXpStream(GamesClientContext gamesclientcontext, int i)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = mPlayerAgent.loadMoreXpStream(gamesclientcontext, i);
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder loadPlayerStats(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mStatsAgent
        });
        gamesclientcontext = mStatsAgent.loadPlayerStats(gamesclientcontext);
        releaseLocks(new Lockable[] {
            mStatsAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mStatsAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder loadPlayerXpForGameCategories(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = mPlayerAgent.loadPlayerXpForGameCategories(gamesclientcontext);
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder loadPlayerXpStream(GamesClientContext gamesclientcontext, int i)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = mPlayerAgent.loadXpStream(gamesclientcontext, i);
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder loadProfileSettings(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        gamesclientcontext = mPlayerAgent.loadProfileSettings(gamesclientcontext);
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder loadQuests1P(GamesClientContext gamesclientcontext, int ai[], int i, String as[])
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        int j = mEventAgent.sendPendingOps(gamesclientcontext);
        if (j != 0) goto _L2; else goto _L1
_L1:
        QuestAgent questagent;
        questagent = mQuestAgent;
        Preconditions.checkArgument(gamesclientcontext.mIsFirstParty, "Attempting to access a 1P API using a 3P Context");
        if (!gamesclientcontext.hasTargetGameId()) goto _L4; else goto _L3
_L3:
        j = questagent.listQuests(gamesclientcontext);
_L10:
        if (QuestAgent.shouldQueryForQuests(j)) goto _L6; else goto _L5
_L5:
        gamesclientcontext = DataHolder.empty(j);
_L11:
        releaseLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        return gamesclientcontext;
_L4:
        if (!ApiRateLimitUtil.isSyncRateLimited(questagent, ((Long)G.tickleSyncThresholdMillis.get()).longValue(), gamesclientcontext.mForceReload)) goto _L8; else goto _L7
_L7:
        GamesLog.i("QuestAgent", "Returning cached entities for quest");
          goto _L9
_L8:
        QuestAgent.SyncNetworkResponse syncnetworkresponse;
label0:
        {
            syncnetworkresponse = questagent.syncQuestsFromNetwork(gamesclientcontext, Agents.getSyncToken(gamesclientcontext.mContext, gamesclientcontext.mClientContext, QuestAgent.SYNC_QUEST_TOKEN_PROJECTION));
            GamesLog.d("QuestAgent", String.format("Received %s quest entities during sync", new Object[] {
                Integer.valueOf(syncnetworkresponse.mData.size())
            }));
            if (syncnetworkresponse.mStatusCode == 0)
            {
                break label0;
            }
            j = syncnetworkresponse.mStatusCode;
        }
          goto _L10
        if (questagent.storeQuestEntities(gamesclientcontext, syncnetworkresponse, false))
        {
            ApiRateLimitUtil.updateSyncTimestamp(questagent);
        }
          goto _L9
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        throw gamesclientcontext;
_L6:
        gamesclientcontext = QuestAgent.getStateFilteredQuestsDataHolder(gamesclientcontext, ai, i, as, j);
          goto _L11
_L12:
        gamesclientcontext = QuestAgent.getStateFilteredQuestsDataHolder(gamesclientcontext, ai, i, as, 3);
          goto _L11
_L13:
        gamesclientcontext = DataHolder.empty(j);
          goto _L11
_L9:
        j = 0;
          goto _L10
_L2:
        if (j != 3 && j != 6) goto _L13; else goto _L12
    }

    public final DataHolder loadQuests3P(GamesClientContext gamesclientcontext, int ai[], int i, String as[])
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        int j = mEventAgent.submitPendingEventsForGame(gamesclientcontext);
        if (j != 0) goto _L2; else goto _L1
_L1:
        QuestAgent questagent = mQuestAgent;
        boolean flag;
        if (!gamesclientcontext.mIsFirstParty)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Attempting to access a 3P API using a 1P Context");
        j = questagent.listQuests(gamesclientcontext);
        if (QuestAgent.shouldQueryForQuests(j)) goto _L4; else goto _L3
_L3:
        gamesclientcontext = DataHolder.empty(j);
_L5:
        releaseLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        return gamesclientcontext;
_L4:
        gamesclientcontext = QuestAgent.getStateFilteredQuestsDataHolder(gamesclientcontext, ai, i, as, j);
          goto _L5
_L6:
        gamesclientcontext = QuestAgent.getStateFilteredQuestsDataHolder(gamesclientcontext, ai, i, as, 3);
          goto _L5
_L7:
        gamesclientcontext = DataHolder.empty(j);
          goto _L5
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mQuestAgent, mEventAgent
        });
        throw gamesclientcontext;
_L2:
        if (j != 3 && j != 6) goto _L7; else goto _L6
    }

    public final DataHolder loadRecentlyPlayedGames(GamesClientContext gamesclientcontext, int i, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mGameAgent.mRecentlyPlayedLock
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        gamesclientcontext = DataHolder.empty(2);
_L3:
        releaseLocks(new Lockable[] {
            mGameAgent.mRecentlyPlayedLock
        });
        return gamesclientcontext;
_L2:
        GameAgent gameagent;
label0:
        {
            gameagent = mGameAgent;
            gameagent.mRecentlyPlayedLock.assertLockedByCurrentThread();
            if (gamesclientcontext.mExternalTargetPlayerId != null && !gamesclientcontext.isTargetingCurrentPlayer())
            {
                break label0;
            }
            gamesclientcontext = gameagent.loadRecentlyPlayedGamesForSignedInUser(gamesclientcontext, i, flag);
        }
          goto _L3
        gamesclientcontext = gameagent.loadGameCollection(gamesclientcontext, i, 3, flag);
          goto _L3
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent.mRecentlyPlayedLock
        });
        throw gamesclientcontext;
    }

    public final DataHolder loadSelf(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        gamesclientcontext = mPlayerAgent.fetchPlayer(gamesclientcontext, true);
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder loadSnapshots(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mSnapshotAgent
        });
        DataHolder.empty(1);
        gamesclientcontext = mSnapshotAgent.loadSnapshots(gamesclientcontext, googleapiclient);
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        throw gamesclientcontext;
    }

    public final void notifyQuests(GamesClientContext gamesclientcontext, com.google.android.gms.games.service.GamesSyncAdapter.GamesSyncResult gamessyncresult)
    {
        Context context;
        ClientContext clientcontext;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        new QuestBuffer(DataHolder.empty(0));
        acquireLocks(new Lockable[] {
            mQuestAgent
        });
        gamesclientcontext = QuestAgent.getQuestsForNotification(gamesclientcontext);
        gamessyncresult.addOp(16);
        int j;
        releaseLocks(new Lockable[] {
            mQuestAgent
        });
        j = gamesclientcontext.getCount();
        if (j != 0 && areQuestNotificationsEnabled(clientcontext)) goto _L2; else goto _L1
_L1:
        gamesclientcontext.release();
_L6:
        return;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mQuestAgent
        });
        throw gamesclientcontext;
_L2:
        int i;
        gamessyncresult = new ArrayList(j);
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        Quest quest = (Quest)gamesclientcontext.get(i);
        String s = quest.getQuestId();
        String s1 = NotificationAgent.getNewLocalNotificationId();
        Object obj = context.getResources();
        String s2 = ((Resources) (obj)).getString(0x7f10023e);
        String s3 = ((Resources) (obj)).getString(0x7f10023f);
        obj = ((Resources) (obj)).getString(0x7f10023d, new Object[] {
            quest.getName()
        });
        gamessyncresult.add(new NotificationAgent.NotificationParams(quest.getGame().getApplicationId(), s1, s, 8, s2, s3, ((String) (obj)), quest.getGame().getIconImageUri()));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext.release();
        if (gamessyncresult.size() == 0) goto _L6; else goto _L5
_L5:
        acquireLocks(new Lockable[] {
            mNotificationAgent
        });
        NotificationAgent.updateNotifications(context, clientcontext, gamessyncresult);
        releaseLocks(new Lockable[] {
            mNotificationAgent
        });
        return;
        gamessyncresult;
        gamesclientcontext.release();
        throw gamessyncresult;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mNotificationAgent
        });
        throw gamesclientcontext;
    }

    public final com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData openSnapshot(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient, String s, boolean flag, int i)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mSnapshotAgent
        });
        gamesclientcontext = mSnapshotAgent.openSnapshot(gamesclientcontext, googleapiclient, s, flag, i);
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder p2pStatus(Context context, ClientContext clientcontext, String s, List list)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        context = mRealTimeAgent.p2pStatus(context, clientcontext, s, list);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return context;
        context;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw context;
    }

    public final int recordApplicationSession(GamesClientContext gamesclientcontext, String s, long l, long l1, String s1, 
            boolean flag)
    {
        acquireLocks(new Lockable[] {
            mGameAgent.mApplicationSessionLock
        });
        GameAgent.recordApplicationSession(gamesclientcontext, s, l, l1, s1, flag);
        releaseLocks(new Lockable[] {
            mGameAgent.mApplicationSessionLock
        });
        return 0;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent.mApplicationSessionLock
        });
        throw gamesclientcontext;
    }

    public final int recordPlayerSuggestionAction$11b7dad(GamesClientContext gamesclientcontext)
    {
        int i;
        acquireLocks(new Lockable[] {
            mPlayerAgent.mPlayersSuggestedLock
        });
        i = 2;
        if (fetchPlayerIdFromAccountWhenMissing(gamesclientcontext).mExternalCurrentPlayerId != null)
        {
            i = PlayerAgent.recordPlayerSuggestionAction$11b7dad();
        }
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersSuggestedLock
        });
        return i;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersSuggestedLock
        });
        throw gamesclientcontext;
    }

    public final int recordSignIn(Context context, ClientContext clientcontext, String s, Integer integer)
    {
        acquireLocks(new Lockable[] {
            mAccountAgent
        });
        int i = AccountAgent.recordSignIn(context, clientcontext, s, integer);
        releaseLocks(new Lockable[] {
            mAccountAgent
        });
        return i;
        context;
        releaseLocks(new Lockable[] {
            mAccountAgent
        });
        throw context;
    }

    public final int recordSnapshotConflict(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient, SnapshotMetadataChange snapshotmetadatachange, DriveContents drivecontents)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mSnapshotAgent
        });
        Object obj;
        DriveFolder drivefolder;
        obj = mSnapshotAgent.getSnapshotFolder(gamesclientcontext, googleapiclient);
        drivefolder = (DriveFolder)((SnapshotAgent.ResultPair) (obj)).result;
        if (drivefolder != null) goto _L2; else goto _L1
_L1:
        int i;
        GamesLog.w("SnapshotAgent", (new StringBuilder("Could not open snapshot folder for game ")).append(gamesclientcontext.mExternalTargetGameId).toString());
        i = ((SnapshotAgent.ResultPair) (obj)).status.mStatusCode;
_L4:
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        return i;
_L2:
        String s;
        Context context;
        Object obj1;
        String s1;
        String s2;
        obj1 = gamesclientcontext.mClientContext;
        obj = SnapshotAgent.getLoadUri(gamesclientcontext);
        s = Agents.queryString$510a9928(gamesclientcontext.mContext, ((Uri) (obj)), "unique_name");
        obj = Agents.queryString$510a9928(gamesclientcontext.mContext, ((Uri) (obj)), "external_snapshot_id");
        context = gamesclientcontext.mContext;
        obj1 = ((ClientContext) (obj1)).mCallingPackageName;
        s1 = gamesclientcontext.mExternalTargetGameId;
        s2 = AccountUtils.getResolvedAccountName(gamesclientcontext.mClientContext);
        if (obj == null)
        {
            gamesclientcontext = "";
        } else
        {
            gamesclientcontext = ((GamesClientContext) (obj));
        }
        GamesPlayLogger.logSnapshotAction(context, ((String) (obj1)), s1, s2, 5, gamesclientcontext, 4, SnapshotAgent.getContentSizeBytes(drivecontents));
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(((CharSequence) (obj))))
        {
            GamesLog.w("SnapshotAgent", "Snapshot was deleted before a conflict could be notified!");
            break MISSING_BLOCK_LABEL_355;
        }
        gamesclientcontext = SnapshotAgent.convertSnapshotToDriveChange(snapshotmetadatachange, (String)G.snapshotConflictMimeType.get(), SnapshotAgent.getDeviceName(googleapiclient));
        gamesclientcontext.setTitle(s);
        SnapshotAgent.setCustomProperty(gamesclientcontext, new CustomPropertyKey("conflictsWith", 0), s);
        gamesclientcontext = (com.google.android.gms.drive.DriveFolder.DriveFileResult)drivefolder.createFile(googleapiclient, gamesclientcontext.build(), drivecontents).await();
        if (!gamesclientcontext.getStatus().isSuccess())
        {
            GamesLog.e("SnapshotAgent", (new StringBuilder("Failed to create conflict file: ")).append(gamesclientcontext.getStatus()).toString());
            i = SnapshotAgent.remapCommonStatusCode(gamesclientcontext.getStatus().mStatusCode);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_355;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        throw gamesclientcontext;
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void refreshGameData(GamesClientContext gamesclientcontext, com.google.android.gms.games.service.GamesSyncAdapter.GamesSyncResult gamessyncresult)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mGameAgent
        });
        ArrayList arraylist;
        arraylist = mGameAgent.getGamesToRefresh(gamesclientcontext, gamessyncresult.syncResult);
        gamessyncresult.addOp(17);
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        if (arraylist.size() == 0)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_72;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        throw gamesclientcontext;
        ArrayList arraylist1;
        int i;
        int k;
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        k = arraylist.size();
        arraylist1 = new ArrayList(k);
        i = 0;
_L25:
        if (i >= k) goto _L2; else goto _L1
_L1:
        acquireLocks(new Lockable[] {
            mAchievementAgent, mEventAgent, mLeaderboardAgent
        });
        GameAgent.GameRefreshRecord gamerefreshrecord;
        String s;
        Object obj;
        HashSet hashset;
        gamerefreshrecord = (GameAgent.GameRefreshRecord)arraylist.get(i);
        s = gamerefreshrecord.mExternalGameId;
        obj = gamesclientcontext.getBuilder();
        obj.mExternalTargetGameId = s;
        obj = ((GamesClientContext.Builder) (obj)).build();
        hashset = gamerefreshrecord.mAppUpdates;
        int j;
        byte byte1;
        byte1 = 1;
        j = 0;
_L33:
        if (j >= AppUpdateType.ALL_TYPES.length) goto _L4; else goto _L3
_L3:
        Object obj1 = AppUpdateType.ALL_TYPES[j];
        byte byte0 = byte1;
        if (!hashset.contains(obj1)) goto _L6; else goto _L5
_L5:
        byte0 = -1;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 5: default 843
    //                   -292133702: 344
    //                   810912824: 310
    //                   1528308867: 276
    //                   1713155957: 293
    //                   1965593541: 327;
           goto _L7 _L8 _L9 _L10 _L11 _L12
_L10:
        if (((String) (obj1)).equals("ACHIEVEMENT_DEFINITION"))
        {
            byte0 = 0;
        }
          goto _L7
_L11:
        if (((String) (obj1)).equals("LEADERBOARD_DEFINITION"))
        {
            byte0 = 1;
        }
          goto _L7
_L9:
        if (((String) (obj1)).equals("EVENT_DEFINITION"))
        {
            byte0 = 2;
        }
          goto _L7
_L12:
        if (((String) (obj1)).equals("ACHIEVEMENT_INSTANCE"))
        {
            byte0 = 3;
        }
          goto _L7
_L8:
        if (((String) (obj1)).equals("EVENT_INSTANCE"))
        {
            byte0 = 4;
        }
          goto _L7
_L28:
        SyncResult syncresult;
        obj1 = mAchievementAgent;
        syncresult = gamessyncresult.syncResult;
        Preconditions.checkArgument(((GamesClientContext) (obj)).mIsFirstPartyBackground, "The internal achievements should be called by first party background contexts.");
        boolean flag;
        if (((AchievementAgent) (obj1)).refreshDefinitions(((GamesClientContext) (obj))) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L14; else goto _L13
_L13:
        GamesLog.d("AchievementAgent", (new StringBuilder("Failed to sync definitions for game ")).append(((GamesClientContext) (obj)).mExternalTargetGameId).toString());
        obj1 = syncresult.stats;
        obj1.numIoExceptions = ((SyncStats) (obj1)).numIoExceptions + 1L;
_L14:
        gamessyncresult.addOp(20);
          goto _L15
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mAchievementAgent, mEventAgent, mLeaderboardAgent
        });
        throw gamesclientcontext;
_L29:
        flag = mLeaderboardAgent.syncLeaderboards(((GamesClientContext) (obj)), gamessyncresult.syncResult);
        gamessyncresult.addOp(24);
          goto _L15
_L30:
        flag = mEventAgent.syncEventDefinitions(((GamesClientContext) (obj)), gamessyncresult.syncResult);
        gamessyncresult.addOp(22);
          goto _L15
_L31:
        obj1 = mAchievementAgent;
        syncresult = gamessyncresult.syncResult;
        if (((GamesClientContext) (obj)).mExternalCurrentPlayerId != null) goto _L17; else goto _L16
_L16:
        flag = true;
_L22:
        gamessyncresult.addOp(21);
          goto _L15
_L17:
        Preconditions.checkArgument(((GamesClientContext) (obj)).mIsFirstPartyBackground, "The internal achievements should be called by first party background contexts.");
        boolean flag1;
        if (((AchievementAgent) (obj1)).flushPendingOps(((GamesClientContext) (obj))) == 0)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (byte0 == 0) goto _L19; else goto _L18
_L18:
        if (((AchievementAgent) (obj1)).refreshInstances(((GamesClientContext) (obj))) != 0) goto _L19; else goto _L20
_L20:
        flag1 = true;
_L34:
        flag = flag1;
        if (flag1) goto _L22; else goto _L21
_L21:
        GamesLog.d("AchievementAgent", (new StringBuilder("Failed to sync instances for game ")).append(((GamesClientContext) (obj)).mExternalTargetGameId).toString());
        SyncStats syncstats = syncresult.stats;
        syncstats.numIoExceptions = syncstats.numIoExceptions + 1L;
        flag = flag1;
          goto _L22
_L32:
        flag = mEventAgent.syncInstances(((GamesClientContext) (obj)), gamessyncresult.syncResult);
        gamessyncresult.addOp(23);
          goto _L15
_L4:
        if (byte1 == 0) goto _L24; else goto _L23
_L23:
        arraylist1.add(gamerefreshrecord);
_L26:
        releaseLocks(new Lockable[] {
            mAchievementAgent, mEventAgent, mLeaderboardAgent
        });
        i++;
          goto _L25
_L24:
        GamesLog.w("DataBroker", (new StringBuilder("Failed to update game data for ")).append(s).toString());
          goto _L26
_L2:
        acquireLocks(new Lockable[] {
            mGameAgent
        });
        GameAgent.updateMetadataVersions(gamesclientcontext.mContext, gamesclientcontext.mClientContext, arraylist1);
        gamessyncresult.addOp(18);
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        return;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        throw gamesclientcontext;
_L7:
        byte0;
        JVM INSTR tableswitch 0 4: default 880
    //                   0 361
    //                   1 494
    //                   2 518
    //                   3 542
    //                   4 678;
           goto _L27 _L28 _L29 _L30 _L31 _L32
_L27:
        flag = true;
_L15:
        byte0 = byte1 & flag;
_L6:
        j++;
        byte1 = byte0;
          goto _L33
_L19:
        flag1 = false;
          goto _L34
    }

    public final int refreshQuests(GamesClientContext gamesclientcontext, com.google.android.gms.games.service.GamesSyncAdapter.GamesSyncResult gamessyncresult)
        throws GoogleAuthException
    {
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        acquireLocks(new Lockable[] {
            mQuestAgent
        });
        Object obj = gamesclientcontext.mExternalCurrentPlayerId;
        if (obj != null) goto _L2; else goto _L1
_L1:
        int i = 2;
_L4:
        releaseLocks(new Lockable[] {
            mQuestAgent
        });
        if (i == 4 || i == 3 || i == 500)
        {
            gamesclientcontext = gamessyncresult.syncResult.stats;
            gamesclientcontext.numIoExceptions = ((SyncStats) (gamesclientcontext)).numIoExceptions + 1L;
        }
        return i;
_L2:
        obj = mQuestAgent;
        if (!ApiRateLimitUtil.isSyncRateLimited(((Lockable) (obj)), ((Long)G.tickleSyncThresholdMillis.get()).longValue(), gamesclientcontext.mForceReload))
        {
            break; /* Loop/switch isn't completed */
        }
        GamesLog.i("QuestAgent", "Returning cached entities for quest metadata");
        break MISSING_BLOCK_LABEL_587;
_L5:
        gamessyncresult.addOp(15);
        if (true) goto _L4; else goto _L3
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mQuestAgent
        });
        throw gamesclientcontext;
_L3:
        Object obj2;
label0:
        {
            obj2 = ((QuestAgent) (obj)).syncMetadataFromNetwork(gamesclientcontext, Agents.getSyncToken(gamesclientcontext.mContext, gamesclientcontext.mClientContext, QuestAgent.SYNC_QUEST_METADATA_TOKEN_PROJECTION));
            GamesLog.d("QuestAgent", String.format("Received %s quest metadata entities during sync", new Object[] {
                Integer.valueOf(((QuestAgent.SyncNetworkResponse) (obj2)).mData.size())
            }));
            if (((QuestAgent.SyncNetworkResponse) (obj2)).mStatusCode == 0)
            {
                break label0;
            }
            i = ((QuestAgent.SyncNetworkResponse) (obj2)).mStatusCode;
        }
          goto _L5
        Object obj1;
        ArrayList arraylist;
        Object obj3;
        int j;
        arraylist = ((QuestAgent.SyncNetworkResponse) (obj2)).mData;
        obj3 = new ArrayList();
        obj1 = new ArrayList();
        j = arraylist.size();
        QuestMetadata questmetadata;
        for (i = 0; i >= j; i++)
        {
            break MISSING_BLOCK_LABEL_370;
        }

        questmetadata = (QuestMetadata)arraylist.get(i);
        if ("QUEST_METADATA".equals(questmetadata.getType()))
        {
            ((ArrayList) (obj3)).add(questmetadata.getQuest());
            break MISSING_BLOCK_LABEL_593;
        }
        if ("APPLICATION_ID".equals(questmetadata.getType()))
        {
            ((ArrayList) (obj1)).add((String)((FastMapJsonResponse) (questmetadata)).mValues.get("expiredApplicationId"));
            break MISSING_BLOCK_LABEL_593;
        }
        GamesLog.w("QuestAgent", (new StringBuilder("Invalid QuestMetadata type: ")).append(questmetadata.getType()).toString());
        break MISSING_BLOCK_LABEL_593;
        arraylist = new ArrayList();
        obj2 = ((QuestAgent) (obj)).buildQuestOperations(gamesclientcontext, ((QuestAgent.SyncNetworkResponse) (obj2)), "quest_sync_metadata_token", ((ArrayList) (obj3)), arraylist, false);
        if (((ArrayList) (obj1)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_571;
        }
        j = ((ArrayList) (obj1)).size();
        i = 0;
_L7:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = (String)((ArrayList) (obj1)).get(i);
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Quests.getUriForExternalGameId(gamesclientcontext.mClientContext, ((String) (obj3)))).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size())).build());
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        obj3 = com.google.android.gms.games.provider.GamesContractInternal.Quests.getContentUri(gamesclientcontext.mClientContext);
        for (obj1 = Agents.getTwoColumnMap(gamesclientcontext.mContext, ((Uri) (obj3)), "external_game_id", "external_quest_id", ((java.util.Collection) (obj1))).entrySet().iterator(); ((Iterator) (obj1)).hasNext(); ((ArrayList) (obj2)).add(new QuestAgent.NotifyDataHolder((String)((java.util.Map.Entry) (obj3)).getKey(), (String)((java.util.Map.Entry) (obj3)).getValue(), 3)))
        {
            obj3 = (java.util.Map.Entry)((Iterator) (obj1)).next();
        }

        if (((QuestAgent) (obj)).processQuestOperations(gamesclientcontext, arraylist, ((ArrayList) (obj2))))
        {
            ApiRateLimitUtil.updateSyncTimestamp(((Lockable) (obj)));
        }
        i = 0;
          goto _L5
    }

    public final void registerForNotifications(Context context)
    {
        acquireLocks(new Lockable[] {
            mNotificationAgent
        });
        Account aaccount[] = AccountManager.get(context).getAccountsByType("com.google");
        int i = 0;
_L2:
        if (i >= aaccount.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ClientContext clientcontext = Agents.buildFirstPartyClientContext(context, aaccount[i].name);
        if (AccountAgent.saveAccountToDatabase(context, clientcontext, null) == null)
        {
            GamesLog.e("AccountAgent", (new StringBuilder("Error recording account name ")).append(AccountUtils.getResolvedAccountName(clientcontext)).toString());
        }
        NotificationAgent.register(context, aaccount[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        releaseLocks(new Lockable[] {
            mNotificationAgent
        });
        return;
        context;
        releaseLocks(new Lockable[] {
            mNotificationAgent
        });
        throw context;
    }

    public final boolean registerGame(Context context, ClientContext clientcontext, String s, boolean flag)
    {
        acquireLocks(mGameAgent.mCacheLockables);
        flag = mGameAgent.registerGame(context, clientcontext, s, flag);
        releaseLocks(mGameAgent.mCacheLockables);
        return flag;
        context;
        releaseLocks(mGameAgent.mCacheLockables);
        throw context;
    }

    public final void release()
    {
        super.assertNoChildrenLockedByCurrentThread();
    }

    public final volatile void releaseLockOnAllChildren()
    {
        super.releaseLockOnAllChildren();
    }

    public final DataHolder rematchTurnBasedMatch(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        gamesclientcontext = mTurnBasedAgent.retryMatch(gamesclientcontext, s);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
    }

    public final com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation.SnapshotOpenData resolveSnapshotConflict(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, DriveContents drivecontents)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mSnapshotAgent
        });
        gamesclientcontext = mSnapshotAgent.resolveSnapshotConflict(gamesclientcontext, googleapiclient, s, s1, snapshotmetadatachange, drivecontents, -1);
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        throw gamesclientcontext;
    }

    public final int revealAchievement(GamesClientContext gamesclientcontext, String s, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mAchievementAgent
        });
        int i = mAchievementAgent.updateAchievementState(gamesclientcontext, s, 1, popuplocationinfo).statusCode;
        releaseLocks(new Lockable[] {
            mAchievementAgent
        });
        return i;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mAchievementAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder searchForGames(GamesClientContext gamesclientcontext, String s, int i, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mGameAgent.mSearchLock
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        gamesclientcontext = DataHolder.empty(2);
_L4:
        releaseLocks(new Lockable[] {
            mGameAgent.mSearchLock
        });
        return gamesclientcontext;
_L2:
        gamesclientcontext = mGameAgent.searchForGames(gamesclientcontext, s, i, flag);
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent.mSearchLock
        });
        throw gamesclientcontext;
    }

    public final void searchForInstalledGames(GamesClientContext gamesclientcontext)
    {
        acquireLocks(mGameAgent.mCacheLockables);
        long l = AccountAgent.getLastPackageScanTimestamp(gamesclientcontext);
        if (l != -1L)
        {
            releaseLocks(mGameAgent.mCacheLockables);
            return;
        }
        GameAgent gameagent;
        Context context;
        ClientContext clientcontext;
        List list;
        int j;
        gameagent = mGameAgent;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        list = context.getPackageManager().getInstalledApplications(0);
        j = list.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        gameagent.registerGame(context, clientcontext, ((ApplicationInfo)list.get(i)).packageName, false);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        AccountAgent.setLastPackageScanTimestamp(gamesclientcontext, System.currentTimeMillis());
        releaseLocks(mGameAgent.mCacheLockables);
        return;
        gamesclientcontext;
        releaseLocks(mGameAgent.mCacheLockables);
        throw gamesclientcontext;
    }

    public final DataHolder searchForPlayers(GamesClientContext gamesclientcontext, String s, int i, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent.mPlayersSearchLock
        });
        DataHolder.empty(1);
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        if (gamesclientcontext.mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        gamesclientcontext = DataHolder.empty(2);
_L3:
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersSearchLock
        });
        return gamesclientcontext;
_L2:
        PlayerAgent playeragent;
        Object obj1;
        Object obj2;
        long l;
label0:
        {
            playeragent = mPlayerAgent;
            obj1 = gamesclientcontext.mContext;
            obj2 = gamesclientcontext.mClientContext;
            playeragent.mPlayersSearchLock.assertLockedByCurrentThread();
            playeragent.mSearchCache.enableCaching(gamesclientcontext.mExternalCurrentPlayerId);
            l = DefaultClock.getInstance().currentTimeMillis();
            if (gamesclientcontext.mForceReload)
            {
                playeragent.mSearchCache.clearData(s);
            }
            if (!playeragent.mSearchCache.hasEnoughData(s, l, i, flag))
            {
                break label0;
            }
            playeragent.mSearchCache.setTotalCount(s, "total_count", i);
            gamesclientcontext = playeragent.mSearchCache.getData(s, null);
        }
          goto _L3
        Object obj;
        obj = null;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        if (!playeragent.mSearchCache.hasData(s, l))
        {
            break MISSING_BLOCK_LABEL_201;
        }
        obj = playeragent.mSearchCache.getNextPageToken(s, l);
        gamesclientcontext = null;
        if (Patterns.EMAIL_ADDRESS.matcher(s).matches())
        {
            gamesclientcontext = playeragent.fetchPersonByEmail(((Context) (obj1)), ((ClientContext) (obj2)), s, l);
        }
        if (gamesclientcontext != null)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        gamesclientcontext = playeragent.fetchPeopleForSearch1P(((Context) (obj1)), ((ClientContext) (obj2)), s, i, l, ((String) (obj)));
        if (gamesclientcontext != null)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        if (playeragent.mSearchCache.hasData(s, l))
        {
            playeragent.mSearchCache.setStatusCode(s, 3);
        }
        gamesclientcontext = playeragent.mSearchCache.getData(s, null);
          goto _L3
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        ArrayList arraylist3;
        int j;
        j = ((PlayerAgent.PeopleNetworkData) (gamesclientcontext)).playerValues.size();
        arraylist3 = new ArrayList(j);
        obj = new ArrayList(j);
        arraylist = new ArrayList(j);
        arraylist1 = new ArrayList(j);
        arraylist2 = new ArrayList(j);
        obj2 = com.google.android.gms.games.provider.GamesContractInternal.Images.getContentUri(((ClientContext) (obj2)));
        i = 0;
_L5:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ContentValues contentvalues1 = (ContentValues)((PlayerAgent.PeopleNetworkData) (gamesclientcontext)).playerValues.get(i);
        ((ArrayList) (obj)).add(Agents.addInsertImageOp(((Uri) (obj2)), contentvalues1.getAsString("profile_icon_image_url"), arraylist3));
        arraylist.add(Agents.addInsertImageOp(((Uri) (obj2)), contentvalues1.getAsString("profile_hi_res_image_url"), arraylist3));
        arraylist1.add(Agents.addInsertImageOp(((Uri) (obj2)), contentvalues1.getAsString("banner_image_landscape_url"), arraylist3));
        arraylist2.add(Agents.addInsertImageOp(((Uri) (obj2)), contentvalues1.getAsString("banner_image_portrait_url"), arraylist3));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (((ArrayList) (obj)).size() == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (arraylist.size() == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (arraylist1.size() == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (arraylist2.size() == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        obj1 = Agents.applyContentOperationsWithResult(((Context) (obj1)).getContentResolver(), arraylist3, "PlayerAgent");
        i = 0;
_L7:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ContentValues contentvalues = (ContentValues)((PlayerAgent.PeopleNetworkData) (gamesclientcontext)).playerValues.get(i);
        Agents.addImageUriColumn(contentvalues, "profile_icon_image_url", "profile_icon_image_uri", ((ArrayList) (obj1)), (Integer)((ArrayList) (obj)).get(i));
        Agents.addImageUriColumn(contentvalues, "profile_hi_res_image_url", "profile_hi_res_image_uri", ((ArrayList) (obj1)), (Integer)arraylist.get(i));
        Agents.addImageUriColumn(contentvalues, "banner_image_landscape_url", "banner_image_landscape_uri", ((ArrayList) (obj1)), (Integer)arraylist1.get(i));
        Agents.addImageUriColumn(contentvalues, "banner_image_portrait_url", "banner_image_portrait_uri", ((ArrayList) (obj1)), (Integer)arraylist2.get(i));
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        playeragent.mSearchCache.addCacheData(s, ((PlayerAgent.PeopleNetworkData) (gamesclientcontext)).playerValues, 0, null, ((PlayerAgent.PeopleNetworkData) (gamesclientcontext)).nextPageToken, 0, l);
        playeragent.mSearchCache.setTotalCount(s, "total_count", ((PlayerAgent.PeopleNetworkData) (gamesclientcontext)).totalItems);
        gamesclientcontext = playeragent.mSearchCache.getData(s, null);
          goto _L3
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent.mPlayersSearchLock
        });
        throw gamesclientcontext;
    }

    public final DataHolder sendRequest(GamesClientContext gamesclientcontext, int i, int j, byte abyte0[], String as[])
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mRequestAgent
        });
        DataHolder.empty(1);
        ApiRateLimitUtil.clearSyncTimestamp(mRequestAgent);
        as = new ArrayList(Arrays.asList(as));
        gamesclientcontext = mRequestAgent.sendRequest(gamesclientcontext, i, Integer.valueOf(j), abyte0, as);
        releaseLocks(new Lockable[] {
            mRequestAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mRequestAgent
        });
        throw gamesclientcontext;
    }

    public final int setAchievementSteps(GamesClientContext gamesclientcontext, String s, int i, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mAchievementAgent
        });
        s = mAchievementAgent.setAchievementSteps(gamesclientcontext, s, i, popuplocationinfo, flag);
        releaseLocks(new Lockable[] {
            mAchievementAgent
        });
        if (((AchievementAgent.AchievementUpdateResult) (s)).xpGained > 0L)
        {
            gainXp(gamesclientcontext, ((AchievementAgent.AchievementUpdateResult) (s)).xpGained, popuplocationinfo);
        }
        return ((AchievementAgent.AchievementUpdateResult) (s)).statusCode;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mAchievementAgent
        });
        throw gamesclientcontext;
    }

    public final int setGameMuteStatus(GamesClientContext gamesclientcontext, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mGameAgent.mHiddenLock
        });
        int i;
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        i = mGameAgent.setGameMuteStatus(gamesclientcontext, flag);
        releaseLocks(new Lockable[] {
            mGameAgent.mHiddenLock
        });
        return i;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent.mHiddenLock
        });
        throw gamesclientcontext;
    }

    public final int setIdentitySharingConfirmed(GamesClientContext gamesclientcontext)
    {
        acquireLocks(new Lockable[] {
            mGameAgent
        });
        int i = GameAgent.setIdentitySharingConfirmed(gamesclientcontext);
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        return i;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        throw gamesclientcontext;
    }

    public final ScoreSubmissionData submitScore(GamesClientContext gamesclientcontext, String s, long l, long l1, String s1, 
            boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mLeaderboardAgent
        });
        gamesclientcontext = mLeaderboardAgent.submitScore(gamesclientcontext, s, l, l1, s1, flag);
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        return gamesclientcontext;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mLeaderboardAgent
        });
        throw gamesclientcontext;
    }

    public final int syncMatches(GamesClientContext gamesclientcontext, com.google.android.gms.games.service.GamesSyncAdapter.GamesSyncResult gamessyncresult)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent, mNotificationAgent
        });
        int i;
        if (gamesclientcontext.mForceReload)
        {
            ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        }
        mTurnBasedAgent.submitPendingMatches(gamesclientcontext, gamessyncresult.syncResult);
        gamessyncresult.addOp(9);
        i = mMultiplayerAgent.syncEntities(gamesclientcontext);
        gamessyncresult.addOp(14);
        releaseLocks(new Lockable[] {
            mMultiplayerAgent, mNotificationAgent
        });
        if (i == 4 || i == 3 || i == 500)
        {
            gamesclientcontext = gamessyncresult.syncResult.stats;
            gamesclientcontext.numIoExceptions = ((SyncStats) (gamesclientcontext)).numIoExceptions + 1L;
        }
        return i;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent, mNotificationAgent
        });
        throw gamesclientcontext;
    }

    public final int syncRequests(GamesClientContext gamesclientcontext, com.google.android.gms.games.service.GamesSyncAdapter.GamesSyncResult gamessyncresult)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mRequestAgent, mNotificationAgent
        });
        GamesClientContext gamesclientcontext1;
        gamesclientcontext1 = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        gamesclientcontext = gamesclientcontext1.mExternalCurrentPlayerId;
        if (gamesclientcontext != null) goto _L2; else goto _L1
_L1:
        int i = 2;
_L5:
        releaseLocks(new Lockable[] {
            mRequestAgent, mNotificationAgent
        });
        if (i == 4 || i == 3 || i == 500)
        {
            gamesclientcontext = gamessyncresult.syncResult.stats;
            gamesclientcontext.numIoExceptions = ((SyncStats) (gamesclientcontext)).numIoExceptions + 1L;
        }
        return i;
_L2:
        RequestAgent requestagent;
        if (gamesclientcontext1.mForceReload)
        {
            ApiRateLimitUtil.clearSyncTimestamp(mRequestAgent);
        }
        requestagent = mRequestAgent;
        requestagent.flushPendingOps(gamesclientcontext1);
        if (!ApiRateLimitUtil.isSyncRateLimited(requestagent, ((Long)G.tickleSyncThresholdMillis.get()).longValue(), gamesclientcontext1.mForceReload))
        {
            break; /* Loop/switch isn't completed */
        }
        GamesLog.i("RequestAgent", "Returning cached entities");
          goto _L3
_L6:
        gamessyncresult.addOp(13);
        if (true) goto _L5; else goto _L4
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mRequestAgent, mNotificationAgent
        });
        throw gamesclientcontext;
_L4:
        RequestAgent.SyncNetworkResponse syncnetworkresponse;
label0:
        {
            gamesclientcontext1.resolveCurrentPlayerId();
            syncnetworkresponse = requestagent.syncFromNetwork(gamesclientcontext1, Agents.getSyncToken(gamesclientcontext1.mContext, gamesclientcontext1.mClientContext, RequestAgent.SYNC_TOKEN_PROJECTION));
            GamesLog.d("RequestAgent", String.format("Received %s requests during sync", new Object[] {
                Integer.valueOf(syncnetworkresponse.mEntities.size())
            }));
            if (syncnetworkresponse.mStatusCode == 0)
            {
                break label0;
            }
            i = syncnetworkresponse.mStatusCode;
        }
          goto _L6
        HashSet hashset;
        ArrayList arraylist;
        hashset = RequestAgent.getActionableIds(gamesclientcontext1);
        arraylist = new ArrayList();
        gamesclientcontext = syncnetworkresponse.mNewSyncToken;
        if (gamesclientcontext == null)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        arraylist.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(gamesclientcontext1.mClientContext)).withValue("request_sync_token", gamesclientcontext).build());
        Map map;
        ArrayList arraylist1;
        int j;
        map = RequestAgent.resolveExternalGameIds(gamesclientcontext1.mContext, gamesclientcontext1.mClientContext, syncnetworkresponse);
        arraylist1 = syncnetworkresponse.mEntities;
        j = arraylist1.size();
        Long long1;
        RequestEntity requestentity;
        Request request;
        GamesClientContext.Builder builder;
        long l;
        for (i = 0; i >= j; i++)
        {
            break MISSING_BLOCK_LABEL_540;
        }

        requestentity = (RequestEntity)arraylist1.get(i);
        request = requestentity.getRequest();
        gamesclientcontext = request.getApplicationId();
        if (!gamesclientcontext.equals(gamesclientcontext1.mExternalTargetGameId)) goto _L8; else goto _L7
_L7:
        l = gamesclientcontext1.resolveTargetGameId();
        gamesclientcontext = gamesclientcontext1;
        long1 = Long.valueOf(l);
_L9:
        if (requestagent.addRequestOps(gamesclientcontext, request, arraylist) != -1)
        {
            arraylist.add(Agents.getNotificationOp(gamesclientcontext.mContext, gamesclientcontext.mClientContext, requestentity.getNotification(), long1.longValue(), request.getId(), 4));
        }
        break MISSING_BLOCK_LABEL_642;
_L8:
        long1 = (Long)map.get(gamesclientcontext);
        if (long1 != null)
        {
            break MISSING_BLOCK_LABEL_518;
        }
        GamesLog.e("RequestAgent", (new StringBuilder("No game found matching external game ID ")).append(gamesclientcontext).toString());
        break MISSING_BLOCK_LABEL_642;
        builder = gamesclientcontext1.getBuilder();
        builder.mExternalTargetGameId = gamesclientcontext;
        gamesclientcontext = builder.build();
          goto _L9
        if (arraylist.size() <= 0 || Agents.applyContentOperations(gamesclientcontext1.mContext.getContentResolver(), arraylist, "RequestAgent")) goto _L11; else goto _L10
_L10:
        GamesLog.e("RequestAgent", "Failed to store requests");
        i = 0;
_L12:
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        RequestAgent.postProcessNetworkEntities(gamesclientcontext1, syncnetworkresponse);
        ApiRateLimitUtil.updateSyncTimestamp(requestagent);
        break; /* Loop/switch isn't completed */
_L11:
        gamesclientcontext = RequestAgent.getActionableIds(gamesclientcontext1);
        gamesclientcontext.removeAll(hashset);
        if (gamesclientcontext.size() > 0)
        {
            requestagent.mHasNewActivity = true;
        }
        RequestAgent.trimRequestEntitiesForPlayer(gamesclientcontext1);
        i = 1;
        if (true) goto _L12; else goto _L3
_L3:
        i = 0;
          goto _L6
    }

    public final int unlockAchievement(GamesClientContext gamesclientcontext, String s, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mAchievementAgent
        });
        s = mAchievementAgent.updateAchievementState(gamesclientcontext, s, 0, popuplocationinfo);
        releaseLocks(new Lockable[] {
            mAchievementAgent
        });
        if (((AchievementAgent.AchievementUpdateResult) (s)).xpGained > 0L)
        {
            gainXp(gamesclientcontext, ((AchievementAgent.AchievementUpdateResult) (s)).xpGained, popuplocationinfo);
        }
        return ((AchievementAgent.AchievementUpdateResult) (s)).statusCode;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mAchievementAgent
        });
        throw gamesclientcontext;
    }

    public final long updateConnectionTime(GamesClientContext gamesclientcontext)
    {
        acquireLocks(new Lockable[] {
            mGameAgent
        });
        long l = GameAgent.updateConnectionTime(gamesclientcontext);
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        return l;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mGameAgent
        });
        throw gamesclientcontext;
    }

    public final int updateContactSettings(ClientContext clientcontext, boolean flag, Bundle bundle)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent
        });
        int i = mPlayerAgent.updateContactSettings(clientcontext, flag, bundle);
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        return i;
        clientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        throw clientcontext;
    }

    public final int updateGameplayAcl(Context context, ClientContext clientcontext, String s, String s1)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mAclAgent, mLeaderboardAgent
        });
        int i = mAclAgent.updateGameplayAcl(context, clientcontext, s, s1);
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        mLeaderboardAgent.mScoreCache.clear();
        releaseLocks(new Lockable[] {
            mAclAgent, mLeaderboardAgent
        });
        return i;
        context;
        releaseLocks(new Lockable[] {
            mAclAgent, mLeaderboardAgent
        });
        throw context;
    }

    public final int updateNotifyAcl$32b84d33(ClientContext clientcontext, String s)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mAclAgent
        });
        int i = mAclAgent.updateNotifyAcl(clientcontext, s);
        releaseLocks(new Lockable[] {
            mAclAgent
        });
        return i;
        clientcontext;
        releaseLocks(new Lockable[] {
            mAclAgent
        });
        throw clientcontext;
    }

    public final int updateProfileSettings(GamesClientContext gamesclientcontext, boolean flag)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mPlayerAgent
        });
        int i;
        gamesclientcontext = fetchPlayerIdFromAccountWhenMissing(gamesclientcontext);
        i = mPlayerAgent.updateProfileSettings(gamesclientcontext, flag);
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        return i;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mPlayerAgent
        });
        throw gamesclientcontext;
    }

    public final DataHolder updateRoom(Context context, ClientContext clientcontext, RoomStatus roomstatus)
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        RealTimeAgent realtimeagent;
        ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        realtimeagent = mRealTimeAgent;
        if (realtimeagent.mRoomCache != null) goto _L2; else goto _L1
_L1:
        GamesLog.e("RealTimeAgent", (new StringBuilder("mRoomCache is null when receiving status update for room ")).append(roomstatus.getRoomId()).toString());
        context = DataHolder.empty(1);
_L8:
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return context;
_L2:
        if (!realtimeagent.mRoomCache.isRoomCached(roomstatus.getRoomId()))
        {
            GamesLog.e("RealTimeAgent", (new StringBuilder("mRoomCache.mRoomId = ")).append(realtimeagent.mRoomCache.mRoomId).append(" when receiving status update for room ").append(roomstatus.getRoomId()).toString());
            context = DataHolder.empty(1);
            continue; /* Loop/switch isn't completed */
        }
        Map map;
        map = realtimeagent.mRoomCache.mRoomDataValues;
        clientcontext = realtimeagent.mRoomCache;
        if (((RealTimeAgent.RoomCache) (clientcontext)).mRoomDataValues != null && ((RealTimeAgent.RoomCache) (clientcontext)).mRoomDataValues.size() != 0) goto _L4; else goto _L3
_L3:
        clientcontext = new ContentValues();
_L6:
        MultiplayerUtils.updateRoomData$2432be7a(context, map, clientcontext, roomstatus);
        realtimeagent.mRoomCache.updateRoomValues(map);
        context = realtimeagent.mRoomCache.getRoomData();
        continue; /* Loop/switch isn't completed */
_L4:
        clientcontext = (java.util.Map.Entry)((RealTimeAgent.RoomCache) (clientcontext)).mRoomDataValues.entrySet().iterator().next();
        Asserts.checkNotNull(clientcontext, "No base Room entry in cache!");
        clientcontext = (ContentValues)clientcontext.getValue();
        Asserts.checkNotNull(clientcontext, "No base Room entry values in cache!");
        clientcontext = Agents.extractValues(clientcontext, RealTimeAgent.access$100());
        if (true) goto _L6; else goto _L5
_L5:
        context;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw context;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final DataHolder updateTurnBasedMatch(GamesClientContext gamesclientcontext, String s, String s1, byte abyte0[], ParticipantResult aparticipantresult[])
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mMultiplayerAgent
        });
        DataHolder.empty(1);
        ApiRateLimitUtil.clearSyncTimestamp(mMultiplayerAgent);
        if (aparticipantresult != null) goto _L2; else goto _L1
_L1:
        aparticipantresult = new ArrayList();
_L5:
        TurnBasedAgent turnbasedagent;
        Context context;
        ClientContext clientcontext;
        turnbasedagent = mTurnBasedAgent;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        if (!TurnBasedAgent.hasPendingOps(context, clientcontext, s)) goto _L4; else goto _L3
_L3:
        GamesLog.w(TurnBasedAgent.TAG, (new StringBuilder("Cannot take turn while pending ops are present for match ")).append(s).toString());
        gamesclientcontext = DataHolder.empty(6507);
_L8:
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        return gamesclientcontext;
_L2:
        aparticipantresult = new ArrayList(Arrays.asList(aparticipantresult));
          goto _L5
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mMultiplayerAgent
        });
        throw gamesclientcontext;
_L4:
        int i = TurnBasedAgent.getLocalVersion(context, clientcontext, s);
        if (i != -1) goto _L7; else goto _L6
_L6:
        GamesLog.w(TurnBasedAgent.TAG, (new StringBuilder("No local record found for match ")).append(s).toString());
        gamesclientcontext = DataHolder.empty(1);
          goto _L8
_L11:
        TurnBasedMatchDataRequest turnbasedmatchdatarequest;
        ArrayList arraylist;
        Object obj;
        int j;
        arraylist = TurnBasedAgent.convertToWireResults(aparticipantresult);
        obj = turnbasedagent.updateMatchInternal(context, clientcontext, s, new TurnBasedMatchTurn(turnbasedmatchdatarequest, Integer.valueOf(i), s1, arraylist));
        j = ((Integer)((Pair) (obj)).first).intValue();
        obj = (TurnBasedMatch)((Pair) (obj)).second;
        if (obj == null) goto _L10; else goto _L9
_L9:
        gamesclientcontext = turnbasedagent.storeAndReturnMatch(gamesclientcontext, ((TurnBasedMatch) (obj)), j);
          goto _L8
_L13:
        turnbasedmatchdatarequest = new TurnBasedMatchDataRequest(Base64Utils.encodeUrlSafe(abyte0));
          goto _L11
_L10:
        if (j != 6503)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        gamesclientcontext = turnbasedagent.getConflictMatch(gamesclientcontext, s, j);
          goto _L8
        if (j == 5)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        gamesclientcontext = DataHolder.empty(j);
          goto _L8
        TurnBasedAgent.addPendingOp(gamesclientcontext, 3, s, s1, false, i, new TurnBasedMatchResults(turnbasedmatchdatarequest, Integer.valueOf(i), arraylist));
        gamesclientcontext = TurnBasedAgent.updateLocalMatchStateForPendingOp(context, clientcontext, s, s1, abyte0, i, false, aparticipantresult);
          goto _L8
_L7:
        if (abyte0 != null) goto _L13; else goto _L12
_L12:
        turnbasedmatchdatarequest = null;
          goto _L11
    }

    public final int verifySnapshotFolder(GamesClientContext gamesclientcontext, GoogleApiClient googleapiclient)
        throws GoogleAuthException
    {
        acquireLocks(new Lockable[] {
            mSnapshotAgent
        });
        int i = mSnapshotAgent.getSnapshotFolder(gamesclientcontext, googleapiclient).status.mStatusCode;
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        return i;
        gamesclientcontext;
        releaseLocks(new Lockable[] {
            mSnapshotAgent
        });
        throw gamesclientcontext;
    }

}
