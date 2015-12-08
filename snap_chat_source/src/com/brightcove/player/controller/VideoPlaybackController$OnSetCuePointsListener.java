// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.controller:
//            VideoPlaybackController

public class a
    implements EventListener
{

    private VideoPlaybackController a;

    public void processEvent(Event event)
    {
        event = ((Event) (event.properties.get("cue_points")));
        if (event != null && (event instanceof List))
        {
            event = (List)event;
            VideoPlaybackController.b(a).clear();
            VideoPlaybackController.b(a).addAll(event);
            return;
        } else
        {
            event = VideoPlaybackController.TAG;
            return;
        }
    }

    protected (VideoPlaybackController videoplaybackcontroller)
    {
        a = videoplaybackcontroller;
        super();
    }
}
