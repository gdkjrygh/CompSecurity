// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsHandler, EventsStrategy

class val.sendImmediately
    implements Runnable
{

    final EventsHandler this$0;
    final Object val$event;
    final boolean val$sendImmediately;

    public void run()
    {
        try
        {
            strategy.recordEvent(val$event);
            if (val$sendImmediately)
            {
                strategy.rollFileOver();
            }
            return;
        }
        catch (Exception exception)
        {
            CommonUtils.logControlledError(context, "Failed to record event.", exception);
        }
    }

    ()
    {
        this$0 = final_eventshandler;
        val$event = obj;
        val$sendImmediately = Z.this;
        super();
    }
}
