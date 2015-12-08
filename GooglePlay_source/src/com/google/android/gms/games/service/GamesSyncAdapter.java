// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SyncResult;
import android.content.SyncStats;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.util.ArrayMap;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.sync.BaseGmsSyncAdapter;
import com.google.android.gms.common.util.AccountUtils;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.broker.AccountAgent;
import com.google.android.gms.games.broker.AchievementAgent;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.broker.ApiRateLimitUtil;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.EventAgent;
import com.google.android.gms.games.broker.GameAgent;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.broker.LeaderboardAgent;
import com.google.android.gms.games.broker.Lockable;
import com.google.android.gms.games.broker.PlayerAgent;
import com.google.android.gms.games.broker.RequestAgent;
import com.google.android.gms.games.broker.TurnBasedAgent;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.server.error.GamesException;
import com.google.android.gms.games.util.PackageUtils;
import com.google.android.gms.games.utils.UriUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesSyncServiceMain, GamesNotificationHelper

public final class GamesSyncAdapter extends BaseGmsSyncAdapter
{
    public static final class GamesSyncResult
    {

        private final ArrayList mOperations;
        public final SyncResult syncResult;

        public final void addOp(int i)
        {
            mOperations.add(Integer.valueOf(i));
        }

        public final int[] getOps()
        {
            int ai[] = new int[mOperations.size()];
            int i = 0;
            for (int j = mOperations.size(); i < j; i++)
            {
                ai[i] = ((Integer)mOperations.get(i)).intValue();
            }

            return ai;
        }

        public GamesSyncResult()
        {
            this(new SyncResult());
        }

        public GamesSyncResult(SyncResult syncresult)
        {
            syncResult = syncresult;
            mOperations = new ArrayList();
        }
    }

    public static final class GamesSystemStats
    {

        public long lastPlayedTimestampMillis;
        public int numInstalledGames;
        public int numSignedInGames;

        public GamesSystemStats()
        {
        }
    }


    private static final String GSYNC_DEPRECATED_AUTHORITIES[] = {
        "com.google.android.gms.games.notification"
    };
    private static final String GSYNC_FEED_PROJECTION[] = {
        "_id", "feed"
    };
    private static final String GSYNC_REQUIRED_FEEDS[] = {
        "http://games.google.com/sync/match/%s", "http://games.google.com/sync/request/%s"
    };
    private static final Object PENDING_OPS_LOCK = new Object();
    private static final Bundle SYNC_EXTRAS_EMPTY = new Bundle();
    private static final Bundle SYNC_EXTRAS_FINE_GRAINED;
    private static final Bundle SYNC_EXTRAS_MANUAL;
    static final Bundle SYNC_EXTRAS_PERIODIC;
    private final Context mAppContext = getContext().getApplicationContext();

    public GamesSyncAdapter(Context context)
    {
        super(context, "com.google.android.gms.games.background");
    }

    private static boolean isMatchTickle(Bundle bundle)
    {
        if (!isTickleSync(bundle))
        {
            return false;
        } else
        {
            long l = AndroidUtils.getAndroidId$faab219();
            return String.format(bundle.getString("feed"), new Object[] {
                Long.valueOf(l)
            }).equals(String.format("http://games.google.com/sync/match/%s", new Object[] {
                Long.valueOf(l)
            }));
        }
    }

    private static boolean isPeriodicSync(Bundle bundle)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (bundle != null)
        {
            flag = flag1;
            if (bundle.getBoolean("peridoic_sync", false))
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean isPlusUser(Account account)
    {
        Boolean boolean1 = Boolean.valueOf(true);
        account = AccountManager.get(mAppContext).hasFeatures(account, GmsClient.GOOGLE_PLUS_REQUIRED_FEATURES, null, null);
        try
        {
            account = (Boolean)account.getResult(60L, TimeUnit.SECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            GamesLog.w("GamesSyncAdapter", "Authenticator error checking account", account);
            account = boolean1;
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            GamesLog.w("GamesSyncAdapter", "Operation canceled error checking account", account);
            account = boolean1;
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            GamesLog.w("GamesSyncAdapter", "IO error checking account", account);
            account = boolean1;
        }
        if (account != null)
        {
            return account.booleanValue();
        } else
        {
            return true;
        }
    }

    private static boolean isRequestTickle(Bundle bundle)
    {
        if (!isTickleSync(bundle))
        {
            return false;
        } else
        {
            long l = AndroidUtils.getAndroidId$faab219();
            return String.format(bundle.getString("feed"), new Object[] {
                Long.valueOf(l)
            }).equals(String.format("http://games.google.com/sync/request/%s", new Object[] {
                Long.valueOf(l)
            }));
        }
    }

    private static boolean isTickleSync(Bundle bundle)
    {
        if (bundle == null)
        {
            return false;
        } else
        {
            return bundle.containsKey("feed");
        }
    }

    public static void requestSync$1221cb0a(ClientContext clientcontext)
    {
        clientcontext = clientcontext.getResolvedAccountName();
        Bundle bundle = SYNC_EXTRAS_EMPTY;
        if (clientcontext != null)
        {
            ContentResolver.requestSync(new Account(clientcontext, "com.google"), "com.google.android.gms.games.background", bundle);
        }
    }

    public static void requestTickleSync$faab20d()
    {
        GamesLog.i("GamesSyncAdapter", "Forced tickle syncs are deprecated, ignoring request.");
    }

    private static void setSyncEnabled(Account account, String s, boolean flag)
    {
        if (ContentResolver.getIsSyncable(account, s) < 0 || flag)
        {
            ContentResolver.setIsSyncable(account, s, 1);
        }
        ContentResolver.setSyncAutomatically(account, s, true);
        ContentResolver.removePeriodicSync(account, s, Bundle.EMPTY);
    }

    public static void setSyncEnabled(Account account, boolean flag)
    {
        setSyncEnabled(account, "com.google.android.gms.games.background", flag);
        setSyncEnabled(account, "com.google.android.gms.games", flag);
    }

    public static void setUpPeriodicSync(Context context, Account account)
    {
        boolean flag = true;
        long l = ((Long)G.periodicSyncPeriodSecondsV2.get()).longValue();
        GamesLog.d("GamesSyncAdapter", (new StringBuilder("Establishing sync with period ")).append(l).toString());
        boolean flag1;
        if (account != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "Can't setup periodic sync for null account.");
        if (ClientLibraryUtils.getClientVersion(context, "com.google.android.gms") < 0x7704c0)
        {
            flag = false;
        }
        if (flag)
        {
            ContentResolver.removePeriodicSync(account, "com.google.android.gms.games.background", SYNC_EXTRAS_PERIODIC);
            PlayGamesSyncServiceMain.requestSync(context, Agents.buildFirstPartyClientContext(context, account.name));
            return;
        } else
        {
            ContentResolver.addPeriodicSync(account, "com.google.android.gms.games.background", SYNC_EXTRAS_PERIODIC, l);
            return;
        }
    }

    private boolean syncInner$6414e2e7(DataBroker databroker, Account account, Bundle bundle, String s, GamesSyncResult gamessyncresult)
    {
        Object obj;
        ClientContext clientcontext;
        boolean flag;
        boolean flag2;
        boolean flag3;
        if (bundle != null && bundle.getBoolean("initialize", false))
        {
            setSyncEnabled(account, false);
            return true;
        }
        if (!AccountUtils.ensureAccountExists(mAppContext, account.name))
        {
            GamesLog.i("GamesSyncAdapter", "Sync for NON-EXISTENT ACCOUNT");
            return false;
        }
        if ("com.google.android.gms.games".equals(s) && !isMatchTickle(bundle) && !isRequestTickle(bundle))
        {
            GamesLog.d("GamesSyncAdapter", "Syncing notifications without tickle; exiting");
            return false;
        }
        if (!isPlusUser(account))
        {
            GamesLog.w("GamesSyncAdapter", "User is not G+ enabled. Aborting sync");
            return false;
        }
        clientcontext = Agents.buildFirstPartyClientContext(mAppContext, account.name);
        flag3 = isPeriodicSync(bundle);
        if (bundle != null && bundle.getBoolean("fine_grained_sync", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag3 && !((Boolean)G.allowPeriodicSyncs.get()).booleanValue())
        {
            GamesLog.w("GamesSyncAdapter", "Periodic syncs are disabled. Bailing.");
            return false;
        }
        if (!isTickleSync(bundle) && !databroker.hasRecentGameActivity(mAppContext, clientcontext) && !((Boolean)G.ignoreSyncRecentActivityCheck.get()).booleanValue())
        {
            GamesLog.d("GamesSyncAdapter", "User has not gamed recently; ignoring sync");
            return false;
        }
        obj = databroker.getBackgroundGamesContext(mAppContext, clientcontext);
        flag2 = false;
        boolean flag1;
        databroker.getExperiments(((GamesClientContext) (obj)));
        flag1 = databroker.checkRevision(mAppContext, clientcontext);
        gamessyncresult.addOp(1);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_289;
        }
        GamesLog.e("GamesSyncAdapter", "Failed revision check during sync. Your version of Google Play services is out of date.");
        bundle = gamessyncresult.syncResult.stats;
        bundle.numAuthExceptions = ((SyncStats) (bundle)).numAuthExceptions + 1L;
        return false;
        String s1;
        ClientContext clientcontext1;
        Context context;
        clientcontext1 = ((GamesClientContext) (obj)).mClientContext;
        context = ((GamesClientContext) (obj)).mContext;
        s = DataBroker.fetchPlayerIdFromAccountWhenMissing(((GamesClientContext) (obj)));
        s1 = s.getExternalPlayerId();
        if (s.canResolveCurrentPlayerId()) goto _L2; else goto _L1
_L1:
        DataHolder dataholder = databroker.loadSelf(s);
        s = s1;
        if (dataholder.mRowCount <= 0)
        {
            break MISSING_BLOCK_LABEL_377;
        }
        s = s1;
        if (dataholder.mRowCount > 0)
        {
            s = (new PlayerBuffer(dataholder)).get(0).getPlayerId();
        }
        dataholder.close();
        if (s != null) goto _L4; else goto _L3
_L3:
        GamesLog.e("DataBroker", "Unable to load profile for player!");
_L2:
        gamessyncresult.addOp(2);
        if (!isMatchTickle(bundle)) goto _L6; else goto _L5
_L5:
        databroker.syncMatches(((GamesClientContext) (obj)), gamessyncresult);
        databroker.forceResolveGames(((GamesClientContext) (obj)), gamessyncresult);
        flag1 = true;
_L7:
        bundle = ((Bundle) (obj));
        if (((GamesClientContext) (obj)).mExternalCurrentPlayerId == null)
        {
            bundle = databroker.getBackgroundGamesContext(mAppContext, clientcontext);
        }
        s = ((GamesClientContext) (bundle)).mExternalCurrentPlayerId;
        obj = UriUtils.getDataStoreNameFromClientContext(clientcontext);
        s1 = account.name;
        gamessyncresult = databroker.getNotifications(mAppContext, ((String) (obj)));
        GamesNotificationHelper.updateNotifications(mAppContext, ((String) (obj)), s1, s, gamessyncresult);
        gamessyncresult.close();
        databroker.searchForInstalledGames(bundle);
        setUpPeriodicSync(mAppContext, account);
        if (flag3 || flag)
        {
            if (databroker.hasExpiringQuests(bundle, ((Long)G.periodicSyncPeriodSecondsV2.get()).longValue()))
            {
                long l = ((Long)G.periodicFineSyncPeriodSeconds.get()).longValue();
                GamesLog.d("GamesSyncAdapter", (new StringBuilder("Establishing fine grained sync with period ")).append(l).toString());
                AccountAgent accountagent;
                if (account != null)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                Preconditions.checkArgument(flag2, "Can't setup fine grain periodic sync for null account.");
                ContentResolver.addPeriodicSync(account, "com.google.android.gms.games.background", SYNC_EXTRAS_FINE_GRAINED, l);
            } else
            {
                ContentResolver.removePeriodicSync(account, "com.google.android.gms.games.background", SYNC_EXTRAS_FINE_GRAINED);
            }
        }
        if (flag3)
        {
            databroker = databroker.getSystemStats(bundle);
            s = ((GamesClientContext) (bundle)).mClientContext.getResolvedAccountName();
            GamesPlayLogger.logSystemStats(((GamesClientContext) (bundle)).mContext, s, ((GamesSystemStats) (databroker)).numInstalledGames, ((GamesSystemStats) (databroker)).numSignedInGames, ((GamesSystemStats) (databroker)).lastPlayedTimestampMillis);
        }
        updateGsyncFeeds(mAppContext, account);
        return flag1;
        bundle;
        try
        {
            dataholder.close();
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            GamesLog.e("GamesSyncAdapter", (new StringBuilder("Auth error executing an operation: ")).append(bundle).toString());
            bundle = gamessyncresult.syncResult.stats;
            bundle.numAuthExceptions = ((SyncStats) (bundle)).numAuthExceptions + 1L;
            flag1 = flag2;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            GamesLog.e("GamesSyncAdapter", ((GamesException) (bundle)).mLogMessage, bundle);
            flag1 = flag2;
            if (((GamesException) (bundle)).mInternalStatusCode == 1003)
            {
                databroker.clearRevisionCheck(mAppContext);
                flag1 = flag2;
            }
        }
          goto _L7
_L4:
        accountagent = databroker.mAccountAgent;
        if (AccountAgent.saveAccountToDatabase(context, clientcontext1, s) == null)
        {
            GamesLog.e("AccountAgent", (new StringBuilder("Error recording account name ")).append(com.google.android.gms.games.util.AccountUtils.getResolvedAccountName(clientcontext1)).toString());
        }
          goto _L2
_L6:
        if (!isRequestTickle(bundle))
        {
            break MISSING_BLOCK_LABEL_836;
        }
        databroker.syncRequests(((GamesClientContext) (obj)), gamessyncresult);
        databroker.forceResolveGames(((GamesClientContext) (obj)), gamessyncresult);
        flag1 = true;
          goto _L7
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_855;
        }
        databroker.notifyQuests(((GamesClientContext) (obj)), gamessyncresult);
        flag1 = true;
          goto _L7
        syncPendingData(((GamesClientContext) (obj)), databroker, gamessyncresult, flag3);
        flag1 = true;
          goto _L7
        databroker;
        gamessyncresult.close();
        throw databroker;
          goto _L2
    }

    public static void syncPendingData(GamesClientContext gamesclientcontext, DataBroker databroker, GamesSyncResult gamessyncresult, boolean flag)
        throws GoogleAuthException
    {
        Object obj2 = PENDING_OPS_LOCK;
        obj2;
        JVM INSTR monitorenter ;
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mLeaderboardAgent
        });
        LeaderboardAgent leaderboardagent = databroker.mLeaderboardAgent;
        SyncResult syncresult = gamessyncresult.syncResult;
        if (!leaderboardagent.flushPendingScores(gamesclientcontext, null))
        {
            SyncStats syncstats = syncresult.stats;
            syncstats.numIoExceptions = syncstats.numIoExceptions + 1L;
        }
        gamessyncresult.addOp(5);
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mLeaderboardAgent
        });
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mAchievementAgent
        });
        databroker.mAchievementAgent.submitPendingAchievementOps(gamesclientcontext, gamessyncresult.syncResult);
        gamessyncresult.addOp(6);
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mAchievementAgent
        });
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mRequestAgent
        });
        RequestAgent requestagent = databroker.mRequestAgent;
        SyncResult syncresult1 = gamessyncresult.syncResult;
        if (requestagent.flushPendingOps(gamesclientcontext) != 0)
        {
            SyncStats syncstats1 = syncresult1.stats;
            syncstats1.numIoExceptions = syncstats1.numIoExceptions + 1L;
        }
        gamessyncresult.addOp(8);
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mRequestAgent
        });
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mMultiplayerAgent
        });
        databroker.mTurnBasedAgent.submitPendingMatches(gamesclientcontext, gamessyncresult.syncResult);
        gamessyncresult.addOp(9);
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mMultiplayerAgent
        });
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mGameAgent.mApplicationSessionLock
        });
        int i;
        i = databroker.mGameAgent.submitPendingApplicationSession(gamesclientcontext);
        gamessyncresult.addOp(4);
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mGameAgent.mApplicationSessionLock
        });
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        SyncStats syncstats2 = gamessyncresult.syncResult.stats;
        syncstats2.numIoExceptions = syncstats2.numIoExceptions + 1L;
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mEventAgent
        });
        Object obj;
        Object obj1;
        Object obj3;
        obj1 = databroker.mEventAgent;
        obj = gamessyncresult.syncResult;
        obj3 = com.google.android.gms.games.provider.GamesContractInternal.EventPendingOps.getContentUri(gamesclientcontext.mClientContext);
        ((EventAgent) (obj1)).sendPendingOpsInternal(gamesclientcontext, ((Uri) (obj3)));
_L6:
        gamessyncresult.addOp(7);
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mEventAgent
        });
        databroker.notifyQuests(gamesclientcontext, gamessyncresult);
        if (!flag) goto _L2; else goto _L1
_L1:
        databroker.loadSelf(gamesclientcontext).close();
        gamessyncresult.addOp(3);
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mGameAgent.mHiddenLock
        });
        obj = null;
        obj1 = databroker.mGameAgent.loadGameCollection(gamesclientcontext, 25, 7, false);
        obj = obj1;
        i = ((DataHolder) (obj1)).mStatusCode;
        obj = obj1;
        gamessyncresult.addOp(10);
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mGameAgent.mHiddenLock
        });
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        ((DataHolder) (obj1)).close();
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_518;
        }
        obj = gamessyncresult.syncResult.stats;
        obj.numIoExceptions = ((SyncStats) (obj)).numIoExceptions + 1L;
        obj = gamesclientcontext.mContext;
        obj1 = gamesclientcontext.mClientContext;
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mPlayerAgent
        });
        if (gamesclientcontext.mForceReload)
        {
            ApiRateLimitUtil.clearSyncTimestamp(databroker.mPlayerAgent);
        }
        int j;
        if (databroker.mPlayerAgent.syncPlayerLevelTable(((Context) (obj)), ((ClientContext) (obj1))) == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        gamessyncresult.addOp(11);
        obj3 = databroker.mPlayerAgent;
        if (!ApiRateLimitUtil.isSyncRateLimited(((Lockable) (obj3)), ((Long)G.tickleSyncThresholdMillis.get()).longValue(), false)) goto _L4; else goto _L3
_L3:
        GamesLog.i("PlayerAgent", "Returning cached entities");
          goto _L5
_L11:
        gamessyncresult.addOp(12);
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mPlayerAgent
        });
        if ((j & (i & true)) != 0)
        {
            break MISSING_BLOCK_LABEL_671;
        }
        obj = gamessyncresult.syncResult.stats;
        obj.numIoExceptions = ((SyncStats) (obj)).numIoExceptions + 1L;
        databroker.refreshQuests(gamesclientcontext, gamessyncresult);
_L2:
        databroker.refreshGameData(gamesclientcontext, gamessyncresult);
        obj2;
        JVM INSTR monitorexit ;
        return;
        gamesclientcontext;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mLeaderboardAgent
        });
        throw gamesclientcontext;
        gamesclientcontext;
        obj2;
        JVM INSTR monitorexit ;
        throw gamesclientcontext;
        gamesclientcontext;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mAchievementAgent
        });
        throw gamesclientcontext;
        gamesclientcontext;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mRequestAgent
        });
        throw gamesclientcontext;
        gamesclientcontext;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mMultiplayerAgent
        });
        throw gamesclientcontext;
        gamesclientcontext;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mGameAgent.mApplicationSessionLock
        });
        throw gamesclientcontext;
        obj1;
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(((VolleyError) (obj1)), "EventAgent");
        }
        obj = ((SyncResult) (obj)).stats;
        obj.numIoExceptions = ((SyncStats) (obj)).numIoExceptions + 1L;
          goto _L6
        gamesclientcontext;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mEventAgent
        });
        throw gamesclientcontext;
        gamesclientcontext;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mGameAgent.mHiddenLock
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_866;
        }
        ((DataHolder) (obj)).close();
        throw gamesclientcontext;
_L4:
        com.google.android.gms.games.broker.PlayerAgent.SyncNetworkResponse syncnetworkresponse;
        syncnetworkresponse = ((PlayerAgent) (obj3)).syncXpEventsFromNetwork(((Context) (obj)), ((ClientContext) (obj1)), Agents.getSyncToken(((Context) (obj)), ((ClientContext) (obj1)), PlayerAgent.XP_SYNC_TOKEN_PROJECTION));
        GamesLog.d("PlayerAgent", (new StringBuilder("Received ")).append(syncnetworkresponse.mExperiences.size()).append(" requests during sync").toString());
        if (syncnetworkresponse.mStatusCode == 0) goto _L8; else goto _L7
_L7:
        j = syncnetworkresponse.mStatusCode;
          goto _L9
_L8:
        ArrayList arraylist;
        String s;
        arraylist = new ArrayList();
        s = syncnetworkresponse.mNewSyncToken;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_995;
        }
        arraylist.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(((ClientContext) (obj1)))).withValue("request_sync_token", s).build());
        ((PlayerAgent) (obj3)).addXpEventOps(((Context) (obj)), ((ClientContext) (obj1)), syncnetworkresponse.mExperiences, arraylist);
        flag = true;
        if (arraylist.size() > 0)
        {
            flag = Agents.applyContentOperations(((Context) (obj)).getContentResolver(), arraylist, "PlayerAgent");
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_1048;
        }
        GamesLog.e("PlayerAgent", "Failed to store experiences from sync");
        PlayerAgent.trimExperienceEvents(((Context) (obj)), ((ClientContext) (obj1)));
        if (!flag) goto _L5; else goto _L10
_L10:
        ApiRateLimitUtil.updateSyncTimestamp(((Lockable) (obj3)));
          goto _L5
        gamesclientcontext;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mPlayerAgent
        });
        throw gamesclientcontext;
_L13:
        j = 0;
          goto _L11
_L5:
        j = 0;
_L9:
        if (j != 0) goto _L13; else goto _L12
_L12:
        j = 1;
          goto _L11
    }

    public static boolean updateGsyncFeeds(Context context, Account account)
    {
        ArrayList arraylist;
        String s;
        Cursor cursor;
        long l;
        l = AndroidUtils.getAndroidId$faab219();
        if (l <= 0L)
        {
            GamesLog.e("GamesSyncAdapter", "Unable to retrieve ID, failed to register for notifications.");
            return false;
        }
        arraylist = new ArrayList();
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gsf.SubscribedFeeds.Feeds.CONTENT_URI).withSelection("authority=?", GSYNC_DEPRECATED_AUTHORITIES).build());
        s = account.name;
        context = context.getContentResolver();
        account = new ArrayMap();
        cursor = context.query(com.google.android.gsf.SubscribedFeeds.Feeds.CONTENT_URI, GSYNC_FEED_PROJECTION, "_sync_account=? AND authority=?", new String[] {
            s, "com.google.android.gms.games"
        }, null);
        while (cursor.moveToNext()) 
        {
            account.put(cursor.getString(1), Long.valueOf(cursor.getLong(0)));
        }
        break MISSING_BLOCK_LABEL_147;
        context;
        cursor.close();
        throw context;
        cursor.close();
        int i = 0;
        while (i < 2) 
        {
            String s1 = String.format(GSYNC_REQUIRED_FEEDS[i], new Object[] {
                Long.valueOf(l)
            });
            if (account.containsKey(s1))
            {
                account.remove(s1);
            } else
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("_sync_account", s);
                contentvalues.put("_sync_account_type", "com.google");
                contentvalues.put("feed", s1);
                contentvalues.put("service", "games");
                contentvalues.put("authority", "com.google.android.gms.games");
                arraylist.add(ContentProviderOperation.newInsert(com.google.android.gsf.SubscribedFeeds.Feeds.CONTENT_URI).withValues(contentvalues).build());
            }
            i++;
        }
        String s2;
        for (Iterator iterator = account.keySet().iterator(); iterator.hasNext(); arraylist.add(ContentProviderOperation.newDelete(ContentUris.withAppendedId(com.google.android.gsf.SubscribedFeeds.Feeds.CONTENT_URI, ((Long)account.get(s2)).longValue())).build()))
        {
            s2 = (String)iterator.next();
        }

        if (arraylist.size() > 0)
        {
            try
            {
                context.applyBatch(com.google.android.gsf.SubscribedFeeds.Feeds.CONTENT_URI.getAuthority(), arraylist);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new AssertionError(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                GamesLog.e("GamesSyncAdapter", (new StringBuilder("Error applying batch operation: ")).append(context).toString());
                return false;
            }
        }
        return true;
    }

    final boolean checkAndPerformSync$3950bc19(Account account, Bundle bundle, String s, GamesSyncResult gamessyncresult)
    {
        Object obj;
        long l;
        boolean flag;
        if (((Boolean)G.capturingNetwork.get()).booleanValue())
        {
            GamesLog.w("GamesSyncAdapter", "Aborting sync attempt during network capture");
            return false;
        }
        if (((Boolean)G.disableBackgroundSync.get()).booleanValue())
        {
            GamesLog.w("GamesSyncAdapter", "Games sync is disabled - skipping sync");
            return false;
        }
        if (PackageUtils.isPackageRestricted(getContext(), "com.google.android.play.games"))
        {
            GamesLog.i("GamesSyncAdapter", "In restricted profile; skipping sync.");
            return false;
        }
        if (AccountUtils.isUnicornAccount(getContext(), account.name))
        {
            GamesLog.i("GamesSyncAdapter", "Restricted account; skipping sync.");
            return false;
        }
        flag = false;
        l = SystemClock.elapsedRealtime();
        GamesLog.pii("GamesSyncAdapter", (new StringBuilder("Starting sync for ")).append(account.name).toString());
        GamesLog.i("GamesSyncAdapter", (new StringBuilder("Starting sync for ")).append(Integer.toHexString(account.name.hashCode())).toString());
        obj = DataBroker.acquireBroker(mAppContext);
        boolean flag1 = syncInner$6414e2e7(((DataBroker) (obj)), account, bundle, s, gamessyncresult);
        flag = flag1;
        ((DataBroker) (obj)).release();
_L2:
        l = SystemClock.elapsedRealtime() - l;
        int i = (int)(gamessyncresult.syncResult.stats.numIoExceptions + gamessyncresult.syncResult.stats.numAuthExceptions);
        boolean flag2 = ContentResolver.isSyncPending(account, s);
        boolean flag3 = isPeriodicSync(bundle);
        String s1 = "";
        obj = s1;
        if (bundle != null)
        {
            obj = s1;
            if (bundle.containsKey("feed"))
            {
                obj = bundle.getString("feed");
            }
        }
        GamesLog.pii("GamesSyncAdapter", (new StringBuilder("Sync duration for ")).append(account.name).append(": ").append(l).toString());
        GamesLog.i("GamesSyncAdapter", (new StringBuilder("Sync duration for ")).append(Integer.toHexString(account.name.hashCode())).append(": ").append(l).toString());
        GamesPlayLogger.logSyncEvent(mAppContext, account.name, s, ((String) (obj)), l, flag, i, flag3, flag2, gamessyncresult.getOps());
        return flag;
        GamesException gamesexception;
        gamesexception;
        GamesLog.e("GamesSyncAdapter", gamesexception.mLogMessage, gamesexception);
        ((DataBroker) (obj)).release();
        if (true) goto _L2; else goto _L1
_L1:
        account;
        ((DataBroker) (obj)).release();
        throw account;
    }

    protected final boolean performSync(Account account, Bundle bundle, String s, ContentProviderClient contentproviderclient, SyncResult syncresult)
    {
        return checkAndPerformSync$3950bc19(account, bundle, s, new GamesSyncResult(syncresult));
    }

    static 
    {
        SYNC_EXTRAS_MANUAL = new Bundle();
        SYNC_EXTRAS_PERIODIC = new Bundle();
        SYNC_EXTRAS_FINE_GRAINED = new Bundle();
        SYNC_EXTRAS_MANUAL.putBoolean("force", true);
        SYNC_EXTRAS_PERIODIC.putBoolean("peridoic_sync", true);
        SYNC_EXTRAS_FINE_GRAINED.putBoolean("fine_grained_sync", true);
    }
}
