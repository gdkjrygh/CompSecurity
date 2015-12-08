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

class e
    implements EventListener
{

    final Analytics a;

    e(Analytics analytics)
    {
        a = analytics;
        super();
    }

    public void processEvent(Event event)
    {
        Video video = (Video)event.properties.get("video");
        int i = event.getIntegerProperty("playheadPosition");
        if (i >= 0)
        {
            if (Math.abs(Analytics.c(a) - i) > 5000)
            {
                Analytics.a(a, event, Analytics.d(a), Analytics.c(a));
                Analytics.b(a, Analytics.c(a, i));
            } else
            {
                Analytics.c(a, i);
                if (!Analytics.e(a) && video != null && Analytics.c(a) != 0)
                {
                    Analytics.a(a, event, "video_view", null);
                    Analytics.a(a, true);
                }
                if (Analytics.c(a) - Analytics.d(a) >= 10000)
                {
                    Analytics.a(a, event, Analytics.d(a), Analytics.c(a));
                    Analytics.b(a, Analytics.c(a));
                    return;
                }
            }
        }
    }
}
