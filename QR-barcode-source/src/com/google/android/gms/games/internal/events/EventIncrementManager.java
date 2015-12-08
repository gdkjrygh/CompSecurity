// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.events;

import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.games.internal.events:
//            EventIncrementCache

public abstract class EventIncrementManager
{

    private final AtomicReference aaw = new AtomicReference();

    public EventIncrementManager()
    {
    }

    public void flush()
    {
        EventIncrementCache eventincrementcache = (EventIncrementCache)aaw.get();
        if (eventincrementcache != null)
        {
            eventincrementcache.flush();
        }
    }

    protected abstract EventIncrementCache ky();

    public void n(String s, int i)
    {
        EventIncrementCache eventincrementcache1 = (EventIncrementCache)aaw.get();
        EventIncrementCache eventincrementcache = eventincrementcache1;
        if (eventincrementcache1 == null)
        {
            EventIncrementCache eventincrementcache2 = ky();
            eventincrementcache = eventincrementcache2;
            if (!aaw.compareAndSet(null, eventincrementcache2))
            {
                eventincrementcache = (EventIncrementCache)aaw.get();
            }
        }
        eventincrementcache.w(s, i);
    }
}
