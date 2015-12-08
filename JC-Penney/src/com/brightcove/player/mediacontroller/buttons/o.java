// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            LiveButtonController, h

class o
    implements EventListener
{

    final LiveButtonController a;

    private o(LiveButtonController livebuttoncontroller)
    {
        a = livebuttoncontroller;
        super();
    }

    o(LiveButtonController livebuttoncontroller, h h)
    {
        this(livebuttoncontroller);
    }

    public void processEvent(Event event)
    {
        Log.d(LiveButtonController.a(), String.format("Processing event: %s.", new Object[] {
            event.getType()
        }));
        LiveButtonController.a(a, true);
    }
}
