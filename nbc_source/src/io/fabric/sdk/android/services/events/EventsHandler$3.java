// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsHandler, EventsStrategy

class this._cls0
    implements Runnable
{

    final EventsHandler this$0;

    public void run()
    {
        try
        {
            EventsStrategy eventsstrategy = strategy;
            strategy = getDisabledEventsStrategy();
            eventsstrategy.deleteAllEvents();
            return;
        }
        catch (Exception exception)
        {
            CommonUtils.logControlledError(context, "Failed to disable events.", exception);
        }
    }

    ()
    {
        this$0 = EventsHandler.this;
        super();
    }
}
