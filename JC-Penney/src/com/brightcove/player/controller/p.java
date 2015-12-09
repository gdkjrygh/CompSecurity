// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.brightcove.player.controller:
//            VideoPlaybackController

class p
    implements EventListener
{

    final UUID a;
    final Event b;
    final VideoPlaybackController.OnPlayListener c;

    p(VideoPlaybackController.OnPlayListener onplaylistener, UUID uuid, Event event)
    {
        c = onplaylistener;
        a = uuid;
        b = event;
        super();
    }

    public void processEvent(Event event)
    {
        if (a.equals(event.properties.get("uuid")))
        {
            VideoPlaybackController.c(c.a).emit(b.getType(), b.properties);
        }
    }
}
