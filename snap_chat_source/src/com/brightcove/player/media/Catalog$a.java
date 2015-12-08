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
//            Catalog, PlaylistListener

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

    public stener(PlaylistListener playlistlistener)
    {
        a = playlistlistener;
    }
}
