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
import com.google.android.gms.games.internal.IGamesService;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

public final class InvitationsImpl
    implements Invitations
{
    private static abstract class LoadInvitationsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult() {

                final LoadInvitationsImpl this$0;
                final Status val$status;

                public final InvitationBuffer getInvitations()
                {
                    return new InvitationBuffer(DataHolder.empty(14));
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_loadinvitationsimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadInvitationsImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadInvitationsImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public InvitationsImpl()
    {
    }

    public final Intent getPublicInvitationListIntentRestricted(GoogleApiClient googleapiclient, ZInvitationCluster zinvitationcluster, String s, String s1)
    {
        return Games.getConnectedClientImpl(googleapiclient).getPublicInvitationListIntentRestricted(zinvitationcluster, s, s1);
    }

    public final PendingResult loadInvitationFirstParty(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.enqueue(new LoadInvitationsImpl(s) {

            final InvitationsImpl this$0;
            final String val$invitationId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s1 = invitationId;
                ((IGamesService)client.getService()).loadInvitationFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.InvitationsLoadedBinderCallback(this), s1);
            }

            
            {
                this$0 = InvitationsImpl.this;
                invitationId = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadInvitations$385d8060(final GoogleApiClient final_googleapiclient)
    {
        return final_googleapiclient.enqueue(new LoadInvitationsImpl(1) {

            final InvitationsImpl this$0;
            final int val$sortOrder = 1;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                int i = sortOrder;
                ((IGamesService)client.getService()).loadInvitationsV2(new com.google.android.gms.games.internal.GamesClientImpl.InvitationsLoadedBinderCallback(this), i);
            }

            
            {
                this$0 = InvitationsImpl.this;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadInvitationsFirstParty$b85066a(final GoogleApiClient final_googleapiclient, final String gameId)
    {
        return final_googleapiclient.enqueue(new LoadInvitationsImpl(1) {

            final InvitationsImpl this$0;
            final String val$gameId;
            final int val$sortOrder = 1;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = gameId;
                int i = sortOrder;
                ((IGamesService)client.getService()).loadInvitationsFirstPartyV3(new com.google.android.gms.games.internal.GamesClientImpl.InvitationsLoadedBinderCallback(this), s, i, false);
            }

            
            {
                this$0 = InvitationsImpl.this;
                gameId = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final void registerInvitationListener(GoogleApiClient googleapiclient, OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        GamesClientImpl gamesclientimpl;
        gamesclientimpl = Games.getConnectedClientImpl(googleapiclient, false);
        if (gamesclientimpl == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        googleapiclient = googleapiclient.registerListener(oninvitationreceivedlistener);
        googleapiclient = new com.google.android.gms.games.internal.GamesClientImpl.InvitationReceivedBinderCallback(googleapiclient);
        ((IGamesService)gamesclientimpl.getService()).registerInvitationListener(googleapiclient, gamesclientimpl.mClientId);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void registerInvitationListenerFirstParty(GoogleApiClient googleapiclient, OnInvitationReceivedListener oninvitationreceivedlistener, String s)
    {
        GamesClientImpl gamesclientimpl;
        gamesclientimpl = Games.getConnectedClientImpl(googleapiclient, false);
        if (gamesclientimpl == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        googleapiclient = googleapiclient.registerListener(oninvitationreceivedlistener);
        googleapiclient = new com.google.android.gms.games.internal.GamesClientImpl.InvitationReceivedBinderCallback(googleapiclient);
        ((IGamesService)gamesclientimpl.getService()).registerInvitationListenerFirstParty(googleapiclient, gamesclientimpl.mClientId, s);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void registerInvitationPopupListenerRestricted(GoogleApiClient googleapiclient)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        ((IGamesService)googleapiclient.getService()).registerInvitationPopupListenerRestricted(((GamesClientImpl) (googleapiclient)).mClientId);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void unregisterInvitationListener(GoogleApiClient googleapiclient)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        ((IGamesService)googleapiclient.getService()).unregisterInvitationListener(((GamesClientImpl) (googleapiclient)).mClientId);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void unregisterInvitationListenerFirstParty(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ((IGamesService)googleapiclient.getService()).unregisterInvitationListenerFirstParty(((GamesClientImpl) (googleapiclient)).mClientId, s);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }
}
