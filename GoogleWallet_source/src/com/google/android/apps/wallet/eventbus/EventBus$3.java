// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.SetMultimap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            EventBus, HandlerRegistration, EventHandler

final class val.eventId
    implements Runnable
{

    final EventBus this$0;
    final Object val$event;
    final Object val$eventId;

    public final void run()
    {
        EventBus.access$200(EventBus.this).readLock().lock();
        Object obj = ImmutableList.copyOf(EventBus.access$300(EventBus.this).get(val$event.getClass()));
        EventBus.access$200(EventBus.this).readLock().unlock();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            HandlerRegistration handlerregistration = (HandlerRegistration)((Iterator) (obj)).next();
            Object obj1 = handlerregistration.getEventId();
            if (obj1.equals(val$eventId) || obj1.equals(EventBus.DEFAULT_EVENT_ID))
            {
                handlerregistration.getEventHandler().handleEvent(val$event);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_145;
        Exception exception;
        exception;
        EventBus.access$200(EventBus.this).readLock().unlock();
        throw exception;
    }

    r()
    {
        this$0 = final_eventbus;
        val$event = obj;
        val$eventId = Object.this;
        super();
    }
}
