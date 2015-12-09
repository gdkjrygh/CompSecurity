// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGameRef, ExtendedGame

public final class ExtendedGameBuffer extends d
{

    public ExtendedGameBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object c(int i, int j)
    {
        return d(i, j);
    }

    protected ExtendedGame d(int i, int j)
    {
        return new ExtendedGameRef(BB, i, j);
    }

    protected String getPrimaryDataMarkerColumn()
    {
        return "external_game_id";
    }
}
