// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import com.urbanairship.Logger;

// Referenced classes of package com.urbanairship.analytics:
//            Analytics, EventService, Event

class val.event
    implements Runnable
{

    final Analytics this$0;
    final Event val$event;

    public void run()
    {
        Logger.verbose((new StringBuilder()).append("Adding event: ").append(val$event).toString());
        EventService.sendAddEventIntent(val$event);
    }

    ()
    {
        this$0 = final_analytics;
        val$event = Event.this;
        super();
    }
}
