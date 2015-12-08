// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            EventHandler

public final class HandlerRegistration
{

    private final EventHandler eventHandler;
    private final Object eventId;
    private final Class eventType;
    private final int hashCode;
    private final Object target;

    public HandlerRegistration(Object obj, Class class1, Object obj1, EventHandler eventhandler)
    {
        target = Preconditions.checkNotNull(obj);
        eventType = (Class)Preconditions.checkNotNull(class1);
        eventId = Preconditions.checkNotNull(obj1);
        eventHandler = (EventHandler)Preconditions.checkNotNull(eventhandler);
        hashCode = Objects.hashCode(new Object[] {
            target, eventType, eventId, eventHandler
        });
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof HandlerRegistration)
            {
                if (target != ((HandlerRegistration) (obj = (HandlerRegistration)obj)).target || eventHandler != ((HandlerRegistration) (obj)).eventHandler || !eventType.equals(((HandlerRegistration) (obj)).eventType) || !eventId.equals(((HandlerRegistration) (obj)).eventId))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    final EventHandler getEventHandler()
    {
        return eventHandler;
    }

    public final Object getEventId()
    {
        return eventId;
    }

    final Class getEventType()
    {
        return eventType;
    }

    final Object getTarget()
    {
        return target;
    }

    public final int hashCode()
    {
        return hashCode;
    }
}
