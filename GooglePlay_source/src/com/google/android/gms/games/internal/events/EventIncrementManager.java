// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.events;

import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.games.internal.events:
//            EventIncrementCache

public abstract class EventIncrementManager
{

    public final AtomicReference mEventIncrementCache = new AtomicReference();

    public EventIncrementManager()
    {
    }

    public abstract EventIncrementCache buildCache();

    public final void flush()
    {
        EventIncrementCache eventincrementcache = (EventIncrementCache)mEventIncrementCache.get();
        if (eventincrementcache != null)
        {
            eventincrementcache.flush();
        }
    }
}
