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

final class b
    implements EventListener
{

    private UUID a;
    private Event b;
    private b c;

    public final void processEvent(Event event)
    {
        if (a.equals(event.properties.get("uuid")))
        {
            VideoPlaybackController.c(c.c).emit(b.getType(), b.properties);
        }
    }

    ( , UUID uuid, Event event)
    {
        c = ;
        a = uuid;
        b = event;
        super();
    }
}
