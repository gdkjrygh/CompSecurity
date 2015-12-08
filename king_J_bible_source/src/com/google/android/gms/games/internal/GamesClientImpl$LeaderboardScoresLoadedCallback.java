// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class IY extends IY
    implements com.google.android.gms.games.leaderboard.
{

    final GamesClientImpl IJ;
    private final LeaderboardEntity IX = null;
    private final LeaderboardScoreBuffer IY;

    protected void a(com.google.android.gms.common.api.ack ack, DataHolder dataholder)
    {
        ack.ack(this);
    }

    protected volatile void a(Object obj, DataHolder dataholder)
    {
        a((com.google.android.gms.common.api.ack.a)obj, dataholder);
    }

    public Leaderboard getLeaderboard()
    {
        return IX;
    }

    public LeaderboardScoreBuffer getScores()
    {
        return IY;
    }

    (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack, DataHolder dataholder, DataHolder dataholder1)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, ack, dataholder1);
        gamesclientimpl = new LeaderboardBuffer(dataholder);
        if (gamesclientimpl.getCount() <= 0) goto _L2; else goto _L1
_L1:
        IX = (LeaderboardEntity)((Leaderboard)gamesclientimpl.get(0)).freeze();
_L4:
        gamesclientimpl.close();
        IY = new LeaderboardScoreBuffer(dataholder1);
        return;
_L2:
        if (true) goto _L4; else goto _L3
_L3:
        ack;
        gamesclientimpl.close();
        throw ack;
    }
}
