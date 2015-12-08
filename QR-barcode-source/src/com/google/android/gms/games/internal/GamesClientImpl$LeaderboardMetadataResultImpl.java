// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class WP extends a
    implements com.google.android.gms.games.leaderboard.
{

    private final LeaderboardBuffer WP;

    public LeaderboardBuffer getLeaderboards()
    {
        return WP;
    }

    Y(DataHolder dataholder)
    {
        super(dataholder);
        WP = new LeaderboardBuffer(dataholder);
    }
}
