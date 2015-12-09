// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import java.util.Map;

// Referenced classes of package com.brightcove.player.event:
//            EventListener, Event, RegisteringEventEmitter

class d
    implements EventListener
{

    final RegisteringEventEmitter a;

    d(RegisteringEventEmitter registeringeventemitter)
    {
        a = registeringeventemitter;
        super();
    }

    public void processEvent(Event event)
    {
        RegisteringEventEmitter.a(a, Boolean.parseBoolean(event.properties.get("debug").toString()));
    }
}
