// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            FullScreenButtonController

final class <init>
    implements EventListener
{

    private FullScreenButtonController a;

    public final void processEvent(Event event)
    {
        a.syncStates();
    }

    private (FullScreenButtonController fullscreenbuttoncontroller)
    {
        a = fullscreenbuttoncontroller;
        super();
    }

    a(FullScreenButtonController fullscreenbuttoncontroller, byte byte0)
    {
        this(fullscreenbuttoncontroller);
    }
}
