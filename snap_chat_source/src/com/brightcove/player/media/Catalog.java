// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media;

import com.brightcove.player.event.Component;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventEmitterImpl;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Playlist;
import com.brightcove.player.model.Video;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.media:
//            MediaService, PlaylistListener, VideoListener

public class Catalog
    implements Component
{
    final class a
        implements EventListener
    {

        private PlaylistListener a;

        public final void processEvent(Event event)
        {
            Object obj = (List)event.properties.get("errors");
            if (obj != null && !((List) (obj)).isEmpty())
            {
                for (event = ((List) (obj)).iterator(); event.hasNext(); a.onError(((String) (obj))))
                {
                    obj = (String)event.next();
                }

            } else
            {
                event = (Playlist)event.properties.get("playlist");
                a.onPlaylist(event);
            }
        }

        public a(PlaylistListener playlistlistener)
        {
            a = playlistlistener;
        }
    }

    final class b
        implements EventListener
    {

        private VideoListener a;

        public final void processEvent(Event event)
        {
            Object obj = (List)event.properties.get("errors");
            if (obj != null && !((List) (obj)).isEmpty())
            {
                for (event = ((List) (obj)).iterator(); event.hasNext(); a.onError(((String) (obj))))
                {
                    obj = (String)event.next();
                }

            } else
            {
                event = (Video)event.properties.get("video");
                a.onVideo(event);
            }
        }

        public b(VideoListener videolistener)
        {
            a = videolistener;
        }
    }


    public static final String PLAYLIST_ID = "playlistID";
    public static final String PLAYLIST_REFERENCE_ID = "playlistReferenceID";
    public static final String VIDEO_ID = "videoID";
    public static final String VIDEO_REFERENCE_ID = "videoReferenceID";
    private EventEmitter a;

    public Catalog(String s)
    {
        a = new EventEmitterImpl();
        new MediaService(a, s);
    }

    public Catalog(String s, String s1)
    {
        a = new EventEmitterImpl();
        new MediaService(a, s, s1);
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
        a.request("findPlaylist", hashmap, new a(playlistlistener));
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
        a.request("findPlaylist", hashmap, new a(playlistlistener));
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
        a.request("findVideo", hashmap, new b(videolistener));
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
        a.request("findVideo", hashmap, new b(videolistener));
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
