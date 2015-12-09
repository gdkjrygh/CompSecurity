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
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader;
import com.google.android.gms.games.leaderboard.Leaderboards;

public final class LeaderboardsImpl
    implements Leaderboards
{
    private static abstract class LoadMetadataImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult() {

                final LoadMetadataImpl this$0;
                final Status val$status;

                public final LeaderboardBuffer getLeaderboards()
                {
                    return new LeaderboardBuffer(DataHolder.empty(14));
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_loadmetadataimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadMetadataImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadMetadataImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class LoadScoresImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult() {

                final LoadScoresImpl this$0;
                final Status val$status;

                public final Leaderboard getLeaderboard()
                {
                    return null;
                }

                public final LeaderboardScoreBuffer getScores()
                {
                    return new LeaderboardScoreBuffer(DataHolder.empty(14));
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_loadscoresimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadScoresImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadScoresImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public LeaderboardsImpl()
    {
    }

    public final Intent getLeaderboardIntentInternal(GoogleApiClient googleapiclient, String s, String s1)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient).getLeaderboardIntent$6c972b94(s);
        if (googleapiclient != null)
        {
            googleapiclient.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", s1);
        }
        return googleapiclient;
    }

    public final PendingResult loadLeaderboardMetadata$4b6585cf(final GoogleApiClient final_googleapiclient)
    {
        return final_googleapiclient.enqueue(new LoadMetadataImpl(false) {

            final LeaderboardsImpl this$0;
            final boolean val$forceReload = false;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                boolean flag = forceReload;
                ((IGamesService)client.getService()).loadLeaderboardsV2(new com.google.android.gms.games.internal.GamesClientImpl.LeaderboardsLoadedBinderCallback(this), flag);
            }

            
            {
                this$0 = LeaderboardsImpl.this;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadLeaderboardMetadataFirstParty$70b7f367(final GoogleApiClient final_googleapiclient, final String gameId)
    {
        return final_googleapiclient.enqueue(new LoadMetadataImpl(false) {

            final LeaderboardsImpl this$0;
            final boolean val$forceReload = false;
            final String val$gameId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = gameId;
                boolean flag = forceReload;
                ((IGamesService)client.getService()).loadLeaderboardsFirstPartyV2(new com.google.android.gms.games.internal.GamesClientImpl.LeaderboardsLoadedBinderCallback(this), s, flag);
            }

            
            {
                this$0 = LeaderboardsImpl.this;
                gameId = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadMoreScores(final GoogleApiClient final_googleapiclient, final LeaderboardScoreBuffer buffer, final int maxResults, int i)
    {
        return final_googleapiclient.enqueue(new LoadScoresImpl(i) {

            final LeaderboardsImpl this$0;
            final LeaderboardScoreBuffer val$buffer;
            final int val$maxResults;
            final int val$pageDirection;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                LeaderboardScoreBuffer leaderboardscorebuffer = buffer;
                int j = maxResults;
                int k = pageDirection;
                ((IGamesService)client.getService()).loadMoreScores(new com.google.android.gms.games.internal.GamesClientImpl.LeaderboardScoresLoadedBinderCallback(this), leaderboardscorebuffer.mHeader.mBundle, j, k);
            }

            
            {
                this$0 = LeaderboardsImpl.this;
                buffer = leaderboardscorebuffer;
                maxResults = i;
                pageDirection = j;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadTopScores(final GoogleApiClient final_googleapiclient, final String leaderboardId, final int span, final int leaderboardCollection, final int maxResults, boolean flag)
    {
        return final_googleapiclient.enqueue(new LoadScoresImpl(flag) {

            final LeaderboardsImpl this$0;
            final boolean val$forceReload;
            final int val$leaderboardCollection;
            final String val$leaderboardId;
            final int val$maxResults;
            final int val$span;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = leaderboardId;
                int i = span;
                int j = leaderboardCollection;
                int k = maxResults;
                boolean flag1 = forceReload;
                ((IGamesService)client.getService()).loadTopScores(new com.google.android.gms.games.internal.GamesClientImpl.LeaderboardScoresLoadedBinderCallback(this), s, i, j, k, flag1);
            }

            
            {
                this$0 = LeaderboardsImpl.this;
                leaderboardId = s;
                span = i;
                leaderboardCollection = j;
                maxResults = k;
                forceReload = flag;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadTopScoresFirstParty(final GoogleApiClient final_googleapiclient, final String gameId, final String leaderboardId, final int span, final int leaderboardCollection, final int maxResults, boolean flag)
    {
        return final_googleapiclient.enqueue(new LoadScoresImpl(flag) {

            final LeaderboardsImpl this$0;
            final boolean val$forceReload;
            final String val$gameId;
            final int val$leaderboardCollection;
            final String val$leaderboardId;
            final int val$maxResults;
            final int val$span;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = gameId;
                String s1 = leaderboardId;
                int i = span;
                int j = leaderboardCollection;
                int k = maxResults;
                boolean flag1 = forceReload;
                ((IGamesService)client.getService()).loadTopScoresFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.LeaderboardScoresLoadedBinderCallback(this), s, s1, i, j, k, flag1);
            }

            
            {
                this$0 = LeaderboardsImpl.this;
                gameId = s;
                leaderboardId = s1;
                span = i;
                leaderboardCollection = j;
                maxResults = k;
                forceReload = flag;
                super(final_googleapiclient, (byte)0);
            }
        });
    }
}
