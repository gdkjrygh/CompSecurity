// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchRef, TurnBasedMatch

public final class TurnBasedMatchBuffer extends g
{

    public TurnBasedMatchBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object c(int j, int k)
    {
        return i(j, k);
    }

    protected String eZ()
    {
        return "external_match_id";
    }

    protected TurnBasedMatch i(int j, int k)
    {
        return new TurnBasedMatchRef(DG, j, k);
    }
}
