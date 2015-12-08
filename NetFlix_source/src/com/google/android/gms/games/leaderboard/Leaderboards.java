// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScoreBuffer, LeaderboardBuffer, LeaderboardScore, Leaderboard, 
//            ScoreSubmissionData

public interface Leaderboards
{
    public static interface LeaderboardMetadataResult
        extends Releasable, Result
    {

        public abstract LeaderboardBuffer getLeaderboards();
    }

    public static interface LoadPlayerScoreResult
        extends Result
    {

        public abstract LeaderboardScore getScore();
    }

    public static interface LoadScoresResult
        extends Releasable, Result
    {

        public abstract Leaderboard getLeaderboard();

        public abstract LeaderboardScoreBuffer getScores();
    }

    public static interface SubmitScoreResult
        extends Releasable, Result
    {

        public abstract ScoreSubmissionData getScoreData();
    }


    public abstract Intent getAllLeaderboardsIntent(GoogleApiClient googleapiclient);

    public abstract Intent getLeaderboardIntent(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult loadCurrentPlayerLeaderboardScore(GoogleApiClient googleapiclient, String s, int i, int j);

    public abstract PendingResult loadLeaderboardMetadata(GoogleApiClient googleapiclient, String s, boolean flag);

    public abstract PendingResult loadLeaderboardMetadata(GoogleApiClient googleapiclient, boolean flag);

    public abstract PendingResult loadMoreScores(GoogleApiClient googleapiclient, LeaderboardScoreBuffer leaderboardscorebuffer, int i, int j);

    public abstract PendingResult loadPlayerCenteredScores(GoogleApiClient googleapiclient, String s, int i, int j, int k);

    public abstract PendingResult loadPlayerCenteredScores(GoogleApiClient googleapiclient, String s, int i, int j, int k, boolean flag);

    public abstract PendingResult loadTopScores(GoogleApiClient googleapiclient, String s, int i, int j, int k);

    public abstract PendingResult loadTopScores(GoogleApiClient googleapiclient, String s, int i, int j, int k, boolean flag);

    public abstract void submitScore(GoogleApiClient googleapiclient, String s, long l);

    public abstract void submitScore(GoogleApiClient googleapiclient, String s, long l, String s1);

    public abstract PendingResult submitScoreImmediate(GoogleApiClient googleapiclient, String s, long l);

    public abstract PendingResult submitScoreImmediate(GoogleApiClient googleapiclient, String s, long l, String s1);
}
