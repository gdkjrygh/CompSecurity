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
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.internal.constants.RequestType;
import com.google.android.gms.games.internal.game.ExtendedGameBuffer;
import com.google.android.gms.games.internal.game.GameInstanceBuffer;
import com.google.android.gms.games.internal.player.ExtendedPlayerBuffer;
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
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.internal.ff;
import com.google.android.gms.internal.fm;
import com.google.android.gms.internal.fq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupManager, IGamesService, GamesLog, LibjingleNativeSocket, 
//            RealTimeSocketImpl, AbstractGamesCallbacks

public final class GamesClientImpl extends ff
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{
    abstract class AbstractPeerStatusCallback extends AbstractRoomStatusCallback
    {

        private final ArrayList II = new ArrayList();
        final GamesClientImpl IJ;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            a(roomstatusupdatelistener, room, II);
        }

        protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist);

        AbstractPeerStatusCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            IJ = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
            int i1 = 0;
            for (int j1 = as.length; i1 < j1; i1++)
            {
                II.add(as[i1]);
            }

        }
    }

    abstract class AbstractRoomCallback extends com.google.android.gms.internal.ff.d
    {

        final GamesClientImpl IJ;

        protected void a(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            a(roomupdatelistener, GamesClientImpl.a(IJ, dataholder), dataholder.getStatusCode());
        }

        protected abstract void a(RoomUpdateListener roomupdatelistener, Room room, int i1);

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((RoomUpdateListener)obj, dataholder);
        }

        AbstractRoomCallback(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, roomupdatelistener, dataholder);
        }
    }

    abstract class AbstractRoomStatusCallback extends com.google.android.gms.internal.ff.d
    {

        final GamesClientImpl IJ;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            a(roomstatusupdatelistener, GamesClientImpl.a(IJ, dataholder));
        }

        protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((RoomStatusUpdateListener)obj, dataholder);
        }

        AbstractRoomStatusCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, roomstatusupdatelistener, dataholder);
        }
    }

    final class AchievementUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void e(int i1, String s)
        {
            IJ.a(IJ. new AchievementUpdatedCallback(wH, i1, s));
        }

        AchievementUpdatedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class AchievementUpdatedCallback extends com.google.android.gms.internal.ff.b
        implements com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult
    {

        final GamesClientImpl IJ;
        private final String IK;
        private final Status wJ;

        protected void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        protected void c(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(this);
        }

        protected void dx()
        {
        }

        public String getAchievementId()
        {
            return IK;
        }

        public Status getStatus()
        {
            return wJ;
        }

        AchievementUpdatedCallback(com.google.android.gms.common.api.a.d d1, int i1, String s)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, d1);
            wJ = new Status(i1);
            IK = s;
        }
    }

    final class AchievementsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void b(DataHolder dataholder)
        {
            IJ.a(IJ. new AchievementsLoadedCallback(wH, dataholder));
        }

        AchievementsLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class AchievementsLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult
    {

        final GamesClientImpl IJ;
        private final AchievementBuffer IL;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public AchievementBuffer getAchievements()
        {
            return IL;
        }

        AchievementsLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            IL = new AchievementBuffer(dataholder);
        }
    }

    final class ConnectedToRoomCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl IJ;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onConnectedToRoom(room);
        }

        ConnectedToRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
        }
    }

    final class ContactSettingsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void B(DataHolder dataholder)
        {
            IJ.a(IJ. new ContactSettingsLoadedCallback(wH, dataholder));
        }

        ContactSettingsLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class ContactSettingsLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.Notifications.ContactSettingLoadResult
    {

        final GamesClientImpl IJ;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        ContactSettingsLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
        }
    }

    final class ContactSettingsUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void aV(int i1)
        {
            IJ.a(IJ. new ContactSettingsUpdatedCallback(wH, i1));
        }

        ContactSettingsUpdatedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class ContactSettingsUpdatedCallback extends com.google.android.gms.internal.ff.b
    {

        final GamesClientImpl IJ;
        private final Status wJ;

        protected void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        protected void c(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(wJ);
        }

        protected void dx()
        {
        }

        ContactSettingsUpdatedCallback(com.google.android.gms.common.api.a.d d1, int i1)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, d1);
            wJ = new Status(i1);
        }
    }

    final class DisconnectedFromRoomCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl IJ;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onDisconnectedFromRoom(room);
        }

        DisconnectedFromRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
        }
    }

    final class ExtendedGamesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void h(DataHolder dataholder)
        {
            IJ.a(IJ. new ExtendedGamesLoadedCallback(wH, dataholder));
        }

        ExtendedGamesLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class ExtendedGamesLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult
    {

        final GamesClientImpl IJ;
        private final ExtendedGameBuffer IM;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        ExtendedGamesLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            IM = new ExtendedGameBuffer(dataholder);
        }
    }

    final class ExtendedPlayersLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void f(DataHolder dataholder)
        {
            IJ.a(IJ. new ExtendedPlayersLoadedCallback(wH, dataholder));
        }

        ExtendedPlayersLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class ExtendedPlayersLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.Players.LoadExtendedPlayersResult
    {

        final GamesClientImpl IJ;
        private final ExtendedPlayerBuffer IN;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        ExtendedPlayersLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            IN = new ExtendedPlayerBuffer(dataholder);
        }
    }

    final class GameInstancesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void i(DataHolder dataholder)
        {
            IJ.a(IJ. new GameInstancesLoadedCallback(wH, dataholder));
        }

        GameInstancesLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class GameInstancesLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult
    {

        final GamesClientImpl IJ;
        private final GameInstanceBuffer IO;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        GameInstancesLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            IO = new GameInstanceBuffer(dataholder);
        }
    }

    final class GameMuteStatusChangedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void a(int i1, String s, boolean flag)
        {
            IJ.a(IJ. new GameMuteStatusChangedCallback(wH, i1, s, flag));
        }

        GameMuteStatusChangedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class GameMuteStatusChangedCallback extends com.google.android.gms.internal.ff.b
        implements com.google.android.gms.games.Notifications.GameMuteStatusChangeResult
    {

        final GamesClientImpl IJ;
        private final String IP;
        private final boolean IQ;
        private final Status wJ;

        protected void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        protected void c(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(this);
        }

        protected void dx()
        {
        }

        public Status getStatus()
        {
            return wJ;
        }

        public GameMuteStatusChangedCallback(com.google.android.gms.common.api.a.d d1, int i1, String s, boolean flag)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, d1);
            wJ = new Status(i1);
            IP = s;
            IQ = flag;
        }
    }

    final class GameMuteStatusLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void z(DataHolder dataholder)
        {
            IJ.a(IJ. new GameMuteStatusLoadedCallback(wH, dataholder));
        }

        GameMuteStatusLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class GameMuteStatusLoadedCallback extends com.google.android.gms.internal.ff.b
        implements com.google.android.gms.games.Notifications.GameMuteStatusLoadResult
    {

        final GamesClientImpl IJ;
        private final String IP;
        private final boolean IQ;
        private final Status wJ;

        protected void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        protected void c(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(this);
        }

        protected void dx()
        {
        }

        public Status getStatus()
        {
            return wJ;
        }

        public GameMuteStatusLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, d1);
            wJ = new Status(dataholder.getStatusCode());
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            IP = dataholder.getString("external_game_id", 0, 0);
            IQ = dataholder.getBoolean("muted", 0, 0);
_L4:
            dataholder.close();
            return;
_L2:
            IP = null;
            IQ = false;
            if (true) goto _L4; else goto _L3
_L3:
            gamesclientimpl;
            dataholder.close();
            throw GamesClientImpl.this;
        }
    }

    final class GameSearchSuggestionsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void j(DataHolder dataholder)
        {
            IJ.a(IJ. new GameSearchSuggestionsLoadedCallback(wH, dataholder));
        }

        GameSearchSuggestionsLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class GameSearchSuggestionsLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult
    {

        final GamesClientImpl IJ;
        private final DataHolder IR;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        GameSearchSuggestionsLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            IR = dataholder;
        }
    }

    final class GamesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void g(DataHolder dataholder)
        {
            IJ.a(IJ. new GamesLoadedCallback(wH, dataholder));
        }

        GamesLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class GamesLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.GamesMetadata.LoadGamesResult
    {

        final GamesClientImpl IJ;
        private final GameBuffer IS;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public GameBuffer getGames()
        {
            return IS;
        }

        GamesLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            IS = new GameBuffer(dataholder);
        }
    }

    final class InvitationReceivedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final OnInvitationReceivedListener IT;

        public void l(DataHolder dataholder)
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
                IJ.a(IJ. new InvitationReceivedCallback(IT, dataholder));
            }
            return;
            dataholder;
            invitationbuffer.close();
            throw dataholder;
        }

        public void onInvitationRemoved(String s)
        {
            IJ.a(IJ. new InvitationRemovedCallback(IT, s));
        }

        InvitationReceivedBinderCallback(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            IJ = GamesClientImpl.this;
            super();
            IT = oninvitationreceivedlistener;
        }
    }

    final class InvitationReceivedCallback extends com.google.android.gms.internal.ff.b
    {

        final GamesClientImpl IJ;
        private final Invitation IU;

        protected void a(Object obj)
        {
            b((OnInvitationReceivedListener)obj);
        }

        protected void b(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationReceived(IU);
        }

        protected void dx()
        {
        }

        InvitationReceivedCallback(OnInvitationReceivedListener oninvitationreceivedlistener, Invitation invitation)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, oninvitationreceivedlistener);
            IU = invitation;
        }
    }

    final class InvitationRemovedCallback extends com.google.android.gms.internal.ff.b
    {

        final GamesClientImpl IJ;
        private final String IV;

        protected void a(Object obj)
        {
            b((OnInvitationReceivedListener)obj);
        }

        protected void b(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationRemoved(IV);
        }

        protected void dx()
        {
        }

        InvitationRemovedCallback(OnInvitationReceivedListener oninvitationreceivedlistener, String s)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, oninvitationreceivedlistener);
            IV = s;
        }
    }

    final class InvitationsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void k(DataHolder dataholder)
        {
            IJ.a(IJ. new InvitationsLoadedCallback(wH, dataholder));
        }

        InvitationsLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class InvitationsLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult
    {

        final GamesClientImpl IJ;
        private final InvitationBuffer IW;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public InvitationBuffer getInvitations()
        {
            return IW;
        }

        InvitationsLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            IW = new InvitationBuffer(dataholder);
        }
    }

    final class JoinedRoomCallback extends AbstractRoomCallback
    {

        final GamesClientImpl IJ;

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onJoinedRoom(i1, room);
        }

        public JoinedRoomCallback(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(roomupdatelistener, dataholder);
        }
    }

    final class LeaderboardScoresLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void a(DataHolder dataholder, DataHolder dataholder1)
        {
            IJ.a(IJ. new LeaderboardScoresLoadedCallback(wH, dataholder, dataholder1));
        }

        LeaderboardScoresLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class LeaderboardScoresLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    {

        final GamesClientImpl IJ;
        private final LeaderboardEntity IX = null;
        private final LeaderboardScoreBuffer IY;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public Leaderboard getLeaderboard()
        {
            return IX;
        }

        public LeaderboardScoreBuffer getScores()
        {
            return IY;
        }

        LeaderboardScoresLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder, DataHolder dataholder1)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder1);
            gamesclientimpl = new LeaderboardBuffer(dataholder);
            if (getCount() <= 0) goto _L2; else goto _L1
_L1:
            IX = (LeaderboardEntity)((Leaderboard)get(0)).freeze();
_L4:
            close();
            IY = new LeaderboardScoreBuffer(dataholder1);
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            d1;
            close();
            throw d1;
        }
    }

    final class LeaderboardsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void c(DataHolder dataholder)
        {
            IJ.a(IJ. new LeaderboardsLoadedCallback(wH, dataholder));
        }

        LeaderboardsLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class LeaderboardsLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult
    {

        final GamesClientImpl IJ;
        private final LeaderboardBuffer IZ;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public LeaderboardBuffer getLeaderboards()
        {
            return IZ;
        }

        LeaderboardsLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            IZ = new LeaderboardBuffer(dataholder);
        }
    }

    final class LeftRoomCallback extends com.google.android.gms.internal.ff.b
    {

        private final int Ah;
        final GamesClientImpl IJ;
        private final String Ja;

        public void a(RoomUpdateListener roomupdatelistener)
        {
            roomupdatelistener.onLeftRoom(Ah, Ja);
        }

        public volatile void a(Object obj)
        {
            a((RoomUpdateListener)obj);
        }

        protected void dx()
        {
        }

        LeftRoomCallback(RoomUpdateListener roomupdatelistener, int i1, String s)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, roomupdatelistener);
            Ah = i1;
            Ja = s;
        }
    }

    final class MatchRemovedCallback extends com.google.android.gms.internal.ff.b
    {

        final GamesClientImpl IJ;
        private final String Jb;

        protected void a(Object obj)
        {
            b((OnTurnBasedMatchUpdateReceivedListener)obj);
        }

        protected void b(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchRemoved(Jb);
        }

        protected void dx()
        {
        }

        MatchRemovedCallback(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener, String s)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, onturnbasedmatchupdatereceivedlistener);
            Jb = s;
        }
    }

    final class MatchUpdateReceivedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final OnTurnBasedMatchUpdateReceivedListener Jc;

        public void onTurnBasedMatchRemoved(String s)
        {
            IJ.a(IJ. new MatchRemovedCallback(Jc, s));
        }

        public void r(DataHolder dataholder)
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
                IJ.a(IJ. new MatchUpdateReceivedCallback(Jc, dataholder));
            }
            return;
            dataholder;
            turnbasedmatchbuffer.close();
            throw dataholder;
        }

        MatchUpdateReceivedBinderCallback(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            IJ = GamesClientImpl.this;
            super();
            Jc = onturnbasedmatchupdatereceivedlistener;
        }
    }

    final class MatchUpdateReceivedCallback extends com.google.android.gms.internal.ff.b
    {

        final GamesClientImpl IJ;
        private final TurnBasedMatch Jd;

        protected void a(Object obj)
        {
            b((OnTurnBasedMatchUpdateReceivedListener)obj);
        }

        protected void b(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchReceived(Jd);
        }

        protected void dx()
        {
        }

        MatchUpdateReceivedCallback(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener, TurnBasedMatch turnbasedmatch)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, onturnbasedmatchupdatereceivedlistener);
            Jd = turnbasedmatch;
        }
    }

    final class MessageReceivedCallback extends com.google.android.gms.internal.ff.b
    {

        final GamesClientImpl IJ;
        private final RealTimeMessage Je;

        public void a(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            if (realtimemessagereceivedlistener != null)
            {
                realtimemessagereceivedlistener.onRealTimeMessageReceived(Je);
            }
        }

        public volatile void a(Object obj)
        {
            a((RealTimeMessageReceivedListener)obj);
        }

        protected void dx()
        {
        }

        MessageReceivedCallback(RealTimeMessageReceivedListener realtimemessagereceivedlistener, RealTimeMessage realtimemessage)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, realtimemessagereceivedlistener);
            Je = realtimemessage;
        }
    }

    final class NotifyAclLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void A(DataHolder dataholder)
        {
            IJ.a(IJ. new NotifyAclLoadedCallback(wH, dataholder));
        }

        NotifyAclLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class NotifyAclLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.internal.game.Acls.LoadAclResult
    {

        final GamesClientImpl IJ;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        NotifyAclLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
        }
    }

    final class NotifyAclUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void aU(int i1)
        {
            IJ.a(IJ. new NotifyAclUpdatedCallback(wH, i1));
        }

        NotifyAclUpdatedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class NotifyAclUpdatedCallback extends com.google.android.gms.internal.ff.b
    {

        final GamesClientImpl IJ;
        private final Status wJ;

        protected void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        protected void c(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(wJ);
        }

        protected void dx()
        {
        }

        NotifyAclUpdatedCallback(com.google.android.gms.common.api.a.d d1, int i1)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, d1);
            wJ = new Status(i1);
        }
    }

    final class OwnerCoverPhotoUrisLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void c(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            IJ.a(IJ. new OwnerCoverPhotoUrisLoadedCallback(wH, i1, bundle));
        }

        OwnerCoverPhotoUrisLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class OwnerCoverPhotoUrisLoadedCallback extends com.google.android.gms.internal.ff.b
        implements com.google.android.gms.games.Players.LoadOwnerCoverPhotoUrisResult
    {

        final GamesClientImpl IJ;
        private final Bundle Jf;
        private final Status wJ;

        protected void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        protected void c(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(this);
        }

        protected void dx()
        {
        }

        public Status getStatus()
        {
            return wJ;
        }

        OwnerCoverPhotoUrisLoadedCallback(com.google.android.gms.common.api.a.d d1, int i1, Bundle bundle)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, d1);
            wJ = new Status(i1);
            Jf = bundle;
        }
    }

    final class P2PConnectedCallback extends com.google.android.gms.internal.ff.b
    {

        final GamesClientImpl IJ;
        private final String Jg;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            if (roomstatusupdatelistener != null)
            {
                roomstatusupdatelistener.onP2PConnected(Jg);
            }
        }

        public volatile void a(Object obj)
        {
            a((RoomStatusUpdateListener)obj);
        }

        protected void dx()
        {
        }

        P2PConnectedCallback(RoomStatusUpdateListener roomstatusupdatelistener, String s)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, roomstatusupdatelistener);
            Jg = s;
        }
    }

    final class P2PDisconnectedCallback extends com.google.android.gms.internal.ff.b
    {

        final GamesClientImpl IJ;
        private final String Jg;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            if (roomstatusupdatelistener != null)
            {
                roomstatusupdatelistener.onP2PDisconnected(Jg);
            }
        }

        public volatile void a(Object obj)
        {
            a((RoomStatusUpdateListener)obj);
        }

        protected void dx()
        {
        }

        P2PDisconnectedCallback(RoomStatusUpdateListener roomstatusupdatelistener, String s)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, roomstatusupdatelistener);
            Jg = s;
        }
    }

    final class PeerConnectedCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl IJ;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersConnected(room, arraylist);
        }

        PeerConnectedCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            IJ = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    final class PeerDeclinedCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl IJ;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerDeclined(room, arraylist);
        }

        PeerDeclinedCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            IJ = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    final class PeerDisconnectedCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl IJ;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersDisconnected(room, arraylist);
        }

        PeerDisconnectedCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            IJ = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    final class PeerInvitedToRoomCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl IJ;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerInvitedToRoom(room, arraylist);
        }

        PeerInvitedToRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            IJ = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    final class PeerJoinedRoomCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl IJ;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerJoined(room, arraylist);
        }

        PeerJoinedRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            IJ = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    final class PeerLeftRoomCallback extends AbstractPeerStatusCallback
    {

        final GamesClientImpl IJ;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerLeft(room, arraylist);
        }

        PeerLeftRoomCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder, String as[])
        {
            IJ = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder, as);
        }
    }

    final class PlayerLeaderboardScoreLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void C(DataHolder dataholder)
        {
            IJ.a(IJ. new PlayerLeaderboardScoreLoadedCallback(wH, dataholder));
        }

        PlayerLeaderboardScoreLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class PlayerLeaderboardScoreLoadedCallback extends com.google.android.gms.internal.ff.d
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult
    {

        final GamesClientImpl IJ;
        private final LeaderboardScoreEntity Jh = null;
        private final Status wJ;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public LeaderboardScore getScore()
        {
            return Jh;
        }

        public Status getStatus()
        {
            return wJ;
        }

        PlayerLeaderboardScoreLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, d1, dataholder);
            wJ = new Status(dataholder.getStatusCode());
            gamesclientimpl = new LeaderboardScoreBuffer(dataholder);
            if (getCount() <= 0) goto _L2; else goto _L1
_L1:
            Jh = (LeaderboardScoreEntity)get(0).freeze();
_L4:
            close();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            d1;
            close();
            throw d1;
        }
    }

    final class PlayersLoadedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void e(DataHolder dataholder)
        {
            IJ.a(IJ. new PlayersLoadedCallback(wH, dataholder));
        }

        PlayersLoadedBinderCallback(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class PlayersLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.Players.LoadPlayersResult
    {

        final GamesClientImpl IJ;
        private final PlayerBuffer Ji;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public PlayerBuffer getPlayers()
        {
            return Ji;
        }

        PlayersLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            Ji = new PlayerBuffer(dataholder);
        }
    }

    final class RealTimeMessageSentCallback extends com.google.android.gms.internal.ff.b
    {

        private final int Ah;
        final GamesClientImpl IJ;
        private final String Jj;
        private final int Jk;

        public void a(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback)
        {
            if (reliablemessagesentcallback != null)
            {
                reliablemessagesentcallback.onRealTimeMessageSent(Ah, Jk, Jj);
            }
        }

        public volatile void a(Object obj)
        {
            a((com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback)obj);
        }

        protected void dx()
        {
        }

        RealTimeMessageSentCallback(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback, int i1, int j1, String s)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, reliablemessagesentcallback);
            Ah = i1;
            Jk = j1;
            Jj = s;
        }
    }

    final class RealTimeReliableMessageBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        final com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback Jl;

        public void b(int i1, int j1, String s)
        {
            IJ.a(IJ. new RealTimeMessageSentCallback(Jl, i1, j1, s));
        }

        public RealTimeReliableMessageBinderCallbacks(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback)
        {
            IJ = GamesClientImpl.this;
            super();
            Jl = reliablemessagesentcallback;
        }
    }

    final class RequestReceivedBinderCallback extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final OnRequestReceivedListener Jm;

        public void m(DataHolder dataholder)
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
                IJ.a(IJ. new RequestReceivedCallback(Jm, dataholder));
            }
            return;
            dataholder;
            gamerequestbuffer.close();
            throw dataholder;
        }

        public void onRequestRemoved(String s)
        {
            IJ.a(IJ. new RequestRemovedCallback(Jm, s));
        }

        RequestReceivedBinderCallback(OnRequestReceivedListener onrequestreceivedlistener)
        {
            IJ = GamesClientImpl.this;
            super();
            Jm = onrequestreceivedlistener;
        }
    }

    final class RequestReceivedCallback extends com.google.android.gms.internal.ff.b
    {

        final GamesClientImpl IJ;
        private final GameRequest Jn;

        protected void a(Object obj)
        {
            b((OnRequestReceivedListener)obj);
        }

        protected void b(OnRequestReceivedListener onrequestreceivedlistener)
        {
            onrequestreceivedlistener.onRequestReceived(Jn);
        }

        protected void dx()
        {
        }

        RequestReceivedCallback(OnRequestReceivedListener onrequestreceivedlistener, GameRequest gamerequest)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, onrequestreceivedlistener);
            Jn = gamerequest;
        }
    }

    final class RequestRemovedCallback extends com.google.android.gms.internal.ff.b
    {

        final GamesClientImpl IJ;
        private final String Jo;

        protected void a(Object obj)
        {
            b((OnRequestReceivedListener)obj);
        }

        protected void b(OnRequestReceivedListener onrequestreceivedlistener)
        {
            onrequestreceivedlistener.onRequestRemoved(Jo);
        }

        protected void dx()
        {
        }

        RequestRemovedCallback(OnRequestReceivedListener onrequestreceivedlistener, String s)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, onrequestreceivedlistener);
            Jo = s;
        }
    }

    final class RequestSentBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d Jp;

        public void E(DataHolder dataholder)
        {
            IJ.a(IJ. new RequestSentCallback(Jp, dataholder));
        }

        public RequestSentBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            Jp = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class RequestSentCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.request.Requests.SendRequestResult
    {

        final GamesClientImpl IJ;
        private final GameRequest Jn = null;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        RequestSentCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            gamesclientimpl = new GameRequestBuffer(dataholder);
            if (getCount() <= 0) goto _L2; else goto _L1
_L1:
            Jn = (GameRequest)((GameRequest)get(0)).freeze();
_L4:
            close();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            d1;
            close();
            throw d1;
        }
    }

    final class RequestSummariesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d Jq;

        public void F(DataHolder dataholder)
        {
            IJ.a(IJ. new RequestSummariesLoadedCallback(Jq, dataholder));
        }

        public RequestSummariesLoadedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            Jq = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class RequestSummariesLoadedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.request.Requests.LoadRequestSummariesResult
    {

        final GamesClientImpl IJ;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        RequestSummariesLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
        }
    }

    final class RequestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d Jr;

        public void b(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            IJ.a(IJ. new RequestsLoadedCallback(Jr, status, bundle));
        }

        public RequestsLoadedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            Jr = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class RequestsLoadedCallback extends com.google.android.gms.internal.ff.b
        implements com.google.android.gms.games.request.Requests.LoadRequestsResult
    {

        final GamesClientImpl IJ;
        private final Bundle Js;
        private final Status wJ;

        protected void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        protected void c(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(this);
        }

        protected void dx()
        {
            release();
        }

        public GameRequestBuffer getRequests(int i1)
        {
            String s = RequestType.bd(i1);
            if (!Js.containsKey(s))
            {
                return null;
            } else
            {
                return new GameRequestBuffer((DataHolder)Js.get(s));
            }
        }

        public Status getStatus()
        {
            return wJ;
        }

        public void release()
        {
            Iterator iterator = Js.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                obj = (DataHolder)Js.getParcelable(((String) (obj)));
                if (obj != null)
                {
                    ((DataHolder) (obj)).close();
                }
            } while (true);
        }

        RequestsLoadedCallback(com.google.android.gms.common.api.a.d d1, Status status, Bundle bundle)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, d1);
            wJ = status;
            Js = bundle;
        }
    }

    final class RequestsUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d Jt;

        public void D(DataHolder dataholder)
        {
            IJ.a(IJ. new RequestsUpdatedCallback(Jt, dataholder));
        }

        public RequestsUpdatedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            Jt = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class RequestsUpdatedCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.request.Requests.UpdateRequestsResult
    {

        final GamesClientImpl IJ;
        private final RequestUpdateOutcomes Ju;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public Set getRequestIds()
        {
            return Ju.getRequestIds();
        }

        public int getRequestOutcome(String s)
        {
            return Ju.getRequestOutcome(s);
        }

        RequestsUpdatedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            Ju = RequestUpdateOutcomes.J(dataholder);
        }
    }

    abstract class ResultDataHolderCallback extends com.google.android.gms.internal.ff.d
        implements Releasable, Result
    {

        final DataHolder BB;
        final GamesClientImpl IJ;
        final Status wJ;

        public Status getStatus()
        {
            return wJ;
        }

        public void release()
        {
            if (BB != null)
            {
                BB.close();
            }
        }

        public ResultDataHolderCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, d1, dataholder);
            wJ = new Status(dataholder.getStatusCode());
            BB = dataholder;
        }
    }

    final class RoomAutoMatchingCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl IJ;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomAutoMatching(room);
        }

        RoomAutoMatchingCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
        }
    }

    final class RoomBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final RoomUpdateListener Jv;
        private final RoomStatusUpdateListener Jw;
        private final RealTimeMessageReceivedListener Jx;

        public void a(DataHolder dataholder, String as[])
        {
            IJ.a(IJ. new PeerInvitedToRoomCallback(Jw, dataholder, as));
        }

        public void b(DataHolder dataholder, String as[])
        {
            IJ.a(IJ. new PeerJoinedRoomCallback(Jw, dataholder, as));
        }

        public void c(DataHolder dataholder, String as[])
        {
            IJ.a(IJ. new PeerLeftRoomCallback(Jw, dataholder, as));
        }

        public void d(DataHolder dataholder, String as[])
        {
            IJ.a(IJ. new PeerDeclinedCallback(Jw, dataholder, as));
        }

        public void e(DataHolder dataholder, String as[])
        {
            IJ.a(IJ. new PeerConnectedCallback(Jw, dataholder, as));
        }

        public void f(DataHolder dataholder, String as[])
        {
            IJ.a(IJ. new PeerDisconnectedCallback(Jw, dataholder, as));
        }

        public void onLeftRoom(int i1, String s1)
        {
            IJ.a(IJ. new LeftRoomCallback(Jv, i1, s1));
        }

        public void onP2PConnected(String s1)
        {
            IJ.a(IJ. new P2PConnectedCallback(Jw, s1));
        }

        public void onP2PDisconnected(String s1)
        {
            IJ.a(IJ. new P2PDisconnectedCallback(Jw, s1));
        }

        public void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
        {
            IJ.a(IJ. new MessageReceivedCallback(Jx, realtimemessage));
        }

        public void s(DataHolder dataholder)
        {
            IJ.a(IJ. new RoomCreatedCallback(Jv, dataholder));
        }

        public void t(DataHolder dataholder)
        {
            IJ.a(IJ. new JoinedRoomCallback(Jv, dataholder));
        }

        public void u(DataHolder dataholder)
        {
            IJ.a(IJ. new RoomConnectingCallback(Jw, dataholder));
        }

        public void v(DataHolder dataholder)
        {
            IJ.a(IJ. new RoomAutoMatchingCallback(Jw, dataholder));
        }

        public void w(DataHolder dataholder)
        {
            IJ.a(IJ. new RoomConnectedCallback(Jv, dataholder));
        }

        public void x(DataHolder dataholder)
        {
            IJ.a(IJ. new ConnectedToRoomCallback(Jw, dataholder));
        }

        public void y(DataHolder dataholder)
        {
            IJ.a(IJ. new DisconnectedFromRoomCallback(Jw, dataholder));
        }

        public RoomBinderCallbacks(RoomUpdateListener roomupdatelistener)
        {
            IJ = GamesClientImpl.this;
            super();
            Jv = (RoomUpdateListener)fq.b(roomupdatelistener, "Callbacks must not be null");
            Jw = null;
            Jx = null;
        }

        public RoomBinderCallbacks(RoomUpdateListener roomupdatelistener, RoomStatusUpdateListener roomstatusupdatelistener, RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            IJ = GamesClientImpl.this;
            super();
            Jv = (RoomUpdateListener)fq.b(roomupdatelistener, "Callbacks must not be null");
            Jw = roomstatusupdatelistener;
            Jx = realtimemessagereceivedlistener;
        }
    }

    final class RoomConnectedCallback extends AbstractRoomCallback
    {

        final GamesClientImpl IJ;

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onRoomConnected(i1, room);
        }

        RoomConnectedCallback(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(roomupdatelistener, dataholder);
        }
    }

    final class RoomConnectingCallback extends AbstractRoomStatusCallback
    {

        final GamesClientImpl IJ;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomConnecting(room);
        }

        RoomConnectingCallback(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(roomstatusupdatelistener, dataholder);
        }
    }

    final class RoomCreatedCallback extends AbstractRoomCallback
    {

        final GamesClientImpl IJ;

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onRoomCreated(i1, room);
        }

        public RoomCreatedCallback(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(roomupdatelistener, dataholder);
        }
    }

    final class SignOutCompleteBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void du()
        {
            Status status = new Status(0);
            IJ.a(IJ. new SignOutCompleteCallback(wH, status));
        }

        public SignOutCompleteBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class SignOutCompleteCallback extends com.google.android.gms.internal.ff.b
    {

        final GamesClientImpl IJ;
        private final Status wJ;

        public void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        public void c(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(wJ);
        }

        protected void dx()
        {
        }

        public SignOutCompleteCallback(com.google.android.gms.common.api.a.d d1, Status status)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, d1);
            wJ = status;
        }
    }

    final class SubmitScoreBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d wH;

        public void d(DataHolder dataholder)
        {
            IJ.a(IJ. new SubmitScoreCallback(wH, dataholder));
        }

        public SubmitScoreBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            wH = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class SubmitScoreCallback extends ResultDataHolderCallback
        implements com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult
    {

        final GamesClientImpl IJ;
        private final ScoreSubmissionData Jy;

        public void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            d1.b(this);
        }

        public volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public ScoreSubmissionData getScoreData()
        {
            return Jy;
        }

        public SubmitScoreCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            Jy = new ScoreSubmissionData(dataholder);
            dataholder.close();
            return;
            gamesclientimpl;
            dataholder.close();
            throw GamesClientImpl.this;
        }
    }

    abstract class TurnBasedMatchCallback extends ResultDataHolderCallback
    {

        final GamesClientImpl IJ;
        final TurnBasedMatch Jd = null;

        protected void a(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            k(d1);
        }

        protected volatile void a(Object obj, DataHolder dataholder)
        {
            a((com.google.android.gms.common.api.a.d)obj, dataholder);
        }

        public TurnBasedMatch getMatch()
        {
            return Jd;
        }

        abstract void k(com.google.android.gms.common.api.a.d d1);

        TurnBasedMatchCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
            gamesclientimpl = new TurnBasedMatchBuffer(dataholder);
            if (getCount() <= 0) goto _L2; else goto _L1
_L1:
            Jd = (TurnBasedMatch)((TurnBasedMatch)get(0)).freeze();
_L4:
            close();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            d1;
            close();
            throw d1;
        }
    }

    final class TurnBasedMatchCanceledBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d Jz;

        public void f(int i1, String s)
        {
            Status status = new Status(i1);
            IJ.a(IJ. new TurnBasedMatchCanceledCallback(Jz, status, s));
        }

        public TurnBasedMatchCanceledBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            Jz = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class TurnBasedMatchCanceledCallback extends com.google.android.gms.internal.ff.b
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult
    {

        final GamesClientImpl IJ;
        private final String JA;
        private final Status wJ;

        public void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        public void c(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(this);
        }

        protected void dx()
        {
        }

        public String getMatchId()
        {
            return JA;
        }

        public Status getStatus()
        {
            return wJ;
        }

        TurnBasedMatchCanceledCallback(com.google.android.gms.common.api.a.d d1, Status status, String s)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, d1);
            wJ = status;
            JA = s;
        }
    }

    final class TurnBasedMatchInitiatedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d JB;

        public void o(DataHolder dataholder)
        {
            IJ.a(IJ. new TurnBasedMatchInitiatedCallback(JB, dataholder));
        }

        public TurnBasedMatchInitiatedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            JB = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class TurnBasedMatchInitiatedCallback extends TurnBasedMatchCallback
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult
    {

        final GamesClientImpl IJ;

        protected void k(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(this);
        }

        TurnBasedMatchInitiatedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
        }
    }

    final class TurnBasedMatchLeftBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d JC;

        public void q(DataHolder dataholder)
        {
            IJ.a(IJ. new TurnBasedMatchLeftCallback(JC, dataholder));
        }

        public TurnBasedMatchLeftBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            JC = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class TurnBasedMatchLeftCallback extends TurnBasedMatchCallback
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult
    {

        final GamesClientImpl IJ;

        protected void k(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(this);
        }

        TurnBasedMatchLeftCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
        }
    }

    final class TurnBasedMatchLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d JD;

        public void n(DataHolder dataholder)
        {
            IJ.a(IJ. new TurnBasedMatchLoadedCallback(JD, dataholder));
        }

        public TurnBasedMatchLoadedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            JD = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class TurnBasedMatchLoadedCallback extends TurnBasedMatchCallback
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult
    {

        final GamesClientImpl IJ;

        protected void k(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(this);
        }

        TurnBasedMatchLoadedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
        }
    }

    final class TurnBasedMatchUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d JE;

        public void p(DataHolder dataholder)
        {
            IJ.a(IJ. new TurnBasedMatchUpdatedCallback(JE, dataholder));
        }

        public TurnBasedMatchUpdatedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            JE = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class TurnBasedMatchUpdatedCallback extends TurnBasedMatchCallback
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult
    {

        final GamesClientImpl IJ;

        protected void k(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(this);
        }

        TurnBasedMatchUpdatedCallback(com.google.android.gms.common.api.a.d d1, DataHolder dataholder)
        {
            IJ = GamesClientImpl.this;
            super(d1, dataholder);
        }
    }

    final class TurnBasedMatchesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        final GamesClientImpl IJ;
        private final com.google.android.gms.common.api.a.d JF;

        public void a(int i1, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = new Status(i1);
            IJ.a(IJ. new TurnBasedMatchesLoadedCallback(JF, status, bundle));
        }

        public TurnBasedMatchesLoadedBinderCallbacks(com.google.android.gms.common.api.a.d d1)
        {
            IJ = GamesClientImpl.this;
            super();
            JF = (com.google.android.gms.common.api.a.d)fq.b(d1, "Holder must not be null");
        }
    }

    final class TurnBasedMatchesLoadedCallback extends com.google.android.gms.internal.ff.b
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult
    {

        final GamesClientImpl IJ;
        private final LoadMatchesResponse JG;
        private final Status wJ;

        protected void a(Object obj)
        {
            c((com.google.android.gms.common.api.a.d)obj);
        }

        protected void c(com.google.android.gms.common.api.a.d d1)
        {
            d1.b(this);
        }

        protected void dx()
        {
        }

        public LoadMatchesResponse getMatches()
        {
            return JG;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public void release()
        {
            JG.close();
        }

        TurnBasedMatchesLoadedCallback(com.google.android.gms.common.api.a.d d1, Status status, Bundle bundle)
        {
            IJ = GamesClientImpl.this;
            super(GamesClientImpl.this, d1);
            wJ = status;
            JG = new LoadMatchesResponse(bundle);
        }
    }


    private boolean IA;
    private int IB;
    private final Binder IC = new Binder();
    private final long IE = (long)hashCode();
    private final boolean IF;
    private final int IG;
    private final boolean IH;
    private final String Iu;
    private final Map Iv = new HashMap();
    private PlayerEntity Iw;
    private GameEntity Ix;
    private final PopupManager Iy;
    private boolean Iz;
    private final String wG;

    public GamesClientImpl(Context context, Looper looper, String s, String s1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[], 
            int i1, View view, boolean flag, boolean flag1, int j1, boolean flag2, int k1)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        Iz = false;
        IA = false;
        Iu = s;
        wG = (String)fq.f(s1);
        Iy = PopupManager.a(this, i1);
        f(view);
        IA = flag1;
        IB = j1;
        IF = flag;
        IH = flag2;
        IG = k1;
        registerConnectionCallbacks(this);
        registerConnectionFailedListener(this);
    }

    private Room G(DataHolder dataholder)
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
        return gamesclientimpl.G(dataholder);
    }

    private RealTimeSocket aC(String s)
    {
        Object obj;
        LocalSocket localsocket;
        try
        {
            obj = ((IGamesService)eM()).aJ(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.h("GamesClientImpl", "Unable to create socket. Service died.");
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        GamesLog.f("GamesClientImpl", "Created native libjingle socket.");
        obj = new LibjingleNativeSocket(((android.os.ParcelFileDescriptor) (obj)));
        Iv.put(s, obj);
        return ((RealTimeSocket) (obj));
        GamesLog.f("GamesClientImpl", "Unable to create native libjingle socket, resorting to old socket.");
        obj = ((IGamesService)eM()).aE(s);
        if (obj == null)
        {
            return null;
        }
        localsocket = new LocalSocket();
        localsocket.connect(new LocalSocketAddress(((String) (obj))));
        obj = new RealTimeSocketImpl(localsocket, s);
        Iv.put(s, obj);
        return ((RealTimeSocket) (obj));
        s;
        GamesLog.h("GamesClientImpl", (new StringBuilder()).append("connect() call failed on socket: ").append(s.getMessage()).toString());
        return null;
    }

    private void gE()
    {
        for (Iterator iterator = Iv.values().iterator(); iterator.hasNext();)
        {
            RealTimeSocket realtimesocket = (RealTimeSocket)iterator.next();
            try
            {
                realtimesocket.close();
            }
            catch (IOException ioexception)
            {
                GamesLog.a("GamesClientImpl", "IOException:", ioexception);
            }
        }

        Iv.clear();
    }

    private void gk()
    {
        Iw = null;
    }

    protected IGamesService L(IBinder ibinder)
    {
        return IGamesService.Stub.N(ibinder);
    }

    public int a(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback, byte abyte0[], String s, String s1)
    {
        int i1;
        try
        {
            i1 = ((IGamesService)eM()).a(new RealTimeReliableMessageBinderCallbacks(reliablemessagesentcallback), abyte0, s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public int a(byte abyte0[], String s, String as[])
    {
        fq.b(as, "Participant IDs must not be null");
        int i1;
        try
        {
            i1 = ((IGamesService)eM()).b(abyte0, s, as);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.g("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public Intent a(int i1, int j1, boolean flag)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)eM()).a(i1, j1, flag);
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent a(int i1, byte abyte0[], int j1, Bitmap bitmap, String s)
    {
        try
        {
            abyte0 = ((IGamesService)eM()).a(i1, abyte0, j1, s);
            fq.b(bitmap, "Must provide a non null icon");
            abyte0.putExtra("com.google.android.gms.games.REQUEST_ITEM_ICON", bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return abyte0;
    }

    public Intent a(Room room, int i1)
    {
        try
        {
            room = ((IGamesService)eM()).a((RoomEntity)room.freeze(), i1);
        }
        // Misplaced declaration of an exception variable
        catch (Room room)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return room;
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle)
    {
        if (i1 == 0 && bundle != null)
        {
            Iz = bundle.getBoolean("show_welcome_popup");
        }
        super.a(i1, ibinder, bundle);
    }

    public void a(IBinder ibinder, Bundle bundle)
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        ((IGamesService)eM()).a(ibinder, bundle);
        return;
        ibinder;
        GamesLog.g("GamesClientImpl", "service died");
        return;
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i1, int j1, int k1)
    {
        try
        {
            ((IGamesService)eM()).a(new RequestsLoadedBinderCallbacks(d1), i1, j1, k1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i1, int j1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)eM()).a(new ExtendedGamesLoadedBinderCallback(d1), i1, j1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)eM()).a(new PlayersLoadedBinderCallback(d1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, int i1, int ai[])
    {
        try
        {
            ((IGamesService)eM()).a(new TurnBasedMatchesLoadedBinderCallbacks(d1), i1, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, LeaderboardScoreBuffer leaderboardscorebuffer, int i1, int j1)
    {
        try
        {
            ((IGamesService)eM()).a(new LeaderboardScoresLoadedBinderCallback(d1), leaderboardscorebuffer.hD().hE(), i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, TurnBasedMatchConfig turnbasedmatchconfig)
    {
        try
        {
            ((IGamesService)eM()).a(new TurnBasedMatchInitiatedBinderCallbacks(d1), turnbasedmatchconfig.getVariant(), turnbasedmatchconfig.getMinPlayers(), turnbasedmatchconfig.getInvitedPlayerIds(), turnbasedmatchconfig.getAutoMatchCriteria());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)eM()).a(new PlayersLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
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
            ((IGamesService)eM()).a(d1, s, i1, Iy.gU(), Iy.gT());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_59;
        d1 = new AchievementUpdatedBinderCallback(d1);
          goto _L1
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).a(new LeaderboardScoresLoadedBinderCallback(d1), s, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).a(new PlayersLoadedBinderCallback(d1), s, i1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1)
    {
        if (!s.equals("playedWith"))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid player collection: ").append(s).toString());
        }
        try
        {
            ((IGamesService)eM()).d(new PlayersLoadedBinderCallback(d1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        try
        {
            ((IGamesService)eM()).a(new ExtendedGamesLoadedBinderCallback(d1), s, i1, flag, flag1, flag2, flag3);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, int i1, int ai[])
    {
        try
        {
            ((IGamesService)eM()).a(new TurnBasedMatchesLoadedBinderCallbacks(d1), s, i1, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
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
            ((IGamesService)eM()).a(d1, s, l1, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_47;
        d1 = new SubmitScoreBinderCallbacks(d1);
          goto _L1
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1)
    {
        try
        {
            ((IGamesService)eM()).c(new TurnBasedMatchLeftBinderCallbacks(d1), s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, int i1, int j1)
    {
        try
        {
            ((IGamesService)eM()).a(new PlayerLeaderboardScoreLoadedBinderCallback(d1), s, s1, i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, int i1, int j1, int k1)
    {
        try
        {
            ((IGamesService)eM()).a(new RequestsLoadedBinderCallbacks(d1), s, s1, i1, j1, k1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).a(new LeaderboardScoresLoadedBinderCallback(d1), s, s1, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, int i1, boolean flag, boolean flag1)
    {
        if (!s.equals("playedWith") && !s.equals("circled"))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid player collection: ").append(s).toString());
        }
        try
        {
            ((IGamesService)eM()).a(new PlayersLoadedBinderCallback(d1), s, s1, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).b(new LeaderboardsLoadedBinderCallback(d1), s, s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String s1, String as[])
    {
        try
        {
            ((IGamesService)eM()).a(new RequestsUpdatedBinderCallbacks(d1), s, s1, as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).c(new LeaderboardsLoadedBinderCallback(d1), s, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[])
    {
        try
        {
            ((IGamesService)eM()).a(new TurnBasedMatchUpdatedBinderCallbacks(d1), s, abyte0, s1, aparticipantresult);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, byte abyte0[], ParticipantResult aparticipantresult[])
    {
        try
        {
            ((IGamesService)eM()).a(new TurnBasedMatchUpdatedBinderCallbacks(d1), s, abyte0, aparticipantresult);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String s, String as[], int i1, byte abyte0[], int j1)
    {
        try
        {
            ((IGamesService)eM()).a(new RequestSentBinderCallbacks(d1), s, as, i1, abyte0, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).c(new PlayersLoadedBinderCallback(d1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, boolean flag, Bundle bundle)
    {
        try
        {
            ((IGamesService)eM()).a(new ContactSettingsUpdatedBinderCallback(d1), flag, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(com.google.android.gms.common.api.a.d d1, String as[])
    {
        try
        {
            ((IGamesService)eM()).c(new PlayersLoadedBinderCallback(d1), as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        try
        {
            oninvitationreceivedlistener = new InvitationReceivedBinderCallback(oninvitationreceivedlistener);
            ((IGamesService)eM()).a(oninvitationreceivedlistener, IE);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(RoomConfig roomconfig)
    {
        try
        {
            RoomBinderCallbacks roombindercallbacks = new RoomBinderCallbacks(roomconfig.getRoomUpdateListener(), roomconfig.getRoomStatusUpdateListener(), roomconfig.getMessageReceivedListener());
            ((IGamesService)eM()).a(roombindercallbacks, IC, roomconfig.getVariant(), roomconfig.getInvitedPlayerIds(), roomconfig.getAutoMatchCriteria(), roomconfig.isSocketEnabled(), IE);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomConfig roomconfig)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(RoomUpdateListener roomupdatelistener, String s)
    {
        try
        {
            ((IGamesService)eM()).c(new RoomBinderCallbacks(roomupdatelistener), s);
            gE();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomUpdateListener roomupdatelistener)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
    {
        try
        {
            onturnbasedmatchupdatereceivedlistener = new MatchUpdateReceivedBinderCallback(onturnbasedmatchupdatereceivedlistener);
            ((IGamesService)eM()).b(onturnbasedmatchupdatereceivedlistener, IE);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void a(OnRequestReceivedListener onrequestreceivedlistener)
    {
        try
        {
            onrequestreceivedlistener = new RequestReceivedBinderCallback(onrequestreceivedlistener);
            ((IGamesService)eM()).c(onrequestreceivedlistener, IE);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnRequestReceivedListener onrequestreceivedlistener)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    protected void a(fm fm1, com.google.android.gms.internal.ff.e e1)
        throws RemoteException
    {
        String s = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", IF);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", IA);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", IB);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", IH);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", IG);
        fm1.a(e1, 0x43eea0, getContext().getPackageName(), wG, eL(), Iu, Iy.gU(), s, bundle);
    }

    public Intent aA(String s)
    {
        try
        {
            s = ((IGamesService)eM()).aA(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public void aB(String s)
    {
        try
        {
            ((IGamesService)eM()).aI(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void aX(int i1)
    {
        Iy.setGravity(i1);
    }

    public void aY(int i1)
    {
        try
        {
            ((IGamesService)eM()).aY(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public Intent b(int i1, int j1, boolean flag)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)eM()).b(i1, j1, flag);
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public void b(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((IGamesService)eM()).a(new SignOutCompleteBinderCallbacks(d1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)eM()).b(new PlayersLoadedBinderCallback(d1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
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
            ((IGamesService)eM()).a(d1, s, Iy.gU(), Iy.gT());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
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
            ((IGamesService)eM()).b(d1, s, i1, Iy.gU(), Iy.gT());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_59;
        d1 = new AchievementUpdatedBinderCallback(d1);
          goto _L1
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).b(new LeaderboardScoresLoadedBinderCallback(d1), s, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)eM()).a(new ExtendedGamesLoadedBinderCallback(d1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, String s1)
    {
        try
        {
            ((IGamesService)eM()).d(new TurnBasedMatchInitiatedBinderCallbacks(d1), s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, String s1, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).b(new LeaderboardScoresLoadedBinderCallback(d1), s, s1, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, String s1, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).a(new AchievementsLoadedBinderCallback(d1), s, s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String s, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).d(new LeaderboardsLoadedBinderCallback(d1), s, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).b(new LeaderboardsLoadedBinderCallback(d1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void b(com.google.android.gms.common.api.a.d d1, String as[])
    {
        try
        {
            ((IGamesService)eM()).a(new RequestsUpdatedBinderCallbacks(d1), as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void b(RoomConfig roomconfig)
    {
        try
        {
            RoomBinderCallbacks roombindercallbacks = new RoomBinderCallbacks(roomconfig.getRoomUpdateListener(), roomconfig.getRoomStatusUpdateListener(), roomconfig.getMessageReceivedListener());
            ((IGamesService)eM()).a(roombindercallbacks, IC, roomconfig.getInvitationId(), roomconfig.isSocketEnabled(), IE);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomConfig roomconfig)
        {
            GamesLog.g("GamesClientImpl", "service died");
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
            fq.a(flag1, String.format("Cannot have both %s and %s!", new Object[] {
                "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"
            }));
            return;
        } else
        {
            fq.a(flag1, String.format("Games APIs requires %s to function.", new Object[] {
                "https://www.googleapis.com/auth/games"
            }));
            return;
        }
    }

    protected String bg()
    {
        return "com.google.android.gms.games.service.START";
    }

    protected String bh()
    {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    public void c(com.google.android.gms.common.api.a.d d1, int i1)
    {
        try
        {
            ((IGamesService)eM()).a(new InvitationsLoadedBinderCallback(d1), i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)eM()).c(new PlayersLoadedBinderCallback(d1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
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
            ((IGamesService)eM()).b(d1, s, Iy.gU(), Iy.gT());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
        break MISSING_BLOCK_LABEL_58;
        d1 = new AchievementUpdatedBinderCallback(d1);
          goto _L1
    }

    public void c(com.google.android.gms.common.api.a.d d1, String s, int i1)
    {
        try
        {
            ((IGamesService)eM()).b(new InvitationsLoadedBinderCallback(d1), s, i1, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)eM()).c(new ExtendedGamesLoadedBinderCallback(d1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, String s, String s1)
    {
        try
        {
            ((IGamesService)eM()).e(new TurnBasedMatchInitiatedBinderCallbacks(d1), s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, String s, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).a(new GameMuteStatusChangedBinderCallback(d1), s, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, boolean flag)
    {
        try
        {
            ((IGamesService)eM()).a(new AchievementsLoadedBinderCallback(d1), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void c(com.google.android.gms.common.api.a.d d1, String as[])
    {
        try
        {
            ((IGamesService)eM()).b(new RequestsUpdatedBinderCallbacks(d1), as);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void connect()
    {
        gk();
        super.connect();
    }

    public int d(byte abyte0[], String s)
    {
        int i1;
        try
        {
            i1 = ((IGamesService)eM()).b(abyte0, s, null);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.g("GamesClientImpl", "service died");
            return -1;
        }
        return i1;
    }

    public void d(com.google.android.gms.common.api.a.d d1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)eM()).e(new PlayersLoadedBinderCallback(d1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)eM()).l(new TurnBasedMatchInitiatedBinderCallbacks(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.a.d d1, String s, int i1)
    {
        try
        {
            ((IGamesService)eM()).a(new RequestSummariesLoadedBinderCallbacks(d1), s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void d(com.google.android.gms.common.api.a.d d1, String s, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)eM()).b(new PlayersLoadedBinderCallback(d1), s, i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public Bundle dG()
    {
        Bundle bundle;
        try
        {
            bundle = ((IGamesService)eM()).dG();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        bundle.setClassLoader(com/google/android/gms/games/internal/GamesClientImpl.getClassLoader());
        return bundle;
    }

    public void disconnect()
    {
        Iz = false;
        if (isConnected())
        {
            try
            {
                IGamesService igamesservice = (IGamesService)eM();
                igamesservice.gF();
                igamesservice.o(IE);
            }
            catch (RemoteException remoteexception)
            {
                GamesLog.g("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        gE();
        super.disconnect();
    }

    public void e(com.google.android.gms.common.api.a.d d1, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((IGamesService)eM()).d(new ExtendedPlayersLoadedBinderCallback(d1), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void e(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)eM()).m(new TurnBasedMatchInitiatedBinderCallbacks(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void f(View view)
    {
        Iy.g(view);
    }

    public void f(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)eM()).o(new TurnBasedMatchLeftBinderCallbacks(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void g(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((IGamesService)eM()).d(new GamesLoadedBinderCallback(d1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void g(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)eM()).n(new TurnBasedMatchCanceledBinderCallbacks(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public int gA()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)eM()).gA();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return 2;
        }
        return i1;
    }

    public Intent gB()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)eM()).gB();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public int gC()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)eM()).gC();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return 2;
        }
        return i1;
    }

    public int gD()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)eM()).gD();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return 2;
        }
        return i1;
    }

    public void gF()
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_19;
        }
        ((IGamesService)eM()).gF();
        return;
        RemoteException remoteexception;
        remoteexception;
        GamesLog.g("GamesClientImpl", "service died");
        return;
    }

    public String gl()
    {
        String s;
        try
        {
            s = ((IGamesService)eM()).gl();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public String gm()
    {
        String s;
        try
        {
            s = ((IGamesService)eM()).gm();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public Player gn()
    {
        bT();
        this;
        JVM INSTR monitorenter ;
        Object obj = Iw;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new PlayerBuffer(((IGamesService)eM()).gG());
        if (((PlayerBuffer) (obj)).getCount() > 0)
        {
            Iw = (PlayerEntity)((PlayerBuffer) (obj)).get(0).freeze();
        }
        ((PlayerBuffer) (obj)).close();
_L1:
        this;
        JVM INSTR monitorexit ;
        return Iw;
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
        GamesLog.g("GamesClientImpl", "service died");
          goto _L1
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Game go()
    {
        bT();
        this;
        JVM INSTR monitorenter ;
        Object obj = Ix;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new GameBuffer(((IGamesService)eM()).gI());
        if (((GameBuffer) (obj)).getCount() > 0)
        {
            Ix = (GameEntity)((GameBuffer) (obj)).get(0).freeze();
        }
        ((GameBuffer) (obj)).close();
_L1:
        this;
        JVM INSTR monitorexit ;
        return Ix;
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
        GamesLog.g("GamesClientImpl", "service died");
          goto _L1
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Intent gp()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)eM()).gp();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent gq()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)eM()).gq();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent gr()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)eM()).gr();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent gs()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)eM()).gs();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public void gt()
    {
        try
        {
            ((IGamesService)eM()).p(IE);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void gu()
    {
        try
        {
            ((IGamesService)eM()).q(IE);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void gv()
    {
        try
        {
            ((IGamesService)eM()).r(IE);
            return;
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public Intent gw()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)eM()).gw();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public Intent gx()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)eM()).gx();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return intent;
    }

    public int gy()
    {
        int i1;
        try
        {
            i1 = ((IGamesService)eM()).gy();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return 4368;
        }
        return i1;
    }

    public String gz()
    {
        String s;
        try
        {
            s = ((IGamesService)eM()).gz();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.g("GamesClientImpl", "service died");
            return null;
        }
        return s;
    }

    public void h(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((IGamesService)eM()).j(new OwnerCoverPhotoUrisLoadedBinderCallback(d1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void h(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)eM()).p(new TurnBasedMatchLoadedBinderCallbacks(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public RealTimeSocket i(String s, String s1)
    {
label0:
        {
            if (s1 == null || !ParticipantUtils.aV(s1))
            {
                throw new IllegalArgumentException("Bad participant ID");
            }
            RealTimeSocket realtimesocket = (RealTimeSocket)Iv.get(s1);
            if (realtimesocket != null)
            {
                s = realtimesocket;
                if (!realtimesocket.isClosed())
                {
                    break label0;
                }
            }
            s = aC(s1);
        }
        return s;
    }

    public void i(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((IGamesService)eM()).h(new NotifyAclLoadedBinderCallback(d1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void i(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)eM()).e(new ExtendedGamesLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void j(com.google.android.gms.common.api.a.d d1)
    {
        try
        {
            ((IGamesService)eM()).i(new ContactSettingsLoadedBinderCallback(d1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void j(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)eM()).f(new GameInstancesLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void k(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)eM()).q(new GameSearchSuggestionsLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void l(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)eM()).k(new InvitationsLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void l(String s, int i1)
    {
        try
        {
            ((IGamesService)eM()).l(s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void m(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)eM()).j(new NotifyAclUpdatedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void m(String s, int i1)
    {
        try
        {
            ((IGamesService)eM()).m(s, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void n(com.google.android.gms.common.api.a.d d1, String s)
    {
        try
        {
            ((IGamesService)eM()).i(new GameMuteStatusLoadedBinderCallback(d1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.a.d d1)
        {
            GamesLog.g("GamesClientImpl", "service died");
        }
    }

    public void onConnected(Bundle bundle)
    {
        if (Iz)
        {
            Iy.gS();
            Iz = false;
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Iz = false;
    }

    public void onConnectionSuspended(int i1)
    {
    }

    protected IInterface r(IBinder ibinder)
    {
        return L(ibinder);
    }
}
