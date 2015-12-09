// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.controller:
//            MediaControlsVisibilityManager, k

class l
    implements EventListener
{

    final MediaControlsVisibilityManager a;

    private l(MediaControlsVisibilityManager mediacontrolsvisibilitymanager)
    {
        a = mediacontrolsvisibilitymanager;
        super();
    }

    l(MediaControlsVisibilityManager mediacontrolsvisibilitymanager, k k)
    {
        this(mediacontrolsvisibilitymanager);
    }

    public void processEvent(Event event)
    {
        event = ((Event) (event.properties.get("seekControlsVisibility")));
        if (event != null && (event instanceof Map))
        {
            event = (Map)event;
            MediaControlsVisibilityManager.a(a).clear();
            MediaControlsVisibilityManager.a(a).putAll(event);
            a.setVisibilityState();
        }
    }
}
