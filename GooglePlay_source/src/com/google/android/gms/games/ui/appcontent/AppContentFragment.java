// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.appcontent.AppContentSection;
import com.google.android.gms.games.appcontent.AppContentSectionBuffer;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.MergedRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.layouts.LayoutSlotInflater;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentAction, ExtendedAppContentSection, AppContentUtils, AppContentCarouselAdapter, 
//            CarouselPagerAdapter, ExtendedAppContentCard

public abstract class AppContentFragment extends GamesHeaderRecyclerViewFragment
    implements ResultCallback, com.google.android.gms.games.ui.util.BaseGamesProfileVisibilityHelper.ProfileVisibilityInformer
{
    private class DelayedLoader
        implements ResultCallback
    {

        protected boolean mActive;
        protected boolean mFinished;
        protected final AppContentFragment mFragment;
        private PendingResult mPendingResult;

        public final void finish()
        {
            mFinished = true;
            if (mPendingResult != null)
            {
                mPendingResult.cancel();
                mPendingResult = null;
            }
            if (mActive)
            {
                mActive = false;
                mFragment.remove(this);
            }
        }

        public final boolean isFinished()
        {
            return mFinished;
        }

        public final void load(GoogleApiClient googleapiclient)
        {
            mPendingResult = onLoad(googleapiclient);
            boolean flag;
            if (mFinished || mPendingResult != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            if (mFinished)
            {
                return;
            } else
            {
                mPendingResult.setResultCallback(this);
                mActive = true;
                mFragment.add(this);
                return;
            }
        }

        protected abstract PendingResult onLoad(GoogleApiClient googleapiclient);

        public DelayedLoader()
        {
            mFragment = AppContentFragment.this;
            mActive = false;
            mFinished = false;
        }
    }

    private static final class FreezeMultiThread
    {

        final GamesFragmentActivity mActivity;
        private final ThreadPoolExecutor mExecutor;
        final AppContentFragment mFragment;
        final Object mLock = new Object();
        int mNextSectionToDisplay;
        final ConcurrentSkipListMap mPendingSections = new ConcurrentSkipListMap();
        final AppContentSectionBuffer mSectionBuffer;
        boolean mShouldAbort;
        private final long mStartTimestamp = System.currentTimeMillis();

        private int getNumCores()
        {
            int i;
            try
            {
                i = (new File("/sys/devices/system/cpu/")).listFiles(new _cls1CpuFilter()).length;
            }
            catch (Exception exception)
            {
                return 1;
            }
            return i;
        }

        public FreezeMultiThread(GamesFragmentActivity gamesfragmentactivity, AppContentFragment appcontentfragment, AppContentSectionBuffer appcontentsectionbuffer)
        {
            int i = 1;
            super();
            mShouldAbort = false;
            int j = Math.max(getNumCores(), 1);
            if (j != 1)
            {
                i = j - 1;
            }
            mActivity = gamesfragmentactivity;
            mFragment = appcontentfragment;
            mSectionBuffer = appcontentsectionbuffer;
            mNextSectionToDisplay = 0;
            mExecutor = new ThreadPoolExecutor(i, j, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            i = 0;
            for (j = mSectionBuffer.getCount(); i < j; i++)
            {
                mExecutor.execute(new SectionFreezer(i));
            }

        }
    }

    final class FreezeMultiThread._cls1CpuFilter
        implements FileFilter
    {

        final FreezeMultiThread this$0;

        public final boolean accept(File file)
        {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }

        FreezeMultiThread._cls1CpuFilter()
        {
            this$0 = FreezeMultiThread.this;
            super();
        }
    }

    private final class FreezeMultiThread.SectionFreezer
        implements Runnable
    {

        private final int mIdx;
        final FreezeMultiThread this$0;

        public final void run()
        {
            if (mShouldAbort) goto _L2; else goto _L1
_L1:
            int i = mIdx;
            AppContentSection appcontentsection = (AppContentSection)((AppContentSection)mSectionBuffer.get(mIdx)).freeze();
            mPendingSections.put(Integer.valueOf(i), appcontentsection);
            Object obj = mLock;
            obj;
            JVM INSTR monitorenter ;
_L4:
            final AppContentSection section;
            if (mShouldAbort || mPendingSections.isEmpty() || ((Integer)mPendingSections.firstKey()).intValue() != mNextSectionToDisplay)
            {
                break MISSING_BLOCK_LABEL_251;
            }
            int j = ((Integer)mPendingSections.firstKey()).intValue();
            section = (AppContentSection)mPendingSections.remove(Integer.valueOf(j));
            FreezeMultiThread freezemultithread = FreezeMultiThread.this;
            freezemultithread.mNextSectionToDisplay = freezemultithread.mNextSectionToDisplay + 1;
            Exception exception;
            boolean flag;
            if (mNextSectionToDisplay == mSectionBuffer.getCount())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mActivity.runOnUiThread(flag. new Runnable() {

                final FreezeMultiThread.SectionFreezer this$1;
                final boolean val$isLast;
                final AppContentSection val$section;

                public final void run()
                {
                    if (!mShouldAbort && ((Fragment) (mFragment)).mActivity != null)
                    {
                        mFragment.onNextSectionFrozen(section, isLast);
                    }
                }

            
            {
                this$1 = final_sectionfreezer;
                section = appcontentsection;
                isLast = Z.this;
                super();
            }
            });
            if (!flag) goto _L4; else goto _L3
_L3:
            mSectionBuffer.release();
            mNextSectionToDisplay = -1;
              goto _L4
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            obj;
            JVM INSTR monitorexit ;
_L2:
        }

        public FreezeMultiThread.SectionFreezer(int i)
        {
            this$0 = FreezeMultiThread.this;
            super();
            mIdx = i;
        }
    }

    public static class GameLoadedCallback
    {

        public void onGameLoadFailed()
        {
        }

        public void onGameLoaded(GameFirstParty gamefirstparty)
        {
        }

        public GameLoadedCallback()
        {
        }
    }

    private static final class GameLoader extends DelayedLoader
    {

        private static HashMap sGameMap = new HashMap();
        private final String mApplicationId;
        private final GameLoadedCallback mCallback;

        protected final PendingResult onLoad(GoogleApiClient googleapiclient)
        {
            if (sGameMap.containsKey(mApplicationId))
            {
                mCallback.onGameLoaded((GameFirstParty)sGameMap.get(mApplicationId));
                finish();
            } else
            if (googleapiclient != null)
            {
                return PlayGames.GamesMetadata.loadGame(googleapiclient, mApplicationId);
            }
            return null;
        }

        public final volatile void onResult(Result result)
        {
            result = (com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result;
            if (mFragment.canUseResult(result) && result.getGames().getCount() > 0)
            {
                GameFirstParty gamefirstparty = (GameFirstParty)((GameFirstParty)result.getGames().get(0)).freeze();
                sGameMap.put(mApplicationId, gamefirstparty);
                mCallback.onGameLoaded(gamefirstparty);
            } else
            {
                GamesLog.e("AppContentFrag", (new StringBuilder("Failed to load game: ")).append(mApplicationId).toString());
                mCallback.onGameLoadFailed();
            }
            result.release();
            finish();
        }


        public GameLoader(AppContentFragment appcontentfragment, String s, GameLoadedCallback gameloadedcallback)
        {
            appcontentfragment. super();
            mApplicationId = s;
            mCallback = gameloadedcallback;
            onLoad(null);
        }
    }

    public static class InvitationLoadedCallback
    {

        public void onInvitationLoaded(Invitation invitation)
        {
        }

        public InvitationLoadedCallback()
        {
        }
    }

    private static final class InvitationLoader extends DelayedLoader
    {

        private static final HashMap sInvitationMap = new HashMap();
        private final InvitationLoadedCallback mCallback;
        private final String mInvitationId;

        protected final PendingResult onLoad(GoogleApiClient googleapiclient)
        {
            if (sInvitationMap.containsKey(mInvitationId))
            {
                mCallback.onInvitationLoaded((Invitation)sInvitationMap.get(mInvitationId));
                finish();
            } else
            if (googleapiclient != null)
            {
                return Games.Invitations.loadInvitationFirstParty(googleapiclient, mInvitationId);
            }
            return null;
        }

        public final volatile void onResult(Result result)
        {
            result = (com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult)result;
            if (mFragment.canUseResult(result) && result.getInvitations().getCount() > 0)
            {
                Invitation invitation = (Invitation)((Invitation)result.getInvitations().get(0)).freeze();
                sInvitationMap.put(mInvitationId, invitation);
                mCallback.onInvitationLoaded(invitation);
            } else
            {
                GamesLog.e("AppContentFrag", (new StringBuilder("Failed to load invitation: ")).append(mInvitationId).toString());
            }
            result.release();
            finish();
        }


        public InvitationLoader(AppContentFragment appcontentfragment, String s, InvitationLoadedCallback invitationloadedcallback)
        {
            appcontentfragment. super();
            mInvitationId = s;
            mCallback = invitationloadedcallback;
            onLoad(null);
        }
    }

    public static class MatchLoadedCallback
    {

        public void onMatchLoaded(TurnBasedMatch turnbasedmatch)
        {
        }

        public MatchLoadedCallback()
        {
        }
    }

    private static final class MatchLoader extends DelayedLoader
    {

        private static final HashMap sMatchMap = new HashMap();
        private final MatchLoadedCallback mCallback;
        private final String mMatchId;

        protected final PendingResult onLoad(GoogleApiClient googleapiclient)
        {
            if (sMatchMap.containsKey(mMatchId))
            {
                mCallback.onMatchLoaded((TurnBasedMatch)sMatchMap.get(mMatchId));
                finish();
            } else
            if (googleapiclient != null)
            {
                return Games.TurnBasedMultiplayer.loadMatch(googleapiclient, mMatchId);
            }
            return null;
        }

        public final volatile void onResult(Result result)
        {
            result = (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult)result;
            if (mFragment.canUseResult(result))
            {
                result = (TurnBasedMatch)result.getMatch().freeze();
                sMatchMap.put(mMatchId, result);
                mCallback.onMatchLoaded(result);
            } else
            {
                GamesLog.e("AppContentFrag", (new StringBuilder("Failed to load match: ")).append(mMatchId).toString());
            }
            finish();
        }


        public MatchLoader(AppContentFragment appcontentfragment, String s, MatchLoadedCallback matchloadedcallback)
        {
            appcontentfragment. super();
            mMatchId = s;
            mCallback = matchloadedcallback;
            onLoad(null);
        }
    }

    public static class PlayerLoadedCallback
    {

        public void onPlayerLoadFailed()
        {
        }

        public void onPlayerLoaded(Player player)
        {
        }

        public PlayerLoadedCallback()
        {
        }
    }

    private static final class PlayerLoader extends DelayedLoader
    {

        private static HashMap sPlayerMap = new HashMap();
        private final PlayerLoadedCallback mCallback;
        private final String mPlayerId;

        protected final PendingResult onLoad(GoogleApiClient googleapiclient)
        {
            if (sPlayerMap.containsKey(mPlayerId))
            {
                mCallback.onPlayerLoaded((Player)sPlayerMap.get(mPlayerId));
                finish();
            } else
            if (googleapiclient != null)
            {
                return Games.Players.loadPlayer(googleapiclient, mPlayerId);
            }
            return null;
        }

        public final volatile void onResult(Result result)
        {
            result = (com.google.android.gms.games.Players.LoadPlayersResult)result;
            if (mFragment.canUseResult(result) && result.getPlayers().getCount() > 0)
            {
                Player player = (Player)result.getPlayers().get(0).freeze();
                sPlayerMap.put(mPlayerId, player);
                mCallback.onPlayerLoaded(player);
            } else
            {
                GamesLog.e("AppContentFrag", (new StringBuilder("Failed to load player: ")).append(mPlayerId).toString());
                mCallback.onPlayerLoadFailed();
            }
            result.release();
            finish();
        }


        public PlayerLoader(AppContentFragment appcontentfragment, String s, PlayerLoadedCallback playerloadedcallback)
        {
            appcontentfragment. super();
            mPlayerId = s;
            mCallback = playerloadedcallback;
            onLoad(null);
        }
    }

    private final class ProfileVisibilitySettingsCallback
        implements ResultCallback
    {

        final AppContentFragment this$0;

        public final volatile void onResult(Result result)
        {
            result = (com.google.android.gms.games.Players.LoadProfileSettingsResult)result;
            if (canUseResult(result))
            {
                boolean flag = result.isProfileVisible();
                if (flag != mProfileIsVisible)
                {
                    mProfileIsVisible = flag;
                    updateProfileVisibility(flag);
                }
            }
        }

        private ProfileVisibilitySettingsCallback()
        {
            this$0 = AppContentFragment.this;
            super();
        }

        ProfileVisibilitySettingsCallback(byte byte0)
        {
            this();
        }
    }

    private static final class ProgressAdapter extends SingleItemRecyclerAdapter
    {

        public final int getItemViewType()
        {
            return 0x7f040047;
        }

        protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
        {
            return new com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder(mInflater.inflate(0x7f040047, viewgroup, false));
        }

        public ProgressAdapter(Context context)
        {
            super(context, true);
        }
    }

    public static class QuestLoadedCallback
    {

        public void onQuestLoaded(Quest quest)
        {
        }

        public QuestLoadedCallback()
        {
        }
    }

    private static final class QuestLoader extends DelayedLoader
    {

        private static final HashMap sQuestMap = new HashMap();
        private final QuestLoadedCallback mCallback;
        private final QuestKey mQuestKey;

        protected final PendingResult onLoad(GoogleApiClient googleapiclient)
        {
            if (sQuestMap.containsKey(mQuestKey))
            {
                mCallback.onQuestLoaded((Quest)sQuestMap.get(mQuestKey));
                finish();
            } else
            if (googleapiclient != null)
            {
                return Games.Quests.loadByIdFirstParty$6a627986(googleapiclient, mQuestKey.applicationId, mQuestKey.playerId, new String[] {
                    mQuestKey.questId
                });
            }
            return null;
        }

        public final volatile void onResult(Result result)
        {
            result = (com.google.android.gms.games.quest.Quests.LoadQuestsResult)result;
            if (mFragment.canUseResult(result) && result.getQuests().getCount() > 0)
            {
                Quest quest = (Quest)((Quest)result.getQuests().get(0)).freeze();
                sQuestMap.put(mQuestKey, quest);
                mCallback.onQuestLoaded(quest);
            } else
            {
                GamesLog.e("AppContentFrag", (new StringBuilder("Failed to load quest: ")).append(mQuestKey.toString()).toString());
            }
            result.release();
            finish();
        }


        public QuestLoader(AppContentFragment appcontentfragment, String s, String s1, String s2, QuestLoadedCallback questloadedcallback)
        {
            appcontentfragment. super();
            mQuestKey = new QuestKey(s, s1, s2);
            mCallback = questloadedcallback;
            onLoad(null);
        }
    }

    private final class QuestLoader.QuestKey
    {

        public final String applicationId;
        public final String playerId;
        public final String questId;
        final QuestLoader this$0;

        public final boolean equals(Object obj)
        {
            if (obj instanceof QuestLoader.QuestKey)
            {
                if (this == obj)
                {
                    return true;
                }
                obj = (QuestLoader.QuestKey)obj;
                if (applicationId.equals(((QuestLoader.QuestKey) (obj)).applicationId) && playerId.equals(((QuestLoader.QuestKey) (obj)).playerId) && questId.equals(questId))
                {
                    return true;
                }
            }
            return false;
        }

        public final String toString()
        {
            return (new StringBuilder(applicationId)).append(",").append(playerId).append(",").append(questId).toString();
        }

        public QuestLoader.QuestKey(String s, String s1, String s2)
        {
            this$0 = QuestLoader.this;
            super();
            applicationId = s;
            playerId = s1;
            questId = s2;
        }
    }

    private static final class RequestLoader extends DelayedLoader
    {

        private static final HashMap sRequestMap = new HashMap();
        private final String mApplicationId;
        private final RequestsLoadedCallback mCallback;
        private final String mPlayerId;
        private final Set mRequestIds;

        protected final PendingResult onLoad(GoogleApiClient googleapiclient)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = mRequestIds.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                obj = new RequestKey(mApplicationId, mPlayerId, ((String) (obj)));
                if (sRequestMap.containsKey(obj))
                {
                    arraylist.add(sRequestMap.get(obj));
                }
            } while (true);
            if (arraylist.size() == mRequestIds.size())
            {
                mCallback.onRequestsLoaded(arraylist);
                finish();
            } else
            if (googleapiclient != null)
            {
                return Games.Requests.loadRequestsFirstParty$2c3ee1ac(googleapiclient, mApplicationId, mPlayerId, 65535, 0);
            }
            return null;
        }

        public final volatile void onResult(Result result)
        {
            boolean flag = false;
            result = (com.google.android.gms.games.request.Requests.LoadRequestsResult)result;
            if (mFragment.canUseResult(result))
            {
                GameRequestBuffer gamerequestbuffer1 = result.getRequests(1);
                GameRequestBuffer gamerequestbuffer = result.getRequests(2);
                ArrayList arraylist = new ArrayList(gamerequestbuffer1.getCount() + gamerequestbuffer.getCount());
                int k = gamerequestbuffer1.getCount();
                for (int i = 0; i < k; i++)
                {
                    GameRequest gamerequest1 = (GameRequest)((GameRequest)gamerequestbuffer1.get(i)).freeze();
                    sRequestMap.put(new RequestKey(mApplicationId, mPlayerId, gamerequest1.getRequestId()), gamerequest1);
                    arraylist.add(gamerequest1);
                }

                k = gamerequestbuffer.getCount();
                for (int j = ((flag) ? 1 : 0); j < k; j++)
                {
                    GameRequest gamerequest = (GameRequest)((GameRequest)gamerequestbuffer.get(j)).freeze();
                    sRequestMap.put(new RequestKey(mApplicationId, mPlayerId, gamerequest.getRequestId()), gamerequest);
                    arraylist.add(gamerequest);
                }

                mCallback.onRequestsLoaded(arraylist);
            } else
            {
                GamesLog.e("AppContentFrag", "Failed to load requests");
            }
            result.release();
            finish();
        }


        public RequestLoader(AppContentFragment appcontentfragment, String s, String s1, Set set, RequestsLoadedCallback requestsloadedcallback)
        {
            appcontentfragment. super();
            mApplicationId = s;
            mPlayerId = s1;
            mRequestIds = set;
            mCallback = requestsloadedcallback;
            onLoad(null);
        }
    }

    private static final class RequestLoader.RequestKey
    {

        public final String applicationId;
        public final String playerId;
        public final String requestId;

        public final boolean equals(Object obj)
        {
            if (obj instanceof RequestLoader.RequestKey)
            {
                if (this == obj)
                {
                    return true;
                }
                obj = (RequestLoader.RequestKey)obj;
                if (applicationId.equals(((RequestLoader.RequestKey) (obj)).applicationId) && playerId.equals(((RequestLoader.RequestKey) (obj)).playerId) && requestId.equals(((RequestLoader.RequestKey) (obj)).requestId))
                {
                    return true;
                }
            }
            return false;
        }

        public final String toString()
        {
            return (new StringBuilder(applicationId)).append(",").append(playerId).append(",").append(requestId).toString();
        }

        public RequestLoader.RequestKey(String s, String s1, String s2)
        {
            applicationId = s;
            playerId = s1;
            requestId = s2;
        }
    }

    public static class RequestsLoadedCallback
    {

        public void onRequestsLoaded(ArrayList arraylist)
        {
        }

        public RequestsLoadedCallback()
        {
        }
    }

    public static class SharedObject
    {

        public void init(Context context)
        {
        }

        public void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
        {
        }

        public SharedObject()
        {
        }
    }

    public static class SnapshotLoadedCallback
    {

        public void onSnapshotLoaded(SnapshotMetadata snapshotmetadata)
        {
        }

        public SnapshotLoadedCallback()
        {
        }
    }

    private static final class SnapshotLoader extends DelayedLoader
    {

        private static final HashMap sSnapshotMap = new HashMap();
        private final SnapshotLoadedCallback mCallback;
        private final SnapshotKey mKey;

        protected final PendingResult onLoad(GoogleApiClient googleapiclient)
        {
            if (sSnapshotMap.containsKey(mKey))
            {
                mCallback.onSnapshotLoaded((SnapshotMetadata)sSnapshotMap.get(mKey));
                finish();
            } else
            if (googleapiclient != null)
            {
                return Games.Snapshots.loadFirstParty$29b9cb1d(googleapiclient, mKey.playerId, mKey.applicationId);
            }
            return null;
        }

        public final volatile void onResult(Result result)
        {
            int i;
            int j;
            result = (com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult)result;
            if (!mFragment.canUseResult(result))
            {
                break MISSING_BLOCK_LABEL_113;
            }
            i = 0;
            j = result.getSnapshots().getCount();
_L5:
            if (i >= j) goto _L2; else goto _L1
_L1:
            SnapshotMetadata snapshotmetadata = result.getSnapshots().get(i);
            if (!mKey.snapshotId.equals(snapshotmetadata.getSnapshotId())) goto _L4; else goto _L3
_L3:
            snapshotmetadata = (SnapshotMetadata)snapshotmetadata.freeze();
            sSnapshotMap.put(mKey, snapshotmetadata);
            mCallback.onSnapshotLoaded(snapshotmetadata);
_L2:
            result.release();
            finish();
            return;
_L4:
            i++;
              goto _L5
            GamesLog.e("AppContentFrag", (new StringBuilder("Failed to load snapshot: ")).append(mKey.toString()).toString());
              goto _L2
        }


        public SnapshotLoader(AppContentFragment appcontentfragment, String s, String s1, String s2, SnapshotLoadedCallback snapshotloadedcallback)
        {
            appcontentfragment. super();
            mKey = new SnapshotKey(s, s1, s2);
            mCallback = snapshotloadedcallback;
            onLoad(null);
        }
    }

    private static final class SnapshotLoader.SnapshotKey
    {

        public final String applicationId;
        public final String playerId;
        public final String snapshotId;

        public final boolean equals(Object obj)
        {
            if (obj instanceof SnapshotLoader.SnapshotKey)
            {
                if (this == obj)
                {
                    return true;
                }
                obj = (SnapshotLoader.SnapshotKey)obj;
                if (applicationId.equals(((SnapshotLoader.SnapshotKey) (obj)).applicationId) && playerId.equals(((SnapshotLoader.SnapshotKey) (obj)).playerId) && snapshotId.equals(((SnapshotLoader.SnapshotKey) (obj)).snapshotId))
                {
                    return true;
                }
            }
            return false;
        }

        public final String toString()
        {
            return (new StringBuilder(applicationId)).append(",").append(playerId).append(",").append(snapshotId).toString();
        }

        public SnapshotLoader.SnapshotKey(String s, String s1, String s2)
        {
            applicationId = s;
            playerId = s1;
            snapshotId = s2;
        }
    }


    private List mActiveLoaders;
    String mCurrentAccountName;
    String mCurrentPlayerId;
    private FreezeMultiThread mFreezeThread;
    private boolean mInvalidateCacheOnConnect;
    private LinkedList mLoaderQueue;
    private boolean mLoadingFromSaveState;
    private MergedRecyclerAdapter mMergedAdapter;
    private int mNextAdapter;
    private int mNextSection;
    private com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult mPendingResult;
    boolean mProfileIsVisible;
    private ProgressAdapter mProgressAdapter;
    private Bundle mSavedSectionData;
    private final Object mSectionListLock = new Object();
    private final ArrayList mSections = new ArrayList();
    private final HashMap mSharedObjects = new HashMap();
    ArrayList mVisibilityInformers;
    final Object mVisibilityInformersLock = new Object();

    public AppContentFragment()
    {
        mProfileIsVisible = true;
        mVisibilityInformers = new ArrayList();
        mLoaderQueue = new LinkedList();
        mActiveLoaders = new ArrayList();
    }

    private void activateLoader(DelayedLoader delayedloader)
    {
label0:
        {
            if (!delayedloader.isFinished())
            {
                GoogleApiClient googleapiclient = getGoogleApiClient();
                if (!googleapiclient.isConnected())
                {
                    break label0;
                }
                delayedloader.load(googleapiclient);
            }
            return;
        }
        delayedloader.finish();
    }

    private void finishAllLoaders()
    {
        for (; !mLoaderQueue.isEmpty(); ((DelayedLoader)mLoaderQueue.poll()).finish()) { }
        for (; !mActiveLoaders.isEmpty(); ((DelayedLoader)mActiveLoaders.get(0)).finish()) { }
    }

    private void loadAction(ExtendedAppContentAction extendedappcontentaction)
    {
        Object obj = extendedappcontentaction.getSaveKey();
        Bundle bundle;
        if (obj != null)
        {
            if ((bundle = mSavedSectionData.getBundle(extendedappcontentaction.getClass().getName())) != null && (obj = bundle.getBundle(((String) (obj)))) != null)
            {
                extendedappcontentaction.loadFromSaveBundle(((Bundle) (obj)));
                return;
            }
        }
    }

    private void onNextSectionFrozen(AppContentSection appcontentsection, boolean flag)
    {
        Object obj = mSectionListLock;
        obj;
        JVM INSTR monitorenter ;
        int i = 1;
        boolean flag1;
        Object obj1;
        MergedRecyclerAdapter mergedrecycleradapter;
        GamesRecyclerAdapter gamesrecycleradapter;
        Object obj2;
        int j;
        int k;
        int l;
        int i1;
        if (mNextSection < mSections.size())
        {
            if (!ExtendedAppContentSection.getSemanticId(((ExtendedAppContentSection)mSections.get(mNextSection)).mSection).equals(ExtendedAppContentSection.getSemanticId(appcontentsection)))
            {
                i = 1;
            } else
            {
                i = 0;
            }
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_407;
        }
        appcontentsection = new ExtendedAppContentSection(this, appcontentsection);
        obj1 = ((ExtendedAppContentSection) (appcontentsection)).mAdapterList;
        l = ((List) (obj1)).size();
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_392;
        }
        i = 0;
_L4:
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        mergedrecycleradapter = mMergedAdapter;
        i1 = mNextAdapter;
        gamesrecycleradapter = (GamesRecyclerAdapter)((List) (obj1)).get(i);
        if (i1 <= mergedrecycleradapter.mAdapterList.size())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Asserts.checkState(flag1);
        obj2 = new com.google.android.gms.games.ui.MergedRecyclerAdapter.MergedDataObserver(mergedrecycleradapter, gamesrecycleradapter);
        gamesrecycleradapter.registerAdapterDataObserver(((android.support.v7.widget.RecyclerView.AdapterDataObserver) (obj2)));
        j = mergedrecycleradapter.mSpanCount;
        mergedrecycleradapter.mSpanCount = MergedRecyclerAdapter.computeLeastCommonMultiple(mergedrecycleradapter.mSpanCount, gamesrecycleradapter.getSpanCount());
        if (mergedrecycleradapter.mSpanCountChangeListener != null && mergedrecycleradapter.mSpanCount != j)
        {
            mergedrecycleradapter.mSpanCountChangeListener.onSpanCountChanged();
        }
        if (gamesrecycleradapter instanceof com.google.android.gms.games.ui.GamesRecyclerAdapter.DynamicSpanCountAdapter)
        {
            ((com.google.android.gms.games.ui.GamesRecyclerAdapter.DynamicSpanCountAdapter)gamesrecycleradapter).setSpanCountChangeListener(mergedrecycleradapter.mSpanCountChangeChildListener);
        }
        obj2 = new com.google.android.gms.games.ui.MergedRecyclerAdapter.AdapterEntry(gamesrecycleradapter, ((com.google.android.gms.games.ui.MergedRecyclerAdapter.MergedDataObserver) (obj2)));
        mergedrecycleradapter.mAdapterList.add(i1, obj2);
        gamesrecycleradapter.mContainingAdapter = mergedrecycleradapter;
        if (!mergedrecycleradapter.isVisible() || gamesrecycleradapter.getItemCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        k = 0;
        j = 0;
_L2:
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        k += ((com.google.android.gms.games.ui.MergedRecyclerAdapter.AdapterEntry)mergedrecycleradapter.mAdapterList.get(j)).mAdapter.getItemCount();
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        mergedrecycleradapter.notifyItemRangeInserted(k, gamesrecycleradapter.getItemCount());
        mNextAdapter = mNextAdapter + 1;
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        mSections.add(mNextSection, appcontentsection);
        mNextSection = mNextSection + 1;
_L5:
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            mProgressAdapter.setVisible(false);
        }
        return;
        obj1 = (ExtendedAppContentSection)mSections.get(mNextSection);
        ((ExtendedAppContentSection) (obj1)).setSectionData(appcontentsection);
        mNextAdapter = mNextAdapter + ((ExtendedAppContentSection) (obj1)).mAdapterList.size();
        mNextSection = mNextSection + 1;
          goto _L5
        appcontentsection;
        obj;
        JVM INSTR monitorexit ;
        throw appcontentsection;
    }

    private void onResult(com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult loadappcontentresult)
    {
        Object obj;
        int k;
        int l;
        int i1;
        int j1;
        int j2;
        int k2;
        if (mPendingResult != loadappcontentresult && mPendingResult != null)
        {
            mPendingResult.getSections();
            mPendingResult.getSections().release();
        }
        mPendingResult = null;
        if (!super.mResumed)
        {
            mPendingResult = loadappcontentresult;
            return;
        }
        if (UiUtils.isNetworkError(loadappcontentresult.getStatus().mStatusCode))
        {
            mLoadingDataViewManager.setViewState(5);
            onDataLoadFailed();
            return;
        }
        if (mFreezeThread != null)
        {
            mFreezeThread.mShouldAbort = true;
        }
        loadappcontentresult = loadappcontentresult.getSections();
        j2 = mSections.size();
        obj = new ArrayList(j2);
        for (int i = 0; i < j2; i++)
        {
            ((ArrayList) (obj)).add(ExtendedAppContentSection.getSemanticId(((ExtendedAppContentSection)mSections.get(i)).mSection));
        }

        l = loadappcontentresult.getCount();
        ArrayList arraylist = new ArrayList(l);
        for (int j = 0; j < l; j++)
        {
            arraylist.add(ExtendedAppContentSection.getSemanticId((AppContentSection)loadappcontentresult.get(j)));
        }

        obj = AppContentUtils.computeLongestCommonSubsequence(((List) (obj)), arraylist);
        k2 = ((List) (obj)).size();
        j1 = 0;
        i1 = 0;
        k = 0;
        l = 0;
_L5:
        if (j1 >= j2) goto _L2; else goto _L1
_L1:
        int k1;
        int l2;
        k1 = j1 - k;
        l2 = ((ExtendedAppContentSection)mSections.get(k1)).mAdapterList.size();
        if (l >= k2 || j1 != ((Integer)((List) (obj)).get(l)).intValue()) goto _L4; else goto _L3
_L3:
        k1 = i1 + l2;
        i1 = l + 1;
        l = k;
        k = k1;
_L6:
        k1 = j1 + 1;
        j1 = i1;
        i1 = k;
        k = l;
        l = j1;
        j1 = k1;
          goto _L5
_L4:
        mSections.remove(k1);
        for (int l1 = 0; l1 < l2; l1++)
        {
            mMergedAdapter.removeAdapter(i1);
        }

        break MISSING_BLOCK_LABEL_434;
_L2:
        mNextSection = 0;
        mNextAdapter = 0;
        mFreezeThread = new FreezeMultiThread(mParent, this, loadappcontentresult);
        mLoadingDataViewManager.setViewState(2);
        onDataLoaded();
        return;
        int i2 = l;
        l = k + 1;
        k = i1;
        i1 = i2;
          goto _L6
    }

    private void saveAction(ExtendedAppContentAction extendedappcontentaction)
    {
        String s = extendedappcontentaction.getSaveKey();
        Bundle bundle1;
        if (s != null)
        {
            if ((bundle1 = extendedappcontentaction.getSaveBundle()) != null)
            {
                String s1 = extendedappcontentaction.getClass().getName();
                Bundle bundle = mSavedSectionData.getBundle(s1);
                extendedappcontentaction = bundle;
                if (bundle == null)
                {
                    extendedappcontentaction = new Bundle();
                    mSavedSectionData.putBundle(s1, extendedappcontentaction);
                }
                extendedappcontentaction.putBundle(s, bundle1);
                return;
            }
        }
    }

    public final void getGame(String s, GameLoadedCallback gameloadedcallback)
    {
        startNewLoader(new GameLoader(this, s, gameloadedcallback));
    }

    public int getLogId(String s)
    {
        return -1;
    }

    public abstract int getLogSource();

    public final boolean getProfileVisibility()
    {
        return mProfileIsVisible;
    }

    public abstract String getScreenName();

    public final SharedObject getSharedObject(Class class1)
    {
        Object obj = class1.getName();
        SharedObject sharedobject = (SharedObject)mSharedObjects.get(obj);
        if (sharedobject != null)
        {
            Asserts.checkState(class1.isInstance(sharedobject));
            class1 = sharedobject;
        } else
        {
            SharedObject sharedobject1;
            try
            {
                sharedobject1 = (SharedObject)class1.newInstance();
            }
            catch (Exception exception)
            {
                throw new IllegalArgumentException((new StringBuilder("Couldn't instantiate type ")).append(class1).toString(), exception);
            }
            sharedobject1.init(mParent);
            mSharedObjects.put(obj, sharedobject1);
            obj = getGoogleApiClient();
            class1 = sharedobject1;
            if (((GoogleApiClient) (obj)).isConnected())
            {
                sharedobject1.onGoogleApiClientConnected(((GoogleApiClient) (obj)));
                return sharedobject1;
            }
        }
        return class1;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void invalidateAppContentCache()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            mInvalidateCacheOnConnect = true;
            return;
        } else
        {
            mInvalidateCacheOnConnect = false;
            Games.AppContents.invalidateAppContentCacheFirstParty(googleapiclient, new String[] {
                getScreenName()
            });
            return;
        }
    }

    public abstract PendingResult loadData(GoogleApiClient googleapiclient);

    public final void loadStateForSection(ExtendedAppContentSection extendedappcontentsection)
    {
        if (mSavedSectionData != null)
        {
            Object obj = com/google/android/gms/games/ui/appcontent/ExtendedAppContentSection.getName();
            obj = mSavedSectionData.getBundle(((String) (obj)));
            if (obj != null)
            {
                obj = ((Bundle) (obj)).getBundle(extendedappcontentsection.mSection.getId());
                if (obj != null && "CAROUSEL".equals(extendedappcontentsection.mSection.getType()))
                {
                    AppContentCarouselAdapter appcontentcarouseladapter = (AppContentCarouselAdapter)extendedappcontentsection.mAdapter;
                    if (appcontentcarouseladapter.mPagerAdapter != null)
                    {
                        int i = ((Bundle) (obj)).getInt("pagerIndex", 0);
                        appcontentcarouseladapter.mPagerAdapter.mPagerIndex = i;
                    }
                }
            }
            for (Iterator iterator = extendedappcontentsection.mCards.iterator(); iterator.hasNext();)
            {
                Iterator iterator1 = ((ExtendedAppContentCard)iterator.next()).mActions.iterator();
                while (iterator1.hasNext()) 
                {
                    loadAction((ExtendedAppContentAction)iterator1.next());
                }
            }

            extendedappcontentsection = extendedappcontentsection.mActions.iterator();
            while (extendedappcontentsection.hasNext()) 
            {
                loadAction((ExtendedAppContentAction)extendedappcontentsection.next());
            }
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        int j;
        int k;
        int l;
        int k1;
        int l1;
        super.onActivityCreated(bundle);
        mParent.setLayoutInflater(LayoutSlotInflater.from(mParent));
        Object obj = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        mProgressAdapter = new ProgressAdapter(mParent);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mProgressAdapter);
        mMergedAdapter = ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).build();
        obj = mMergedAdapter;
        obj.mTopPaddingOverridden = true;
        obj.mTopPaddingResId = 0x7f0c0130;
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_562;
        }
        mLoadingFromSaveState = true;
        mSavedSectionData = bundle.getBundle("AppContentActions");
        mCurrentAccountName = bundle.getString("SavedAccountName");
        mCurrentPlayerId = bundle.getString("SavedPlayerId");
        mLoadingDataViewManager.setViewState(2);
        mNextSection = 0;
        mNextAdapter = 0;
        android.os.Parcelable aparcelable[] = bundle.getParcelableArray("AppContentSections");
        if (aparcelable != null)
        {
            int i = 0;
            while (i < aparcelable.length) 
            {
                AppContentSection appcontentsection = (AppContentSection)aparcelable[i];
                boolean flag;
                if (i == aparcelable.length - 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                onNextSectionFrozen(appcontentsection, flag);
                i++;
            }
        }
        setAdapter(mMergedAdapter);
        k1 = bundle.getInt("ScrollIndex");
        j = 0;
        k = 0;
        l1 = mSections.size();
        l = 0;
_L13:
        if (l >= l1) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        int i1;
        int j2;
        bundle = (ExtendedAppContentSection)mSections.get(l);
        arraylist = ((ExtendedAppContentSection) (bundle)).mAdapterList;
        j2 = arraylist.size();
        i1 = 0;
_L12:
        if (i1 >= j2) goto _L4; else goto _L3
_L3:
        GamesRecyclerAdapter gamesrecycleradapter;
        int l2;
        gamesrecycleradapter = (GamesRecyclerAdapter)arraylist.get(i1);
        l2 = gamesrecycleradapter.getItemCount();
        if (!(gamesrecycleradapter instanceof DatabufferRecyclerAdapter)) goto _L6; else goto _L5
_L5:
        int j1 = ((ExtendedAppContentSection) (bundle)).mDataBuffer.mObjectList.size();
_L11:
        if (k1 >= j + j1) goto _L8; else goto _L7
_L7:
        if (gamesrecycleradapter instanceof DatabufferRecyclerAdapter)
        {
            DatabufferRecyclerAdapter databufferrecycleradapter = (DatabufferRecyclerAdapter)gamesrecycleradapter;
            bundle = ((ExtendedAppContentSection) (bundle)).mDataBuffer;
            int i2 = databufferrecycleradapter.mStartOffset;
            int k2 = Math.max(0, l2 - 1);
            i1 = -1;
            for (l = 0; l <= k1 - j;)
            {
                j1 = i1;
                if (!((ObjectDataBuffer) (bundle)).mExcludedPositionSet.contains(Integer.valueOf(l)))
                {
                    j1 = i1 + 1;
                }
                l++;
                i1 = j1;
            }

            j = k + Math.min(Math.max(0, i1 - i2), k2);
        } else
        {
            j = k;
        }
          goto _L9
_L6:
        if (!(gamesrecycleradapter instanceof SingleItemRecyclerAdapter)) goto _L2; else goto _L10
_L10:
        j1 = 1;
          goto _L11
_L9:
        if (j >= 0)
        {
            k = mMergedAdapter.getBasePosition();
            bundle = (GridLayoutManager)mRecyclerView.mLayout;
            bundle.mPendingScrollPosition = j + k;
            bundle.mPendingScrollPositionOffset = 0;
            if (((LinearLayoutManager) (bundle)).mPendingSavedState != null)
            {
                ((LinearLayoutManager) (bundle)).mPendingSavedState.mAnchorPosition = -1;
            }
            bundle.requestLayout();
        }
        mLoadingFromSaveState = false;
        return;
_L8:
        k += l2;
        i1++;
        j = j1 + j;
          goto _L12
_L4:
        l++;
          goto _L13
_L2:
        GamesLog.e("AppContentFrag", "Error trying to resolve our scroll position.");
        j = -1;
          goto _L9
        setAdapter(mMergedAdapter);
        return;
          goto _L12
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return super.onCreateView(LayoutSlotInflater.from(super.mActivity), viewgroup, bundle);
    }

    public void onDataLoadFailed()
    {
    }

    public void onDataLoaded()
    {
    }

    public void onDestroyView()
    {
        if (mPendingResult != null)
        {
            mPendingResult.getSections();
            mPendingResult.getSections().release();
            mPendingResult = null;
        }
        finishAllLoaders();
        if (mFreezeThread != null)
        {
            mFreezeThread.mShouldAbort = true;
            mFreezeThread = null;
        }
        synchronized (mSectionListLock)
        {
            mSections.clear();
        }
        synchronized (mVisibilityInformersLock)
        {
            mVisibilityInformers.clear();
        }
        mSharedObjects.clear();
        super.onDestroyView();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        if (isAttachedToParent())
        {
            if (mInvalidateCacheOnConnect)
            {
                invalidateAppContentCache();
            }
            mCurrentAccountName = Games.getCurrentAccountName(googleapiclient);
            mCurrentPlayerId = Games.Players.getCurrentPlayerId(googleapiclient);
            loadData(googleapiclient).setResultCallback(this);
            if (mParent.mIsPlusEnabled)
            {
                Games.Players.loadProfileSettingsInternal$4b6585cf(googleapiclient).setResultCallback(new ProfileVisibilitySettingsCallback((byte)0));
            }
            Iterator iterator = mSharedObjects.values().iterator();
            while (iterator.hasNext()) 
            {
                ((SharedObject)iterator.next()).onGoogleApiClientConnected(googleapiclient);
            }
        }
    }

    public final volatile void onResult(Result result)
    {
        onResult((com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult)result);
    }

    public final void onResume()
    {
        super.onResume();
        if (mPendingResult != null)
        {
            onResult(mPendingResult);
        }
        int i = 0;
        for (int j = mSections.size(); i < j; i++)
        {
            ((ExtendedAppContentSection)mSections.get(i)).checkPendingData();
        }

    }

    public final void onRetry()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            return;
        } else
        {
            loadData(googleapiclient);
            return;
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (mCurrentAccountName != null)
        {
            bundle.putString("SavedAccountName", mCurrentAccountName);
        }
        if (mCurrentPlayerId != null)
        {
            bundle.putString("SavedPlayerId", mCurrentPlayerId);
        }
        Object obj = mSectionListLock;
        obj;
        JVM INSTR monitorenter ;
        if (mSections.isEmpty()) goto _L2; else goto _L1
_L1:
        AppContentSection aappcontentsection[];
        int l1;
        aappcontentsection = new AppContentSection[mSections.size()];
        l1 = ((GridLayoutManager)mRecyclerView.mLayout).findFirstVisibleItemPosition() - mMergedAdapter.getBasePosition();
        int i;
        int j;
        i = 0;
        j = 0;
        int i2 = mSections.size();
        int k = 0;
_L21:
        if (k >= i2) goto _L4; else goto _L3
_L3:
        ExtendedAppContentSection extendedappcontentsection;
        ArrayList arraylist;
        int j2;
        extendedappcontentsection = (ExtendedAppContentSection)mSections.get(k);
        arraylist = extendedappcontentsection.mAdapterList;
        j2 = arraylist.size();
        int l = 0;
_L19:
        if (l >= j2) goto _L6; else goto _L5
_L5:
        Object obj1;
        int k2;
        obj1 = (GamesRecyclerAdapter)arraylist.get(l);
        k2 = ((GamesRecyclerAdapter) (obj1)).getItemCount();
        int i1;
        int l2;
        if (l1 < j + k2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!(obj1 instanceof DatabufferRecyclerAdapter)) goto _L8; else goto _L7
_L7:
        l2 = ((DatabufferRecyclerAdapter)obj1).mStartOffset;
        obj1 = extendedappcontentsection.mDataBuffer;
        if (i1 == 0) goto _L10; else goto _L9
_L9:
        i += ((ObjectDataBuffer) (obj1)).getRawPosition((l1 - j) + l2);
          goto _L11
_L18:
        mSavedSectionData = new Bundle();
        i = 0;
        k = mSections.size();
_L13:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        ExtendedAppContentSection extendedappcontentsection1 = (ExtendedAppContentSection)mSections.get(i);
        aappcontentsection[i] = extendedappcontentsection1.mSection;
        saveStateForSection(extendedappcontentsection1);
        i++;
        if (true) goto _L13; else goto _L12
_L10:
        i1 = i + ((ObjectDataBuffer) (obj1)).mObjectList.size();
        i = j + k2;
        j = i1;
          goto _L14
_L8:
        if (!(obj1 instanceof SingleItemRecyclerAdapter)) goto _L16; else goto _L15
_L15:
        if (i1 == 0) goto _L17; else goto _L11
_L16:
        GamesLog.e("AppContentFrag", "Error trying to resolve our scroll position.");
        i = -1;
          goto _L11
_L4:
        GamesLog.e("AppContentFrag", "Error trying to resolve our scroll position.");
        i = -1;
          goto _L11
_L12:
        bundle.putBundle("AppContentActions", mSavedSectionData);
        bundle.putParcelableArray("AppContentSections", aappcontentsection);
        bundle.putInt("ScrollIndex", j);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
_L11:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
          goto _L18
_L14:
        l++;
        int j1 = i;
        i = j;
        j = j1;
          goto _L19
_L17:
        int k1 = i + 1;
        i = j + k2;
        j = k1;
          goto _L14
_L6:
        k++;
        if (true) goto _L21; else goto _L20
_L20:
    }

    public void onStop()
    {
        finishAllLoaders();
        super.onStop();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        AppContentUtils.setRecyclerPoolSizes(super.mActivity, mRecyclerView);
    }

    public final void saveStateForSection(ExtendedAppContentSection extendedappcontentsection)
    {
        if (mSavedSectionData == null)
        {
            mSavedSectionData = new Bundle();
        }
        Object obj;
        if ("CAROUSEL".equals(extendedappcontentsection.mSection.getType()))
        {
            Bundle bundle = new Bundle();
            AppContentCarouselAdapter appcontentcarouseladapter = (AppContentCarouselAdapter)extendedappcontentsection.mAdapter;
            obj = bundle;
            if (appcontentcarouseladapter.mPagerAdapter != null)
            {
                bundle.putInt("pagerIndex", appcontentcarouseladapter.mPagerAdapter.getCurrentIndex());
                obj = bundle;
            }
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            String s = com/google/android/gms/games/ui/appcontent/ExtendedAppContentSection.getName();
            Bundle bundle2 = mSavedSectionData.getBundle(s);
            Bundle bundle1 = bundle2;
            if (bundle2 == null)
            {
                bundle1 = new Bundle();
                mSavedSectionData.putBundle(s, bundle1);
            }
            bundle1.putBundle(extendedappcontentsection.mSection.getId(), ((Bundle) (obj)));
        }
        for (obj = extendedappcontentsection.mCards.iterator(); ((Iterator) (obj)).hasNext();)
        {
            Iterator iterator = ((ExtendedAppContentCard)((Iterator) (obj)).next()).mActions.iterator();
            while (iterator.hasNext()) 
            {
                saveAction((ExtendedAppContentAction)iterator.next());
            }
        }

        for (extendedappcontentsection = extendedappcontentsection.mActions.iterator(); extendedappcontentsection.hasNext(); saveAction((ExtendedAppContentAction)extendedappcontentsection.next())) { }
    }

    protected final boolean shouldUseAddAnimation()
    {
        if (mLoadingFromSaveState)
        {
            return false;
        } else
        {
            return super.shouldUseAddAnimation();
        }
    }

    final void startNewLoader(DelayedLoader delayedloader)
    {
        if (delayedloader.isFinished())
        {
            return;
        }
        if (mActiveLoaders.size() < 2)
        {
            activateLoader(delayedloader);
            return;
        } else
        {
            mLoaderQueue.add(delayedloader);
            return;
        }
    }

    public final void updateProfileVisibility(boolean flag)
    {
        Object obj = mVisibilityInformersLock;
        obj;
        JVM INSTR monitorenter ;
        mProfileIsVisible = flag;
        for (Iterator iterator = mVisibilityInformers.iterator(); iterator.hasNext(); ((com.google.android.gms.games.ui.util.BaseGamesProfileVisibilityHelper.ProfileVisibilityInformer)iterator.next()).updateProfileVisibility(mProfileIsVisible)) { }
        break MISSING_BLOCK_LABEL_55;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }




/*
    static boolean access$102(AppContentFragment appcontentfragment, boolean flag)
    {
        appcontentfragment.mProfileIsVisible = flag;
        return flag;
    }

*/



/*
    static void access$300(AppContentFragment appcontentfragment, DelayedLoader delayedloader)
    {
        appcontentfragment.mActiveLoaders.remove(delayedloader);
        do
        {
            if (appcontentfragment.mActiveLoaders.size() >= 2)
            {
                break;
            }
            delayedloader = (DelayedLoader)appcontentfragment.mLoaderQueue.poll();
            if (delayedloader == null)
            {
                break;
            }
            appcontentfragment.activateLoader(delayedloader);
        } while (true);
        return;
    }

*/
}
