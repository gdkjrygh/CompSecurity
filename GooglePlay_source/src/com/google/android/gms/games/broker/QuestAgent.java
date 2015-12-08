// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Joiner;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.error.ErrorInstanceResponse;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.server.api.Quest;
import com.google.android.gms.games.server.api.QuestContribution;
import com.google.android.gms.games.server.api.QuestCriterion;
import com.google.android.gms.games.server.api.QuestListFirstPartyResponse;
import com.google.android.gms.games.server.api.QuestListResponse;
import com.google.android.gms.games.server.api.QuestMetadataApiInternal;
import com.google.android.gms.games.server.api.QuestMetadataSyncFirstPartyResponse;
import com.google.android.gms.games.server.api.QuestMilestone;
import com.google.android.gms.games.server.api.QuestMilestonesApi;
import com.google.android.gms.games.server.api.QuestSyncFirstPartyResponse;
import com.google.android.gms.games.server.api.QuestsApi;
import com.google.android.gms.games.server.api.QuestsApiInternal;
import com.google.android.gms.games.ui.popup.QuestPopup;
import com.google.android.gms.games.util.AccountUtils;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, InboxCounter, GamesClientContext, EventResolver, 
//            Agents, GameEventListenerRegistry, ApiRateLimitUtil

public final class QuestAgent extends Lockable
    implements InboxCounter
{
    static interface CompletedQuestsQuery
    {

        public static final String PROJECTION[] = {
            "_id", "_id", "external_quest_id", "initial_value", "current_value", "target_value"
        };

    }

    private static interface MilestoneClaimedQuery
    {

        public static final String ARGS[] = {
            Integer.toString(4)
        };

    }

    private static final class NotifyDataHolder
    {

        public final String mGameId;
        public final String mQuestId;
        public final int mType;

        public NotifyDataHolder(String s, String s1, int i)
        {
            mGameId = s;
            mQuestId = s1;
            mType = i;
        }
    }

    private static final class SyncNetworkResponse
    {

        final ArrayList mData;
        final String mNewSyncToken;
        final int mStatusCode;

        public SyncNetworkResponse()
        {
            mData = new ArrayList();
            mNewSyncToken = null;
            mStatusCode = 500;
        }

        public SyncNetworkResponse(ArrayList arraylist, String s, int i)
        {
            mData = (ArrayList)Preconditions.checkNotNull(arraylist);
            mNewSyncToken = s;
            mStatusCode = i;
        }
    }


    public static final int EXTERNAL_VALID_POPUP_STATES[] = {
        3
    };
    public static final int INTERNAL_VALID_POPUP_STATES[] = {
        3, 4
    };
    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    static final String SYNC_QUEST_METADATA_TOKEN_PROJECTION[] = {
        "quest_sync_metadata_token"
    };
    static final String SYNC_QUEST_TOKEN_PROJECTION[] = {
        "quest_sync_token"
    };
    private final EventResolver mEventResolver;
    private boolean mHasNewActivity;
    private final QuestMetadataApiInternal mQuestMetadataApiInternal;
    private final QuestMilestonesApi mQuestMilestoneApi;
    private final QuestsApi mQuestsApi;
    private final QuestsApiInternal mQuestsApiInternal;
    private final Random mRandom = new Random(DefaultClock.getInstance().currentTimeMillis());

    public QuestAgent(Lockable lockable, BaseApiaryServer baseapiaryserver, BaseApiaryServer baseapiaryserver1, EventResolver eventresolver)
    {
        super("QuestAgent", LOCK, lockable);
        mHasNewActivity = false;
        mQuestsApi = new QuestsApi(baseapiaryserver);
        mQuestsApiInternal = new QuestsApiInternal(baseapiaryserver1);
        mQuestMetadataApiInternal = new QuestMetadataApiInternal(baseapiaryserver1);
        mQuestMilestoneApi = new QuestMilestonesApi(baseapiaryserver);
        mEventResolver = eventresolver;
    }

    private void addQuestOps(GamesClientContext gamesclientcontext, Quest quest, long l, ArrayList arraylist)
    {
        if (quest != null)
        {
            int j = arraylist.size();
            ContentValues contentvalues = new ContentValues();
            contentvalues.putAll(((FastContentValuesJsonResponse) (quest)).mValues);
            contentvalues.put("game_id", Long.valueOf(l));
            contentvalues.remove("external_game_id");
            if (!gamesclientcontext.hasTargetGameId() || !gamesclientcontext.mExternalTargetGameId.equals(quest.getApplicationId()))
            {
                gamesclientcontext = gamesclientcontext.getBuilder();
                gamesclientcontext.mExternalTargetGameId = quest.getApplicationId();
                gamesclientcontext = gamesclientcontext.build();
            }
            arraylist.add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Quests.getContentUri(gamesclientcontext.mClientContext)).withValues(contentvalues).withYieldAllowed(true).build());
            if (quest.getMilestones() == null || quest.getMilestones().isEmpty())
            {
                GamesLog.e("QuestAgent", (new StringBuilder("Milestones are missing for questId: ")).append(quest.getId()).toString());
                return;
            }
            int i = 0;
            int k = quest.getMilestones().size();
            while (i < k) 
            {
                QuestMilestone questmilestone = (QuestMilestone)quest.getMilestones().get(i);
                if (questmilestone.getCriteria() == null || questmilestone.getCriteria().isEmpty())
                {
                    GamesLog.e("QuestAgent", (new StringBuilder("Criteria not present for milestoneId: ")).append(questmilestone.getId()).toString());
                    return;
                }
                Object obj = (QuestCriterion)questmilestone.getCriteria().get(0);
                l = -1L;
                if (((Integer)((FastContentValuesJsonResponse) (questmilestone)).mValues.get("milestone_state")).intValue() == 2)
                {
                    QuestContribution questcontribution = ((QuestCriterion) (obj)).getInitialPlayerProgress();
                    QuestContribution questcontribution1 = ((QuestCriterion) (obj)).getCurrentContribution();
                    l = questcontribution.getValue().longValue() + questcontribution1.getValue().longValue();
                }
                l = mEventResolver.resolveEventInstanceWithCount(gamesclientcontext, ((QuestCriterion) (obj)).getEventId(), l, arraylist);
                if (l < 0L)
                {
                    GamesLog.e("QuestAgent", (new StringBuilder("EventInstance not present for externalEventId: ")).append(((QuestCriterion) (obj)).getEventId()).append(", on milestone ").append(i).append(" of questId: ").append(quest.getId()).toString());
                    return;
                }
                obj = new ContentValues();
                ((ContentValues) (obj)).putAll(((FastContentValuesJsonResponse) (questmilestone)).mValues);
                ((ContentValues) (obj)).put("event_instance_id", Long.valueOf(l));
                ((ContentValues) (obj)).put("milestones_sorting_rank", Integer.valueOf(i));
                arraylist.add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Milestones.getContentUri(gamesclientcontext.mClientContext)).withValueBackReference("quest_id", j).withValues(((ContentValues) (obj))).build());
                i++;
            }
        }
    }

    private static Bundle buildQuestBundle(Context context, ClientContext clientcontext, String s)
    {
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.Quests.getUriForExternalQuestId(clientcontext, s);
        clientcontext = new QuestBuffer((new Agents.QueryBuilder(context)).setQuerySpec(clientcontext).query());
        context = null;
        if (clientcontext.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s = (com.google.android.gms.games.quest.Quest)clientcontext.get(0);
        context = new Bundle();
        context.putString("com.google.android.gms.games.extra.name", s.getName());
        context.putParcelable("com.google.android.gms.games.extra.imageUri", s.getIconImageUri());
        context.putInt("com.google.android.gms.games.extra.state", s.getState());
        clientcontext.release();
        return context;
        context;
_L2:
        clientcontext.release();
        throw context;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void clearLocalQuests(GamesClientContext gamesclientcontext, String s)
    {
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        ArrayList arraylist = new ArrayList(2);
        arraylist.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(clientcontext)).withValue(s, null).build());
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Quests.getContentUri(clientcontext)).build());
        Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), arraylist, "QuestAgent");
    }

    private static int getErrorStatus(VolleyError volleyerror, int i)
    {
        volleyerror = ErrorUtils.getErrorInstance(volleyerror, "QuestAgent");
        if (volleyerror == null || volleyerror.getReason() == null)
        {
            return i;
        }
        volleyerror = volleyerror.getReason();
        if (!volleyerror.equalsIgnoreCase("QuestMilestoneClaimed")) goto _L2; else goto _L1
_L1:
        i = 8000;
_L4:
        return i;
_L2:
        if (volleyerror.equalsIgnoreCase("QuestMilestoneNotComplete"))
        {
            i = 8001;
        } else
        if (volleyerror.equalsIgnoreCase("QuestExpired"))
        {
            i = 8002;
        } else
        if (volleyerror.equalsIgnoreCase("QuestNotStarted"))
        {
            i = 8003;
        } else
        if (volleyerror.equalsIgnoreCase("QuestClosed"))
        {
            i = 8002;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static QuerySpec getExpiringQuery(Uri uri, long l)
    {
        uri = new QuerySpec(uri);
        uri.addWhere("muted", "0");
        uri.addWhere("notified", "0");
        uri.addWhere("notification_ts", Long.toString(l), "<=?");
        uri.addWhere("notification_ts", "-1", "<>?");
        uri.addWhere("quest_state", Integer.toString(3));
        return uri;
    }

    public static QuestBuffer getQuestsForNotification(GamesClientContext gamesclientcontext)
    {
        Context context = gamesclientcontext.mContext;
        gamesclientcontext = gamesclientcontext.mClientContext;
        long l = DefaultClock.getInstance().currentTimeMillis();
        Object obj = getExpiringQuery(com.google.android.gms.games.provider.GamesContractInternal.QuestsEntities.getContentUri(gamesclientcontext), l + 0x1b7740L);
        Agents.QueryBuilder querybuilder = new Agents.QueryBuilder(context);
        querybuilder.mQuery = ((QuerySpec) (obj));
        querybuilder.mSortOrder = "quest_last_updated_ts DESC,milestones_sorting_rank ASC";
        obj = new QuestBuffer(querybuilder.query());
        int j = ((QuestBuffer) (obj)).getCount();
        if (((QuestBuffer) (obj)).getCount() > 0)
        {
            ArrayList arraylist = new ArrayList(((QuestBuffer) (obj)).getCount());
            for (int i = 0; i < j; i++)
            {
                arraylist.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.Quests.getUriForExternalQuestId(gamesclientcontext, ((com.google.android.gms.games.quest.Quest)((QuestBuffer) (obj)).get(i)).getQuestId())).withValue("notified", Integer.valueOf(1)).build());
            }

            Agents.applyContentOperations(context.getContentResolver(), arraylist, "QuestAgent");
        }
        return ((QuestBuffer) (obj));
    }

    static DataHolder getStateFilteredQuestsDataHolder(GamesClientContext gamesclientcontext, int ai[], int i, String as[], int j)
    {
        QuerySpec queryspec;
        ArrayList arraylist;
label0:
        {
label1:
            {
label2:
                {
                    int k;
                    int l;
                    if (gamesclientcontext.hasTargetGameId())
                    {
                        queryspec = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.QuestsEntities.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId));
                    } else
                    {
                        queryspec = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.QuestsEntities.getContentUri(gamesclientcontext.mClientContext));
                    }
                    l = ai.length;
                    arraylist = new ArrayList();
                    k = 0;
label3:
                    do
                    {
                        {
                            if (k >= l)
                            {
                                break label0;
                            }
                            int i1 = ai[k];
                            long l1;
                            switch (i1)
                            {
                            default:
                                if (ArrayUtils.contains(com.google.android.gms.games.quest.Quest.QUEST_STATE_ALL, i1))
                                {
                                    arraylist.add((new StringBuilder("quest_state = ")).append(i1).toString());
                                } else
                                {
                                    GamesLog.e("QuestAgent", (new StringBuilder("Invalid quest selector used (")).append(i1).append("), see the selectors at the beginning of Quests for a valid list.").toString());
                                }
                                break;

                            case 101: // 'e'
                                break label3;

                            case 102: // 'f'
                                break label2;

                            case 103: // 'g'
                                break label1;
                            }
                        }
                        k++;
                    } while (true);
                    if (!ArrayUtils.contains(ai, 4))
                    {
                        arraylist.add("quest_state = 4 AND milestone_state = 3");
                    }
                    break MISSING_BLOCK_LABEL_119;
                }
                if (!ArrayUtils.contains(ai, 3))
                {
                    l1 = DefaultClock.getInstance().currentTimeMillis();
                    arraylist.add((new StringBuilder("quest_state = 3 AND notification_ts <= ")).append(l1 + 0x1b7740L).append(" AND notification_ts <> -1").toString());
                }
                break MISSING_BLOCK_LABEL_119;
            }
            if (!ArrayUtils.contains(ai, 6))
            {
                l1 = DefaultClock.getInstance().currentTimeMillis();
                arraylist.add((new StringBuilder("quest_state = 6 AND quest_last_updated_ts >= ")).append(l1 - 0x240c8400L).toString());
            }
            break MISSING_BLOCK_LABEL_119;
        }
        queryspec.addWhereRaw(Joiner.on(" OR ").join(arraylist));
        if (i == 1)
        {
            ai = "quest_end_ts DESC,milestones_sorting_rank ASC";
        } else
        {
            ai = "quest_last_updated_ts DESC,milestones_sorting_rank ASC";
        }
        if (as != null)
        {
            queryspec.addWhereIn("external_quest_id", as);
        }
        gamesclientcontext = new Agents.QueryBuilder(gamesclientcontext);
        gamesclientcontext.mQuery = queryspec;
        gamesclientcontext.mSortOrder = ai;
        gamesclientcontext.mStatusCode = j;
        return gamesclientcontext.query();
    }

    public static boolean hasExpiringQuests(GamesClientContext gamesclientcontext, long l)
    {
        long l1 = DefaultClock.getInstance().currentTimeMillis();
        QuerySpec queryspec = getExpiringQuery(com.google.android.gms.games.provider.GamesContractInternal.Quests.getContentUri(gamesclientcontext.mClientContext), l1 + 1000L * l);
        return Agents.getCount(gamesclientcontext.mContext, queryspec.mUri, queryspec.getSelection(), queryspec.mSelectionArgs) > 0L;
    }

    static void notifyListeners(GamesClientContext gamesclientcontext, String s, String s1, boolean flag)
    {
        GameEventListenerRegistry gameeventlistenerregistry;
        String s2;
        Object obj;
        obj = gamesclientcontext.mClientContext;
        gameeventlistenerregistry = GameEventListenerRegistry.getInstance();
        s2 = AccountUtils.getResolvedAccountName(gamesclientcontext.mClientContext);
        if (!gameeventlistenerregistry.hasQuestUpdateListener(s2, s))
        {
            return;
        }
        obj = com.google.android.gms.games.provider.GamesContractInternal.QuestsEntities.getUriForExternalQuestId(((ClientContext) (obj)), s1);
        obj = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((Uri) (obj))).query();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        gameeventlistenerregistry.deliverQuestComplete(s2, s, s1, ((DataHolder) (obj)));
        s = gameeventlistenerregistry.getPopupLocationInfo(s2, s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        GamesLog.e("QuestAgent", "Failed to fetch PopupLocationInfo");
_L2:
        ((DataHolder) (obj)).close();
        return;
        showStateChangedPopupInternal(gamesclientcontext, s1, INTERNAL_VALID_POPUP_STATES, s);
        if (true) goto _L2; else goto _L1
_L1:
        gamesclientcontext;
        ((DataHolder) (obj)).close();
        throw gamesclientcontext;
    }

    static boolean shouldQueryForQuests(int i)
    {
        return i == 0 || i == 500;
    }

    public static void showStateChangedPopupInternal(GamesClientContext gamesclientcontext, String s, int ai[], com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
    {
        int i;
label0:
        {
            if (popuplocationinfo != null)
            {
                s = buildQuestBundle(gamesclientcontext.mContext, gamesclientcontext.mClientContext, s);
                i = s.getInt("com.google.android.gms.games.extra.state");
                if (!ArrayUtils.contains(ai, i))
                {
                    break label0;
                }
                QuestPopup.show(gamesclientcontext, popuplocationinfo, s);
            }
            return;
        }
        GamesLog.d("QuestAgent", (new StringBuilder("Not showing popup for quest in state ")).append(i).append(", because the state does not have an associated popup.").toString());
    }

    private boolean storeQuestEntities(GamesClientContext gamesclientcontext, ArrayList arraylist, boolean flag)
    {
        return storeQuestEntities(gamesclientcontext, new SyncNetworkResponse(arraylist, null, 0), flag);
    }

    private static ArrayList trimTombstonedQuests(ClientContext clientcontext, HashSet hashset)
    {
        ArrayList arraylist = new ArrayList();
        for (hashset = hashset.iterator(); hashset.hasNext(); arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Quests.getUriForExternalQuestId(clientcontext, (String)hashset.next())).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size())).build())) { }
        return arraylist;
    }

    public final DataHolder acceptQuest(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        ClientContext clientcontext;
        Object obj;
        int i;
        boolean flag;
        clientcontext = gamesclientcontext.mClientContext;
        obj = gamesclientcontext.mContext;
        long l = Agents.queryLong$34bc2a06(((Context) (obj)), com.google.android.gms.games.provider.GamesContractInternal.Quests.getUriForExternalQuestId(com.google.android.gms.games.provider.GamesContractInternal.Quests.getContentUri(clientcontext), s), "accepted_ts");
        flag = false;
        i = ((flag) ? 1 : 0);
        if (l != -1L)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        ArrayList arraylist;
        QuestsApi questsapi;
        StringBuilder stringbuilder;
        arraylist = new ArrayList();
        questsapi = mQuestsApi;
        obj = Agents.getLocaleString(((Context) (obj)));
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("quests/%1$s/accept", new Object[] {
            QuestsApi.enc(s)
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        QuestsApi.append(stringbuilder, "language", QuestsApi.enc(((String) (obj))));
        String s1 = stringbuilder.toString();
        arraylist.add((Quest)questsapi.mServer.getResponseBlocking(clientcontext, 1, s1, null, com/google/android/gms/games/server/api/Quest));
        storeQuestEntities(gamesclientcontext, arraylist, false);
        i = ((flag) ? 1 : 0);
_L2:
        s = com.google.android.gms.games.provider.GamesContractInternal.QuestsEntities.getUriForExternalQuestId(clientcontext, s);
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(s);
        gamesclientcontext.mSortOrder = "quest_last_updated_ts DESC,milestones_sorting_rank ASC";
        gamesclientcontext.mStatusCode = i;
        return gamesclientcontext.query();
        VolleyError volleyerror;
        volleyerror;
        GamesLog.e("QuestAgent", "Unable to accept quest", volleyerror);
        i = getErrorStatus(volleyerror, 3);
        if (true) goto _L2; else goto _L1
_L1:
    }

    final ArrayList buildQuestOperations(GamesClientContext gamesclientcontext, SyncNetworkResponse syncnetworkresponse, String s, ArrayList arraylist, ArrayList arraylist1, boolean flag)
    {
        Object obj;
        ClientContext clientcontext;
        Object obj1;
        HashSet hashset;
        ArrayList arraylist2;
        Quest quest;
        String s2;
        int i;
        boolean flag1;
        clientcontext = gamesclientcontext.mClientContext;
        obj1 = gamesclientcontext.mContext;
        syncnetworkresponse = syncnetworkresponse.mNewSyncToken;
        if (syncnetworkresponse != null)
        {
            arraylist1.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(clientcontext)).withValue(s, syncnetworkresponse).build());
        }
        syncnetworkresponse = com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(clientcontext);
        if (gamesclientcontext.hasTargetGameId())
        {
            syncnetworkresponse = new ArrayMap();
            syncnetworkresponse.put(gamesclientcontext.mExternalTargetGameId, Long.valueOf(gamesclientcontext.resolveTargetGameId()));
            s = com.google.android.gms.games.provider.GamesContractInternal.Quests.getUriForGameId(clientcontext, gamesclientcontext.resolveTargetGameId());
        } else
        {
            syncnetworkresponse = Agents.getExternalIdToInternalIdMap(((Context) (obj1)), syncnetworkresponse, "external_game_id");
            s = com.google.android.gms.games.provider.GamesContractInternal.Quests.getContentUri(clientcontext);
        }
        obj = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.Quests.getContentUri(clientcontext));
        ((QuerySpec) (obj)).addWhereRaw((new StringBuilder("quest_state in (")).append(TextUtils.join(",", com.google.android.gms.games.quest.Quest.QUEST_STATE_NON_TERMINAL)).append(")").toString());
        hashset = Agents.getColumnValues(((Context) (obj1)), ((QuerySpec) (obj)), "external_quest_id");
        if (flag)
        {
            obj = Agents.getColumnValues(((Context) (obj1)), s, "external_quest_id");
        } else
        {
            obj = new HashSet();
        }
        arraylist2 = new ArrayList();
        i = arraylist.size() - 1;
_L6:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_406;
        }
        quest = (Quest)arraylist.get(i);
        if (quest != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "We are trying to add a null quest");
        s2 = quest.getApplicationId();
        if (!syncnetworkresponse.containsKey(s2))
        {
            break MISSING_BLOCK_LABEL_372;
        }
        ((FastContentValuesJsonResponse) (quest)).mValues.getAsInteger("quest_state").intValue();
        JVM INSTR lookupswitch 2: default 280
    //                   0: 352
    //                   7: 352;
           goto _L1 _L2 _L2
_L1:
        flag1 = false;
_L3:
        if (flag1)
        {
            ((HashSet) (obj)).add(quest.getId());
            arraylist.remove(i);
        } else
        {
            ((HashSet) (obj)).remove(quest.getId());
        }
_L4:
        i--;
        continue; /* Loop/switch isn't completed */
_L2:
        flag1 = true;
          goto _L3
        GamesLog.w("QuestAgent", (new StringBuilder("Attempting to add quest to an unknown application id: ")).append(s2).toString());
        arraylist.remove(i);
          goto _L4
        if (!((HashSet) (obj)).isEmpty())
        {
            for (s = Agents.getTwoColumnMap(((Context) (obj1)), s, "external_quest_id", "external_game_id", ((java.util.Collection) (obj))).entrySet().iterator(); s.hasNext(); arraylist2.add(new NotifyDataHolder((String)((java.util.Map.Entry) (obj1)).getValue(), (String)((java.util.Map.Entry) (obj1)).getKey(), 3)))
            {
                obj1 = (java.util.Map.Entry)s.next();
            }

            arraylist1.addAll(trimTombstonedQuests(clientcontext, ((HashSet) (obj))));
        }
        int j = 0;
        for (int k = arraylist.size(); j < k; j++)
        {
            s = (Quest)arraylist.get(j);
            String s1 = s.getApplicationId();
            int l = ((FastContentValuesJsonResponse) (s)).mValues.getAsInteger("quest_state").intValue();
            arraylist2.add(new NotifyDataHolder(s1, s.getId(), 2));
            if (4 == l && hashset.contains(s.getId()))
            {
                arraylist2.add(new NotifyDataHolder(s1, s.getId(), 1));
            }
            addQuestOps(gamesclientcontext, s, ((Long)syncnetworkresponse.get(s1)).longValue(), arraylist1);
        }

        return arraylist2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final DataHolder claimMilestone(GamesClientContext gamesclientcontext, String s, String s1)
        throws GoogleAuthException
    {
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        int j = 0;
        int i = 0;
        boolean flag1 = true;
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Milestones.getUriForExternalMilestoneId(clientcontext, s1);
        if (0L == Agents.getCount(gamesclientcontext.mContext, uri, "milestone_state=?", MilestoneClaimedQuery.ARGS))
        {
            try
            {
                QuestMilestonesApi questmilestonesapi = mQuestMilestoneApi;
                long l = mRandom.nextLong();
                StringBuilder stringbuilder = new StringBuilder();
                (new Formatter(stringbuilder)).format("quests/%1$s/milestones/%2$s/claim", new Object[] {
                    QuestMilestonesApi.enc(s), QuestMilestonesApi.enc(s1)
                });
                QuestMilestonesApi.append(stringbuilder, "requestId", String.valueOf(Long.valueOf(l)));
                s1 = stringbuilder.toString();
                questmilestonesapi.mServer.performNoResponseRequestBlocking(clientcontext, 2, s1, null);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                GamesLog.e("QuestAgent", "Unable to claim milestone.", s1);
                i = getErrorStatus(s1, 6);
                boolean flag;
                if (i == 8000)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = flag;
            }
            j = i;
            if (flag1)
            {
                s1 = new ContentValues();
                s1.put("milestone_state", Integer.valueOf(4));
                gamesclientcontext.mContext.getContentResolver().update(uri, s1, null, null);
                j = i;
            }
        }
        s = com.google.android.gms.games.provider.GamesContractInternal.QuestsEntities.getUriForExternalQuestId(clientcontext, s);
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(s);
        gamesclientcontext.mSortOrder = "milestones_sorting_rank ASC";
        gamesclientcontext.mStatusCode = j;
        return gamesclientcontext.query();
    }

    public final void clearActivityTypes(int i)
    {
        if ((i & 8) != 0)
        {
            mHasNewActivity = false;
        }
    }

    public final String getActivityKey()
    {
        return "inbox_quests_count";
    }

    public final int getInboxCount(GamesClientContext gamesclientcontext)
    {
        QuerySpec queryspec = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.Quests.getContentUri(gamesclientcontext.mClientContext));
        queryspec.addWhere("quest_state", Integer.toString(3));
        return (int)Agents.getCount(gamesclientcontext.mContext, queryspec);
    }

    public final Lockable getLockable()
    {
        return this;
    }

    public final boolean hasInboxCountChanged()
    {
        return mHasNewActivity;
    }

    final int listQuests(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        int i;
        i = 0;
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Quests.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId);
        if (ApiRateLimitUtil.isUriRateLimited(uri, 0x36ee80L, gamesclientcontext.mForceReload))
        {
            break MISSING_BLOCK_LABEL_451;
        }
        String s;
        Object obj;
        Object obj1;
        ArrayList arraylist;
        String s1;
        Object obj2;
        Object obj3;
        Boolean boolean1;
        StringBuilder stringbuilder;
        int j;
        try
        {
            j = mEventResolver.sendPendingOps(gamesclientcontext);
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            GamesLog.e("QuestAgent", "Unable to retrieve quest list", gamesclientcontext);
            return 500;
        }
        i = j;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        arraylist = new ArrayList();
        s1 = Agents.getLocaleString(gamesclientcontext.mContext);
        s = null;
_L4:
        if (!gamesclientcontext.mIsFirstParty) goto _L2; else goto _L1
_L1:
        obj1 = gamesclientcontext.mExternalTargetPlayerId;
        obj = obj1;
        if (!GamesClientContext.isPlayerIdGPlusEnabled(((String) (obj1))))
        {
            obj = "me";
        }
        obj1 = mQuestsApiInternal;
        obj2 = gamesclientcontext.mClientContext;
        obj3 = gamesclientcontext.mExternalTargetGameId;
        boolean1 = Boolean.valueOf(Agents.isPlusRequired$9c10cfc());
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("applications/%1$s/players/%2$s/quests", new Object[] {
            QuestsApiInternal.enc(((String) (obj3))), QuestsApiInternal.enc(((String) (obj)))
        });
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        QuestsApiInternal.append(stringbuilder, "language", QuestsApiInternal.enc(s1));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        QuestsApiInternal.append(stringbuilder, "pageToken", QuestsApiInternal.enc(s));
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        QuestsApiInternal.append(stringbuilder, "plusRequired", String.valueOf(boolean1));
        s = stringbuilder.toString();
        obj = (QuestListFirstPartyResponse)((QuestsApiInternal) (obj1)).mServer.getResponseBlocking(((ClientContext) (obj2)), 0, s, null, com/google/android/gms/games/server/api/QuestListFirstPartyResponse);
        s = (String)((FastMapJsonResponse) (obj)).mValues.get("nextPageToken");
        obj = ((QuestListFirstPartyResponse) (obj)).getItems();
_L5:
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.addAll(((java.util.Collection) (obj)));
        if (s != null) goto _L4; else goto _L3
_L3:
        ApiRateLimitUtil.updateUriTimestamp(uri);
        storeQuestEntities(gamesclientcontext, arraylist, true);
        return j;
_L2:
        obj = mQuestsApi;
        obj1 = gamesclientcontext.mClientContext;
        obj2 = gamesclientcontext.mExternalCurrentPlayerId;
        obj3 = new StringBuilder();
        (new Formatter(((Appendable) (obj3)))).format("players/%1$s/quests", new Object[] {
            QuestsApi.enc(((String) (obj2)))
        });
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        QuestsApi.append(((StringBuilder) (obj3)), "language", QuestsApi.enc(s1));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_387;
        }
        QuestsApi.append(((StringBuilder) (obj3)), "pageToken", QuestsApi.enc(s));
        s = ((StringBuilder) (obj3)).toString();
        obj = (QuestListResponse)((QuestsApi) (obj)).mServer.getResponseBlocking(((ClientContext) (obj1)), 0, s, null, com/google/android/gms/games/server/api/QuestListResponse);
        s = (String)((FastMapJsonResponse) (obj)).mValues.get("nextPageToken");
        obj = ((QuestListResponse) (obj)).getItems();
          goto _L5
        return i;
    }

    final boolean processQuestOperations(GamesClientContext gamesclientcontext, ArrayList arraylist, ArrayList arraylist1)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        if (arraylist.size() <= 0) goto _L2; else goto _L1
_L1:
        int i = getInboxCount(gamesclientcontext);
        if (Agents.applyContentOperations(gamesclientcontext.mContext.getContentResolver(), arraylist, "QuestAgent")) goto _L4; else goto _L3
_L3:
        GamesLog.e("QuestAgent", "Failed to store quests");
        flag = false;
_L2:
        return flag;
_L4:
        arraylist = com.google.android.gms.games.provider.GamesContractInternal.Quests.getUriForExternalGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId);
        NotifyDataHolder notifydataholder;
        String s;
        String s1;
        int j;
        if (i != getInboxCount(gamesclientcontext))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mHasNewActivity = flag;
        i = 0;
        j = arraylist1.size();
        flag = flag1;
        if (i < j)
        {
            notifydataholder = (NotifyDataHolder)arraylist1.get(i);
            s = notifydataholder.mGameId;
            s1 = notifydataholder.mQuestId;
            if (1 == notifydataholder.mType)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            notifyListeners(gamesclientcontext, s, s1, flag);
            ApiRateLimitUtil.updateUriTimestamp(arraylist);
            i++;
            break MISSING_BLOCK_LABEL_91;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L5
_L5:
    }

    final boolean storeQuestEntities(GamesClientContext gamesclientcontext, SyncNetworkResponse syncnetworkresponse, boolean flag)
    {
        ArrayList arraylist = syncnetworkresponse.mData;
        if (arraylist == null)
        {
            return true;
        } else
        {
            ArrayList arraylist1 = new ArrayList();
            return processQuestOperations(gamesclientcontext, arraylist1, buildQuestOperations(gamesclientcontext, syncnetworkresponse, "quest_sync_token", arraylist, arraylist1, flag));
        }
    }

    final SyncNetworkResponse syncMetadataFromNetwork(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
_L2:
        ClientContext clientcontext;
        QuestMetadataApiInternal questmetadataapiinternal;
        String s2;
        Object obj;
        clientcontext = Agents.buildFirstPartyClientContext(gamesclientcontext.mClientContext);
        questmetadataapiinternal = mQuestMetadataApiInternal;
        s2 = Agents.getLocaleString(gamesclientcontext.mContext);
        obj = new StringBuilder("questMetadata/sync");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        QuestMetadataApiInternal.append(((StringBuilder) (obj)), "language", QuestMetadataApiInternal.enc(s2));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        QuestMetadataApiInternal.append(((StringBuilder) (obj)), "syncToken", QuestMetadataApiInternal.enc(s));
        String s3 = ((StringBuilder) (obj)).toString();
        obj = (QuestMetadataSyncFirstPartyResponse)questmetadataapiinternal.mServer.getResponseBlocking(clientcontext, 0, s3, null, com/google/android/gms/games/server/api/QuestMetadataSyncFirstPartyResponse);
        int i = 0;
        ArrayList arraylist = ((QuestMetadataSyncFirstPartyResponse) (obj)).getItems();
        String s4 = (String)((FastMapJsonResponse) (obj)).mValues.get("syncToken");
        String s1 = s4;
        if (((Boolean)((FastMapJsonResponse) (obj)).mValues.get("moreAvailable")).booleanValue())
        {
            VolleyError volleyerror;
            int j;
            boolean flag;
            if (!Objects.equal(s, s4))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, "Server claims to have more data, yet sync tokens match!");
            gamesclientcontext = syncMetadataFromNetwork(gamesclientcontext, s4);
            j = ((SyncNetworkResponse) (gamesclientcontext)).mStatusCode;
            s1 = s4;
            i = j;
            if (j == 0)
            {
                arraylist.addAll(((SyncNetworkResponse) (gamesclientcontext)).mData);
                s1 = ((SyncNetworkResponse) (gamesclientcontext)).mNewSyncToken;
                i = j;
            }
        }
        gamesclientcontext = arraylist;
        if (arraylist == null)
        {
            gamesclientcontext = new ArrayList();
        }
        return new SyncNetworkResponse(gamesclientcontext, s1, i);
        volleyerror;
        if (!ErrorUtils.hasStatusCode(volleyerror, 410))
        {
            break; /* Loop/switch isn't completed */
        }
        clearLocalQuests(gamesclientcontext, "quest_sync_metadata_token");
        GamesLog.d("QuestAgent", (new StringBuilder("Token ")).append(s).append(" is invalid. Retrying with no token.").toString());
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(volleyerror, "QuestAgent");
        }
        return new SyncNetworkResponse();
    }

    final SyncNetworkResponse syncQuestsFromNetwork(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
_L2:
        ClientContext clientcontext;
        QuestsApiInternal questsapiinternal;
        String s2;
        Object obj;
        clientcontext = Agents.buildFirstPartyClientContext(gamesclientcontext.mClientContext);
        questsapiinternal = mQuestsApiInternal;
        s2 = Agents.getLocaleString(gamesclientcontext.mContext);
        obj = new StringBuilder("quests/sync");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        QuestsApiInternal.append(((StringBuilder) (obj)), "language", QuestsApiInternal.enc(s2));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        QuestsApiInternal.append(((StringBuilder) (obj)), "syncToken", QuestsApiInternal.enc(s));
        String s3 = ((StringBuilder) (obj)).toString();
        obj = (QuestSyncFirstPartyResponse)questsapiinternal.mServer.getResponseBlocking(clientcontext, 0, s3, null, com/google/android/gms/games/server/api/QuestSyncFirstPartyResponse);
        int i = 0;
        ArrayList arraylist = ((QuestSyncFirstPartyResponse) (obj)).getItems();
        String s4 = (String)((FastMapJsonResponse) (obj)).mValues.get("syncToken");
        String s1 = s4;
        if (((Boolean)((FastMapJsonResponse) (obj)).mValues.get("moreAvailable")).booleanValue())
        {
            VolleyError volleyerror;
            int j;
            boolean flag;
            if (!Objects.equal(s, s4))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, "Server claims to have more data, yet sync tokens match!");
            gamesclientcontext = syncQuestsFromNetwork(gamesclientcontext, s4);
            j = ((SyncNetworkResponse) (gamesclientcontext)).mStatusCode;
            s1 = s4;
            i = j;
            if (j == 0)
            {
                arraylist.addAll(((SyncNetworkResponse) (gamesclientcontext)).mData);
                s1 = ((SyncNetworkResponse) (gamesclientcontext)).mNewSyncToken;
                i = j;
            }
        }
        gamesclientcontext = arraylist;
        if (arraylist == null)
        {
            gamesclientcontext = new ArrayList();
        }
        return new SyncNetworkResponse(gamesclientcontext, s1, i);
        volleyerror;
        if (!ErrorUtils.hasStatusCode(volleyerror, 410))
        {
            break; /* Loop/switch isn't completed */
        }
        clearLocalQuests(gamesclientcontext, "quest_sync_token");
        GamesLog.d("QuestAgent", (new StringBuilder("Token ")).append(s).append(" is invalid. Retrying with no token.").toString());
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(volleyerror, "QuestAgent");
        }
        return new SyncNetworkResponse();
    }

}
