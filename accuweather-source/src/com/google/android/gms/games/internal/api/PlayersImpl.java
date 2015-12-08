// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class PlayersImpl
    implements Players
{
    private static abstract class LoadOwnerCoverPhotoUrisImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.Players.LoadOwnerCoverPhotoUrisResult O(Status status)
        {
            return new com.google.android.gms.games.Players.LoadOwnerCoverPhotoUrisResult(this, status) {

                final LoadOwnerCoverPhotoUrisImpl Qg;
                final Status yG;

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                Qg = loadownercoverphotourisimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return O(status);
        }

        private LoadOwnerCoverPhotoUrisImpl()
        {
        }
    }

    private static abstract class LoadPlayersImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.Players.LoadPlayersResult P(Status status)
        {
            return new com.google.android.gms.games.Players.LoadPlayersResult(this, status) {

                final LoadPlayersImpl Qh;
                final Status yG;

                public PlayerBuffer getPlayers()
                {
                    return new PlayerBuffer(DataHolder.af(14));
                }

                public Status getStatus()
                {
                    return yG;
                }

                public void release()
                {
                }

            
            {
                Qh = loadplayersimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return P(status);
        }

        private LoadPlayersImpl()
        {
        }

    }

    private static abstract class LoadXpForGameCategoriesResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.Players.LoadXpForGameCategoriesResult Q(Status status)
        {
            return new com.google.android.gms.games.Players.LoadXpForGameCategoriesResult(this, status) {

                final LoadXpForGameCategoriesResultImpl Qi;
                final Status yG;

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                Qi = loadxpforgamecategoriesresultimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return Q(status);
        }

        private LoadXpForGameCategoriesResultImpl()
        {
        }
    }

    private static abstract class LoadXpForGameResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        private LoadXpForGameResultImpl()
        {
        }
    }

    private static abstract class LoadXpStreamResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.Players.LoadXpStreamResult R(Status status)
        {
            return new com.google.android.gms.games.Players.LoadXpStreamResult(this, status) {

                final LoadXpStreamResultImpl Qj;
                final Status yG;

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                Qj = loadxpstreamresultimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return R(status);
        }

        private LoadXpStreamResultImpl()
        {
        }
    }


    public PlayersImpl()
    {
    }

    public Player getCurrentPlayer(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).gW();
    }

    public String getCurrentPlayerId(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).gV();
    }

    public Intent getPlayerSearchIntent(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).hg();
    }

    public PendingResult loadConnectedPlayers(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.a(new LoadPlayersImpl(flag) {

            final boolean Pb;
            final PlayersImpl Qa;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Pb);
            }

            
            {
                Qa = PlayersImpl.this;
                Pb = flag;
                super();
            }
        });
    }

    public PendingResult loadInvitablePlayers(GoogleApiClient googleapiclient, int i, boolean flag)
    {
        return googleapiclient.a(new LoadPlayersImpl(i, flag) {

            final boolean Pb;
            final int Ps;
            final PlayersImpl Qa;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Ps, false, Pb);
            }

            
            {
                Qa = PlayersImpl.this;
                Ps = i;
                Pb = flag;
                super();
            }
        });
    }

    public PendingResult loadMoreInvitablePlayers(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.a(new LoadPlayersImpl(i) {

            final int Ps;
            final PlayersImpl Qa;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Ps, true, false);
            }

            
            {
                Qa = PlayersImpl.this;
                Ps = i;
                super();
            }
        });
    }

    public PendingResult loadMoreRecentlyPlayedWithPlayers(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.a(new LoadPlayersImpl(i) {

            final int Ps;
            final PlayersImpl Qa;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, "played_with", Ps, true, false);
            }

            
            {
                Qa = PlayersImpl.this;
                Ps = i;
                super();
            }
        });
    }

    public PendingResult loadPlayer(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.a(new LoadPlayersImpl(s) {

            final String Pd;
            final PlayersImpl Qa;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Pd);
            }

            
            {
                Qa = PlayersImpl.this;
                Pd = s;
                super();
            }
        });
    }

    public PendingResult loadRecentlyPlayedWithPlayers(GoogleApiClient googleapiclient, int i, boolean flag)
    {
        return googleapiclient.a(new LoadPlayersImpl(i, flag) {

            final boolean Pb;
            final int Ps;
            final PlayersImpl Qa;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, "played_with", Ps, false, Pb);
            }

            
            {
                Qa = PlayersImpl.this;
                Ps = i;
                Pb = flag;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$10

/* anonymous class */
    class _cls10 extends LoadPlayersImpl
    {

        final boolean Pb;
        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, Ps, false, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$11

/* anonymous class */
    class _cls11 extends LoadPlayersImpl
    {

        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, Ps, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$12

/* anonymous class */
    class _cls12 extends LoadPlayersImpl
    {

        final boolean Pb;
        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Ps, false, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$13

/* anonymous class */
    class _cls13 extends LoadPlayersImpl
    {

        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Ps, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$14

/* anonymous class */
    class _cls14 extends LoadPlayersImpl
    {

        final boolean Pb;
        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, Ps, false, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$15

/* anonymous class */
    class _cls15 extends LoadPlayersImpl
    {

        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, Ps, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$16

/* anonymous class */
    class _cls16 extends LoadPlayersImpl
    {

        final boolean Pb;
        final int Ps;
        final String Pu;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.f(this, Pu, Ps, false, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$17

/* anonymous class */
    class _cls17 extends LoadPlayersImpl
    {

        final int Ps;
        final String Pu;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.f(this, Pu, Ps, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$18

/* anonymous class */
    class _cls18 extends LoadPlayersImpl
    {

        final boolean Pb;
        final String Pe;
        final int Qb;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pe, Qb, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$19

/* anonymous class */
    class _cls19 extends LoadPlayersImpl
    {

        final boolean Pb;
        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.e(this, Ps, false, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$2

/* anonymous class */
    class _cls2 extends LoadPlayersImpl
    {

        final String Qc[];

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Qc);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$20

/* anonymous class */
    class _cls20 extends LoadPlayersImpl
    {

        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.e(this, Ps, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$21

/* anonymous class */
    class _cls21 extends LoadPlayersImpl
    {

        final boolean Pb;
        final int Ps;
        final String Qd;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.g(this, Qd, Ps, false, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$22

/* anonymous class */
    class _cls22 extends LoadPlayersImpl
    {

        final int Ps;
        final String Qd;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.g(this, Qd, Ps, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$23

/* anonymous class */
    class _cls23 extends LoadOwnerCoverPhotoUrisImpl
    {

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.g(this);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$24

/* anonymous class */
    class _cls24 extends LoadXpForGameCategoriesResultImpl
    {

        final String Qe;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.n(this, Qe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$25

/* anonymous class */
    class _cls25 extends LoadXpStreamResultImpl
    {

        final String Qe;
        final int Qf;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Qe, Qf);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$26

/* anonymous class */
    class _cls26 extends LoadXpStreamResultImpl
    {

        final String Qe;
        final int Qf;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, Qe, Qf);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$7

/* anonymous class */
    class _cls7 extends LoadPlayersImpl
    {

        final boolean Pb;
        final String Pe;
        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, "played_with", Pe, Ps, false, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$8

/* anonymous class */
    class _cls8 extends LoadPlayersImpl
    {

        final String Pe;
        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, "played_with", Pe, Ps, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$LoadXpForGameResultImpl$1

/* anonymous class */
    class LoadXpForGameResultImpl._cls1
        implements com.google.android.gms.games.Players.LoadXpForGamesResult
    {

        final Status yG;

        public Status getStatus()
        {
            return yG;
        }
    }

}
