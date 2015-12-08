// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.analytics;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Video;
import java.util.Map;

// Referenced classes of package com.brightcove.player.analytics:
//            Analytics

final class a
    implements EventListener
{

    private Analytics a;

    public final void processEvent(Event event)
    {
        Video video = (Video)event.properties.get("video");
        int i = event.getIntegerProperty("playheadPosition");
        Analytics.b(a, event.getIntegerProperty("duration"));
        if (event.properties.containsKey("forwardBufferSeconds"))
        {
            Analytics.d(a, event.getIntegerProperty("forwardBufferSeconds"));
        }
        if (i >= 0)
        {
            if (Math.abs(Analytics.i(a) - i) > 5000)
            {
                Analytics.a(a, Analytics.c(a, i));
            } else
            {
                Analytics.a(a, event);
                if (Analytics.i(a) - Analytics.h(a) >= 10000)
                {
                    Analytics.a(a, Analytics.i(a));
                }
                Analytics.c(a, i);
                if (!Analytics.c(a) && video != null && Analytics.i(a) != 0)
                {
                    Analytics.e(a, System.currentTimeMillis());
                    long l = Analytics.l(a);
                    long l1 = Analytics.m(a);
                    long l2 = Analytics.n(a);
                    long l3 = Analytics.o(a);
                    long l4 = Analytics.p(a);
                    long l5 = Analytics.q(a);
                    Analytics.a(a, event, l - l1, l2 - l3 - (l4 - l5));
                    Analytics.e(a);
                    Analytics.b(a, true);
                    return;
                }
            }
        }
    }

    (Analytics analytics)
    {
        a = analytics;
        super();
    }
}
