// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.internal.events.EventIncrementCache;
import com.google.android.gms.games.internal.events.EventIncrementManager;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

class entManager extends EventIncrementManager
{

    final GamesClientImpl Yu;

    public EventIncrementCache lF()
    {
        return new meClientEventIncrementCache(Yu);
    }

    entCache(GamesClientImpl gamesclientimpl)
    {
        Yu = gamesclientimpl;
        super();
    }
}
