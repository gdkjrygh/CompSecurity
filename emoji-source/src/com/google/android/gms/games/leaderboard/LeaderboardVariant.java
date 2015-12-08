// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.Freezable;

public interface LeaderboardVariant
    extends Freezable
{

    public static final int COLLECTION_PUBLIC = 0;
    public static final int COLLECTION_SOCIAL = 1;
    public static final int NUM_SCORES_UNKNOWN = -1;
    public static final int NUM_TIME_SPANS = 3;
    public static final int PLAYER_RANK_UNKNOWN = -1;
    public static final int PLAYER_SCORE_UNKNOWN = -1;
    public static final int TIME_SPAN_ALL_TIME = 2;
    public static final int TIME_SPAN_DAILY = 0;
    public static final int TIME_SPAN_WEEKLY = 1;

    public abstract int getCollection();

    public abstract String getDisplayPlayerRank();

    public abstract String getDisplayPlayerScore();

    public abstract long getNumScores();

    public abstract long getPlayerRank();

    public abstract String getPlayerScoreTag();

    public abstract long getRawPlayerScore();

    public abstract int getTimeSpan();

    public abstract boolean hasPlayerInfo();

    public abstract String iD();

    public abstract String iE();

    public abstract String iF();
}
