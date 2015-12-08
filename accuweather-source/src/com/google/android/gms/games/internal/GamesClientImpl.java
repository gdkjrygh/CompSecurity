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
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
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
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.hj;
import com.google.android.gms.internal.hn;
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
//            PopupManager, IGamesService, GamesLog, LibjingleNativeSocket, 
//            RealTimeSocketImpl, AbstractGamesCallbacks

public final class GamesClientImpl extends hc
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{
    private abstract class AbstractPeerStatusCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl NB;
        private final ArrayList NC = new ArrayList();

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            a(roomstatusupdatelistener, room, NC);
        }

        protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist);

        AbstractPeerStatusCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            NB = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
            int i1 = 0;
            for (int j1 = as.length; i1 < j1; i1++)
            {
                NC.add(as[i1]);
            }

        }
    }

    private abstract class AbstractRoomCallback extends com.google.android.gms.internal.hc.d
    {

        final GamesClientImpl NB;

        protected void a(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            a(roomupdatelistener, com.google.android.gms.games.internal.GamesClientImpl.a(NB, dataholder), dataholder.getStatusCode());
        }

        protected abstract void a(RoomUpdateListener roomupdatelistener, Room room, int i1);

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((RoomUpdateListener)obj, dataholder);
        }

        AbstractRoomCallback(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, roomupdatelistener, dataholder);
        }
    }

    private abstract class AbstractRoomStatusCallback extends com.google.android.gms.internal.hc.d
    {

        final GamesClientImpl NB;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            a(roomstatusupdatelistener, com.google.android.gms.games.internal.GamesClientImpl.a(NB, dataholder));
        }

        protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((RoomStatusUpdateListener)obj, dataholder);
        }

        AbstractRoomStatusCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, roomstatusupdatelistener, dataholder);
        }
    }

    private static final class AcceptQuestResultImpl extends b
        implements com.google.android.gms.games.quest.Quests.AcceptQuestResult
    {

        private final Quest ND = null;

        public Quest getQuest()
        {
            return ND;
        }

        AcceptQuestResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new QuestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            ND = new QuestEntity((Quest)dataholder.get(0));
_L4:
            dataholder.close();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private final class AchievementUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void e(int i1, String s)
        {
            yO.a(new UpdateAchievementResultImpl(i1, s));
        }

        AchievementUpdatedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class AchievementsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void c(DataHolder dataholder)
        {
            yO.a(new LoadAchievementsResultImpl(dataholder));
        }

        AchievementsLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private static final class CancelMatchResultImpl
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult
    {

        private final String NE;
        private final Status yw;

        public String getMatchId()
        {
            return NE;
        }

        public Status getStatus()
        {
            return yw;
        }

        CancelMatchResultImpl(Status status, String s)
        {
            yw = status;
            NE = s;
        }
    }

    private static final class ClaimMilestoneResultImpl extends b
        implements com.google.android.gms.games.quest.Quests.ClaimMilestoneResult
    {

        private final Quest ND;
        private final Milestone NF = null;

        public Milestone getMilestone()
        {
            return NF;
        }

        public Quest getQuest()
        {
            return ND;
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
            ND = new QuestEntity((Quest)dataholder.get(0));
            list = ND.iE();
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
            NF = (Milestone)list.get(i1);
            dataholder.close();
            return;
            i1++;
            if (true) goto _L4; else goto _L3
_L3:
_L6:
            dataholder.close();
            return;
_L2:
            NF = null;
            ND = null;
            if (true) goto _L6; else goto _L5
_L5:
            s;
            dataholder.close();
            throw s;
        }
    }

    private static final class CommitSnapshotResultImpl extends b
        implements com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult
    {

        private final SnapshotMetadata NG = null;

        public SnapshotMetadata getSnapshotMetadata()
        {
            return NG;
        }

        CommitSnapshotResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new SnapshotMetadataBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            NG = new SnapshotMetadataEntity(dataholder.get(0));
_L4:
            dataholder.close();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private final class ConnectedToRoomCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl NB;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onConnectedToRoom(room);
        }

        ConnectedToRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            NB = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
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

    private final class ContactSettingsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void D(DataHolder dataholder)
        {
            yO.a(new ContactSettingLoadResultImpl(dataholder));
        }

        ContactSettingsLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class ContactSettingsUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void ce(int i1)
        {
            yO.a(new Status(i1));
        }

        ContactSettingsUpdatedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private static final class DeleteSnapshotResultImpl
        implements com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult
    {

        private final String NH;
        private final Status yw;

        public String getSnapshotId()
        {
            return NH;
        }

        public Status getStatus()
        {
            return yw;
        }

        DeleteSnapshotResultImpl(int i1, String s)
        {
            yw = new Status(i1);
            NH = s;
        }
    }

    private final class DisconnectedFromRoomCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl NB;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onDisconnectedFromRoom(room);
        }

        DisconnectedFromRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            NB = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
        }
    }

    private final class EventsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void d(DataHolder dataholder)
        {
            yO.a(new LoadEventResultImpl(dataholder));
        }

        EventsLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class ExtendedGamesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void j(DataHolder dataholder)
        {
            yO.a(new LoadExtendedGamesResultImpl(dataholder));
        }

        ExtendedGamesLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private class GameClientEventIncrementCache extends EventIncrementCache
    {

        final GamesClientImpl NB;

        protected void o(String s, int i1)
        {
            try
            {
                ((IGamesService)NB.fo()).l(s, i1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                GamesLog.j("GamesClientImpl", "service died");
            }
        }

        public GameClientEventIncrementCache()
        {
            NB = GamesClientImpl.this;
            super(getContext().getMainLooper(), 1000);
        }
    }

    private final class GameInstancesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void k(DataHolder dataholder)
        {
            yO.a(new LoadGameInstancesResultImpl(dataholder));
        }

        GameInstancesLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private static final class GameMuteStatusChangeResultImpl
        implements com.google.android.gms.games.Notifications.GameMuteStatusChangeResult
    {

        private final String NI;
        private final boolean NJ;
        private final Status yw;

        public Status getStatus()
        {
            return yw;
        }

        public GameMuteStatusChangeResultImpl(int i1, String s, boolean flag)
        {
            yw = new Status(i1);
            NI = s;
            NJ = flag;
        }
    }

    private final class GameMuteStatusChangedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void a(int i1, String s, boolean flag)
        {
            yO.a(new GameMuteStatusChangeResultImpl(i1, s, flag));
        }

        GameMuteStatusChangedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private static final class GameMuteStatusLoadResultImpl
        implements com.google.android.gms.games.Notifications.GameMuteStatusLoadResult
    {

        private final String NI;
        private final boolean NJ;
        private final Status yw;

        public Status getStatus()
        {
            return yw;
        }

        public GameMuteStatusLoadResultImpl(DataHolder dataholder)
        {
            yw = new Status(dataholder.getStatusCode());
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            NI = dataholder.c("external_game_id", 0, 0);
            NJ = dataholder.d("muted", 0, 0);
_L4:
            dataholder.close();
            return;
_L2:
            NI = null;
            NJ = false;
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

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void B(DataHolder dataholder)
        {
            yO.a(new GameMuteStatusLoadResultImpl(dataholder));
        }

        GameMuteStatusLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class GameSearchSuggestionsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void l(DataHolder dataholder)
        {
            yO.a(new LoadGameSearchSuggestionsResultImpl(dataholder));
        }

        GameSearchSuggestionsLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class GamesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void i(DataHolder dataholder)
        {
            yO.a(new LoadGamesResultImpl(dataholder));
        }

        GamesLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private static final class InboxCountResultImpl
        implements com.google.android.gms.games.Notifications.InboxCountResult
    {

        private final Bundle NK;
        private final Status yw;

        public Status getStatus()
        {
            return yw;
        }

        InboxCountResultImpl(Status status, Bundle bundle)
        {
            yw = status;
            NK = bundle;
        }
    }

    private final class InboxCountsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void f(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            yO.a(new InboxCountResultImpl(status, bundle));
        }

        InboxCountsLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
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

        final GamesClientImpl NB;
        private final OnInvitationReceivedListener NL;

        public void n(DataHolder dataholder)
        {
            InvitationBuffer invitationbuffer;
            invitationbuffer = new InvitationBuffer(dataholder);
            dataholder = null;
            if (invitationbuffer.getCount() > 0)
            {
                dataholder = (Invitation)((Invitation)invitationbuffer.get(0)).freeze();
            }
            invitationbuffer.close();
            if (dataholder != null)
            {
                NB.a(NB. new InvitationReceivedCallback(NL, dataholder));
            }
            return;
            dataholder;
            invitationbuffer.close();
            throw dataholder;
        }

        public void onInvitationRemoved(String s)
        {
            NB.a(NB. new InvitationRemovedCallback(NL, s));
        }

        InvitationReceivedBinderCallback(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            NB = GamesClientImpl.this;
            super();
            NL = oninvitationreceivedlistener;
        }
    }

    private final class InvitationReceivedCallback extends com.google.android.gms.internal.hc.b
    {

        final GamesClientImpl NB;
        private final Invitation NM;

        protected void b(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationReceived(NM);
        }

        protected void d(Object obj)
        {
            b((OnInvitationReceivedListener)obj);
        }

        protected void fp()
        {
        }

        InvitationReceivedCallback(OnInvitationReceivedListener oninvitationreceivedlistener, Invitation invitation)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, oninvitationreceivedlistener);
            NM = invitation;
        }
    }

    private final class InvitationRemovedCallback extends com.google.android.gms.internal.hc.b
    {

        final GamesClientImpl NB;
        private final String NN;

        protected void b(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationRemoved(NN);
        }

        protected void d(Object obj)
        {
            b((OnInvitationReceivedListener)obj);
        }

        protected void fp()
        {
        }

        InvitationRemovedCallback(OnInvitationReceivedListener oninvitationreceivedlistener, String s)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, oninvitationreceivedlistener);
            NN = s;
        }
    }

    private final class InvitationsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void m(DataHolder dataholder)
        {
            yO.a(new LoadInvitationsResultImpl(dataholder));
        }

        InvitationsLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class JoinedRoomCallback extends AbstractRoomCallback
    {

        final GamesClientImpl NB;

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onJoinedRoom(i1, room);
        }

        public JoinedRoomCallback(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            NB = GamesClientImpl.this;
            super(roomupdatelistener, dataholder);
        }
    }

    private static final class LeaderboardMetadataResultImpl extends b
        implements com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult
    {

        private final LeaderboardBuffer NO;

        public LeaderboardBuffer getLeaderboards()
        {
            return NO;
        }

        LeaderboardMetadataResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            NO = new LeaderboardBuffer(dataholder);
        }
    }

    private final class LeaderboardScoresLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void a(DataHolder dataholder, DataHolder dataholder1)
        {
            yO.a(new LoadScoresResultImpl(dataholder, dataholder1));
        }

        LeaderboardScoresLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class LeaderboardsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void e(DataHolder dataholder)
        {
            yO.a(new LeaderboardMetadataResultImpl(dataholder));
        }

        LeaderboardsLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
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

    private final class LeftRoomCallback extends com.google.android.gms.internal.hc.b
    {

        private final int CQ;
        final GamesClientImpl NB;
        private final String NP;

        public void a(RoomUpdateListener roomupdatelistener)
        {
            roomupdatelistener.onLeftRoom(CQ, NP);
        }

        public void d(Object obj)
        {
            a((RoomUpdateListener)obj);
        }

        protected void fp()
        {
        }

        LeftRoomCallback(RoomUpdateListener roomupdatelistener, int i1, String s)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, roomupdatelistener);
            CQ = i1;
            NP = s;
        }
    }

    private static final class LoadAchievementsResultImpl extends b
        implements com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult
    {

        private final AchievementBuffer NQ;

        public AchievementBuffer getAchievements()
        {
            return NQ;
        }

        LoadAchievementsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            NQ = new AchievementBuffer(dataholder);
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

    private static final class LoadEventResultImpl extends b
        implements com.google.android.gms.games.event.Events.LoadEventsResult
    {

        private final EventBuffer NR;

        public EventBuffer getEvents()
        {
            return NR;
        }

        LoadEventResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            NR = new EventBuffer(dataholder);
        }
    }

    private static final class LoadExtendedGamesResultImpl extends b
        implements com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult
    {

        private final ExtendedGameBuffer NS;

        LoadExtendedGamesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            NS = new ExtendedGameBuffer(dataholder);
        }
    }

    private static final class LoadGameInstancesResultImpl extends b
        implements com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult
    {

        private final GameInstanceBuffer NT;

        LoadGameInstancesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            NT = new GameInstanceBuffer(dataholder);
        }
    }

    private static final class LoadGameSearchSuggestionsResultImpl extends b
        implements com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult
    {

        LoadGameSearchSuggestionsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadGamesResultImpl extends b
        implements com.google.android.gms.games.GamesMetadata.LoadGamesResult
    {

        private final GameBuffer NU;

        public GameBuffer getGames()
        {
            return NU;
        }

        LoadGamesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            NU = new GameBuffer(dataholder);
        }
    }

    private static final class LoadInvitationsResultImpl extends b
        implements com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult
    {

        private final InvitationBuffer NV;

        public InvitationBuffer getInvitations()
        {
            return NV;
        }

        LoadInvitationsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            NV = new InvitationBuffer(dataholder);
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

        private final LoadMatchesResponse NW;
        private final Status yw;

        public LoadMatchesResponse getMatches()
        {
            return NW;
        }

        public Status getStatus()
        {
            return yw;
        }

        public void release()
        {
            NW.close();
        }

        LoadMatchesResultImpl(Status status, Bundle bundle)
        {
            yw = status;
            NW = new LoadMatchesResponse(bundle);
        }
    }

    private static final class LoadOwnerCoverPhotoUrisResultImpl
        implements com.google.android.gms.games.Players.LoadOwnerCoverPhotoUrisResult
    {

        private final Bundle HJ;
        private final Status yw;

        public Status getStatus()
        {
            return yw;
        }

        LoadOwnerCoverPhotoUrisResultImpl(int i1, Bundle bundle)
        {
            yw = new Status(i1);
            HJ = bundle;
        }
    }

    private static final class LoadPlayerScoreResultImpl extends b
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult
    {

        private final LeaderboardScoreEntity NX = null;

        public LeaderboardScore getScore()
        {
            return NX;
        }

        LoadPlayerScoreResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new LeaderboardScoreBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            NX = (LeaderboardScoreEntity)dataholder.get(0).freeze();
_L4:
            dataholder.close();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private static final class LoadPlayersResultImpl extends b
        implements com.google.android.gms.games.Players.LoadPlayersResult
    {

        private final PlayerBuffer NY;

        public PlayerBuffer getPlayers()
        {
            return NY;
        }

        LoadPlayersResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            NY = new PlayerBuffer(dataholder);
        }
    }

    private static final class LoadQuestsResultImpl extends b
        implements com.google.android.gms.games.quest.Quests.LoadQuestsResult
    {

        private final DataHolder DD;

        public QuestBuffer getQuests()
        {
            return new QuestBuffer(DD);
        }

        LoadQuestsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            DD = dataholder;
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

        private final Bundle NZ;
        private final Status yw;

        public GameRequestBuffer getRequests(int i1)
        {
            String s = RequestType.cm(i1);
            if (!NZ.containsKey(s))
            {
                return null;
            } else
            {
                return new GameRequestBuffer((DataHolder)NZ.get(s));
            }
        }

        public Status getStatus()
        {
            return yw;
        }

        public void release()
        {
            Iterator iterator = NZ.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                obj = (DataHolder)NZ.getParcelable(((String) (obj)));
                if (obj != null)
                {
                    ((DataHolder) (obj)).close();
                }
            } while (true);
        }

        LoadRequestsResultImpl(Status status, Bundle bundle)
        {
            yw = status;
            NZ = bundle;
        }
    }

    private static final class LoadScoresResultImpl extends b
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    {

        private final LeaderboardEntity Oa = null;
        private final LeaderboardScoreBuffer Ob;

        public Leaderboard getLeaderboard()
        {
            return Oa;
        }

        public LeaderboardScoreBuffer getScores()
        {
            return Ob;
        }

        LoadScoresResultImpl(DataHolder dataholder, DataHolder dataholder1)
        {
            super(dataholder1);
            dataholder = new LeaderboardBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            Oa = (LeaderboardEntity)((Leaderboard)dataholder.get(0)).freeze();
_L4:
            dataholder.close();
            Ob = new LeaderboardScoreBuffer(dataholder1);
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            dataholder1;
            dataholder.close();
            throw dataholder1;
        }
    }

    private static final class LoadSnapshotsResultImpl extends b
        implements com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult
    {

        public SnapshotMetadataBuffer getSnapshots()
        {
            return new SnapshotMetadataBuffer(DD);
        }

        LoadSnapshotsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadXpForGameCategoriesResultImpl
        implements com.google.android.gms.games.Players.LoadXpForGameCategoriesResult
    {

        private final List Oc;
        private final Bundle Od;
        private final Status yw;

        public Status getStatus()
        {
            return yw;
        }

        LoadXpForGameCategoriesResultImpl(Status status, Bundle bundle)
        {
            yw = status;
            Oc = bundle.getStringArrayList("game_category_list");
            Od = bundle;
        }
    }

    private static final class LoadXpStreamResultImpl extends b
        implements com.google.android.gms.games.Players.LoadXpStreamResult
    {

        private final ExperienceEventBuffer Oe;

        LoadXpStreamResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            Oe = new ExperienceEventBuffer(dataholder);
        }
    }

    private final class MatchRemovedCallback extends com.google.android.gms.internal.hc.b
    {

        final GamesClientImpl NB;
        private final String Of;

        protected void b(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchRemoved(Of);
        }

        protected void d(Object obj)
        {
            b((OnTurnBasedMatchUpdateReceivedListener)obj);
        }

        protected void fp()
        {
        }

        MatchRemovedCallback(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener, String s)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, onturnbasedmatchupdatereceivedlistener);
            Of = s;
        }
    }

    private final class MatchUpdateReceivedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final OnTurnBasedMatchUpdateReceivedListener Og;

        public void onTurnBasedMatchRemoved(String s)
        {
            NB.a(NB. new MatchRemovedCallback(Og, s));
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
            turnbasedmatchbuffer.close();
            if (dataholder != null)
            {
                NB.a(NB. new MatchUpdateReceivedCallback(Og, dataholder));
            }
            return;
            dataholder;
            turnbasedmatchbuffer.close();
            throw dataholder;
        }

        MatchUpdateReceivedBinderCallback(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            NB = GamesClientImpl.this;
            super();
            Og = onturnbasedmatchupdatereceivedlistener;
        }
    }

    private final class MatchUpdateReceivedCallback extends com.google.android.gms.internal.hc.b
    {

        final GamesClientImpl NB;
        private final TurnBasedMatch Oh;

        protected void b(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchReceived(Oh);
        }

        protected void d(Object obj)
        {
            b((OnTurnBasedMatchUpdateReceivedListener)obj);
        }

        protected void fp()
        {
        }

        MatchUpdateReceivedCallback(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener, TurnBasedMatch turnbasedmatch)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, onturnbasedmatchupdatereceivedlistener);
            Oh = turnbasedmatch;
        }
    }

    private final class MessageReceivedCallback extends com.google.android.gms.internal.hc.b
    {

        final GamesClientImpl NB;
        private final RealTimeMessage Oi;

        public void a(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            if (realtimemessagereceivedlistener != null)
            {
                realtimemessagereceivedlistener.onRealTimeMessageReceived(Oi);
            }
        }

        public void d(Object obj)
        {
            a((RealTimeMessageReceivedListener)obj);
        }

        protected void fp()
        {
        }

        MessageReceivedCallback(RealTimeMessageReceivedListener realtimemessagereceivedlistener, RealTimeMessage realtimemessage)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, realtimemessagereceivedlistener);
            Oi = realtimemessage;
        }
    }

    private final class NotifyAclLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void C(DataHolder dataholder)
        {
            yO.a(new LoadAclResultImpl(dataholder));
        }

        NotifyAclLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class NotifyAclUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void cd(int i1)
        {
            yO.a(new Status(i1));
        }

        NotifyAclUpdatedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private static final class OpenSnapshotResultImpl extends b
        implements com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    {

        private final Snapshot Oj;
        private final String Ok;
        private final Snapshot Ol;
        private final Contents Om;

        public String getConflictId()
        {
            return Ok;
        }

        public Snapshot getConflictingSnapshot()
        {
            return Ol;
        }

        public Contents getResolutionContents()
        {
            return Om;
        }

        public Snapshot getSnapshot()
        {
            return Oj;
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
            Oj = null;
            Ol = null;
_L3:
            snapshotmetadatabuffer.close();
            Ok = s;
            Om = contents2;
            return;
_L2:
            if (snapshotmetadatabuffer.getCount() != 1)
            {
                break MISSING_BLOCK_LABEL_124;
            }
            if (dataholder.getStatusCode() == 4004)
            {
                flag = false;
            }
            gy.A(flag);
            Oj = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), contents);
            Ol = null;
              goto _L3
            dataholder;
            snapshotmetadatabuffer.close();
            throw dataholder;
            Oj = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), contents);
            Ol = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(1)), contents1);
              goto _L3
        }
    }

    private final class OwnerCoverPhotoUrisLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void d(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            yO.a(new LoadOwnerCoverPhotoUrisResultImpl(i1, bundle));
        }

        OwnerCoverPhotoUrisLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class P2PConnectedCallback extends com.google.android.gms.internal.hc.b
    {

        final GamesClientImpl NB;
        private final String On;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            if (roomstatusupdatelistener != null)
            {
                roomstatusupdatelistener.onP2PConnected(On);
            }
        }

        public void d(Object obj)
        {
            a((RoomStatusUpdateListener)obj);
        }

        protected void fp()
        {
        }

        P2PConnectedCallback(RoomStatusUpdateListener roomstatusupdatelistener, String s)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, roomstatusupdatelistener);
            On = s;
        }
    }

    private final class P2PDisconnectedCallback extends com.google.android.gms.internal.hc.b
    {

        final GamesClientImpl NB;
        private final String On;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            if (roomstatusupdatelistener != null)
            {
                roomstatusupdatelistener.onP2PDisconnected(On);
            }
        }

        public void d(Object obj)
        {
            a((RoomStatusUpdateListener)obj);
        }

        protected void fp()
        {
        }

        P2PDisconnectedCallback(RoomStatusUpdateListener roomstatusupdatelistener, String s)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, roomstatusupdatelistener);
            On = s;
        }
    }

    private final class PeerConnectedCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl NB;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersConnected(room, arraylist);
        }

        PeerConnectedCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            NB = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    private final class PeerDeclinedCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl NB;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerDeclined(room, arraylist);
        }

        PeerDeclinedCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            NB = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    private final class PeerDisconnectedCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl NB;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersDisconnected(room, arraylist);
        }

        PeerDisconnectedCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            NB = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    private final class PeerInvitedToRoomCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl NB;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerInvitedToRoom(room, arraylist);
        }

        PeerInvitedToRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            NB = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    private final class PeerJoinedRoomCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl NB;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerJoined(room, arraylist);
        }

        PeerJoinedRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            NB = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    private final class PeerLeftRoomCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl NB;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerLeft(room, arraylist);
        }

        PeerLeftRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            NB = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    private final class PlayerLeaderboardScoreLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void E(DataHolder dataholder)
        {
            yO.a(new LoadPlayerScoreResultImpl(dataholder));
        }

        PlayerLeaderboardScoreLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class PlayerXpForGameCategoriesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void e(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            yO.a(new LoadXpForGameCategoriesResultImpl(status, bundle));
        }

        PlayerXpForGameCategoriesLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    final class PlayerXpStreamLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void P(DataHolder dataholder)
        {
            yO.a(new LoadXpStreamResultImpl(dataholder));
        }

        PlayerXpStreamLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class PlayersLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void g(DataHolder dataholder)
        {
            yO.a(new LoadPlayersResultImpl(dataholder));
        }

        public void h(DataHolder dataholder)
        {
            yO.a(new LoadPlayersResultImpl(dataholder));
        }

        PlayersLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class QuestAcceptedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d Oo;

        public void L(DataHolder dataholder)
        {
            Oo.a(new AcceptQuestResultImpl(dataholder));
        }

        public QuestAcceptedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            Oo = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class QuestCompletedCallback extends com.google.android.gms.internal.hc.b
    {

        final GamesClientImpl NB;
        private final Quest ND;

        protected void b(QuestUpdateListener questupdatelistener)
        {
            questupdatelistener.onQuestCompleted(ND);
        }

        protected void d(Object obj)
        {
            b((QuestUpdateListener)obj);
        }

        protected void fp()
        {
        }

        QuestCompletedCallback(QuestUpdateListener questupdatelistener, Quest quest)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, questupdatelistener);
            ND = quest;
        }
    }

    private final class QuestMilestoneClaimBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d Op;
        private final String Oq;

        public void K(DataHolder dataholder)
        {
            Op.a(new ClaimMilestoneResultImpl(dataholder, Oq));
        }

        public QuestMilestoneClaimBinderCallbacks(com.google.android.gms.common.api.a.d d1, String s)
        {
            NB = GamesClientImpl.this;
            super();
            Op = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
            Oq = (String)com.google.android.gms.internal.hn.b(s, "MilestoneId must not be null");
        }
    }

    private final class QuestUpdateBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final QuestUpdateListener Or;

        private Quest R(DataHolder dataholder)
        {
            QuestBuffer questbuffer;
            questbuffer = new QuestBuffer(dataholder);
            dataholder = null;
            if (questbuffer.getCount() > 0)
            {
                dataholder = (Quest)((Quest)questbuffer.get(0)).freeze();
            }
            questbuffer.close();
            return dataholder;
            dataholder;
            questbuffer.close();
            throw dataholder;
        }

        public void M(DataHolder dataholder)
        {
            dataholder = R(dataholder);
            if (dataholder != null)
            {
                NB.a(NB. new QuestCompletedCallback(Or, dataholder));
            }
        }

        QuestUpdateBinderCallback(QuestUpdateListener questupdatelistener)
        {
            NB = GamesClientImpl.this;
            super();
            Or = questupdatelistener;
        }
    }

    private final class QuestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d Os;

        public void O(DataHolder dataholder)
        {
            Os.a(new LoadQuestsResultImpl(dataholder));
        }

        public QuestsLoadedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            Os = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class RealTimeMessageSentCallback extends com.google.android.gms.internal.hc.b
    {

        private final int CQ;
        final GamesClientImpl NB;
        private final String Ot;
        private final int Ou;

        public void a(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback)
        {
            if (reliablemessagesentcallback != null)
            {
                reliablemessagesentcallback.onRealTimeMessageSent(CQ, Ou, Ot);
            }
        }

        public void d(Object obj)
        {
            a((com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback)obj);
        }

        protected void fp()
        {
        }

        RealTimeMessageSentCallback(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback, int i1, int j1, String s)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, reliablemessagesentcallback);
            CQ = i1;
            Ou = j1;
            Ot = s;
        }
    }

    private final class RealTimeReliableMessageBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        final com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback Ov;

        public void b(int i1, int j1, String s)
        {
            NB.a(NB. new RealTimeMessageSentCallback(Ov, i1, j1, s));
        }

        public RealTimeReliableMessageBinderCallbacks(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback)
        {
            NB = GamesClientImpl.this;
            super();
            Ov = reliablemessagesentcallback;
        }
    }

    private final class RequestReceivedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final OnRequestReceivedListener Ow;

        public void o(DataHolder dataholder)
        {
            GameRequestBuffer gamerequestbuffer;
            gamerequestbuffer = new GameRequestBuffer(dataholder);
            dataholder = null;
            if (gamerequestbuffer.getCount() > 0)
            {
                dataholder = (GameRequest)((GameRequest)gamerequestbuffer.get(0)).freeze();
            }
            gamerequestbuffer.close();
            if (dataholder != null)
            {
                NB.a(NB. new RequestReceivedCallback(Ow, dataholder));
            }
            return;
            dataholder;
            gamerequestbuffer.close();
            throw dataholder;
        }

        public void onRequestRemoved(String s)
        {
            NB.a(NB. new RequestRemovedCallback(Ow, s));
        }

        RequestReceivedBinderCallback(OnRequestReceivedListener onrequestreceivedlistener)
        {
            NB = GamesClientImpl.this;
            super();
            Ow = onrequestreceivedlistener;
        }
    }

    private final class RequestReceivedCallback extends com.google.android.gms.internal.hc.b
    {

        final GamesClientImpl NB;
        private final GameRequest Ox;

        protected void b(OnRequestReceivedListener onrequestreceivedlistener)
        {
            onrequestreceivedlistener.onRequestReceived(Ox);
        }

        protected void d(Object obj)
        {
            b((OnRequestReceivedListener)obj);
        }

        protected void fp()
        {
        }

        RequestReceivedCallback(OnRequestReceivedListener onrequestreceivedlistener, GameRequest gamerequest)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, onrequestreceivedlistener);
            Ox = gamerequest;
        }
    }

    private final class RequestRemovedCallback extends com.google.android.gms.internal.hc.b
    {

        final GamesClientImpl NB;
        private final String Oy;

        protected void b(OnRequestReceivedListener onrequestreceivedlistener)
        {
            onrequestreceivedlistener.onRequestRemoved(Oy);
        }

        protected void d(Object obj)
        {
            b((OnRequestReceivedListener)obj);
        }

        protected void fp()
        {
        }

        RequestRemovedCallback(OnRequestReceivedListener onrequestreceivedlistener, String s)
        {
            NB = GamesClientImpl.this;
            super(GamesClientImpl.this, onrequestreceivedlistener);
            Oy = s;
        }
    }

    private final class RequestSentBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d Oz;

        public void G(DataHolder dataholder)
        {
            Oz.a(new SendRequestResultImpl(dataholder));
        }

        public RequestSentBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            Oz = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class RequestSummariesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d OA;

        public void H(DataHolder dataholder)
        {
            OA.a(new LoadRequestSummariesResultImpl(dataholder));
        }

        public RequestSummariesLoadedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            OA = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class RequestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d OB;

        public void c(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            OB.a(new LoadRequestsResultImpl(status, bundle));
        }

        public RequestsLoadedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            OB = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class RequestsUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d OC;

        public void F(DataHolder dataholder)
        {
            OC.a(new UpdateRequestsResultImpl(dataholder));
        }

        public RequestsUpdatedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            OC = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class RoomAutoMatchingCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl NB;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomAutoMatching(room);
        }

        RoomAutoMatchingCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            NB = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
        }
    }

    private final class RoomBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final RoomUpdateListener OD;
        private final RoomStatusUpdateListener OE;
        private final RealTimeMessageReceivedListener OF;

        public void A(DataHolder dataholder)
        {
            NB.a(NB. new DisconnectedFromRoomCallback(OE, dataholder));
        }

        public void a(DataHolder dataholder, String as[])
        {
            NB.a(NB. new PeerInvitedToRoomCallback(OE, dataholder, as));
        }

        public void b(DataHolder dataholder, String as[])
        {
            NB.a(NB. new PeerJoinedRoomCallback(OE, dataholder, as));
        }

        public void c(DataHolder dataholder, String as[])
        {
            NB.a(NB. new PeerLeftRoomCallback(OE, dataholder, as));
        }

        public void d(DataHolder dataholder, String as[])
        {
            NB.a(NB. new PeerDeclinedCallback(OE, dataholder, as));
        }

        public void e(DataHolder dataholder, String as[])
        {
            NB.a(NB. new PeerConnectedCallback(OE, dataholder, as));
        }

        public void f(DataHolder dataholder, String as[])
        {
            NB.a(NB. new PeerDisconnectedCallback(OE, dataholder, as));
        }

        public void onLeftRoom(int i1, String s)
        {
            NB.a(NB. new LeftRoomCallback(OD, i1, s));
        }

        public void onP2PConnected(String s)
        {
            NB.a(NB. new P2PConnectedCallback(OE, s));
        }

        public void onP2PDisconnected(String s)
        {
            NB.a(NB. new P2PDisconnectedCallback(OE, s));
        }

        public void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
        {
            NB.a(NB. new MessageReceivedCallback(OF, realtimemessage));
        }

        public void u(DataHolder dataholder)
        {
            NB.a(NB. new RoomCreatedCallback(OD, dataholder));
        }

        public void v(DataHolder dataholder)
        {
            NB.a(NB. new JoinedRoomCallback(OD, dataholder));
        }

        public void w(DataHolder dataholder)
        {
            NB.a(NB. new RoomConnectingCallback(OE, dataholder));
        }

        public void x(DataHolder dataholder)
        {
            NB.a(NB. new RoomAutoMatchingCallback(OE, dataholder));
        }

        public void y(DataHolder dataholder)
        {
            NB.a(NB. new RoomConnectedCallback(OD, dataholder));
        }

        public void z(DataHolder dataholder)
        {
            NB.a(NB. new ConnectedToRoomCallback(OE, dataholder));
        }

        public RoomBinderCallbacks(RoomUpdateListener roomupdatelistener)
        {
            NB = GamesClientImpl.this;
            super();
            OD = (RoomUpdateListener)com.google.android.gms.internal.hn.b(roomupdatelistener, "Callbacks must not be null");
            OE = null;
            OF = null;
        }

        public RoomBinderCallbacks(RoomUpdateListener roomupdatelistener, RoomStatusUpdateListener roomstatusupdatelistener, RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            NB = GamesClientImpl.this;
            super();
            OD = (RoomUpdateListener)com.google.android.gms.internal.hn.b(roomupdatelistener, "Callbacks must not be null");
            OE = roomstatusupdatelistener;
            OF = realtimemessagereceivedlistener;
        }
    }

    private final class RoomConnectedCallback extends AbstractRoomCallback
    {

        final GamesClientImpl NB;

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onRoomConnected(i1, room);
        }

        RoomConnectedCallback(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            NB = GamesClientImpl.this;
            super(roomupdatelistener, dataholder);
        }
    }

    private final class RoomConnectingCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl NB;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomConnecting(room);
        }

        RoomConnectingCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            NB = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
        }
    }

    private final class RoomCreatedCallback extends AbstractRoomCallback
    {

        final GamesClientImpl NB;

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onRoomCreated(i1, room);
        }

        public RoomCreatedCallback(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            NB = GamesClientImpl.this;
            super(roomupdatelistener, dataholder);
        }
    }

    private static final class SendRequestResultImpl extends b
        implements com.google.android.gms.games.request.Requests.SendRequestResult
    {

        private final GameRequest Ox = null;

        SendRequestResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new GameRequestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            Ox = (GameRequest)((GameRequest)dataholder.get(0)).freeze();
_L4:
            dataholder.close();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private final class SignOutCompleteBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void dO()
        {
            Status status = new Status(0);
            yO.a(status);
        }

        public SignOutCompleteBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class SnapshotCommittedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d OG;

        public void J(DataHolder dataholder)
        {
            OG.a(new CommitSnapshotResultImpl(dataholder));
        }

        public SnapshotCommittedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            OG = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    final class SnapshotDeletedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void g(int i1, String s)
        {
            yO.a(new DeleteSnapshotResultImpl(i1, s));
        }

        public SnapshotDeletedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class SnapshotOpenedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d OH;

        public void a(DataHolder dataholder, Contents contents)
        {
            OH.a(new OpenSnapshotResultImpl(dataholder, contents));
        }

        public void a(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
        {
            OH.a(new OpenSnapshotResultImpl(dataholder, s, contents, contents1, contents2));
        }

        public SnapshotOpenedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            OH = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class SnapshotsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d OI;

        public void I(DataHolder dataholder)
        {
            OI.a(new LoadSnapshotsResultImpl(dataholder));
        }

        public SnapshotsLoadedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            OI = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class SubmitScoreBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d yO;

        public void f(DataHolder dataholder)
        {
            yO.a(new SubmitScoreResultImpl(dataholder));
        }

        public SubmitScoreBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            yO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private static final class SubmitScoreResultImpl extends b
        implements com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult
    {

        private final ScoreSubmissionData OJ;

        public ScoreSubmissionData getScoreData()
        {
            return OJ;
        }

        public SubmitScoreResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            OJ = new ScoreSubmissionData(dataholder);
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

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d OK;

        public void f(int i1, String s)
        {
            Status status = new Status(i1);
            OK.a(new CancelMatchResultImpl(status, s));
        }

        public TurnBasedMatchCanceledBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            OK = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class TurnBasedMatchInitiatedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d OL;

        public void q(DataHolder dataholder)
        {
            OL.a(new InitiateMatchResultImpl(dataholder));
        }

        public TurnBasedMatchInitiatedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            OL = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class TurnBasedMatchLeftBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d OM;

        public void s(DataHolder dataholder)
        {
            OM.a(new LeaveMatchResultImpl(dataholder));
        }

        public TurnBasedMatchLeftBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            OM = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class TurnBasedMatchLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d ON;

        public void p(DataHolder dataholder)
        {
            ON.a(new LoadMatchResultImpl(dataholder));
        }

        public TurnBasedMatchLoadedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            ON = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private static abstract class TurnBasedMatchResult extends b
    {

        final TurnBasedMatch Oh = null;

        public TurnBasedMatch getMatch()
        {
            return Oh;
        }

        TurnBasedMatchResult(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new TurnBasedMatchBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            Oh = (TurnBasedMatch)((TurnBasedMatch)dataholder.get(0)).freeze();
_L4:
            dataholder.close();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private final class TurnBasedMatchUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d OO;

        public void r(DataHolder dataholder)
        {
            OO.a(new UpdateMatchResultImpl(dataholder));
        }

        public TurnBasedMatchUpdatedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            OO = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private final class TurnBasedMatchesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl NB;
        private final com.google.android.gms.common.api.a.d OP;

        public void b(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            OP.a(new LoadMatchesResultImpl(status, bundle));
        }

        public TurnBasedMatchesLoadedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            NB = GamesClientImpl.this;
            super();
            OP = (com.google.android.gms.common.api.a.d)com.google.android.gms.internal.hn.b(d1, "Holder must not be null");
        }
    }

    private static final class UpdateAchievementResultImpl
        implements com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult
    {

        private final String OQ;
        private final Status yw;

        public String getAchievementId()
        {
            return OQ;
        }

        public Status getStatus()
        {
            return yw;
        }

        UpdateAchievementResultImpl(int i1, String s)
        {
            yw = new Status(i1);
            OQ = s;
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

        private final RequestUpdateOutcomes OR;

        public Set getRequestIds()
        {
            return OR.getRequestIds();
        }

        public int getRequestOutcome(String s)
        {
            return OR.getRequestOutcome(s);
        }

        UpdateRequestsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            OR = RequestUpdateOutcomes.U(dataholder);
        }
    }


    private final String NA;
    EventIncrementManager Nm;
    private final String Nn;
    private final Map No = new HashMap();
    private PlayerEntity Np;
    private GameEntity Nq;
    private final PopupManager Nr;
    private boolean Ns;
    private boolean Nt;
    private int Nu;
    private final Binder Nv = new Binder();
    private final long Nw = (long)hashCode();
    private final boolean Nx;
    private final int Ny;
    private final boolean Nz;
    private final String yN;

    public GamesClientImpl(Context context, Looper looper, String s, String s1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[], 
            int i1, View view, boolean flag, boolean flag1, int j1, boolean flag2, int k1, 
            String s2)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        Nm = new EventIncrementManager() {

            final GamesClientImpl NB;

            public EventIncrementCache hs()
            {
                return NB. new GameClientEventIncrementCache();
            }

            
            {
                NB = GamesClientImpl.this;
                super();
            }
        };
        Ns = false;
        Nt = false;
        Nn = s;
        yN = (String)com.google.android.gms.internal.hn.f(s1);
        Nr = com.google.android.gms.games.internal.PopupManager.a(this, i1);
        f(view);
        Nt = flag1;
        Nu = j1;
        Nx = flag;
        Nz = flag2;
        Ny = k1;
        NA = s2;
        registerConnectionCallbacks(this);
        registerConnectionFailedListener(this);
    }

    private Room Q(DataHolder dataholder)
    {
        RoomBuffer roombuffer;
        roombuffer = new RoomBuffer(dataholder);
        dataholder = null;
        if (roombuffer.getCount() > 0)
        {
            dataholder = (Room)((Room)roombuffer.get(0)).freeze();
        }
        roombuffer.close();
        return dataholder;
        dataholder;
        roombuffer.close();
        throw dataholder;
    }

    static Room a(GamesClientImpl gamesclientimpl, DataHolder dataholder)
    {
        return gamesclientimpl.Q(dataholder);
    }

    private RealTimeSocket aT(String s)
    {
        Object obj;
        LocalSocket localsocket;
        try
        {
            obj = ((IGamesService)fo()).bb(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.k("GamesClientImpl", "Unable to create socket. Service died.");
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        GamesLog.i("GamesClientImpl", "Created native libjingle socket.");
        obj = new LibjingleNativeSocket(((android.os.ParcelFileDescriptor) (obj)));
        No.put(s, obj);
        return ((RealTimeSocket) (obj));
        GamesLog.i("GamesClientImpl", "Unable to create native libjingle socket, resorting to old socket.");
        obj = ((IGamesService)fo()).aW(s);
        if (obj == null)
        {
            return null;
        }
        localsocket = new LocalSocket();
        localsocket.connect(new LocalSocketAddress(((String) (obj))));
        obj = new RealTimeSocketImpl(localsocket, s);
        No.put(s, obj);
        return ((RealTimeSocket) (obj));
        s;
        GamesLog.k("GamesClientImpl", (new StringBuilder()).append("connect() call failed on socket: ").append(s.getMessage()).toString());
        return null;
    }

    private void gT()
    {
        Np = null;
    }

    private void hq()
    {
        for (Iterator iterator = No.values().iterator(); iterator.hasNext();)
        {
            RealTimeSocket realtimesocket = (RealTimeSocket)iterator.next();
            try
            {
                realtimesocket.close();
            }
            catch (IOException ioexception)
            {
                com.google.android.gms.games.internal.GamesLog.b("GamesClientImpl", "IOException:", ioexception);
            }
        }

        No.clear();
    }

    public int a(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback, byte abyte0[], String s, String s1)
    {
        int i1;
        try
        {
            i1 = ((IGamesService)fo()).a(new RealTimeReliableMessageBinderCallbacks(reliablemessagesentcallback), abyte0, s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public int a(byte abyte0[], String s, String as[])
    {
        com.google.android.gms.internal.hn.b(as, "Participant IDs must not be null");
        int i1;
        try
        {
            i1 = ((IGamesService)fo()).b(abyte0, s, as);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.j("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public Intent a(int i1, int j1, boolean flag)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)fo()).a(i1, j1, flag);
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent a(int i1, byte abyte0[], int j1, Bitmap bitmap, String s)
    {
        try
        {
            abyte0 = ((IGamesService)fo()).a(i1, abyte0, j1, s);
            com.google.android.gms.internal.hn.b(bitmap, "Must provide a non null icon");
            abyte0.putExtra("com.google.android.gms.games.REQUEST_ITEM_ICON", bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return abyte0;
    }

    public Intent a(Room room, int i1)
    {
        try
        {
            room = ((IGamesService)fo()).a((RoomEntity)room.freeze(), i1);
        }
        // Misplaced declaration of an exception variable
        catch (Room room)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return room;
    }

    public Intent a(String s, boolean flag, boolean flag1, int i1)
    {
        try
        {
            s = ((IGamesService)fo()).a(s, flag, flag1, i1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public Intent a(int ai[])
    {
        try
        {
            ai = ((IGamesService)fo()).a(ai);
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return ai;
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle)
    {
        if (i1 == 0 && bundle != null)
        {
            Ns = bundle.getBoolean("show_welcome_popup");
        }
        super.a(i1, ibinder, bundle);
    }

    public void a(IBinder ibinder, Bundle bundle)
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        ((IGamesService)fo()).a(ibinder, bundle);
        return;
        ibinder;
        GamesLog.j("GamesClientImpl", "service died");
        return;
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i1, int j1, int k1)
    {
        try
        {
            ((IGamesService)fo()).a(new RequestsLoadedBinderCallbacks(d1), i1, j1, k1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i1, int j1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)fo()).a(new ExtendedGamesLoadedBinderCallback(d1), i1, j1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)fo()).a(new PlayersLoadedBinderCallback(d1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i1, int ai[])
    {
        try
        {
            ((IGamesService)fo()).a(new TurnBasedMatchesLoadedBinderCallbacks(d1), i1, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, LeaderboardScoreBuffer leaderboardscorebuffer, int i1, int j1)
    {
        try
        {
            ((IGamesService)fo()).a(new LeaderboardScoresLoadedBinderCallback(d1), leaderboardscorebuffer.iv().iw(), i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, TurnBasedMatchConfig turnbasedmatchconfig)
    {
        try
        {
            ((IGamesService)fo()).a(new TurnBasedMatchInitiatedBinderCallbacks(d1), turnbasedmatchconfig.getVariant(), turnbasedmatchconfig.iC(), turnbasedmatchconfig.getInvitedPlayerIds(), turnbasedmatchconfig.getAutoMatchCriteria());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, Snapshot snapshot, SnapshotMetadataChange snapshotmetadatachange)
    {
        Contents contents = snapshot.getContents();
        com.google.android.gms.internal.hn.b(contents, "Must provide a previously opened Snapshot");
        a a1 = snapshotmetadatachange.iI();
        if (a1 != null)
        {
            a1.a(getContext().getCacheDir());
        }
        snapshot.iH();
        try
        {
            ((IGamesService)fo()).a(new SnapshotCommittedBinderCallbacks(d1), snapshot.getMetadata().getSnapshotId(), snapshotmetadatachange, contents);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).a(new PlayersLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, int i1)
    {
        if (d1 != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        d1 = null;
_L1:
        try
        {
            ((IGamesService)fo()).a(d1, s, i1, Nr.hI(), Nr.hH());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_59;
        d1 = new AchievementUpdatedBinderCallback(d1);
          goto _L1
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).a(new LeaderboardScoresLoadedBinderCallback(d1), s, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).a(new PlayersLoadedBinderCallback(d1), s, i1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1)
    {
        if (!s.equals("played_with"))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid player collection: ").append(s).toString());
        }
        try
        {
            ((IGamesService)fo()).d(new PlayersLoadedBinderCallback(d1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        try
        {
            ((IGamesService)fo()).a(new ExtendedGamesLoadedBinderCallback(d1), s, i1, flag, flag1, flag2, flag3);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, int i1, int ai[])
    {
        try
        {
            ((IGamesService)fo()).a(new TurnBasedMatchesLoadedBinderCallbacks(d1), s, i1, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, long l1, String s1)
    {
        if (d1 != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        d1 = null;
_L1:
        try
        {
            ((IGamesService)fo()).a(d1, s, l1, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_47;
        d1 = new SubmitScoreBinderCallbacks(d1);
          goto _L1
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1)
    {
        try
        {
            ((IGamesService)fo()).c(new TurnBasedMatchLeftBinderCallbacks(d1), s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, int i1, int j1)
    {
        try
        {
            ((IGamesService)fo()).a(new PlayerLeaderboardScoreLoadedBinderCallback(d1), s, s1, i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, int i1, int j1, int k1)
    {
        try
        {
            ((IGamesService)fo()).a(new RequestsLoadedBinderCallbacks(d1), s, s1, i1, j1, k1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).a(new LeaderboardScoresLoadedBinderCallback(d1), s, s1, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, int i1, boolean flag, boolean flag1)
    {
        if (!s.equals("played_with") && !s.equals("circled"))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid player collection: ").append(s).toString());
        }
        try
        {
            ((IGamesService)fo()).a(new PlayersLoadedBinderCallback(d1), s, s1, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, Contents contents)
    {
        a a1 = snapshotmetadatachange.iI();
        if (a1 != null)
        {
            a1.a(getContext().getCacheDir());
        }
        try
        {
            ((IGamesService)fo()).a(new SnapshotOpenedBinderCallbacks(d1), s, s1, snapshotmetadatachange, contents);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).b(new LeaderboardsLoadedBinderCallback(d1), s, s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, boolean flag, String as[])
    {
        try
        {
            ((IGamesService)fo()).a(new QuestsLoadedBinderCallbacks(d1), s, s1, as, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, int ai[], int i1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).a(new QuestsLoadedBinderCallbacks(d1), s, s1, ai, i1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, String as[])
    {
        try
        {
            ((IGamesService)fo()).a(new RequestsUpdatedBinderCallbacks(d1), s, s1, as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).c(new LeaderboardsLoadedBinderCallback(d1), s, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[])
    {
        try
        {
            ((IGamesService)fo()).a(new TurnBasedMatchUpdatedBinderCallbacks(d1), s, abyte0, s1, aparticipantresult);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, byte abyte0[], ParticipantResult aparticipantresult[])
    {
        try
        {
            ((IGamesService)fo()).a(new TurnBasedMatchUpdatedBinderCallbacks(d1), s, abyte0, aparticipantresult);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String as[], int i1, byte abyte0[], int j1)
    {
        try
        {
            ((IGamesService)fo()).a(new RequestSentBinderCallbacks(d1), s, as, i1, abyte0, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).c(new PlayersLoadedBinderCallback(d1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, boolean flag, Bundle bundle)
    {
        try
        {
            ((IGamesService)fo()).a(new ContactSettingsUpdatedBinderCallback(d1), flag, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public transient void a(com.google.android.gms.common.api.a.d d1, boolean flag, String as[])
    {
        try
        {
            Nm.flush();
            ((IGamesService)fo()).a(new EventsLoadedBinderCallback(d1), flag, as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, int ai[], int i1, boolean flag)
    {
        try
        {
            Nm.flush();
            ((IGamesService)fo()).a(new QuestsLoadedBinderCallbacks(d1), ai, i1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String as[])
    {
        try
        {
            ((IGamesService)fo()).c(new PlayersLoadedBinderCallback(d1), as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        try
        {
            oninvitationreceivedlistener = new InvitationReceivedBinderCallback(oninvitationreceivedlistener);
            ((IGamesService)fo()).a(oninvitationreceivedlistener, Nw);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(RoomConfig roomconfig)
    {
        try
        {
            RoomBinderCallbacks roombindercallbacks = new RoomBinderCallbacks(roomconfig.getRoomUpdateListener(), roomconfig.getRoomStatusUpdateListener(), roomconfig.getMessageReceivedListener());
            ((IGamesService)fo()).a(roombindercallbacks, Nv, roomconfig.getVariant(), roomconfig.getInvitedPlayerIds(), roomconfig.getAutoMatchCriteria(), roomconfig.isSocketEnabled(), Nw);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomConfig roomconfig)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(RoomUpdateListener roomupdatelistener, String s)
    {
        try
        {
            ((IGamesService)fo()).c(new RoomBinderCallbacks(roomupdatelistener), s);
            hq();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomUpdateListener roomupdatelistener)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
    {
        try
        {
            onturnbasedmatchupdatereceivedlistener = new MatchUpdateReceivedBinderCallback(onturnbasedmatchupdatereceivedlistener);
            ((IGamesService)fo()).b(onturnbasedmatchupdatereceivedlistener, Nw);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(QuestUpdateListener questupdatelistener)
    {
        try
        {
            questupdatelistener = new QuestUpdateBinderCallback(questupdatelistener);
            ((IGamesService)fo()).d(questupdatelistener, Nw);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (QuestUpdateListener questupdatelistener)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(OnRequestReceivedListener onrequestreceivedlistener)
    {
        try
        {
            onrequestreceivedlistener = new RequestReceivedBinderCallback(onrequestreceivedlistener);
            ((IGamesService)fo()).c(onrequestreceivedlistener, Nw);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnRequestReceivedListener onrequestreceivedlistener)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void a(Snapshot snapshot)
    {
        Contents contents = snapshot.getContents();
        com.google.android.gms.internal.hn.b(contents, "Must provide a previously opened Snapshot");
        snapshot.iH();
        try
        {
            ((IGamesService)fo()).a(contents);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Snapshot snapshot)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    protected void a(hj hj1, com.google.android.gms.internal.hc.e e1)
        throws RemoteException
    {
        String s = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", Nx);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", Nt);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", Nu);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", Nz);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", Ny);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", NA);
        hj1.a(e1, 0x4d7808, getContext().getPackageName(), yN, fn(), Nn, Nr.hI(), s, bundle);
    }

    public Intent aR(String s)
    {
        try
        {
            s = ((IGamesService)fo()).aR(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public void aS(String s)
    {
        try
        {
            ((IGamesService)fo()).ba(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public Intent aU(String s)
    {
        try
        {
            s = ((IGamesService)fo()).aU(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    protected IGamesService ah(IBinder ibinder)
    {
        return IGamesService.Stub.aj(ibinder);
    }

    public Intent b(int i1, int j1, boolean flag)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)fo()).b(i1, j1, flag);
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public void b(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            Nm.flush();
            ((IGamesService)fo()).a(new SignOutCompleteBinderCallbacks(d1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)fo()).b(new PlayersLoadedBinderCallback(d1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s)
    {
        if (d1 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        d1 = null;
_L1:
        try
        {
            ((IGamesService)fo()).a(d1, s, Nr.hI(), Nr.hH());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_58;
        d1 = new AchievementUpdatedBinderCallback(d1);
          goto _L1
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, int i1)
    {
        if (d1 != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        d1 = null;
_L1:
        try
        {
            ((IGamesService)fo()).b(d1, s, i1, Nr.hI(), Nr.hH());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_59;
        d1 = new AchievementUpdatedBinderCallback(d1);
          goto _L1
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).b(new LeaderboardScoresLoadedBinderCallback(d1), s, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)fo()).a(new ExtendedGamesLoadedBinderCallback(d1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, String s1)
    {
        try
        {
            Nm.flush();
            ((IGamesService)fo()).f(new QuestMilestoneClaimBinderCallbacks(d1, s1), s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, String s1, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).b(new LeaderboardScoresLoadedBinderCallback(d1), s, s1, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).a(new AchievementsLoadedBinderCallback(d1), s, s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).e(new SnapshotOpenedBinderCallbacks(d1), s, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).b(new LeaderboardsLoadedBinderCallback(d1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, boolean flag, String as[])
    {
        try
        {
            ((IGamesService)fo()).a(new QuestsLoadedBinderCallbacks(d1), as, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String as[])
    {
        try
        {
            ((IGamesService)fo()).a(new RequestsUpdatedBinderCallbacks(d1), as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void b(RoomConfig roomconfig)
    {
        try
        {
            RoomBinderCallbacks roombindercallbacks = new RoomBinderCallbacks(roomconfig.getRoomUpdateListener(), roomconfig.getRoomStatusUpdateListener(), roomconfig.getMessageReceivedListener());
            ((IGamesService)fo()).a(roombindercallbacks, Nv, roomconfig.getInvitationId(), roomconfig.isSocketEnabled(), Nw);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomConfig roomconfig)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    protected transient void b(String as[])
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
            com.google.android.gms.internal.hn.a(flag1, "Cannot have both %s and %s!", new Object[] {
                "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"
            });
            return;
        } else
        {
            com.google.android.gms.internal.hn.a(flag1, "Games APIs requires %s to function.", new Object[] {
                "https://www.googleapis.com/auth/games"
            });
            return;
        }
    }

    protected String bp()
    {
        return "com.google.android.gms.games.service.START";
    }

    protected String bq()
    {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    public void c(com.google.android.gms.common.api.a.d d1, int i1)
    {
        try
        {
            ((IGamesService)fo()).a(new InvitationsLoadedBinderCallback(d1), i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)fo()).c(new PlayersLoadedBinderCallback(d1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, String s)
    {
        if (d1 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        d1 = null;
_L1:
        try
        {
            ((IGamesService)fo()).b(d1, s, Nr.hI(), Nr.hH());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_58;
        d1 = new AchievementUpdatedBinderCallback(d1);
          goto _L1
    }

    public void c(com.google.android.gms.common.api.a.d d1, String s, int i1)
    {
        try
        {
            ((IGamesService)fo()).b(new PlayerXpStreamLoadedBinderCallback(d1), s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)fo()).e(new ExtendedGamesLoadedBinderCallback(d1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, String s, String s1)
    {
        try
        {
            ((IGamesService)fo()).d(new TurnBasedMatchInitiatedBinderCallbacks(d1), s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, String s, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).c(new SnapshotsLoadedBinderCallbacks(d1), s, s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, String s, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).d(new LeaderboardsLoadedBinderCallback(d1), s, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).a(new AchievementsLoadedBinderCallback(d1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, String as[])
    {
        try
        {
            ((IGamesService)fo()).b(new RequestsUpdatedBinderCallbacks(d1), as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void cg(int i1)
    {
        Nr.setGravity(i1);
    }

    public void ch(int i1)
    {
        try
        {
            ((IGamesService)fo()).ch(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void connect()
    {
        gT();
        super.connect();
    }

    public int d(byte abyte0[], String s)
    {
        int i1;
        try
        {
            i1 = ((IGamesService)fo()).b(abyte0, s, null);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.j("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public void d(com.google.android.gms.common.api.a.d d1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)fo()).e(new PlayersLoadedBinderCallback(d1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).l(new TurnBasedMatchInitiatedBinderCallbacks(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.a.d d1, String s, int i1)
    {
        try
        {
            ((IGamesService)fo()).c(new PlayerXpStreamLoadedBinderCallback(d1), s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)fo()).f(new ExtendedGamesLoadedBinderCallback(d1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.a.d d1, String s, String s1)
    {
        try
        {
            ((IGamesService)fo()).e(new TurnBasedMatchInitiatedBinderCallbacks(d1), s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.a.d d1, String s, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).a(new GameMuteStatusChangedBinderCallback(d1), s, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.a.d d1, boolean flag)
    {
        try
        {
            Nm.flush();
            ((IGamesService)fo()).f(new EventsLoadedBinderCallback(d1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void disconnect()
    {
        Ns = false;
        if (isConnected())
        {
            try
            {
                IGamesService igamesservice = (IGamesService)fo();
                igamesservice.hr();
                Nm.flush();
                igamesservice.q(Nw);
            }
            catch (RemoteException remoteexception)
            {
                GamesLog.j("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        hq();
        super.disconnect();
    }

    public void e(com.google.android.gms.common.api.a.d d1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)fo()).d(new PlayersLoadedBinderCallback(d1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).m(new TurnBasedMatchInitiatedBinderCallbacks(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.a.d d1, String s, int i1)
    {
        try
        {
            ((IGamesService)fo()).b(new InvitationsLoadedBinderCallback(d1), s, i1, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)fo()).c(new ExtendedGamesLoadedBinderCallback(d1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.a.d d1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).d(new SnapshotsLoadedBinderCallbacks(d1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public Bundle ea()
    {
        Bundle bundle;
        try
        {
            bundle = ((IGamesService)fo()).ea();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        bundle.setClassLoader(com/google/android/gms/games/internal/GamesClientImpl.getClassLoader());
        return bundle;
    }

    public void f(View view)
    {
        Nr.g(view);
    }

    public void f(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((IGamesService)fo()).d(new GamesLoadedBinderCallback(d1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).o(new TurnBasedMatchLeftBinderCallbacks(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.a.d d1, String s, int i1)
    {
        try
        {
            ((IGamesService)fo()).a(new RequestSummariesLoadedBinderCallbacks(d1), s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)fo()).b(new PlayersLoadedBinderCallback(d1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void f(com.google.android.gms.common.api.a.d d1, boolean flag)
    {
        try
        {
            ((IGamesService)fo()).e(new ContactSettingsLoadedBinderCallback(d1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void g(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((IGamesService)fo()).j(new OwnerCoverPhotoUrisLoadedBinderCallback(d1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void g(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).n(new TurnBasedMatchCanceledBinderCallbacks(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void g(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)fo()).b(new PlayersLoadedBinderCallback(d1), s, null, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public String gU()
    {
        String s;
        try
        {
            s = ((IGamesService)fo()).gU();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public String gV()
    {
        String s;
        try
        {
            s = ((IGamesService)fo()).gV();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public Player gW()
    {
        ci();
        this;
        JVM INSTR monitorenter ;
        Object obj = Np;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new PlayerBuffer(((IGamesService)fo()).ht());
        if (((PlayerBuffer) (obj)).getCount() > 0)
        {
            Np = (PlayerEntity)((PlayerBuffer) (obj)).get(0).freeze();
        }
        ((PlayerBuffer) (obj)).close();
_L1:
        this;
        JVM INSTR monitorexit ;
        return Np;
        Exception exception1;
        exception1;
        Exception exception;
        try
        {
            ((PlayerBuffer) (obj)).close();
            throw exception1;
        }
        catch (RemoteException remoteexception) { }
        finally { }
        GamesLog.j("GamesClientImpl", "service died");
          goto _L1
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Game gX()
    {
        ci();
        this;
        JVM INSTR monitorenter ;
        Object obj = Nq;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new GameBuffer(((IGamesService)fo()).hv());
        if (((GameBuffer) (obj)).getCount() > 0)
        {
            Nq = (GameEntity)((GameBuffer) (obj)).get(0).freeze();
        }
        ((GameBuffer) (obj)).close();
_L1:
        this;
        JVM INSTR monitorexit ;
        return Nq;
        Exception exception1;
        exception1;
        Exception exception;
        try
        {
            ((GameBuffer) (obj)).close();
            throw exception1;
        }
        catch (RemoteException remoteexception) { }
        finally { }
        GamesLog.j("GamesClientImpl", "service died");
          goto _L1
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Intent gY()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)fo()).gY();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent gZ()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)fo()).gZ();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public void h(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((IGamesService)fo()).h(new NotifyAclLoadedBinderCallback(d1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void h(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).p(new TurnBasedMatchLoadedBinderCallbacks(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public Intent ha()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)fo()).ha();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent hb()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)fo()).hb();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public void hc()
    {
        try
        {
            ((IGamesService)fo()).r(Nw);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void hd()
    {
        try
        {
            ((IGamesService)fo()).s(Nw);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void he()
    {
        try
        {
            ((IGamesService)fo()).u(Nw);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void hf()
    {
        try
        {
            ((IGamesService)fo()).t(Nw);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public Intent hg()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)fo()).hg();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent hh()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)fo()).hh();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public int hi()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)fo()).hi();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return 4368;
        }
        return i1;
    }

    public String hj()
    {
        String s;
        try
        {
            s = ((IGamesService)fo()).hj();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public int hk()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)fo()).hk();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public Intent hl()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)fo()).hl();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public int hm()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)fo()).hm();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public int hn()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)fo()).hn();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public int ho()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)fo()).ho();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public int hp()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)fo()).hp();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.j("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public void hr()
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_19;
        }
        ((IGamesService)fo()).hr();
        return;
        RemoteException remoteexception;
        remoteexception;
        GamesLog.j("GamesClientImpl", "service died");
        return;
    }

    public void i(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((IGamesService)fo()).e(new ContactSettingsLoadedBinderCallback(d1), false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void i(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            Nm.flush();
            ((IGamesService)fo()).u(new QuestAcceptedBinderCallbacks(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void j(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((IGamesService)fo()).t(new InboxCountsLoadedBinderCallback(d1), null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void j(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).r(new SnapshotDeletedBinderCallbacks(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void k(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).e(new ExtendedGamesLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public RealTimeSocket l(String s, String s1)
    {
label0:
        {
            if (s1 == null || !ParticipantUtils.bn(s1))
            {
                throw new IllegalArgumentException("Bad participant ID");
            }
            RealTimeSocket realtimesocket = (RealTimeSocket)No.get(s1);
            if (realtimesocket != null)
            {
                s = realtimesocket;
                if (!realtimesocket.isClosed())
                {
                    break label0;
                }
            }
            s = aT(s1);
        }
        return s;
    }

    public void l(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).f(new GameInstancesLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void l(String s, int i1)
    {
        Nm.l(s, i1);
    }

    public void m(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).q(new GameSearchSuggestionsLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void m(String s, int i1)
    {
        try
        {
            ((IGamesService)fo()).m(s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void n(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).s(new PlayerXpForGameCategoriesLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void n(String s, int i1)
    {
        try
        {
            ((IGamesService)fo()).n(s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void o(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).k(new InvitationsLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void onConnected(Bundle bundle)
    {
        if (Ns)
        {
            Nr.hG();
            Ns = false;
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Ns = false;
    }

    public void onConnectionSuspended(int i1)
    {
    }

    public void p(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).j(new NotifyAclUpdatedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    public void q(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)fo()).i(new GameMuteStatusLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.j("GamesClientImpl", "service died");
        }
    }

    protected IInterface x(IBinder ibinder)
    {
        return ah(ibinder);
    }
}
