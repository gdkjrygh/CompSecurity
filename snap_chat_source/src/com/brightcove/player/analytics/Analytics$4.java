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
        int i = event.getIntegerProperty("playheadPosition");
        if (i >= 0)
        {
            Analytics.c(a, i);
            Analytics.a(a, event, Analytics.h(a), Analytics.i(a));
            Analytics.a(a, Analytics.i(a));
            Analytics.a(a, event, "video_complete", null);
            Analytics.g(a);
            Analytics.c(a, true);
        }
    }

    (Analytics analytics)
    {
        a = analytics;
        super();
    }
}
