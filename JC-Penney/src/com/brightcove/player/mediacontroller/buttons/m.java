// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.util.Log;
import android.widget.Button;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            LiveButtonController, h

class m
    implements EventListener
{

    final LiveButtonController a;

    private m(LiveButtonController livebuttoncontroller)
    {
        a = livebuttoncontroller;
        super();
    }

    m(LiveButtonController livebuttoncontroller, h h)
    {
        this(livebuttoncontroller);
    }

    public void processEvent(Event event)
    {
        Log.d(LiveButtonController.a(), String.format("Processing event: %s.", new Object[] {
            event.getType()
        }));
        a.getButton().setTextColor(LiveButtonController.f(a));
    }
}
