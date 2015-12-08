// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.edge;

import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.EventEmitter;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.edge:
//            GetVideoTask, VideoListener

public class Catalog extends AbstractComponent
{

    public static final String DEFAULT_EDGE_BASE_URL = "https://edge.api.brightcove.com/playback/v1/";
    private String a;
    private String b;
    private String c;

    public Catalog(EventEmitter eventemitter, String s, String s1)
    {
        this(eventemitter, s, s1, "https://edge.api.brightcove.com/playback/v1/");
    }

    public Catalog(EventEmitter eventemitter, String s, String s1, String s2)
    {
        super(eventemitter, com/brightcove/player/edge/Catalog);
        a = s;
        b = s1;
        c = s2;
        s1 = new HashMap();
        s1.put("value", s);
        eventemitter.emit("account", s1);
    }

    public void findVideoByID(String s, VideoListener videolistener)
    {
        findVideoByID(s, null, videolistener);
    }

    public void findVideoByID(String s, Map map, VideoListener videolistener)
    {
        (new GetVideoTask(eventEmitter, c, map, a, b)).getById(s, videolistener);
    }

    public void findVideoByReferenceID(String s, VideoListener videolistener)
    {
        findVideoByReferenceID(s, null, videolistener);
    }

    public void findVideoByReferenceID(String s, Map map, VideoListener videolistener)
    {
        (new GetVideoTask(eventEmitter, c, map, a, b)).getByReferenceId(s, videolistener);
    }
}
