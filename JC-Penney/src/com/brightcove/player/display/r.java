// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.display:
//            o, VideoDisplayComponent

class r
    implements EventListener
{

    final int a;
    final o b;

    r(o o1, int i)
    {
        b = o1;
        a = i;
        super();
    }

    public void processEvent(Event event)
    {
        VideoDisplayComponent.a(b.a, a);
    }
}
