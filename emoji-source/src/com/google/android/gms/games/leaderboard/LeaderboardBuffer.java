// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardRef, Leaderboard

public final class LeaderboardBuffer extends g
{

    public LeaderboardBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object c(int i, int j)
    {
        return f(i, j);
    }

    protected String eZ()
    {
        return "external_leaderboard_id";
    }

    protected Leaderboard f(int i, int j)
    {
        return new LeaderboardRef(DG, i, j);
    }
}
