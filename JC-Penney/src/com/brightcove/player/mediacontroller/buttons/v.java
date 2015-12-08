// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            RewindButtonController, u

class v
    implements EventListener
{

    final RewindButtonController a;

    private v(RewindButtonController rewindbuttoncontroller)
    {
        a = rewindbuttoncontroller;
        super();
    }

    v(RewindButtonController rewindbuttoncontroller, u u)
    {
        this(rewindbuttoncontroller);
    }

    public void processEvent(Event event)
    {
        Log.d(RewindButtonController.a(), String.format("Processing event: %s.", new Object[] {
            event.getType()
        }));
        int i = event.getIntegerProperty("fromSeekPosition");
        int j = event.getIntegerProperty("seekPosition");
        if (i == RewindButtonController.b(a) && j == RewindButtonController.c(a))
        {
            RewindButtonController.e(a).emit("didRewind", event.properties);
        }
    }
}
