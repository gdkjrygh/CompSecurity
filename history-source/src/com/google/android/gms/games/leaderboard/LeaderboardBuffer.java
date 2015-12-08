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

    protected Object f(int i, int k)
    {
        return j(i, k);
    }

    protected String ha()
    {
        return "external_leaderboard_id";
    }

    protected Leaderboard j(int i, int k)
    {
        return new LeaderboardRef(JG, i, k);
    }
}
