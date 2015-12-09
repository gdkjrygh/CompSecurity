// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.display:
//            l, k, VideoDisplayComponent

class m
    implements EventListener
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public void processEvent(Event event)
    {
        VideoDisplayComponent.n(a.b.a).emit("play");
    }
}
