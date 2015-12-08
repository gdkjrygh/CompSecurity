// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            a, Leaderboard

public final class LeaderboardBuffer extends f
{

    public LeaderboardBuffer(d d)
    {
        super(d);
    }

    protected Object a(int i, int j)
    {
        return getEntry(i, j);
    }

    protected Leaderboard getEntry(int i, int j)
    {
        return new a(jf, i, j);
    }

    protected String getPrimaryDataMarkerColumn()
    {
        return "external_leaderboard_id";
    }
}
