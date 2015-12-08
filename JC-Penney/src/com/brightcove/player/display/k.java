// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent, l, a

class k
    implements EventListener
{

    final VideoDisplayComponent a;

    private k(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    k(VideoDisplayComponent videodisplaycomponent, a a1)
    {
        this(videodisplaycomponent);
    }

    public void processEvent(Event event)
    {
        if (a.n != null)
        {
            event = UUID.randomUUID();
            VideoDisplayComponent.p(a).once("willChangeVideo", new l(this, event));
            HashMap hashmap = new HashMap();
            hashmap.put("currentVideo", a.k);
            hashmap.put("nextVideo", a.m);
            hashmap.put("uuid", event);
            VideoDisplayComponent.q(a).emit("willChangeVideo", hashmap);
        }
    }
}
