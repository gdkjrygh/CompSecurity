// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardRef, Leaderboard

public final class LeaderboardBuffer extends d
{

    public LeaderboardBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object c(int i, int j)
    {
        return getEntry(i, j);
    }

    protected Leaderboard getEntry(int i, int j)
    {
        return new LeaderboardRef(BB, i, j);
    }

    protected String getPrimaryDataMarkerColumn()
    {
        return "external_leaderboard_id";
    }
}
