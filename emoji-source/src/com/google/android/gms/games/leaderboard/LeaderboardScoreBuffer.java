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

    private final LeaderboardScoreBufferHeader St;

    public LeaderboardScoreBuffer(DataHolder dataholder)
    {
        super(dataholder);
        St = new LeaderboardScoreBufferHeader(dataholder.eU());
    }

    public LeaderboardScore get(int i)
    {
        return new LeaderboardScoreRef(DG, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public LeaderboardScoreBufferHeader iA()
    {
        return St;
    }
}
