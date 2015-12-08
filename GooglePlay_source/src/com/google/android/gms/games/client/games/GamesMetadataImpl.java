// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.client.IPlayGamesService;
import com.google.android.gms.games.client.PlayGamesClientImpl;

// Referenced classes of package com.google.android.gms.games.client.games:
//            GamesMetadata, GameFirstPartyBuffer

public final class GamesMetadataImpl
    implements GamesMetadata
{
    private static abstract class LoadGamesImpl extends com.google.android.gms.games.client.PlayGames.BasePlayGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new GamesMetadata.LoadGamesResult() {

                final LoadGamesImpl this$0;
                final Status val$status;

                public final GameFirstPartyBuffer getGames()
                {
                    return new GameFirstPartyBuffer(DataHolder.empty(14));
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_loadgamesimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadGamesImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadGamesImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public GamesMetadataImpl()
    {
    }

    public final PendingResult loadCommonGames$4189436a(final GoogleApiClient final_googleapiclient, final String playerId, final int pageSize)
    {
        return final_googleapiclient.enqueue(new LoadGamesImpl(false) {

            final GamesMetadataImpl this$0;
            final boolean val$forceReload = false;
            final int val$pageSize;
            final String val$playerId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PlayGamesClientImpl)client).loadCommonGames(this, playerId, pageSize, false, forceReload);
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                playerId = s;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadGame(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.enqueue(new LoadGamesImpl(s) {

            final GamesMetadataImpl this$0;
            final String val$gameId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (PlayGamesClientImpl)client;
                String s1 = gameId;
                ((IPlayGamesService)client.getService()).loadGame(new com.google.android.gms.games.client.PlayGamesClientImpl.GamesLoadedBinderCallback(this), s1);
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                gameId = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadGames(final GoogleApiClient final_googleapiclient, final int collection, final int pageSize, boolean flag)
    {
        return final_googleapiclient.enqueue(new LoadGamesImpl(flag) {

            final GamesMetadataImpl this$0;
            final int val$collection;
            final boolean val$forceReload;
            final int val$pageSize;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PlayGamesClientImpl)client).loadGameCollection(this, pageSize, collection, false, forceReload);
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                pageSize = i;
                collection = j;
                forceReload = flag;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadMoreCommonGames(final GoogleApiClient final_googleapiclient, final String playerId, int i)
    {
        return final_googleapiclient.enqueue(new LoadGamesImpl(i) {

            final GamesMetadataImpl this$0;
            final int val$pageSize;
            final String val$playerId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PlayGamesClientImpl)client).loadCommonGames(this, playerId, pageSize, true, false);
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                playerId = s;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadMoreGames(final GoogleApiClient final_googleapiclient, int i, final int pageSize)
    {
        return final_googleapiclient.enqueue(new LoadGamesImpl(i) {

            final GamesMetadataImpl this$0;
            final int val$collection;
            final int val$pageSize;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PlayGamesClientImpl)client).loadGameCollection(this, pageSize, collection, true, false);
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                pageSize = i;
                collection = j;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadMoreRecentlyPlayedGames(final GoogleApiClient final_googleapiclient, int i)
    {
        return final_googleapiclient.enqueue(new LoadGamesImpl(i) {

            final GamesMetadataImpl this$0;
            final int val$pageSize;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PlayGamesClientImpl)client).loadRecentlyPlayedGamesForPlayer(this, null, pageSize, true, false);
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadMoreRecentlyPlayedGamesForPlayer(final GoogleApiClient final_googleapiclient, final String playerId, int i)
    {
        return final_googleapiclient.enqueue(new LoadGamesImpl(i) {

            final GamesMetadataImpl this$0;
            final int val$pageSize;
            final String val$playerId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PlayGamesClientImpl)client).loadRecentlyPlayedGamesForPlayer(this, playerId, pageSize, true, false);
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                playerId = s;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadRecentlyPlayedGames$91af0f4(final GoogleApiClient final_googleapiclient, final int pageSize)
    {
        return final_googleapiclient.enqueue(new LoadGamesImpl(false) {

            final GamesMetadataImpl this$0;
            final boolean val$forceReload = false;
            final int val$pageSize;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PlayGamesClientImpl)client).loadRecentlyPlayedGamesForPlayer(this, null, pageSize, false, forceReload);
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadRecentlyPlayedGamesForPlayer$4189436a(final GoogleApiClient final_googleapiclient, final String playerId, final int pageSize)
    {
        return final_googleapiclient.enqueue(new LoadGamesImpl(false) {

            final GamesMetadataImpl this$0;
            final boolean val$forceReload = false;
            final int val$pageSize;
            final String val$playerId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PlayGamesClientImpl)client).loadRecentlyPlayedGamesForPlayer(this, playerId, pageSize, false, forceReload);
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                playerId = s;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult searchForGames$4189436a(final GoogleApiClient final_googleapiclient, final String query, final int pageSize)
    {
        return final_googleapiclient.enqueue(new LoadGamesImpl(false) {

            final GamesMetadataImpl this$0;
            final boolean val$forceReload = false;
            final int val$pageSize;
            final String val$query;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PlayGamesClientImpl)client).searchForGames(this, query, pageSize, false, forceReload);
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                query = s;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult searchForMoreGames(final GoogleApiClient final_googleapiclient, final String query, int i)
    {
        return final_googleapiclient.enqueue(new LoadGamesImpl(i) {

            final GamesMetadataImpl this$0;
            final int val$pageSize;
            final String val$query;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((PlayGamesClientImpl)client).searchForGames(this, query, pageSize, true, false);
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                query = s;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }
}
