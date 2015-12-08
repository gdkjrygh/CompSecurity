// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.event;

import java.util.Comparator;

// Referenced classes of package com.auditude.ads.util.event:
//            EventListenerHolder

class ListenerPriorityComparator
    implements Comparator
{

    ListenerPriorityComparator()
    {
    }

    public int compare(EventListenerHolder eventlistenerholder, EventListenerHolder eventlistenerholder1)
    {
        if (eventlistenerholder.priority > eventlistenerholder1.priority)
        {
            return -1;
        }
        return eventlistenerholder.priority >= eventlistenerholder1.priority ? 0 : 1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((EventListenerHolder)obj, (EventListenerHolder)obj1);
    }
}
