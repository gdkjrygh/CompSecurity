// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScoreBufferHeader, LeaderboardScoreRef, LeaderboardScore

public final class LeaderboardScoreBuffer extends DataBuffer
{

    private final LeaderboardScoreBufferHeader Sq;

    public LeaderboardScoreBuffer(DataHolder dataholder)
    {
        super(dataholder);
        Sq = new LeaderboardScoreBufferHeader(dataholder.eP());
    }

    public LeaderboardScore get(int i)
    {
        return new LeaderboardScoreRef(DD, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public LeaderboardScoreBufferHeader iv()
    {
        return Sq;
    }
}
