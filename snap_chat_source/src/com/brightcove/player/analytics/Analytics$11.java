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
        Analytics.h(a, System.currentTimeMillis() - Analytics.t(a));
        if (Analytics.u(a) < 1000L && Analytics.v(a) > 0)
        {
            Analytics.w(a);
        }
        Analytics.e(a, false);
    }

    (Analytics analytics)
    {
        a = analytics;
        super();
    }
}
