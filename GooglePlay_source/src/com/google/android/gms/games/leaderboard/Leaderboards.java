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
//            LeaderboardScoreBuffer, LeaderboardBuffer, Leaderboard

public interface Leaderboards
{
    public static interface LeaderboardMetadataResult
        extends Releasable, Result
    {

        public abstract LeaderboardBuffer getLeaderboards();
    }

    public static interface LoadScoresResult
        extends Releasable, Result
    {

        public abstract Leaderboard getLeaderboard();

        public abstract LeaderboardScoreBuffer getScores();
    }


    public abstract Intent getLeaderboardIntentInternal(GoogleApiClient googleapiclient, String s, String s1);

    public abstract PendingResult loadLeaderboardMetadata$4b6585cf(GoogleApiClient googleapiclient);

    public abstract PendingResult loadLeaderboardMetadataFirstParty$70b7f367(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult loadMoreScores(GoogleApiClient googleapiclient, LeaderboardScoreBuffer leaderboardscorebuffer, int i, int j);

    public abstract PendingResult loadTopScores(GoogleApiClient googleapiclient, String s, int i, int j, int k, boolean flag);

    public abstract PendingResult loadTopScoresFirstParty(GoogleApiClient googleapiclient, String s, String s1, int i, int j, int k, boolean flag);
}
