// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGameRef, ExtendedGame

public final class ExtendedGameBuffer extends g
{

    public ExtendedGameBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object f(int i, int j)
    {
        return h(i, j);
    }

    protected String gD()
    {
        return "external_game_id";
    }

    protected ExtendedGame h(int i, int j)
    {
        return new ExtendedGameRef(II, i, j);
    }
}
