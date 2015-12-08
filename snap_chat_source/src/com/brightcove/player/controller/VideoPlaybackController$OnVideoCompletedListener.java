// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.CuePoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
        String s = VideoPlaybackController.TAG;
        (new StringBuilder("OnVideoCompletedListener: ")).append(event);
        VideoPlaybackController.a(a, 0);
        if (!event.properties.containsKey("skipCuePoints"))
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = VideoPlaybackController.b(a).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                CuePoint cuepoint = (CuePoint)iterator.next();
                if (cuepoint.getPositionType().a(com.brightcove.player.model.ener.a))
                {
                    arraylist.add(cuepoint);
                }
            } while (true);
            if (!arraylist.isEmpty())
            {
                event.preventDefault();
                event.stopPropagation();
                event.properties.put("skipCuePoints", Boolean.valueOf(true));
                HashMap hashmap = new HashMap();
                hashmap.put("cue_points", arraylist);
                hashmap.put("endTime", Integer.valueOf(0));
                hashmap.put("startTime", Integer.valueOf(0));
                hashmap.put("original", event);
                VideoPlaybackController.p(a).emit("cuePoint", hashmap);
                return;
            }
        }
    }

    protected (VideoPlaybackController videoplaybackcontroller)
    {
        a = videoplaybackcontroller;
        super();
    }
}
