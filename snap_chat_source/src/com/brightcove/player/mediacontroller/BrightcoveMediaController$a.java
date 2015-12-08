// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.os.Bundle;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveMediaController

final class <init>
    implements EventListener
{

    private BrightcoveMediaController a;

    public final void processEvent(Event event)
    {
        BrightcoveMediaController.a();
        event = ((Event) (event.properties.get("instanceState")));
        if (event != null && (event instanceof Bundle) && ((Bundle)event).size() > 0)
        {
            event = (Bundle)event;
            BrightcoveMediaController.a(a, event);
        }
    }

    private (BrightcoveMediaController brightcovemediacontroller)
    {
        a = brightcovemediacontroller;
        super();
    }

    a(BrightcoveMediaController brightcovemediacontroller, byte byte0)
    {
        this(brightcovemediacontroller);
    }
}
