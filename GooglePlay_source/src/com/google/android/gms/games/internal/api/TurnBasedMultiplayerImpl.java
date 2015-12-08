// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.IGamesService;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;

public final class TurnBasedMultiplayerImpl
    implements TurnBasedMultiplayer
{
    private static abstract class InitiateMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult() {

                final InitiateMatchImpl this$0;
                final Status val$status;

                public final TurnBasedMatch getMatch()
                {
                    return null;
                }

                public final Status getStatus()
                {
                    return status;
                }

            
            {
                this$0 = final_initiatematchimpl;
                status = Status.this;
                super();
            }
            };
        }

        private InitiateMatchImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        InitiateMatchImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class LoadMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult() {

                final LoadMatchImpl this$0;
                final Status val$status;

                public final TurnBasedMatch getMatch()
                {
                    return null;
                }

                public final Status getStatus()
                {
                    return status;
                }

            
            {
                this$0 = final_loadmatchimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadMatchImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadMatchImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class LoadMatchesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult() {

                final LoadMatchesImpl this$0;
                final Status val$status;

                public final LoadMatchesResponse getMatches()
                {
                    return new LoadMatchesResponse(new Bundle());
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_loadmatchesimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadMatchesImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadMatchesImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public TurnBasedMultiplayerImpl()
    {
    }

    public final PendingResult acceptInvitation(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.execute(new InitiateMatchImpl(s) {

            final TurnBasedMultiplayerImpl this$0;
            final String val$invitationId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s1 = invitationId;
                ((IGamesService)client.getService()).acceptTurnBasedInvitation(new com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks(this), s1);
            }

            
            {
                this$0 = TurnBasedMultiplayerImpl.this;
                invitationId = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult acceptInvitationFirstParty(final GoogleApiClient final_googleapiclient, final String gameId, String s)
    {
        return final_googleapiclient.execute(new InitiateMatchImpl(s) {

            final TurnBasedMultiplayerImpl this$0;
            final String val$gameId;
            final String val$matchId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s1 = gameId;
                String s2 = matchId;
                ((IGamesService)client.getService()).acceptTurnBasedInvitationFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks(this), s1, s2);
            }

            
            {
                this$0 = TurnBasedMultiplayerImpl.this;
                gameId = s;
                matchId = s1;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final void declineInvitation(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.declineInvitation(s, 1);
        }
    }

    public final void declineInvitationFirstParty(GoogleApiClient googleapiclient, String s, String s1)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.declineInvitationFirstParty(s, s1, 1);
        }
    }

    public final void dismissInvitation(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.dismissInvitation(s, 1);
        }
    }

    public final void dismissInvitationFirstParty(GoogleApiClient googleapiclient, String s, String s1)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.dismissInvitationFirstParty(s, s1, 1);
        }
    }

    public final void dismissMatch(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ((IGamesService)googleapiclient.getService()).dismissMatch(s);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void dismissMatchFirstParty(GoogleApiClient googleapiclient, String s, String s1)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        ((IGamesService)googleapiclient.getService()).dismissTurnBasedMatchFirstParty(s, s1);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final PendingResult loadMatch(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.enqueue(new LoadMatchImpl(s) {

            final TurnBasedMultiplayerImpl this$0;
            final String val$matchId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s1 = matchId;
                ((IGamesService)client.getService()).getTurnBasedMatch(new com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchLoadedBinderCallbacks(this), s1);
            }

            
            {
                this$0 = TurnBasedMultiplayerImpl.this;
                matchId = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadMatchesByStatus(final GoogleApiClient final_googleapiclient, final int invitationSortOrder, int ai[])
    {
        return final_googleapiclient.enqueue(new LoadMatchesImpl(ai) {

            final TurnBasedMultiplayerImpl this$0;
            final int val$invitationSortOrder;
            final int val$matchTurnStatuses[];

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                int i = invitationSortOrder;
                int ai1[] = matchTurnStatuses;
                ((IGamesService)client.getService()).loadTurnBasedMatchesV2(new com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchesLoadedBinderCallbacks(this), i, ai1);
            }

            
            {
                this$0 = TurnBasedMultiplayerImpl.this;
                invitationSortOrder = i;
                matchTurnStatuses = ai;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadMatchesByStatus(GoogleApiClient googleapiclient, int ai[])
    {
        return loadMatchesByStatus(googleapiclient, 0, ai);
    }

    public final PendingResult loadMatchesByStatusFirstParty$1a7105dc(final GoogleApiClient final_googleapiclient, final String gameId, int ai[])
    {
        return final_googleapiclient.enqueue(new LoadMatchesImpl(ai) {

            final TurnBasedMultiplayerImpl this$0;
            final String val$gameId;
            final int val$invitationSortOrder = 1;
            final int val$matchTurnStatuses[];

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = gameId;
                int i = invitationSortOrder;
                int ai1[] = matchTurnStatuses;
                ((IGamesService)client.getService()).loadTurnBasedMatchesFirstPartyV2(new com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchesLoadedBinderCallbacks(this), s, i, ai1);
            }

            
            {
                this$0 = TurnBasedMultiplayerImpl.this;
                gameId = s;
                matchTurnStatuses = ai;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final void registerMatchUpdateListener(GoogleApiClient googleapiclient, OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
    {
        GamesClientImpl gamesclientimpl;
        gamesclientimpl = Games.getConnectedClientImpl(googleapiclient, false);
        if (gamesclientimpl == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        googleapiclient = googleapiclient.registerListener(onturnbasedmatchupdatereceivedlistener);
        googleapiclient = new com.google.android.gms.games.internal.GamesClientImpl.MatchUpdateReceivedBinderCallback(googleapiclient);
        ((IGamesService)gamesclientimpl.getService()).registerMatchUpdateListener(googleapiclient, gamesclientimpl.mClientId);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void registerMatchUpdateListenerFirstParty(GoogleApiClient googleapiclient, OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener, String s)
    {
        GamesClientImpl gamesclientimpl;
        gamesclientimpl = Games.getConnectedClientImpl(googleapiclient, false);
        if (gamesclientimpl == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        googleapiclient = googleapiclient.registerListener(onturnbasedmatchupdatereceivedlistener);
        googleapiclient = new com.google.android.gms.games.internal.GamesClientImpl.MatchUpdateReceivedBinderCallback(googleapiclient);
        ((IGamesService)gamesclientimpl.getService()).registerMatchUpdateListenerFirstParty(googleapiclient, gamesclientimpl.mClientId, s);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final PendingResult rematch(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.execute(new InitiateMatchImpl(s) {

            final TurnBasedMultiplayerImpl this$0;
            final String val$matchId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s1 = matchId;
                ((IGamesService)client.getService()).rematchTurnBasedMatch(new com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks(this), s1);
            }

            
            {
                this$0 = TurnBasedMultiplayerImpl.this;
                matchId = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult rematchFirstParty(final GoogleApiClient final_googleapiclient, final String gameId, String s)
    {
        return final_googleapiclient.execute(new InitiateMatchImpl(s) {

            final TurnBasedMultiplayerImpl this$0;
            final String val$gameId;
            final String val$matchId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s1 = gameId;
                String s2 = matchId;
                ((IGamesService)client.getService()).rematchTurnBasedMatchFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks(this), s1, s2);
            }

            
            {
                this$0 = TurnBasedMultiplayerImpl.this;
                gameId = s;
                matchId = s1;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final void unregisterMatchUpdateListener(GoogleApiClient googleapiclient)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        ((IGamesService)googleapiclient.getService()).unregisterMatchUpdateListener(((GamesClientImpl) (googleapiclient)).mClientId);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void unregisterMatchUpdateListenerFirstParty(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ((IGamesService)googleapiclient.getService()).unregisterMatchUpdateListenerFirstParty(((GamesClientImpl) (googleapiclient)).mClientId, s);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }
}
