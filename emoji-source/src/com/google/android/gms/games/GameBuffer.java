// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games:
//            GameRef, Game

public final class GameBuffer extends DataBuffer
{

    public GameBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Game get(int i)
    {
        return new GameRef(DG, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
