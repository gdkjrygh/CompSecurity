// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            PlayButtonController

final class <init>
    implements EventListener
{

    private PlayButtonController a;

    public final void processEvent(Event event)
    {
        PlayButtonController.a();
        String.format("Process event: %s.", new Object[] {
            event.getType()
        });
        a.syncStates();
    }

    private (PlayButtonController playbuttoncontroller)
    {
        a = playbuttoncontroller;
        super();
    }

    a(PlayButtonController playbuttoncontroller, byte byte0)
    {
        this(playbuttoncontroller);
    }
}
