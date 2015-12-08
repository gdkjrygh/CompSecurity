// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import java.util.List;

public final class TurnBasedMultiplayerImpl
    implements TurnBasedMultiplayer
{
    private static abstract class CancelMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        private final String xD;

        static String a(CancelMatchImpl cancelmatchimpl)
        {
            return cancelmatchimpl.xD;
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult ad(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult(this, status) {

                final CancelMatchImpl QZ;
                final Status yG;

                public String getMatchId()
                {
                    return CancelMatchImpl.a(QZ);
                }

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                QZ = cancelmatchimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ad(status);
        }

        public CancelMatchImpl(String s)
        {
            xD = s;
        }
    }

    private static abstract class InitiateMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult ae(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult(this, status) {

                final InitiateMatchImpl Ra;
                final Status yG;

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                Ra = initiatematchimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ae(status);
        }

        private InitiateMatchImpl()
        {
        }

    }

    private static abstract class LeaveMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult af(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult(this, status) {

                final LeaveMatchImpl Rb;
                final Status yG;

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                Rb = leavematchimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return af(status);
        }

        private LeaveMatchImpl()
        {
        }

    }

    private static abstract class LoadMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult ag(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult(this, status) {

                final LoadMatchImpl Rc;
                final Status yG;

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                Rc = loadmatchimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ag(status);
        }

        private LoadMatchImpl()
        {
        }

    }

    private static abstract class LoadMatchesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult ah(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult(this, status) {

                final LoadMatchesImpl Rd;
                final Status yG;

                public LoadMatchesResponse getMatches()
                {
                    return new LoadMatchesResponse(new Bundle());
                }

                public Status getStatus()
                {
                    return yG;
                }

                public void release()
                {
                }

            
            {
                Rd = loadmatchesimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ah(status);
        }

        private LoadMatchesImpl()
        {
        }

    }

    private static abstract class UpdateMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult ai(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult(this, status) {

                final UpdateMatchImpl Re;
                final Status yG;

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                Re = updatematchimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ai(status);
        }

        private UpdateMatchImpl()
        {
        }

    }


    public TurnBasedMultiplayerImpl()
    {
    }

    public PendingResult acceptInvitation(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new InitiateMatchImpl(s) {

            final String PD;
            final TurnBasedMultiplayerImpl QS;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.e(this, PD);
            }

            
            {
                QS = TurnBasedMultiplayerImpl.this;
                PD = s;
                super();
            }
        });
    }

    public PendingResult cancelMatch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new CancelMatchImpl(s, s) {

            final TurnBasedMultiplayerImpl QS;
            final String QT;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.g(this, QT);
            }

            
            {
                QS = TurnBasedMultiplayerImpl.this;
                QT = s1;
                super(s);
            }
        });
    }

    public PendingResult createMatch(GoogleApiClient googleapiclient, TurnBasedMatchConfig turnbasedmatchconfig)
    {
        return googleapiclient.b(new InitiateMatchImpl(turnbasedmatchconfig) {

            final TurnBasedMatchConfig QR;
            final TurnBasedMultiplayerImpl QS;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, QR);
            }

            
            {
                QS = TurnBasedMultiplayerImpl.this;
                QR = turnbasedmatchconfig;
                super();
            }
        });
    }

    public void declineInvitation(GoogleApiClient googleapiclient, String s)
    {
        Games.c(googleapiclient).n(s, 1);
    }

    public void dismissInvitation(GoogleApiClient googleapiclient, String s)
    {
        Games.c(googleapiclient).m(s, 1);
    }

    public void dismissMatch(GoogleApiClient googleapiclient, String s)
    {
        Games.c(googleapiclient).aS(s);
    }

    public PendingResult finishMatch(GoogleApiClient googleapiclient, String s)
    {
        return finishMatch(googleapiclient, s, null, (ParticipantResult[])null);
    }

    public PendingResult finishMatch(GoogleApiClient googleapiclient, String s, byte abyte0[], List list)
    {
        if (list == null)
        {
            list = null;
        } else
        {
            list = (ParticipantResult[])list.toArray(new ParticipantResult[list.size()]);
        }
        return finishMatch(googleapiclient, s, abyte0, ((ParticipantResult []) (list)));
    }

    public transient PendingResult finishMatch(GoogleApiClient googleapiclient, String s, byte abyte0[], ParticipantResult aparticipantresult[])
    {
        return googleapiclient.b(new UpdateMatchImpl(s, abyte0, aparticipantresult) {

            final TurnBasedMultiplayerImpl QS;
            final String QT;
            final byte QW[];
            final ParticipantResult QY[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, QT, QW, QY);
            }

            
            {
                QS = TurnBasedMultiplayerImpl.this;
                QT = s;
                QW = abyte0;
                QY = aparticipantresult;
                super();
            }
        });
    }

    public Intent getInboxIntent(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).ha();
    }

    public int getMaxMatchDataSize(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).hk();
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j)
    {
        return Games.c(googleapiclient).a(i, j, true);
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j, boolean flag)
    {
        return Games.c(googleapiclient).a(i, j, flag);
    }

    public PendingResult leaveMatch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new LeaveMatchImpl(s) {

            final TurnBasedMultiplayerImpl QS;
            final String QT;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.f(this, QT);
            }

            
            {
                QS = TurnBasedMultiplayerImpl.this;
                QT = s;
                super();
            }
        });
    }

    public PendingResult leaveMatchDuringTurn(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.b(new LeaveMatchImpl(s, s1) {

            final TurnBasedMultiplayerImpl QS;
            final String QT;
            final String QX;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, QT, QX);
            }

            
            {
                QS = TurnBasedMultiplayerImpl.this;
                QT = s;
                QX = s1;
                super();
            }
        });
    }

    public PendingResult loadMatch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.a(new LoadMatchImpl(s) {

            final TurnBasedMultiplayerImpl QS;
            final String QT;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.h(this, QT);
            }

            
            {
                QS = TurnBasedMultiplayerImpl.this;
                QT = s;
                super();
            }
        });
    }

    public PendingResult loadMatchesByStatus(GoogleApiClient googleapiclient, int i, int ai[])
    {
        return googleapiclient.a(new LoadMatchesImpl(i, ai) {

            final TurnBasedMultiplayerImpl QS;
            final int QU;
            final int QV[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, QU, QV);
            }

            
            {
                QS = TurnBasedMultiplayerImpl.this;
                QU = i;
                QV = ai;
                super();
            }
        });
    }

    public PendingResult loadMatchesByStatus(GoogleApiClient googleapiclient, int ai[])
    {
        return loadMatchesByStatus(googleapiclient, 0, ai);
    }

    public void registerMatchUpdateListener(GoogleApiClient googleapiclient, OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
    {
        Games.c(googleapiclient).a(onturnbasedmatchupdatereceivedlistener);
    }

    public PendingResult rematch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new InitiateMatchImpl(s) {

            final TurnBasedMultiplayerImpl QS;
            final String QT;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.d(this, QT);
            }

            
            {
                QS = TurnBasedMultiplayerImpl.this;
                QT = s;
                super();
            }
        });
    }

    public PendingResult takeTurn(GoogleApiClient googleapiclient, String s, byte abyte0[], String s1)
    {
        return takeTurn(googleapiclient, s, abyte0, s1, (ParticipantResult[])null);
    }

    public PendingResult takeTurn(GoogleApiClient googleapiclient, String s, byte abyte0[], String s1, List list)
    {
        if (list == null)
        {
            list = null;
        } else
        {
            list = (ParticipantResult[])list.toArray(new ParticipantResult[list.size()]);
        }
        return takeTurn(googleapiclient, s, abyte0, s1, ((ParticipantResult []) (list)));
    }

    public transient PendingResult takeTurn(GoogleApiClient googleapiclient, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[])
    {
        return googleapiclient.b(new UpdateMatchImpl(s, abyte0, s1, aparticipantresult) {

            final TurnBasedMultiplayerImpl QS;
            final String QT;
            final byte QW[];
            final String QX;
            final ParticipantResult QY[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, QT, QW, QX, QY);
            }

            
            {
                QS = TurnBasedMultiplayerImpl.this;
                QT = s;
                QW = abyte0;
                QX = s1;
                QY = aparticipantresult;
                super();
            }
        });
    }

    public void unregisterMatchUpdateListener(GoogleApiClient googleapiclient)
    {
        Games.c(googleapiclient).hd();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$11

/* anonymous class */
    class _cls11 extends InitiateMatchImpl
    {

        final String Pe;
        final String QT;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Pe, QT);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$12

/* anonymous class */
    class _cls12 extends InitiateMatchImpl
    {

        final String Pe;
        final String QT;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, Pe, QT);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$13

/* anonymous class */
    class _cls13 extends LoadMatchesImpl
    {

        final String Pe;
        final int QU;
        final int QV[];

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pe, QU, QV);
        }
    }

}
