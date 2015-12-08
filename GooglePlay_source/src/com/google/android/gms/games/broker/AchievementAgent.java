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
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.util.ArrayMap;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.cache.AchievementCache;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.AchievementState;
import com.google.android.gms.games.provider.ColumnSpec;
import com.google.android.gms.games.server.api.AchievementDefinition;
import com.google.android.gms.games.server.api.AchievementDefinitionsApi;
import com.google.android.gms.games.server.api.AchievementDefinitionsApiInternal;
import com.google.android.gms.games.server.api.AchievementDefinitionsListResponse;
import com.google.android.gms.games.server.api.AchievementIncrementResponse;
import com.google.android.gms.games.server.api.AchievementRevealResponse;
import com.google.android.gms.games.server.api.AchievementSetStepsAtLeastResponse;
import com.google.android.gms.games.server.api.AchievementUnlockResponse;
import com.google.android.gms.games.server.api.AchievementUpdateMultipleRequest;
import com.google.android.gms.games.server.api.AchievementUpdateMultipleResponse;
import com.google.android.gms.games.server.api.AchievementUpdateRequest;
import com.google.android.gms.games.server.api.AchievementUpdateResponse;
import com.google.android.gms.games.server.api.AchievementsApi;
import com.google.android.gms.games.server.api.AchievementsApiInternal;
import com.google.android.gms.games.server.api.GamesAchievementIncrement;
import com.google.android.gms.games.server.api.GamesAchievementSetStepsAtLeast;
import com.google.android.gms.games.server.api.PlayerAchievement;
import com.google.android.gms.games.server.api.PlayerAchievementGetMultipleResponse;
import com.google.android.gms.games.server.api.PlayerAchievementListResponse;
import com.google.android.gms.games.service.PlayGamesUploadService;
import com.google.android.gms.games.ui.popup.AchievementPopup;
import com.google.android.gms.games.util.AccountUtils;
import com.google.android.gms.games.utils.GamesDataUtils;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, TransientCacheOwner, GamesClientContext, ApiRateLimitUtil, 
//            Agents

public final class AchievementAgent extends Lockable
    implements TransientCacheOwner
{
    private final class AchievementFlushData
    {

        public final ArrayList contentProviderOperations = new ArrayList();
        public final GamesClientContext gamesContext;
        public final AchievementUpdateMultipleRequest multipleRequest;
        final AchievementAgent this$0;
        public final ArrayList updateRequests = new ArrayList();

        public AchievementFlushData(GamesClientContext gamesclientcontext)
        {
            this$0 = AchievementAgent.this;
            super();
            boolean flag;
            if (!gamesclientcontext.mIsFirstParty)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "This should always be a 3P games context");
            gamesContext = gamesclientcontext;
            multipleRequest = new AchievementUpdateMultipleRequest(updateRequests);
        }
    }

    private static final class AchievementStepData
    {

        public Bundle achievementBundle;
        public final String externalAchievementId;
        public final GamesClientContext gamesContext;
        public Uri instanceUri;
        public int newSteps;
        public final int numSteps;
        public final com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popupLocationInfo;
        public boolean popupShown;
        public int statusCode;

        public AchievementStepData(GamesClientContext gamesclientcontext, String s, int i, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
        {
            newSteps = -1;
            statusCode = -1;
            instanceUri = null;
            achievementBundle = null;
            popupShown = false;
            gamesContext = gamesclientcontext;
            externalAchievementId = s;
            numSteps = i;
            popupLocationInfo = popuplocationinfo;
        }
    }

    public static final class AchievementUpdateResult
    {

        public final int statusCode;
        public final long xpGained;

        public AchievementUpdateResult(int i)
        {
            this(i, 0L);
        }

        public AchievementUpdateResult(int i, long l)
        {
            statusCode = i;
            xpGained = l;
        }
    }

    private static interface IncrementQuery
    {

        public static final String PROJECTION[] = {
            "total_steps", "current_steps", "state"
        };

    }

    static interface PendingOpsQuery
    {

        public static final String PROJECTION[] = {
            "_id", "external_achievement_id", "new_state", "steps_to_increment", "min_steps_to_set", "package_name", "package_uid", "external_game_id", "external_player_id"
        };

    }

    private static interface TypeQuery
    {

        public static final String PROJECTION[] = {
            "_id", "type"
        };

    }


    private static final ColumnSpec ACHIEVEMENT_DATA_SPEC;
    private static final ColumnSpec ACHIEVEMENT_DEFINITION_SPEC;
    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private final AchievementCache mAchievementCache;
    private final AchievementDefinitionsApi mDefinitionsApi;
    private final AchievementDefinitionsApiInternal mDefinitionsApiInternal;
    private final AchievementsApi mInstancesApi;
    private final AchievementsApiInternal mInstancesApiInternal;
    private final Random mRandom = new Random(DefaultClock.getInstance().currentTimeMillis());

    public AchievementAgent(Lockable lockable, BaseApiaryServer baseapiaryserver, BaseApiaryServer baseapiaryserver1)
    {
        super("AchievementAgent", LOCK, lockable);
        mInstancesApi = new AchievementsApi(baseapiaryserver);
        mDefinitionsApi = new AchievementDefinitionsApi(baseapiaryserver);
        mInstancesApiInternal = new AchievementsApiInternal(baseapiaryserver1);
        mDefinitionsApiInternal = new AchievementDefinitionsApiInternal(baseapiaryserver1);
        mAchievementCache = new AchievementCache(ACHIEVEMENT_DATA_SPEC.mColumnNames);
    }

    private static DataHolder createDefaultInstances(GamesClientContext gamesclientcontext)
    {
        ColumnSpec columnspec;
        Object obj;
        com.google.android.gms.common.data.DataHolder.Builder builder;
        ContentValues contentvalues;
        long l;
        columnspec = ColumnSpec.builder().withColumnsFrom(ACHIEVEMENT_DEFINITION_SPEC).withColumn("initial_state", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).build();
        obj = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(com.google.android.gms.games.provider.GamesContractInternal.AchievementDefinitions.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.getExternalGameId()));
        obj.mProjection = columnspec.mColumnNames;
        obj = ((Agents.QueryBuilder) (obj)).queryCursor();
        builder = DataHolder.builder(ACHIEVEMENT_DATA_SPEC.mColumnNames);
        l = DefaultClock.getInstance().currentTimeMillis();
        Object obj1 = gamesclientcontext.getExternalPlayerId();
        contentvalues = new ContentValues();
        obj1 = com.google.android.gms.games.provider.GamesContractInternal.Players.getUriForExternalPlayerId(gamesclientcontext.mClientContext, ((String) (obj1)));
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((Uri) (obj1))).query();
        extractValues$ba566be(contentvalues, ACHIEVEMENT_DATA_SPEC, gamesclientcontext);
        gamesclientcontext.close();
        contentvalues.putNull("external_player_id");
        for (; ((Cursor) (obj)).moveToNext(); builder.withRow(gamesclientcontext))
        {
            gamesclientcontext = columnspec.extractRowValues(((Cursor) (obj)));
            gamesclientcontext.put("state", gamesclientcontext.getAsInteger("initial_state"));
            gamesclientcontext.put("current_steps", Integer.valueOf(0));
            gamesclientcontext.putNull("formatted_current_steps");
            gamesclientcontext.put("last_updated_timestamp", Long.valueOf(l));
            gamesclientcontext.put("instance_xp_value", gamesclientcontext.getAsLong("definition_xp_value"));
            gamesclientcontext.putAll(contentvalues);
        }

        break MISSING_BLOCK_LABEL_237;
        gamesclientcontext;
        ((Cursor) (obj)).close();
        throw gamesclientcontext;
        Exception exception;
        exception;
        gamesclientcontext.close();
        throw exception;
        ((Cursor) (obj)).close();
        return builder.build(0);
    }

    private static void extractValues$ba566be(ContentValues contentvalues, ColumnSpec columnspec, DataHolder dataholder)
    {
        String as[];
        int i;
        int j;
        j = dataholder.getWindowIndex(0);
        as = columnspec.mColumnNames;
        i = 0;
_L8:
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        if (!dataholder.hasColumn(as[i])) goto _L2; else goto _L1
_L1:
        static final class _cls1
        {

            static final int $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[];

            static 
            {
                $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType = new int[com.google.android.gms.games.provider.ColumnSpec.DataType.values().length];
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[com.google.android.gms.games.provider.ColumnSpec.DataType.LONG.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[com.google.android.gms.games.provider.ColumnSpec.DataType.STRING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.google.android.gms.games.provider.ColumnSpec.DataType[columnspec.getColumnDataType(as[i]).ordinal()];
        JVM INSTR tableswitch 1 3: default 76
    //                   1 85
    //                   2 110
    //                   3 135;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_135;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L2:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        contentvalues.put(as[i], Integer.valueOf(dataholder.getInteger(as[i], 0, j)));
          goto _L2
_L5:
        contentvalues.put(as[i], Long.valueOf(dataholder.getLong(as[i], 0, j)));
          goto _L2
        contentvalues.put(as[i], dataholder.getString(as[i], 0, j));
          goto _L2
    }

    private boolean flushPendingOp(Context context, ClientContext clientcontext, AchievementFlushData achievementflushdata)
        throws GoogleAuthException
    {
        boolean flag1 = true;
        Object obj;
        GamesLog.i("AchievementAgent", "Sending achievement batch...");
        obj = mInstancesApi;
        AchievementUpdateMultipleRequest achievementupdatemultiplerequest = achievementflushdata.multipleRequest;
        obj = ((AchievementUpdateMultipleResponse)((AchievementsApi) (obj)).mServer.getResponseBlocking(clientcontext, 1, "achievements/updateMultiple", achievementupdatemultiplerequest, com/google/android/gms/games/server/api/AchievementUpdateMultipleResponse)).getUpdatedAchievements().iterator();
_L8:
        boolean flag2 = flag1;
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        AchievementUpdateResponse achievementupdateresponse;
        achievementupdateresponse = (AchievementUpdateResponse)((Iterator) (obj)).next();
        GamesLog.i("AchievementAgent", String.format("Achievement batch response [ID=%s, state=%s]", new Object[] {
            achievementupdateresponse.getAchievementId(), achievementupdateresponse.getCurrentState()
        }));
        long l;
        boolean flag;
        if (achievementflushdata.gamesContext.mExternalTargetGameId != null && achievementflushdata.gamesContext.getExternalPlayerId() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        clientcontext = achievementupdateresponse.getAchievementId();
        l = achievementflushdata._fld0.forceResolveInstanceId(achievementflushdata.gamesContext, clientcontext);
        if (l != -1L) goto _L4; else goto _L3
_L3:
        GamesLog.w("AchievementAgent", (new StringBuilder("Could not find instance for ")).append(clientcontext).toString());
        clientcontext = null;
_L6:
        if (clientcontext != null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        GamesLog.w("AchievementAgent", "Failed to find instance data for achievement");
        flag1 = true;
        updateLocalSteps(achievementflushdata.gamesContext.mContext, clientcontext, (Integer)((FastMapJsonResponse) (achievementupdateresponse)).mValues.get("currentSteps"), ((Boolean)((FastMapJsonResponse) (achievementupdateresponse)).mValues.get("newlyUnlocked")).booleanValue(), achievementupdateresponse.getCurrentState());
        ApiRateLimitUtil.clearUriTimestamp(getCacheUri(achievementflushdata.gamesContext));
        continue; /* Loop/switch isn't completed */
        context;
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(context, "AchievementAgent");
        }
        if (!ErrorUtils.isTransientError(context))
        {
            break; /* Loop/switch isn't completed */
        }
        GamesLog.i("AchievementAgent", "Could not submit pending operations, will try again later");
        flag2 = false;
_L2:
        return flag2;
_L4:
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.AchievementInstances.getUriForId(achievementflushdata.gamesContext.mClientContext, l);
        if (true) goto _L6; else goto _L5
_L5:
        GamesLog.e("AchievementAgent", "Encountered hard error while submitting pending operations.");
        return true;
        clientcontext;
        logWtf(context, "Failed to flush operation", clientcontext);
        return true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private long forceResolveInstanceId(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        long l1 = resolveInstanceId(gamesclientcontext, s);
        String s1 = gamesclientcontext.mExternalCurrentPlayerId;
        long l = l1;
        if (l1 == -1L)
        {
            GamesLog.w("AchievementAgent", "forceResolveInstanceId did not find instance");
            refreshDefinitions(gamesclientcontext);
            if (refreshInstances(gamesclientcontext) != 0)
            {
                GamesLog.w("AchievementAgent", (new StringBuilder("Inserting a local stub for achievement instance for game ")).append(gamesclientcontext.mExternalTargetGameId).append(", achievement ").append(s).append(", and player ").append(s1).toString());
                Pair pair = getDefinitionType(gamesclientcontext, s);
                long l2;
                if (pair == null)
                {
                    GamesLog.e("AchievementAgent", (new StringBuilder("Could not find definition for ")).append(s).toString());
                } else
                {
                    ContentValues contentvalues = new ContentValues();
                    contentvalues.put("definition_id", (Long)pair.first);
                    contentvalues.put("player_id", Long.valueOf(gamesclientcontext.resolveCurrentPlayerId()));
                    contentvalues.put("state", Integer.valueOf(1));
                    if (((Integer)pair.second).intValue() == 1)
                    {
                        contentvalues.put("current_steps", Integer.valueOf(0));
                        contentvalues.put("formatted_current_steps", "0");
                    }
                    gamesclientcontext.mContext.getContentResolver().insert(com.google.android.gms.games.provider.GamesContractInternal.AchievementInstances.getContentUri(gamesclientcontext.mClientContext), contentvalues);
                }
            }
            l2 = resolveInstanceId(gamesclientcontext, s);
            l = l2;
            if (l2 == -1L)
            {
                logWtf(gamesclientcontext.mContext, (new StringBuilder("Cannot find achievement instance to update; Game: ")).append(gamesclientcontext.mExternalTargetGameId).append(", Achievement: ").append(s).append(", Player: ").append(s1).toString(), new Throwable());
                l = l2;
            }
        }
        return l;
    }

    private static Bundle getAchievementBundle(GamesClientContext gamesclientcontext, String s)
    {
        QuerySpec queryspec = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.AchievementInstances.getContentUri(gamesclientcontext.mClientContext));
        queryspec.addWhere("external_achievement_id", s, "=?");
        gamesclientcontext = new Agents.QueryBuilder(gamesclientcontext);
        gamesclientcontext.mQuery = queryspec;
        s = new AchievementBuffer(gamesclientcontext.query());
        gamesclientcontext = null;
        Achievement achievement;
        if (s.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        achievement = s.get(0);
        gamesclientcontext = new Bundle();
        gamesclientcontext.putParcelable("com.google.android.gms.games.ACHIEVEMENT", (Parcelable)achievement.freeze());
        s.release();
        return gamesclientcontext;
        gamesclientcontext;
_L2:
        s.release();
        throw gamesclientcontext;
        gamesclientcontext;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static long getAchievementXpValue(GamesClientContext gamesclientcontext, String s)
    {
        s = com.google.android.gms.games.provider.GamesContractInternal.AchievementDefinitions.getUriForExternalAchievementId(gamesclientcontext.mClientContext, s);
        return Agents.queryLong$34bc2a06(gamesclientcontext.mContext, s, "definition_xp_value");
    }

    private static Uri getCacheUri(GamesClientContext gamesclientcontext)
    {
        return com.google.android.gms.games.provider.GamesContractInternal.AchievementInstances.getUriForExternalPlayerAndGameId(gamesclientcontext.mClientContext, gamesclientcontext.getExternalGameId(), gamesclientcontext.getExternalPlayerId());
    }

    private static Pair getDefinitionType(GamesClientContext gamesclientcontext, String s)
    {
        int i;
        long l;
        l = -1L;
        i = -1;
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(com.google.android.gms.games.provider.GamesContractInternal.AchievementDefinitions.getContentUri(gamesclientcontext.mClientContext), "external_achievement_id=?", new String[] {
            s
        });
        gamesclientcontext.mProjection = TypeQuery.PROJECTION;
        gamesclientcontext = gamesclientcontext.queryCursor();
        if (gamesclientcontext.moveToFirst())
        {
            l = gamesclientcontext.getLong(0);
            i = gamesclientcontext.getInt(1);
        }
        gamesclientcontext.close();
        if (l == -1L || i == -1)
        {
            return null;
        } else
        {
            return new Pair(Long.valueOf(l), Integer.valueOf(i));
        }
        s;
        gamesclientcontext.close();
        throw s;
    }

    private static boolean isAchievementDefinitionLocal(GamesClientContext gamesclientcontext, String s)
    {
        s = com.google.android.gms.games.provider.GamesContractInternal.AchievementDefinitions.getUriForExternalAchievementId(gamesclientcontext.mClientContext, s);
        return Agents.getCount(gamesclientcontext.mContext, s) == 1L;
    }

    private static void logWtf(Context context, String s, Throwable throwable)
    {
        GamesLog.wtf(context, "AchievementAgent", s, throwable);
    }

    private long performLocalIncrement(AchievementStepData achievementstepdata, boolean flag, boolean flag1)
        throws GoogleAuthException
    {
        GamesClientContext gamesclientcontext;
        Object obj;
        int i;
        int j;
        int k;
        gamesclientcontext = achievementstepdata.gamesContext;
        obj = getDefinitionType(gamesclientcontext, achievementstepdata.externalAchievementId);
        if (obj == null)
        {
            GamesLog.w("AchievementAgent", (new StringBuilder("Unknown achievement ")).append(achievementstepdata.externalAchievementId).toString());
            achievementstepdata.statusCode = 3001;
            return -1L;
        }
        if (((Integer)((Pair) (obj)).second).intValue() != 1)
        {
            GamesLog.w("AchievementAgent", (new StringBuilder("Achievement ")).append(achievementstepdata.externalAchievementId).append(" is not incremental.").toString());
            achievementstepdata.statusCode = 3002;
            return -1L;
        }
        long l1 = forceResolveInstanceId(gamesclientcontext, achievementstepdata.externalAchievementId);
        if (l1 == -1L)
        {
            GamesLog.w("AchievementAgent", (new StringBuilder("Could not find instance for ")).append(achievementstepdata.externalAchievementId).toString());
            achievementstepdata.statusCode = 3001;
            return -1L;
        }
        achievementstepdata.achievementBundle = getAchievementBundle(gamesclientcontext, achievementstepdata.externalAchievementId);
        achievementstepdata.instanceUri = ContentUris.withAppendedId(com.google.android.gms.games.provider.GamesContractInternal.AchievementInstances.getContentUri(gamesclientcontext.mClientContext), l1);
        obj = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(achievementstepdata.instanceUri);
        obj.mProjection = IncrementQuery.PROJECTION;
        obj = ((Agents.QueryBuilder) (obj)).queryCursor();
        j = -1;
        i = -1;
        k = -1;
        if (((Cursor) (obj)).moveToFirst())
        {
            j = ((Cursor) (obj)).getInt(0);
            i = ((Cursor) (obj)).getInt(1);
            k = ((Cursor) (obj)).getInt(2);
        }
        ((Cursor) (obj)).close();
        if (k == 0)
        {
            if (((Boolean)G.alwaysShowAchievements.get()).booleanValue())
            {
                AchievementPopup.show(achievementstepdata.gamesContext, achievementstepdata.popupLocationInfo, achievementstepdata.achievementBundle);
            }
            achievementstepdata.statusCode = 0;
            return -1L;
        }
        break MISSING_BLOCK_LABEL_345;
        achievementstepdata;
        ((Cursor) (obj)).close();
        throw achievementstepdata;
        if (!flag && i >= achievementstepdata.numSteps)
        {
            achievementstepdata.statusCode = 0;
            return -1L;
        }
        if (j == -1 || i == -1)
        {
            GamesLog.e("AchievementAgent", "Unable to find state record for incremental achievement");
            achievementstepdata.statusCode = 3001;
            return -1L;
        }
        int i1 = achievementstepdata.numSteps;
        int l;
        if (flag)
        {
            l = i;
        } else
        {
            l = 0;
        }
        achievementstepdata.newSteps = Math.min(j, l + i1);
        if (flag && achievementstepdata.newSteps < 0)
        {
            achievementstepdata.newSteps = j;
        }
        if (i < j && achievementstepdata.newSteps == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!updateLocalSteps(achievementstepdata.gamesContext.mContext, achievementstepdata.instanceUri, Integer.valueOf(achievementstepdata.newSteps), flag, null))
        {
            GamesLog.e("AchievementAgent", "Unable to update incremental achievement record.");
            achievementstepdata.statusCode = 1;
            return -1L;
        }
        long l2 = 0L;
        if (flag)
        {
            achievementstepdata.achievementBundle = getAchievementBundle(gamesclientcontext, achievementstepdata.externalAchievementId);
            l2 = ((Achievement)achievementstepdata.achievementBundle.getParcelable("com.google.android.gms.games.ACHIEVEMENT")).getXpValue();
            achievementstepdata.popupShown = true;
            AchievementPopup.show(achievementstepdata.gamesContext, achievementstepdata.popupLocationInfo, achievementstepdata.achievementBundle);
        }
        if (flag1)
        {
            achievementstepdata.statusCode = flushPendingOps(achievementstepdata.gamesContext);
            return l2;
        } else
        {
            achievementstepdata.statusCode = 0;
            return l2;
        }
    }

    private static void requestDeferredSync(GamesClientContext gamesclientcontext)
    {
        PlayGamesUploadService.requestSync(gamesclientcontext.mContext, gamesclientcontext.mClientContext);
    }

    private static long resolveInstanceId(GamesClientContext gamesclientcontext, String s)
    {
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.AchievementInstances.getUriForExternalPlayerAndGameId(gamesclientcontext);
        return Agents.queryLong(gamesclientcontext.mContext, uri, "_id", "external_achievement_id=?", new String[] {
            s
        }, -1L);
    }

    private static boolean storeAchievementDefinitions(GamesClientContext gamesclientcontext, ArrayList arraylist)
    {
        long l = gamesclientcontext.resolveTargetGameId();
        ArrayList arraylist1 = new ArrayList();
        Object obj = Agents.getExternalIdToInternalIdMap(gamesclientcontext.mContext, com.google.android.gms.games.provider.GamesContractInternal.AchievementDefinitions.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId), "external_achievement_id");
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            ContentValues contentvalues = ((FastContentValuesJsonResponse) ((AchievementDefinition)arraylist.get(i))).mValues;
            contentvalues.put("game_id", Long.valueOf(l));
            contentvalues.put("sorting_rank", Integer.valueOf(i));
            ((Map) (obj)).remove(contentvalues.getAsString("external_achievement_id"));
            arraylist1.add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.AchievementDefinitions.getContentUri(gamesclientcontext.mClientContext)).withValues(contentvalues).withYieldAllowed(Agents.shouldAllowYieldAtIndex(i)).build());
        }

        for (arraylist = ((Map) (obj)).keySet().iterator(); arraylist.hasNext(); arraylist1.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.AchievementDefinitions.getUriForExternalAchievementId(gamesclientcontext.mClientContext, ((String) (obj)))).build()))
        {
            obj = (String)arraylist.next();
        }

        return Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), arraylist1, "AchievementAgent");
    }

    private boolean storeAchievementInstances(GamesClientContext gamesclientcontext, ArrayList arraylist)
    {
        Object obj;
        ContentResolver contentresolver;
        ContentValues contentvalues;
        Object obj1;
        Map map;
        ArrayList arraylist1;
        ArrayList arraylist2;
        Uri uri;
        Object obj2;
        Long long1;
        int i;
        boolean flag;
        if (arraylist == null || arraylist.size() == 0)
        {
            return true;
        }
        long l1 = gamesclientcontext.resolveTargetGameId();
        contentresolver = gamesclientcontext.mContext.getContentResolver();
        int j;
        long l;
        if (gamesclientcontext.mIsFirstParty && !gamesclientcontext.mIsFirstPartyBackground)
        {
            Preconditions.checkArgument(gamesclientcontext.canResolveTargetPlayerId(), (new StringBuilder("Missing local player ID for ")).append(gamesclientcontext.mExternalTargetPlayerId).toString());
            l = gamesclientcontext.mTargetPlayerId;
        } else
        {
            l = gamesclientcontext.resolveCurrentPlayerId();
        }
        obj = gamesclientcontext.getExternalPlayerId();
        contentvalues = new ContentValues();
        obj1 = com.google.android.gms.games.provider.GamesContractInternal.Players.getUriForExternalPlayerId(gamesclientcontext.mClientContext, ((String) (obj)));
        obj1 = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((Uri) (obj1))).query();
        extractValues$ba566be(contentvalues, ACHIEVEMENT_DATA_SPEC, ((DataHolder) (obj1)));
        ((DataHolder) (obj1)).close();
        obj1 = Agents.getExternalIdToInternalIdMap(gamesclientcontext.mContext, com.google.android.gms.games.provider.GamesContractInternal.AchievementDefinitions.getUriForGameId(gamesclientcontext.mClientContext, l1), "external_achievement_id");
        map = Agents.getExternalIdToInternalIdMap(gamesclientcontext.mContext, com.google.android.gms.games.provider.GamesContractInternal.AchievementInstances.getUriForExternalPlayerAndGameId(gamesclientcontext), "external_achievement_id");
        arraylist1 = new ArrayList();
        arraylist2 = new ArrayList();
        flag = ((String) (obj)).equals(gamesclientcontext.mExternalCurrentPlayerId);
        uri = com.google.android.gms.games.provider.GamesContractInternal.AchievementInstances.getContentUri(gamesclientcontext.mClientContext);
        i = 0;
        j = arraylist.size();
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_488;
        }
        obj = ((FastContentValuesJsonResponse) ((PlayerAchievement)arraylist.get(i))).mValues;
        ((ContentValues) (obj)).put("player_id", Long.valueOf(l));
        obj2 = ((ContentValues) (obj)).getAsString("external_achievement_id");
        ((ContentValues) (obj)).remove("external_achievement_id");
        ((ContentValues) (obj)).remove("external_game_id");
        long1 = (Long)((Map) (obj1)).get(obj2);
        if (long1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        GamesLog.e("AchievementAgent", (new StringBuilder("Unable to find local record for external achievement ID ")).append(((String) (obj2))).toString());
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        gamesclientcontext;
        ((DataHolder) (obj1)).close();
        throw gamesclientcontext;
_L1:
label0:
        {
            ((ContentValues) (obj)).put("definition_id", long1);
            long1 = (Long)map.get(obj2);
            if (!flag)
            {
                break label0;
            }
            boolean flag1 = Agents.shouldAllowYieldAtIndex(i);
            if (long1 == null)
            {
                obj = ContentProviderOperation.newInsert(uri).withValues(((ContentValues) (obj)));
            } else
            {
                obj = ContentProviderOperation.newUpdate(ContentUris.withAppendedId(uri, long1.longValue())).withValues(((ContentValues) (obj)));
            }
            arraylist1.add(((android.content.ContentProviderOperation.Builder) (obj)).withYieldAllowed(flag1).build());
        }
          goto _L3
        obj2 = com.google.android.gms.games.provider.GamesContractInternal.AchievementDefinitions.getUriForExternalAchievementId(gamesclientcontext.mClientContext, ((String) (obj2)));
        obj2 = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((Uri) (obj2))).query();
        extractValues$ba566be(((ContentValues) (obj)), ACHIEVEMENT_DATA_SPEC, ((DataHolder) (obj2)));
        ((DataHolder) (obj2)).close();
        ((ContentValues) (obj)).putAll(contentvalues);
        arraylist2.add(obj);
          goto _L3
        gamesclientcontext;
        ((DataHolder) (obj2)).close();
        throw gamesclientcontext;
        if (!arraylist2.isEmpty())
        {
            mAchievementCache.enableCaching(gamesclientcontext.getExternalPlayerId());
            mAchievementCache.addCacheData(gamesclientcontext.getCacheKey(), arraylist2, 0, null, null, 0, DefaultClock.getInstance().currentTimeMillis());
        }
        return Agents.applyContentOperations(contentresolver, arraylist1, "AchievementAgent");
    }

    private static long storePendingAchievementOp(GamesClientContext gamesclientcontext, String s, int i, int j, int k, int l)
    {
        Uri uri;
        Object obj;
        int i1;
        int j1;
        int k1;
        int l1;
        byte byte0;
        long l2;
        l2 = -1L;
        l1 = -1;
        i1 = -1;
        byte0 = -1;
        uri = com.google.android.gms.games.provider.GamesContractInternal.AchievementPendingOps.getContentUri(gamesclientcontext.mClientContext);
        obj = Agents.queryPendingOpCursor$97f12e7(gamesclientcontext.mContext, gamesclientcontext.mClientContext, uri, PendingOpsQuery.PROJECTION, "external_achievement_id=?", new String[] {
            s
        });
        j1 = i1;
        k1 = byte0;
        int i2;
        long l3;
        if (!((Cursor) (obj)).moveToLast())
        {
            break MISSING_BLOCK_LABEL_160;
        }
        l3 = ((Cursor) (obj)).getLong(0);
        i2 = ((Cursor) (obj)).getInt(2);
        if (!((Cursor) (obj)).isNull(3))
        {
            i1 = ((Cursor) (obj)).getInt(3);
        }
        j1 = i1;
        l2 = l3;
        k1 = byte0;
        l1 = i2;
        if (((Cursor) (obj)).isNull(4))
        {
            break MISSING_BLOCK_LABEL_160;
        }
        k1 = ((Cursor) (obj)).getInt(4);
        l1 = i2;
        l2 = l3;
        j1 = i1;
        ((Cursor) (obj)).close();
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (j1 == -1 || k1 == -1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Asserts.checkState(flag2, "Both increment and set steps may not be positive");
        flag1 = false;
        flag = flag1;
        if (l2 != -1L)
        {
            if (i != 1)
            {
                flag = true;
            } else
            if (l > 0 && j1 == -1)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (k > 0)
                {
                    flag = flag1;
                    if (k1 == -1)
                    {
                        flag = true;
                    }
                }
            }
        }
        if (!gamesclientcontext.mIsFirstParty)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2, "Pending ops are always 3P");
        if (gamesclientcontext.mExternalOwningGameId != null && gamesclientcontext.mExternalOwningGameId.equals(gamesclientcontext.mExternalTargetGameId))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2, "Owning and target game IDs should be the same");
        if (gamesclientcontext.mExternalTargetPlayerId == null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2, "Target player ID should be null");
        obj = new ContentValues();
        ((ContentValues) (obj)).put("client_context_id", Long.valueOf(Agents.resolveClientContextId(gamesclientcontext.mContext, gamesclientcontext.mClientContext)));
        ((ContentValues) (obj)).put("external_achievement_id", s);
        ((ContentValues) (obj)).put("achievement_type", Integer.valueOf(i));
        ((ContentValues) (obj)).put("external_game_id", gamesclientcontext.mExternalOwningGameId);
        ((ContentValues) (obj)).put("external_player_id", gamesclientcontext.mExternalCurrentPlayerId);
        if (flag)
        {
            if (i != 1)
            {
                if (l1 == 1 && j == 0)
                {
                    ((ContentValues) (obj)).put("new_state", Integer.valueOf(j));
                }
            } else
            if (j1 > 0)
            {
                ((ContentValues) (obj)).put("steps_to_increment", Integer.valueOf(j1 + k));
            } else
            if (k1 > 0)
            {
                ((ContentValues) (obj)).put("min_steps_to_set", Integer.valueOf(Math.max(l, k1)));
            } else
            {
                GamesLog.e("AchievementAgent", "Can't coalesce an incremental achievement op with no steps!");
                return -1L;
            }
            if (gamesclientcontext.mContext.getContentResolver().update(ContentUris.withAppendedId(uri, l2), ((ContentValues) (obj)), null, null) == 1)
            {
                return l2;
            } else
            {
                GamesLog.e("AchievementAgent", (new StringBuilder("Failed to update existing pending op with ID ")).append(l2).toString());
                return -1L;
            }
        }
        break MISSING_BLOCK_LABEL_581;
        gamesclientcontext;
        ((Cursor) (obj)).close();
        throw gamesclientcontext;
        if (i != 1)
        {
            ((ContentValues) (obj)).put("new_state", Integer.valueOf(j));
        } else
        if (l > 0)
        {
            ((ContentValues) (obj)).put("min_steps_to_set", Integer.valueOf(l));
        } else
        {
            ((ContentValues) (obj)).put("steps_to_increment", Integer.valueOf(k));
        }
        return ContentUris.parseId(gamesclientcontext.mContext.getContentResolver().insert(uri, ((ContentValues) (obj))));
    }

    private void updateLocalSteps(AchievementStepData achievementstepdata, int i, boolean flag)
    {
        if (i > achievementstepdata.newSteps)
        {
            updateLocalSteps(achievementstepdata.gamesContext.mContext, achievementstepdata.instanceUri, Integer.valueOf(i), flag, null);
            if (flag)
            {
                achievementstepdata.statusCode = 3003;
                if (!achievementstepdata.popupShown)
                {
                    AchievementPopup.show(achievementstepdata.gamesContext, achievementstepdata.popupLocationInfo, achievementstepdata.achievementBundle);
                }
            }
        }
    }

    private static boolean updateLocalSteps(Context context, Uri uri, Integer integer, boolean flag, String s)
    {
        boolean flag1 = false;
        ContentValues contentvalues = new ContentValues();
        if (integer != null)
        {
            contentvalues.put("current_steps", integer);
            contentvalues.put("formatted_current_steps", NumberFormat.getInstance().format(integer));
        }
        contentvalues.put("last_updated_timestamp", Long.valueOf(DefaultClock.getInstance().currentTimeMillis()));
        if (flag)
        {
            contentvalues.put("state", Integer.valueOf(0));
        }
        if (s != null)
        {
            contentvalues.put("state", Integer.valueOf(AchievementState.fromString(s)));
        }
        flag = flag1;
        if (context.getContentResolver().update(uri, contentvalues, null, null) != 0)
        {
            flag = true;
        }
        return flag;
    }

    public final void clearTransientCaches()
    {
        mAchievementCache.clear();
    }

    DataHolder fetchAchievements(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        boolean flag = false;
        flushPendingOps(gamesclientcontext);
        if (gamesclientcontext.mForceReload)
        {
            mAchievementCache.clear();
        }
        Object obj = getCacheUri(gamesclientcontext);
        boolean flag1 = GamesClientContext.isPlayerIdGPlusEnabled(gamesclientcontext.getExternalPlayerId());
        int i = ((flag) ? 1 : 0);
        if (!ApiRateLimitUtil.isUriRateLimited(((Uri) (obj)), 0x36ee80L, gamesclientcontext.mForceReload))
        {
            refreshDefinitions(gamesclientcontext);
            i = ((flag) ? 1 : 0);
            if (flag1)
            {
                i = refreshInstances(gamesclientcontext);
            }
        }
        if (!flag1)
        {
            return createDefaultInstances(gamesclientcontext);
        }
        obj = gamesclientcontext.getExternalPlayerId();
        com.google.android.gms.games.cache.GamePlayerCacheKey gameplayercachekey = gamesclientcontext.getCacheKey();
        if (mAchievementCache.hasCacheOwner(obj))
        {
            mAchievementCache.enableCaching(obj);
            if (mAchievementCache.hasData(gameplayercachekey, DefaultClock.getInstance().currentTimeMillis()))
            {
                return mAchievementCache.getData(gameplayercachekey, null);
            }
        }
        obj = com.google.android.gms.games.provider.GamesContractInternal.AchievementInstances.getUriForExternalPlayerAndGameId(gamesclientcontext);
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((Uri) (obj)));
        gamesclientcontext.mSortOrder = "state,last_updated_timestamp DESC,sorting_rank";
        gamesclientcontext.mStatusCode = i;
        return gamesclientcontext.query();
    }

    final int flushPendingOps(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        ArrayList arraylist;
        ArrayMap arraymap;
        Uri uri;
        String s1;
        android.database.AbstractWindowedCursor abstractwindowedcursor;
        byte byte0;
        uri = com.google.android.gms.games.provider.GamesContractInternal.AchievementPendingOps.getContentUri(gamesclientcontext.mClientContext);
        s1 = AccountUtils.getResolvedAccountName(gamesclientcontext.mClientContext);
        byte0 = 0;
        arraylist = new ArrayList();
        Agents.QueryBuilder querybuilder = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(uri, "account_name=?", new String[] {
            s1
        });
        querybuilder.mProjection = PendingOpsQuery.PROJECTION;
        querybuilder.mSortOrder = "package_name";
        abstractwindowedcursor = querybuilder.queryCursor();
        arraymap = new ArrayMap();
_L5:
        if (!abstractwindowedcursor.moveToNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        ClientContext clientcontext1;
        String s2;
        int j;
        int k;
        int l;
        obj = abstractwindowedcursor.getString(7);
        obj1 = abstractwindowedcursor.getString(8);
        s2 = abstractwindowedcursor.getString(1);
        int i = abstractwindowedcursor.getInt(6);
        String s = abstractwindowedcursor.getString(5);
        j = abstractwindowedcursor.getInt(2);
        k = abstractwindowedcursor.getInt(3);
        l = abstractwindowedcursor.getInt(4);
        clientcontext1 = Agents.restoreClientContext(i, s, s1);
        GamesAchievementSetStepsAtLeast gamesachievementsetstepsatleast;
        AchievementFlushData achievementflushdata1;
        boolean flag;
        if (!clientcontext1.isCurrentContext())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Pending operations should always be 3P");
        if (!arraymap.containsKey(clientcontext1))
        {
            arraymap.put(clientcontext1, new AchievementFlushData(GamesClientContext.buildContextFor3P(gamesclientcontext.mContext, clientcontext1, ((String) (obj)), ((String) (obj1)), false)));
        }
        achievementflushdata1 = (AchievementFlushData)arraymap.get(clientcontext1);
        obj1 = null;
        gamesachievementsetstepsatleast = null;
        if (l <= 0) goto _L4; else goto _L3
_L3:
        gamesachievementsetstepsatleast = new GamesAchievementSetStepsAtLeast(Integer.valueOf(l));
        obj = "SET_STEPS_AT_LEAST";
_L8:
        obj = new AchievementUpdateRequest(s2, ((GamesAchievementIncrement) (obj1)), gamesachievementsetstepsatleast, "", ((String) (obj)));
        achievementflushdata1.updateRequests.add(obj);
        obj = ContentUris.withAppendedId(uri, abstractwindowedcursor.getLong(0));
        flag = Agents.shouldAllowYieldAtIndex(arraylist.size());
        obj1 = (AchievementFlushData)arraymap.get(clientcontext1);
        obj = ContentProviderOperation.newDelete(((Uri) (obj))).withYieldAllowed(flag).build();
        ((AchievementFlushData) (obj1)).contentProviderOperations.add(obj);
          goto _L5
        gamesclientcontext;
        abstractwindowedcursor.close();
        throw gamesclientcontext;
_L4:
        if (k <= 0) goto _L7; else goto _L6
_L6:
        obj1 = new GamesAchievementIncrement(Long.valueOf(mRandom.nextLong()), Integer.valueOf(k));
        obj = "INCREMENT";
          goto _L8
_L10:
        obj = "UNLOCK";
          goto _L8
_L2:
        abstractwindowedcursor.close();
        for (obj = arraymap.keySet().iterator(); ((Iterator) (obj)).hasNext();)
        {
            ClientContext clientcontext = (ClientContext)((Iterator) (obj)).next();
            AchievementFlushData achievementflushdata = (AchievementFlushData)arraymap.get(clientcontext);
            if (flushPendingOp(gamesclientcontext.mContext, clientcontext, achievementflushdata))
            {
                arraylist.addAll(achievementflushdata.contentProviderOperations);
            } else
            {
                byte0 = 5;
            }
        }

        Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), arraylist, "AchievementAgent");
        return byte0;
_L7:
        if (j != 1) goto _L10; else goto _L9
_L9:
        obj = "REVEAL";
          goto _L8
    }

    public final AchievementUpdateResult incrementAchievement(GamesClientContext gamesclientcontext, String s, int i, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, boolean flag)
        throws GoogleAuthException
    {
        popuplocationinfo = new AchievementStepData(gamesclientcontext, s, i, popuplocationinfo);
        long l1 = performLocalIncrement(popuplocationinfo, true, flag);
        if (l1 == -1L)
        {
            return new AchievementUpdateResult(((AchievementStepData) (popuplocationinfo)).statusCode);
        }
        if (!flag || ((AchievementStepData) (popuplocationinfo)).statusCode != 0)
        {
            storePendingAchievementOp(gamesclientcontext, s, 1, -1, i, 0);
            requestDeferredSync(gamesclientcontext);
            return new AchievementUpdateResult(5, l1);
        }
        Object obj;
        ClientContext clientcontext;
        Object obj1;
        StringBuilder stringbuilder;
        long l;
        try
        {
            obj = mInstancesApi;
            clientcontext = gamesclientcontext.mClientContext;
            obj1 = Long.valueOf(mRandom.nextLong());
            stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("achievements/%1$s/increment", new Object[] {
                AchievementsApi.enc(s)
            });
            AchievementsApi.append(stringbuilder, "stepsToIncrement", String.valueOf(Integer.valueOf(i)));
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(popuplocationinfo, "AchievementAgent");
            }
            if (!ErrorUtils.isTransientError(popuplocationinfo))
            {
                GamesLog.e("AchievementAgent", "Encountered hard error while incrementing achievement.");
                return new AchievementUpdateResult(6);
            } else
            {
                GamesLog.i("AchievementAgent", "Unable to increment achievement. Increment will be deferred.");
                storePendingAchievementOp(gamesclientcontext, s, 1, -1, i, 0);
                return new AchievementUpdateResult(5, l1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
        {
            GamesLog.w("AchievementAgent", "Auth error while incrementing achievement over network", popuplocationinfo);
            storePendingAchievementOp(gamesclientcontext, s, 1, -1, i, 0);
            throw popuplocationinfo;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        AchievementsApi.append(stringbuilder, "requestId", String.valueOf(obj1));
        AchievementsApi.append(stringbuilder, "signature", AchievementsApi.enc(""));
        obj1 = stringbuilder.toString();
        obj = (AchievementIncrementResponse)((AchievementsApi) (obj)).mServer.getResponseBlocking(clientcontext, 1, ((String) (obj1)), null, com/google/android/gms/games/server/api/AchievementIncrementResponse);
        ApiRateLimitUtil.clearUriTimestamp(getCacheUri(gamesclientcontext));
        l = l1;
        if (obj != null)
        {
            updateLocalSteps(popuplocationinfo, ((Integer)((FastMapJsonResponse) (obj)).mValues.get("currentSteps")).intValue(), ((AchievementIncrementResponse) (obj)).isNewlyUnlocked().booleanValue());
            l = l1;
            if (((AchievementIncrementResponse) (obj)).isNewlyUnlocked().booleanValue())
            {
                l = getAchievementXpValue(gamesclientcontext, s);
            }
        }
        return new AchievementUpdateResult(((AchievementStepData) (popuplocationinfo)).statusCode, l);
    }

    final int refreshDefinitions(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        Object obj = Agents.getLocaleString(gamesclientcontext.mContext);
        if (!gamesclientcontext.mIsFirstParty) goto _L2; else goto _L1
_L1:
        Object obj1;
        ClientContext clientcontext;
        Boolean boolean1;
        StringBuilder stringbuilder1;
        obj1 = mDefinitionsApiInternal;
        clientcontext = gamesclientcontext.mClientContext;
        String s = gamesclientcontext.mExternalTargetGameId;
        boolean1 = Boolean.valueOf(Agents.isPlusRequired$9c10cfc());
        stringbuilder1 = new StringBuilder();
        (new Formatter(stringbuilder1)).format("applications/%1$s/achievements", new Object[] {
            AchievementDefinitionsApiInternal.enc(s)
        });
        StringBuilder stringbuilder;
        if (obj != null)
        {
            try
            {
                AchievementDefinitionsApiInternal.append(stringbuilder1, "language", AchievementDefinitionsApiInternal.enc(((String) (obj))));
            }
            // Misplaced declaration of an exception variable
            catch (GamesClientContext gamesclientcontext)
            {
                if (GamesLog.canLog$134632())
                {
                    ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "AchievementAgent");
                }
                return 500;
            }
        }
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        AchievementDefinitionsApiInternal.append(stringbuilder1, "plusRequired", String.valueOf(boolean1));
        obj = stringbuilder1.toString();
        obj = (AchievementDefinitionsListResponse)((AchievementDefinitionsApiInternal) (obj1)).mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/games/server/api/AchievementDefinitionsListResponse);
_L3:
        obj = ((AchievementDefinitionsListResponse) (obj)).getItems();
        return !storeAchievementDefinitions(gamesclientcontext, ((ArrayList) (obj))) ? 500 : 0;
_L2:
        obj1 = mDefinitionsApi;
        clientcontext = gamesclientcontext.mClientContext;
        stringbuilder = new StringBuilder("achievements");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        AchievementDefinitionsApi.append(stringbuilder, "language", AchievementDefinitionsApi.enc(((String) (obj))));
        obj = stringbuilder.toString();
        obj = (AchievementDefinitionsListResponse)((AchievementDefinitionsApi) (obj1)).mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/games/server/api/AchievementDefinitionsListResponse);
          goto _L3
    }

    final int refreshInstances(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        Object obj;
        Object obj1;
        obj1 = Agents.getLocaleString(gamesclientcontext.mContext);
        obj = getCacheUri(gamesclientcontext);
        if (!gamesclientcontext.mIsFirstParty) goto _L2; else goto _L1
_L1:
        Object obj3 = new ArrayList();
        ((ArrayList) (obj3)).add(gamesclientcontext.mExternalTargetGameId);
        obj3 = Agents.getFetchList(((ArrayList) (obj3)));
        obj1 = mInstancesApiInternal.getMultipleBlocking$446ccc86(gamesclientcontext.mClientContext, gamesclientcontext.getExternalPlayerId(), "ALL", ((String) (obj1)), null, ((com.google.android.gms.games.server.api.ApplicationFetchList) (obj3)));
        ApiRateLimitUtil.updateUriTimestamp(((Uri) (obj)));
        obj = ((PlayerAchievementGetMultipleResponse) (obj1)).getItems();
_L3:
        AchievementsApi achievementsapi;
        ClientContext clientcontext;
        StringBuilder stringbuilder;
        return !storeAchievementInstances(gamesclientcontext, ((ArrayList) (obj))) ? 500 : 0;
_L2:
        try
        {
            achievementsapi = mInstancesApi;
            clientcontext = gamesclientcontext.mClientContext;
            String s = gamesclientcontext.mExternalCurrentPlayerId;
            stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("players/%1$s/achievements", new Object[] {
                AchievementsApi.enc(s)
            });
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "AchievementAgent");
            }
            return 500;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        AchievementsApi.append(stringbuilder, "language", AchievementsApi.enc(((String) (obj1))));
        AchievementsApi.append(stringbuilder, "state", AchievementsApi.enc("ALL"));
        Object obj2 = stringbuilder.toString();
        obj2 = (PlayerAchievementListResponse)achievementsapi.mServer.getResponseBlocking(clientcontext, 0, ((String) (obj2)), null, com/google/android/gms/games/server/api/PlayerAchievementListResponse);
        ApiRateLimitUtil.updateUriTimestamp(((Uri) (obj)));
        obj = ((PlayerAchievementListResponse) (obj2)).getItems();
          goto _L3
    }

    public final AchievementUpdateResult setAchievementSteps(GamesClientContext gamesclientcontext, String s, int i, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, boolean flag)
        throws GoogleAuthException
    {
        popuplocationinfo = new AchievementStepData(gamesclientcontext, s, i, popuplocationinfo);
        long l1 = performLocalIncrement(popuplocationinfo, false, flag);
        if (l1 == -1L)
        {
            return new AchievementUpdateResult(((AchievementStepData) (popuplocationinfo)).statusCode);
        }
        if (!flag || ((AchievementStepData) (popuplocationinfo)).statusCode != 0)
        {
            storePendingAchievementOp(gamesclientcontext, s, 1, -1, 0, i);
            requestDeferredSync(gamesclientcontext);
            return new AchievementUpdateResult(5, l1);
        }
        Object obj;
        long l;
        try
        {
            obj = mInstancesApi;
            ClientContext clientcontext = gamesclientcontext.mClientContext;
            Object obj1 = new StringBuilder();
            (new Formatter(((Appendable) (obj1)))).format("achievements/%1$s/setStepsAtLeast", new Object[] {
                AchievementsApi.enc(s)
            });
            AchievementsApi.append(((StringBuilder) (obj1)), "steps", String.valueOf(Integer.valueOf(i)));
            obj1 = ((StringBuilder) (obj1)).toString();
            obj = (AchievementSetStepsAtLeastResponse)((AchievementsApi) (obj)).mServer.getResponseBlocking(clientcontext, 1, ((String) (obj1)), null, com/google/android/gms/games/server/api/AchievementSetStepsAtLeastResponse);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(popuplocationinfo, "AchievementAgent");
            }
            if (!ErrorUtils.isTransientError(popuplocationinfo))
            {
                GamesLog.e("AchievementAgent", "Encountered hard error while setting achievement steps.");
                return new AchievementUpdateResult(6);
            } else
            {
                GamesLog.i("AchievementAgent", "Unable to set achievement steps. Set will be deferred.");
                storePendingAchievementOp(gamesclientcontext, s, 1, -1, 0, i);
                return new AchievementUpdateResult(5, l1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
        {
            GamesLog.w("AchievementAgent", "Auth error while incrementing achievement over network", popuplocationinfo);
            storePendingAchievementOp(gamesclientcontext, s, 1, -1, 0, i);
            throw popuplocationinfo;
        }
        ApiRateLimitUtil.clearUriTimestamp(getCacheUri(gamesclientcontext));
        l = l1;
        if (obj != null)
        {
            updateLocalSteps(popuplocationinfo, ((Integer)((FastMapJsonResponse) (obj)).mValues.get("currentSteps")).intValue(), ((AchievementSetStepsAtLeastResponse) (obj)).isNewlyUnlocked().booleanValue());
            l = l1;
            if (((AchievementSetStepsAtLeastResponse) (obj)).isNewlyUnlocked().booleanValue())
            {
                l = getAchievementXpValue(gamesclientcontext, s);
            }
        }
        return new AchievementUpdateResult(((AchievementStepData) (popuplocationinfo)).statusCode, l);
    }

    public final void submitPendingAchievementOps(GamesClientContext gamesclientcontext, SyncResult syncresult)
        throws GoogleAuthException
    {
        if (flushPendingOps(gamesclientcontext) != 0)
        {
            gamesclientcontext = syncresult.stats;
            gamesclientcontext.numIoExceptions = ((SyncStats) (gamesclientcontext)).numIoExceptions + 1L;
        }
    }

    final AchievementUpdateResult updateAchievementState(GamesClientContext gamesclientcontext, String s, int i, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
        throws GoogleAuthException
    {
        Object obj;
        Object obj1;
        int j;
        long l2;
        if (!isAchievementDefinitionLocal(gamesclientcontext, s))
        {
            refreshDefinitions(gamesclientcontext);
            if (!isAchievementDefinitionLocal(gamesclientcontext, s))
            {
                GamesLog.e("AchievementAgent", (new StringBuilder("Couldn't find local achievement to update for achievement ID ")).append(s).toString());
            }
        }
        obj = getDefinitionType(gamesclientcontext, s);
        if (obj == null)
        {
            return new AchievementUpdateResult(3001);
        }
        if (i == 0 && ((Integer)((Pair) (obj)).second).intValue() != 0)
        {
            GamesLog.e("AchievementAgent", (new StringBuilder("Achievement ")).append(s).append(" is incremental, and cannot be unlocked.").toString());
            return new AchievementUpdateResult(3000);
        }
        l2 = forceResolveInstanceId(gamesclientcontext, s);
        if (l2 == -1L)
        {
            GamesLog.w("AchievementAgent", (new StringBuilder("Could not find instance for ")).append(s).toString());
            return new AchievementUpdateResult(3001);
        }
        obj = com.google.android.gms.games.provider.GamesContractInternal.AchievementInstances.getUriForId(gamesclientcontext.mClientContext, l2);
        j = -1;
        obj1 = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((Uri) (obj)));
        obj1.mProjection = (new String[] {
            "state"
        });
        obj1 = ((Agents.QueryBuilder) (obj1)).queryCursor();
        if (((Cursor) (obj1)).moveToFirst())
        {
            j = ((Cursor) (obj1)).getInt(0);
        }
        ((Cursor) (obj1)).close();
        if (j == -1)
        {
            GamesLog.e("AchievementAgent", (new StringBuilder("No prior achievement state set for instance ID ")).append(l2).toString());
            return new AchievementUpdateResult(3001);
        }
        break MISSING_BLOCK_LABEL_301;
        gamesclientcontext;
        ((Cursor) (obj1)).close();
        throw gamesclientcontext;
label0:
        {
            if (((Boolean)G.alwaysShowAchievements.get()).booleanValue() && i == 0 && i == j)
            {
                AchievementPopup.show(gamesclientcontext, popuplocationinfo, getAchievementBundle(gamesclientcontext, s));
                return new AchievementUpdateResult(0);
            }
            long l = 0L;
            long l1 = l;
            if (i != j)
            {
                l1 = l;
                if (j != 0)
                {
                    {
                        Object obj2 = gamesclientcontext.mContext.getContentResolver();
                        ContentValues contentvalues = new ContentValues();
                        contentvalues.put("state", Integer.valueOf(i));
                        contentvalues.put("last_updated_timestamp", Long.valueOf(DefaultClock.getInstance().currentTimeMillis()));
                        if (((ContentResolver) (obj2)).update(((Uri) (obj)), contentvalues, null, null) != 1)
                        {
                            break MISSING_BLOCK_LABEL_857;
                        }
                        Bundle bundle = getAchievementBundle(gamesclientcontext, s);
                        if (i == 0)
                        {
                            l = ((Achievement)bundle.getParcelable("com.google.android.gms.games.ACHIEVEMENT")).getXpValue();
                        }
                        if (i != 0)
                        {
                            break label0;
                        }
                        AchievementsApi achievementsapi;
                        ClientContext clientcontext;
                        Object obj3;
                        int k;
                        try
                        {
                            AchievementPopup.show(gamesclientcontext, popuplocationinfo, bundle);
                            popuplocationinfo = mInstancesApi;
                            obj = gamesclientcontext.mClientContext;
                            obj2 = new StringBuilder();
                            (new Formatter(((Appendable) (obj2)))).format("achievements/%1$s/unlock", new Object[] {
                                AchievementsApi.enc(s)
                            });
                            AchievementsApi.append(((StringBuilder) (obj2)), "signature", AchievementsApi.enc(""));
                            obj2 = ((StringBuilder) (obj2)).toString();
                            ((AchievementsApi) (popuplocationinfo)).mServer.getResponseBlocking(((ClientContext) (obj)), 1, ((String) (obj2)), null, com/google/android/gms/games/server/api/AchievementUnlockResponse);
                        }
                        // Misplaced declaration of an exception variable
                        catch (com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
                        {
                            if (GamesLog.canLog$134632())
                            {
                                ErrorUtils.parseAndLogErrorResponse(popuplocationinfo, "AchievementAgent");
                            }
                            if (!ErrorUtils.isTransientError(popuplocationinfo))
                            {
                                GamesLog.e("AchievementAgent", "Encountered hard error while incrementing achievement.");
                                return new AchievementUpdateResult(6);
                            } else
                            {
                                GamesLog.i("AchievementAgent", "Unable to update achievement. Update will be deferred.");
                                storePendingAchievementOp(gamesclientcontext, s, 0, i, 0, 0);
                                return new AchievementUpdateResult(5, l);
                            }
                        }
                        // Misplaced declaration of an exception variable
                        catch (com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
                        {
                            GamesLog.w("AchievementAgent", "Auth error while updating achievement over network", popuplocationinfo);
                            storePendingAchievementOp(gamesclientcontext, s, 0, i, 0, 0);
                            throw popuplocationinfo;
                        }
                    }
                    ApiRateLimitUtil.clearUriTimestamp(getCacheUri(gamesclientcontext));
                    l1 = l;
                }
            }
            return new AchievementUpdateResult(0, l1);
        }
        if (i != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        achievementsapi = mInstancesApi;
        clientcontext = gamesclientcontext.mClientContext;
        obj3 = new StringBuilder();
        (new Formatter(((Appendable) (obj3)))).format("achievements/%1$s/reveal", new Object[] {
            AchievementsApi.enc(s)
        });
        obj3 = ((StringBuilder) (obj3)).toString();
        k = AchievementState.fromString((String)((FastMapJsonResponse) ((AchievementRevealResponse)achievementsapi.mServer.getResponseBlocking(clientcontext, 1, ((String) (obj3)), null, com/google/android/gms/games/server/api/AchievementRevealResponse))).mValues.get("currentState"));
        if (k != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        contentvalues.put("state", Integer.valueOf(k));
        contentvalues.put("last_updated_timestamp", Long.valueOf(DefaultClock.getInstance().currentTimeMillis()));
        if (((ContentResolver) (obj2)).update(((Uri) (obj)), contentvalues, null, null) != 1)
        {
            GamesLog.e("AchievementAgent", (new StringBuilder("Unable to update local instance for ID ")).append(l2).toString());
        }
        AchievementPopup.show(gamesclientcontext, popuplocationinfo, bundle);
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_857;
_L2:
        break MISSING_BLOCK_LABEL_558;
        GamesLog.e("AchievementAgent", (new StringBuilder("Unable to update local achievement instance for ID ")).append(l2).toString());
        return new AchievementUpdateResult(1);
    }

    static 
    {
        ACHIEVEMENT_DEFINITION_SPEC = ColumnSpec.builder().withColumn("external_achievement_id", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("type", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).withColumn("name", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("description", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("unlocked_icon_image_uri", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("unlocked_icon_image_url", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("revealed_icon_image_uri", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("revealed_icon_image_url", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("total_steps", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).withColumn("formatted_total_steps", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("definition_xp_value", com.google.android.gms.games.provider.ColumnSpec.DataType.LONG).build();
        ACHIEVEMENT_DATA_SPEC = ColumnSpec.builder().withColumnsFrom(ACHIEVEMENT_DEFINITION_SPEC).withColumn("state", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).withColumn("current_steps", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).withColumn("formatted_current_steps", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("last_updated_timestamp", com.google.android.gms.games.provider.ColumnSpec.DataType.LONG).withColumn("definition_id", com.google.android.gms.games.provider.ColumnSpec.DataType.LONG).withColumn("player_id", com.google.android.gms.games.provider.ColumnSpec.DataType.LONG).withColumn("instance_xp_value", com.google.android.gms.games.provider.ColumnSpec.DataType.LONG).withColumnsFrom(GamesDataUtils.PLAYER_SPEC).build();
    }
}
