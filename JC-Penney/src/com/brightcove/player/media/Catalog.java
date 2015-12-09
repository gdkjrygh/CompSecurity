// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media;

import com.brightcove.player.event.Component;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventEmitterImpl;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.media:
//            MediaService, a, b, PlaylistListener, 
//            VideoListener

public class Catalog
    implements Component
{

    public static final String PLAYLIST_ID = "playlistID";
    public static final String PLAYLIST_REFERENCE_ID = "playlistReferenceID";
    public static final String VIDEO_ID = "videoID";
    public static final String VIDEO_REFERENCE_ID = "videoReferenceID";
    private EventEmitter a;
    private MediaService b;

    public Catalog(String s)
    {
        a = new EventEmitterImpl();
        b = new MediaService(a, s);
    }

    public Catalog(String s, String s1)
    {
        a = new EventEmitterImpl();
        b = new MediaService(a, s, s1);
    }

    public void findPlaylistByID(String s, PlaylistListener playlistlistener)
    {
        findPlaylistByID(s, null, playlistlistener);
    }

    public void findPlaylistByID(String s, Map map, PlaylistListener playlistlistener)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("playlistID", s);
        if (map != null)
        {
            hashmap.put("options", map);
        }
        a.request("findPlaylist", hashmap, new a(this, playlistlistener));
    }

    public void findPlaylistByReferenceID(String s, PlaylistListener playlistlistener)
    {
        findPlaylistByReferenceID(s, null, playlistlistener);
    }

    public void findPlaylistByReferenceID(String s, Map map, PlaylistListener playlistlistener)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("playlistReferenceID", s);
        if (map != null)
        {
            hashmap.put("options", map);
        }
        a.request("findPlaylist", hashmap, new a(this, playlistlistener));
    }

    public void findVideoByID(String s, VideoListener videolistener)
    {
        findVideoByID(s, null, videolistener);
    }

    public void findVideoByID(String s, Map map, VideoListener videolistener)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("videoID", s);
        if (map != null)
        {
            hashmap.put("options", map);
        }
        a.request("findVideo", hashmap, new b(this, videolistener));
    }

    public void findVideoByReferenceID(String s, VideoListener videolistener)
    {
        findVideoByReferenceID(s, null, videolistener);
    }

    public void findVideoByReferenceID(String s, Map map, VideoListener videolistener)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("videoReferenceID", s);
        if (map != null)
        {
            hashmap.put("options", map);
        }
        a.request("findVideo", hashmap, new b(this, videolistener));
    }

    public EventEmitter getEventEmitter()
    {
        return a;
    }

    public void setEventEmitter(EventEmitter eventemitter)
    {
        a = eventemitter;
    }
}
