// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveMediaController, a

class g
    implements EventListener
{

    final BrightcoveMediaController a;

    private g(BrightcoveMediaController brightcovemediacontroller)
    {
        a = brightcovemediacontroller;
        super();
    }

    g(BrightcoveMediaController brightcovemediacontroller, a a1)
    {
        this(brightcovemediacontroller);
    }

    public void processEvent(Event event)
    {
        Log.d(BrightcoveMediaController.a(), String.format("Processing event: %1$s...", new Object[] {
            event.getType()
        }));
        BrightcoveMediaController.i(a);
    }
}
