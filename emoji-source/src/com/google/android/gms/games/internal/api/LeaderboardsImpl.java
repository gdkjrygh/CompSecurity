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
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

public final class LeaderboardsImpl
    implements Leaderboards
{
    private static abstract class LoadMetadataImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult G(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult(this, status) {

                final LoadMetadataImpl PR;
                final Status yJ;

                public LeaderboardBuffer getLeaderboards()
                {
                    return new LeaderboardBuffer(DataHolder.af(14));
                }

                public Status getStatus()
                {
                    return yJ;
                }

                public void release()
                {
                }

            
            {
                PR = loadmetadataimpl;
                yJ = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return G(status);
        }

        private LoadMetadataImpl()
        {
        }

    }

    private static abstract class LoadPlayerScoreImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult H(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult(this, status) {

                final LoadPlayerScoreImpl PS;
                final Status yJ;

                public LeaderboardScore getScore()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yJ;
                }

            
            {
                PS = loadplayerscoreimpl;
                yJ = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return H(status);
        }

        private LoadPlayerScoreImpl()
        {
        }

    }

    private static abstract class LoadScoresImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult I(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult(this, status) {

                final LoadScoresImpl PT;
                final Status yJ;

                public Leaderboard getLeaderboard()
                {
                    return null;
                }

                public LeaderboardScoreBuffer getScores()
                {
                    return new LeaderboardScoreBuffer(DataHolder.af(14));
                }

                public Status getStatus()
                {
                    return yJ;
                }

                public void release()
                {
                }

            
            {
                PT = loadscoresimpl;
                yJ = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return I(status);
        }

        private LoadScoresImpl()
        {
        }

    }

    protected static abstract class SubmitScoreImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult J(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult(this, status) {

                final SubmitScoreImpl PU;
                final Status yJ;

                public ScoreSubmissionData getScoreData()
                {
                    return new ScoreSubmissionData(DataHolder.af(14));
                }

                public Status getStatus()
                {
                    return yJ;
                }

                public void release()
                {
                }

            
            {
                PU = submitscoreimpl;
                yJ = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return J(status);
        }

        protected SubmitScoreImpl()
        {
        }
    }


    public LeaderboardsImpl()
    {
    }

    public Intent getAllLeaderboardsIntent(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).hd();
    }

    public Intent getLeaderboardIntent(GoogleApiClient googleapiclient, String s)
    {
        return Games.c(googleapiclient).aR(s);
    }

    public PendingResult loadCurrentPlayerLeaderboardScore(GoogleApiClient googleapiclient, String s, int i, int j)
    {
        return googleapiclient.a(new LoadPlayerScoreImpl(s, i, j) {

            final LeaderboardsImpl PI;
            final String PJ;
            final int PK;
            final int PL;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, null, PJ, PK, PL);
            }

            
            {
                PI = LeaderboardsImpl.this;
                PJ = s;
                PK = i;
                PL = j;
                super();
            }
        });
    }

    public PendingResult loadLeaderboardMetadata(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return googleapiclient.a(new LoadMetadataImpl(s, flag) {

            final LeaderboardsImpl PI;
            final String PJ;
            final boolean Pe;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, PJ, Pe);
            }

            
            {
                PI = LeaderboardsImpl.this;
                PJ = s;
                Pe = flag;
                super();
            }
        });
    }

    public PendingResult loadLeaderboardMetadata(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.a(new LoadMetadataImpl(flag) {

            final LeaderboardsImpl PI;
            final boolean Pe;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, Pe);
            }

            
            {
                PI = LeaderboardsImpl.this;
                Pe = flag;
                super();
            }
        });
    }

    public PendingResult loadMoreScores(GoogleApiClient googleapiclient, LeaderboardScoreBuffer leaderboardscorebuffer, int i, int j)
    {
        return googleapiclient.a(new LoadScoresImpl(leaderboardscorebuffer, i, j) {

            final LeaderboardsImpl PI;
            final int PM;
            final LeaderboardScoreBuffer PN;
            final int PO;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, PN, PM, PO);
            }

            
            {
                PI = LeaderboardsImpl.this;
                PN = leaderboardscorebuffer;
                PM = i;
                PO = j;
                super();
            }
        });
    }

    public PendingResult loadPlayerCenteredScores(GoogleApiClient googleapiclient, String s, int i, int j, int k)
    {
        return loadPlayerCenteredScores(googleapiclient, s, i, j, k, false);
    }

    public PendingResult loadPlayerCenteredScores(GoogleApiClient googleapiclient, String s, int i, int j, int k, boolean flag)
    {
        return googleapiclient.a(new LoadScoresImpl(s, i, j, k, flag) {

            final LeaderboardsImpl PI;
            final String PJ;
            final int PK;
            final int PL;
            final int PM;
            final boolean Pe;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, PJ, PK, PL, PM, Pe);
            }

            
            {
                PI = LeaderboardsImpl.this;
                PJ = s;
                PK = i;
                PL = j;
                PM = k;
                Pe = flag;
                super();
            }
        });
    }

    public PendingResult loadTopScores(GoogleApiClient googleapiclient, String s, int i, int j, int k)
    {
        return loadTopScores(googleapiclient, s, i, j, k, false);
    }

    public PendingResult loadTopScores(GoogleApiClient googleapiclient, String s, int i, int j, int k, boolean flag)
    {
        return googleapiclient.a(new LoadScoresImpl(s, i, j, k, flag) {

            final LeaderboardsImpl PI;
            final String PJ;
            final int PK;
            final int PL;
            final int PM;
            final boolean Pe;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, PJ, PK, PL, PM, Pe);
            }

            
            {
                PI = LeaderboardsImpl.this;
                PJ = s;
                PK = i;
                PL = j;
                PM = k;
                Pe = flag;
                super();
            }
        });
    }

    public void submitScore(GoogleApiClient googleapiclient, String s, long l)
    {
        submitScore(googleapiclient, s, l, null);
    }

    public void submitScore(GoogleApiClient googleapiclient, String s, long l, String s1)
    {
        Games.c(googleapiclient).a(null, s, l, s1);
    }

    public PendingResult submitScoreImmediate(GoogleApiClient googleapiclient, String s, long l)
    {
        return submitScoreImmediate(googleapiclient, s, l, null);
    }

    public PendingResult submitScoreImmediate(GoogleApiClient googleapiclient, String s, long l, String s1)
    {
        return googleapiclient.b(new SubmitScoreImpl(s, l, s1) {

            final LeaderboardsImpl PI;
            final String PJ;
            final long PP;
            final String PQ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, PJ, PP, PQ);
            }

            
            {
                PI = LeaderboardsImpl.this;
                PJ = s;
                PP = l;
                PQ = s1;
                super();
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$10

/* anonymous class */
    class _cls10 extends LoadScoresImpl
    {

        final String PJ;
        final int PK;
        final int PL;
        final int PM;
        final boolean Pe;
        final String Ph;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Ph, PJ, PK, PL, PM, Pe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$11

/* anonymous class */
    class _cls11 extends LoadScoresImpl
    {

        final String PJ;
        final int PK;
        final int PL;
        final int PM;
        final boolean Pe;
        final String Ph;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, Ph, PJ, PK, PL, PM, Pe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$8

/* anonymous class */
    class _cls8 extends LoadMetadataImpl
    {

        final boolean Pe;
        final String Ph;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.c(this, Ph, Pe);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$9

/* anonymous class */
    class _cls9 extends LoadMetadataImpl
    {

        final String PJ;
        final boolean Pe;
        final String Ph;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Ph, PJ, Pe);
        }
    }

}
