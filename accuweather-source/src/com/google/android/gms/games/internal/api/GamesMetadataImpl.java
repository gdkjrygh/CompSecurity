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

                final LoadExtendedGamesImpl Px;
                final Status yG;

                public Status getStatus()
                {
                    return yG;
                }

                public void release()
                {
                }

            
            {
                Px = loadextendedgamesimpl;
                yG = status;
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

                final LoadGameInstancesImpl Py;
                final Status yG;

                public Status getStatus()
                {
                    return yG;
                }

                public void release()
                {
                }

            
            {
                Py = loadgameinstancesimpl;
                yG = status;
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

                final LoadGameSearchSuggestionsImpl Pz;
                final Status yG;

                public Status getStatus()
                {
                    return yG;
                }

                public void release()
                {
                }

            
            {
                Pz = loadgamesearchsuggestionsimpl;
                yG = status;
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

                final LoadGamesImpl PA;
                final Status yG;

                public GameBuffer getGames()
                {
                    return new GameBuffer(DataHolder.af(14));
                }

                public Status getStatus()
                {
                    return yG;
                }

                public void release()
                {
                }

            
            {
                PA = loadgamesimpl;
                yG = status;
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
        return Games.c(googleapiclient).gX();
    }

    public PendingResult loadGame(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new LoadGamesImpl() {

            final GamesMetadataImpl Pq;

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
                Pq = GamesMetadataImpl.this;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$10

/* anonymous class */
    class _cls10 extends LoadExtendedGamesImpl
    {

        final String Pr;
        final int Ps;
        final boolean Pt;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pr, Ps, false, true, false, Pt);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$11

/* anonymous class */
    class _cls11 extends LoadExtendedGamesImpl
    {

        final boolean Pb;
        final String Pd;
        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Pd, Ps, false, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$12

/* anonymous class */
    class _cls12 extends LoadExtendedGamesImpl
    {

        final String Pd;
        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Pd, Ps, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$13

/* anonymous class */
    class _cls13 extends LoadExtendedGamesImpl
    {

        final boolean Pb;
        final String Pd;
        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, Pd, Ps, false, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$14

/* anonymous class */
    class _cls14 extends LoadExtendedGamesImpl
    {

        final String Pd;
        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, Pd, Ps, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$15

/* anonymous class */
    class _cls15 extends LoadExtendedGamesImpl
    {

        final boolean Pb;
        final String Pr;
        final int Ps;
        final boolean Pt;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pr, Ps, true, false, Pb, Pt);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$16

/* anonymous class */
    class _cls16 extends LoadExtendedGamesImpl
    {

        final String Pr;
        final int Ps;
        final boolean Pt;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pr, Ps, true, true, false, Pt);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$17

/* anonymous class */
    class _cls17 extends LoadExtendedGamesImpl
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
            gamesclientimpl.e(this, Pu, Ps, false, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$18

/* anonymous class */
    class _cls18 extends LoadExtendedGamesImpl
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
            gamesclientimpl.e(this, Pu, Ps, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$19

/* anonymous class */
    class _cls19 extends LoadGameSearchSuggestionsImpl
    {

        final String Pu;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.m(this, Pu);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$2

/* anonymous class */
    class _cls2 extends LoadExtendedGamesImpl
    {

        final String Pe;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.k(this, Pe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$3

/* anonymous class */
    class _cls3 extends LoadGameInstancesImpl
    {

        final String Pe;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.l(this, Pe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$4

/* anonymous class */
    class _cls4 extends LoadExtendedGamesImpl
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
            gamesclientimpl.b(this, null, Ps, false, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$5

/* anonymous class */
    class _cls5 extends LoadExtendedGamesImpl
    {

        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, null, Ps, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$6

/* anonymous class */
    class _cls6 extends LoadExtendedGamesImpl
    {

        final boolean Pb;
        final String Pd;
        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, Pd, Ps, false, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$7

/* anonymous class */
    class _cls7 extends LoadExtendedGamesImpl
    {

        final String Pd;
        final int Ps;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, Pd, Ps, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$8

/* anonymous class */
    class _cls8 extends LoadExtendedGamesImpl
    {

        final boolean Pb;
        final int Ps;
        final int Pv;
        final boolean Pw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Ps, Pv, Pw, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$9

/* anonymous class */
    class _cls9 extends LoadExtendedGamesImpl
    {

        final boolean Pb;
        final String Pr;
        final int Ps;
        final boolean Pt;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pr, Ps, false, false, Pb, Pt);
        }
    }

}
