// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

class d
    implements EventListener
{

    final int a;
    final VideoDisplayComponent b;

    d(VideoDisplayComponent videodisplaycomponent, int i)
    {
        b = videodisplaycomponent;
        a = i;
        super();
    }

    public void processEvent(Event event)
    {
        VideoDisplayComponent.a(b, a);
    }
}
