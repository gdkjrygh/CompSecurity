// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.DataHolderNotifier;
import com.google.android.gms.common.api.internal.DataHolderResult;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.appcontent.AppContentSectionBuffer;
import com.google.android.gms.games.internal.constants.RequestType;
import com.google.android.gms.games.internal.events.EventIncrementCache;
import com.google.android.gms.games.internal.events.EventIncrementManager;
import com.google.android.gms.games.internal.experience.ExperienceEventBuffer;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.internal.request.RequestUpdateOutcomes;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestEntity;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.signin.internal.SignInClientImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupManager, GamesLog, IGamesService, AbstractGamesCallbacks, 
//            AbstractGamesClient, PopupLocationInfoParcelable

public final class GamesClientImpl extends GmsClient
{
    private static abstract class AbstractPeerStatusNotifier extends AbstractRoomStatusNotifier
    {

        private final ArrayList mParticipantIds = new ArrayList();

        protected final void notifyListener(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            notifyListener$2b0c8916(roomstatusupdatelistener, room);
        }

        protected abstract void notifyListener$2b0c8916(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

        AbstractPeerStatusNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder);
            int i = 0;
            for (int j = as.length; i < j; i++)
            {
                mParticipantIds.add(as[i]);
            }

        }
    }

    private static abstract class AbstractRoomNotifier extends DataHolderNotifier
    {

        protected abstract void notifyListener(RoomUpdateListener roomupdatelistener, Room room, int i);

        protected final volatile void notifyListener(Object obj, DataHolder dataholder)
        {
            notifyListener((RoomUpdateListener)obj, GamesClientImpl.getRoom(dataholder), dataholder.mStatusCode);
        }

        AbstractRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static abstract class AbstractRoomStatusNotifier extends DataHolderNotifier
    {

        protected abstract void notifyListener(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

        protected final volatile void notifyListener(Object obj, DataHolder dataholder)
        {
            notifyListener((RoomStatusUpdateListener)obj, GamesClientImpl.getRoom(dataholder));
        }

        AbstractRoomStatusNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class AcceptQuestResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.quest.Quests.AcceptQuestResult
    {

        private final Quest mQuest = null;

        public final Quest getQuest()
        {
            return mQuest;
        }

        AcceptQuestResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new QuestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            mQuest = new QuestEntity((Quest)dataholder.get(0));
_L4:
            dataholder.release();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class AchievementsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onAchievementsLoaded(DataHolder dataholder)
        {
            mResultHolder.setResult(new LoadAchievementsResultImpl(dataholder));
        }

        public AchievementsLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class AppContentLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mAppContentLoadedHolder;

        public final void onLoadAppContent(DataHolder adataholder[])
        {
            mAppContentLoadedHolder.setResult(new LoadAppContentsResultImpl(adataholder));
        }

        public AppContentLoadedBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mAppContentLoadedHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class ConnectedToRoomNotifier extends AbstractRoomStatusNotifier
    {

        public final void notifyListener(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onConnectedToRoom(room);
        }

        ConnectedToRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class ContactSettingLoadResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.Notifications.ContactSettingLoadResult
    {

        public final DataHolder getDataHolder()
        {
            return mDataHolder;
        }

        ContactSettingLoadResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class ContactSettingsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onContactSettingsLoaded(DataHolder dataholder)
        {
            mResultHolder.setResult(new ContactSettingLoadResultImpl(dataholder));
        }

        public ContactSettingsLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class ContactSettingsUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onContactSettingsUpdated(int i)
        {
            mResultHolder.setResult(GamesStatusCodes.create(i));
        }

        public ContactSettingsUpdatedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class DeleteSnapshotResultImpl
        implements com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult
    {

        private final String mSnapshotId;
        private final Status mStatus;

        public final String getSnapshotId()
        {
            return mSnapshotId;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        DeleteSnapshotResultImpl(int i, String s)
        {
            mStatus = GamesStatusCodes.create(i);
            mSnapshotId = s;
        }
    }

    private static final class DisconnectedFromRoomNotifier extends AbstractRoomStatusNotifier
    {

        public final void notifyListener(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onDisconnectedFromRoom(room);
        }

        DisconnectedFromRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private final class GameClientEventIncrementCache extends EventIncrementCache
    {

        final GamesClientImpl this$0;

        protected final void doIncrementEvent(String s, int i)
        {
            if (isConnected())
            {
                ((IGamesService)getService()).incrementEvent(s, i);
                return;
            }
            try
            {
                GamesLog.e("GamesClientImpl", (new StringBuilder("Unable to increment event ")).append(s).append(" by ").append(i).append(" because the games client is no longer connected").toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                GamesClientImpl.printExceptionLog(s);
            }
            return;
        }

        public GameClientEventIncrementCache()
        {
            this$0 = GamesClientImpl.this;
            super(mContext.getMainLooper(), 1000);
        }
    }

    private static final class GameMuteStatusChangeResultImpl
        implements com.google.android.gms.games.Notifications.GameMuteStatusChangeResult
    {

        private final String mExternalGameId;
        private final boolean mIsMuted;
        private final Status mStatus;

        public final String getExternalGameId()
        {
            return mExternalGameId;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final boolean isMuted()
        {
            return mIsMuted;
        }

        public GameMuteStatusChangeResultImpl(int i, String s, boolean flag)
        {
            mStatus = GamesStatusCodes.create(i);
            mExternalGameId = s;
            mIsMuted = flag;
        }
    }

    private static final class GameMuteStatusChangedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onGameMuteStatusChanged(int i, String s, boolean flag)
        {
            mResultHolder.setResult(new GameMuteStatusChangeResultImpl(i, s, flag));
        }

        GameMuteStatusChangedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class GameSearchSuggestionsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onGameSearchSuggestionsLoaded(DataHolder dataholder)
        {
            mResultHolder.setResult(new LoadGameSearchSuggestionsResultImpl(dataholder));
        }

        public GameSearchSuggestionsLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static abstract class GamesDataHolderResult extends DataHolderResult
    {

        protected GamesDataHolderResult(DataHolder dataholder)
        {
            super(dataholder, GamesStatusCodes.create(dataholder.mStatusCode));
        }
    }

    private static final class GamesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onGamesLoaded(DataHolder dataholder)
        {
            mResultHolder.setResult(new LoadGamesResultImpl(dataholder));
        }

        public GamesLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class InboxCountResultImpl
        implements com.google.android.gms.games.Notifications.InboxCountResult
    {

        private final Bundle mInboxCounts;
        private final Status mStatus;

        public final int getActivityCount(String s)
        {
            return mInboxCounts.getInt(s, 0);
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final int getTotalCount()
        {
            return mInboxCounts.getInt("inbox_total_count", 0);
        }

        public final boolean hasNewActivity()
        {
            return mInboxCounts.getBoolean("inbox_has_new_activity", false);
        }

        InboxCountResultImpl(Status status, Bundle bundle)
        {
            mStatus = status;
            mInboxCounts = bundle;
        }
    }

    private static final class InboxCountsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onInboxCountsLoaded(int i, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = GamesStatusCodes.create(i);
            mResultHolder.setResult(new InboxCountResultImpl(status, bundle));
        }

        public InboxCountsLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class InitiateMatchResultImpl extends TurnBasedMatchResult
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult
    {

        InitiateMatchResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class InvitationReceivedBinderCallback extends AbstractGamesCallbacks
    {

        private final ListenerHolder mListener;

        public final void onInvitationReceived(DataHolder dataholder)
        {
            InvitationBuffer invitationbuffer;
            invitationbuffer = new InvitationBuffer(dataholder);
            dataholder = null;
            if (invitationbuffer.getCount() > 0)
            {
                dataholder = (Invitation)((Invitation)invitationbuffer.get(0)).freeze();
            }
            invitationbuffer.release();
            if (dataholder != null)
            {
                mListener.notifyListener(new InvitationReceivedNotifier(dataholder));
            }
            return;
            dataholder;
            invitationbuffer.release();
            throw dataholder;
        }

        public final void onInvitationRemoved(String s)
        {
            mListener.notifyListener(new InvitationRemovedNotifier(s));
        }

        public InvitationReceivedBinderCallback(ListenerHolder listenerholder)
        {
            mListener = listenerholder;
        }
    }

    private static final class InvitationReceivedNotifier
        implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    {

        private final Invitation mInvitation;

        public final volatile void notifyListener(Object obj)
        {
            ((OnInvitationReceivedListener)obj).onInvitationReceived$4945a01a();
        }

        public final void onNotifyListenerFailed()
        {
        }

        InvitationReceivedNotifier(Invitation invitation)
        {
            mInvitation = invitation;
        }
    }

    private static final class InvitationRemovedNotifier
        implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    {

        private final String mInvitationId;

        public final volatile void notifyListener(Object obj)
        {
            ((OnInvitationReceivedListener)obj).onInvitationRemoved$552c4e01();
        }

        public final void onNotifyListenerFailed()
        {
        }

        InvitationRemovedNotifier(String s)
        {
            mInvitationId = s;
        }
    }

    private static final class InvitationsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onInvitationsLoaded(DataHolder dataholder)
        {
            mResultHolder.setResult(new LoadInvitationsResultImpl(dataholder));
        }

        public InvitationsLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class JoinedRoomNotifier extends AbstractRoomNotifier
    {

        public final void notifyListener(RoomUpdateListener roomupdatelistener, Room room, int i)
        {
            roomupdatelistener.onJoinedRoom$2623dbd5(room);
        }

        public JoinedRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LeaderboardMetadataResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult
    {

        private final LeaderboardBuffer mBuffer;

        public final LeaderboardBuffer getLeaderboards()
        {
            return mBuffer;
        }

        LeaderboardMetadataResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            mBuffer = new LeaderboardBuffer(dataholder);
        }
    }

    private static final class LeaderboardScoresLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onLeaderboardScoresLoaded(DataHolder dataholder, DataHolder dataholder1)
        {
            mResultHolder.setResult(new LoadScoresResultImpl(dataholder, dataholder1));
        }

        public LeaderboardScoresLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class LeaderboardsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onLeaderboardsLoaded(DataHolder dataholder)
        {
            mResultHolder.setResult(new LeaderboardMetadataResultImpl(dataholder));
        }

        public LeaderboardsLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class LeftRoomNotifier
        implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    {

        private final String mRoomId;
        private final int mStatusCode;

        public final volatile void notifyListener(Object obj)
        {
            ((RoomUpdateListener)obj).onLeftRoom$4f708078(mRoomId);
        }

        public final void onNotifyListenerFailed()
        {
        }

        LeftRoomNotifier(int i, String s)
        {
            mStatusCode = i;
            mRoomId = s;
        }
    }

    private static final class LoadAchievementsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult
    {

        private final AchievementBuffer mBuffer;

        public final AchievementBuffer getAchievements()
        {
            return mBuffer;
        }

        LoadAchievementsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            mBuffer = new AchievementBuffer(dataholder);
        }
    }

    private static final class LoadAclResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.internal.game.Acls.LoadAclResult
    {

        public final DataHolder getDataHolder()
        {
            return mDataHolder;
        }

        LoadAclResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadAppContentsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult
    {

        private final ArrayList mDataHolders;

        public final AppContentSectionBuffer getSections()
        {
            return new AppContentSectionBuffer(mDataHolders);
        }

        LoadAppContentsResultImpl(DataHolder adataholder[])
        {
            super(adataholder[0]);
            mDataHolders = new ArrayList(Arrays.asList(adataholder));
        }
    }

    private static final class LoadGameSearchSuggestionsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult
    {

        private final GameSearchSuggestionBuffer mBuffer;

        public final GameSearchSuggestionBuffer getSuggestions()
        {
            return mBuffer;
        }

        LoadGameSearchSuggestionsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            mBuffer = new GameSearchSuggestionBuffer(dataholder);
        }
    }

    private static final class LoadGamesResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.GamesMetadata.LoadGamesResult
    {

        private final GameBuffer mBuffer;

        public final GameBuffer getGames()
        {
            return mBuffer;
        }

        LoadGamesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            mBuffer = new GameBuffer(dataholder);
        }
    }

    private static final class LoadInvitationsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult
    {

        private final InvitationBuffer mBuffer;

        public final InvitationBuffer getInvitations()
        {
            return mBuffer;
        }

        LoadInvitationsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            mBuffer = new InvitationBuffer(dataholder);
        }
    }

    private static final class LoadMatchResultImpl extends TurnBasedMatchResult
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult
    {

        LoadMatchResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadMatchesResultImpl
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult
    {

        private final LoadMatchesResponse mResponse;
        private final Status mStatus;

        public final LoadMatchesResponse getMatches()
        {
            return mResponse;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final void release()
        {
            mResponse.release();
        }

        LoadMatchesResultImpl(Status status, Bundle bundle)
        {
            mStatus = status;
            mResponse = new LoadMatchesResponse(bundle);
        }
    }

    private static final class LoadPlayersResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.Players.LoadPlayersResult
    {

        private final PlayerBuffer mBuffer;

        public final PlayerBuffer getPlayers()
        {
            return mBuffer;
        }

        LoadPlayersResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            mBuffer = new PlayerBuffer(dataholder);
        }
    }

    private static final class LoadProfileSettingsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.Players.LoadProfileSettingsResult
    {

        private final boolean mIsExplicitlySet;
        private final boolean mIsVisible;

        public final Status getStatus()
        {
            return mStatus;
        }

        public final boolean isProfileVisible()
        {
            return mIsVisible;
        }

        LoadProfileSettingsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            if (dataholder.mRowCount <= 0) goto _L2; else goto _L1
_L1:
            int i = dataholder.getWindowIndex(0);
            mIsVisible = dataholder.getBoolean("profile_visible", 0, i);
            mIsExplicitlySet = dataholder.getBoolean("profile_visibility_explicitly_set", 0, i);
_L4:
            dataholder.close();
            return;
_L2:
            mIsVisible = true;
            mIsExplicitlySet = false;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private static final class LoadQuestsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.quest.Quests.LoadQuestsResult
    {

        private final DataHolder mDataHolder;

        public final QuestBuffer getQuests()
        {
            return new QuestBuffer(mDataHolder);
        }

        LoadQuestsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            mDataHolder = dataholder;
        }
    }

    private static final class LoadRequestsResultImpl
        implements com.google.android.gms.games.request.Requests.LoadRequestsResult
    {

        private final Bundle mRequestsBundle;
        private final Status mStatus;

        public final GameRequestBuffer getRequests(int i)
        {
            String s = RequestType.fromInt(i);
            if (!mRequestsBundle.containsKey(s))
            {
                return null;
            } else
            {
                return new GameRequestBuffer((DataHolder)mRequestsBundle.get(s));
            }
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final void release()
        {
            Iterator iterator = mRequestsBundle.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                obj = (DataHolder)mRequestsBundle.getParcelable(((String) (obj)));
                if (obj != null)
                {
                    ((DataHolder) (obj)).close();
                }
            } while (true);
        }

        LoadRequestsResultImpl(Status status, Bundle bundle)
        {
            mStatus = status;
            mRequestsBundle = bundle;
        }
    }

    private static final class LoadScoresResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    {

        private final LeaderboardEntity mLeaderboard = null;
        private final LeaderboardScoreBuffer mScoreBuffer;

        public final Leaderboard getLeaderboard()
        {
            return mLeaderboard;
        }

        public final LeaderboardScoreBuffer getScores()
        {
            return mScoreBuffer;
        }

        LoadScoresResultImpl(DataHolder dataholder, DataHolder dataholder1)
        {
            super(dataholder1);
            dataholder = new LeaderboardBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            mLeaderboard = (LeaderboardEntity)((Leaderboard)dataholder.get(0)).freeze();
_L4:
            dataholder.release();
            mScoreBuffer = new LeaderboardScoreBuffer(dataholder1);
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            dataholder1;
            dataholder.release();
            throw dataholder1;
        }
    }

    private static final class LoadSnapshotsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult
    {

        public final SnapshotMetadataBuffer getSnapshots()
        {
            return new SnapshotMetadataBuffer(mDataHolder);
        }

        LoadSnapshotsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadXpForGameCategoriesResultImpl
        implements com.google.android.gms.games.Players.LoadXpForGameCategoriesResult
    {

        private final List mSortedCategories;
        private final Status mStatus;
        private final Bundle mXpBundle;

        public final List getGameCategories()
        {
            return mSortedCategories;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final long getXpForCategory(String s)
        {
            return mXpBundle.getLong(s, -1L);
        }

        LoadXpForGameCategoriesResultImpl(Status status, Bundle bundle)
        {
            mStatus = status;
            mSortedCategories = bundle.getStringArrayList("game_category_list");
            mXpBundle = bundle;
        }
    }

    private static final class LoadXpStreamResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.Players.LoadXpStreamResult
    {

        private final ExperienceEventBuffer mBuffer;

        public final ExperienceEventBuffer getExperienceEvents()
        {
            return mBuffer;
        }

        LoadXpStreamResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            mBuffer = new ExperienceEventBuffer(dataholder);
        }
    }

    private static final class MatchRemovedNotifier
        implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    {

        private final String mMatchId;

        public final volatile void notifyListener(Object obj)
        {
            ((OnTurnBasedMatchUpdateReceivedListener)obj).onTurnBasedMatchRemoved$552c4e01();
        }

        public final void onNotifyListenerFailed()
        {
        }

        MatchRemovedNotifier(String s)
        {
            mMatchId = s;
        }
    }

    private static final class MatchUpdateReceivedBinderCallback extends AbstractGamesCallbacks
    {

        private final ListenerHolder mListener;

        public final void onTurnBasedMatchReceived(DataHolder dataholder)
        {
            TurnBasedMatchBuffer turnbasedmatchbuffer;
            turnbasedmatchbuffer = new TurnBasedMatchBuffer(dataholder);
            dataholder = null;
            if (turnbasedmatchbuffer.getCount() > 0)
            {
                dataholder = (TurnBasedMatch)((TurnBasedMatch)turnbasedmatchbuffer.get(0)).freeze();
            }
            turnbasedmatchbuffer.release();
            if (dataholder != null)
            {
                mListener.notifyListener(new MatchUpdateReceivedNotifier(dataholder));
            }
            return;
            dataholder;
            turnbasedmatchbuffer.release();
            throw dataholder;
        }

        public final void onTurnBasedMatchRemoved(String s)
        {
            mListener.notifyListener(new MatchRemovedNotifier(s));
        }

        public MatchUpdateReceivedBinderCallback(ListenerHolder listenerholder)
        {
            mListener = listenerholder;
        }
    }

    private static final class MatchUpdateReceivedNotifier
        implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    {

        private final TurnBasedMatch mMatch;

        public final volatile void notifyListener(Object obj)
        {
            ((OnTurnBasedMatchUpdateReceivedListener)obj).onTurnBasedMatchReceived$660f1cd7();
        }

        public final void onNotifyListenerFailed()
        {
        }

        MatchUpdateReceivedNotifier(TurnBasedMatch turnbasedmatch)
        {
            mMatch = turnbasedmatch;
        }
    }

    private static final class NotifyAclLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onNotifyAclLoaded(DataHolder dataholder)
        {
            mResultHolder.setResult(new LoadAclResultImpl(dataholder));
        }

        public NotifyAclLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class NotifyAclUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onNotifyAclUpdated(int i)
        {
            mResultHolder.setResult(GamesStatusCodes.create(i));
        }

        public NotifyAclUpdatedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class P2PConnectedNotifier
        implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    {

        private final String mParticipantId;

        public final volatile void notifyListener(Object obj)
        {
        }

        public final void onNotifyListenerFailed()
        {
        }

        P2PConnectedNotifier(String s)
        {
            mParticipantId = s;
        }
    }

    private static final class P2PDisconnectedNotifier
        implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    {

        private final String mParticipantId;

        public final volatile void notifyListener(Object obj)
        {
        }

        public final void onNotifyListenerFailed()
        {
        }

        P2PDisconnectedNotifier(String s)
        {
            mParticipantId = s;
        }
    }

    private static final class PeerConnectedNotifier extends AbstractPeerStatusNotifier
    {

        protected final void notifyListener$2b0c8916(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onPeersConnected$40879e9d(room);
        }

        PeerConnectedNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerDeclinedNotifier extends AbstractPeerStatusNotifier
    {

        protected final void notifyListener$2b0c8916(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onPeerDeclined$40879e9d(room);
        }

        PeerDeclinedNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerDisconnectedNotifier extends AbstractPeerStatusNotifier
    {

        protected final void notifyListener$2b0c8916(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onPeersDisconnected$40879e9d(room);
        }

        PeerDisconnectedNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerInvitedToRoomNotifier extends AbstractPeerStatusNotifier
    {

        protected final void notifyListener$2b0c8916(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onPeerInvitedToRoom$40879e9d(room);
        }

        PeerInvitedToRoomNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerJoinedRoomNotifier extends AbstractPeerStatusNotifier
    {

        protected final void notifyListener$2b0c8916(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onPeerJoined$40879e9d(room);
        }

        PeerJoinedRoomNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerLeftRoomNotifier extends AbstractPeerStatusNotifier
    {

        protected final void notifyListener$2b0c8916(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onPeerLeft$40879e9d(room);
        }

        PeerLeftRoomNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PlayerXpForGameCategoriesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onXpForGameCategoriesLoaded(int i, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = GamesStatusCodes.create(i);
            mResultHolder.setResult(new LoadXpForGameCategoriesResultImpl(status, bundle));
        }

        public PlayerXpForGameCategoriesLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    public static final class PlayerXpStreamLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onXpStreamLoaded(DataHolder dataholder)
        {
            mResultHolder.setResult(new LoadXpStreamResultImpl(dataholder));
        }

        public PlayerXpStreamLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class PlayersLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onExtendedPlayersLoaded(DataHolder dataholder)
        {
            mResultHolder.setResult(new LoadPlayersResultImpl(dataholder));
        }

        public final void onPlayersLoaded(DataHolder dataholder)
        {
            mResultHolder.setResult(new LoadPlayersResultImpl(dataholder));
        }

        public PlayersLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class PopupLocationInfoBinderCallbacks extends AbstractGamesClient
    {

        private final PopupManager mPopupManager;

        public final PopupLocationInfoParcelable getPopupLocationInfo()
        {
            return new PopupLocationInfoParcelable(mPopupManager.getPopupLocationInfo());
        }

        public PopupLocationInfoBinderCallbacks(PopupManager popupmanager)
        {
            mPopupManager = popupmanager;
        }
    }

    public static final class ProfileSettingsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onProfileSettingsLoaded(DataHolder dataholder)
        {
            mResultHolder.setResult(new LoadProfileSettingsResultImpl(dataholder));
        }

        public ProfileSettingsLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class ProfileSettingsUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onProfileSettingsUpdated(int i)
        {
            mResultHolder.setResult(GamesStatusCodes.create(i));
        }

        public ProfileSettingsUpdatedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class QuestAcceptedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mQuestsAcceptHolder;

        public final void onQuestAccepted(DataHolder dataholder)
        {
            mQuestsAcceptHolder.setResult(new AcceptQuestResultImpl(dataholder));
        }

        public QuestAcceptedBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mQuestsAcceptHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class QuestCompletedNotifier
        implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    {

        private final Quest mQuest;

        public final volatile void notifyListener(Object obj)
        {
            ((QuestUpdateListener)obj).onQuestCompleted$61796567();
        }

        public final void onNotifyListenerFailed()
        {
        }

        QuestCompletedNotifier(Quest quest)
        {
            mQuest = quest;
        }
    }

    private static final class QuestUpdateBinderCallback extends AbstractGamesCallbacks
    {

        private final ListenerHolder mListener;

        private static Quest getQuest(DataHolder dataholder)
        {
            QuestBuffer questbuffer;
            questbuffer = new QuestBuffer(dataholder);
            dataholder = null;
            if (questbuffer.getCount() > 0)
            {
                dataholder = (Quest)((Quest)questbuffer.get(0)).freeze();
            }
            questbuffer.release();
            return dataholder;
            dataholder;
            questbuffer.release();
            throw dataholder;
        }

        public final void onQuestCompleted(DataHolder dataholder)
        {
            dataholder = getQuest(dataholder);
            if (dataholder != null)
            {
                mListener.notifyListener(new QuestCompletedNotifier(dataholder));
            }
        }

        public QuestUpdateBinderCallback(ListenerHolder listenerholder)
        {
            mListener = listenerholder;
        }
    }

    private static final class QuestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mQuestsLoadedHolder;

        public final void onQuestsLoaded(DataHolder dataholder)
        {
            mQuestsLoadedHolder.setResult(new LoadQuestsResultImpl(dataholder));
        }

        public QuestsLoadedBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mQuestsLoadedHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class RequestReceivedBinderCallback extends AbstractGamesCallbacks
    {

        private final ListenerHolder mListener;

        public final void onRequestReceived(DataHolder dataholder)
        {
            GameRequestBuffer gamerequestbuffer;
            gamerequestbuffer = new GameRequestBuffer(dataholder);
            dataholder = null;
            if (gamerequestbuffer.getCount() > 0)
            {
                dataholder = (GameRequest)((GameRequest)gamerequestbuffer.get(0)).freeze();
            }
            gamerequestbuffer.release();
            if (dataholder != null)
            {
                mListener.notifyListener(new RequestReceivedNotifier(dataholder));
            }
            return;
            dataholder;
            gamerequestbuffer.release();
            throw dataholder;
        }

        public final void onRequestRemoved(String s)
        {
            mListener.notifyListener(new RequestRemovedNotifier(s));
        }

        public RequestReceivedBinderCallback(ListenerHolder listenerholder)
        {
            mListener = listenerholder;
        }
    }

    private static final class RequestReceivedNotifier
        implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    {

        private final GameRequest mRequest;

        public final volatile void notifyListener(Object obj)
        {
            ((OnRequestReceivedListener)obj).onRequestReceived(mRequest);
        }

        public final void onNotifyListenerFailed()
        {
        }

        RequestReceivedNotifier(GameRequest gamerequest)
        {
            mRequest = gamerequest;
        }
    }

    private static final class RequestRemovedNotifier
        implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    {

        private final String mRequestId;

        public final volatile void notifyListener(Object obj)
        {
            ((OnRequestReceivedListener)obj).onRequestRemoved$552c4e01();
        }

        public final void onNotifyListenerFailed()
        {
        }

        RequestRemovedNotifier(String s)
        {
            mRequestId = s;
        }
    }

    private static final class RequestSentBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mRequestSentHolder;

        public final void onRequestSent(DataHolder dataholder)
        {
            mRequestSentHolder.setResult(new SendRequestResultImpl(dataholder));
        }

        public RequestSentBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mRequestSentHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class RequestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mRequestsLoadedHolder;

        public final void onRequestsLoaded(int i, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = GamesStatusCodes.create(i);
            mRequestsLoadedHolder.setResult(new LoadRequestsResultImpl(status, bundle));
        }

        public RequestsLoadedBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mRequestsLoadedHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class RequestsUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mRequestsUpdatedHolder;

        public final void onRequestsUpdated(DataHolder dataholder)
        {
            mRequestsUpdatedHolder.setResult(new UpdateRequestsResultImpl(dataholder));
        }

        public RequestsUpdatedBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mRequestsUpdatedHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class RoomAutoMatchingNotifier extends AbstractRoomStatusNotifier
    {

        public final void notifyListener(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomAutoMatching(room);
        }

        RoomAutoMatchingNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class RoomBinderCallbacks extends AbstractGamesCallbacks
    {

        private final ListenerHolder mRealTimeMessageReceivedCallbacks = null;
        private final ListenerHolder mRoomCallbacks;
        private final ListenerHolder mRoomStatusCallbacks;

        public final void onConnectedToRoom(DataHolder dataholder)
        {
            if (mRoomStatusCallbacks != null)
            {
                mRoomStatusCallbacks.notifyListener(new ConnectedToRoomNotifier(dataholder));
            }
        }

        public final void onDisconnectedFromRoom(DataHolder dataholder)
        {
            if (mRoomStatusCallbacks != null)
            {
                mRoomStatusCallbacks.notifyListener(new DisconnectedFromRoomNotifier(dataholder));
            }
        }

        public final void onJoinedRoom(DataHolder dataholder)
        {
            mRoomCallbacks.notifyListener(new JoinedRoomNotifier(dataholder));
        }

        public final void onLeftRoom(int i, String s)
        {
            mRoomCallbacks.notifyListener(new LeftRoomNotifier(i, s));
        }

        public final void onP2PConnected(String s)
        {
            if (mRoomStatusCallbacks != null)
            {
                mRoomStatusCallbacks.notifyListener(new P2PConnectedNotifier(s));
            }
        }

        public final void onP2PDisconnected(String s)
        {
            if (mRoomStatusCallbacks != null)
            {
                mRoomStatusCallbacks.notifyListener(new P2PDisconnectedNotifier(s));
            }
        }

        public final void onPeerConnected(DataHolder dataholder, String as[])
        {
            if (mRoomStatusCallbacks != null)
            {
                mRoomStatusCallbacks.notifyListener(new PeerConnectedNotifier(dataholder, as));
            }
        }

        public final void onPeerDeclined(DataHolder dataholder, String as[])
        {
            if (mRoomStatusCallbacks != null)
            {
                mRoomStatusCallbacks.notifyListener(new PeerDeclinedNotifier(dataholder, as));
            }
        }

        public final void onPeerDisconnected(DataHolder dataholder, String as[])
        {
            if (mRoomStatusCallbacks != null)
            {
                mRoomStatusCallbacks.notifyListener(new PeerDisconnectedNotifier(dataholder, as));
            }
        }

        public final void onPeerInvitedToRoom(DataHolder dataholder, String as[])
        {
            if (mRoomStatusCallbacks != null)
            {
                mRoomStatusCallbacks.notifyListener(new PeerInvitedToRoomNotifier(dataholder, as));
            }
        }

        public final void onPeerJoinedRoom(DataHolder dataholder, String as[])
        {
            if (mRoomStatusCallbacks != null)
            {
                mRoomStatusCallbacks.notifyListener(new PeerJoinedRoomNotifier(dataholder, as));
            }
        }

        public final void onPeerLeftRoom(DataHolder dataholder, String as[])
        {
            if (mRoomStatusCallbacks != null)
            {
                mRoomStatusCallbacks.notifyListener(new PeerLeftRoomNotifier(dataholder, as));
            }
        }

        public final void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
        {
        }

        public final void onRoomAutoMatching(DataHolder dataholder)
        {
            if (mRoomStatusCallbacks != null)
            {
                mRoomStatusCallbacks.notifyListener(new RoomAutoMatchingNotifier(dataholder));
            }
        }

        public final void onRoomConnected(DataHolder dataholder)
        {
            mRoomCallbacks.notifyListener(new RoomConnectedNotifier(dataholder));
        }

        public final void onRoomConnecting(DataHolder dataholder)
        {
            if (mRoomStatusCallbacks != null)
            {
                mRoomStatusCallbacks.notifyListener(new RoomConnectingNotifier(dataholder));
            }
        }

        public final void onRoomCreated(DataHolder dataholder)
        {
            mRoomCallbacks.notifyListener(new RoomCreatedNotifier(dataholder));
        }

        public RoomBinderCallbacks(ListenerHolder listenerholder, ListenerHolder listenerholder1)
        {
            mRoomCallbacks = (ListenerHolder)Preconditions.checkNotNull(listenerholder, "Callbacks must not be null");
            mRoomStatusCallbacks = listenerholder1;
        }
    }

    private static final class RoomConnectedNotifier extends AbstractRoomNotifier
    {

        public final void notifyListener(RoomUpdateListener roomupdatelistener, Room room, int i)
        {
            roomupdatelistener.onRoomConnected(i, room);
        }

        RoomConnectedNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class RoomConnectingNotifier extends AbstractRoomStatusNotifier
    {

        public final void notifyListener(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomConnecting(room);
        }

        RoomConnectingNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class RoomCreatedNotifier extends AbstractRoomNotifier
    {

        public final void notifyListener(RoomUpdateListener roomupdatelistener, Room room, int i)
        {
            roomupdatelistener.onRoomCreated$2623dbd5(room);
        }

        public RoomCreatedNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class SendRequestResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.request.Requests.SendRequestResult
    {

        private final GameRequest mRequest = null;

        SendRequestResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new GameRequestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            mRequest = (GameRequest)((GameRequest)dataholder.get(0)).freeze();
_L4:
            dataholder.release();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class SignOutCompleteBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onSignOutComplete()
        {
            Status status = GamesStatusCodes.create(0);
            mResultHolder.setResult(status);
        }

        public SignOutCompleteBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    public static final class SnapshotDeletedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onSnapshotDeleted(int i, String s)
        {
            mResultHolder.setResult(new DeleteSnapshotResultImpl(i, s));
        }

        public SnapshotDeletedBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class SnapshotsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mSnapshotsLoadedHolder;

        public final void onSnapshotsLoaded(DataHolder dataholder)
        {
            mSnapshotsLoadedHolder.setResult(new LoadSnapshotsResultImpl(dataholder));
        }

        public SnapshotsLoadedBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mSnapshotsLoadedHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class StartRecordingBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.games.Games.BaseGamesApiMethodImpl mResultHolder;

        public final void onLaunchGameForRecording(int i)
        {
            mResultHolder.setResult(new Status(i));
        }

        public StartRecordingBinderCallback(com.google.android.gms.games.Games.BaseGamesApiMethodImpl basegamesapimethodimpl)
        {
            mResultHolder = (com.google.android.gms.games.Games.BaseGamesApiMethodImpl)Preconditions.checkNotNull(basegamesapimethodimpl, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchInitiatedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mMatchInitiatedHolder;

        public final void onTurnBasedMatchInitiated(DataHolder dataholder)
        {
            mMatchInitiatedHolder.setResult(new InitiateMatchResultImpl(dataholder));
        }

        public TurnBasedMatchInitiatedBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mMatchInitiatedHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mMatchLoadedHolder;

        public final void onTurnBasedMatchLoaded(DataHolder dataholder)
        {
            mMatchLoadedHolder.setResult(new LoadMatchResultImpl(dataholder));
        }

        public TurnBasedMatchLoadedBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mMatchLoadedHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static abstract class TurnBasedMatchResult extends GamesDataHolderResult
    {

        final TurnBasedMatch mMatch = null;

        public final TurnBasedMatch getMatch()
        {
            return mMatch;
        }

        TurnBasedMatchResult(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new TurnBasedMatchBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            mMatch = (TurnBasedMatch)((TurnBasedMatch)dataholder.get(0)).freeze();
_L4:
            dataholder.release();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class TurnBasedMatchesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mMatchesLoadedHolder;

        public final void onTurnBasedMatchesLoaded(int i, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = GamesStatusCodes.create(i);
            mMatchesLoadedHolder.setResult(new LoadMatchesResultImpl(status, bundle));
        }

        public TurnBasedMatchesLoadedBinderCallbacks(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mMatchesLoadedHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class UpdateRequestsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.request.Requests.UpdateRequestsResult
    {

        private final RequestUpdateOutcomes mOutcomes;

        UpdateRequestsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            mOutcomes = RequestUpdateOutcomes.fromDataHolder(dataholder);
        }
    }


    public final long mClientId = (long)hashCode();
    private GameEntity mCurrentGame;
    private PlayerEntity mCurrentPlayer;
    private final String mGamePackageName;
    private final com.google.android.gms.games.Games.GamesOptions mGamesOptions;
    public EventIncrementManager mIncrementCache;
    private boolean mMustShowWelcomePopup;
    private final PopupManager mPopupManager;
    private final Binder mRealTimeGameDeathBinder = new Binder();

    public GamesClientImpl(Context context, Looper looper, ClientSettings clientsettings, com.google.android.gms.games.Games.GamesOptions gamesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 1, clientsettings, connectioncallbacks, onconnectionfailedlistener);
        mIncrementCache = new EventIncrementManager() {

            final GamesClientImpl this$0;

            public final EventIncrementCache buildCache()
            {
                return new GameClientEventIncrementCache();
            }

            
            {
                this$0 = GamesClientImpl.this;
                super();
            }
        };
        mMustShowWelcomePopup = false;
        mGamePackageName = clientsettings.mRealClientPackageName;
        mPopupManager = PopupManager.getPopupManager(this, clientsettings.mGravityForPopups);
        context = clientsettings.mViewForPopups;
        mPopupManager.setGamesContentView(context);
        mGamesOptions = gamesoptions;
    }

    private static Room getRoom(DataHolder dataholder)
    {
        RoomBuffer roombuffer;
        roombuffer = new RoomBuffer(dataholder);
        dataholder = null;
        if (roombuffer.getCount() > 0)
        {
            dataholder = (Room)((Room)roombuffer.get(0)).freeze();
        }
        roombuffer.release();
        return dataholder;
        dataholder;
        roombuffer.release();
        throw dataholder;
    }

    public static void printExceptionLog(RemoteException remoteexception)
    {
        GamesLog.w("GamesClientImpl", "service died", remoteexception);
    }

    public final void cancelPopups()
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_19;
        }
        ((IGamesService)getService()).cancelPopups();
        return;
        RemoteException remoteexception;
        remoteexception;
        printExceptionLog(remoteexception);
        return;
    }

    public final void connect(com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks connectionprogressreportcallbacks)
    {
        mCurrentPlayer = null;
        mCurrentGame = null;
        super.connect(connectionprogressreportcallbacks);
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return IGamesService.Stub.asInterface(ibinder);
    }

    public final void declineInvitation(String s, int i)
    {
        try
        {
            ((IGamesService)getService()).declineInvitation(s, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printExceptionLog(s);
        }
    }

    public final void declineInvitationFirstParty(String s, String s1, int i)
    {
        try
        {
            ((IGamesService)getService()).declineInvitationFirstParty(s, s1, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printExceptionLog(s);
        }
    }

    public final void disconnect()
    {
        mMustShowWelcomePopup = false;
        if (isConnected())
        {
            try
            {
                IGamesService igamesservice = (IGamesService)getService();
                igamesservice.cancelPopups();
                mIncrementCache.flush();
                igamesservice.clientDisconnecting(mClientId);
            }
            catch (RemoteException remoteexception)
            {
                GamesLog.w("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.disconnect();
    }

    public final void dismissInvitation(String s, int i)
    {
        try
        {
            ((IGamesService)getService()).dismissInvitation(s, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printExceptionLog(s);
        }
    }

    public final void dismissInvitationFirstParty(String s, String s1, int i)
    {
        try
        {
            ((IGamesService)getService()).dismissInvitationFirstParty(s, s1, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printExceptionLog(s);
        }
    }

    public final Intent getAchievementDescriptionIntentRestricted(AchievementEntity achievemententity)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)getService()).getAchievementDescriptionIntentRestricted(achievemententity);
        }
        // Misplaced declaration of an exception variable
        catch (AchievementEntity achievemententity)
        {
            printExceptionLog(achievemententity);
            return null;
        }
        if (achievemententity == null || intent == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        intent.setExtrasClassLoader(achievemententity.getClass().getClassLoader());
        return intent;
    }

    public final String getAppId()
    {
        String s;
        try
        {
            s = ((IGamesService)getService()).getAppId();
        }
        catch (RemoteException remoteexception)
        {
            printExceptionLog(remoteexception);
            return null;
        }
        return s;
    }

    public final Bundle getConnectionHint()
    {
        Bundle bundle;
        try
        {
            bundle = ((IGamesService)getService()).getConnectionHint();
        }
        catch (RemoteException remoteexception)
        {
            printExceptionLog(remoteexception);
            return null;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        bundle.setClassLoader(com/google/android/gms/games/internal/GamesClientImpl.getClassLoader());
        return bundle;
    }

    public final String getCurrentAccountName()
    {
        String s;
        try
        {
            s = ((IGamesService)getService()).getCurrentAccountName();
        }
        catch (RemoteException remoteexception)
        {
            printExceptionLog(remoteexception);
            return null;
        }
        return s;
    }

    public final Game getCurrentGame()
    {
        checkConnected();
        this;
        JVM INSTR monitorenter ;
        Object obj = mCurrentGame;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new GameBuffer(((IGamesService)getService()).getCurrentGame());
        if (((GameBuffer) (obj)).getCount() > 0)
        {
            mCurrentGame = (GameEntity)((GameBuffer) (obj)).get(0).freeze();
        }
        ((GameBuffer) (obj)).release();
_L1:
        this;
        JVM INSTR monitorexit ;
        return mCurrentGame;
        Exception exception;
        exception;
        ((GameBuffer) (obj)).release();
        throw exception;
        Object obj1;
        obj1;
        printExceptionLog(((RemoteException) (obj1)));
          goto _L1
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final Player getCurrentPlayer()
    {
        checkConnected();
        this;
        JVM INSTR monitorenter ;
        Object obj = mCurrentPlayer;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new PlayerBuffer(((IGamesService)getService()).getCurrentPlayer());
        if (((PlayerBuffer) (obj)).getCount() > 0)
        {
            mCurrentPlayer = (PlayerEntity)((PlayerBuffer) (obj)).get(0).freeze();
        }
        ((PlayerBuffer) (obj)).release();
_L1:
        this;
        JVM INSTR monitorexit ;
        return mCurrentPlayer;
        Exception exception;
        exception;
        ((PlayerBuffer) (obj)).release();
        throw exception;
        Object obj1;
        obj1;
        printExceptionLog(((RemoteException) (obj1)));
          goto _L1
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final String getCurrentPlayerId()
    {
        if (mCurrentPlayer != null)
        {
            return mCurrentPlayer.mPlayerId;
        }
        String s;
        try
        {
            s = ((IGamesService)getService()).getCurrentPlayerId();
        }
        catch (RemoteException remoteexception)
        {
            printExceptionLog(remoteexception);
            return null;
        }
        return s;
    }

    protected final Bundle getGetServiceRequestExtraArgs()
    {
        Object obj = super.mContext.getResources().getConfiguration().locale.toString();
        Bundle bundle = mGamesOptions.getAsBundle();
        bundle.putString("com.google.android.gms.games.key.gamePackageName", mGamePackageName);
        bundle.putString("com.google.android.gms.games.key.desiredLocale", ((String) (obj)));
        bundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(mPopupManager.getPopupWindowToken()));
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", 2);
        obj = super.mClientSettings;
        if (((ClientSettings) (obj)).mSignInOptions != null)
        {
            bundle.putBundle("com.google.android.gms.games.key.signInOptions", SignInClientImpl.createBundleFromSignInOptions(((ClientSettings) (obj)).mSignInOptions, ((ClientSettings) (obj)).mSessionId, Executors.newSingleThreadExecutor()));
        }
        return bundle;
    }

    public final Intent getLeaderboardIntent$6c972b94(String s)
    {
        try
        {
            s = ((IGamesService)getService()).getLeaderboardIntentV3(s, -1, -1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printExceptionLog(s);
            return null;
        }
        return s;
    }

    public final int getMaxRequestPayloadSize()
    {
        int i;
        try
        {
            i = ((IGamesService)getService()).getMaxRequestPayloadSize();
        }
        catch (RemoteException remoteexception)
        {
            printExceptionLog(remoteexception);
            return -1;
        }
        return i;
    }

    public final ParcelFileDescriptor getParcelFileDescriptorFirstParty(Uri uri)
    {
        checkConnected();
        try
        {
            uri = ((IGamesService)getService()).getParcelFileDescriptorFirstParty(uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            printExceptionLog(uri);
            return null;
        }
        return uri;
    }

    public final Intent getParticipantListIntentRestricted(ParticipantEntity aparticipantentity[], String s, String s1, String s2, Uri uri, Uri uri1)
    {
        try
        {
            aparticipantentity = ((IGamesService)getService()).getParticipantListIntentRestrictedV2(aparticipantentity, s1, s2, uri, uri1, s);
        }
        // Misplaced declaration of an exception variable
        catch (ParticipantEntity aparticipantentity[])
        {
            printExceptionLog(aparticipantentity);
            return null;
        }
        return aparticipantentity;
    }

    public final Intent getPlayerSearchIntent()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)getService()).getPlayerSearchIntent();
        }
        catch (RemoteException remoteexception)
        {
            printExceptionLog(remoteexception);
            return null;
        }
        return intent;
    }

    public final Intent getPlusUpgradeIntentFirstParty()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)getService()).getPlusUpgradeIntentFirstParty();
        }
        catch (RemoteException remoteexception)
        {
            printExceptionLog(remoteexception);
            return null;
        }
        return intent;
    }

    public final Intent getPublicInvitationListIntentRestricted(ZInvitationCluster zinvitationcluster, String s, String s1)
    {
        try
        {
            zinvitationcluster = ((IGamesService)getService()).getPublicInvitationListIntentRestricted(zinvitationcluster, s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (ZInvitationCluster zinvitationcluster)
        {
            printExceptionLog(zinvitationcluster);
            return null;
        }
        return zinvitationcluster;
    }

    public final Intent getPublicRequestListIntentRestricted(GameRequestCluster gamerequestcluster, String s)
    {
        try
        {
            gamerequestcluster = ((IGamesService)getService()).getPublicRequestListIntentRestricted(gamerequestcluster, s);
        }
        // Misplaced declaration of an exception variable
        catch (GameRequestCluster gamerequestcluster)
        {
            printExceptionLog(gamerequestcluster);
            return null;
        }
        return gamerequestcluster;
    }

    public final String getSelectedAccountForGameRestricted(String s)
    {
        try
        {
            s = ((IGamesService)getService()).getSelectedAccountForGameRestricted(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printExceptionLog(s);
            return null;
        }
        return s;
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    public final Intent getSettingsIntent()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)getService()).getSettingsIntent();
        }
        catch (RemoteException remoteexception)
        {
            printExceptionLog(remoteexception);
            return null;
        }
        return intent;
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.gms.games.service.START";
    }

    public final void loadInvitablePlayers(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)getService()).loadInvitablePlayers(new PlayersLoadedBinderCallback(resultholder), i, flag, flag1);
    }

    public final void loadPlayer(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, boolean flag)
        throws RemoteException
    {
        ((IGamesService)getService()).loadPlayerV2(new PlayersLoadedBinderCallback(resultholder), s, flag);
    }

    public final void loadPlayersFirstParty(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, String s1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)getService()).loadPlayersFirstParty(new PlayersLoadedBinderCallback(resultholder), s, s1, i, flag, flag1);
    }

    public final void loadPlayersInternal$4b9c992e(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, String s1, int i, boolean flag)
        throws RemoteException
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   -1049482625: 125
    //                   156408498: 109
    //                   782949780: 93;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_125;
_L5:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Invalid player collection: ")).append(s).toString());

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            ((IGamesService)getService()).loadPlayersInternal(new PlayersLoadedBinderCallback(resultholder), s, s1, i, false, flag);
            break;
        }
        break MISSING_BLOCK_LABEL_168;
_L4:
        if (s.equals("circled"))
        {
            byte0 = 0;
        }
          goto _L5
_L3:
        if (s.equals("played_with"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("nearby"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    public final void onConnectedLocked()
    {
        super.onConnectedLocked();
        if (mMustShowWelcomePopup)
        {
            mPopupManager.showWelcomePopup();
            mMustShowWelcomePopup = false;
        }
        if (mGamesOptions.allowHeadlessAccess)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        PopupLocationInfoBinderCallbacks popuplocationinfobindercallbacks = new PopupLocationInfoBinderCallbacks(mPopupManager);
        ((IGamesService)getService()).registerPopupLocationInfoListener(popuplocationinfobindercallbacks, mClientId);
        return;
        RemoteException remoteexception;
        remoteexception;
        printExceptionLog(remoteexception);
        return;
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        super.onConnectionFailed(connectionresult);
        mMustShowWelcomePopup = false;
    }

    protected final void onPostInitHandler(int i, IBinder ibinder, Bundle bundle, int j)
    {
        if (i == 0 && bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/games/internal/GamesClientImpl.getClassLoader());
            mMustShowWelcomePopup = bundle.getBoolean("show_welcome_popup");
            mCurrentPlayer = (PlayerEntity)bundle.getParcelable("com.google.android.gms.games.current_player");
            mCurrentGame = (GameEntity)bundle.getParcelable("com.google.android.gms.games.current_game");
        }
        super.onPostInitHandler(i, ibinder, bundle, j);
    }

    public final Room registerWaitingRoomListenerRestricted(ListenerHolder listenerholder, String s)
    {
        try
        {
            listenerholder = new RoomBinderCallbacks(listenerholder, listenerholder);
            listenerholder = ((IGamesService)getService()).registerWaitingRoomListenerRestricted(listenerholder, s);
        }
        // Misplaced declaration of an exception variable
        catch (ListenerHolder listenerholder)
        {
            printExceptionLog(listenerholder);
            return null;
        }
        return listenerholder;
    }

    public final boolean requiresSignIn()
    {
        return true;
    }

    public final void searchForPlayersInternal(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)getService()).searchForPlayersInternal(new PlayersLoadedBinderCallback(resultholder), s, i, flag, flag1);
    }

    public final void setGameMuteStatusInternal(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, boolean flag)
        throws RemoteException
    {
        ((IGamesService)getService()).setGameMuteStatusInternal(new GameMuteStatusChangedBinderCallback(resultholder), s, flag);
    }

    public final boolean shouldAllowLevelUpNotificationsFirstParty()
    {
        boolean flag;
        try
        {
            flag = ((IGamesService)getService()).shouldAllowLevelUpNotificationsFirstParty();
        }
        catch (RemoteException remoteexception)
        {
            printExceptionLog(remoteexception);
            return true;
        }
        return flag;
    }

    public final int unregisterWaitingRoomListenerRestricted(String s)
    {
        int i;
        try
        {
            i = ((IGamesService)getService()).unregisterWaitingRoomListenerRestricted(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            printExceptionLog(s);
            return 1;
        }
        return i;
    }

    protected final Set validateScopes(Set set)
    {
        boolean flag1 = false;
        boolean flag = false;
        Scope scope = new Scope("https://www.googleapis.com/auth/games");
        Scope scope1 = new Scope("https://www.googleapis.com/auth/games.firstparty");
        Iterator iterator = set.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Scope scope2 = (Scope)iterator.next();
            if (scope2.equals(scope))
            {
                flag1 = true;
            } else
            if (scope2.equals(scope1))
            {
                flag = true;
            }
        } while (true);
        if (flag)
        {
            if (!flag1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Cannot have both %s and %s!", new Object[] {
                "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"
            });
            return set;
        } else
        {
            Preconditions.checkState(flag1, "Games APIs requires %s to function.", new Object[] {
                "https://www.googleapis.com/auth/games"
            });
            return set;
        }
    }


}
