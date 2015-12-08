// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.analytics;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.analytics:
//            Analytics

final class a
    implements EventListener
{

    private Analytics a;

    public final void processEvent(Event event)
    {
        if (event.properties.containsKey("renditionUrl"))
        {
            Analytics.b(a, (String)event.properties.get("renditionUrl"));
        }
        if (event.properties.containsKey("renditionIndicatedBps"))
        {
            Analytics.e(a, event.getIntegerProperty("renditionIndicatedBps"));
        }
        if (event.properties.containsKey("renditionMimeType"))
        {
            Analytics.c(a, (String)event.properties.get("renditionMimeType"));
        }
        if (event.properties.containsKey("renditionHeight"))
        {
            Analytics.f(a, event.getIntegerProperty("renditionHeight"));
        }
        if (event.properties.containsKey("renditionWidth"))
        {
            Analytics.g(a, event.getIntegerProperty("renditionWidth"));
        }
        if (event.properties.containsKey("forwardBufferSeconds"))
        {
            Analytics.d(a, event.getIntegerProperty("forwardBufferSeconds"));
        }
        if (event.properties.containsKey("measuredBps"))
        {
            Analytics.h(a, event.getIntegerProperty("measuredBps"));
        }
    }

    (Analytics analytics)
    {
        a = analytics;
        super();
    }
}
