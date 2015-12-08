// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.OnGamesLoadedListener;
import com.google.android.gms.games.OnPlayersLoadedListener;
import com.google.android.gms.games.OnSignOutCompleteListener;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.OnAchievementUpdatedListener;
import com.google.android.gms.games.achievement.OnAchievementsLoadedListener;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.OnLeaderboardMetadataLoadedListener;
import com.google.android.gms.games.leaderboard.OnLeaderboardScoresLoadedListener;
import com.google.android.gms.games.leaderboard.OnScoreSubmittedListener;
import com.google.android.gms.games.leaderboard.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.b;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.OnInvitationsLoadedListener;
import com.google.android.gms.games.multiplayer.ParticipantUtils;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeReliableMessageSentListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            de, dm, es, er, 
//            ep, et, dj, eo, 
//            el

public final class em extends de
{
    abstract class a extends c
    {

        private final ArrayList mO = new ArrayList();
        final em mP;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            a(roomstatusupdatelistener, room, mO);
        }

        protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist);

        a(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1, String as[])
        {
            mP = em.this;
            super(roomstatusupdatelistener, d1);
            int i1 = 0;
            for (int j1 = as.length; i1 < j1; i1++)
            {
                mO.add(as[i1]);
            }

        }
    }

    final class aa extends a
    {

        final em mP;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersDisconnected(room, arraylist);
        }

        aa(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1, String as[])
        {
            mP = em.this;
            super(roomstatusupdatelistener, d1, as);
        }
    }

    final class ab extends a
    {

        final em mP;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerInvitedToRoom(room, arraylist);
        }

        ab(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1, String as[])
        {
            mP = em.this;
            super(roomstatusupdatelistener, d1, as);
        }
    }

    final class ac extends a
    {

        final em mP;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerJoined(room, arraylist);
        }

        ac(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1, String as[])
        {
            mP = em.this;
            super(roomstatusupdatelistener, d1, as);
        }
    }

    final class ad extends a
    {

        final em mP;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerLeft(room, arraylist);
        }

        ad(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1, String as[])
        {
            mP = em.this;
            super(roomstatusupdatelistener, d1, as);
        }
    }

    final class ae extends el
    {

        final em mP;
        private final OnPlayersLoadedListener ne;

        public void e(com.google.android.gms.common.data.d d1)
        {
            mP.a(mP. new af(ne, d1));
        }

        ae(OnPlayersLoadedListener onplayersloadedlistener)
        {
            mP = em.this;
            super();
            ne = (OnPlayersLoadedListener)com.google.android.gms.internal.dm.a(onplayersloadedlistener, "Listener must not be null");
        }
    }

    final class af extends de.c
    {

        final em mP;

        protected void a(OnPlayersLoadedListener onplayersloadedlistener, com.google.android.gms.common.data.d d1)
        {
            onplayersloadedlistener.onPlayersLoaded(d1.getStatusCode(), new PlayerBuffer(d1));
        }

        protected volatile void a(Object obj, com.google.android.gms.common.data.d d1)
        {
            a((OnPlayersLoadedListener)obj, d1);
        }

        af(OnPlayersLoadedListener onplayersloadedlistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(em.this, onplayersloadedlistener, d1);
        }
    }

    final class ag extends de.b
    {

        private final int iC;
        final em mP;
        private final String nf;
        private final int ng;

        public void a(RealTimeReliableMessageSentListener realtimereliablemessagesentlistener)
        {
            if (realtimereliablemessagesentlistener != null)
            {
                realtimereliablemessagesentlistener.onRealTimeMessageSent(iC, ng, nf);
            }
        }

        public volatile void a(Object obj)
        {
            a((RealTimeReliableMessageSentListener)obj);
        }

        protected void aF()
        {
        }

        ag(RealTimeReliableMessageSentListener realtimereliablemessagesentlistener, int i1, int j1, String s1)
        {
            mP = em.this;
            super(em.this, realtimereliablemessagesentlistener);
            iC = i1;
            ng = j1;
            nf = s1;
        }
    }

    final class ah extends el
    {

        final em mP;
        final RealTimeReliableMessageSentListener nh;

        public void a(int i1, int j1, String s1)
        {
            mP.a(mP. new ag(nh, i1, j1, s1));
        }

        public ah(RealTimeReliableMessageSentListener realtimereliablemessagesentlistener)
        {
            mP = em.this;
            super();
            nh = realtimereliablemessagesentlistener;
        }
    }

    final class ai extends c
    {

        final em mP;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomAutoMatching(room);
        }

        ai(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(roomstatusupdatelistener, d1);
        }
    }

    final class aj extends el
    {

        final em mP;
        private final RoomUpdateListener ni;
        private final RoomStatusUpdateListener nj;
        private final RealTimeMessageReceivedListener nk;

        public void a(com.google.android.gms.common.data.d d1, String as[])
        {
            mP.a(mP. new ab(nj, d1, as));
        }

        public void b(com.google.android.gms.common.data.d d1, String as[])
        {
            mP.a(mP. new ac(nj, d1, as));
        }

        public void c(com.google.android.gms.common.data.d d1, String as[])
        {
            mP.a(mP. new ad(nj, d1, as));
        }

        public void d(com.google.android.gms.common.data.d d1, String as[])
        {
            mP.a(mP. new z(nj, d1, as));
        }

        public void e(com.google.android.gms.common.data.d d1, String as[])
        {
            mP.a(mP. new y(nj, d1, as));
        }

        public void f(com.google.android.gms.common.data.d d1, String as[])
        {
            mP.a(mP. new aa(nj, d1, as));
        }

        public void n(com.google.android.gms.common.data.d d1)
        {
            mP.a(mP. new am(ni, d1));
        }

        public void o(com.google.android.gms.common.data.d d1)
        {
            mP.a(mP. new p(ni, d1));
        }

        public void onLeftRoom(int i1, String s1)
        {
            mP.a(mP. new u(ni, i1, s1));
        }

        public void onP2PConnected(String s1)
        {
            mP.a(mP. new w(nj, s1));
        }

        public void onP2PDisconnected(String s1)
        {
            mP.a(mP. new x(nj, s1));
        }

        public void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
        {
            com.google.android.gms.internal.ep.b("GamesClient", "RoomBinderCallbacks: onRealTimeMessageReceived");
            mP.a(mP. new v(nk, realtimemessage));
        }

        public void p(com.google.android.gms.common.data.d d1)
        {
            mP.a(mP. new al(nj, d1));
        }

        public void q(com.google.android.gms.common.data.d d1)
        {
            mP.a(mP. new ai(nj, d1));
        }

        public void r(com.google.android.gms.common.data.d d1)
        {
            mP.a(mP. new ak(ni, d1));
        }

        public void s(com.google.android.gms.common.data.d d1)
        {
            mP.a(mP. new h(nj, d1));
        }

        public void t(com.google.android.gms.common.data.d d1)
        {
            mP.a(mP. new i(nj, d1));
        }

        public aj(RoomUpdateListener roomupdatelistener)
        {
            mP = em.this;
            super();
            ni = (RoomUpdateListener)com.google.android.gms.internal.dm.a(roomupdatelistener, "Callbacks must not be null");
            nj = null;
            nk = null;
        }

        public aj(RoomUpdateListener roomupdatelistener, RoomStatusUpdateListener roomstatusupdatelistener, RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            mP = em.this;
            super();
            ni = (RoomUpdateListener)com.google.android.gms.internal.dm.a(roomupdatelistener, "Callbacks must not be null");
            nj = roomstatusupdatelistener;
            nk = realtimemessagereceivedlistener;
        }
    }

    final class ak extends b
    {

        final em mP;

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onRoomConnected(i1, room);
        }

        ak(RoomUpdateListener roomupdatelistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(roomupdatelistener, d1);
        }
    }

    final class al extends c
    {

        final em mP;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomConnecting(room);
        }

        al(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(roomstatusupdatelistener, d1);
        }
    }

    final class am extends b
    {

        final em mP;

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onRoomCreated(i1, room);
        }

        public am(RoomUpdateListener roomupdatelistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(roomupdatelistener, d1);
        }
    }

    final class an extends el
    {

        final em mP;
        private final OnSignOutCompleteListener nl;

        public void onSignOutComplete()
        {
            mP.a(mP. new ao(nl));
        }

        public an(OnSignOutCompleteListener onsignoutcompletelistener)
        {
            mP = em.this;
            super();
            nl = (OnSignOutCompleteListener)com.google.android.gms.internal.dm.a(onsignoutcompletelistener, "Listener must not be null");
        }
    }

    final class ao extends de.b
    {

        final em mP;

        public void a(OnSignOutCompleteListener onsignoutcompletelistener)
        {
            onsignoutcompletelistener.onSignOutComplete();
        }

        public volatile void a(Object obj)
        {
            a((OnSignOutCompleteListener)obj);
        }

        protected void aF()
        {
        }

        public ao(OnSignOutCompleteListener onsignoutcompletelistener)
        {
            mP = em.this;
            super(em.this, onsignoutcompletelistener);
        }
    }

    final class ap extends el
    {

        final em mP;
        private final OnScoreSubmittedListener nm;

        public void d(com.google.android.gms.common.data.d d1)
        {
            d1 = new SubmitScoreResult(d1);
            mP.a(mP. new aq(nm, d1));
        }

        public ap(OnScoreSubmittedListener onscoresubmittedlistener)
        {
            mP = em.this;
            super();
            nm = (OnScoreSubmittedListener)com.google.android.gms.internal.dm.a(onscoresubmittedlistener, "Listener must not be null");
        }
    }

    final class aq extends de.b
    {

        final em mP;
        private final SubmitScoreResult nn;

        public void a(OnScoreSubmittedListener onscoresubmittedlistener)
        {
            onscoresubmittedlistener.onScoreSubmitted(nn.getStatusCode(), nn);
        }

        public volatile void a(Object obj)
        {
            a((OnScoreSubmittedListener)obj);
        }

        protected void aF()
        {
        }

        public aq(OnScoreSubmittedListener onscoresubmittedlistener, SubmitScoreResult submitscoreresult)
        {
            mP = em.this;
            super(em.this, onscoresubmittedlistener);
            nn = submitscoreresult;
        }
    }

    abstract class b extends de.c
    {

        final em mP;

        protected void a(RoomUpdateListener roomupdatelistener, com.google.android.gms.common.data.d d1)
        {
            a(roomupdatelistener, com.google.android.gms.internal.em.a(mP, d1), d1.getStatusCode());
        }

        protected abstract void a(RoomUpdateListener roomupdatelistener, Room room, int i1);

        protected volatile void a(Object obj, com.google.android.gms.common.data.d d1)
        {
            a((RoomUpdateListener)obj, d1);
        }

        b(RoomUpdateListener roomupdatelistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(em.this, roomupdatelistener, d1);
        }
    }

    abstract class c extends de.c
    {

        final em mP;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1)
        {
            a(roomstatusupdatelistener, com.google.android.gms.internal.em.a(mP, d1));
        }

        protected abstract void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

        protected volatile void a(Object obj, com.google.android.gms.common.data.d d1)
        {
            a((RoomStatusUpdateListener)obj, d1);
        }

        c(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(em.this, roomstatusupdatelistener, d1);
        }
    }

    final class d extends el
    {

        final em mP;
        private final OnAchievementUpdatedListener mQ;

        public void onAchievementUpdated(int i1, String s1)
        {
            mP.a(mP. new e(mQ, i1, s1));
        }

        d(OnAchievementUpdatedListener onachievementupdatedlistener)
        {
            mP = em.this;
            super();
            mQ = (OnAchievementUpdatedListener)com.google.android.gms.internal.dm.a(onachievementupdatedlistener, "Listener must not be null");
        }
    }

    final class e extends de.b
    {

        private final int iC;
        final em mP;
        private final String mR;

        protected void a(OnAchievementUpdatedListener onachievementupdatedlistener)
        {
            onachievementupdatedlistener.onAchievementUpdated(iC, mR);
        }

        protected volatile void a(Object obj)
        {
            a((OnAchievementUpdatedListener)obj);
        }

        protected void aF()
        {
        }

        e(OnAchievementUpdatedListener onachievementupdatedlistener, int i1, String s1)
        {
            mP = em.this;
            super(em.this, onachievementupdatedlistener);
            iC = i1;
            mR = s1;
        }
    }

    final class f extends el
    {

        final em mP;
        private final OnAchievementsLoadedListener mS;

        public void b(com.google.android.gms.common.data.d d1)
        {
            mP.a(mP. new g(mS, d1));
        }

        f(OnAchievementsLoadedListener onachievementsloadedlistener)
        {
            mP = em.this;
            super();
            mS = (OnAchievementsLoadedListener)com.google.android.gms.internal.dm.a(onachievementsloadedlistener, "Listener must not be null");
        }
    }

    final class g extends de.c
    {

        final em mP;

        protected void a(OnAchievementsLoadedListener onachievementsloadedlistener, com.google.android.gms.common.data.d d1)
        {
            onachievementsloadedlistener.onAchievementsLoaded(d1.getStatusCode(), new AchievementBuffer(d1));
        }

        protected volatile void a(Object obj, com.google.android.gms.common.data.d d1)
        {
            a((OnAchievementsLoadedListener)obj, d1);
        }

        g(OnAchievementsLoadedListener onachievementsloadedlistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(em.this, onachievementsloadedlistener, d1);
        }
    }

    final class h extends c
    {

        final em mP;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onConnectedToRoom(room);
        }

        h(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(roomstatusupdatelistener, d1);
        }
    }

    final class i extends c
    {

        final em mP;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onDisconnectedFromRoom(room);
        }

        i(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(roomstatusupdatelistener, d1);
        }
    }

    final class j extends el
    {

        final em mP;
        private final OnGamesLoadedListener mT;

        public void g(com.google.android.gms.common.data.d d1)
        {
            mP.a(mP. new k(mT, d1));
        }

        j(OnGamesLoadedListener ongamesloadedlistener)
        {
            mP = em.this;
            super();
            mT = (OnGamesLoadedListener)com.google.android.gms.internal.dm.a(ongamesloadedlistener, "Listener must not be null");
        }
    }

    final class k extends de.c
    {

        final em mP;

        protected void a(OnGamesLoadedListener ongamesloadedlistener, com.google.android.gms.common.data.d d1)
        {
            ongamesloadedlistener.onGamesLoaded(d1.getStatusCode(), new GameBuffer(d1));
        }

        protected volatile void a(Object obj, com.google.android.gms.common.data.d d1)
        {
            a((OnGamesLoadedListener)obj, d1);
        }

        k(OnGamesLoadedListener ongamesloadedlistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(em.this, ongamesloadedlistener, d1);
        }
    }

    final class l extends el
    {

        final em mP;
        private final OnInvitationReceivedListener mU;

        public void k(com.google.android.gms.common.data.d d1)
        {
            InvitationBuffer invitationbuffer;
            invitationbuffer = new InvitationBuffer(d1);
            d1 = null;
            if (invitationbuffer.getCount() > 0)
            {
                d1 = (Invitation)((Invitation)invitationbuffer.get(0)).freeze();
            }
            invitationbuffer.close();
            if (d1 != null)
            {
                mP.a(mP. new m(mU, d1));
            }
            return;
            d1;
            invitationbuffer.close();
            throw d1;
        }

        l(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            mP = em.this;
            super();
            mU = oninvitationreceivedlistener;
        }
    }

    final class m extends de.b
    {

        final em mP;
        private final Invitation mV;

        protected void a(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationReceived(mV);
        }

        protected volatile void a(Object obj)
        {
            a((OnInvitationReceivedListener)obj);
        }

        protected void aF()
        {
        }

        m(OnInvitationReceivedListener oninvitationreceivedlistener, Invitation invitation)
        {
            mP = em.this;
            super(em.this, oninvitationreceivedlistener);
            mV = invitation;
        }
    }

    final class n extends el
    {

        final em mP;
        private final OnInvitationsLoadedListener mW;

        public void j(com.google.android.gms.common.data.d d1)
        {
            mP.a(mP. new o(mW, d1));
        }

        n(OnInvitationsLoadedListener oninvitationsloadedlistener)
        {
            mP = em.this;
            super();
            mW = oninvitationsloadedlistener;
        }
    }

    final class o extends de.c
    {

        final em mP;

        protected void a(OnInvitationsLoadedListener oninvitationsloadedlistener, com.google.android.gms.common.data.d d1)
        {
            oninvitationsloadedlistener.onInvitationsLoaded(d1.getStatusCode(), new InvitationBuffer(d1));
        }

        protected volatile void a(Object obj, com.google.android.gms.common.data.d d1)
        {
            a((OnInvitationsLoadedListener)obj, d1);
        }

        o(OnInvitationsLoadedListener oninvitationsloadedlistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(em.this, oninvitationsloadedlistener, d1);
        }
    }

    final class p extends b
    {

        final em mP;

        public void a(RoomUpdateListener roomupdatelistener, Room room, int i1)
        {
            roomupdatelistener.onJoinedRoom(i1, room);
        }

        public p(RoomUpdateListener roomupdatelistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(roomupdatelistener, d1);
        }
    }

    final class q extends el
    {

        final em mP;
        private final OnLeaderboardScoresLoadedListener mX;

        public void a(com.google.android.gms.common.data.d d1, com.google.android.gms.common.data.d d2)
        {
            mP.a(mP. new r(mX, d1, d2));
        }

        q(OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener)
        {
            mP = em.this;
            super();
            mX = (OnLeaderboardScoresLoadedListener)com.google.android.gms.internal.dm.a(onleaderboardscoresloadedlistener, "Listener must not be null");
        }
    }

    final class r extends de.b
    {

        final em mP;
        private final com.google.android.gms.common.data.d mY;
        private final com.google.android.gms.common.data.d mZ;

        protected void a(OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener)
        {
            com.google.android.gms.common.data.d d1;
            Object obj;
            com.google.android.gms.common.data.d d2;
            obj = null;
            d1 = mY;
            d2 = mZ;
            if (onleaderboardscoresloadedlistener == null) goto _L2; else goto _L1
_L1:
            LeaderboardBuffer leaderboardbuffer = new LeaderboardBuffer(d1);
            LeaderboardScoreBuffer leaderboardscorebuffer = new LeaderboardScoreBuffer(d2);
            onleaderboardscoresloadedlistener.onLeaderboardScoresLoaded(d2.getStatusCode(), leaderboardbuffer, leaderboardscorebuffer);
            d1 = null;
            onleaderboardscoresloadedlistener = obj;
_L4:
            if (d1 != null)
            {
                d1.close();
            }
            if (onleaderboardscoresloadedlistener != null)
            {
                onleaderboardscoresloadedlistener.close();
            }
            return;
            onleaderboardscoresloadedlistener;
            if (d1 != null)
            {
                d1.close();
            }
            if (d2 != null)
            {
                d2.close();
            }
            throw onleaderboardscoresloadedlistener;
_L2:
            onleaderboardscoresloadedlistener = d2;
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected volatile void a(Object obj)
        {
            a((OnLeaderboardScoresLoadedListener)obj);
        }

        protected void aF()
        {
            if (mY != null)
            {
                mY.close();
            }
            if (mZ != null)
            {
                mZ.close();
            }
        }

        r(OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener, com.google.android.gms.common.data.d d1, com.google.android.gms.common.data.d d2)
        {
            mP = em.this;
            super(em.this, onleaderboardscoresloadedlistener);
            mY = d1;
            mZ = d2;
        }
    }

    final class s extends el
    {

        final em mP;
        private final OnLeaderboardMetadataLoadedListener na;

        public void c(com.google.android.gms.common.data.d d1)
        {
            mP.a(mP. new t(na, d1));
        }

        s(OnLeaderboardMetadataLoadedListener onleaderboardmetadataloadedlistener)
        {
            mP = em.this;
            super();
            na = (OnLeaderboardMetadataLoadedListener)com.google.android.gms.internal.dm.a(onleaderboardmetadataloadedlistener, "Listener must not be null");
        }
    }

    final class t extends de.c
    {

        final em mP;

        protected void a(OnLeaderboardMetadataLoadedListener onleaderboardmetadataloadedlistener, com.google.android.gms.common.data.d d1)
        {
            onleaderboardmetadataloadedlistener.onLeaderboardMetadataLoaded(d1.getStatusCode(), new LeaderboardBuffer(d1));
        }

        protected volatile void a(Object obj, com.google.android.gms.common.data.d d1)
        {
            a((OnLeaderboardMetadataLoadedListener)obj, d1);
        }

        t(OnLeaderboardMetadataLoadedListener onleaderboardmetadataloadedlistener, com.google.android.gms.common.data.d d1)
        {
            mP = em.this;
            super(em.this, onleaderboardmetadataloadedlistener, d1);
        }
    }

    final class u extends de.b
    {

        private final int iC;
        final em mP;
        private final String nb;

        public void a(RoomUpdateListener roomupdatelistener)
        {
            roomupdatelistener.onLeftRoom(iC, nb);
        }

        public volatile void a(Object obj)
        {
            a((RoomUpdateListener)obj);
        }

        protected void aF()
        {
        }

        u(RoomUpdateListener roomupdatelistener, int i1, String s1)
        {
            mP = em.this;
            super(em.this, roomupdatelistener);
            iC = i1;
            nb = s1;
        }
    }

    final class v extends de.b
    {

        final em mP;
        private final RealTimeMessage nc;

        public void a(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            com.google.android.gms.internal.ep.b("GamesClient", "Deliver Message received callback");
            if (realtimemessagereceivedlistener != null)
            {
                realtimemessagereceivedlistener.onRealTimeMessageReceived(nc);
            }
        }

        public volatile void a(Object obj)
        {
            a((RealTimeMessageReceivedListener)obj);
        }

        protected void aF()
        {
        }

        v(RealTimeMessageReceivedListener realtimemessagereceivedlistener, RealTimeMessage realtimemessage)
        {
            mP = em.this;
            super(em.this, realtimemessagereceivedlistener);
            nc = realtimemessage;
        }
    }

    final class w extends de.b
    {

        final em mP;
        private final String nd;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            if (roomstatusupdatelistener != null)
            {
                roomstatusupdatelistener.onP2PConnected(nd);
            }
        }

        public volatile void a(Object obj)
        {
            a((RoomStatusUpdateListener)obj);
        }

        protected void aF()
        {
        }

        w(RoomStatusUpdateListener roomstatusupdatelistener, String s1)
        {
            mP = em.this;
            super(em.this, roomstatusupdatelistener);
            nd = s1;
        }
    }

    final class x extends de.b
    {

        final em mP;
        private final String nd;

        public void a(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            if (roomstatusupdatelistener != null)
            {
                roomstatusupdatelistener.onP2PDisconnected(nd);
            }
        }

        public volatile void a(Object obj)
        {
            a((RoomStatusUpdateListener)obj);
        }

        protected void aF()
        {
        }

        x(RoomStatusUpdateListener roomstatusupdatelistener, String s1)
        {
            mP = em.this;
            super(em.this, roomstatusupdatelistener);
            nd = s1;
        }
    }

    final class y extends a
    {

        final em mP;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersConnected(room, arraylist);
        }

        y(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1, String as[])
        {
            mP = em.this;
            super(roomstatusupdatelistener, d1, as);
        }
    }

    final class z extends a
    {

        final em mP;

        protected void a(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerDeclined(room, arraylist);
        }

        z(RoomStatusUpdateListener roomstatusupdatelistener, com.google.android.gms.common.data.d d1, String as[])
        {
            mP = em.this;
            super(roomstatusupdatelistener, d1, as);
        }
    }


    private final String it;
    private final String mF;
    private final Map mG = new HashMap();
    private PlayerEntity mH;
    private GameEntity mI;
    private final es mJ;
    private boolean mK;
    private final Binder mL = new Binder();
    private final long mM = (long)hashCode();
    private final boolean mN;

    public em(Context context, String s1, String s2, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String as[], int i1, 
            View view, boolean flag)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, as);
        mK = false;
        mF = s1;
        it = (String)dm.e(s2);
        mJ = com.google.android.gms.internal.es.a(this, i1);
        setViewForPopups(view);
        mN = flag;
    }

    private et K(String s1)
    {
        Object obj;
        LocalSocket localsocket;
        try
        {
            obj = ((er)bd()).M(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.google.android.gms.internal.ep.d("GamesClient", "Unable to create socket. Service died.");
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        ep.e("GamesClient", (new StringBuilder()).append("Creating a socket to bind to:").append(((String) (obj))).toString());
        localsocket = new LocalSocket();
        localsocket.connect(new LocalSocketAddress(((String) (obj))));
        obj = new et(localsocket, s1);
        mG.put(s1, obj);
        return ((et) (obj));
        s1;
        com.google.android.gms.internal.ep.d("GamesClient", (new StringBuilder()).append("connect() call failed on socket: ").append(s1.getMessage()).toString());
        return null;
    }

    static Room a(em em1, com.google.android.gms.common.data.d d1)
    {
        return em1.x(d1);
    }

    private void bR()
    {
        mH = null;
    }

    private void bS()
    {
        for (Iterator iterator = mG.values().iterator(); iterator.hasNext();)
        {
            et et1 = (et)iterator.next();
            try
            {
                et1.close();
            }
            catch (IOException ioexception)
            {
                com.google.android.gms.internal.ep.a("GamesClient", "IOException:", ioexception);
            }
        }

        mG.clear();
    }

    private Room x(com.google.android.gms.common.data.d d1)
    {
        com.google.android.gms.games.multiplayer.realtime.a a1;
        a1 = new com.google.android.gms.games.multiplayer.realtime.a(d1);
        d1 = null;
        if (a1.getCount() > 0)
        {
            d1 = (Room)((Room)a1.get(0)).freeze();
        }
        a1.close();
        return d1;
        d1;
        a1.close();
        throw d1;
    }

    protected er A(IBinder ibinder)
    {
        return er.a.C(ibinder);
    }

    public int a(byte abyte0[], String s1, String as[])
    {
        com.google.android.gms.internal.dm.a(as, "Participant IDs must not be null");
        int i1;
        try
        {
            i1 = ((er)bd()).b(abyte0, s1, as);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ep.c("GamesClient", "service died");
            return -1;
        }
        return i1;
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle)
    {
        if (i1 == 0 && bundle != null)
        {
            mK = bundle.getBoolean("show_welcome_popup");
        }
        super.a(i1, ibinder, bundle);
    }

    public void a(IBinder ibinder, Bundle bundle)
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        ((er)bd()).a(ibinder, bundle);
        return;
        ibinder;
        ep.c("GamesClient", "service died");
        return;
    }

    protected void a(ConnectionResult connectionresult)
    {
        super.a(connectionresult);
        mK = false;
    }

    public void a(OnPlayersLoadedListener onplayersloadedlistener, int i1, boolean flag, boolean flag1)
    {
        try
        {
            ((er)bd()).a(new ae(onplayersloadedlistener), i1, flag, flag1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnPlayersLoadedListener onplayersloadedlistener)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void a(OnAchievementUpdatedListener onachievementupdatedlistener, String s1)
    {
        if (onachievementupdatedlistener != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        onachievementupdatedlistener = null;
_L1:
        try
        {
            ((er)bd()).a(onachievementupdatedlistener, s1, mJ.bZ(), mJ.bY());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnAchievementUpdatedListener onachievementupdatedlistener)
        {
            ep.c("GamesClient", "service died");
        }
        break MISSING_BLOCK_LABEL_57;
        onachievementupdatedlistener = new d(onachievementupdatedlistener);
          goto _L1
    }

    public void a(OnAchievementUpdatedListener onachievementupdatedlistener, String s1, int i1)
    {
        if (onachievementupdatedlistener != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        onachievementupdatedlistener = null;
_L1:
        try
        {
            ((er)bd()).a(onachievementupdatedlistener, s1, i1, mJ.bZ(), mJ.bY());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnAchievementUpdatedListener onachievementupdatedlistener)
        {
            ep.c("GamesClient", "service died");
        }
        break MISSING_BLOCK_LABEL_58;
        onachievementupdatedlistener = new d(onachievementupdatedlistener);
          goto _L1
    }

    public void a(OnScoreSubmittedListener onscoresubmittedlistener, String s1, long l1, String s2)
    {
        if (onscoresubmittedlistener != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        onscoresubmittedlistener = null;
_L1:
        try
        {
            ((er)bd()).a(onscoresubmittedlistener, s1, l1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnScoreSubmittedListener onscoresubmittedlistener)
        {
            ep.c("GamesClient", "service died");
        }
        break MISSING_BLOCK_LABEL_46;
        onscoresubmittedlistener = new ap(onscoresubmittedlistener);
          goto _L1
    }

    protected void a(dj dj1, de.d d1)
        throws RemoteException
    {
        String s1 = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", mN);
        dj1.a(d1, 0x3d8024, getContext().getPackageName(), it, aY(), mF, mJ.bZ(), s1, bundle);
    }

    protected transient void a(String as[])
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
            com.google.android.gms.internal.dm.a(flag1, String.format("Cannot have both %s and %s!", new Object[] {
                "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"
            }));
            return;
        } else
        {
            com.google.android.gms.internal.dm.a(flag1, String.format("GamesClient requires %s to function.", new Object[] {
                "https://www.googleapis.com/auth/games"
            }));
            return;
        }
    }

    protected void aZ()
    {
        super.aZ();
        if (mK)
        {
            mJ.bX();
            mK = false;
        }
    }

    protected String ag()
    {
        return "com.google.android.gms.games.service.START";
    }

    protected String ah()
    {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    public void b(OnAchievementUpdatedListener onachievementupdatedlistener, String s1)
    {
        if (onachievementupdatedlistener != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        onachievementupdatedlistener = null;
_L1:
        try
        {
            ((er)bd()).b(onachievementupdatedlistener, s1, mJ.bZ(), mJ.bY());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnAchievementUpdatedListener onachievementupdatedlistener)
        {
            ep.c("GamesClient", "service died");
        }
        break MISSING_BLOCK_LABEL_57;
        onachievementupdatedlistener = new d(onachievementupdatedlistener);
          goto _L1
    }

    public void b(OnAchievementUpdatedListener onachievementupdatedlistener, String s1, int i1)
    {
        if (onachievementupdatedlistener != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        onachievementupdatedlistener = null;
_L1:
        try
        {
            ((er)bd()).b(onachievementupdatedlistener, s1, i1, mJ.bZ(), mJ.bY());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnAchievementUpdatedListener onachievementupdatedlistener)
        {
            ep.c("GamesClient", "service died");
        }
        break MISSING_BLOCK_LABEL_58;
        onachievementupdatedlistener = new d(onachievementupdatedlistener);
          goto _L1
    }

    public void bT()
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_19;
        }
        ((er)bd()).bT();
        return;
        RemoteException remoteexception;
        remoteexception;
        ep.c("GamesClient", "service died");
        return;
    }

    protected Bundle ba()
    {
        Bundle bundle;
        try
        {
            bundle = ((er)bd()).ba();
        }
        catch (RemoteException remoteexception)
        {
            ep.c("GamesClient", "service died");
            return null;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        bundle.setClassLoader(com/google/android/gms/internal/em.getClassLoader());
        return bundle;
    }

    public void clearNotifications(int i1)
    {
        try
        {
            ((er)bd()).clearNotifications(i1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void connect()
    {
        bR();
        super.connect();
    }

    public void createRoom(RoomConfig roomconfig)
    {
        try
        {
            aj aj1 = new aj(roomconfig.getRoomUpdateListener(), roomconfig.getRoomStatusUpdateListener(), roomconfig.getMessageReceivedListener());
            ((er)bd()).a(aj1, mL, roomconfig.getVariant(), roomconfig.getInvitedPlayerIds(), roomconfig.getAutoMatchCriteria(), roomconfig.isSocketEnabled(), mM);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomConfig roomconfig)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void disconnect()
    {
        mK = false;
        if (isConnected())
        {
            try
            {
                er er1 = (er)bd();
                er1.bT();
                er1.g(mM);
                er1.f(mM);
            }
            catch (RemoteException remoteexception)
            {
                ep.c("GamesClient", "Failed to notify client disconnect.");
            }
        }
        bS();
        super.disconnect();
    }

    public Intent getAchievementsIntent()
    {
        bc();
        Intent intent = new Intent("com.google.android.gms.games.VIEW_ACHIEVEMENTS");
        intent.addFlags(0x4000000);
        return eo.c(intent);
    }

    public Intent getAllLeaderboardsIntent()
    {
        bc();
        Intent intent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARDS");
        intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mF);
        intent.addFlags(0x4000000);
        return eo.c(intent);
    }

    public String getAppId()
    {
        String s1;
        try
        {
            s1 = ((er)bd()).getAppId();
        }
        catch (RemoteException remoteexception)
        {
            ep.c("GamesClient", "service died");
            return null;
        }
        return s1;
    }

    public String getCurrentAccountName()
    {
        String s1;
        try
        {
            s1 = ((er)bd()).getCurrentAccountName();
        }
        catch (RemoteException remoteexception)
        {
            ep.c("GamesClient", "service died");
            return null;
        }
        return s1;
    }

    public Game getCurrentGame()
    {
        bc();
        this;
        JVM INSTR monitorenter ;
        Object obj = mI;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new GameBuffer(((er)bd()).bW());
        if (((GameBuffer) (obj)).getCount() > 0)
        {
            mI = (GameEntity)((GameBuffer) (obj)).get(0).freeze();
        }
        ((GameBuffer) (obj)).close();
_L1:
        this;
        JVM INSTR monitorexit ;
        return mI;
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
        ep.c("GamesClient", "service died");
          goto _L1
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Player getCurrentPlayer()
    {
        bc();
        this;
        JVM INSTR monitorenter ;
        Object obj = mH;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new PlayerBuffer(((er)bd()).bU());
        if (((PlayerBuffer) (obj)).getCount() > 0)
        {
            mH = (PlayerEntity)((PlayerBuffer) (obj)).get(0).freeze();
        }
        ((PlayerBuffer) (obj)).close();
_L1:
        this;
        JVM INSTR monitorexit ;
        return mH;
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
        ep.c("GamesClient", "service died");
          goto _L1
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getCurrentPlayerId()
    {
        String s1;
        try
        {
            s1 = ((er)bd()).getCurrentPlayerId();
        }
        catch (RemoteException remoteexception)
        {
            ep.c("GamesClient", "service died");
            return null;
        }
        return s1;
    }

    public Intent getInvitationInboxIntent()
    {
        bc();
        Intent intent = new Intent("com.google.android.gms.games.SHOW_INVITATIONS");
        intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mF);
        return eo.c(intent);
    }

    public Intent getLeaderboardIntent(String s1)
    {
        bc();
        Intent intent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARD_SCORES");
        intent.putExtra("com.google.android.gms.games.LEADERBOARD_ID", s1);
        intent.addFlags(0x4000000);
        return eo.c(intent);
    }

    public RealTimeSocket getRealTimeSocketForParticipant(String s1, String s2)
    {
label0:
        {
            if (s2 == null || !ParticipantUtils.Q(s2))
            {
                throw new IllegalArgumentException("Bad participant ID");
            }
            et et1 = (et)mG.get(s2);
            if (et1 != null)
            {
                s1 = et1;
                if (!et1.isClosed())
                {
                    break label0;
                }
            }
            s1 = K(s2);
        }
        return s1;
    }

    public Intent getRealTimeWaitingRoomIntent(Room room, int i1)
    {
        bc();
        Intent intent = new Intent("com.google.android.gms.games.SHOW_REAL_TIME_WAITING_ROOM");
        com.google.android.gms.internal.dm.a(room, "Room parameter must not be null");
        intent.putExtra("room", (Parcelable)room.freeze());
        boolean flag;
        if (i1 >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.internal.dm.a(flag, "minParticipantsToStart must be >= 0");
        intent.putExtra("com.google.android.gms.games.MIN_PARTICIPANTS_TO_START", i1);
        return eo.c(intent);
    }

    public Intent getSelectPlayersIntent(int i1, int j1)
    {
        bc();
        Intent intent = new Intent("com.google.android.gms.games.SELECT_PLAYERS");
        intent.putExtra("com.google.android.gms.games.MIN_SELECTIONS", i1);
        intent.putExtra("com.google.android.gms.games.MAX_SELECTIONS", j1);
        return eo.c(intent);
    }

    public Intent getSettingsIntent()
    {
        bc();
        Intent intent = new Intent("com.google.android.gms.games.SHOW_SETTINGS");
        intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mF);
        intent.addFlags(0x4000000);
        return eo.c(intent);
    }

    public void i(String s1, int i1)
    {
        try
        {
            ((er)bd()).i(s1, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void j(String s1, int i1)
    {
        try
        {
            ((er)bd()).j(s1, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void joinRoom(RoomConfig roomconfig)
    {
        try
        {
            aj aj1 = new aj(roomconfig.getRoomUpdateListener(), roomconfig.getRoomStatusUpdateListener(), roomconfig.getMessageReceivedListener());
            ((er)bd()).a(aj1, mL, roomconfig.getInvitationId(), roomconfig.isSocketEnabled(), mM);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomConfig roomconfig)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void leaveRoom(RoomUpdateListener roomupdatelistener, String s1)
    {
        try
        {
            ((er)bd()).e(new aj(roomupdatelistener), s1);
            bS();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoomUpdateListener roomupdatelistener)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void loadAchievements(OnAchievementsLoadedListener onachievementsloadedlistener, boolean flag)
    {
        try
        {
            ((er)bd()).b(new f(onachievementsloadedlistener), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnAchievementsLoadedListener onachievementsloadedlistener)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void loadGame(OnGamesLoadedListener ongamesloadedlistener)
    {
        try
        {
            ((er)bd()).d(new j(ongamesloadedlistener));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnGamesLoadedListener ongamesloadedlistener)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void loadInvitations(OnInvitationsLoadedListener oninvitationsloadedlistener)
    {
        try
        {
            ((er)bd()).e(new n(oninvitationsloadedlistener));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnInvitationsLoadedListener oninvitationsloadedlistener)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener onleaderboardmetadataloadedlistener, String s1, boolean flag)
    {
        try
        {
            ((er)bd()).c(new s(onleaderboardmetadataloadedlistener), s1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnLeaderboardMetadataLoadedListener onleaderboardmetadataloadedlistener)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void loadLeaderboardMetadata(OnLeaderboardMetadataLoadedListener onleaderboardmetadataloadedlistener, boolean flag)
    {
        try
        {
            ((er)bd()).c(new s(onleaderboardmetadataloadedlistener), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnLeaderboardMetadataLoadedListener onleaderboardmetadataloadedlistener)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void loadMoreScores(OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener, LeaderboardScoreBuffer leaderboardscorebuffer, int i1, int j1)
    {
        try
        {
            ((er)bd()).a(new q(onleaderboardscoresloadedlistener), leaderboardscorebuffer.cb().cc(), i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void loadPlayer(OnPlayersLoadedListener onplayersloadedlistener, String s1)
    {
        try
        {
            ((er)bd()).c(new ae(onplayersloadedlistener), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnPlayersLoadedListener onplayersloadedlistener)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void loadPlayerCenteredScores(OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener, String s1, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((er)bd()).b(new q(onleaderboardscoresloadedlistener), s1, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void loadTopScores(OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener, String s1, int i1, int j1, int k1, boolean flag)
    {
        try
        {
            ((er)bd()).a(new q(onleaderboardscoresloadedlistener), s1, i1, j1, k1, flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnLeaderboardScoresLoadedListener onleaderboardscoresloadedlistener)
        {
            ep.c("GamesClient", "service died");
        }
    }

    protected IInterface p(IBinder ibinder)
    {
        return A(ibinder);
    }

    public void registerInvitationListener(OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        try
        {
            oninvitationreceivedlistener = new l(oninvitationreceivedlistener);
            ((er)bd()).a(oninvitationreceivedlistener, mM);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public int sendReliableRealTimeMessage(RealTimeReliableMessageSentListener realtimereliablemessagesentlistener, byte abyte0[], String s1, String s2)
    {
        int i1;
        try
        {
            i1 = ((er)bd()).a(new ah(realtimereliablemessagesentlistener), abyte0, s1, s2);
        }
        // Misplaced declaration of an exception variable
        catch (RealTimeReliableMessageSentListener realtimereliablemessagesentlistener)
        {
            ep.c("GamesClient", "service died");
            return -1;
        }
        return i1;
    }

    public int sendUnreliableRealTimeMessageToAll(byte abyte0[], String s1)
    {
        int i1;
        try
        {
            i1 = ((er)bd()).b(abyte0, s1, null);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ep.c("GamesClient", "service died");
            return -1;
        }
        return i1;
    }

    public void setGravityForPopups(int i1)
    {
        mJ.setGravity(i1);
    }

    public void setUseNewPlayerNotificationsFirstParty(boolean flag)
    {
        try
        {
            ((er)bd()).setUseNewPlayerNotificationsFirstParty(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            ep.c("GamesClient", "service died");
        }
    }

    public void setViewForPopups(View view)
    {
        mJ.e(view);
    }

    public void signOut(OnSignOutCompleteListener onsignoutcompletelistener)
    {
        if (onsignoutcompletelistener != null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        onsignoutcompletelistener = null;
_L1:
        try
        {
            ((er)bd()).a(onsignoutcompletelistener);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnSignOutCompleteListener onsignoutcompletelistener)
        {
            ep.c("GamesClient", "service died");
        }
        break MISSING_BLOCK_LABEL_42;
        onsignoutcompletelistener = new an(onsignoutcompletelistener);
          goto _L1
    }

    public void unregisterInvitationListener()
    {
        try
        {
            ((er)bd()).g(mM);
            return;
        }
        catch (RemoteException remoteexception)
        {
            ep.c("GamesClient", "service died");
        }
    }
}
