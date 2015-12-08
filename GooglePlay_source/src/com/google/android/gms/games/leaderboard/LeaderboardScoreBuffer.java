// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScoreBufferHeader, LeaderboardScoreRef, LeaderboardScore

public final class LeaderboardScoreBuffer extends AbstractDataBuffer
{

    public final LeaderboardScoreBufferHeader mHeader;

    public LeaderboardScoreBuffer(DataHolder dataholder)
    {
        super(dataholder);
        mHeader = new LeaderboardScoreBufferHeader(dataholder.mMetadata);
    }

    public final LeaderboardScore get(int i)
    {
        return new LeaderboardScoreRef(mDataHolder, i);
    }

    public final volatile Object get(int i)
    {
        return get(i);
    }
}
