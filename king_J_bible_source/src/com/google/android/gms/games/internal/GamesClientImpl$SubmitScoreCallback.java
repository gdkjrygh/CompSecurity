// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class Jy extends back
    implements com.google.android.gms.games.leaderboard.k
{

    final GamesClientImpl IJ;
    private final ScoreSubmissionData Jy;

    public void a(com.google.android.gms.common.api.ack ack, DataHolder dataholder)
    {
        ack.ack(this);
    }

    public volatile void a(Object obj, DataHolder dataholder)
    {
        a((com.google.android.gms.common.api.ack.a)obj, dataholder);
    }

    public ScoreSubmissionData getScoreData()
    {
        return Jy;
    }

    public back(GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack, DataHolder dataholder)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, ack, dataholder);
        Jy = new ScoreSubmissionData(dataholder);
        dataholder.close();
        return;
        gamesclientimpl;
        dataholder.close();
        throw gamesclientimpl;
    }
}
