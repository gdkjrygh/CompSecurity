// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            ExtendedPlayerRef, ExtendedPlayer

public final class ExtendedPlayerBuffer extends DataBuffer
{

    public ExtendedPlayerBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public ExtendedPlayer bk(int i)
    {
        return new ExtendedPlayerRef(BB, i);
    }

    public Object get(int i)
    {
        return bk(i);
    }
}
