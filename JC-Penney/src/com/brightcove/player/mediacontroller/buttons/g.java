// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            FullScreenButtonController, f

class g
    implements EventListener
{

    final FullScreenButtonController a;

    private g(FullScreenButtonController fullscreenbuttoncontroller)
    {
        a = fullscreenbuttoncontroller;
        super();
    }

    g(FullScreenButtonController fullscreenbuttoncontroller, f f)
    {
        this(fullscreenbuttoncontroller);
    }

    public void processEvent(Event event)
    {
        a.syncStates();
    }
}
