// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.media.tasks.FindPlaylistTask;
import com.brightcove.player.media.tasks.FindVideoTask;
import com.brightcove.player.util.ErrorUtil;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.media:
//            MediaService, d

class e
    implements EventListener
{

    final MediaService a;

    private e(MediaService mediaservice)
    {
        a = mediaservice;
        super();
    }

    e(MediaService mediaservice, d d)
    {
        this(mediaservice);
    }

    public void processEvent(Event event)
    {
        Object obj;
        obj = new HashMap();
        ((Map) (obj)).put("token", MediaService.a(a));
        ((Map) (obj)).put("media_delivery", "http");
        if (event.properties.containsKey("options"))
        {
            ((Map) (obj)).putAll((Map)event.properties.get("options"));
        }
        try
        {
            if (event.properties.containsKey("videoID"))
            {
                (new FindVideoTask(MediaService.b(a), event, MediaService.c(a), ((Map) (obj)))).findVideoById((String)event.properties.get("videoID"));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            MediaService.a(a, event, ((Exception) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            MediaService.a(a, event, ((Exception) (obj)));
            return;
        }
        if (event.properties.containsKey("videoReferenceID"))
        {
            (new FindVideoTask(MediaService.d(a), event, MediaService.c(a), ((Map) (obj)))).findVideoByReferenceId((String)event.properties.get("videoReferenceID"));
            return;
        }
        if (event.properties.containsKey("playlistID"))
        {
            (new FindPlaylistTask(MediaService.e(a), event, MediaService.c(a), ((Map) (obj)))).findPlaylistById((String)event.properties.get("playlistID"));
            return;
        }
        if (event.properties.containsKey("playlistReferenceID"))
        {
            (new FindPlaylistTask(MediaService.f(a), event, MediaService.c(a), ((Map) (obj)))).findPlaylistByReferenceId((String)event.properties.get("playlistReferenceID"));
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage("keyNotFound"));
    }
}
