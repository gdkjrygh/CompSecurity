// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameInstanceRef, GameInstance

public final class GameInstanceBuffer extends DataBuffer
{

    public GameInstanceBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public GameInstance cr(int i)
    {
        return new GameInstanceRef(DG, i);
    }

    public Object get(int i)
    {
        return cr(i);
    }
}
