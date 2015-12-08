// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            RewindButtonController

final class <init>
    implements EventListener
{

    private RewindButtonController a;

    public final void processEvent(Event event)
    {
        RewindButtonController.a();
        String.format("Processing event: %s.", new Object[] {
            event.getType()
        });
        int i = event.getIntegerProperty("fromSeekPosition");
        int j = event.getIntegerProperty("seekPosition");
        if (i == RewindButtonController.b(a) && j == RewindButtonController.c(a))
        {
            RewindButtonController.f(a).emit("didRewind", event.properties);
        }
    }

    private (RewindButtonController rewindbuttoncontroller)
    {
        a = rewindbuttoncontroller;
        super();
    }

    a(RewindButtonController rewindbuttoncontroller, byte byte0)
    {
        this(rewindbuttoncontroller);
    }
}
