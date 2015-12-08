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
        String s = (String)event.properties.get("errorCode");
        String s1 = (String)event.properties.get("errorMessage");
        Analytics.a(a, event, s, s1);
    }

    (Analytics analytics)
    {
        a = analytics;
        super();
    }
}
