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
import java.util.UUID;

// Referenced classes of package com.brightcove.player.controller:
//            VideoPlaybackController

public class a
    implements EventListener
{

    final VideoPlaybackController a;

    public void processEvent(Event event)
    {
        String s = VideoPlaybackController.TAG;
        (new StringBuilder("OnPlayListener: playEvent = ")).append(event).append(", currentTime = ").append(VideoPlaybackController.a(a));
        if (VideoPlaybackController.a(a) == 0 && !event.properties.containsKey("skipCuePoints"))
        {
            Object obj = VideoPlaybackController.TAG;
            (new StringBuilder("cuePoints = ")).append(VideoPlaybackController.b(a));
            obj = new ArrayList();
            Iterator iterator = VideoPlaybackController.b(a).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                CuePoint cuepoint = (CuePoint)iterator.next();
                if (cuepoint.getPositionType().a(com.brightcove.player.model.ener.a) || cuepoint.getPositionType().a(com.brightcove.player.model.ener.a) && cuepoint.getPosition() == 0)
                {
                    ((ArrayList) (obj)).add(cuepoint);
                }
            } while (true);
            if (!((ArrayList) (obj)).isEmpty())
            {
                Object obj1 = VideoPlaybackController.TAG;
                (new StringBuilder("batch = ")).append(obj);
                event.preventDefault();
                event.stopPropagation();
                event.properties.put("skipCuePoints", Boolean.valueOf(true));
                obj1 = UUID.randomUUID();
                VideoPlaybackController.d(a).once("cuePoint", new EventListener(((UUID) (obj1)), event) {

                    private UUID a;
                    private Event b;
                    private VideoPlaybackController.OnPlayListener c;

                    public final void processEvent(Event event1)
                    {
                        if (a.equals(event1.properties.get("uuid")))
                        {
                            VideoPlaybackController.c(c.a).emit(b.getType(), b.properties);
                        }
                    }

            
            {
                c = VideoPlaybackController.OnPlayListener.this;
                a = uuid;
                b = event;
                super();
            }
                });
                HashMap hashmap = new HashMap();
                hashmap.put("cue_points", obj);
                hashmap.put("endTime", Integer.valueOf(0));
                hashmap.put("startTime", Integer.valueOf(0));
                hashmap.put("original", event);
                hashmap.put("uuid", obj1);
                VideoPlaybackController.e(a).emit("cuePoint", hashmap);
                return;
            }
        }
    }

    protected _cls1.b(VideoPlaybackController videoplaybackcontroller)
    {
        a = videoplaybackcontroller;
        super();
    }
}
