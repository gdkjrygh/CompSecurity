// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class NotificationsImpl
    implements Notifications
{
    private static abstract class ContactSettingLoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.Notifications.ContactSettingLoadResult M(Status status)
        {
            return new com.google.android.gms.games.Notifications.ContactSettingLoadResult(this, status) {

                final ContactSettingLoadImpl Qb;
                final Status yJ;

                public Status getStatus()
                {
                    return yJ;
                }

            
            {
                Qb = contactsettingloadimpl;
                yJ = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return M(status);
        }

        private ContactSettingLoadImpl()
        {
        }
    }

    private static abstract class ContactSettingUpdateImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result c(Status status)
        {
            return d(status);
        }

        public Status d(Status status)
        {
            return status;
        }

        private ContactSettingUpdateImpl()
        {
        }
    }

    private static abstract class InboxCountImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.Notifications.InboxCountResult N(Status status)
        {
            return new com.google.android.gms.games.Notifications.InboxCountResult(this, status) {

                final InboxCountImpl Qc;
                final Status yJ;

                public Status getStatus()
                {
                    return yJ;
                }

            
            {
                Qc = inboxcountimpl;
                yJ = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return N(status);
        }

        private InboxCountImpl()
        {
        }
    }


    public NotificationsImpl()
    {
    }

    public void clear(GoogleApiClient googleapiclient, int i)
    {
        Games.c(googleapiclient).ch(i);
    }

    public void clearAll(GoogleApiClient googleapiclient)
    {
        clear(googleapiclient, 31);
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$1

/* anonymous class */
    class _cls1 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        final String PV;

        public com.google.android.gms.games.Notifications.GameMuteStatusChangeResult K(Status status)
        {
            return new com.google.android.gms.games.Notifications.GameMuteStatusChangeResult(this, status) {

                final _cls1 PW;
                final Status yJ;

                public Status getStatus()
                {
                    return yJ;
                }

            
            {
                PW = _pcls1;
                yJ = status;
                super();
            }
            };
        }

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, PV, true);
        }

        public Result c(Status status)
        {
            return K(status);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$2

/* anonymous class */
    class _cls2 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        final String PV;

        public com.google.android.gms.games.Notifications.GameMuteStatusChangeResult K(Status status)
        {
            return new com.google.android.gms.games.Notifications.GameMuteStatusChangeResult(this, status) {

                final _cls2 PX;
                final Status yJ;

                public Status getStatus()
                {
                    return yJ;
                }

            
            {
                PX = _pcls2;
                yJ = status;
                super();
            }
            };
        }

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, PV, false);
        }

        public Result c(Status status)
        {
            return K(status);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$3

/* anonymous class */
    class _cls3 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        final String PV;

        public com.google.android.gms.games.Notifications.GameMuteStatusLoadResult L(Status status)
        {
            return new com.google.android.gms.games.Notifications.GameMuteStatusLoadResult(this, status) {

                final _cls3 PY;
                final Status yJ;

                public Status getStatus()
                {
                    return yJ;
                }

            
            {
                PY = _pcls3;
                yJ = status;
                super();
            }
            };
        }

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.q(this, PV);
        }

        public Result c(Status status)
        {
            return L(status);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$4

/* anonymous class */
    class _cls4 extends ContactSettingLoadImpl
    {

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.i(this);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$5

/* anonymous class */
    class _cls5 extends ContactSettingLoadImpl
    {

        final boolean Pe;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.f(this, Pe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$6

/* anonymous class */
    class _cls6 extends ContactSettingUpdateImpl
    {

        final boolean PZ;
        final Bundle Qa;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, PZ, Qa);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$7

/* anonymous class */
    class _cls7 extends InboxCountImpl
    {

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.j(this);
        }
    }

}
