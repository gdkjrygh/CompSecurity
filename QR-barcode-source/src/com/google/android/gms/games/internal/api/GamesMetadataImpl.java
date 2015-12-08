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

        public com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult P(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult(this, status) {

                final Status CW;
                final LoadExtendedGamesImpl YB;

                public Status getStatus()
                {
                    return CW;
                }

                public void release()
                {
                }

            
            {
                YB = loadextendedgamesimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return P(status);
        }

        private LoadExtendedGamesImpl()
        {
        }
    }

    private static abstract class LoadGameInstancesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult Q(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult(this, status) {

                final Status CW;
                final LoadGameInstancesImpl YC;

                public Status getStatus()
                {
                    return CW;
                }

                public void release()
                {
                }

            
            {
                YC = loadgameinstancesimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return Q(status);
        }

        private LoadGameInstancesImpl()
        {
        }
    }

    private static abstract class LoadGameSearchSuggestionsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult R(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult(this, status) {

                final Status CW;
                final LoadGameSearchSuggestionsImpl YD;

                public Status getStatus()
                {
                    return CW;
                }

                public void release()
                {
                }

            
            {
                YD = loadgamesearchsuggestionsimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return R(status);
        }

        private LoadGameSearchSuggestionsImpl()
        {
        }
    }

    private static abstract class LoadGamesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.GamesMetadata.LoadGamesResult S(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadGamesResult(this, status) {

                final Status CW;
                final LoadGamesImpl YE;

                public GameBuffer getGames()
                {
                    return new GameBuffer(DataHolder.as(14));
                }

                public Status getStatus()
                {
                    return CW;
                }

                public void release()
                {
                }

            
            {
                YE = loadgamesimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return S(status);
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
        return Games.c(googleapiclient).kd();
    }

    public PendingResult loadGame(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new LoadGamesImpl() {

            final GamesMetadataImpl Yu;

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
                Yu = GamesMetadataImpl.this;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$10

/* anonymous class */
    class _cls10 extends LoadExtendedGamesImpl
    {

        final String Yv;
        final int Yw;
        final boolean Yx;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Yv, Yw, false, true, false, Yx);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$11

/* anonymous class */
    class _cls11 extends LoadExtendedGamesImpl
    {

        final boolean Yf;
        final String Yh;
        final int Yw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Yh, Yw, false, Yf);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$12

/* anonymous class */
    class _cls12 extends LoadExtendedGamesImpl
    {

        final String Yh;
        final int Yw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Yh, Yw, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$13

/* anonymous class */
    class _cls13 extends LoadExtendedGamesImpl
    {

        final boolean Yf;
        final String Yh;
        final int Yw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, Yh, Yw, false, Yf);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$14

/* anonymous class */
    class _cls14 extends LoadExtendedGamesImpl
    {

        final String Yh;
        final int Yw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, Yh, Yw, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$15

/* anonymous class */
    class _cls15 extends LoadExtendedGamesImpl
    {

        final boolean Yf;
        final String Yv;
        final int Yw;
        final boolean Yx;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Yv, Yw, true, false, Yf, Yx);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$16

/* anonymous class */
    class _cls16 extends LoadExtendedGamesImpl
    {

        final String Yv;
        final int Yw;
        final boolean Yx;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Yv, Yw, true, true, false, Yx);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$17

/* anonymous class */
    class _cls17 extends LoadExtendedGamesImpl
    {

        final boolean Yf;
        final int Yw;
        final String Yy;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.e(this, Yy, Yw, false, Yf);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$18

/* anonymous class */
    class _cls18 extends LoadExtendedGamesImpl
    {

        final int Yw;
        final String Yy;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.e(this, Yy, Yw, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$19

/* anonymous class */
    class _cls19 extends LoadGameSearchSuggestionsImpl
    {

        final String Yy;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.m(this, Yy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$2

/* anonymous class */
    class _cls2 extends LoadExtendedGamesImpl
    {

        final String Yi;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.k(this, Yi);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$3

/* anonymous class */
    class _cls3 extends LoadGameInstancesImpl
    {

        final String Yi;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.l(this, Yi);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$4

/* anonymous class */
    class _cls4 extends LoadExtendedGamesImpl
    {

        final boolean Yf;
        final int Yw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, null, Yw, false, Yf);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$5

/* anonymous class */
    class _cls5 extends LoadExtendedGamesImpl
    {

        final int Yw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, null, Yw, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$6

/* anonymous class */
    class _cls6 extends LoadExtendedGamesImpl
    {

        final boolean Yf;
        final String Yh;
        final int Yw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, Yh, Yw, false, Yf);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$7

/* anonymous class */
    class _cls7 extends LoadExtendedGamesImpl
    {

        final String Yh;
        final int Yw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, Yh, Yw, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$8

/* anonymous class */
    class _cls8 extends LoadExtendedGamesImpl
    {

        final boolean YA;
        final boolean Yf;
        final int Yw;
        final int Yz;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Yw, Yz, YA, Yf);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$9

/* anonymous class */
    class _cls9 extends LoadExtendedGamesImpl
    {

        final boolean Yf;
        final String Yv;
        final int Yw;
        final boolean Yx;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Yv, Yw, false, false, Yf, Yx);
        }
    }

}
