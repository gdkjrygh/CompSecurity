// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;


// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardBuffer, LeaderboardScoreBuffer

public interface OnLeaderboardScoresLoadedListener
{

    public abstract void onLeaderboardScoresLoaded(int i, LeaderboardBuffer leaderboardbuffer, LeaderboardScoreBuffer leaderboardscorebuffer);
}
