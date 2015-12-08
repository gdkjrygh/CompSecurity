// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveSeekBarController, BrightcoveSeekBar

final class <init>
    implements EventListener
{

    private BrightcoveSeekBarController a;

    public final void processEvent(Event event)
    {
        BrightcoveSeekBarController.a();
        String.format("Processing event: %s.", new Object[] {
            event.getType()
        });
        int i = event.getIntegerProperty("duration");
        if (i != -1)
        {
            BrightcoveSeekBarController.a(a).setMax(i);
        }
    }

    private I(BrightcoveSeekBarController brightcoveseekbarcontroller)
    {
        a = brightcoveseekbarcontroller;
        super();
    }

    a(BrightcoveSeekBarController brightcoveseekbarcontroller, byte byte0)
    {
        this(brightcoveseekbarcontroller);
    }
}
