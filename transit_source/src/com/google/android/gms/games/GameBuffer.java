// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.d;

// Referenced classes of package com.google.android.gms.games:
//            b, Game

public final class GameBuffer extends DataBuffer
{

    public GameBuffer(d d)
    {
        super(d);
    }

    public Game get(int i)
    {
        return new b(jf, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
