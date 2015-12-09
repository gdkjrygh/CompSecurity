// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class Jh extends com.google.android.gms.internal.lback
    implements com.google.android.gms.games.leaderboard.ath
{

    final GamesClientImpl IJ;
    private final LeaderboardScoreEntity Jh = null;
    private final Status wJ;

    protected void a(com.google.android.gms.common.api.ack ack, DataHolder dataholder)
    {
        ack.ack(this);
    }

    protected volatile void a(Object obj, DataHolder dataholder)
    {
        a((com.google.android.gms.common.api.ack.a)obj, dataholder);
    }

    public LeaderboardScore getScore()
    {
        return Jh;
    }

    public Status getStatus()
    {
        return wJ;
    }

    (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack, DataHolder dataholder)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, ack, dataholder);
        wJ = new Status(dataholder.getStatusCode());
        gamesclientimpl = new LeaderboardScoreBuffer(dataholder);
        if (gamesclientimpl.getCount() <= 0) goto _L2; else goto _L1
_L1:
        Jh = (LeaderboardScoreEntity)gamesclientimpl.get(0).freeze();
_L4:
        gamesclientimpl.close();
        return;
_L2:
        if (true) goto _L4; else goto _L3
_L3:
        ack;
        gamesclientimpl.close();
        throw ack;
    }
}
