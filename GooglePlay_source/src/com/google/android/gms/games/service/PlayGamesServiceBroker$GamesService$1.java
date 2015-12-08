// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import com.google.android.gms.games.internal.events.EventIncrementCache;
import com.google.android.gms.games.internal.events.EventIncrementManager;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesServiceBroker

final class this._cls0 extends EventIncrementManager
{

    final this._cls0 this$0;

    public final EventIncrementCache buildCache()
    {
        return new meServiceEventIncrementCache(this._cls0.this);
    }

    meServiceEventIncrementCache()
    {
        this$0 = this._cls0.this;
        super();
    }
}
