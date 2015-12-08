// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class Oj extends AbstractGamesCallbacks
{

    final GamesClientImpl NE;
    private final OnTurnBasedMatchUpdateReceivedListener Oj;

    public void onTurnBasedMatchRemoved(String s)
    {
        NE.a(new NE(NE, Oj, s));
    }

    public void t(DataHolder dataholder)
    {
        TurnBasedMatchBuffer turnbasedmatchbuffer;
        turnbasedmatchbuffer = new TurnBasedMatchBuffer(dataholder);
        dataholder = null;
        if (turnbasedmatchbuffer.getCount() > 0)
        {
            dataholder = (TurnBasedMatch)((TurnBasedMatch)turnbasedmatchbuffer.get(0)).freeze();
        }
        turnbasedmatchbuffer.close();
        if (dataholder != null)
        {
            NE.a(new (NE, Oj, dataholder));
        }
        return;
        dataholder;
        turnbasedmatchbuffer.close();
        throw dataholder;
    }

    r(GamesClientImpl gamesclientimpl, OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
    {
        NE = gamesclientimpl;
        super();
        Oj = onturnbasedmatchupdatereceivedlistener;
    }
}
