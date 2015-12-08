// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.controller:
//            FullScreenController

final class a
    implements EventListener
{

    private FullScreenController a;

    public final void processEvent(Event event)
    {
        FullScreenController.a(a, false);
    }

    (FullScreenController fullscreencontroller)
    {
        a = fullscreencontroller;
        super();
    }
}
