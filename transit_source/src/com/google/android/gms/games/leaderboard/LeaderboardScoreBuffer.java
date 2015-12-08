// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.d;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            b, d, LeaderboardScore

public final class LeaderboardScoreBuffer extends DataBuffer
{

    private final b nv;

    public LeaderboardScoreBuffer(d d1)
    {
        super(d1);
        nv = new b(d1.aM());
    }

    public b cb()
    {
        return nv;
    }

    public LeaderboardScore get(int i)
    {
        return new com.google.android.gms.games.leaderboard.d(jf, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
