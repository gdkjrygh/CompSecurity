// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsHandler, EventsStrategy

class a
    implements Runnable
{

    final EventsHandler a;

    public void run()
    {
        try
        {
            EventsStrategy eventsstrategy = a.c;
            a.c = a.a();
            eventsstrategy.c();
            return;
        }
        catch (Exception exception)
        {
            CommonUtils.a(a.a, "Failed to disable events.", exception);
        }
    }

    (EventsHandler eventshandler)
    {
        a = eventshandler;
        super();
    }
}
