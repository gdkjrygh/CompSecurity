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
import com.google.android.gms.games.internal.IGamesService;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;

public final class GamesMetadataImpl
    implements GamesMetadata
{
    private static abstract class LoadGameSearchSuggestionsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult() {

                final LoadGameSearchSuggestionsImpl this$0;
                final Status val$status;

                public final Status getStatus()
                {
                    return status;
                }

                public final GameSearchSuggestionBuffer getSuggestions()
                {
                    return new GameSearchSuggestionBuffer(DataHolder.empty(14));
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_loadgamesearchsuggestionsimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadGameSearchSuggestionsImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadGameSearchSuggestionsImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class LoadGamesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.GamesMetadata.LoadGamesResult() {

                final LoadGamesImpl this$0;
                final Status val$status;

                public final GameBuffer getGames()
                {
                    return new GameBuffer(DataHolder.empty(14));
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

    public final Game getCurrentGame(GoogleApiClient googleapiclient)
    {
        return Games.getConnectedClientImpl(googleapiclient).getCurrentGame();
    }

    public final PendingResult loadGame(GoogleApiClient googleapiclient)
    {
        return googleapiclient.enqueue(new LoadGamesImpl(googleapiclient) {

            final GamesMetadataImpl this$0;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((IGamesService)((GamesClientImpl)client).getService()).loadGame(new com.google.android.gms.games.internal.GamesClientImpl.GamesLoadedBinderCallback(this));
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                super(googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadGameSearchSuggestionsFirstParty(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.enqueue(new LoadGameSearchSuggestionsImpl(s) {

            final GamesMetadataImpl this$0;
            final String val$query;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s1 = query;
                ((IGamesService)client.getService()).loadGameSearchSuggestionsFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.GameSearchSuggestionsLoadedBinderCallback(this), s1);
            }

            
            {
                this$0 = GamesMetadataImpl.this;
                query = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }
}
