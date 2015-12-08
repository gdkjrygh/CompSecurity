// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.widget.Button;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

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
        a.getButton().setTextColor(LiveButtonController.f(a));
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
