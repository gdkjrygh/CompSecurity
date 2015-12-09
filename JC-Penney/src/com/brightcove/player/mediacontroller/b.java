// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.os.Bundle;
import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveMediaController, a

class b
    implements EventListener
{

    final BrightcoveMediaController a;

    private b(BrightcoveMediaController brightcovemediacontroller)
    {
        a = brightcovemediacontroller;
        super();
    }

    b(BrightcoveMediaController brightcovemediacontroller, a a1)
    {
        this(brightcovemediacontroller);
    }

    public void processEvent(Event event)
    {
        Log.d(BrightcoveMediaController.a(), "Processing the activity created event...");
        event = ((Event) (event.properties.get("instanceState")));
        if (event != null && (event instanceof Bundle) && ((Bundle)event).size() > 0)
        {
            event = (Bundle)event;
            BrightcoveMediaController.a(a, event);
        }
    }
}
