// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.analytics;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.analytics:
//            Analytics

final class a
    implements EventListener
{

    private Analytics a;

    public final void processEvent(Event event)
    {
        int i = event.getIntegerProperty("seekPosition");
        if (i <= 0 || i - Analytics.i(a) <= 1000)
        {
            return;
        } else
        {
            Analytics.a(a, event, Analytics.h(a), Analytics.i(a));
            Analytics.a(a, Analytics.c(a, i));
            event = a;
            Analytics analytics = a;
            Analytics.k(a);
            Analytics.d(event, Analytics.j(analytics));
            return;
        }
    }

    (Analytics analytics)
    {
        a = analytics;
        super();
    }
}
