// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class GamesMetadataImpl
    implements GamesMetadata
{
    private static abstract class LoadExtendedGamesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult B(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult(this, status) {

                final LoadExtendedGamesImpl PA;
                final Status yJ;

                public Status getStatus()
                {
                    return yJ;
                }

                public void release()
                {
                }

            
            {
                PA = loadextendedgamesimpl;
                yJ = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return B(status);
        }

        private LoadExtendedGamesImpl()
        {
        }
    }

    private static abstract class LoadGameInstancesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult C(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult(this, status) {

                final LoadGameInstancesImpl PB;
                final Status yJ;

                public Status getStatus()
                {
                    return yJ;
                }

                public void release()
                {
                }

            
            {
                PB = loadgameinstancesimpl;
                yJ = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return C(status);
        }

        private LoadGameInstancesImpl()
        {
        }
    }

    private static abstract class LoadGameSearchSuggestionsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult D(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult(this, status) {

                final LoadGameSearchSuggestionsImpl PC;
                final Status yJ;

                public Status getStatus()
                {
                    return yJ;
                }

                public void release()
                {
                }

            
            {
                PC = loadgamesearchsuggestionsimpl;
                yJ = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return D(status);
        }

        private LoadGameSearchSuggestionsImpl()
        {
        }
    }

    private static abstract class LoadGamesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.GamesMetadata.LoadGamesResult E(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadGamesResult(this, status) {

                final LoadGamesImpl PD;
                final Status yJ;

                public GameBuffer getGames()
                {
                    return new GameBuffer(DataHolder.af(14));
                }

                public Status getStatus()
                {
                    return yJ;
                }

                public void release()
                {
                }

            
            {
                PD = loadgamesimpl;
                yJ = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return E(status);
        }

        private LoadGamesImpl()
        {
        }

    }


    public GamesMetadataImpl()
    {
    }

    public Game getCurrentGame(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).hc();
    }

    public PendingResult loadGame(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new LoadGamesImpl() {

            final GamesMetadataImpl Pt;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.f(this);
            }

            
            {
                Pt = GamesMetadataImpl.this;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$10

/* anonymous class */
    class _cls10 extends LoadExtendedGamesImpl
    {

        final String Pu;
        final int Pv;
        final boolean Pw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pu, Pv, false, true, false, Pw);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$11

/* anonymous class */
    class _cls11 extends LoadExtendedGamesImpl
    {

        final boolean Pe;
        final String Pg;
        final int Pv;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Pg, Pv, false, Pe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$12

/* anonymous class */
    class _cls12 extends LoadExtendedGamesImpl
    {

        final String Pg;
        final int Pv;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Pg, Pv, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$13

/* anonymous class */
    class _cls13 extends LoadExtendedGamesImpl
    {

        final boolean Pe;
        final String Pg;
        final int Pv;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, Pg, Pv, false, Pe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$14

/* anonymous class */
    class _cls14 extends LoadExtendedGamesImpl
    {

        final String Pg;
        final int Pv;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, Pg, Pv, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$15

/* anonymous class */
    class _cls15 extends LoadExtendedGamesImpl
    {

        final boolean Pe;
        final String Pu;
        final int Pv;
        final boolean Pw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pu, Pv, true, false, Pe, Pw);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$16

/* anonymous class */
    class _cls16 extends LoadExtendedGamesImpl
    {

        final String Pu;
        final int Pv;
        final boolean Pw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pu, Pv, true, true, false, Pw);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$17

/* anonymous class */
    class _cls17 extends LoadExtendedGamesImpl
    {

        final boolean Pe;
        final int Pv;
        final String Px;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.e(this, Px, Pv, false, Pe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$18

/* anonymous class */
    class _cls18 extends LoadExtendedGamesImpl
    {

        final int Pv;
        final String Px;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.e(this, Px, Pv, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$19

/* anonymous class */
    class _cls19 extends LoadGameSearchSuggestionsImpl
    {

        final String Px;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.m(this, Px);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$2

/* anonymous class */
    class _cls2 extends LoadExtendedGamesImpl
    {

        final String Ph;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.k(this, Ph);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$3

/* anonymous class */
    class _cls3 extends LoadGameInstancesImpl
    {

        final String Ph;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.l(this, Ph);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$4

/* anonymous class */
    class _cls4 extends LoadExtendedGamesImpl
    {

        final boolean Pe;
        final int Pv;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, null, Pv, false, Pe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$5

/* anonymous class */
    class _cls5 extends LoadExtendedGamesImpl
    {

        final int Pv;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, null, Pv, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$6

/* anonymous class */
    class _cls6 extends LoadExtendedGamesImpl
    {

        final boolean Pe;
        final String Pg;
        final int Pv;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, Pg, Pv, false, Pe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$7

/* anonymous class */
    class _cls7 extends LoadExtendedGamesImpl
    {

        final String Pg;
        final int Pv;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, Pg, Pv, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$8

/* anonymous class */
    class _cls8 extends LoadExtendedGamesImpl
    {

        final boolean Pe;
        final int Pv;
        final int Py;
        final boolean Pz;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pv, Py, Pz, Pe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$9

/* anonymous class */
    class _cls9 extends LoadExtendedGamesImpl
    {

        final boolean Pe;
        final String Pu;
        final int Pv;
        final boolean Pw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pu, Pv, false, false, Pe, Pw);
        }
    }

}
