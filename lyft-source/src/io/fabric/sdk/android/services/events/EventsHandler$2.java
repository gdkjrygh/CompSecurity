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

    final Object a;
    final EventsHandler b;

    public void run()
    {
        try
        {
            b.c.a(a);
            return;
        }
        catch (Exception exception)
        {
            CommonUtils.a(b.a, "Crashlytics failed to record event", exception);
        }
    }

    (EventsHandler eventshandler, Object obj)
    {
        b = eventshandler;
        a = obj;
        super();
    }
}
