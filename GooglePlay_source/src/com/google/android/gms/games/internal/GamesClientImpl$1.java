// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.internal.events.EventIncrementCache;
import com.google.android.gms.games.internal.events.EventIncrementManager;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class entManager extends EventIncrementManager
{

    final GamesClientImpl this$0;

    public final EventIncrementCache buildCache()
    {
        return new meClientEventIncrementCache(GamesClientImpl.this);
    }

    entCache()
    {
        this$0 = GamesClientImpl.this;
        super();
    }
}
