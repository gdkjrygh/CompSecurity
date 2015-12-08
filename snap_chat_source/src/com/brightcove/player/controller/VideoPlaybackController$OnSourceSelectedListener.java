// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.EventUtil;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.controller:
//            VideoPlaybackController

public class a
    implements EventListener
{

    private VideoPlaybackController a;
    public Video currentVideo;

    public void processEvent(Event event)
    {
        String s = VideoPlaybackController.TAG;
        event = (Source)event.properties.get("source");
        VideoPlaybackController.h(a).put(event, currentVideo);
        EventUtil.emit(VideoPlaybackController.i(a), "didSelectSource", currentVideo, event);
        if (VideoPlaybackController.j(a))
        {
            EventUtil.emit(VideoPlaybackController.k(a), "setSource", currentVideo, event);
            return;
        } else
        {
            VideoPlaybackController.l(a).add(event);
            return;
        }
    }

    protected (VideoPlaybackController videoplaybackcontroller)
    {
        a = videoplaybackcontroller;
        super();
    }
}
