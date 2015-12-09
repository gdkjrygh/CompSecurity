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

        private final String wp;

        static String a(CancelMatchImpl cancelmatchimpl)
        {
            return cancelmatchimpl.wp;
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult R(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult(this, status) {

                final CancelMatchImpl Lj;
                final Status wz;

                public String getMatchId()
                {
                    return CancelMatchImpl.a(Lj);
                }

                public Status getStatus()
                {
                    return wz;
                }

            
            {
                Lj = cancelmatchimpl;
                wz = status;
                super();
            }
            };
        }

        public Result d(Status status)
        {
            return R(status);
        }

        public CancelMatchImpl(String s)
        {
            wp = s;
        }
    }

    private static abstract class InitiateMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult S(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult(this, status) {

                final InitiateMatchImpl Lk;
                final Status wz;

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return wz;
                }

            
            {
                Lk = initiatematchimpl;
                wz = status;
                super();
            }
            };
        }

        public Result d(Status status)
        {
            return S(status);
        }

        private InitiateMatchImpl()
        {
        }

    }

    private static abstract class LeaveMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult T(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult(this, status) {

                final LeaveMatchImpl Ll;
                final Status wz;

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return wz;
                }

            
            {
                Ll = leavematchimpl;
                wz = status;
                super();
            }
            };
        }

        public Result d(Status status)
        {
            return T(status);
        }

        private LeaveMatchImpl()
        {
        }

    }

    private static abstract class LoadMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult U(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult(this, status) {

                final LoadMatchImpl Lm;
                final Status wz;

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return wz;
                }

            
            {
                Lm = loadmatchimpl;
                wz = status;
                super();
            }
            };
        }

        public Result d(Status status)
        {
            return U(status);
        }

        private LoadMatchImpl()
        {
        }

    }

    private static abstract class LoadMatchesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult V(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult(this, status) {

                final LoadMatchesImpl Ln;
                final Status wz;

                public LoadMatchesResponse getMatches()
                {
                    return new LoadMatchesResponse(new Bundle());
                }

                public Status getStatus()
                {
                    return wz;
                }

                public void release()
                {
                }

            
            {
                Ln = loadmatchesimpl;
                wz = status;
                super();
            }
            };
        }

        public Result d(Status status)
        {
            return V(status);
        }

        private LoadMatchesImpl()
        {
        }

    }

    private static abstract class UpdateMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult W(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult(this, status) {

                final UpdateMatchImpl Lo;
                final Status wz;

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return wz;
                }

            
            {
                Lo = updatematchimpl;
                wz = status;
                super();
            }
            };
        }

        public Result d(Status status)
        {
            return W(status);
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

            final String Km;
            final TurnBasedMultiplayerImpl Lc;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.e(this, Km);
            }

            
            {
                Lc = TurnBasedMultiplayerImpl.this;
                Km = s;
                super();
            }
        });
    }

    public PendingResult cancelMatch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new CancelMatchImpl(s, s) {

            final TurnBasedMultiplayerImpl Lc;
            final String Ld;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.g(this, Ld);
            }

            
            {
                Lc = TurnBasedMultiplayerImpl.this;
                Ld = s1;
                super(s);
            }
        });
    }

    public PendingResult createMatch(GoogleApiClient googleapiclient, TurnBasedMatchConfig turnbasedmatchconfig)
    {
        return googleapiclient.b(new InitiateMatchImpl(turnbasedmatchconfig) {

            final TurnBasedMatchConfig Lb;
            final TurnBasedMultiplayerImpl Lc;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Lb);
            }

            
            {
                Lc = TurnBasedMultiplayerImpl.this;
                Lb = turnbasedmatchconfig;
                super();
            }
        });
    }

    public void declineInvitation(GoogleApiClient googleapiclient, String s)
    {
        Games.c(googleapiclient).m(s, 1);
    }

    public void dismissInvitation(GoogleApiClient googleapiclient, String s)
    {
        Games.c(googleapiclient).l(s, 1);
    }

    public void dismissMatch(GoogleApiClient googleapiclient, String s)
    {
        Games.c(googleapiclient).aB(s);
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

            final TurnBasedMultiplayerImpl Lc;
            final String Ld;
            final byte Lg[];
            final ParticipantResult Li[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Ld, Lg, Li);
            }

            
            {
                Lc = TurnBasedMultiplayerImpl.this;
                Ld = s;
                Lg = abyte0;
                Li = aparticipantresult;
                super();
            }
        });
    }

    public Intent getInboxIntent(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).gr();
    }

    public int getMaxMatchDataSize(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).gA();
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

            final TurnBasedMultiplayerImpl Lc;
            final String Ld;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.f(this, Ld);
            }

            
            {
                Lc = TurnBasedMultiplayerImpl.this;
                Ld = s;
                super();
            }
        });
    }

    public PendingResult leaveMatchDuringTurn(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.b(new LeaveMatchImpl(s, s1) {

            final TurnBasedMultiplayerImpl Lc;
            final String Ld;
            final String Lh;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Ld, Lh);
            }

            
            {
                Lc = TurnBasedMultiplayerImpl.this;
                Ld = s;
                Lh = s1;
                super();
            }
        });
    }

    public PendingResult loadMatch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.a(new LoadMatchImpl(s) {

            final TurnBasedMultiplayerImpl Lc;
            final String Ld;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.h(this, Ld);
            }

            
            {
                Lc = TurnBasedMultiplayerImpl.this;
                Ld = s;
                super();
            }
        });
    }

    public PendingResult loadMatchesByStatus(GoogleApiClient googleapiclient, int i, int ai[])
    {
        return googleapiclient.a(new LoadMatchesImpl(i, ai) {

            final TurnBasedMultiplayerImpl Lc;
            final int Le;
            final int Lf[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Le, Lf);
            }

            
            {
                Lc = TurnBasedMultiplayerImpl.this;
                Le = i;
                Lf = ai;
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

            final TurnBasedMultiplayerImpl Lc;
            final String Ld;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.d(this, Ld);
            }

            
            {
                Lc = TurnBasedMultiplayerImpl.this;
                Ld = s;
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

            final TurnBasedMultiplayerImpl Lc;
            final String Ld;
            final byte Lg[];
            final String Lh;
            final ParticipantResult Li[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Ld, Lg, Lh, Li);
            }

            
            {
                Lc = TurnBasedMultiplayerImpl.this;
                Ld = s;
                Lg = abyte0;
                Lh = s1;
                Li = aparticipantresult;
                super();
            }
        });
    }

    public void unregisterMatchUpdateListener(GoogleApiClient googleapiclient)
    {
        Games.c(googleapiclient).gu();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$11

/* anonymous class */
    class _cls11 extends InitiateMatchImpl
    {

        final String JT;
        final String Ld;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, JT, Ld);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$12

/* anonymous class */
    class _cls12 extends InitiateMatchImpl
    {

        final String JT;
        final String Ld;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, JT, Ld);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$13

/* anonymous class */
    class _cls13 extends LoadMatchesImpl
    {

        final String JT;
        final int Le;
        final int Lf[];

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, JT, Le, Lf);
        }
    }

}
