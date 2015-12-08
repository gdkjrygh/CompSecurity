// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsHandler, EventsStrategy

class b
    implements Runnable
{

    final Object a;
    final boolean b;
    final EventsHandler c;

    public void run()
    {
        try
        {
            c.c.a(a);
            if (b)
            {
                c.c.e();
            }
            return;
        }
        catch (Exception exception)
        {
            CommonUtils.a(c.a, "Failed to record event.", exception);
        }
    }

    (EventsHandler eventshandler, Object obj, boolean flag)
    {
        c = eventshandler;
        a = obj;
        b = flag;
        super();
    }
}
