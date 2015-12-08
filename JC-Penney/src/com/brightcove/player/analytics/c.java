// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.analytics;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.analytics:
//            Analytics

class c
    implements EventListener
{

    final Analytics a;

    c(Analytics analytics)
    {
        a = analytics;
        super();
    }

    public void processEvent(Event event)
    {
        if (event.properties.containsKey("currentVideo") && Analytics.c(a) - Analytics.d(a) > 0)
        {
            Analytics.a(a, event, Analytics.d(a), Analytics.c(a));
        }
        Analytics.a(a, event, "video_impression", null);
        Analytics.a(a, Analytics.b(a, Analytics.c(a, 0)));
        Analytics.a(a, false);
    }
}
