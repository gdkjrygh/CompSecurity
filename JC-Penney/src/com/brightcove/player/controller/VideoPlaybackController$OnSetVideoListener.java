// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Video;
import java.net.URI;
import java.util.HashMap;
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
        event = (Video)event.properties.get("video");
        Log.v(VideoPlaybackController.TAG, (new StringBuilder()).append("OnSetVideoListener: ").append(event).toString());
        Object obj = event.getProperties().get("stillImageUri");
        if (obj != null && (obj instanceof URI))
        {
            obj = (URI)obj;
            HashMap hashmap = new HashMap();
            hashmap.put("video_still", obj);
            VideoPlaybackController.f(a).emit("setVideoStill", hashmap);
        }
        obj = event.getCuePoints();
        if (obj != null)
        {
            VideoPlaybackController.b(a).addAll(((java.util.Collection) (obj)));
        }
        obj = new HashMap();
        ((Map) (obj)).put("video", event);
        tener tener = new tener(a);
        tener.currentVideo = event;
        VideoPlaybackController.g(a).request("selectSource", ((Map) (obj)), tener);
    }

    protected tener(VideoPlaybackController videoplaybackcontroller)
    {
        a = videoplaybackcontroller;
        super();
    }
}
