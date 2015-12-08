// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.util;

import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.util:
//            ErrorUtil

public class EventUtil
{

    public EventUtil()
    {
    }

    public static void emit(EventEmitter eventemitter, String s, Video video)
    {
        if (video == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("videoRequired"));
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("video", video);
            eventemitter.emit(s, hashmap);
            return;
        }
    }

    public static void emit(EventEmitter eventemitter, String s, Video video, Source source)
    {
        if (video == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("videoRequired"));
        }
        if (source == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("sourceRequired"));
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("video", video);
            hashmap.put("source", source);
            eventemitter.emit(s, hashmap);
            return;
        }
    }
}
