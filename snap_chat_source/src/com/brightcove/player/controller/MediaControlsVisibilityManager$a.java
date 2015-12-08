// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.controller:
//            MediaControlsVisibilityManager

final class <init>
    implements EventListener
{

    private MediaControlsVisibilityManager a;

    public final void processEvent(Event event)
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

    private (MediaControlsVisibilityManager mediacontrolsvisibilitymanager)
    {
        a = mediacontrolsvisibilitymanager;
        super();
    }

    a(MediaControlsVisibilityManager mediacontrolsvisibilitymanager, byte byte0)
    {
        this(mediacontrolsvisibilitymanager);
    }
}
