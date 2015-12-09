// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.Freezable;

public interface LeaderboardVariant
    extends Freezable
{

    public abstract int getCollection();

    public abstract String getDisplayPlayerRank();

    public abstract String getDisplayPlayerScore();

    public abstract long getNumScores();

    public abstract long getPlayerRank();

    public abstract String getPlayerScoreTag();

    public abstract long getRawPlayerScore();

    public abstract int getTimeSpan();

    public abstract String getTopPageNextToken();

    public abstract String getWindowPageNextToken();

    public abstract String getWindowPagePrevToken();

    public abstract boolean hasPlayerInfo();
}
