// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.analytics;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.analytics:
//            Analytics

class f
    implements EventListener
{

    final Analytics a;

    f(Analytics analytics)
    {
        a = analytics;
        super();
    }

    public void processEvent(Event event)
    {
        int i = event.getIntegerProperty("playheadPosition");
        if (i >= 0)
        {
            Analytics.c(a, i);
            Analytics.a(a, event, Analytics.d(a), Analytics.c(a));
            Analytics.b(a, Analytics.c(a));
            Analytics.a(a, event, "video_complete", null);
        }
    }
}
