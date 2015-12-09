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

    final VideoPlaybackController a;

    public void processEvent(Event event)
    {
        if (!VideoPlaybackController.j(a))
        {
            VideoPlaybackController.a(a, true);
            if (VideoPlaybackController.l(a).size() > 0)
            {
                Video video;
                for (; VideoPlaybackController.l(a).size() > 0; EventUtil.emit(VideoPlaybackController.n(a), "setSource", video, event))
                {
                    event = (Source)VideoPlaybackController.l(a).remove(0);
                    video = (Video)VideoPlaybackController.h(a).remove(event);
                }

            }
        }
    }

    protected (VideoPlaybackController videoplaybackcontroller)
    {
        a = videoplaybackcontroller;
        super();
    }
}
