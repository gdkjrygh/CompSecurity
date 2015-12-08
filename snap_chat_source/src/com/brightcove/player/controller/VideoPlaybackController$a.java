// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.controller:
//            VideoPlaybackController

final class <init>
    implements EventListener
{

    private VideoPlaybackController a;

    public final void processEvent(Event event)
    {
        int i = event.getIntegerProperty("playheadPosition");
        if (VideoPlaybackController.a(a) != -1 && VideoPlaybackController.a(a) < i)
        {
            int j = VideoPlaybackController.a(a);
            VideoPlaybackController.a(a, i);
            VideoPlaybackController.a(a, j, VideoPlaybackController.a(a));
        }
    }

    private (VideoPlaybackController videoplaybackcontroller)
    {
        a = videoplaybackcontroller;
        super();
    }

    a(VideoPlaybackController videoplaybackcontroller, byte byte0)
    {
        this(videoplaybackcontroller);
    }
}
