// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            LiveButtonController

final class <init>
    implements EventListener
{

    private LiveButtonController a;

    public final void processEvent(Event event)
    {
        LiveButtonController.a();
        String.format("Processing event: %s.", new Object[] {
            event.getType()
        });
        LiveButtonController.g(a);
        if (a.c.getVideoDisplay().isLive())
        {
            LiveButtonController.a(a);
            return;
        } else
        {
            LiveButtonController.h(a);
            return;
        }
    }

    private (LiveButtonController livebuttoncontroller)
    {
        a = livebuttoncontroller;
        super();
    }

    a(LiveButtonController livebuttoncontroller, byte byte0)
    {
        this(livebuttoncontroller);
    }
}
