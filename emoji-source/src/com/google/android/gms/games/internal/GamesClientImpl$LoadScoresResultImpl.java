// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Oe extends b
    implements com.google.android.gms.games.leaderboard._11__08__88__BB__11__08__11_
{

    private final LeaderboardEntity Od = null;
    private final LeaderboardScoreBuffer Oe;

    public Leaderboard getLeaderboard()
    {
        return Od;
    }

    public LeaderboardScoreBuffer getScores()
    {
        return Oe;
    }

    (DataHolder dataholder, DataHolder dataholder1)
    {
        super(dataholder1);
        dataholder = new LeaderboardBuffer(dataholder);
        if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
        Od = (LeaderboardEntity)((Leaderboard)dataholder.get(0)).freeze();
_L4:
        dataholder.close();
        Oe = new LeaderboardScoreBuffer(dataholder1);
        return;
_L2:
        if (true) goto _L4; else goto _L3
_L3:
        dataholder1;
        dataholder.close();
        throw dataholder1;
    }
}
