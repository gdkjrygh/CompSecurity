// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveSeekBarController, j

class k
    implements EventListener
{

    final BrightcoveSeekBarController a;

    private k(BrightcoveSeekBarController brightcoveseekbarcontroller)
    {
        a = brightcoveseekbarcontroller;
        super();
    }

    k(BrightcoveSeekBarController brightcoveseekbarcontroller, j j)
    {
        this(brightcoveseekbarcontroller);
    }

    public void processEvent(Event event)
    {
        a.setBufferedPercent(event.getIntegerProperty("percentComplete"));
    }
}
