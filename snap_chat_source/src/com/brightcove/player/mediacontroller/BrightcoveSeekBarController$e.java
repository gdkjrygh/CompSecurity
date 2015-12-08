// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveSeekBarController, BrightcoveSeekBar

final class <init>
    implements EventListener
{

    private BrightcoveSeekBarController a;

    public final void processEvent(Event event)
    {
        event = ((Event) (event.properties.get("markerList")));
        if (event != null && (event instanceof int[]))
        {
            BrightcoveSeekBarController.a(a).getMarkers().clear();
            event = (int[])event;
            int j = event.length;
            for (int i = 0; i < j; i++)
            {
                int k = event[i];
                BrightcoveSeekBarController.a(a).addMarker(k);
            }

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
