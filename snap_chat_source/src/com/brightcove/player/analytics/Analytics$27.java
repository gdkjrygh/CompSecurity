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
        Video video = (Video)event.properties.get("currentVideo");
        if (video != null && Analytics.i(a) - Analytics.h(a) > 0)
        {
            event.properties.put("video", video);
            Analytics.a(a, event, Analytics.h(a), Analytics.i(a));
        }
        video = (Video)event.properties.get("nextVideo");
        if (video != null)
        {
            event.properties.put("video", video);
            Analytics.a(a, event, "video_impression", null);
            event.properties.remove("video");
        }
        Analytics.b(a, Analytics.a(a, Analytics.c(a, 0)));
        Analytics.b(a, false);
        Analytics.c(a, false);
    }

    (Analytics analytics)
    {
        a = analytics;
        super();
    }
}
