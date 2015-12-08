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
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.o;
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
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.internal.kc;
import java.io.IOException;
import java.util.ArrayList;
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

public final class GamesClientImpl extends e
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{
    private abstract class AbstractPeerStatusCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl WC;
        private final ArrayList WD = new ArrayList();

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            a(roomstatusupdatelistener, room, WD);
        }

        protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist);

        AbstractPeerStatusCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            WC = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
            int i1 = 0;
            for (int j1 = as.length; i1 < j1; i1++)
            {
                WD.add(as[i1]);
            }

        }
    }

    private abstract class AbstractRoomCallback extends com.google.android.gms.common.internal.e.d
    {

        final GamesClientImpl WC;

        protected void a(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            a(roomupdatelistener, com.google.android.gms.games.internal.GamesClientImpl.a(WC, dataholder), dataholder.getStatusCode());
        }

        protected abstract void a(RoomUpdateListener roomupdatelistener, Room room, int i1);

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((RoomUpdateListener)obj, dataholder);
        }

        AbstractRoomCallback(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, roomupdatelistener, dataholder);
        }
    }

    private abstract class AbstractRoomStatusCallback extends com.google.android.gms.common.internal.e.d
    {

        final GamesClientImpl WC;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            a(roomstatusupdatelistener, com.google.android.gms.games.internal.GamesClientImpl.a(WC, dataholder));
        }

        protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((RoomStatusUpdateListener)obj, dataholder);
        }

        AbstractRoomStatusCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, roomstatusupdatelistener, dataholder);
        }
    }

    private static final class AcceptQuestResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.quest.Quests.AcceptQuestResult
    {

        private final Quest WE = null;

        public Quest getQuest()
        {
            return WE;
        }

        AcceptQuestResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new QuestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            WE = new QuestEntity((Quest)dataholder.get(0));
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

    private final class AchievementUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void g(int i1, String s)
        {
            De.b(new UpdateAchievementResultImpl(i1, s));
        }

        AchievementUpdatedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class AchievementsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void c(DataHolder dataholder)
        {
            De.b(new LoadAchievementsResultImpl(dataholder));
        }

        AchievementsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private static final class CancelMatchResultImpl
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult
    {

        private final Status CM;
        private final String WF;

        public String getMatchId()
        {
            return WF;
        }

        public Status getStatus()
        {
            return CM;
        }

        CancelMatchResultImpl(Status status, String s)
        {
            CM = status;
            WF = s;
        }
    }

    private static final class ClaimMilestoneResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.quest.Quests.ClaimMilestoneResult
    {

        private final Quest WE;
        private final Milestone WG = null;

        public Milestone getMilestone()
        {
            return WG;
        }

        public Quest getQuest()
        {
            return WE;
        }

        ClaimMilestoneResultImpl(DataHolder dataholder, String s)
        {
            int i1;
            i1 = 0;
            super(dataholder);
            dataholder = new QuestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            List list;
            int j1;
            WE = new QuestEntity((Quest)dataholder.get(0));
            list = WE.lJ();
            j1 = list.size();
_L4:
            if (i1 >= j1)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!((Milestone)list.get(i1)).getMilestoneId().equals(s))
            {
                break MISSING_BLOCK_LABEL_111;
            }
            WG = (Milestone)list.get(i1);
            dataholder.release();
            return;
            i1++;
            if (true) goto _L4; else goto _L3
_L3:
_L6:
            dataholder.release();
            return;
_L2:
            WG = null;
            WE = null;
            if (true) goto _L6; else goto _L5
_L5:
            s;
            dataholder.release();
            throw s;
        }
    }

    private static final class CommitSnapshotResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult
    {

        private final SnapshotMetadata WH = null;

        public SnapshotMetadata getSnapshotMetadata()
        {
            return WH;
        }

        CommitSnapshotResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new SnapshotMetadataBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            WH = new SnapshotMetadataEntity(dataholder.get(0));
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

    private final class ConnectedToRoomCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl WC;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onConnectedToRoom(room);
        }

        ConnectedToRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            WC = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
        }
    }

    private static final class ContactSettingLoadResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.Notifications.ContactSettingLoadResult
    {

        ContactSettingLoadResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private final class ContactSettingsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void D(DataHolder dataholder)
        {
            De.b(new ContactSettingLoadResultImpl(dataholder));
        }

        ContactSettingsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class ContactSettingsUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void dy(int i1)
        {
            De.b(new Status(i1));
        }

        ContactSettingsUpdatedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private static final class DeleteSnapshotResultImpl
        implements com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult
    {

        private final Status CM;
        private final String WI;

        public String getSnapshotId()
        {
            return WI;
        }

        public Status getStatus()
        {
            return CM;
        }

        DeleteSnapshotResultImpl(int i1, String s)
        {
            CM = new Status(i1);
            WI = s;
        }
    }

    private final class DisconnectedFromRoomCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl WC;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onDisconnectedFromRoom(room);
        }

        DisconnectedFromRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            WC = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
        }
    }

    private final class EventsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void d(DataHolder dataholder)
        {
            De.b(new LoadEventResultImpl(dataholder));
        }

        EventsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class ExtendedGamesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void j(DataHolder dataholder)
        {
            De.b(new LoadExtendedGamesResultImpl(dataholder));
        }

        ExtendedGamesLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private class GameClientEventIncrementCache extends EventIncrementCache
    {

        final GamesClientImpl WC;

        protected void q(String s, int i1)
        {
            if (WC.isConnected())
            {
                ((IGamesService)WC.gS()).n(s, i1);
                return;
            }
            try
            {
                GamesLog.q("GamesClientImpl", (new StringBuilder()).append("Unable to increment event ").append(s).append(" by ").append(i1).append(" because the games client is no longer connected").toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                GamesLog.p("GamesClientImpl", "service died");
            }
            return;
        }

        public GameClientEventIncrementCache()
        {
            WC = GamesClientImpl.this;
            super(getContext().getMainLooper(), 1000);
        }
    }

    private final class GameInstancesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void k(DataHolder dataholder)
        {
            De.b(new LoadGameInstancesResultImpl(dataholder));
        }

        GameInstancesLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private static final class GameMuteStatusChangeResultImpl
        implements com.google.android.gms.games.Notifications.GameMuteStatusChangeResult
    {

        private final Status CM;
        private final String WJ;
        private final boolean WK;

        public Status getStatus()
        {
            return CM;
        }

        public GameMuteStatusChangeResultImpl(int i1, String s, boolean flag)
        {
            CM = new Status(i1);
            WJ = s;
            WK = flag;
        }
    }

    private final class GameMuteStatusChangedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void a(int i1, String s, boolean flag)
        {
            De.b(new GameMuteStatusChangeResultImpl(i1, s, flag));
        }

        GameMuteStatusChangedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private static final class GameMuteStatusLoadResultImpl
        implements com.google.android.gms.games.Notifications.GameMuteStatusLoadResult
    {

        private final Status CM;
        private final String WJ;
        private final boolean WK;

        public Status getStatus()
        {
            return CM;
        }

        public GameMuteStatusLoadResultImpl(DataHolder dataholder)
        {
            CM = new Status(dataholder.getStatusCode());
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            WJ = dataholder.c("external_game_id", 0, 0);
            WK = dataholder.d("muted", 0, 0);
_L4:
            dataholder.close();
            return;
_L2:
            WJ = null;
            WK = false;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private final class GameMuteStatusLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void B(DataHolder dataholder)
        {
            De.b(new GameMuteStatusLoadResultImpl(dataholder));
        }

        GameMuteStatusLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class GameSearchSuggestionsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void l(DataHolder dataholder)
        {
            De.b(new LoadGameSearchSuggestionsResultImpl(dataholder));
        }

        GameSearchSuggestionsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class GamesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void i(DataHolder dataholder)
        {
            De.b(new LoadGamesResultImpl(dataholder));
        }

        GamesLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private static final class InboxCountResultImpl
        implements com.google.android.gms.games.Notifications.InboxCountResult
    {

        private final Status CM;
        private final Bundle WL;

        public Status getStatus()
        {
            return CM;
        }

        InboxCountResultImpl(Status status, Bundle bundle)
        {
            CM = status;
            WL = bundle;
        }
    }

    private final class InboxCountsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void f(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            De.b(new InboxCountResultImpl(status, bundle));
        }

        InboxCountsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
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

    private final class InvitationReceivedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final OnInvitationReceivedListener WM;

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
                WC.a(WC. new InvitationReceivedCallback(WM, dataholder));
            }
            return;
            dataholder;
            invitationbuffer.release();
            throw dataholder;
        }

        public void onInvitationRemoved(String s)
        {
            WC.a(WC. new InvitationRemovedCallback(WM, s));
        }

        InvitationReceivedBinderCallback(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            WC = GamesClientImpl.this;
            super();
            WM = oninvitationreceivedlistener;
        }
    }

    private final class InvitationReceivedCallback extends com.google.android.gms.common.internal.e.b
    {

        final GamesClientImpl WC;
        private final Invitation WN;

        protected void b(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationReceived(WN);
        }

        protected void g(Object obj)
        {
            b((OnInvitationReceivedListener)obj);
        }

        protected void gT()
        {
        }

        InvitationReceivedCallback(OnInvitationReceivedListener oninvitationreceivedlistener, Invitation invitation)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, oninvitationreceivedlistener);
            WN = invitation;
        }
    }

    private final class InvitationRemovedCallback extends com.google.android.gms.common.internal.e.b
    {

        final GamesClientImpl WC;
        private final String WO;

        protected void b(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationRemoved(WO);
        }

        protected void g(Object obj)
        {
            b((OnInvitationReceivedListener)obj);
        }

        protected void gT()
        {
        }

        InvitationRemovedCallback(OnInvitationReceivedListener oninvitationreceivedlistener, String s)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, oninvitationreceivedlistener);
            WO = s;
        }
    }

    private final class InvitationsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void m(DataHolder dataholder)
        {
            De.b(new LoadInvitationsResultImpl(dataholder));
        }

        InvitationsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class JoinedRoomCallback extends AbstractRoomCallback
    {

        final GamesClientImpl WC;

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onJoinedRoom(i1, room);
        }

        public JoinedRoomCallback(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            WC = GamesClientImpl.this;
            super(roomupdatelistener, dataholder);
        }
    }

    private static final class LeaderboardMetadataResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult
    {

        private final LeaderboardBuffer WP;

        public LeaderboardBuffer getLeaderboards()
        {
            return WP;
        }

        LeaderboardMetadataResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            WP = new LeaderboardBuffer(dataholder);
        }
    }

    private final class LeaderboardScoresLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void a(DataHolder dataholder, DataHolder dataholder1)
        {
            De.b(new LoadScoresResultImpl(dataholder, dataholder1));
        }

        LeaderboardScoresLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class LeaderboardsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void e(DataHolder dataholder)
        {
            De.b(new LeaderboardMetadataResultImpl(dataholder));
        }

        LeaderboardsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
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

    private final class LeftRoomCallback extends com.google.android.gms.common.internal.e.b
    {

        private final int HF;
        final GamesClientImpl WC;
        private final String WQ;

        public void a(RoomUpdateListener roomupdatelistener)
        {
            roomupdatelistener.onLeftRoom(HF, WQ);
        }

        public void g(Object obj)
        {
            a((RoomUpdateListener)obj);
        }

        protected void gT()
        {
        }

        LeftRoomCallback(RoomUpdateListener roomupdatelistener, int i1, String s)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, roomupdatelistener);
            HF = i1;
            WQ = s;
        }
    }

    private static final class LoadAchievementsResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult
    {

        private final AchievementBuffer WR;

        public AchievementBuffer getAchievements()
        {
            return WR;
        }

        LoadAchievementsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            WR = new AchievementBuffer(dataholder);
        }
    }

    private static final class LoadAclResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.internal.game.Acls.LoadAclResult
    {

        LoadAclResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadEventResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.event.Events.LoadEventsResult
    {

        private final EventBuffer WS;

        public EventBuffer getEvents()
        {
            return WS;
        }

        LoadEventResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            WS = new EventBuffer(dataholder);
        }
    }

    private static final class LoadExtendedGamesResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult
    {

        private final ExtendedGameBuffer WT;

        LoadExtendedGamesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            WT = new ExtendedGameBuffer(dataholder);
        }
    }

    private static final class LoadGameInstancesResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult
    {

        private final GameInstanceBuffer WU;

        LoadGameInstancesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            WU = new GameInstanceBuffer(dataholder);
        }
    }

    private static final class LoadGameSearchSuggestionsResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult
    {

        LoadGameSearchSuggestionsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadGamesResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.GamesMetadata.LoadGamesResult
    {

        private final GameBuffer WV;

        public GameBuffer getGames()
        {
            return WV;
        }

        LoadGamesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            WV = new GameBuffer(dataholder);
        }
    }

    private static final class LoadInvitationsResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult
    {

        private final InvitationBuffer WW;

        public InvitationBuffer getInvitations()
        {
            return WW;
        }

        LoadInvitationsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            WW = new InvitationBuffer(dataholder);
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

        private final Status CM;
        private final LoadMatchesResponse WX;

        public LoadMatchesResponse getMatches()
        {
            return WX;
        }

        public Status getStatus()
        {
            return CM;
        }

        public void release()
        {
            WX.close();
        }

        LoadMatchesResultImpl(Status status, Bundle bundle)
        {
            CM = status;
            WX = new LoadMatchesResponse(bundle);
        }
    }

    private static final class LoadOwnerCoverPhotoUrisResultImpl
        implements com.google.android.gms.games.Players.LoadOwnerCoverPhotoUrisResult
    {

        private final Status CM;
        private final Bundle Nh;

        public Status getStatus()
        {
            return CM;
        }

        LoadOwnerCoverPhotoUrisResultImpl(int i1, Bundle bundle)
        {
            CM = new Status(i1);
            Nh = bundle;
        }
    }

    private static final class LoadPlayerScoreResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult
    {

        private final LeaderboardScoreEntity WY = null;

        public LeaderboardScore getScore()
        {
            return WY;
        }

        LoadPlayerScoreResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new LeaderboardScoreBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            WY = (LeaderboardScoreEntity)dataholder.get(0).freeze();
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

    private static final class LoadPlayersResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.Players.LoadPlayersResult
    {

        private final PlayerBuffer WZ;

        public PlayerBuffer getPlayers()
        {
            return WZ;
        }

        LoadPlayersResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            WZ = new PlayerBuffer(dataholder);
        }
    }

    private static final class LoadProfileSettingsResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.Players.LoadProfileSettingsResult
    {

        private final boolean Wp;
        private final boolean Xa;

        public Status getStatus()
        {
            return CM;
        }

        public boolean isProfileVisible()
        {
            return Wp;
        }

        public boolean isVisibilityExplicitlySet()
        {
            return Xa;
        }

        LoadProfileSettingsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            int i1 = dataholder.ar(0);
            Wp = dataholder.d("profile_visible", 0, i1);
            Xa = dataholder.d("profile_visibility_explicitly_set", 0, i1);
_L4:
            dataholder.close();
            return;
_L2:
            Wp = true;
            Xa = false;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private static final class LoadQuestsResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.quest.Quests.LoadQuestsResult
    {

        private final DataHolder II;

        public QuestBuffer getQuests()
        {
            return new QuestBuffer(II);
        }

        LoadQuestsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            II = dataholder;
        }
    }

    private static final class LoadRequestSummariesResultImpl extends com.google.android.gms.common.api.a
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

        private final Status CM;
        private final Bundle Xb;

        public GameRequestBuffer getRequests(int i1)
        {
            String s = RequestType.dH(i1);
            if (!Xb.containsKey(s))
            {
                return null;
            } else
            {
                return new GameRequestBuffer((DataHolder)Xb.get(s));
            }
        }

        public Status getStatus()
        {
            return CM;
        }

        public void release()
        {
            Iterator iterator = Xb.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                obj = (DataHolder)Xb.getParcelable(((String) (obj)));
                if (obj != null)
                {
                    ((DataHolder) (obj)).close();
                }
            } while (true);
        }

        LoadRequestsResultImpl(Status status, Bundle bundle)
        {
            CM = status;
            Xb = bundle;
        }
    }

    private static final class LoadScoresResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    {

        private final LeaderboardEntity Xc = null;
        private final LeaderboardScoreBuffer Xd;

        public Leaderboard getLeaderboard()
        {
            return Xc;
        }

        public LeaderboardScoreBuffer getScores()
        {
            return Xd;
        }

        LoadScoresResultImpl(DataHolder dataholder, DataHolder dataholder1)
        {
            super(dataholder1);
            dataholder = new LeaderboardBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            Xc = (LeaderboardEntity)((Leaderboard)dataholder.get(0)).freeze();
_L4:
            dataholder.release();
            Xd = new LeaderboardScoreBuffer(dataholder1);
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            dataholder1;
            dataholder.release();
            throw dataholder1;
        }
    }

    private static final class LoadSnapshotsResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult
    {

        public SnapshotMetadataBuffer getSnapshots()
        {
            return new SnapshotMetadataBuffer(II);
        }

        LoadSnapshotsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadXpForGameCategoriesResultImpl
        implements com.google.android.gms.games.Players.LoadXpForGameCategoriesResult
    {

        private final Status CM;
        private final List Xe;
        private final Bundle Xf;

        public Status getStatus()
        {
            return CM;
        }

        LoadXpForGameCategoriesResultImpl(Status status, Bundle bundle)
        {
            CM = status;
            Xe = bundle.getStringArrayList("game_category_list");
            Xf = bundle;
        }
    }

    private static final class LoadXpStreamResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.Players.LoadXpStreamResult
    {

        private final ExperienceEventBuffer Xg;

        LoadXpStreamResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            Xg = new ExperienceEventBuffer(dataholder);
        }
    }

    private final class MatchRemovedCallback extends com.google.android.gms.common.internal.e.b
    {

        final GamesClientImpl WC;
        private final String Xh;

        protected void b(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchRemoved(Xh);
        }

        protected void g(Object obj)
        {
            b((OnTurnBasedMatchUpdateReceivedListener)obj);
        }

        protected void gT()
        {
        }

        MatchRemovedCallback(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener, String s)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, onturnbasedmatchupdatereceivedlistener);
            Xh = s;
        }
    }

    private final class MatchUpdateReceivedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final OnTurnBasedMatchUpdateReceivedListener Xi;

        public void onTurnBasedMatchRemoved(String s)
        {
            WC.a(WC. new MatchRemovedCallback(Xi, s));
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
                WC.a(WC. new MatchUpdateReceivedCallback(Xi, dataholder));
            }
            return;
            dataholder;
            turnbasedmatchbuffer.release();
            throw dataholder;
        }

        MatchUpdateReceivedBinderCallback(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            WC = GamesClientImpl.this;
            super();
            Xi = onturnbasedmatchupdatereceivedlistener;
        }
    }

    private final class MatchUpdateReceivedCallback extends com.google.android.gms.common.internal.e.b
    {

        final GamesClientImpl WC;
        private final TurnBasedMatch Xj;

        protected void b(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchReceived(Xj);
        }

        protected void g(Object obj)
        {
            b((OnTurnBasedMatchUpdateReceivedListener)obj);
        }

        protected void gT()
        {
        }

        MatchUpdateReceivedCallback(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener, TurnBasedMatch turnbasedmatch)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, onturnbasedmatchupdatereceivedlistener);
            Xj = turnbasedmatch;
        }
    }

    private final class MessageReceivedCallback extends com.google.android.gms.common.internal.e.b
    {

        final GamesClientImpl WC;
        private final RealTimeMessage Xk;

        public void a(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            if (realtimemessagereceivedlistener != null)
            {
                realtimemessagereceivedlistener.onRealTimeMessageReceived(Xk);
            }
        }

        public void g(Object obj)
        {
            a((RealTimeMessageReceivedListener)obj);
        }

        protected void gT()
        {
        }

        MessageReceivedCallback(RealTimeMessageReceivedListener realtimemessagereceivedlistener, RealTimeMessage realtimemessage)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, realtimemessagereceivedlistener);
            Xk = realtimemessage;
        }
    }

    private final class NearbyPlayerDetectedCallback extends com.google.android.gms.common.internal.e.b
    {

        private final Player Xl;

        protected void a(OnNearbyPlayerDetectedListener onnearbyplayerdetectedlistener)
        {
            onnearbyplayerdetectedlistener.a(Xl);
        }

        protected void g(Object obj)
        {
            a((OnNearbyPlayerDetectedListener)obj);
        }

        protected void gT()
        {
        }
    }

    private final class NotifyAclLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void C(DataHolder dataholder)
        {
            De.b(new LoadAclResultImpl(dataholder));
        }

        NotifyAclLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class NotifyAclUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void dx(int i1)
        {
            De.b(new Status(i1));
        }

        NotifyAclUpdatedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private static final class OpenSnapshotResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    {

        private final Snapshot Xm;
        private final String Xn;
        private final Snapshot Xo;
        private final Contents Xp;
        private final SnapshotContents Xq;

        public String getConflictId()
        {
            return Xn;
        }

        public Snapshot getConflictingSnapshot()
        {
            return Xo;
        }

        public Contents getResolutionContents()
        {
            return Xp;
        }

        public SnapshotContents getResolutionSnapshotContents()
        {
            return Xq;
        }

        public Snapshot getSnapshot()
        {
            return Xm;
        }

        OpenSnapshotResultImpl(DataHolder dataholder, Contents contents)
        {
            this(dataholder, null, contents, null, null);
        }

        OpenSnapshotResultImpl(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
        {
            SnapshotMetadataBuffer snapshotmetadatabuffer;
            boolean flag;
            flag = true;
            super(dataholder);
            snapshotmetadatabuffer = new SnapshotMetadataBuffer(dataholder);
            if (snapshotmetadatabuffer.getCount() != 0) goto _L2; else goto _L1
_L1:
            Xm = null;
            Xo = null;
_L3:
            snapshotmetadatabuffer.release();
            Xn = s;
            Xp = contents2;
            Xq = new SnapshotContents(contents2);
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
            com.google.android.gms.common.internal.a.I(flag);
            Xm = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContents(contents));
            Xo = null;
              goto _L3
            dataholder;
            snapshotmetadatabuffer.release();
            throw dataholder;
            Xm = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContents(contents));
            Xo = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(1)), new SnapshotContents(contents1));
              goto _L3
        }
    }

    private final class OwnerCoverPhotoUrisLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void d(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            De.b(new LoadOwnerCoverPhotoUrisResultImpl(i1, bundle));
        }

        OwnerCoverPhotoUrisLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class P2PConnectedCallback extends com.google.android.gms.common.internal.e.b
    {

        final GamesClientImpl WC;
        private final String Xr;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            if (roomstatusupdatelistener != null)
            {
                roomstatusupdatelistener.onP2PConnected(Xr);
            }
        }

        public void g(Object obj)
        {
            a((RoomStatusUpdateListener)obj);
        }

        protected void gT()
        {
        }

        P2PConnectedCallback(RoomStatusUpdateListener roomstatusupdatelistener, String s)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, roomstatusupdatelistener);
            Xr = s;
        }
    }

    private final class P2PDisconnectedCallback extends com.google.android.gms.common.internal.e.b
    {

        final GamesClientImpl WC;
        private final String Xr;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            if (roomstatusupdatelistener != null)
            {
                roomstatusupdatelistener.onP2PDisconnected(Xr);
            }
        }

        public void g(Object obj)
        {
            a((RoomStatusUpdateListener)obj);
        }

        protected void gT()
        {
        }

        P2PDisconnectedCallback(RoomStatusUpdateListener roomstatusupdatelistener, String s)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, roomstatusupdatelistener);
            Xr = s;
        }
    }

    private final class PeerConnectedCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl WC;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersConnected(room, arraylist);
        }

        PeerConnectedCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            WC = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    private final class PeerDeclinedCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl WC;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerDeclined(room, arraylist);
        }

        PeerDeclinedCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            WC = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    private final class PeerDisconnectedCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl WC;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersDisconnected(room, arraylist);
        }

        PeerDisconnectedCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            WC = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    private final class PeerInvitedToRoomCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl WC;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerInvitedToRoom(room, arraylist);
        }

        PeerInvitedToRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            WC = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    private final class PeerJoinedRoomCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl WC;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerJoined(room, arraylist);
        }

        PeerJoinedRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            WC = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    private final class PeerLeftRoomCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl WC;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerLeft(room, arraylist);
        }

        PeerLeftRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            WC = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    private final class PlayerLeaderboardScoreLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void E(DataHolder dataholder)
        {
            De.b(new LoadPlayerScoreResultImpl(dataholder));
        }

        PlayerLeaderboardScoreLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class PlayerXpForGameCategoriesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void e(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            De.b(new LoadXpForGameCategoriesResultImpl(status, bundle));
        }

        PlayerXpForGameCategoriesLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    final class PlayerXpStreamLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void P(DataHolder dataholder)
        {
            De.b(new LoadXpStreamResultImpl(dataholder));
        }

        PlayerXpStreamLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class PlayersLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void g(DataHolder dataholder)
        {
            De.b(new LoadPlayersResultImpl(dataholder));
        }

        public void h(DataHolder dataholder)
        {
            De.b(new LoadPlayersResultImpl(dataholder));
        }

        PlayersLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    final class ProfileSettingsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void Q(DataHolder dataholder)
        {
            De.b(new LoadProfileSettingsResultImpl(dataholder));
        }

        ProfileSettingsLoadedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class ProfileSettingsUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void dz(int i1)
        {
            De.b(new Status(i1));
        }

        ProfileSettingsUpdatedBinderCallback(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class QuestAcceptedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b Xs;

        public void L(DataHolder dataholder)
        {
            Xs.b(new AcceptQuestResultImpl(dataholder));
        }

        public QuestAcceptedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            Xs = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class QuestCompletedCallback extends com.google.android.gms.common.internal.e.b
    {

        final GamesClientImpl WC;
        private final Quest WE;

        protected void b(QuestUpdateListener questupdatelistener)
        {
            questupdatelistener.onQuestCompleted(WE);
        }

        protected void g(Object obj)
        {
            b((QuestUpdateListener)obj);
        }

        protected void gT()
        {
        }

        QuestCompletedCallback(QuestUpdateListener questupdatelistener, Quest quest)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, questupdatelistener);
            WE = quest;
        }
    }

    private final class QuestMilestoneClaimBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b Xt;
        private final String Xu;

        public void K(DataHolder dataholder)
        {
            Xt.b(new ClaimMilestoneResultImpl(dataholder, Xu));
        }

        public QuestMilestoneClaimBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
        {
            WC = GamesClientImpl.this;
            super();
            Xt = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
            Xu = (String)com.google.android.gms.common.internal.o.b(s, "MilestoneId must not be null");
        }
    }

    private final class QuestUpdateBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final QuestUpdateListener Xv;

        private Quest S(DataHolder dataholder)
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
            dataholder = S(dataholder);
            if (dataholder != null)
            {
                WC.a(WC. new QuestCompletedCallback(Xv, dataholder));
            }
        }

        QuestUpdateBinderCallback(QuestUpdateListener questupdatelistener)
        {
            WC = GamesClientImpl.this;
            super();
            Xv = questupdatelistener;
        }
    }

    private final class QuestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b Xw;

        public void O(DataHolder dataholder)
        {
            Xw.b(new LoadQuestsResultImpl(dataholder));
        }

        public QuestsLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            Xw = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class RealTimeMessageSentCallback extends com.google.android.gms.common.internal.e.b
    {

        private final int HF;
        final GamesClientImpl WC;
        private final String Xx;
        private final int Xy;

        public void a(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback)
        {
            if (reliablemessagesentcallback != null)
            {
                reliablemessagesentcallback.onRealTimeMessageSent(HF, Xy, Xx);
            }
        }

        public void g(Object obj)
        {
            a((com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback)obj);
        }

        protected void gT()
        {
        }

        RealTimeMessageSentCallback(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback, int i1, int j1, String s)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, reliablemessagesentcallback);
            HF = i1;
            Xy = j1;
            Xx = s;
        }
    }

    private final class RealTimeReliableMessageBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        final com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback Xz;

        public void b(int i1, int j1, String s)
        {
            WC.a(WC. new RealTimeMessageSentCallback(Xz, i1, j1, s));
        }

        public RealTimeReliableMessageBinderCallbacks(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback)
        {
            WC = GamesClientImpl.this;
            super();
            Xz = reliablemessagesentcallback;
        }
    }

    private final class RequestReceivedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final OnRequestReceivedListener XA;

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
                WC.a(WC. new RequestReceivedCallback(XA, dataholder));
            }
            return;
            dataholder;
            gamerequestbuffer.release();
            throw dataholder;
        }

        public void onRequestRemoved(String s)
        {
            WC.a(WC. new RequestRemovedCallback(XA, s));
        }

        RequestReceivedBinderCallback(OnRequestReceivedListener onrequestreceivedlistener)
        {
            WC = GamesClientImpl.this;
            super();
            XA = onrequestreceivedlistener;
        }
    }

    private final class RequestReceivedCallback extends com.google.android.gms.common.internal.e.b
    {

        final GamesClientImpl WC;
        private final GameRequest XB;

        protected void b(OnRequestReceivedListener onrequestreceivedlistener)
        {
            onrequestreceivedlistener.onRequestReceived(XB);
        }

        protected void g(Object obj)
        {
            b((OnRequestReceivedListener)obj);
        }

        protected void gT()
        {
        }

        RequestReceivedCallback(OnRequestReceivedListener onrequestreceivedlistener, GameRequest gamerequest)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, onrequestreceivedlistener);
            XB = gamerequest;
        }
    }

    private final class RequestRemovedCallback extends com.google.android.gms.common.internal.e.b
    {

        final GamesClientImpl WC;
        private final String XC;

        protected void b(OnRequestReceivedListener onrequestreceivedlistener)
        {
            onrequestreceivedlistener.onRequestRemoved(XC);
        }

        protected void g(Object obj)
        {
            b((OnRequestReceivedListener)obj);
        }

        protected void gT()
        {
        }

        RequestRemovedCallback(OnRequestReceivedListener onrequestreceivedlistener, String s)
        {
            WC = GamesClientImpl.this;
            super(GamesClientImpl.this, onrequestreceivedlistener);
            XC = s;
        }
    }

    private final class RequestSentBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XD;

        public void G(DataHolder dataholder)
        {
            XD.b(new SendRequestResultImpl(dataholder));
        }

        public RequestSentBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XD = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class RequestSummariesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XE;

        public void H(DataHolder dataholder)
        {
            XE.b(new LoadRequestSummariesResultImpl(dataholder));
        }

        public RequestSummariesLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XE = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class RequestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XF;

        public void c(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            XF.b(new LoadRequestsResultImpl(status, bundle));
        }

        public RequestsLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XF = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class RequestsUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XG;

        public void F(DataHolder dataholder)
        {
            XG.b(new UpdateRequestsResultImpl(dataholder));
        }

        public RequestsUpdatedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XG = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class RoomAutoMatchingCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl WC;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomAutoMatching(room);
        }

        RoomAutoMatchingCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            WC = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
        }
    }

    private final class RoomBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final RoomUpdateListener XH;
        private final RoomStatusUpdateListener XI;
        private final RealTimeMessageReceivedListener XJ;

        public void A(DataHolder dataholder)
        {
            WC.a(WC. new DisconnectedFromRoomCallback(XI, dataholder));
        }

        public void a(DataHolder dataholder, String as[])
        {
            WC.a(WC. new PeerInvitedToRoomCallback(XI, dataholder, as));
        }

        public void b(DataHolder dataholder, String as[])
        {
            WC.a(WC. new PeerJoinedRoomCallback(XI, dataholder, as));
        }

        public void c(DataHolder dataholder, String as[])
        {
            WC.a(WC. new PeerLeftRoomCallback(XI, dataholder, as));
        }

        public void d(DataHolder dataholder, String as[])
        {
            WC.a(WC. new PeerDeclinedCallback(XI, dataholder, as));
        }

        public void e(DataHolder dataholder, String as[])
        {
            WC.a(WC. new PeerConnectedCallback(XI, dataholder, as));
        }

        public void f(DataHolder dataholder, String as[])
        {
            WC.a(WC. new PeerDisconnectedCallback(XI, dataholder, as));
        }

        public void onLeftRoom(int i1, String s)
        {
            WC.a(WC. new LeftRoomCallback(XH, i1, s));
        }

        public void onP2PConnected(String s)
        {
            WC.a(WC. new P2PConnectedCallback(XI, s));
        }

        public void onP2PDisconnected(String s)
        {
            WC.a(WC. new P2PDisconnectedCallback(XI, s));
        }

        public void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
        {
            WC.a(WC. new MessageReceivedCallback(XJ, realtimemessage));
        }

        public void u(DataHolder dataholder)
        {
            WC.a(WC. new RoomCreatedCallback(XH, dataholder));
        }

        public void v(DataHolder dataholder)
        {
            WC.a(WC. new JoinedRoomCallback(XH, dataholder));
        }

        public void w(DataHolder dataholder)
        {
            WC.a(WC. new RoomConnectingCallback(XI, dataholder));
        }

        public void x(DataHolder dataholder)
        {
            WC.a(WC. new RoomAutoMatchingCallback(XI, dataholder));
        }

        public void y(DataHolder dataholder)
        {
            WC.a(WC. new RoomConnectedCallback(XH, dataholder));
        }

        public void z(DataHolder dataholder)
        {
            WC.a(WC. new ConnectedToRoomCallback(XI, dataholder));
        }

        public RoomBinderCallbacks(RoomUpdateListener roomupdatelistener)
        {
            WC = GamesClientImpl.this;
            super();
            XH = (RoomUpdateListener)com.google.android.gms.common.internal.o.b(roomupdatelistener, "Callbacks must not be null");
            XI = null;
            XJ = null;
        }

        public RoomBinderCallbacks(RoomUpdateListener roomupdatelistener, RoomStatusUpdateListener roomstatusupdatelistener, RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            WC = GamesClientImpl.this;
            super();
            XH = (RoomUpdateListener)com.google.android.gms.common.internal.o.b(roomupdatelistener, "Callbacks must not be null");
            XI = roomstatusupdatelistener;
            XJ = realtimemessagereceivedlistener;
        }
    }

    private final class RoomConnectedCallback extends AbstractRoomCallback
    {

        final GamesClientImpl WC;

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onRoomConnected(i1, room);
        }

        RoomConnectedCallback(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            WC = GamesClientImpl.this;
            super(roomupdatelistener, dataholder);
        }
    }

    private final class RoomConnectingCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl WC;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomConnecting(room);
        }

        RoomConnectingCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            WC = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
        }
    }

    private final class RoomCreatedCallback extends AbstractRoomCallback
    {

        final GamesClientImpl WC;

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onRoomCreated(i1, room);
        }

        public RoomCreatedCallback(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            WC = GamesClientImpl.this;
            super(roomupdatelistener, dataholder);
        }
    }

    private static final class SendRequestResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.request.Requests.SendRequestResult
    {

        private final GameRequest XB = null;

        SendRequestResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new GameRequestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            XB = (GameRequest)((GameRequest)dataholder.get(0)).freeze();
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

    private final class SignOutCompleteBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void fp()
        {
            Status status = new Status(0);
            De.b(status);
        }

        public SignOutCompleteBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class SnapshotCommittedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XK;

        public void J(DataHolder dataholder)
        {
            XK.b(new CommitSnapshotResultImpl(dataholder));
        }

        public SnapshotCommittedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XK = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    final class SnapshotDeletedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void i(int i1, String s)
        {
            De.b(new DeleteSnapshotResultImpl(i1, s));
        }

        public SnapshotDeletedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class SnapshotOpenedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XL;

        public void a(DataHolder dataholder, Contents contents)
        {
            XL.b(new OpenSnapshotResultImpl(dataholder, contents));
        }

        public void a(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
        {
            XL.b(new OpenSnapshotResultImpl(dataholder, s, contents, contents1, contents2));
        }

        public SnapshotOpenedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XL = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class SnapshotsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XM;

        public void I(DataHolder dataholder)
        {
            XM.b(new LoadSnapshotsResultImpl(dataholder));
        }

        public SnapshotsLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XM = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class SubmitScoreBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        final GamesClientImpl WC;

        public void f(DataHolder dataholder)
        {
            De.b(new SubmitScoreResultImpl(dataholder));
        }

        public SubmitScoreBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            De = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private static final class SubmitScoreResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult
    {

        private final ScoreSubmissionData XN;

        public ScoreSubmissionData getScoreData()
        {
            return XN;
        }

        public SubmitScoreResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            XN = new ScoreSubmissionData(dataholder);
            dataholder.close();
            return;
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private final class TurnBasedMatchCanceledBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XO;

        public void h(int i1, String s)
        {
            Status status = new Status(i1);
            XO.b(new CancelMatchResultImpl(status, s));
        }

        public TurnBasedMatchCanceledBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XO = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class TurnBasedMatchInitiatedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XP;

        public void q(DataHolder dataholder)
        {
            XP.b(new InitiateMatchResultImpl(dataholder));
        }

        public TurnBasedMatchInitiatedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XP = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class TurnBasedMatchLeftBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XQ;

        public void s(DataHolder dataholder)
        {
            XQ.b(new LeaveMatchResultImpl(dataholder));
        }

        public TurnBasedMatchLeftBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XQ = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class TurnBasedMatchLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XR;

        public void p(DataHolder dataholder)
        {
            XR.b(new LoadMatchResultImpl(dataholder));
        }

        public TurnBasedMatchLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XR = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private static abstract class TurnBasedMatchResult extends com.google.android.gms.common.api.a
    {

        final TurnBasedMatch Xj = null;

        public TurnBasedMatch getMatch()
        {
            return Xj;
        }

        TurnBasedMatchResult(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new TurnBasedMatchBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            Xj = (TurnBasedMatch)((TurnBasedMatch)dataholder.get(0)).freeze();
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

    private final class TurnBasedMatchUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XS;

        public void r(DataHolder dataholder)
        {
            XS.b(new UpdateMatchResultImpl(dataholder));
        }

        public TurnBasedMatchUpdatedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XS = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private final class TurnBasedMatchesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl WC;
        private final com.google.android.gms.common.api.BaseImplementation.b XT;

        public void b(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            XT.b(new LoadMatchesResultImpl(status, bundle));
        }

        public TurnBasedMatchesLoadedBinderCallbacks(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            WC = GamesClientImpl.this;
            super();
            XT = (com.google.android.gms.common.api.BaseImplementation.b)com.google.android.gms.common.internal.o.b(b1, "Holder must not be null");
        }
    }

    private static final class UpdateAchievementResultImpl
        implements com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult
    {

        private final Status CM;
        private final String Wa;

        public String getAchievementId()
        {
            return Wa;
        }

        public Status getStatus()
        {
            return CM;
        }

        UpdateAchievementResultImpl(int i1, String s)
        {
            CM = new Status(i1);
            Wa = s;
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

    private static final class UpdateRequestsResultImpl extends com.google.android.gms.common.api.a
        implements com.google.android.gms.games.request.Requests.UpdateRequestsResult
    {

        private final RequestUpdateOutcomes XU;

        public Set getRequestIds()
        {
            return XU.getRequestIds();
        }

        public int getRequestOutcome(String s)
        {
            return XU.getRequestOutcome(s);
        }

        UpdateRequestsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            XU = RequestUpdateOutcomes.V(dataholder);
        }
    }


    private final String Dd;
    private final long WA = (long)hashCode();
    private final com.google.android.gms.games.Games.GamesOptions WB;
    EventIncrementManager Ws;
    private final String Wt;
    private final Map Wu = new HashMap();
    private PlayerEntity Wv;
    private GameEntity Ww;
    private final PopupManager Wx;
    private boolean Wy;
    private final Binder Wz = new Binder();

    public GamesClientImpl(Context context, Looper looper, String s, String s1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[], 
            int i1, View view, com.google.android.gms.games.Games.GamesOptions gamesoptions)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        Ws = new EventIncrementManager() {

            final GamesClientImpl WC;

            public EventIncrementCache ky()
            {
                return WC. new GameClientEventIncrementCache();
            }

            
            {
                WC = GamesClientImpl.this;
                super();
            }
        };
        Wy = false;
        Wt = s;
        Dd = (String)com.google.android.gms.common.internal.o.i(s1);
        Wx = com.google.android.gms.games.internal.PopupManager.a(this, i1);
        k(view);
        WB = gamesoptions;
        registerConnectionCallbacks(this);
        registerConnectionFailedListener(this);
    }

    private Room R(DataHolder dataholder)
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

    static Room a(GamesClientImpl gamesclientimpl, DataHolder dataholder)
    {
        return gamesclientimpl.R(dataholder);
    }

    private RealTimeSocket bA(String s)
    {
        String s1 = ((IGamesService)gS()).bF(s);
        if (s1 == null)
        {
            return null;
        }
        LocalSocket localsocket = new LocalSocket();
        localsocket.connect(new LocalSocketAddress(s1));
        s = new RealTimeSocketImpl(localsocket, s);
        return s;
        s;
        GamesLog.q("GamesClientImpl", "Unable to create socket. Service died.");
_L2:
        return null;
        s;
        GamesLog.q("GamesClientImpl", (new StringBuilder()).append("connect() call failed on socket: ").append(s.getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    private RealTimeSocket bB(String s)
    {
        android.os.ParcelFileDescriptor parcelfiledescriptor;
        try
        {
            parcelfiledescriptor = ((IGamesService)gS()).bK(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.q("GamesClientImpl", "Unable to create socket. Service died.");
            return null;
        }
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        com.google.android.gms.games.internal.GamesLog.o("GamesClientImpl", "Created native libjingle socket.");
        return new LibjingleNativeSocket(parcelfiledescriptor);
        GamesLog.q("GamesClientImpl", (new StringBuilder()).append("Unable to create socket for ").append(s).toString());
        return null;
    }

    private RealTimeSocket bz(String s)
    {
        RealTimeSocket realtimesocket;
        if (com.google.android.gms.internal.kc.hD())
        {
            realtimesocket = bB(s);
        } else
        {
            realtimesocket = bA(s);
        }
        if (realtimesocket != null)
        {
            Wu.put(s, realtimesocket);
        }
        return realtimesocket;
    }

    private void jZ()
    {
        Wv = null;
    }

    private void kw()
    {
        for (Iterator iterator = Wu.values().iterator(); iterator.hasNext();)
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

        Wu.clear();
    }

    public int a(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback, byte abyte0[], String s, String s1)
    {
        int i1;
        try
        {
            i1 = ((IGamesService)gS()).a(new RealTimeReliableMessageBinderCallbacks(reliablemessagesentcallback), abyte0, s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public int a(byte abyte0[], String s, String as[])
    {
        com.google.android.gms.common.internal.o.b(as, "Participant IDs must not be null");
        int i1;
        try
        {
            i1 = ((IGamesService)gS()).b(abyte0, s, as);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.p("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public Intent a(int i1, int j1, boolean flag)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)gS()).a(i1, j1, flag);
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent a(int i1, byte abyte0[], int j1, Bitmap bitmap, String s)
    {
        try
        {
            abyte0 = ((IGamesService)gS()).a(i1, abyte0, j1, s);
            com.google.android.gms.common.internal.o.b(bitmap, "Must provide a non null icon");
            abyte0.putExtra("com.google.android.gms.games.REQUEST_ITEM_ICON", bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return abyte0;
    }

    public Intent a(Room room, int i1)
    {
        try
        {
            room = ((IGamesService)gS()).a((RoomEntity)room.freeze(), i1);
        }
        // Misplaced declaration of an exception variable
        catch (Room room)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return room;
    }

    public Intent a(String s, boolean flag, boolean flag1, int i1)
    {
        try
        {
            s = ((IGamesService)gS()).a(s, flag, flag1, i1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle)
    {
        if (i1 == 0 && bundle != null)
        {
            Wy = bundle.getBoolean("show_welcome_popup");
        }
        super.a(i1, ibinder, bundle);
    }

    public void a(IBinder ibinder, Bundle bundle)
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        ((IGamesService)gS()).a(ibinder, bundle);
        return;
        ibinder;
        GamesLog.p("GamesClientImpl", "service died");
        return;
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, int j1, int k1)
    {
        try
        {
            ((IGamesService)gS()).a(new RequestsLoadedBinderCallbacks(b1), i1, j1, k1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, int j1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)gS()).a(new ExtendedGamesLoadedBinderCallback(b1), i1, j1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)gS()).a(new PlayersLoadedBinderCallback(b1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, int ai[])
    {
        try
        {
            ((IGamesService)gS()).a(new TurnBasedMatchesLoadedBinderCallbacks(b1), i1, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, LeaderboardScoreBuffer leaderboardscorebuffer, int i1, int j1)
    {
        try
        {
            ((IGamesService)gS()).a(new LeaderboardScoresLoadedBinderCallback(b1), leaderboardscorebuffer.lA().lB(), i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, TurnBasedMatchConfig turnbasedmatchconfig)
    {
        try
        {
            ((IGamesService)gS()).a(new TurnBasedMatchInitiatedBinderCallbacks(b1), turnbasedmatchconfig.getVariant(), turnbasedmatchconfig.lH(), turnbasedmatchconfig.getInvitedPlayerIds(), turnbasedmatchconfig.getAutoMatchCriteria());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
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
        com.google.android.gms.common.internal.o.a(flag, "Snapshot already closed");
        obj = snapshotmetadatachange.lM();
        if (obj != null)
        {
            ((a) (obj)).a(getContext().getCacheDir());
        }
        obj = snapshotcontents.getContents();
        snapshotcontents.close();
        try
        {
            ((IGamesService)gS()).a(new SnapshotCommittedBinderCallbacks(b1), snapshot.getMetadata().getSnapshotId(), snapshotmetadatachange, ((Contents) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).a(new PlayersLoadedBinderCallback(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1)
    {
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        b1 = null;
_L1:
        try
        {
            ((IGamesService)gS()).a(b1, s, i1, Wx.kO(), Wx.kN());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_59;
        b1 = new AchievementUpdatedBinderCallback(b1);
          goto _L1
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).a(new LeaderboardScoresLoadedBinderCallback(b1), s, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).a(new PlayersLoadedBinderCallback(b1), s, i1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1, boolean flag, boolean flag1)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 156408498 156408498: default 24
    //                   156408498 72;
           goto _L1 _L2
_L1:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid player collection: ").append(s).toString());

        case 0: // '\0'
            break;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (s.equals("played_with"))
        {
            byte0 = 0;
        }
        if (true) goto _L1; else goto _L3
_L3:
        try
        {
            ((IGamesService)gS()).d(new PlayersLoadedBinderCallback(b1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
        return;
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        try
        {
            ((IGamesService)gS()).a(new ExtendedGamesLoadedBinderCallback(b1), s, i1, flag, flag1, flag2, flag3);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1, int ai[])
    {
        try
        {
            ((IGamesService)gS()).a(new TurnBasedMatchesLoadedBinderCallbacks(b1), s, i1, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, long l1, String s1)
    {
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        b1 = null;
_L1:
        try
        {
            ((IGamesService)gS()).a(b1, s, l1, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_47;
        b1 = new SubmitScoreBinderCallbacks(b1);
          goto _L1
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1)
    {
        try
        {
            ((IGamesService)gS()).c(new TurnBasedMatchLeftBinderCallbacks(b1), s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, int i1, int j1)
    {
        try
        {
            ((IGamesService)gS()).a(new PlayerLeaderboardScoreLoadedBinderCallback(b1), s, s1, i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, int i1, int j1, int k1)
    {
        try
        {
            ((IGamesService)gS()).a(new RequestsLoadedBinderCallbacks(b1), s, s1, i1, j1, k1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).a(new LeaderboardScoresLoadedBinderCallback(b1), s, s1, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, int i1, boolean flag, boolean flag1)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   -1049482625: 128
    //                   156408498: 112
    //                   782949780: 96;
           goto _L1 _L2 _L3 _L4
_L1:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid player collection: ").append(s).toString());

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (s.equals("circled"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (s.equals("played_with"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s.equals("nearby"))
        {
            byte0 = 2;
        }
        if (true) goto _L1; else goto _L5
_L5:
        try
        {
            ((IGamesService)gS()).a(new PlayersLoadedBinderCallback(b1), s, s1, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
        return;
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, SnapshotContents snapshotcontents)
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
        com.google.android.gms.common.internal.o.a(flag, "SnapshotContents already closed");
        obj = snapshotmetadatachange.lM();
        if (obj != null)
        {
            ((a) (obj)).a(getContext().getCacheDir());
        }
        obj = snapshotcontents.getContents();
        snapshotcontents.close();
        try
        {
            ((IGamesService)gS()).a(new SnapshotOpenedBinderCallbacks(b1), s, s1, snapshotmetadatachange, ((Contents) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).b(new LeaderboardsLoadedBinderCallback(b1), s, s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, boolean flag, String as[])
    {
        try
        {
            Ws.flush();
            ((IGamesService)gS()).a(new QuestsLoadedBinderCallbacks(b1), s, s1, as, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, int ai[], int i1, boolean flag)
    {
        try
        {
            Ws.flush();
            ((IGamesService)gS()).a(new QuestsLoadedBinderCallbacks(b1), s, s1, ai, i1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, String as[])
    {
        try
        {
            ((IGamesService)gS()).a(new RequestsUpdatedBinderCallbacks(b1), s, s1, as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).c(new LeaderboardsLoadedBinderCallback(b1), s, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[])
    {
        try
        {
            ((IGamesService)gS()).a(new TurnBasedMatchUpdatedBinderCallbacks(b1), s, abyte0, s1, aparticipantresult);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, byte abyte0[], ParticipantResult aparticipantresult[])
    {
        try
        {
            ((IGamesService)gS()).a(new TurnBasedMatchUpdatedBinderCallbacks(b1), s, abyte0, aparticipantresult);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String as[], int i1, byte abyte0[], int j1)
    {
        try
        {
            ((IGamesService)gS()).a(new RequestSentBinderCallbacks(b1), s, as, i1, abyte0, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).c(new PlayersLoadedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag, Bundle bundle)
    {
        try
        {
            ((IGamesService)gS()).a(new ContactSettingsUpdatedBinderCallback(b1), flag, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public transient void a(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag, String as[])
    {
        try
        {
            Ws.flush();
            ((IGamesService)gS()).a(new EventsLoadedBinderCallback(b1), flag, as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, int ai[], int i1, boolean flag)
    {
        try
        {
            Ws.flush();
            ((IGamesService)gS()).a(new QuestsLoadedBinderCallbacks(b1), ai, i1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.BaseImplementation.b b1, String as[])
    {
        try
        {
            ((IGamesService)gS()).c(new PlayersLoadedBinderCallback(b1), as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        String s = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", WB.VD);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", WB.VE);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", WB.VF);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", WB.VG);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", WB.VH);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", WB.VI);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", WB.VJ);
        l1.a(e1, 0x5e2978, getContext().getPackageName(), Dd, gR(), Wt, Wx.kO(), s, bundle);
    }

    public void a(OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        try
        {
            oninvitationreceivedlistener = new InvitationReceivedBinderCallback(oninvitationreceivedlistener);
            ((IGamesService)gS()).a(oninvitationreceivedlistener, WA);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(RoomConfig roomconfig)
    {
        kw();
        try
        {
            RoomBinderCallbacks roombindercallbacks = new RoomBinderCallbacks(roomconfig.getRoomUpdateListener(), roomconfig.getRoomStatusUpdateListener(), roomconfig.getMessageReceivedListener());
            ((IGamesService)gS()).a(roombindercallbacks, Wz, roomconfig.getVariant(), roomconfig.getInvitedPlayerIds(), roomconfig.getAutoMatchCriteria(), roomconfig.isSocketEnabled(), WA);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomConfig roomconfig)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(RoomUpdateListener roomupdatelistener, String s)
    {
        try
        {
            ((IGamesService)gS()).c(new RoomBinderCallbacks(roomupdatelistener), s);
            kw();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomUpdateListener roomupdatelistener)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
    {
        try
        {
            onturnbasedmatchupdatereceivedlistener = new MatchUpdateReceivedBinderCallback(onturnbasedmatchupdatereceivedlistener);
            ((IGamesService)gS()).b(onturnbasedmatchupdatereceivedlistener, WA);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(QuestUpdateListener questupdatelistener)
    {
        try
        {
            questupdatelistener = new QuestUpdateBinderCallback(questupdatelistener);
            ((IGamesService)gS()).d(questupdatelistener, WA);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (QuestUpdateListener questupdatelistener)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void a(OnRequestReceivedListener onrequestreceivedlistener)
    {
        try
        {
            onrequestreceivedlistener = new RequestReceivedBinderCallback(onrequestreceivedlistener);
            ((IGamesService)gS()).c(onrequestreceivedlistener, WA);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnRequestReceivedListener onrequestreceivedlistener)
        {
            GamesLog.p("GamesClientImpl", "service died");
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
        com.google.android.gms.common.internal.o.a(flag, "Snapshot already closed");
        contents = snapshot.getContents();
        snapshot.close();
        try
        {
            ((IGamesService)gS()).a(contents);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Snapshot snapshot)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    protected IGamesService az(IBinder ibinder)
    {
        return IGamesService.Stub.aB(ibinder);
    }

    public Intent b(int i1, int j1, boolean flag)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)gS()).b(i1, j1, flag);
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent b(int ai[])
    {
        try
        {
            ai = ((IGamesService)gS()).b(ai);
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return ai;
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            Ws.flush();
            ((IGamesService)gS()).a(new SignOutCompleteBinderCallbacks(b1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)gS()).b(new PlayersLoadedBinderCallback(b1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        b1 = null;
_L1:
        try
        {
            ((IGamesService)gS()).a(b1, s, Wx.kO(), Wx.kN());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_58;
        b1 = new AchievementUpdatedBinderCallback(b1);
          goto _L1
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1)
    {
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        b1 = null;
_L1:
        try
        {
            ((IGamesService)gS()).b(b1, s, i1, Wx.kO(), Wx.kN());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_59;
        b1 = new AchievementUpdatedBinderCallback(b1);
          goto _L1
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).b(new LeaderboardScoresLoadedBinderCallback(b1), s, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)gS()).a(new ExtendedGamesLoadedBinderCallback(b1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1)
    {
        try
        {
            Ws.flush();
            ((IGamesService)gS()).f(new QuestMilestoneClaimBinderCallbacks(b1, s1), s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).b(new LeaderboardScoresLoadedBinderCallback(b1), s, s1, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).a(new AchievementsLoadedBinderCallback(b1), s, s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String s, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).e(new SnapshotOpenedBinderCallbacks(b1), s, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).b(new LeaderboardsLoadedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag, String as[])
    {
        try
        {
            Ws.flush();
            ((IGamesService)gS()).a(new QuestsLoadedBinderCallbacks(b1), as, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.BaseImplementation.b b1, String as[])
    {
        try
        {
            ((IGamesService)gS()).a(new RequestsUpdatedBinderCallbacks(b1), as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void b(RoomConfig roomconfig)
    {
        kw();
        try
        {
            RoomBinderCallbacks roombindercallbacks = new RoomBinderCallbacks(roomconfig.getRoomUpdateListener(), roomconfig.getRoomStatusUpdateListener(), roomconfig.getMessageReceivedListener());
            ((IGamesService)gS()).a(roombindercallbacks, Wz, roomconfig.getInvitationId(), roomconfig.isSocketEnabled(), WA);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomConfig roomconfig)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public Intent bC(String s)
    {
        try
        {
            s = ((IGamesService)gS()).bC(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public void bD(String s)
    {
        try
        {
            ((IGamesService)gS()).a(s, Wx.kO(), Wx.kN());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public Intent bx(String s)
    {
        try
        {
            s = ((IGamesService)gS()).bx(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public void by(String s)
    {
        try
        {
            ((IGamesService)gS()).bJ(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, int i1)
    {
        try
        {
            ((IGamesService)gS()).a(new InvitationsLoadedBinderCallback(b1), i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)gS()).c(new PlayersLoadedBinderCallback(b1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        b1 = null;
_L1:
        try
        {
            ((IGamesService)gS()).b(b1, s, Wx.kO(), Wx.kN());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_58;
        b1 = new AchievementUpdatedBinderCallback(b1);
          goto _L1
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1)
    {
        try
        {
            ((IGamesService)gS()).b(new PlayerXpStreamLoadedBinderCallback(b1), s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)gS()).e(new ExtendedGamesLoadedBinderCallback(b1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1)
    {
        try
        {
            ((IGamesService)gS()).d(new TurnBasedMatchInitiatedBinderCallbacks(b1), s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).c(new SnapshotsLoadedBinderCallbacks(b1), s, s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String s, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).d(new LeaderboardsLoadedBinderCallback(b1), s, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).a(new AchievementsLoadedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.BaseImplementation.b b1, String as[])
    {
        try
        {
            ((IGamesService)gS()).b(new RequestsUpdatedBinderCallbacks(b1), as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    protected transient void c(String as[])
    {
        int i1 = 0;
        boolean flag = false;
        boolean flag1 = false;
        while (i1 < as.length) 
        {
            String s = as[i1];
            boolean flag2;
            if (s.equals("https://www.googleapis.com/auth/games"))
            {
                flag2 = true;
            } else
            {
                flag2 = flag1;
                if (s.equals("https://www.googleapis.com/auth/games.firstparty"))
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
            com.google.android.gms.common.internal.o.a(flag1, "Cannot have both %s and %s!", new Object[] {
                "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"
            });
            return;
        } else
        {
            com.google.android.gms.common.internal.o.a(flag1, "Games APIs requires %s to function.", new Object[] {
                "https://www.googleapis.com/auth/games"
            });
            return;
        }
    }

    public void connect()
    {
        jZ();
        super.connect();
    }

    public int d(byte abyte0[], String s)
    {
        int i1;
        try
        {
            i1 = ((IGamesService)gS()).b(abyte0, s, null);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.p("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)gS()).e(new PlayersLoadedBinderCallback(b1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).l(new TurnBasedMatchInitiatedBinderCallbacks(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1)
    {
        try
        {
            ((IGamesService)gS()).c(new PlayerXpStreamLoadedBinderCallback(b1), s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)gS()).f(new ExtendedGamesLoadedBinderCallback(b1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, String s, String s1)
    {
        try
        {
            ((IGamesService)gS()).e(new TurnBasedMatchInitiatedBinderCallbacks(b1), s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, String s, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).a(new GameMuteStatusChangedBinderCallback(b1), s, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            Ws.flush();
            ((IGamesService)gS()).f(new EventsLoadedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void dB(int i1)
    {
        Wx.setGravity(i1);
    }

    public void dC(int i1)
    {
        try
        {
            ((IGamesService)gS()).dC(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void disconnect()
    {
        Wy = false;
        if (isConnected())
        {
            try
            {
                IGamesService igamesservice = (IGamesService)gS();
                igamesservice.kx();
                Ws.flush();
                igamesservice.q(WA);
            }
            catch (RemoteException remoteexception)
            {
                GamesLog.p("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        kw();
        super.disconnect();
    }

    public void e(com.google.android.gms.common.api.BaseImplementation.b b1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)gS()).d(new PlayersLoadedBinderCallback(b1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).m(new TurnBasedMatchInitiatedBinderCallbacks(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1)
    {
        try
        {
            ((IGamesService)gS()).b(new InvitationsLoadedBinderCallback(b1), s, i1, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)gS()).c(new ExtendedGamesLoadedBinderCallback(b1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).d(new SnapshotsLoadedBinderCallbacks(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            ((IGamesService)gS()).d(new GamesLoadedBinderCallback(b1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).o(new TurnBasedMatchLeftBinderCallbacks(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1)
    {
        try
        {
            ((IGamesService)gS()).a(new RequestSummariesLoadedBinderCallbacks(b1), s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)gS()).b(new PlayersLoadedBinderCallback(b1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).g(new ProfileSettingsLoadedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public Bundle fC()
    {
        Bundle bundle;
        try
        {
            bundle = ((IGamesService)gS()).fC();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
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
            ((IGamesService)gS()).j(new OwnerCoverPhotoUrisLoadedBinderCallback(b1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void g(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).n(new TurnBasedMatchCanceledBinderCallbacks(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void g(com.google.android.gms.common.api.BaseImplementation.b b1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)gS()).b(new PlayersLoadedBinderCallback(b1), s, null, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void g(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).h(new ProfileSettingsUpdatedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.games.service.START";
    }

    public void h(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            ((IGamesService)gS()).h(new NotifyAclLoadedBinderCallback(b1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void h(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).p(new TurnBasedMatchLoadedBinderCallbacks(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void h(com.google.android.gms.common.api.BaseImplementation.b b1, boolean flag)
    {
        try
        {
            ((IGamesService)gS()).e(new ContactSettingsLoadedBinderCallback(b1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void i(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            ((IGamesService)gS()).e(new ContactSettingsLoadedBinderCallback(b1), false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void i(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            Ws.flush();
            ((IGamesService)gS()).u(new QuestAcceptedBinderCallbacks(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    protected IInterface j(IBinder ibinder)
    {
        return az(ibinder);
    }

    public void j(com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        try
        {
            ((IGamesService)gS()).t(new InboxCountsLoadedBinderCallback(b1), null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void j(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).r(new SnapshotDeletedBinderCallbacks(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void k(View view)
    {
        Wx.l(view);
    }

    public void k(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).e(new ExtendedGamesLoadedBinderCallback(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public String ka()
    {
        String s;
        try
        {
            s = ((IGamesService)gS()).ka();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public String kb()
    {
        String s;
        try
        {
            s = ((IGamesService)gS()).kb();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public Player kc()
    {
        dJ();
        this;
        JVM INSTR monitorenter ;
        Object obj = Wv;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new PlayerBuffer(((IGamesService)gS()).kz());
        if (((PlayerBuffer) (obj)).getCount() > 0)
        {
            Wv = (PlayerEntity)((PlayerBuffer) (obj)).get(0).freeze();
        }
        ((PlayerBuffer) (obj)).release();
_L1:
        this;
        JVM INSTR monitorexit ;
        return Wv;
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
        GamesLog.p("GamesClientImpl", "service died");
          goto _L1
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Game kd()
    {
        dJ();
        this;
        JVM INSTR monitorenter ;
        Object obj = Ww;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new GameBuffer(((IGamesService)gS()).kB());
        if (((GameBuffer) (obj)).getCount() > 0)
        {
            Ww = (GameEntity)((GameBuffer) (obj)).get(0).freeze();
        }
        ((GameBuffer) (obj)).release();
_L1:
        this;
        JVM INSTR monitorexit ;
        return Ww;
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
        GamesLog.p("GamesClientImpl", "service died");
          goto _L1
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Intent ke()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)gS()).ke();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent kf()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)gS()).kf();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent kg()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)gS()).kg();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent kh()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)gS()).kh();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public void ki()
    {
        try
        {
            ((IGamesService)gS()).r(WA);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void kj()
    {
        try
        {
            ((IGamesService)gS()).s(WA);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void kk()
    {
        try
        {
            ((IGamesService)gS()).u(WA);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void kl()
    {
        try
        {
            ((IGamesService)gS()).t(WA);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public Intent km()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)gS()).km();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent kn()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)gS()).kn();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public int ko()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)gS()).ko();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return 4368;
        }
        return i1;
    }

    public String kp()
    {
        String s;
        try
        {
            s = ((IGamesService)gS()).kp();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public int kq()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)gS()).kq();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public Intent kr()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)gS()).kr();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public int ks()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)gS()).ks();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public int kt()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)gS()).kt();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public int ku()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)gS()).ku();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public int kv()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)gS()).kv();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.p("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public void kx()
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_19;
        }
        ((IGamesService)gS()).kx();
        return;
        RemoteException remoteexception;
        remoteexception;
        GamesLog.p("GamesClientImpl", "service died");
        return;
    }

    public void l(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).f(new GameInstancesLoadedBinderCallback(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void m(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).q(new GameSearchSuggestionsLoadedBinderCallback(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void n(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).s(new PlayerXpForGameCategoriesLoadedBinderCallback(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void n(String s, int i1)
    {
        Ws.n(s, i1);
    }

    public void o(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).k(new InvitationsLoadedBinderCallback(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void o(String s, int i1)
    {
        try
        {
            ((IGamesService)gS()).o(s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void onConnected(Bundle bundle)
    {
        if (Wy)
        {
            Wx.kM();
            Wy = false;
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Wy = false;
    }

    public void onConnectionSuspended(int i1)
    {
    }

    public void p(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).j(new NotifyAclUpdatedBinderCallback(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void p(String s, int i1)
    {
        try
        {
            ((IGamesService)gS()).p(s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public void q(com.google.android.gms.common.api.BaseImplementation.b b1, String s)
    {
        try
        {
            ((IGamesService)gS()).i(new GameMuteStatusLoadedBinderCallback(b1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            GamesLog.p("GamesClientImpl", "service died");
        }
    }

    public RealTimeSocket t(String s, String s1)
    {
label0:
        {
            if (s1 == null || !ParticipantUtils.bV(s1))
            {
                throw new IllegalArgumentException("Bad participant ID");
            }
            RealTimeSocket realtimesocket = (RealTimeSocket)Wu.get(s1);
            if (realtimesocket != null)
            {
                s = realtimesocket;
                if (!realtimesocket.isClosed())
                {
                    break label0;
                }
            }
            s = bz(s1);
        }
        return s;
    }
}
