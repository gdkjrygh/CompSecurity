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
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

public final class InvitationsImpl
    implements Invitations
{
    private static abstract class LoadInvitationsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult C(Status status)
        {
            return new com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult(this, status) {

                final LoadInvitationsImpl Kn;
                final Status wz;

                public InvitationBuffer getInvitations()
                {
                    return new InvitationBuffer(DataHolder.empty(14));
                }

                public Status getStatus()
                {
                    return wz;
                }

                public void release()
                {
                }

            
            {
                Kn = loadinvitationsimpl;
                wz = status;
                super();
            }
            };
        }

        public Result d(Status status)
        {
            return C(status);
        }

        private LoadInvitationsImpl()
        {
        }

    }


    public InvitationsImpl()
    {
    }

    public Intent getInvitationInboxIntent(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).gs();
    }

    public PendingResult loadInvitations(GoogleApiClient googleapiclient)
    {
        return loadInvitations(googleapiclient, 0);
    }

    public PendingResult loadInvitations(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.a(new LoadInvitationsImpl(i) {

            final int Kk;
            final InvitationsImpl Kl;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(this, Kk);
            }

            
            {
                Kl = InvitationsImpl.this;
                Kk = i;
                super();
            }
        });
    }

    public void registerInvitationListener(GoogleApiClient googleapiclient, OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        Games.c(googleapiclient).a(oninvitationreceivedlistener);
    }

    public void unregisterInvitationListener(GoogleApiClient googleapiclient)
    {
        Games.c(googleapiclient).gt();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/InvitationsImpl$2

/* anonymous class */
    class _cls2 extends LoadInvitationsImpl
    {

        final String JT;
        final int Kk;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, JT, Kk);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/InvitationsImpl$3

/* anonymous class */
    class _cls3 extends LoadInvitationsImpl
    {

        final String Km;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.l(this, Km);
        }
    }

}
