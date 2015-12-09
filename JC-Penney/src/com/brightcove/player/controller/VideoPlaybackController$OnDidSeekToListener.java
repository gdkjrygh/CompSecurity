// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.controller:
//            VideoPlaybackController

public class a
    implements EventListener
{

    final VideoPlaybackController a;

    public void processEvent(Event event)
    {
        int i = VideoPlaybackController.a(a);
        VideoPlaybackController.a(a, event.getIntegerProperty("seekPosition"));
        if (i < VideoPlaybackController.a(a))
        {
            VideoPlaybackController.a(a, i, VideoPlaybackController.a(a));
            return;
        } else
        {
            VideoPlaybackController.a(a, VideoPlaybackController.a(a), i);
            return;
        }
    }

    protected (VideoPlaybackController videoplaybackcontroller)
    {
        a = videoplaybackcontroller;
        super();
    }
}
