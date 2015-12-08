// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.util.Log;
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
//            VideoPlaybackController, p

public class a
    implements EventListener
{

    final VideoPlaybackController a;

    public void processEvent(Event event)
    {
        Log.v(VideoPlaybackController.TAG, (new StringBuilder()).append("OnPlayListener: playEvent = ").append(event).append(", currentTime = ").append(VideoPlaybackController.a(a)).toString());
        if (VideoPlaybackController.a(a) == 0 && !event.properties.containsKey("skipCuePoints"))
        {
            Log.i(VideoPlaybackController.TAG, (new StringBuilder()).append("cuePoints = ").append(VideoPlaybackController.b(a)).toString());
            ArrayList arraylist = new ArrayList();
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
                    arraylist.add(cuepoint);
                }
            } while (true);
            if (!arraylist.isEmpty())
            {
                Log.i(VideoPlaybackController.TAG, (new StringBuilder()).append("batch = ").append(arraylist).toString());
                event.preventDefault();
                event.stopPropagation();
                event.properties.put("skipCuePoints", Boolean.valueOf(true));
                UUID uuid = UUID.randomUUID();
                VideoPlaybackController.d(a).once("cuePoint", new p(this, uuid, event));
                HashMap hashmap = new HashMap();
                hashmap.put("cue_points", arraylist);
                hashmap.put("endTime", Integer.valueOf(0));
                hashmap.put("startTime", Integer.valueOf(0));
                hashmap.put("original", event);
                hashmap.put("uuid", uuid);
                VideoPlaybackController.e(a).emit("cuePoint", hashmap);
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
