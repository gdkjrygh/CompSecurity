// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.BaseVideoView;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            RewindButtonController

final class <init>
    implements EventListener
{

    private RewindButtonController a;

    public final void processEvent(Event event)
    {
        int i;
        if (a.c.getVideoDisplay().isLive())
        {
            i = 10000;
        } else
        {
            i = RewindButtonController.a(a);
        }
        RewindButtonController.a();
        String.format("Processing event: %s.", new Object[] {
            event.getType()
        });
        RewindButtonController.a(a, event.getIntegerProperty("playheadPosition"));
        event = a;
        if (RewindButtonController.b(a) - i > 0)
        {
            i = RewindButtonController.b(a) - i;
        } else
        {
            i = 0;
        }
        RewindButtonController.b(event, i);
        event = new HashMap();
        event.put("seekPosition", Integer.valueOf(RewindButtonController.c(a)));
        RewindButtonController.d(a).emit("seekTo", event);
        RewindButtonController.e(a).once("didSeekTo", new <init>(a, (byte)0));
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
