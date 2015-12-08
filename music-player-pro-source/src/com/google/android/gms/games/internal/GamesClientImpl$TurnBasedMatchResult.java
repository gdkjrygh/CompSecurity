// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static abstract class ease extends b
{

    final TurnBasedMatch Zc = null;

    public TurnBasedMatch getMatch()
    {
        return Zc;
    }

    (DataHolder dataholder)
    {
        super(dataholder);
        dataholder = new TurnBasedMatchBuffer(dataholder);
        if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
        Zc = (TurnBasedMatch)((TurnBasedMatch)dataholder.get(0)).freeze();
_L4:
        dataholder.release();
        return;
_L2:
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        dataholder.release();
        throw exception;
    }
}
