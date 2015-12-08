// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Playlist;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.media:
//            PlaylistListener, Catalog

class a
    implements EventListener
{

    final Catalog a;
    private PlaylistListener b;

    public a(Catalog catalog, PlaylistListener playlistlistener)
    {
        a = catalog;
        super();
        b = playlistlistener;
    }

    public void processEvent(Event event)
    {
        Object obj = (List)event.properties.get("errors");
        if (obj != null && !((List) (obj)).isEmpty())
        {
            for (event = ((List) (obj)).iterator(); event.hasNext(); b.onError(((String) (obj))))
            {
                obj = (String)event.next();
            }

        } else
        {
            event = (Playlist)event.properties.get("playlist");
            b.onPlaylist(event);
        }
    }
}
