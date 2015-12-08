// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.OnNearbyPlayerDetectedListener;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.internal.constants.RequestType;
import com.google.android.gms.games.internal.events.EventIncrementCache;
import com.google.android.gms.games.internal.events.EventIncrementManager;
import com.google.android.gms.games.internal.experience.ExperienceEventBuffer;
import com.google.android.gms.games.internal.game.ExtendedGameBuffer;
import com.google.android.gms.games.internal.game.GameInstanceBuffer;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;
import com.google.android.gms.games.internal.request.RequestUpdateOutcomes;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.ParticipantUtils;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestEntity;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jl;
import com.google.android.gms.internal.jt;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.ll;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupManager, IGamesService, RealTimeSocketImpl, GamesLog, 
//            LibjingleNativeSocket, AbstractGamesCallbacks

public final class GamesClientImpl extends jl
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{
    private static abstract class AbstractPeerStatusNotifier extends AbstractRoomStatusNotifier
    {

        private final ArrayList Yv = new ArrayList();

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            a(roomstatusupdatelistener, room, Yv);
        }

        protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist);

        AbstractPeerStatusNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder);
            int i1 = 0;
            for (int j1 = as.length; i1 < j1; i1++)
            {
                Yv.add(as[i1]);
            }

        }
    }

    private static abstract class AbstractRoomNotifier extends com.google.android.gms.common.api.a
    {

        protected void a(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            a(roomupdatelistener, GamesClientImpl.S(dataholder), dataholder.getStatusCode());
        }

        protected abstract void a(RoomUpdateListener roomupdatelistener, Room room, int i1);

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((RoomUpdateListener)obj, dataholder);
        }

        AbstractRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static abstract class AbstractRoomStatusNotifier extends com.google.android.gms.common.api.a
    {

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            a(roomstatusupdatelistener, GamesClientImpl.S(dataholder));
        }

        protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((RoomStatusUpdateListener)obj, dataholder);
        }

        AbstractRoomStatusNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class AcceptQuestResultImpl extends b
        implements com.google.android.gms.games.quest.Quests.AcceptQuestResult
    {

        private final Quest Yw = null;

        public Quest getQuest()
        {
            return Yw;
        }

        AcceptQuestResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new QuestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            Yw = new QuestEntity((Quest)dataholder.get(0));
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

    private static final class AchievementUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void g(int i1, String s1)
        {
            Ea.b(new UpdateAchievementResultImpl(i1, s1));
        }

        AchievementUpdatedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class AchievementsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void c(DataHolder dataholder)
        {
            Ea.b(new LoadAchievementsResultImpl(dataholder));
        }

        AchievementsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class AppContentLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Yx;

        public void a(DataHolder adataholder[])
        {
            Yx.b(new LoadAppContentsResultImpl(adataholder));
        }

        public AppContentLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Yx = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class CancelMatchResultImpl
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult
    {

        private final Status Eb;
        private final String Yy;

        public String getMatchId()
        {
            return Yy;
        }

        public Status getStatus()
        {
            return Eb;
        }

        CancelMatchResultImpl(Status status, String s1)
        {
            Eb = status;
            Yy = s1;
        }
    }

    private static final class ClaimMilestoneResultImpl extends b
        implements com.google.android.gms.games.quest.Quests.ClaimMilestoneResult
    {

        private final Quest Yw;
        private final Milestone Yz = null;

        public Milestone getMilestone()
        {
            return Yz;
        }

        public Quest getQuest()
        {
            return Yw;
        }

        ClaimMilestoneResultImpl(DataHolder dataholder, String s1)
        {
            int i1;
            i1 = 0;
            super(dataholder);
            dataholder = new QuestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            List list;
            int j1;
            Yw = new QuestEntity((Quest)dataholder.get(0));
            list = Yw.mQ();
            j1 = list.size();
_L4:
            if (i1 >= j1)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!((Milestone)list.get(i1)).getMilestoneId().equals(s1))
            {
                break MISSING_BLOCK_LABEL_111;
            }
            Yz = (Milestone)list.get(i1);
            dataholder.release();
            return;
            i1++;
            if (true) goto _L4; else goto _L3
_L3:
_L6:
            dataholder.release();
            return;
_L2:
            Yz = null;
            Yw = null;
            if (true) goto _L6; else goto _L5
_L5:
            s1;
            dataholder.release();
            throw s1;
        }
    }

    private static final class CommitSnapshotResultImpl extends b
        implements com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult
    {

        private final SnapshotMetadata YA = null;

        public SnapshotMetadata getSnapshotMetadata()
        {
            return YA;
        }

        CommitSnapshotResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new SnapshotMetadataBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            YA = new SnapshotMetadataEntity(dataholder.get(0));
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

    private static final class ConnectedToRoomNotifier extends AbstractRoomStatusNotifier
    {

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onConnectedToRoom(room);
        }

        ConnectedToRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class ContactSettingLoadResultImpl extends b
        implements com.google.android.gms.games.Notifications.ContactSettingLoadResult
    {

        ContactSettingLoadResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class ContactSettingsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void D(DataHolder dataholder)
        {
            Ea.b(new ContactSettingLoadResultImpl(dataholder));
        }

        ContactSettingsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class ContactSettingsUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void dP(int i1)
        {
            Ea.b(new Status(i1));
        }

        ContactSettingsUpdatedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class DeleteSnapshotResultImpl
        implements com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult
    {

        private final Status Eb;
        private final String YB;

        public String getSnapshotId()
        {
            return YB;
        }

        public Status getStatus()
        {
            return Eb;
        }

        DeleteSnapshotResultImpl(int i1, String s1)
        {
            Eb = new Status(i1);
            YB = s1;
        }
    }

    private static final class DisconnectedFromRoomNotifier extends AbstractRoomStatusNotifier
    {

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onDisconnectedFromRoom(room);
        }

        DisconnectedFromRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class EventsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void d(DataHolder dataholder)
        {
            Ea.b(new LoadEventResultImpl(dataholder));
        }

        EventsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class ExtendedGamesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void j(DataHolder dataholder)
        {
            Ea.b(new LoadExtendedGamesResultImpl(dataholder));
        }

        ExtendedGamesLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private class GameClientEventIncrementCache extends EventIncrementCache
    {

        final GamesClientImpl Yu;

        protected void r(String s1, int i1)
        {
            if (Yu.isConnected())
            {
                ((IGamesService)Yu.hw()).o(s1, i1);
                return;
            }
            try
            {
                GamesLog.p("GamesClientImpl", (new StringBuilder()).append("Unable to increment event ").append(s1).append(" by ").append(i1).append(" because the games client is no longer connected").toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                GamesLog.o("GamesClientImpl", "service died");
            }
            return;
        }

        public GameClientEventIncrementCache()
        {
            Yu = GamesClientImpl.this;
            super(getContext().getMainLooper(), 1000);
        }
    }

    private static final class GameInstancesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void k(DataHolder dataholder)
        {
            Ea.b(new LoadGameInstancesResultImpl(dataholder));
        }

        GameInstancesLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class GameMuteStatusChangeResultImpl
        implements com.google.android.gms.games.Notifications.GameMuteStatusChangeResult
    {

        private final Status Eb;
        private final String YC;
        private final boolean YD;

        public Status getStatus()
        {
            return Eb;
        }

        public GameMuteStatusChangeResultImpl(int i1, String s1, boolean flag)
        {
            Eb = new Status(i1);
            YC = s1;
            YD = flag;
        }
    }

    private static final class GameMuteStatusChangedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(int i1, String s1, boolean flag)
        {
            Ea.b(new GameMuteStatusChangeResultImpl(i1, s1, flag));
        }

        GameMuteStatusChangedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class GameMuteStatusLoadResultImpl
        implements com.google.android.gms.games.Notifications.GameMuteStatusLoadResult
    {

        private final Status Eb;
        private final String YC;
        private final boolean YD;

        public Status getStatus()
        {
            return Eb;
        }

        public GameMuteStatusLoadResultImpl(DataHolder dataholder)
        {
            Eb = new Status(dataholder.getStatusCode());
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            YC = dataholder.c("external_game_id", 0, 0);
            YD = dataholder.d("muted", 0, 0);
_L4:
            dataholder.close();
            return;
_L2:
            YC = null;
            YD = false;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private static final class GameMuteStatusLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void B(DataHolder dataholder)
        {
            Ea.b(new GameMuteStatusLoadResultImpl(dataholder));
        }

        GameMuteStatusLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class GameSearchSuggestionsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void l(DataHolder dataholder)
        {
            Ea.b(new LoadGameSearchSuggestionsResultImpl(dataholder));
        }

        GameSearchSuggestionsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class GamesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void i(DataHolder dataholder)
        {
            Ea.b(new LoadGamesResultImpl(dataholder));
        }

        GamesLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class InboxCountResultImpl
        implements com.google.android.gms.games.Notifications.InboxCountResult
    {

        private final Status Eb;
        private final Bundle YE;

        public Status getStatus()
        {
            return Eb;
        }

        InboxCountResultImpl(Status status, Bundle bundle)
        {
            Eb = status;
            YE = bundle;
        }
    }

    private static final class InboxCountsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void f(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            Ea.b(new InboxCountResultImpl(status, bundle));
        }

        InboxCountsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
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

        private final d Qe;

        public void n(DataHolder dataholder)
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
                Qe.a(new InvitationReceivedNotifier(dataholder));
            }
            return;
            dataholder;
            invitationbuffer.release();
            throw dataholder;
        }

        public void onInvitationRemoved(String s1)
        {
            Qe.a(new InvitationRemovedNotifier(s1));
        }

        InvitationReceivedBinderCallback(d d1)
        {
            Qe = d1;
        }
    }

    private static final class InvitationReceivedNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final Invitation YF;

        public void a(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationReceived(YF);
        }

        public void c(Object obj)
        {
            a((OnInvitationReceivedListener)obj);
        }

        public void gG()
        {
        }

        InvitationReceivedNotifier(Invitation invitation)
        {
            YF = invitation;
        }
    }

    private static final class InvitationRemovedNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final String YG;

        public void a(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationRemoved(YG);
        }

        public void c(Object obj)
        {
            a((OnInvitationReceivedListener)obj);
        }

        public void gG()
        {
        }

        InvitationRemovedNotifier(String s1)
        {
            YG = s1;
        }
    }

    private static final class InvitationsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void m(DataHolder dataholder)
        {
            Ea.b(new LoadInvitationsResultImpl(dataholder));
        }

        InvitationsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class JoinedRoomNotifier extends AbstractRoomNotifier
    {

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onJoinedRoom(i1, room);
        }

        public JoinedRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LeaderboardMetadataResultImpl extends b
        implements com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult
    {

        private final LeaderboardBuffer YH;

        public LeaderboardBuffer getLeaderboards()
        {
            return YH;
        }

        LeaderboardMetadataResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            YH = new LeaderboardBuffer(dataholder);
        }
    }

    private static final class LeaderboardScoresLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(DataHolder dataholder, DataHolder dataholder1)
        {
            Ea.b(new LoadScoresResultImpl(dataholder, dataholder1));
        }

        LeaderboardScoresLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class LeaderboardsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void e(DataHolder dataholder)
        {
            Ea.b(new LeaderboardMetadataResultImpl(dataholder));
        }

        LeaderboardsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class LeaveMatchResultImpl extends TurnBasedMatchResult
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult
    {

        LeaveMatchResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LeftRoomNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final int Iv;
        private final String YI;

        public void a(RoomUpdateListener roomupdatelistener)
        {
            roomupdatelistener.onLeftRoom(Iv, YI);
        }

        public void c(Object obj)
        {
            a((RoomUpdateListener)obj);
        }

        public void gG()
        {
        }

        LeftRoomNotifier(int i1, String s1)
        {
            Iv = i1;
            YI = s1;
        }
    }

    private static final class LoadAchievementsResultImpl extends b
        implements com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult
    {

        private final AchievementBuffer YJ;

        public AchievementBuffer getAchievements()
        {
            return YJ;
        }

        LoadAchievementsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            YJ = new AchievementBuffer(dataholder);
        }
    }

    private static final class LoadAclResultImpl extends b
        implements com.google.android.gms.games.internal.game.Acls.LoadAclResult
    {

        LoadAclResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadAppContentsResultImpl extends b
        implements com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult
    {

        private final ArrayList YK;

        LoadAppContentsResultImpl(DataHolder adataholder[])
        {
            super(adataholder[0]);
            YK = new ArrayList(Arrays.asList(adataholder));
        }
    }

    private static final class LoadEventResultImpl extends b
        implements com.google.android.gms.games.event.Events.LoadEventsResult
    {

        private final EventBuffer YL;

        public EventBuffer getEvents()
        {
            return YL;
        }

        LoadEventResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            YL = new EventBuffer(dataholder);
        }
    }

    private static final class LoadExtendedGamesResultImpl extends b
        implements com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult
    {

        private final ExtendedGameBuffer YM;

        LoadExtendedGamesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            YM = new ExtendedGameBuffer(dataholder);
        }
    }

    private static final class LoadGameInstancesResultImpl extends b
        implements com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult
    {

        private final GameInstanceBuffer YN;

        LoadGameInstancesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            YN = new GameInstanceBuffer(dataholder);
        }
    }

    private static final class LoadGameSearchSuggestionsResultImpl extends b
        implements com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult
    {

        private final GameSearchSuggestionBuffer YO;

        LoadGameSearchSuggestionsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            YO = new GameSearchSuggestionBuffer(dataholder);
        }
    }

    private static final class LoadGamesResultImpl extends b
        implements com.google.android.gms.games.GamesMetadata.LoadGamesResult
    {

        private final GameBuffer YP;

        public GameBuffer getGames()
        {
            return YP;
        }

        LoadGamesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            YP = new GameBuffer(dataholder);
        }
    }

    private static final class LoadInvitationsResultImpl extends b
        implements com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult
    {

        private final InvitationBuffer YQ;

        public InvitationBuffer getInvitations()
        {
            return YQ;
        }

        LoadInvitationsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            YQ = new InvitationBuffer(dataholder);
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

        private final Status Eb;
        private final LoadMatchesResponse YR;

        public LoadMatchesResponse getMatches()
        {
            return YR;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public void release()
        {
            YR.release();
        }

        LoadMatchesResultImpl(Status status, Bundle bundle)
        {
            Eb = status;
            YR = new LoadMatchesResponse(bundle);
        }
    }

    private static final class LoadOwnerCoverPhotoUrisResultImpl
        implements com.google.android.gms.games.Players.LoadOwnerCoverPhotoUrisResult
    {

        private final Bundle DJ;
        private final Status Eb;

        public Status getStatus()
        {
            return Eb;
        }

        LoadOwnerCoverPhotoUrisResultImpl(int i1, Bundle bundle)
        {
            Eb = new Status(i1);
            DJ = bundle;
        }
    }

    private static final class LoadPlayerScoreResultImpl extends b
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult
    {

        private final LeaderboardScoreEntity YS = null;

        public LeaderboardScore getScore()
        {
            return YS;
        }

        LoadPlayerScoreResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new LeaderboardScoreBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            YS = (LeaderboardScoreEntity)dataholder.get(0).freeze();
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

    private static final class LoadPlayersResultImpl extends b
        implements com.google.android.gms.games.Players.LoadPlayersResult
    {

        private final PlayerBuffer YT;

        public PlayerBuffer getPlayers()
        {
            return YT;
        }

        LoadPlayersResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            YT = new PlayerBuffer(dataholder);
        }
    }

    private static final class LoadProfileSettingsResultImpl extends b
        implements com.google.android.gms.games.Players.LoadProfileSettingsResult
    {

        private final boolean YU;
        private final boolean Yh;

        public Status getStatus()
        {
            return Eb;
        }

        public boolean isProfileVisible()
        {
            return Yh;
        }

        public boolean isVisibilityExplicitlySet()
        {
            return YU;
        }

        LoadProfileSettingsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            int i1 = dataholder.au(0);
            Yh = dataholder.d("profile_visible", 0, i1);
            YU = dataholder.d("profile_visibility_explicitly_set", 0, i1);
_L4:
            dataholder.close();
            return;
_L2:
            Yh = true;
            YU = false;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private static final class LoadQuestsResultImpl extends b
        implements com.google.android.gms.games.quest.Quests.LoadQuestsResult
    {

        private final DataHolder JG;

        public QuestBuffer getQuests()
        {
            return new QuestBuffer(JG);
        }

        LoadQuestsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            JG = dataholder;
        }
    }

    private static final class LoadRequestSummariesResultImpl extends b
        implements com.google.android.gms.games.request.Requests.LoadRequestSummariesResult
    {

        LoadRequestSummariesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadRequestsResultImpl
        implements com.google.android.gms.games.request.Requests.LoadRequestsResult
    {

        private final Status Eb;
        private final Bundle YV;

        public GameRequestBuffer getRequests(int i1)
        {
            String s1 = RequestType.dZ(i1);
            if (!YV.containsKey(s1))
            {
                return null;
            } else
            {
                return new GameRequestBuffer((DataHolder)YV.get(s1));
            }
        }

        public Status getStatus()
        {
            return Eb;
        }

        public void release()
        {
            Iterator iterator = YV.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                obj = (DataHolder)YV.getParcelable(((String) (obj)));
                if (obj != null)
                {
                    ((DataHolder) (obj)).close();
                }
            } while (true);
        }

        LoadRequestsResultImpl(Status status, Bundle bundle)
        {
            Eb = status;
            YV = bundle;
        }
    }

    private static final class LoadScoresResultImpl extends b
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    {

        private final LeaderboardEntity YW = null;
        private final LeaderboardScoreBuffer YX;

        public Leaderboard getLeaderboard()
        {
            return YW;
        }

        public LeaderboardScoreBuffer getScores()
        {
            return YX;
        }

        LoadScoresResultImpl(DataHolder dataholder, DataHolder dataholder1)
        {
            super(dataholder1);
            dataholder = new LeaderboardBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            YW = (LeaderboardEntity)((Leaderboard)dataholder.get(0)).freeze();
_L4:
            dataholder.release();
            YX = new LeaderboardScoreBuffer(dataholder1);
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            dataholder1;
            dataholder.release();
            throw dataholder1;
        }
    }

    private static final class LoadSnapshotsResultImpl extends b
        implements com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult
    {

        public SnapshotMetadataBuffer getSnapshots()
        {
            return new SnapshotMetadataBuffer(JG);
        }

        LoadSnapshotsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadXpForGameCategoriesResultImpl
        implements com.google.android.gms.games.Players.LoadXpForGameCategoriesResult
    {

        private final Status Eb;
        private final List YY;
        private final Bundle YZ;

        public Status getStatus()
        {
            return Eb;
        }

        LoadXpForGameCategoriesResultImpl(Status status, Bundle bundle)
        {
            Eb = status;
            YY = bundle.getStringArrayList("game_category_list");
            YZ = bundle;
        }
    }

    private static final class LoadXpStreamResultImpl extends b
        implements com.google.android.gms.games.Players.LoadXpStreamResult
    {

        private final ExperienceEventBuffer Za;

        LoadXpStreamResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            Za = new ExperienceEventBuffer(dataholder);
        }
    }

    private static final class MatchRemovedNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final String Zb;

        public void a(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchRemoved(Zb);
        }

        public void c(Object obj)
        {
            a((OnTurnBasedMatchUpdateReceivedListener)obj);
        }

        public void gG()
        {
        }

        MatchRemovedNotifier(String s1)
        {
            Zb = s1;
        }
    }

    private static final class MatchUpdateReceivedBinderCallback extends AbstractGamesCallbacks
    {

        private final d Qe;

        public void onTurnBasedMatchRemoved(String s1)
        {
            Qe.a(new MatchRemovedNotifier(s1));
        }

        public void t(DataHolder dataholder)
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
                Qe.a(new MatchUpdateReceivedNotifier(dataholder));
            }
            return;
            dataholder;
            turnbasedmatchbuffer.release();
            throw dataholder;
        }

        MatchUpdateReceivedBinderCallback(d d1)
        {
            Qe = d1;
        }
    }

    private static final class MatchUpdateReceivedNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final TurnBasedMatch Zc;

        public void a(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchReceived(Zc);
        }

        public void c(Object obj)
        {
            a((OnTurnBasedMatchUpdateReceivedListener)obj);
        }

        public void gG()
        {
        }

        MatchUpdateReceivedNotifier(TurnBasedMatch turnbasedmatch)
        {
            Zc = turnbasedmatch;
        }
    }

    private static final class MessageReceivedNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final RealTimeMessage Zd;

        public void a(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            realtimemessagereceivedlistener.onRealTimeMessageReceived(Zd);
        }

        public void c(Object obj)
        {
            a((RealTimeMessageReceivedListener)obj);
        }

        public void gG()
        {
        }

        MessageReceivedNotifier(RealTimeMessage realtimemessage)
        {
            Zd = realtimemessage;
        }
    }

    private static final class NearbyPlayerDetectedNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final Player Ze;

        public void a(OnNearbyPlayerDetectedListener onnearbyplayerdetectedlistener)
        {
            onnearbyplayerdetectedlistener.a(Ze);
        }

        public void c(Object obj)
        {
            a((OnNearbyPlayerDetectedListener)obj);
        }

        public void gG()
        {
        }
    }

    private static final class NotifyAclLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void C(DataHolder dataholder)
        {
            Ea.b(new LoadAclResultImpl(dataholder));
        }

        NotifyAclLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class NotifyAclUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void dO(int i1)
        {
            Ea.b(new Status(i1));
        }

        NotifyAclUpdatedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class OpenSnapshotResultImpl extends b
        implements com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    {

        private final Snapshot Zf;
        private final String Zg;
        private final Snapshot Zh;
        private final Contents Zi;
        private final SnapshotContents Zj;

        public String getConflictId()
        {
            return Zg;
        }

        public Snapshot getConflictingSnapshot()
        {
            return Zh;
        }

        public SnapshotContents getResolutionSnapshotContents()
        {
            return Zj;
        }

        public Snapshot getSnapshot()
        {
            return Zf;
        }

        OpenSnapshotResultImpl(DataHolder dataholder, Contents contents)
        {
            this(dataholder, null, contents, null, null);
        }

        OpenSnapshotResultImpl(DataHolder dataholder, String s1, Contents contents, Contents contents1, Contents contents2)
        {
            SnapshotMetadataBuffer snapshotmetadatabuffer;
            boolean flag;
            flag = true;
            super(dataholder);
            snapshotmetadatabuffer = new SnapshotMetadataBuffer(dataholder);
            if (snapshotmetadatabuffer.getCount() != 0) goto _L2; else goto _L1
_L1:
            Zf = null;
            Zh = null;
_L3:
            snapshotmetadatabuffer.release();
            Zg = s1;
            Zi = contents2;
            Zj = new SnapshotContentsEntity(contents2);
            return;
_L2:
            if (snapshotmetadatabuffer.getCount() != 1)
            {
                break MISSING_BLOCK_LABEL_144;
            }
            if (dataholder.getStatusCode() == 4004)
            {
                flag = false;
            }
            je.K(flag);
            Zf = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContentsEntity(contents));
            Zh = null;
              goto _L3
            dataholder;
            snapshotmetadatabuffer.release();
            throw dataholder;
            Zf = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContentsEntity(contents));
            Zh = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(1)), new SnapshotContentsEntity(contents1));
              goto _L3
        }
    }

    private static final class OwnerCoverPhotoUrisLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void d(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Ea.b(new LoadOwnerCoverPhotoUrisResultImpl(i1, bundle));
        }

        OwnerCoverPhotoUrisLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class P2PConnectedNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final String Zk;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            roomstatusupdatelistener.onP2PConnected(Zk);
        }

        public void c(Object obj)
        {
            a((RoomStatusUpdateListener)obj);
        }

        public void gG()
        {
        }

        P2PConnectedNotifier(String s1)
        {
            Zk = s1;
        }
    }

    private static final class P2PDisconnectedNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final String Zk;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            roomstatusupdatelistener.onP2PDisconnected(Zk);
        }

        public void c(Object obj)
        {
            a((RoomStatusUpdateListener)obj);
        }

        public void gG()
        {
        }

        P2PDisconnectedNotifier(String s1)
        {
            Zk = s1;
        }
    }

    private static final class PeerConnectedNotifier extends AbstractPeerStatusNotifier
    {

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersConnected(room, arraylist);
        }

        PeerConnectedNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerDeclinedNotifier extends AbstractPeerStatusNotifier
    {

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerDeclined(room, arraylist);
        }

        PeerDeclinedNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerDisconnectedNotifier extends AbstractPeerStatusNotifier
    {

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersDisconnected(room, arraylist);
        }

        PeerDisconnectedNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerInvitedToRoomNotifier extends AbstractPeerStatusNotifier
    {

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerInvitedToRoom(room, arraylist);
        }

        PeerInvitedToRoomNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerJoinedRoomNotifier extends AbstractPeerStatusNotifier
    {

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerJoined(room, arraylist);
        }

        PeerJoinedRoomNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerLeftRoomNotifier extends AbstractPeerStatusNotifier
    {

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerLeft(room, arraylist);
        }

        PeerLeftRoomNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PlayerLeaderboardScoreLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void E(DataHolder dataholder)
        {
            Ea.b(new LoadPlayerScoreResultImpl(dataholder));
        }

        PlayerLeaderboardScoreLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class PlayerXpForGameCategoriesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void e(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            Ea.b(new LoadXpForGameCategoriesResultImpl(status, bundle));
        }

        PlayerXpForGameCategoriesLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    static final class PlayerXpStreamLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void P(DataHolder dataholder)
        {
            Ea.b(new LoadXpStreamResultImpl(dataholder));
        }

        PlayerXpStreamLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class PlayersLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void g(DataHolder dataholder)
        {
            Ea.b(new LoadPlayersResultImpl(dataholder));
        }

        public void h(DataHolder dataholder)
        {
            Ea.b(new LoadPlayersResultImpl(dataholder));
        }

        PlayersLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    static final class ProfileSettingsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void Q(DataHolder dataholder)
        {
            Ea.b(new LoadProfileSettingsResultImpl(dataholder));
        }

        ProfileSettingsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class ProfileSettingsUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void dQ(int i1)
        {
            Ea.b(new Status(i1));
        }

        ProfileSettingsUpdatedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class QuestAcceptedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Zl;

        public void L(DataHolder dataholder)
        {
            Zl.b(new AcceptQuestResultImpl(dataholder));
        }

        public QuestAcceptedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Zl = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class QuestCompletedNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final Quest Yw;

        public void a(QuestUpdateListener questupdatelistener)
        {
            questupdatelistener.onQuestCompleted(Yw);
        }

        public void c(Object obj)
        {
            a((QuestUpdateListener)obj);
        }

        public void gG()
        {
        }

        QuestCompletedNotifier(Quest quest)
        {
            Yw = quest;
        }
    }

    private static final class QuestMilestoneClaimBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Zm;
        private final String Zn;

        public void K(DataHolder dataholder)
        {
            Zm.b(new ClaimMilestoneResultImpl(dataholder, Zn));
        }

        public QuestMilestoneClaimBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
        {
            Zm = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
            Zn = (String)jx.b(s1, "MilestoneId must not be null");
        }
    }

    private static final class QuestUpdateBinderCallback extends AbstractGamesCallbacks
    {

        private final d Qe;

        private Quest T(DataHolder dataholder)
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

        public void M(DataHolder dataholder)
        {
            dataholder = T(dataholder);
            if (dataholder != null)
            {
                Qe.a(new QuestCompletedNotifier(dataholder));
            }
        }

        QuestUpdateBinderCallback(d d1)
        {
            Qe = d1;
        }
    }

    private static final class QuestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Zo;

        public void O(DataHolder dataholder)
        {
            Zo.b(new LoadQuestsResultImpl(dataholder));
        }

        public QuestsLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Zo = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class RealTimeMessageSentNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final int Iv;
        private final String Zp;
        private final int Zq;

        public void a(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback)
        {
            if (reliablemessagesentcallback != null)
            {
                reliablemessagesentcallback.onRealTimeMessageSent(Iv, Zq, Zp);
            }
        }

        public void c(Object obj)
        {
            a((com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback)obj);
        }

        public void gG()
        {
        }

        RealTimeMessageSentNotifier(int i1, int j1, String s1)
        {
            Iv = i1;
            Zq = j1;
            Zp = s1;
        }
    }

    private static final class RealTimeReliableMessageBinderCallbacks extends AbstractGamesCallbacks
    {

        final d Zr;

        public void b(int i1, int j1, String s1)
        {
            if (Zr != null)
            {
                Zr.a(new RealTimeMessageSentNotifier(i1, j1, s1));
            }
        }

        public RealTimeReliableMessageBinderCallbacks(d d1)
        {
            Zr = d1;
        }
    }

    private static final class RequestReceivedBinderCallback extends AbstractGamesCallbacks
    {

        private final d Qe;

        public void o(DataHolder dataholder)
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
                Qe.a(new RequestReceivedNotifier(dataholder));
            }
            return;
            dataholder;
            gamerequestbuffer.release();
            throw dataholder;
        }

        public void onRequestRemoved(String s1)
        {
            Qe.a(new RequestRemovedNotifier(s1));
        }

        RequestReceivedBinderCallback(d d1)
        {
            Qe = d1;
        }
    }

    private static final class RequestReceivedNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final GameRequest Zs;

        public void a(OnRequestReceivedListener onrequestreceivedlistener)
        {
            onrequestreceivedlistener.onRequestReceived(Zs);
        }

        public void c(Object obj)
        {
            a((OnRequestReceivedListener)obj);
        }

        public void gG()
        {
        }

        RequestReceivedNotifier(GameRequest gamerequest)
        {
            Zs = gamerequest;
        }
    }

    private static final class RequestRemovedNotifier
        implements com.google.android.gms.common.api.d.b
    {

        private final String Zt;

        public void a(OnRequestReceivedListener onrequestreceivedlistener)
        {
            onrequestreceivedlistener.onRequestRemoved(Zt);
        }

        public void c(Object obj)
        {
            a((OnRequestReceivedListener)obj);
        }

        public void gG()
        {
        }

        RequestRemovedNotifier(String s1)
        {
            Zt = s1;
        }
    }

    private static final class RequestSentBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Zu;

        public void G(DataHolder dataholder)
        {
            Zu.b(new SendRequestResultImpl(dataholder));
        }

        public RequestSentBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Zu = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class RequestSummariesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Zv;

        public void H(DataHolder dataholder)
        {
            Zv.b(new LoadRequestSummariesResultImpl(dataholder));
        }

        public RequestSummariesLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Zv = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class RequestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Zw;

        public void c(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            Zw.b(new LoadRequestsResultImpl(status, bundle));
        }

        public RequestsLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Zw = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class RequestsUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Zx;

        public void F(DataHolder dataholder)
        {
            Zx.b(new UpdateRequestsResultImpl(dataholder));
        }

        public RequestsUpdatedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Zx = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class RoomAutoMatchingNotifier extends AbstractRoomStatusNotifier
    {

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
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

        private final d ZA;
        private final d Zy;
        private final d Zz;

        public void A(DataHolder dataholder)
        {
            if (Zz != null)
            {
                Zz.a(new DisconnectedFromRoomNotifier(dataholder));
            }
        }

        public void a(DataHolder dataholder, String as[])
        {
            if (Zz != null)
            {
                Zz.a(new PeerInvitedToRoomNotifier(dataholder, as));
            }
        }

        public void b(DataHolder dataholder, String as[])
        {
            if (Zz != null)
            {
                Zz.a(new PeerJoinedRoomNotifier(dataholder, as));
            }
        }

        public void c(DataHolder dataholder, String as[])
        {
            if (Zz != null)
            {
                Zz.a(new PeerLeftRoomNotifier(dataholder, as));
            }
        }

        public void d(DataHolder dataholder, String as[])
        {
            if (Zz != null)
            {
                Zz.a(new PeerDeclinedNotifier(dataholder, as));
            }
        }

        public void e(DataHolder dataholder, String as[])
        {
            if (Zz != null)
            {
                Zz.a(new PeerConnectedNotifier(dataholder, as));
            }
        }

        public void f(DataHolder dataholder, String as[])
        {
            if (Zz != null)
            {
                Zz.a(new PeerDisconnectedNotifier(dataholder, as));
            }
        }

        public void onLeftRoom(int i1, String s1)
        {
            Zy.a(new LeftRoomNotifier(i1, s1));
        }

        public void onP2PConnected(String s1)
        {
            if (Zz != null)
            {
                Zz.a(new P2PConnectedNotifier(s1));
            }
        }

        public void onP2PDisconnected(String s1)
        {
            if (Zz != null)
            {
                Zz.a(new P2PDisconnectedNotifier(s1));
            }
        }

        public void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
        {
            if (ZA != null)
            {
                ZA.a(new MessageReceivedNotifier(realtimemessage));
            }
        }

        public void u(DataHolder dataholder)
        {
            Zy.a(new RoomCreatedNotifier(dataholder));
        }

        public void v(DataHolder dataholder)
        {
            Zy.a(new JoinedRoomNotifier(dataholder));
        }

        public void w(DataHolder dataholder)
        {
            if (Zz != null)
            {
                Zz.a(new RoomConnectingNotifier(dataholder));
            }
        }

        public void x(DataHolder dataholder)
        {
            if (Zz != null)
            {
                Zz.a(new RoomAutoMatchingNotifier(dataholder));
            }
        }

        public void y(DataHolder dataholder)
        {
            Zy.a(new RoomConnectedNotifier(dataholder));
        }

        public void z(DataHolder dataholder)
        {
            if (Zz != null)
            {
                Zz.a(new ConnectedToRoomNotifier(dataholder));
            }
        }

        public RoomBinderCallbacks(d d1)
        {
            Zy = (d)jx.b(d1, "Callbacks must not be null");
            Zz = null;
            ZA = null;
        }

        public RoomBinderCallbacks(d d1, d d2, d d3)
        {
            Zy = (d)jx.b(d1, "Callbacks must not be null");
            Zz = d2;
            ZA = d3;
        }
    }

    private static final class RoomConnectedNotifier extends AbstractRoomNotifier
    {

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onRoomConnected(i1, room);
        }

        RoomConnectedNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class RoomConnectingNotifier extends AbstractRoomStatusNotifier
    {

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
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

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onRoomCreated(i1, room);
        }

        public RoomCreatedNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class SendRequestResultImpl extends b
        implements com.google.android.gms.games.request.Requests.SendRequestResult
    {

        private final GameRequest Zs = null;

        SendRequestResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new GameRequestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            Zs = (GameRequest)((GameRequest)dataholder.get(0)).freeze();
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

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void fK()
        {
            Status status = new Status(0);
            Ea.b(status);
        }

        public SignOutCompleteBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class SnapshotCommittedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b ZB;

        public void J(DataHolder dataholder)
        {
            ZB.b(new CommitSnapshotResultImpl(dataholder));
        }

        public SnapshotCommittedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            ZB = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    static final class SnapshotDeletedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void i(int i1, String s1)
        {
            Ea.b(new DeleteSnapshotResultImpl(i1, s1));
        }

        public SnapshotDeletedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class SnapshotOpenedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b ZC;

        public void a(DataHolder dataholder, Contents contents)
        {
            ZC.b(new OpenSnapshotResultImpl(dataholder, contents));
        }

        public void a(DataHolder dataholder, String s1, Contents contents, Contents contents1, Contents contents2)
        {
            ZC.b(new OpenSnapshotResultImpl(dataholder, s1, contents, contents1, contents2));
        }

        public SnapshotOpenedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            ZC = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class SnapshotsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b ZD;

        public void I(DataHolder dataholder)
        {
            ZD.b(new LoadSnapshotsResultImpl(dataholder));
        }

        public SnapshotsLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            ZD = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class SubmitScoreBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void f(DataHolder dataholder)
        {
            Ea.b(new SubmitScoreResultImpl(dataholder));
        }

        public SubmitScoreBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class SubmitScoreResultImpl extends b
        implements com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult
    {

        private final ScoreSubmissionData ZE;

        public ScoreSubmissionData getScoreData()
        {
            return ZE;
        }

        public SubmitScoreResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            ZE = new ScoreSubmissionData(dataholder);
            dataholder.close();
            return;
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private static final class TurnBasedMatchCanceledBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b ZF;

        public void h(int i1, String s1)
        {
            Status status = new Status(i1);
            ZF.b(new CancelMatchResultImpl(status, s1));
        }

        public TurnBasedMatchCanceledBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            ZF = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchInitiatedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b ZG;

        public void q(DataHolder dataholder)
        {
            ZG.b(new InitiateMatchResultImpl(dataholder));
        }

        public TurnBasedMatchInitiatedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            ZG = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchLeftBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b ZH;

        public void s(DataHolder dataholder)
        {
            ZH.b(new LeaveMatchResultImpl(dataholder));
        }

        public TurnBasedMatchLeftBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            ZH = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b ZI;

        public void p(DataHolder dataholder)
        {
            ZI.b(new LoadMatchResultImpl(dataholder));
        }

        public TurnBasedMatchLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            ZI = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static abstract class TurnBasedMatchResult extends b
    {

        final TurnBasedMatch Zc = null;

        public TurnBasedMatch getMatch()
        {
            return Zc;
        }

        TurnBasedMatchResult(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new TurnBasedMatchBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            Zc = (TurnBasedMatch)((TurnBasedMatch)dataholder.get(0)).freeze();
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

    private static final class TurnBasedMatchUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b ZJ;

        public void r(DataHolder dataholder)
        {
            ZJ.b(new UpdateMatchResultImpl(dataholder));
        }

        public TurnBasedMatchUpdatedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            ZJ = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b ZK;

        public void b(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            ZK.b(new LoadMatchesResultImpl(status, bundle));
        }

        public TurnBasedMatchesLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            ZK = (com.google.android.gms.common.api.BaseImplementation.b)jx.b(b1, "Holder must not be null");
        }
    }

    private static final class UpdateAchievementResultImpl
        implements com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult
    {

        private final Status Eb;
        private final String Xx;

        public String getAchievementId()
        {
            return Xx;
        }

        public Status getStatus()
        {
            return Eb;
        }

        UpdateAchievementResultImpl(int i1, String s1)
        {
            Eb = new Status(i1);
            Xx = s1;
        }
    }

    private static final class UpdateMatchResultImpl extends TurnBasedMatchResult
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult
    {

        UpdateMatchResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class UpdateRequestsResultImpl extends b
        implements com.google.android.gms.games.request.Requests.UpdateRequestsResult
    {

        private final RequestUpdateOutcomes ZL;

        public Set getRequestIds()
        {
            return ZL.getRequestIds();
        }

        public int getRequestOutcome(String s1)
        {
            return ZL.getRequestOutcome(s1);
        }

        UpdateRequestsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            ZL = RequestUpdateOutcomes.W(dataholder);
        }
    }


    private final String DZ;
    EventIncrementManager Yk;
    private final String Yl;
    private final Map Ym = new HashMap();
    private PlayerEntity Yn;
    private GameEntity Yo;
    private final PopupManager Yp;
    private boolean Yq;
    private final Binder Yr = new Binder();
    private final long Ys = (long)hashCode();
    private final com.google.android.gms.games.Games.GamesOptions Yt;

    public GamesClientImpl(Context context, Looper looper, String s1, String s2, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[], 
            int i1, View view, com.google.android.gms.games.Games.GamesOptions gamesoptions)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        Yk = new EventIncrementManager() {

            final GamesClientImpl Yu;

            public EventIncrementCache lF()
            {
                return Yu. new GameClientEventIncrementCache();
            }

            
            {
                Yu = GamesClientImpl.this;
                super();
            }
        };
        Yq = false;
        Yl = s1;
        DZ = (String)jx.i(s2);
        Yp = com.google.android.gms.games.internal.PopupManager.a(this, i1);
        k(view);
        Yt = gamesoptions;
        registerConnectionCallbacks(this);
        registerConnectionFailedListener(this);
    }

    private static Room R(DataHolder dataholder)
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

    static Room S(DataHolder dataholder)
    {
        return R(dataholder);
    }

    private RealTimeSocket bB(String s1)
    {
        RealTimeSocket realtimesocket;
        if (com.google.android.gms.internal.ll.ii())
        {
            realtimesocket = bD(s1);
        } else
        {
            realtimesocket = bC(s1);
        }
        if (realtimesocket != null)
        {
            Ym.put(s1, realtimesocket);
        }
        return realtimesocket;
    }

    private RealTimeSocket bC(String s1)
    {
        String s2 = ((IGamesService)hw()).bH(s1);
        if (s2 == null)
        {
            return null;
        }
        LocalSocket localsocket = new LocalSocket();
        localsocket.connect(new LocalSocketAddress(s2));
        s1 = new RealTimeSocketImpl(localsocket, s1);
        return s1;
        s1;
        GamesLog.p("GamesClientImpl", "Unable to create socket. Service died.");
_L2:
        return null;
        s1;
        GamesLog.p("GamesClientImpl", (new StringBuilder()).append("connect() call failed on socket: ").append(s1.getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    private RealTimeSocket bD(String s1)
    {
        android.os.ParcelFileDescriptor parcelfiledescriptor;
        try
        {
            parcelfiledescriptor = ((IGamesService)hw()).bN(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            GamesLog.p("GamesClientImpl", "Unable to create socket. Service died.");
            return null;
        }
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        GamesLog.n("GamesClientImpl", "Created native libjingle socket.");
        return new LibjingleNativeSocket(parcelfiledescriptor);
        GamesLog.p("GamesClientImpl", (new StringBuilder()).append("Unable to create socket for ").append(s1).toString());
        return null;
    }

    private void lD()
    {
        for (Iterator iterator = Ym.values().iterator(); iterator.hasNext();)
        {
            RealTimeSocket realtimesocket = (RealTimeSocket)iterator.next();
            try
            {
                realtimesocket.close();
            }
            catch (IOException ioexception)
            {
                GamesLog.c("GamesClientImpl", "IOException:", ioexception);
            }
        }

        Ym.clear();
    }

    private void lg()
    {
        Yn = null;
    }

    public int a(d d1, byte abyte0[], String s1, String s2)
    {
        int i1;
        try
        {
            i1 = ((IGamesService)hw()).a(new RealTimeReliableMessageBinderCallbacks(d1), abyte0, s1, s2);
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public int a(byte abyte0[], String s1, String as[])
    {
        jx.b(as, "Participant IDs must not be null");
        int i1;
        try
        {
            i1 = ((IGamesService)hw()).b(abyte0, s1, as);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.o("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public Intent a(int i1, int j1, boolean flag)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)hw()).a(i1, j1, flag);
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent a(int i1, byte abyte0[], int j1, Bitmap bitmap, String s1)
    {
        try
        {
            abyte0 = ((IGamesService)hw()).a(i1, abyte0, j1, s1);
            jx.b(bitmap, "Must provide a non null icon");
            abyte0.putExtra("com.google.android.gms.games.REQUEST_ITEM_ICON", bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return abyte0;
    }

    public Intent a(Room room, int i1)
    {
        try
        {
            room = ((IGamesService)hw()).a((RoomEntity)room.freeze(), i1);
        }
        // Misplaced declaration of an exception variable
        catch (Room room)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return room;
    }

    public Intent a(String s1, boolean flag, boolean flag1, int i1)
    {
        try
        {
            s1 = ((IGamesService)hw()).a(s1, flag, flag1, i1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return s1;
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle)
    {
        if (i1 == 0 && bundle != null)
        {
            Yq = bundle.getBoolean("show_welcome_popup");
        }
        super.a(i1, ibinder, bundle);
    }

    public void a(IBinder ibinder, Bundle bundle)
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        ((IGamesService)hw()).a(ibinder, bundle);
        return;
        ibinder;
        GamesLog.o("GamesClientImpl", "service died");
        return;
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, int j1, int k1)
    {
        try
        {
            ((IGamesService)hw()).a(new RequestsLoadedBinderCallbacks(b1), i1, j1, k1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, int j1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)hw()).a(new ExtendedGamesLoadedBinderCallback(b1), i1, j1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, String s1, String as[], boolean flag)
    {
        try
        {
            ((IGamesService)hw()).a(new AppContentLoadedBinderCallbacks(b1), i1, s1, as, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)hw()).a(new PlayersLoadedBinderCallback(b1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, int ai[])
    {
        try
        {
            ((IGamesService)hw()).a(new TurnBasedMatchesLoadedBinderCallbacks(b1), i1, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, LeaderboardScoreBuffer leaderboardscorebuffer, int i1, int j1)
    {
        try
        {
            ((IGamesService)hw()).a(new LeaderboardScoresLoadedBinderCallback(b1), leaderboardscorebuffer.mH().mI(), i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, TurnBasedMatchConfig turnbasedmatchconfig)
    {
        try
        {
            ((IGamesService)hw()).a(new TurnBasedMatchInitiatedBinderCallbacks(b1), turnbasedmatchconfig.getVariant(), turnbasedmatchconfig.mO(), turnbasedmatchconfig.getInvitedPlayerIds(), turnbasedmatchconfig.getAutoMatchCriteria());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, Snapshot snapshot, SnapshotMetadataChange snapshotmetadatachange)
    {
        SnapshotContents snapshotcontents = snapshot.getSnapshotContents();
        Object obj;
        boolean flag;
        if (!snapshotcontents.isClosed())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Snapshot already closed");
        obj = snapshotmetadatachange.mT();
        if (obj != null)
        {
            ((a) (obj)).a(getContext().getCacheDir());
        }
        obj = snapshotcontents.ir();
        snapshotcontents.close();
        try
        {
            ((IGamesService)hw()).a(new SnapshotCommittedBinderCallbacks(b1), snapshot.getMetadata().getSnapshotId(), (SnapshotMetadataChangeEntity)snapshotmetadatachange, ((Contents) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        b1 = null;
_L1:
        try
        {
            ((IGamesService)hw()).a(b1, s1, Yp.lV(), Yp.lU());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_57;
        b1 = new AchievementUpdatedBinderCallback(b1);
          goto _L1
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1)
    {
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        b1 = null;
_L1:
        try
        {
            ((IGamesService)hw()).a(b1, s1, i1, Yp.lV(), Yp.lU());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_58;
        b1 = new AchievementUpdatedBinderCallback(b1);
          goto _L1
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).a(new LeaderboardScoresLoadedBinderCallback(b1), s1, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1, boolean flag, boolean flag1)
    {
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR tableswitch 156408498 156408498: default 24
    //                   156408498 72;
           goto _L1 _L2
_L1:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid player collection: ").append(s1).toString());

        case 0: // '\0'
            break;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (s1.equals("played_with"))
        {
            byte0 = 0;
        }
        if (true) goto _L1; else goto _L3
_L3:
        try
        {
            ((IGamesService)hw()).d(new PlayersLoadedBinderCallback(b1), s1, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
        return;
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        try
        {
            ((IGamesService)hw()).a(new ExtendedGamesLoadedBinderCallback(b1), s1, i1, flag, flag1, flag2, flag3);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1, int ai[])
    {
        try
        {
            ((IGamesService)hw()).a(new TurnBasedMatchesLoadedBinderCallbacks(b1), s1, i1, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, long l1, String s2)
    {
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        b1 = null;
_L1:
        try
        {
            ((IGamesService)hw()).a(b1, s1, l1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_46;
        b1 = new SubmitScoreBinderCallbacks(b1);
          goto _L1
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2)
    {
        try
        {
            ((IGamesService)hw()).c(new TurnBasedMatchLeftBinderCallbacks(b1), s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, int i1, int j1)
    {
        try
        {
            ((IGamesService)hw()).a(new PlayerLeaderboardScoreLoadedBinderCallback(b1), s1, s2, i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, int i1, int j1, int k1)
    {
        try
        {
            ((IGamesService)hw()).a(new RequestsLoadedBinderCallbacks(b1), s1, s2, i1, j1, k1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).a(new LeaderboardScoresLoadedBinderCallback(b1), s1, s2, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, int i1, boolean flag, boolean flag1)
    {
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   -1049482625: 128
    //                   156408498: 112
    //                   782949780: 96;
           goto _L1 _L2 _L3 _L4
_L1:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid player collection: ").append(s1).toString());

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (s1.equals("circled"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (s1.equals("played_with"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s1.equals("nearby"))
        {
            byte0 = 2;
        }
        if (true) goto _L1; else goto _L5
_L5:
        try
        {
            ((IGamesService)hw()).a(new PlayersLoadedBinderCallback(b1), s1, s2, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
        return;
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, SnapshotMetadataChange snapshotmetadatachange, SnapshotContents snapshotcontents)
    {
        Object obj;
        boolean flag;
        if (!snapshotcontents.isClosed())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "SnapshotContents already closed");
        obj = snapshotmetadatachange.mT();
        if (obj != null)
        {
            ((a) (obj)).a(getContext().getCacheDir());
        }
        obj = snapshotcontents.ir();
        snapshotcontents.close();
        try
        {
            ((IGamesService)hw()).a(new SnapshotOpenedBinderCallbacks(b1), s1, s2, (SnapshotMetadataChangeEntity)snapshotmetadatachange, ((Contents) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).b(new LeaderboardsLoadedBinderCallback(b1), s1, s2, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, boolean flag, String as[])
    {
        try
        {
            Yk.flush();
            ((IGamesService)hw()).a(new QuestsLoadedBinderCallbacks(b1), s1, s2, as, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, int ai[], int i1, boolean flag)
    {
        try
        {
            Yk.flush();
            ((IGamesService)hw()).a(new QuestsLoadedBinderCallbacks(b1), s1, s2, ai, i1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, String as[])
    {
        try
        {
            ((IGamesService)hw()).a(new RequestsUpdatedBinderCallbacks(b1), s1, s2, as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).f(new PlayersLoadedBinderCallback(b1), s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, byte abyte0[], String s2, ParticipantResult aparticipantresult[])
    {
        try
        {
            ((IGamesService)hw()).a(new TurnBasedMatchUpdatedBinderCallbacks(b1), s1, abyte0, s2, aparticipantresult);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, byte abyte0[], ParticipantResult aparticipantresult[])
    {
        try
        {
            ((IGamesService)hw()).a(new TurnBasedMatchUpdatedBinderCallbacks(b1), s1, abyte0, aparticipantresult);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String as[], int i1, byte abyte0[], int j1)
    {
        try
        {
            ((IGamesService)hw()).a(new RequestSentBinderCallbacks(b1), s1, as, i1, abyte0, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).c(new PlayersLoadedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag, Bundle bundle)
    {
        try
        {
            ((IGamesService)hw()).a(new ContactSettingsUpdatedBinderCallback(b1), flag, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public transient void a(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag, String as[])
    {
        try
        {
            Yk.flush();
            ((IGamesService)hw()).a(new EventsLoadedBinderCallback(b1), flag, as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int ai[], int i1, boolean flag)
    {
        try
        {
            Yk.flush();
            ((IGamesService)hw()).a(new QuestsLoadedBinderCallbacks(b1), ai, i1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String as[])
    {
        try
        {
            ((IGamesService)hw()).c(new PlayersLoadedBinderCallback(b1), as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(d d1)
    {
        try
        {
            d1 = new InvitationReceivedBinderCallback(d1);
            ((IGamesService)hw()).a(d1, Ys);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(d d1, d d2, d d3, RoomConfig roomconfig)
    {
        lD();
        try
        {
            d1 = new RoomBinderCallbacks(d1, d2, d3);
            ((IGamesService)hw()).a(d1, Yr, roomconfig.getVariant(), roomconfig.getInvitedPlayerIds(), roomconfig.getAutoMatchCriteria(), roomconfig.isSocketEnabled(), Ys);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(d d1, String s1)
    {
        try
        {
            ((IGamesService)hw()).c(new RoomBinderCallbacks(d1), s1);
            lD();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void a(Snapshot snapshot)
    {
        snapshot = snapshot.getSnapshotContents();
        Contents contents;
        boolean flag;
        if (!snapshot.isClosed())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Snapshot already closed");
        contents = snapshot.ir();
        snapshot.close();
        try
        {
            ((IGamesService)hw()).a(contents);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Snapshot snapshot)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    protected void a(jt jt1, com.google.android.gms.internal.jl.e e1)
        throws RemoteException
    {
        String s1 = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", Yt.Xa);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", Yt.Xb);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", Yt.Xc);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", Yt.Xd);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", Yt.Xe);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", Yt.Xf);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", Yt.Xg);
        jt1.a(e1, 0x648278, getContext().getPackageName(), DZ, hv(), Yl, Yp.lV(), s1, bundle);
    }

    protected IGamesService aC(IBinder ibinder)
    {
        return IGamesService.Stub.aE(ibinder);
    }

    public Intent b(int i1, int j1, boolean flag)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)hw()).b(i1, j1, flag);
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent b(int ai[])
    {
        try
        {
            ai = ((IGamesService)hw()).b(ai);
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return ai;
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            Yk.flush();
            ((IGamesService)hw()).a(new SignOutCompleteBinderCallbacks(b1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)hw()).b(new PlayersLoadedBinderCallback(b1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        b1 = null;
_L1:
        try
        {
            ((IGamesService)hw()).b(b1, s1, Yp.lV(), Yp.lU());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_57;
        b1 = new AchievementUpdatedBinderCallback(b1);
          goto _L1
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1)
    {
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        b1 = null;
_L1:
        try
        {
            ((IGamesService)hw()).b(b1, s1, i1, Yp.lV(), Yp.lU());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_58;
        b1 = new AchievementUpdatedBinderCallback(b1);
          goto _L1
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).b(new LeaderboardScoresLoadedBinderCallback(b1), s1, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)hw()).a(new ExtendedGamesLoadedBinderCallback(b1), s1, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2)
    {
        try
        {
            Yk.flush();
            ((IGamesService)hw()).f(new QuestMilestoneClaimBinderCallbacks(b1, s2), s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).b(new LeaderboardScoresLoadedBinderCallback(b1), s1, s2, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)hw()).b(new PlayersLoadedBinderCallback(b1), s1, s2, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).a(new AchievementsLoadedBinderCallback(b1), s1, s2, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).c(new LeaderboardsLoadedBinderCallback(b1), s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).b(new LeaderboardsLoadedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag, String as[])
    {
        try
        {
            Yk.flush();
            ((IGamesService)hw()).a(new QuestsLoadedBinderCallbacks(b1), as, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String as[])
    {
        try
        {
            ((IGamesService)hw()).a(new RequestsUpdatedBinderCallbacks(b1), as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(d d1)
    {
        try
        {
            d1 = new MatchUpdateReceivedBinderCallback(d1);
            ((IGamesService)hw()).b(d1, Ys);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void b(d d1, d d2, d d3, RoomConfig roomconfig)
    {
        lD();
        try
        {
            d1 = new RoomBinderCallbacks(d1, d2, d3);
            ((IGamesService)hw()).a(d1, Yr, roomconfig.getInvitationId(), roomconfig.isSocketEnabled(), Ys);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void bA(String s1)
    {
        try
        {
            ((IGamesService)hw()).bL(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public Intent bE(String s1)
    {
        try
        {
            s1 = ((IGamesService)hw()).bE(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return s1;
    }

    public void bF(String s1)
    {
        try
        {
            ((IGamesService)hw()).a(s1, Yp.lV(), Yp.lU());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    protected String bK()
    {
        return "com.google.android.gms.games.service.START";
    }

    protected String bL()
    {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, int i1)
    {
        try
        {
            ((IGamesService)hw()).a(new InvitationsLoadedBinderCallback(b1), i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)hw()).c(new PlayersLoadedBinderCallback(b1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).l(new TurnBasedMatchInitiatedBinderCallbacks(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1)
    {
        try
        {
            ((IGamesService)hw()).b(new PlayerXpStreamLoadedBinderCallback(b1), s1, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)hw()).e(new ExtendedGamesLoadedBinderCallback(b1), s1, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2)
    {
        try
        {
            ((IGamesService)hw()).d(new TurnBasedMatchInitiatedBinderCallbacks(b1), s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).c(new SnapshotsLoadedBinderCallbacks(b1), s1, s2, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).e(new SnapshotOpenedBinderCallbacks(b1), s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).a(new AchievementsLoadedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String as[])
    {
        try
        {
            ((IGamesService)hw()).b(new RequestsUpdatedBinderCallbacks(b1), as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void c(d d1)
    {
        try
        {
            d1 = new QuestUpdateBinderCallback(d1);
            ((IGamesService)hw()).d(d1, Ys);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    protected transient void c(String as[])
    {
        int i1 = 0;
        boolean flag = false;
        boolean flag1 = false;
        while (i1 < as.length) 
        {
            String s1 = as[i1];
            boolean flag2;
            if (s1.equals("https://www.googleapis.com/auth/games"))
            {
                flag2 = true;
            } else
            {
                flag2 = flag1;
                if (s1.equals("https://www.googleapis.com/auth/games.firstparty"))
                {
                    flag = true;
                    flag2 = flag1;
                }
            }
            i1++;
            flag1 = flag2;
        }
        if (flag)
        {
            if (!flag1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            jx.a(flag1, "Cannot have both %s and %s!", new Object[] {
                "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"
            });
            return;
        } else
        {
            jx.a(flag1, "Games APIs requires %s to function.", new Object[] {
                "https://www.googleapis.com/auth/games"
            });
            return;
        }
    }

    public void connect()
    {
        lg();
        super.connect();
    }

    public int d(byte abyte0[], String s1)
    {
        int i1;
        try
        {
            i1 = ((IGamesService)hw()).b(abyte0, s1, null);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.o("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)hw()).e(new PlayersLoadedBinderCallback(b1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).m(new TurnBasedMatchInitiatedBinderCallbacks(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1)
    {
        try
        {
            ((IGamesService)hw()).c(new PlayerXpStreamLoadedBinderCallback(b1), s1, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)hw()).f(new ExtendedGamesLoadedBinderCallback(b1), s1, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, String s2)
    {
        try
        {
            ((IGamesService)hw()).e(new TurnBasedMatchInitiatedBinderCallbacks(b1), s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).d(new LeaderboardsLoadedBinderCallback(b1), s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            Yk.flush();
            ((IGamesService)hw()).f(new EventsLoadedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void d(d d1)
    {
        try
        {
            d1 = new RequestReceivedBinderCallback(d1);
            ((IGamesService)hw()).c(d1, Ys);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void dS(int i1)
    {
        Yp.setGravity(i1);
    }

    public void dT(int i1)
    {
        try
        {
            ((IGamesService)hw()).dT(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void disconnect()
    {
        Yq = false;
        if (isConnected())
        {
            try
            {
                IGamesService igamesservice = (IGamesService)hw();
                igamesservice.lE();
                Yk.flush();
                igamesservice.q(Ys);
            }
            catch (RemoteException remoteexception)
            {
                GamesLog.o("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        lD();
        super.disconnect();
    }

    public void e(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).o(new TurnBasedMatchLeftBinderCallbacks(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1)
    {
        try
        {
            ((IGamesService)hw()).b(new InvitationsLoadedBinderCallback(b1), s1, i1, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)hw()).c(new ExtendedGamesLoadedBinderCallback(b1), s1, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).a(new GameMuteStatusChangedBinderCallback(b1), s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).d(new SnapshotsLoadedBinderCallbacks(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            ((IGamesService)hw()).d(new GamesLoadedBinderCallback(b1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).n(new TurnBasedMatchCanceledBinderCallbacks(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1)
    {
        try
        {
            ((IGamesService)hw()).a(new RequestSummariesLoadedBinderCallbacks(b1), s1, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.BaseImplementation.b b1, String s1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)hw()).b(new PlayersLoadedBinderCallback(b1), s1, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).g(new ProfileSettingsLoadedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public Bundle fX()
    {
        Bundle bundle;
        try
        {
            bundle = ((IGamesService)hw()).fX();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        bundle.setClassLoader(com/google/android/gms/games/internal/GamesClientImpl.getClassLoader());
        return bundle;
    }

    public void g(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            ((IGamesService)hw()).j(new OwnerCoverPhotoUrisLoadedBinderCallback(b1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void g(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).p(new TurnBasedMatchLoadedBinderCallbacks(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void g(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).h(new ProfileSettingsUpdatedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void h(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            ((IGamesService)hw()).h(new NotifyAclLoadedBinderCallback(b1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void h(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            Yk.flush();
            ((IGamesService)hw()).u(new QuestAcceptedBinderCallbacks(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void h(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)hw()).e(new ContactSettingsLoadedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void i(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            ((IGamesService)hw()).t(new InboxCountsLoadedBinderCallback(b1), null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void i(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).r(new SnapshotDeletedBinderCallbacks(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void j(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).e(new ExtendedGamesLoadedBinderCallback(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void k(View view)
    {
        Yp.l(view);
    }

    public void k(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).f(new GameInstancesLoadedBinderCallback(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    protected IInterface l(IBinder ibinder)
    {
        return aC(ibinder);
    }

    public void l(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).q(new GameSearchSuggestionsLoadedBinderCallback(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public int lA()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)hw()).lA();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public int lB()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)hw()).lB();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public int lC()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)hw()).lC();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public void lE()
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_19;
        }
        ((IGamesService)hw()).lE();
        return;
        RemoteException remoteexception;
        remoteexception;
        GamesLog.o("GamesClientImpl", "service died");
        return;
    }

    public String lh()
    {
        String s1;
        try
        {
            s1 = ((IGamesService)hw()).lh();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return s1;
    }

    public String li()
    {
        String s1;
        try
        {
            s1 = ((IGamesService)hw()).li();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return s1;
    }

    public Player lj()
    {
        dS();
        this;
        JVM INSTR monitorenter ;
        Object obj = Yn;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new PlayerBuffer(((IGamesService)hw()).lG());
        if (((PlayerBuffer) (obj)).getCount() > 0)
        {
            Yn = (PlayerEntity)((PlayerBuffer) (obj)).get(0).freeze();
        }
        ((PlayerBuffer) (obj)).release();
_L1:
        this;
        JVM INSTR monitorexit ;
        return Yn;
        Exception exception1;
        exception1;
        Exception exception;
        try
        {
            ((PlayerBuffer) (obj)).release();
            throw exception1;
        }
        catch (RemoteException remoteexception) { }
        finally { }
        GamesLog.o("GamesClientImpl", "service died");
          goto _L1
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Game lk()
    {
        dS();
        this;
        JVM INSTR monitorenter ;
        Object obj = Yo;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new GameBuffer(((IGamesService)hw()).lI());
        if (((GameBuffer) (obj)).getCount() > 0)
        {
            Yo = (GameEntity)((GameBuffer) (obj)).get(0).freeze();
        }
        ((GameBuffer) (obj)).release();
_L1:
        this;
        JVM INSTR monitorexit ;
        return Yo;
        Exception exception1;
        exception1;
        Exception exception;
        try
        {
            ((GameBuffer) (obj)).release();
            throw exception1;
        }
        catch (RemoteException remoteexception) { }
        finally { }
        GamesLog.o("GamesClientImpl", "service died");
          goto _L1
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Intent ll()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)hw()).ll();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent lm()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)hw()).lm();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent ln()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)hw()).ln();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent lo()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)hw()).lo();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public void lp()
    {
        try
        {
            ((IGamesService)hw()).r(Ys);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void lq()
    {
        try
        {
            ((IGamesService)hw()).s(Ys);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void lr()
    {
        try
        {
            ((IGamesService)hw()).u(Ys);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void ls()
    {
        try
        {
            ((IGamesService)hw()).t(Ys);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public Intent lt()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)hw()).lt();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent lu()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)hw()).lu();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public int lv()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)hw()).lv();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return 4368;
        }
        return i1;
    }

    public String lw()
    {
        String s1;
        try
        {
            s1 = ((IGamesService)hw()).lw();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return s1;
    }

    public int lx()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)hw()).lx();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public Intent ly()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)hw()).ly();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public int lz()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)hw()).lz();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public void m(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).s(new PlayerXpForGameCategoriesLoadedBinderCallback(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public Intent n(String s1, int i1)
    {
        try
        {
            s1 = ((IGamesService)hw()).u(s1, i1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            GamesLog.o("GamesClientImpl", "service died");
            return null;
        }
        return s1;
    }

    public void n(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).k(new InvitationsLoadedBinderCallback(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void o(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).j(new NotifyAclUpdatedBinderCallback(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void o(String s1, int i1)
    {
        Yk.o(s1, i1);
    }

    public void onConnected(Bundle bundle)
    {
        if (Yq)
        {
            Yp.lT();
            Yq = false;
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Yq = false;
    }

    public void onConnectionSuspended(int i1)
    {
    }

    public void p(com.google.android.gms.common.api.BaseImplementation.b b1, String s1)
    {
        try
        {
            ((IGamesService)hw()).i(new GameMuteStatusLoadedBinderCallback(b1), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void p(String s1, int i1)
    {
        try
        {
            ((IGamesService)hw()).p(s1, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public void q(String s1, int i1)
    {
        try
        {
            ((IGamesService)hw()).q(s1, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            GamesLog.o("GamesClientImpl", "service died");
        }
    }

    public RealTimeSocket s(String s1, String s2)
    {
label0:
        {
            if (s2 == null || !ParticipantUtils.bY(s2))
            {
                throw new IllegalArgumentException("Bad participant ID");
            }
            RealTimeSocket realtimesocket = (RealTimeSocket)Ym.get(s2);
            if (realtimesocket != null)
            {
                s1 = realtimesocket;
                if (!realtimesocket.isClosed())
                {
                    break label0;
                }
            }
            s1 = bB(s2);
        }
        return s1;
    }
}
