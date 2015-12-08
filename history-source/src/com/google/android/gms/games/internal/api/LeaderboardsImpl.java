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

        public com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult U(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult(this, status) {

                final Status DS;
                final LoadMetadataImpl aaN;

                public LeaderboardBuffer getLeaderboards()
                {
                    return new LeaderboardBuffer(DataHolder.av(14));
                }

                public Status getStatus()
                {
                    return DS;
                }

                public void release()
                {
                }

            
            {
                aaN = loadmetadataimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return U(status);
        }

        private LoadMetadataImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadPlayerScoreImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult V(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult(this, status) {

                final Status DS;
                final LoadPlayerScoreImpl aaO;

                public LeaderboardScore getScore()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return DS;
                }

            
            {
                aaO = loadplayerscoreimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return V(status);
        }

        private LoadPlayerScoreImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadScoresImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult W(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult(this, status) {

                final Status DS;
                final LoadScoresImpl aaP;

                public Leaderboard getLeaderboard()
                {
                    return null;
                }

                public LeaderboardScoreBuffer getScores()
                {
                    return new LeaderboardScoreBuffer(DataHolder.av(14));
                }

                public Status getStatus()
                {
                    return DS;
                }

                public void release()
                {
                }

            
            {
                aaP = loadscoresimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return W(status);
        }

        private LoadScoresImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    protected static abstract class SubmitScoreImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult X(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult(this, status) {

                final Status DS;
                final SubmitScoreImpl aaQ;

                public ScoreSubmissionData getScoreData()
                {
                    return new ScoreSubmissionData(DataHolder.av(14));
                }

                public Status getStatus()
                {
                    return DS;
                }

                public void release()
                {
                }

            
            {
                aaQ = submitscoreimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return X(status);
        }

        protected SubmitScoreImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public LeaderboardsImpl()
    {
    }

    public Intent getAllLeaderboardsIntent(GoogleApiClient googleapiclient)
    {
        return Games.d(googleapiclient).ll();
    }

    public Intent getLeaderboardIntent(GoogleApiClient googleapiclient, String s)
    {
        return getLeaderboardIntent(googleapiclient, s, -1);
    }

    public Intent getLeaderboardIntent(GoogleApiClient googleapiclient, String s, int i)
    {
        return Games.d(googleapiclient).n(s, i);
    }

    public PendingResult loadCurrentPlayerLeaderboardScore(GoogleApiClient googleapiclient, String s, int i, int j)
    {
        return googleapiclient.a(new LoadPlayerScoreImpl(googleapiclient, s, i, j) {

            final LeaderboardsImpl aaE;
            final String aaF;
            final int aaG;
            final int aaH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, null, aaF, aaG, aaH);
            }

            
            {
                aaE = LeaderboardsImpl.this;
                aaF = s;
                aaG = i;
                aaH = j;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadLeaderboardMetadata(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return googleapiclient.a(new LoadMetadataImpl(googleapiclient, s, flag) {

            final boolean ZW;
            final LeaderboardsImpl aaE;
            final String aaF;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, aaF, ZW);
            }

            
            {
                aaE = LeaderboardsImpl.this;
                aaF = s;
                ZW = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadLeaderboardMetadata(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.a(new LoadMetadataImpl(googleapiclient, flag) {

            final boolean ZW;
            final LeaderboardsImpl aaE;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, ZW);
            }

            
            {
                aaE = LeaderboardsImpl.this;
                ZW = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadMoreScores(GoogleApiClient googleapiclient, LeaderboardScoreBuffer leaderboardscorebuffer, int i, int j)
    {
        return googleapiclient.a(new LoadScoresImpl(googleapiclient, leaderboardscorebuffer, i, j) {

            final LeaderboardsImpl aaE;
            final int aaI;
            final LeaderboardScoreBuffer aaJ;
            final int aaK;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, aaJ, aaI, aaK);
            }

            
            {
                aaE = LeaderboardsImpl.this;
                aaJ = leaderboardscorebuffer;
                aaI = i;
                aaK = j;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadPlayerCenteredScores(GoogleApiClient googleapiclient, String s, int i, int j, int k)
    {
        return loadPlayerCenteredScores(googleapiclient, s, i, j, k, false);
    }

    public PendingResult loadPlayerCenteredScores(GoogleApiClient googleapiclient, String s, int i, int j, int k, boolean flag)
    {
        return googleapiclient.a(new LoadScoresImpl(googleapiclient, s, i, j, k, flag) {

            final boolean ZW;
            final LeaderboardsImpl aaE;
            final String aaF;
            final int aaG;
            final int aaH;
            final int aaI;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, aaF, aaG, aaH, aaI, ZW);
            }

            
            {
                aaE = LeaderboardsImpl.this;
                aaF = s;
                aaG = i;
                aaH = j;
                aaI = k;
                ZW = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadTopScores(GoogleApiClient googleapiclient, String s, int i, int j, int k)
    {
        return loadTopScores(googleapiclient, s, i, j, k, false);
    }

    public PendingResult loadTopScores(GoogleApiClient googleapiclient, String s, int i, int j, int k, boolean flag)
    {
        return googleapiclient.a(new LoadScoresImpl(googleapiclient, s, i, j, k, flag) {

            final boolean ZW;
            final LeaderboardsImpl aaE;
            final String aaF;
            final int aaG;
            final int aaH;
            final int aaI;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, aaF, aaG, aaH, aaI, ZW);
            }

            
            {
                aaE = LeaderboardsImpl.this;
                aaF = s;
                aaG = i;
                aaH = j;
                aaI = k;
                ZW = flag;
                super(googleapiclient);
            }
        });
    }

    public void submitScore(GoogleApiClient googleapiclient, String s, long l)
    {
        submitScore(googleapiclient, s, l, null);
    }

    public void submitScore(GoogleApiClient googleapiclient, String s, long l, String s1)
    {
        Games.d(googleapiclient).a(null, s, l, s1);
    }

    public PendingResult submitScoreImmediate(GoogleApiClient googleapiclient, String s, long l)
    {
        return submitScoreImmediate(googleapiclient, s, l, null);
    }

    public PendingResult submitScoreImmediate(GoogleApiClient googleapiclient, String s, long l, String s1)
    {
        return googleapiclient.b(new SubmitScoreImpl(googleapiclient, s, l, s1) {

            final LeaderboardsImpl aaE;
            final String aaF;
            final long aaL;
            final String aaM;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, aaF, aaL, aaM);
            }

            
            {
                aaE = LeaderboardsImpl.this;
                aaF = s;
                aaL = l;
                aaM = s1;
                super(googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$10

/* anonymous class */
    class _cls10 extends LoadScoresImpl
    {

        final boolean ZW;
        final String ZZ;
        final String aaF;
        final int aaG;
        final int aaH;
        final int aaI;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, ZZ, aaF, aaG, aaH, aaI, ZW);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$11

/* anonymous class */
    class _cls11 extends LoadScoresImpl
    {

        final boolean ZW;
        final String ZZ;
        final String aaF;
        final int aaG;
        final int aaH;
        final int aaI;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, ZZ, aaF, aaG, aaH, aaI, ZW);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$8

/* anonymous class */
    class _cls8 extends LoadMetadataImpl
    {

        final boolean ZW;
        final String ZZ;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, ZZ, ZW);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$9

/* anonymous class */
    class _cls9 extends LoadMetadataImpl
    {

        final boolean ZW;
        final String ZZ;
        final String aaF;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, ZZ, aaF, ZW);
        }
    }

}
