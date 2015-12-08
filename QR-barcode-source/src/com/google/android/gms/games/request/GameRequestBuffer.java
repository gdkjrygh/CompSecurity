// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequestRef, GameRequest

public final class GameRequestBuffer extends g
{

    public GameRequestBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object f(int i, int j)
    {
        return n(i, j);
    }

    protected String gD()
    {
        return "external_request_id";
    }

    protected GameRequest n(int i, int j)
    {
        return new GameRequestRef(II, i, j);
    }
}
