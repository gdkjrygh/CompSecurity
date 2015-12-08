// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveSeekBarController

final class <init>
    implements EventListener
{

    private BrightcoveSeekBarController a;

    public final void processEvent(Event event)
    {
        a.setBufferedPercent(event.getIntegerProperty("percentComplete"));
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
