// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class Oh extends com.google.android.gms.internal.lback
{

    final GamesClientImpl NB;
    private final TurnBasedMatch Oh;

    protected void b(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
    {
        onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchReceived(Oh);
    }

    protected void d(Object obj)
    {
        b((OnTurnBasedMatchUpdateReceivedListener)obj);
    }

    protected void fp()
    {
    }

    istener(GamesClientImpl gamesclientimpl, OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener, TurnBasedMatch turnbasedmatch)
    {
        NB = gamesclientimpl;
        super(gamesclientimpl, onturnbasedmatchupdatereceivedlistener);
        Oh = turnbasedmatch;
    }
}
