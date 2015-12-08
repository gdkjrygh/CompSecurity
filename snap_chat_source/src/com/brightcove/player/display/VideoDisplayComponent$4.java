// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

final class a
    implements EventListener
{

    private int a;
    private VideoDisplayComponent b;

    public final void processEvent(Event event)
    {
        VideoDisplayComponent.a(b, a);
    }

    (VideoDisplayComponent videodisplaycomponent, int i)
    {
        b = videodisplaycomponent;
        a = i;
        super();
    }
}
