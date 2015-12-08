// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.os.Bundle;
import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.controller:
//            MediaControlsVisibilityManager, k

class m
    implements EventListener
{

    final MediaControlsVisibilityManager a;

    private m(MediaControlsVisibilityManager mediacontrolsvisibilitymanager)
    {
        a = mediacontrolsvisibilitymanager;
        super();
    }

    m(MediaControlsVisibilityManager mediacontrolsvisibilitymanager, k k)
    {
        this(mediacontrolsvisibilitymanager);
    }

    public void processEvent(Event event)
    {
        Log.v(MediaControlsVisibilityManager.a(), "Handling an ACTIVITY_CREATED event to (possibly) restore the media controls visibility state...");
        event = ((Event) (event.properties.get("instanceState")));
        if (event != null && (event instanceof Bundle))
        {
            event = (Bundle)event;
        } else
        {
            event = null;
        }
        if (event != null)
        {
            event = event.getBundle("mediaControlsVisibilityState");
        } else
        {
            event = null;
        }
        if (event != null)
        {
            MediaControlsVisibilityManager.b(a, event);
            return;
        } else
        {
            Log.v(MediaControlsVisibilityManager.a(), "No saved visibility state bundle found.  Restoration aborted.");
            return;
        }
    }
}
