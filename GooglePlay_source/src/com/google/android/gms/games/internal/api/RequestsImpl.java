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
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests;
import java.util.ArrayList;
import java.util.List;

public final class RequestsImpl
    implements Requests
{
    private static abstract class LoadRequestsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.request.Requests.LoadRequestsResult() {

                final LoadRequestsImpl this$0;
                final Status val$status;

                public final GameRequestBuffer getRequests(int i)
                {
                    return new GameRequestBuffer(DataHolder.empty(status.mStatusCode));
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_loadrequestsimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadRequestsImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadRequestsImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class SendRequestImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.request.Requests.SendRequestResult() {

                final SendRequestImpl this$0;
                final Status val$status;

                public final Status getStatus()
                {
                    return status;
                }

            
            {
                this$0 = final_sendrequestimpl;
                status = Status.this;
                super();
            }
            };
        }

        private SendRequestImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        SendRequestImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class UpdateRequestsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.request.Requests.UpdateRequestsResult() {

                final UpdateRequestsImpl this$0;
                final Status val$status;

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_updaterequestsimpl;
                status = Status.this;
                super();
            }
            };
        }

        private UpdateRequestsImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        UpdateRequestsImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public RequestsImpl()
    {
    }

    public final PendingResult dismissRequest(final GoogleApiClient final_googleapiclient, String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        return final_googleapiclient.execute(new UpdateRequestsImpl((String[])arraylist.toArray(new String[arraylist.size()])) {

            final RequestsImpl this$0;
            final String val$requestIdsArr[];

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String as[] = requestIdsArr;
                ((IGamesService)client.getService()).dismissRequests(new com.google.android.gms.games.internal.GamesClientImpl.RequestsUpdatedBinderCallbacks(this), as);
            }

            
            {
                this$0 = RequestsImpl.this;
                requestIdsArr = as;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult dismissRequestFirstParty(final GoogleApiClient final_googleapiclient, final String gameId, final String currentPlayerId, String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        return final_googleapiclient.execute(new UpdateRequestsImpl((String[])arraylist.toArray(new String[arraylist.size()])) {

            final RequestsImpl this$0;
            final String val$currentPlayerId;
            final String val$gameId;
            final String val$requestIdsArr[];

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s1 = gameId;
                String s2 = currentPlayerId;
                String as[] = requestIdsArr;
                ((IGamesService)client.getService()).dismissRequestsFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.RequestsUpdatedBinderCallbacks(this), s1, s2, as);
            }

            
            {
                this$0 = RequestsImpl.this;
                gameId = s;
                currentPlayerId = s1;
                requestIdsArr = as;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final int getMaxPayloadSize(GoogleApiClient googleapiclient)
    {
        return Games.getConnectedClientImpl(googleapiclient).getMaxRequestPayloadSize();
    }

    public final Intent getPublicRequestListIntentRestricted(GoogleApiClient googleapiclient, GameRequestCluster gamerequestcluster, String s)
    {
        return Games.getConnectedClientImpl(googleapiclient).getPublicRequestListIntentRestricted(gamerequestcluster, s);
    }

    public final PendingResult loadRequests$7e4fe440(final GoogleApiClient final_googleapiclient, int i)
    {
        return final_googleapiclient.enqueue(new LoadRequestsImpl(1) {

            final RequestsImpl this$0;
            final int val$requestDirection = 0;
            final int val$sortOrder = 1;
            final int val$types;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                int j = requestDirection;
                int k = types;
                int l = sortOrder;
                ((IGamesService)client.getService()).loadRequests(new com.google.android.gms.games.internal.GamesClientImpl.RequestsLoadedBinderCallbacks(this), j, k, l);
            }

            
            {
                this$0 = RequestsImpl.this;
                types = j;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadRequestsFirstParty$2c3ee1ac(final GoogleApiClient final_googleapiclient, final String gameId, final String currentPlayerId, int i, int j)
    {
        return final_googleapiclient.enqueue(new LoadRequestsImpl(j) {

            final RequestsImpl this$0;
            final String val$currentPlayerId;
            final String val$gameId;
            final int val$requestDirection = 0;
            final int val$sortOrder;
            final int val$types;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = gameId;
                String s1 = currentPlayerId;
                int k = requestDirection;
                int l = types;
                int i1 = sortOrder;
                ((IGamesService)client.getService()).loadRequestsFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.RequestsLoadedBinderCallbacks(this), s, s1, k, l, i1);
            }

            
            {
                this$0 = RequestsImpl.this;
                gameId = s;
                currentPlayerId = s1;
                types = j;
                sortOrder = k;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final void registerRequestListener(GoogleApiClient googleapiclient, OnRequestReceivedListener onrequestreceivedlistener)
    {
        GamesClientImpl gamesclientimpl;
        gamesclientimpl = Games.getConnectedClientImpl(googleapiclient, false);
        if (gamesclientimpl == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        googleapiclient = googleapiclient.registerListener(onrequestreceivedlistener);
        googleapiclient = new com.google.android.gms.games.internal.GamesClientImpl.RequestReceivedBinderCallback(googleapiclient);
        ((IGamesService)gamesclientimpl.getService()).registerRequestListener(googleapiclient, gamesclientimpl.mClientId);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void registerRequestListenerFirstParty(GoogleApiClient googleapiclient, OnRequestReceivedListener onrequestreceivedlistener, String s)
    {
        GamesClientImpl gamesclientimpl;
        gamesclientimpl = Games.getConnectedClientImpl(googleapiclient, false);
        if (gamesclientimpl == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        googleapiclient = googleapiclient.registerListener(onrequestreceivedlistener);
        googleapiclient = new com.google.android.gms.games.internal.GamesClientImpl.RequestReceivedBinderCallback(googleapiclient);
        ((IGamesService)gamesclientimpl.getService()).registerRequestListenerFirstParty(googleapiclient, gamesclientimpl.mClientId, s);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final PendingResult sendRequestRestricted(final GoogleApiClient final_googleapiclient, final String gameId, List list, final int type, final byte payload[], int i)
    {
        final String recipientIds[] = new String[list.size()];
        for (int j = 0; j < recipientIds.length; j++)
        {
            recipientIds[j] = (String)list.get(j);
        }

        return final_googleapiclient.execute(new SendRequestImpl(i) {

            final RequestsImpl this$0;
            final String val$gameId;
            final byte val$payload[];
            final String val$recipientIds[];
            final int val$requestLifetimeDays;
            final int val$type;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = gameId;
                String as[] = recipientIds;
                int k = type;
                byte abyte0[] = payload;
                int l = requestLifetimeDays;
                ((IGamesService)client.getService()).sendRequestRestricted(new com.google.android.gms.games.internal.GamesClientImpl.RequestSentBinderCallbacks(this), s, as, k, abyte0, l);
            }

            
            {
                this$0 = RequestsImpl.this;
                gameId = s;
                recipientIds = as;
                type = i;
                payload = abyte0;
                requestLifetimeDays = j;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final void unregisterRequestListener(GoogleApiClient googleapiclient)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        ((IGamesService)googleapiclient.getService()).unregisterRequestListener(((GamesClientImpl) (googleapiclient)).mClientId);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void unregisterRequestListenerFirstParty(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ((IGamesService)googleapiclient.getService()).unregisterRequestListenerFirstParty(((GamesClientImpl) (googleapiclient)).mClientId, s);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }
}
