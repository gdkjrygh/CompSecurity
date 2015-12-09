// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.chimera.BaseAsyncOperationService;
import com.google.android.gms.chimera.PooledAsyncOperationService;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.service.OperationException;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.games.broker.AppContentContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.client.IPlayGamesCallbacks;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.internal.events.EventIncrementEntry;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.server.api.RoomLeaveDiagnostics;
import com.google.android.gms.games.service.operations.AccountsChangedOperation;
import com.google.android.gms.games.service.operations.ClearDataOperation;
import com.google.android.gms.games.service.operations.GetGamesAuthTokenOperation;
import com.google.android.gms.games.service.operations.InitializeGamesOperation;
import com.google.android.gms.games.service.operations.LoadContactSettingsOperation;
import com.google.android.gms.games.service.operations.LoadExperimentsOperation;
import com.google.android.gms.games.service.operations.PackageModifiedOperation;
import com.google.android.gms.games.service.operations.PeopleChangedOperation;
import com.google.android.gms.games.service.operations.SignOutOperation;
import com.google.android.gms.games.service.operations.UpdateContactSettingsOperation;
import com.google.android.gms.games.service.operations.ValidatePlayServiceConnectionOperation;
import com.google.android.gms.games.service.operations.ValidateServiceConnectionOperation;
import com.google.android.gms.games.service.operations.achievements.IncrementAchievementOperation;
import com.google.android.gms.games.service.operations.achievements.LoadAchievementsInternalOperation;
import com.google.android.gms.games.service.operations.achievements.LoadAchievementsOperation;
import com.google.android.gms.games.service.operations.achievements.SetAchievementStepsOperation;
import com.google.android.gms.games.service.operations.achievements.UpdateAchievementOperation;
import com.google.android.gms.games.service.operations.acls.LoadNotifyAclOperation;
import com.google.android.gms.games.service.operations.acls.UpdateNotifyAclOperation;
import com.google.android.gms.games.service.operations.appcontent.InvalidateAppContentOperation;
import com.google.android.gms.games.service.operations.appcontent.LoadAppContentOperation;
import com.google.android.gms.games.service.operations.events.ClearPendingEventsOperation;
import com.google.android.gms.games.service.operations.events.IncrementEventsOperation;
import com.google.android.gms.games.service.operations.events.LoadEventsByIdOperation;
import com.google.android.gms.games.service.operations.events.LoadEventsOperation;
import com.google.android.gms.games.service.operations.games.LoadGameCollectionComparisonOperation;
import com.google.android.gms.games.service.operations.games.LoadGameFirstPartyOperation;
import com.google.android.gms.games.service.operations.games.LoadGameInstancesOperation;
import com.google.android.gms.games.service.operations.games.LoadGameOperation;
import com.google.android.gms.games.service.operations.games.LoadGameSearchSuggestionsOperation;
import com.google.android.gms.games.service.operations.games.LoadGamesCollectionOperation;
import com.google.android.gms.games.service.operations.games.LoadPlayGamesRecentlyPlayedOperation;
import com.google.android.gms.games.service.operations.games.RecordApplicationSessionOperation;
import com.google.android.gms.games.service.operations.games.SearchForGamesOperation;
import com.google.android.gms.games.service.operations.games.SetIdentitySharingConfirmedOperation;
import com.google.android.gms.games.service.operations.games.UpdatePlayedOperation;
import com.google.android.gms.games.service.operations.invitations.DeclineInvitationOperation;
import com.google.android.gms.games.service.operations.invitations.DismissInvitationOperation;
import com.google.android.gms.games.service.operations.invitations.LoadInvitationsOperation;
import com.google.android.gms.games.service.operations.leaderboards.GetScoreOperation;
import com.google.android.gms.games.service.operations.leaderboards.LoadLeaderboardsOperation;
import com.google.android.gms.games.service.operations.leaderboards.LoadMoreScoresOperation;
import com.google.android.gms.games.service.operations.leaderboards.LoadScoresOperation;
import com.google.android.gms.games.service.operations.leaderboards.SubmitScoreOperation;
import com.google.android.gms.games.service.operations.notifications.AcknowledgeNotificationsOperation;
import com.google.android.gms.games.service.operations.notifications.ClearNotificationsOperation;
import com.google.android.gms.games.service.operations.notifications.GetInboxActivityCountsOperation;
import com.google.android.gms.games.service.operations.notifications.IsGameMutedOperation;
import com.google.android.gms.games.service.operations.notifications.NotificationOpenedOperation;
import com.google.android.gms.games.service.operations.notifications.SetGameMuteStatusOperation;
import com.google.android.gms.games.service.operations.players.AddNearbyPlayerOperation;
import com.google.android.gms.games.service.operations.players.DismissPlayerSuggestionOperation;
import com.google.android.gms.games.service.operations.players.LoadCircledPlayersOperation;
import com.google.android.gms.games.service.operations.players.LoadConnectedPlayersOperation;
import com.google.android.gms.games.service.operations.players.LoadFirstPartyPlayersOperation;
import com.google.android.gms.games.service.operations.players.LoadInvitablePlayersOperation;
import com.google.android.gms.games.service.operations.players.LoadPlayerOperation;
import com.google.android.gms.games.service.operations.players.LoadPlayersInternalOperation;
import com.google.android.gms.games.service.operations.players.LoadPlayersOperation;
import com.google.android.gms.games.service.operations.players.LoadProfileSettingsOperation;
import com.google.android.gms.games.service.operations.players.LoadXpForGameCategoriesOperation;
import com.google.android.gms.games.service.operations.players.LoadXpStreamOperation;
import com.google.android.gms.games.service.operations.players.RecordPlayerSuggestionActionOperation;
import com.google.android.gms.games.service.operations.players.SearchForPlayersOperation;
import com.google.android.gms.games.service.operations.players.UpdateProfileSettingsOperation;
import com.google.android.gms.games.service.operations.quests.AcceptQuestOperation;
import com.google.android.gms.games.service.operations.quests.ClaimMilestoneOperation;
import com.google.android.gms.games.service.operations.quests.LoadQuestsOperation;
import com.google.android.gms.games.service.operations.quests.QuestStateChangedPopupOperation;
import com.google.android.gms.games.service.operations.realtime.CreateRoomOperation;
import com.google.android.gms.games.service.operations.realtime.JoinRoomOperation;
import com.google.android.gms.games.service.operations.realtime.LeaveRoomOperation;
import com.google.android.gms.games.service.operations.realtime.ReportP2pStatusOperation;
import com.google.android.gms.games.service.operations.requests.AcceptRequestOperation;
import com.google.android.gms.games.service.operations.requests.DismissRequestOperation;
import com.google.android.gms.games.service.operations.requests.LoadRequestSummariesOperation;
import com.google.android.gms.games.service.operations.requests.LoadRequestsOperation;
import com.google.android.gms.games.service.operations.requests.SendRequestOperation;
import com.google.android.gms.games.service.operations.snapshots.CommitSnapshotOperation;
import com.google.android.gms.games.service.operations.snapshots.DeleteSnapshotOperation;
import com.google.android.gms.games.service.operations.snapshots.LoadSnapshotsOperation;
import com.google.android.gms.games.service.operations.snapshots.OpenSnapshotOperation;
import com.google.android.gms.games.service.operations.snapshots.ResolveSnapshotConflictOperation;
import com.google.android.gms.games.service.operations.snapshots.VerifySnapshotFolderOperation;
import com.google.android.gms.games.service.operations.stats.LoadPlayerStatsOperation;
import com.google.android.gms.games.service.operations.turnbased.AcceptTurnBasedMatchInvitationOperation;
import com.google.android.gms.games.service.operations.turnbased.CancelTurnBasedMatchOperation;
import com.google.android.gms.games.service.operations.turnbased.CreateTurnBasedMatchOperation;
import com.google.android.gms.games.service.operations.turnbased.DismissTurnBasedMatchOperation;
import com.google.android.gms.games.service.operations.turnbased.FinishTurnBasedMatchOperation;
import com.google.android.gms.games.service.operations.turnbased.GetTurnBasedMatchOperation;
import com.google.android.gms.games.service.operations.turnbased.LeaveTurnBasedMatchOperation;
import com.google.android.gms.games.service.operations.turnbased.LoadTurnBasedMatchesOperation;
import com.google.android.gms.games.service.operations.turnbased.RematchTurnBasedMatchOperation;
import com.google.android.gms.games.service.operations.turnbased.UpdateTurnBasedMatchOperation;
import com.google.android.gms.games.service.operations.video.LaunchGameForRecordingOperation;
import com.google.android.gms.games.service.operations.video.ListVideosOperation;
import com.google.android.gms.games.service.operations.video.StopRecordingOperation;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.video.VideoConfiguration;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.games.service:
//            WrappedGamesCallbacks, ApiClientTracker

public class PlayGamesAsyncService extends PooledAsyncOperationService
{
    private static final class GamesThreadFactory
        implements ThreadFactory
    {

        private static final AtomicInteger THREAD_COUNT = new AtomicInteger();

        public final Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder("PlayGamesAsyncThread")).append(THREAD_COUNT.getAndIncrement()).toString());
        }


        private GamesThreadFactory()
        {
        }

        GamesThreadFactory(byte byte0)
        {
            this();
        }
    }

    public static interface Operation
    {

        public abstract void execute(Context context, DataBroker databroker);

        public abstract void postExecute();
    }

    private static final class OperationAdapter extends com.google.android.gms.chimera.PooledAsyncOperationService.PooledAsyncOperation
    {

        private final int mAffinity;
        private final Operation mOperation;

        public final volatile void execute(BaseAsyncOperationService baseasyncoperationservice)
            throws OperationException, RemoteException
        {
            PlayGamesAsyncService playgamesasyncservice;
            playgamesasyncservice = (PlayGamesAsyncService)baseasyncoperationservice;
            baseasyncoperationservice = DataBroker.acquireBroker(playgamesasyncservice);
            SystemClock.elapsedRealtime();
            mOperation.execute(playgamesasyncservice, baseasyncoperationservice);
            SystemClock.elapsedRealtime();
            mOperation.postExecute();
            baseasyncoperationservice.release();
            return;
            Exception exception;
            exception;
            mOperation.postExecute();
            baseasyncoperationservice.release();
            throw exception;
        }

        public final int getAffinity()
        {
            return mAffinity;
        }

        public OperationAdapter(Operation operation, int i)
        {
            mOperation = operation;
            mAffinity = i;
        }
    }

    public static interface P2pStatusReportCallback
    {

        public abstract void onReportedStatus(DataHolder dataholder);
    }

    public static interface RoomEnteredCallback
    {

        public abstract void onEnteredRoom(DataHolder dataholder);
    }

    public static interface RoomLeftCallback
    {

        public abstract void onLeftRoom(int i, String s);
    }


    private static final int AFFINITIES[] = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
        12, 13
    };
    public static final com.google.android.gms.chimera.BaseAsyncOperationService.AsyncOperationQueue sOperations = new com.google.android.gms.chimera.BaseAsyncOperationService.AsyncOperationQueue();

    public PlayGamesAsyncService()
    {
        super("GamesAsyncService", sOperations, getThreadPools(), 500L);
    }

    public static void acceptQuest(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        startService(gamesclientcontext, 10, new AcceptQuestOperation(gamesclientcontext, wrappedgamescallbacks, s));
    }

    public static void acceptRequests(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String as[])
    {
        startService(gamesclientcontext.mContext, 8, new AcceptRequestOperation(gamesclientcontext, wrappedgamescallbacks, as));
    }

    public static void acceptTurnBasedInvitation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        startService(gamesclientcontext.mContext, 6, new AcceptTurnBasedMatchInvitationOperation(gamesclientcontext, wrappedgamescallbacks, s));
    }

    public static void acknowledgeNotifications(Context context, String s)
    {
        startService(context, -1, new AcknowledgeNotificationsOperation(s));
    }

    public static void addNearbyPlayer(GamesClientContext gamesclientcontext, String s)
    {
        startService(gamesclientcontext.mContext, -1, new AddNearbyPlayerOperation(gamesclientcontext, s));
    }

    public static void cancelTurnBasedMatch(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        startService(gamesclientcontext.mContext, 6, new CancelTurnBasedMatchOperation(gamesclientcontext, wrappedgamescallbacks, s));
    }

    public static void claimMilestone(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, String s1)
    {
        startService(gamesclientcontext, 10, new ClaimMilestoneOperation(gamesclientcontext, wrappedgamescallbacks, s, s1));
    }

    public static void clearData(Context context, boolean flag)
    {
        startService(context, -1, new ClearDataOperation(flag));
    }

    public static void clearNotifications$182ca992(Context context, String s, String s1, int i)
    {
        startService(context, -1, new ClearNotificationsOperation(s, s1, null, i));
    }

    public static void clearPendingEvents(GamesClientContext gamesclientcontext)
    {
        startService(gamesclientcontext, 10, new ClearPendingEventsOperation(gamesclientcontext));
    }

    public static void commitAndCloseSnapshot(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, ApiClientTracker apiclienttracker, String s, SnapshotMetadataChange snapshotmetadatachange, DriveContents drivecontents)
    {
        startService(gamesclientcontext.mContext, 9, new CommitSnapshotOperation(gamesclientcontext, wrappedgamescallbacks, apiclienttracker, s, snapshotmetadatachange, drivecontents));
    }

    public static void createRoom(GamesClientContext gamesclientcontext, RoomEnteredCallback roomenteredcallback, int i, String as[], Bundle bundle, ConnectionInfo connectioninfo)
    {
        startService(gamesclientcontext.mContext, 5, new CreateRoomOperation(gamesclientcontext, roomenteredcallback, i, as, bundle, connectioninfo));
    }

    public static void createTurnBasedMatch(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i, int j, String as[], Bundle bundle)
    {
        startService(gamesclientcontext.mContext, 6, new CreateTurnBasedMatchOperation(gamesclientcontext, wrappedgamescallbacks, i, j, as, bundle));
    }

    public static void declineInvitation(GamesClientContext gamesclientcontext, String s, int i)
    {
        startService(gamesclientcontext.mContext, 4, new DeclineInvitationOperation(gamesclientcontext, s, i));
    }

    public static void deleteSnapshot(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, ApiClientTracker apiclienttracker, String s)
    {
        startService(gamesclientcontext.mContext, 9, new DeleteSnapshotOperation(gamesclientcontext, wrappedgamescallbacks, apiclienttracker, s));
    }

    public static void dismissInvitation(GamesClientContext gamesclientcontext, String s, int i)
    {
        startService(gamesclientcontext.mContext, 4, new DismissInvitationOperation(gamesclientcontext, s, i));
    }

    public static void dismissMatch(GamesClientContext gamesclientcontext, String s)
    {
        startService(gamesclientcontext.mContext, 6, new DismissTurnBasedMatchOperation(gamesclientcontext, s));
    }

    public static void dismissPlayerSuggestion(GamesClientContext gamesclientcontext)
    {
        startService(gamesclientcontext.mContext, -1, new DismissPlayerSuggestionOperation(gamesclientcontext));
    }

    public static void dismissRequests(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String as[])
    {
        startService(gamesclientcontext.mContext, 8, new DismissRequestOperation(gamesclientcontext, wrappedgamescallbacks, as));
    }

    public static void finishTurnBasedMatch(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, byte abyte0[], ParticipantResult aparticipantresult[])
    {
        startService(gamesclientcontext.mContext, 6, new FinishTurnBasedMatchOperation(gamesclientcontext, wrappedgamescallbacks, s, abyte0, aparticipantresult));
    }

    public static void getGamesAuthToken(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext, -1, new GetGamesAuthTokenOperation(gamesclientcontext, wrappedgamescallbacks));
    }

    public static void getInboxActivityCounts(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext.mContext, -1, new GetInboxActivityCountsOperation(gamesclientcontext, wrappedgamescallbacks));
    }

    public static void getLeaderboardScore(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, int i, int j)
    {
        startService(gamesclientcontext.mContext, 2, new GetScoreOperation(gamesclientcontext, wrappedgamescallbacks, s, i, j));
    }

    private static SparseArray getThreadPools()
    {
        SparseArray sparsearray = new SparseArray();
        GamesThreadFactory gamesthreadfactory = new GamesThreadFactory((byte)0);
        sparsearray.put(-1, Executors.newFixedThreadPool(4, gamesthreadfactory));
        int ai[] = AFFINITIES;
        for (int i = 0; i < 12; i++)
        {
            sparsearray.put(Integer.valueOf(ai[i]).intValue(), Executors.newSingleThreadExecutor(gamesthreadfactory));
        }

        return sparsearray;
    }

    public static void getTurnBasedMatch(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        startService(gamesclientcontext.mContext, 6, new GetTurnBasedMatchOperation(gamesclientcontext, wrappedgamescallbacks, s));
    }

    public static void handleAccountsChanged(Context context)
    {
        startService(context, -1, new AccountsChangedOperation());
    }

    public static void handlePackageInstalled(Context context, String s)
    {
        startService(context, -1, new PackageModifiedOperation(s, true));
    }

    public static void handlePackageUninstalled(Context context, String s)
    {
        startService(context, -1, new PackageModifiedOperation(s, false));
    }

    public static void handlePeopleChanged(Context context)
    {
        startService(context, -1, new PeopleChangedOperation());
    }

    public static void incrementAchievement(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, int i, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
    {
        startService(gamesclientcontext, 3, new IncrementAchievementOperation(gamesclientcontext, wrappedgamescallbacks, s, i, popuplocationinfo));
    }

    public static void incrementEvents(GamesClientContext gamesclientcontext, String s, int i)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new EventIncrementEntry(s, i));
        startService(gamesclientcontext, 10, new IncrementEventsOperation(gamesclientcontext, arraylist));
    }

    public static void initializeGames(Context context)
    {
        startService(context, -1, new InitializeGamesOperation());
    }

    public static void invalidateAppContentCache(GamesClientContext gamesclientcontext, String as[])
    {
        startService(gamesclientcontext.mContext, 12, new InvalidateAppContentOperation(gamesclientcontext, as));
    }

    public static void isGameMuted(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext.mContext, 7, new IsGameMutedOperation(gamesclientcontext, wrappedgamescallbacks));
    }

    public static void joinRoom(GamesClientContext gamesclientcontext, RoomEnteredCallback roomenteredcallback, String s, ConnectionInfo connectioninfo)
    {
        startService(gamesclientcontext.mContext, 5, new JoinRoomOperation(gamesclientcontext, roomenteredcallback, s, connectioninfo));
    }

    public static void launchGameForRecording(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, VideoConfiguration videoconfiguration)
    {
        startService(gamesclientcontext.mContext, 13, new LaunchGameForRecordingOperation(gamesclientcontext, wrappedgamescallbacks, s, videoconfiguration));
    }

    public static void launchGameForRecordingFirstParty(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks, String s, VideoConfiguration videoconfiguration)
    {
        startService(gamesclientcontext.mContext, 13, new LaunchGameForRecordingOperation(gamesclientcontext, iplaygamescallbacks, s, videoconfiguration));
    }

    public static void leaveRoom(Context context, ClientContext clientcontext, RoomLeftCallback roomleftcallback, String s, String s1, RoomLeaveDiagnostics roomleavediagnostics)
    {
        startService(context, 5, new LeaveRoomOperation(clientcontext, roomleftcallback, s, s1, roomleavediagnostics));
    }

    public static void leaveTurnBasedMatch(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, boolean flag, String s1)
    {
        startService(gamesclientcontext.mContext, 6, new LeaveTurnBasedMatchOperation(gamesclientcontext, wrappedgamescallbacks, s, flag, s1));
    }

    public static void listVideos(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext.mContext, 13, new ListVideosOperation(gamesclientcontext, wrappedgamescallbacks));
    }

    public static void listVideosFirstParty(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks)
    {
        startService(gamesclientcontext.mContext, 13, new ListVideosOperation(gamesclientcontext, iplaygamescallbacks));
    }

    public static void loadAchievements(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext, 3, new LoadAchievementsOperation(gamesclientcontext, wrappedgamescallbacks));
    }

    public static void loadAchievementsInternal(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext, 3, new LoadAchievementsInternalOperation(gamesclientcontext, wrappedgamescallbacks));
    }

    public static void loadAppContentStream(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, AppContentContext appcontentcontext)
    {
        startService(gamesclientcontext.mContext, 12, new LoadAppContentOperation(gamesclientcontext, wrappedgamescallbacks, appcontentcontext));
    }

    public static void loadCircledPlayers(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i, boolean flag)
    {
        startService(gamesclientcontext.mContext, -1, new LoadCircledPlayersOperation(gamesclientcontext, wrappedgamescallbacks, i, flag));
    }

    public static void loadCommonGames(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks, int i, boolean flag)
    {
        startService(gamesclientcontext.mContext, -1, new LoadGameCollectionComparisonOperation(gamesclientcontext, iplaygamescallbacks, 0, i, flag));
    }

    public static void loadConnectedPlayers(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i)
    {
        startService(gamesclientcontext.mContext, -1, new LoadConnectedPlayersOperation(gamesclientcontext, wrappedgamescallbacks, i));
    }

    public static void loadContactSettings(Context context, ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(context, 7, new LoadContactSettingsOperation(clientcontext, wrappedgamescallbacks, false));
    }

    public static void loadContactSettingsV2(Context context, ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks, boolean flag)
    {
        startService(context, 7, new LoadContactSettingsOperation(clientcontext, wrappedgamescallbacks, flag));
    }

    public static void loadDisjointGames(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks, int i, boolean flag)
    {
        startService(gamesclientcontext.mContext, -1, new LoadGameCollectionComparisonOperation(gamesclientcontext, iplaygamescallbacks, 1, i, flag));
    }

    public static void loadEvents(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext, 10, new LoadEventsOperation(gamesclientcontext, wrappedgamescallbacks));
    }

    public static void loadEvents(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String as[])
    {
        startService(gamesclientcontext, 10, new LoadEventsByIdOperation(gamesclientcontext, wrappedgamescallbacks, as));
    }

    public static void loadExperiments(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks)
    {
        startService(gamesclientcontext.mContext, -1, new LoadExperimentsOperation(gamesclientcontext, iplaygamescallbacks));
    }

    public static void loadFirstPartyPlayers(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, int i, boolean flag)
    {
        startService(gamesclientcontext.mContext, -1, new LoadFirstPartyPlayersOperation(gamesclientcontext, wrappedgamescallbacks, s, i, flag));
    }

    public static void loadGame$228b84a2(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext.mContext, -1, new LoadGameOperation(gamesclientcontext, wrappedgamescallbacks, false));
    }

    public static void loadGameFirstParty(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks)
    {
        startService(gamesclientcontext.mContext, -1, new LoadGameFirstPartyOperation(gamesclientcontext, iplaygamescallbacks));
    }

    public static void loadGameInstances(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext.mContext, -1, new LoadGameInstancesOperation(gamesclientcontext, wrappedgamescallbacks));
    }

    public static void loadGameSearchSuggestions(Context context, ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        startService(context, -1, new LoadGameSearchSuggestionsOperation(clientcontext, wrappedgamescallbacks, s));
    }

    public static void loadGamesCollection(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks, int i, int j, boolean flag)
    {
        startService(gamesclientcontext.mContext, -1, new LoadGamesCollectionOperation(gamesclientcontext, iplaygamescallbacks, i, j, flag));
    }

    public static void loadInvitablePlayers(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i, boolean flag)
    {
        startService(gamesclientcontext.mContext, -1, new LoadInvitablePlayersOperation(gamesclientcontext, wrappedgamescallbacks, i, flag));
    }

    public static void loadInvitation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        startService(gamesclientcontext.mContext, 4, new LoadInvitationsOperation(gamesclientcontext, wrappedgamescallbacks, 0, false, s));
    }

    public static void loadInvitations(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i, boolean flag)
    {
        startService(gamesclientcontext.mContext, 4, new LoadInvitationsOperation(gamesclientcontext, wrappedgamescallbacks, i, flag, null));
    }

    public static void loadLeaderboards(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        startService(gamesclientcontext.mContext, 2, new LoadLeaderboardsOperation(gamesclientcontext, wrappedgamescallbacks, s));
    }

    public static void loadMoreScores(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, LeaderboardScoreBufferHeader leaderboardscorebufferheader, int i, int j)
    {
        startService(gamesclientcontext.mContext, 2, new LoadMoreScoresOperation(gamesclientcontext, wrappedgamescallbacks, leaderboardscorebufferheader, i, j));
    }

    public static void loadMoreXpStream(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i)
    {
        startService(gamesclientcontext.mContext, -1, new LoadXpStreamOperation(gamesclientcontext, wrappedgamescallbacks, i, false));
    }

    public static void loadNotifyAcl(Context context, ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(context, 7, new LoadNotifyAclOperation(clientcontext, wrappedgamescallbacks));
    }

    public static void loadPlayGamesRecentlyPlayed(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks, int i, boolean flag)
    {
        startService(gamesclientcontext.mContext, -1, new LoadPlayGamesRecentlyPlayedOperation(gamesclientcontext, iplaygamescallbacks, i, flag));
    }

    public static void loadPlayer(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext.mContext, -1, new LoadPlayerOperation(gamesclientcontext, wrappedgamescallbacks));
    }

    public static void loadPlayerCenteredScores(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, int i, int j, int k)
    {
        startService(gamesclientcontext.mContext, 2, new LoadScoresOperation(gamesclientcontext, wrappedgamescallbacks, s, i, j, k, 1));
    }

    public static void loadPlayerStats(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext, -1, new LoadPlayerStatsOperation(gamesclientcontext, wrappedgamescallbacks));
    }

    public static void loadPlayers(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, int i, boolean flag)
    {
        startService(gamesclientcontext.mContext, -1, new LoadPlayersOperation(gamesclientcontext, wrappedgamescallbacks, s, i, flag));
    }

    public static void loadPlayersArray(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String as[])
    {
        startService(gamesclientcontext.mContext, -1, new LoadPlayerOperation(gamesclientcontext, wrappedgamescallbacks, as));
    }

    public static void loadPlayersInternal(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, int i, boolean flag)
    {
        startService(gamesclientcontext.mContext, -1, new LoadPlayersInternalOperation(gamesclientcontext, wrappedgamescallbacks, s, i, flag));
    }

    public static void loadProfileSettings(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext.mContext, 7, new LoadProfileSettingsOperation(gamesclientcontext, wrappedgamescallbacks));
    }

    public static void loadQuests(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int ai[], int i)
    {
        startService(gamesclientcontext, 10, new LoadQuestsOperation(gamesclientcontext, wrappedgamescallbacks, ai, i));
    }

    public static void loadQuests(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String as[])
    {
        startService(gamesclientcontext, 10, new LoadQuestsOperation(gamesclientcontext, wrappedgamescallbacks, as));
    }

    public static void loadRequestSummaries(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i)
    {
        startService(gamesclientcontext.mContext, 8, new LoadRequestSummariesOperation(gamesclientcontext, wrappedgamescallbacks, i));
    }

    public static void loadRequests(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i, int j, ArrayList arraylist)
    {
        startService(gamesclientcontext.mContext, 8, new LoadRequestsOperation(gamesclientcontext, wrappedgamescallbacks, i, j, arraylist));
    }

    public static void loadSnapshots(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, ApiClientTracker apiclienttracker)
    {
        startService(gamesclientcontext.mContext, 9, new LoadSnapshotsOperation(gamesclientcontext, wrappedgamescallbacks, apiclienttracker));
    }

    public static void loadTopScores(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, int i, int j, int k)
    {
        startService(gamesclientcontext.mContext, 2, new LoadScoresOperation(gamesclientcontext, wrappedgamescallbacks, s, i, j, k, 0));
    }

    public static void loadTurnBasedMatches(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i, int ai[])
    {
        startService(gamesclientcontext.mContext, 6, new LoadTurnBasedMatchesOperation(gamesclientcontext, wrappedgamescallbacks, i, ai));
    }

    public static void loadXpForGameCategory(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        startService(gamesclientcontext.mContext, -1, new LoadXpForGameCategoriesOperation(gamesclientcontext, wrappedgamescallbacks));
    }

    public static void loadXpStream(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i)
    {
        startService(gamesclientcontext.mContext, -1, new LoadXpStreamOperation(gamesclientcontext, wrappedgamescallbacks, i, true));
    }

    public static void notificationOpened(Context context, ClientContext clientcontext)
    {
        startService(context, -1, new NotificationOpenedOperation(clientcontext));
    }

    public static void openSnapshot(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, ApiClientTracker apiclienttracker, String s, boolean flag, int i)
    {
        startService(gamesclientcontext.mContext, 9, new OpenSnapshotOperation(gamesclientcontext, wrappedgamescallbacks, apiclienttracker, s, flag, i));
    }

    public static void recordApplicationSession(GamesClientContext gamesclientcontext, String s, long l, long l1, String s1, boolean flag)
    {
        startService(gamesclientcontext.mContext, -1, new RecordApplicationSessionOperation(gamesclientcontext, s, l, l1, s1, flag));
    }

    public static void recordPlayerSuggestionAction(GamesClientContext gamesclientcontext, int i)
    {
        startService(gamesclientcontext.mContext, -1, new RecordPlayerSuggestionActionOperation(gamesclientcontext, i));
    }

    public static void rematchTurnBasedMatch(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        startService(gamesclientcontext.mContext, 6, new RematchTurnBasedMatchOperation(gamesclientcontext, wrappedgamescallbacks, s));
    }

    public static void reportP2pStatus(Context context, ClientContext clientcontext, P2pStatusReportCallback p2pstatusreportcallback, String s, ArrayList arraylist)
    {
        startService(context, 5, new ReportP2pStatusOperation(clientcontext, p2pstatusreportcallback, s, arraylist));
    }

    public static void resolveSnapshotConflict(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, ApiClientTracker apiclienttracker, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, DriveContents drivecontents)
    {
        startService(gamesclientcontext.mContext, 9, new ResolveSnapshotConflictOperation(gamesclientcontext, wrappedgamescallbacks, apiclienttracker, s, s1, snapshotmetadatachange, drivecontents));
    }

    public static void revealAchievement(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
    {
        startService(gamesclientcontext, 3, new UpdateAchievementOperation(gamesclientcontext, wrappedgamescallbacks, 2, s, popuplocationinfo));
    }

    public static void searchForGames(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks, String s, int i, boolean flag)
    {
        startService(gamesclientcontext.mContext, -1, new SearchForGamesOperation(gamesclientcontext, iplaygamescallbacks, s, i, flag));
    }

    public static void searchForPlayers(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, int i, boolean flag)
    {
        startService(gamesclientcontext.mContext, -1, new SearchForPlayersOperation(gamesclientcontext, wrappedgamescallbacks, s, i, flag));
    }

    public static void sendRequest(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i, int j, byte abyte0[], String as[])
    {
        startService(gamesclientcontext.mContext, 8, new SendRequestOperation(gamesclientcontext, wrappedgamescallbacks, i, j, abyte0, as));
    }

    public static void setAchievementSteps(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, int i, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
    {
        startService(gamesclientcontext, 3, new SetAchievementStepsOperation(gamesclientcontext, wrappedgamescallbacks, s, i, popuplocationinfo));
    }

    public static void setGameMuteStatus(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, boolean flag)
    {
        startService(gamesclientcontext.mContext, 7, new SetGameMuteStatusOperation(gamesclientcontext, wrappedgamescallbacks, flag));
    }

    public static void setIdentitySharingConfirmed(GamesClientContext gamesclientcontext)
    {
        startService(gamesclientcontext.mContext, -1, new SetIdentitySharingConfirmedOperation(gamesclientcontext));
    }

    public static void showQuestStateChangedPopup(GamesClientContext gamesclientcontext, String s, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, int i)
    {
        startService(gamesclientcontext, 10, new QuestStateChangedPopupOperation(gamesclientcontext, s, popuplocationinfo, i));
    }

    public static void signOut(Context context, ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks, boolean flag)
    {
        startService(context, 1, new SignOutOperation(clientcontext, wrappedgamescallbacks, flag));
    }

    private static void startService(Context context, int i, Operation operation)
    {
        AndroidUtils.assertMainGmsProcess();
        sOperations.offer(new OperationAdapter(operation, i));
        context.startService(AndroidUtils.createGmsCoreIntent("com.google.android.gms.games.service.ASYNC"));
    }

    private static void startService(GamesClientContext gamesclientcontext, int i, Operation operation)
    {
        startService(gamesclientcontext.mContext, i, operation);
    }

    public static void stopVideoRecording(Context context, String s)
    {
        startService(context, 13, new StopRecordingOperation(s));
    }

    public static void submitScore(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, long l, String s1)
    {
        startService(gamesclientcontext.mContext, 2, new SubmitScoreOperation(gamesclientcontext, wrappedgamescallbacks, s, l, System.currentTimeMillis(), s1));
    }

    public static void unlockAchievement(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
    {
        startService(gamesclientcontext, 3, new UpdateAchievementOperation(gamesclientcontext, wrappedgamescallbacks, 1, s, popuplocationinfo));
    }

    public static void updateContactSettings(Context context, ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks, boolean flag, Bundle bundle)
    {
        startService(context, 7, new UpdateContactSettingsOperation(clientcontext, wrappedgamescallbacks, flag, bundle));
    }

    public static void updateNotifyAcl(Context context, ClientContext clientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s)
    {
        startService(context, 7, new UpdateNotifyAclOperation(clientcontext, wrappedgamescallbacks, s));
    }

    public static void updatePlayed(Context context, ClientContext clientcontext)
    {
        startService(context, -1, new UpdatePlayedOperation(clientcontext));
    }

    public static void updateProfileSettings(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, boolean flag)
    {
        startService(gamesclientcontext.mContext, 7, new UpdateProfileSettingsOperation(gamesclientcontext, wrappedgamescallbacks, flag));
    }

    public static void updateTurnBasedMatch(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, String s1, byte abyte0[], ParticipantResult aparticipantresult[])
    {
        startService(gamesclientcontext.mContext, 6, new UpdateTurnBasedMatchOperation(gamesclientcontext, wrappedgamescallbacks, s, s1, abyte0, aparticipantresult));
    }

    public static void validatePlayService(Context context, IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
    {
        startService(context, 1, new ValidatePlayServiceConnectionOperation(igmscallbacks, getservicerequest));
    }

    public static void validateServiceConnection(Context context, IGmsCallbacks igmscallbacks, int i, String s, int j, Account account, String s1, String as[], 
            boolean flag, boolean flag1, int k, boolean flag2, int l, String s2, ArrayList arraylist, 
            Bundle bundle)
    {
        startService(context, 1, new ValidateServiceConnectionOperation(igmscallbacks, i, s, j, account, s1, as, flag, flag1, k, flag2, l, s2, arraylist, bundle));
    }

    public static void verifySnapshotFolder(GamesClientContext gamesclientcontext, ApiClientTracker apiclienttracker)
    {
        startService(gamesclientcontext.mContext, 9, new VerifySnapshotFolderOperation(gamesclientcontext, apiclienttracker));
    }

    protected final void handleRuntimeException(RuntimeException runtimeexception)
    {
        throw runtimeexception;
    }

}
