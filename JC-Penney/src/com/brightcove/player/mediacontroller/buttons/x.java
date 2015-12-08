// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.util.Log;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.BaseVideoView;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            RewindButtonController, u

class x
    implements EventListener
{

    final RewindButtonController a;

    private x(RewindButtonController rewindbuttoncontroller)
    {
        a = rewindbuttoncontroller;
        super();
    }

    x(RewindButtonController rewindbuttoncontroller, u u)
    {
        this(rewindbuttoncontroller);
    }

    public void processEvent(Event event)
    {
        int i;
        if (a.c.getVideoDisplay().isLive())
        {
            i = 10000;
        } else
        {
            i = RewindButtonController.a(a);
        }
        Log.d(RewindButtonController.a(), String.format("Processing event: %s.", new Object[] {
            event.getType()
        }));
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
    }
}
