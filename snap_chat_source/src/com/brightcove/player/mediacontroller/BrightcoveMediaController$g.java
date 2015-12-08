// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveMediaController

final class <init>
    implements EventListener
{

    final BrightcoveMediaController a;

    public final void processEvent(Event event)
    {
        BrightcoveMediaController.a();
        String.format("Processing event: %1$s...", new Object[] {
            event.getType()
        });
        BrightcoveMediaController.i(a);
        BrightcoveMediaController.j(a).once("bufferedUpdate", new EventListener() {

            private BrightcoveMediaController.g a;

            public final void processEvent(Event event1)
            {
                BrightcoveMediaController.i(a.a);
            }

            
            {
                a = BrightcoveMediaController.g.this;
                super();
            }
        });
    }

    private _cls1.a(BrightcoveMediaController brightcovemediacontroller)
    {
        a = brightcovemediacontroller;
        super();
    }

    a(BrightcoveMediaController brightcovemediacontroller, byte byte0)
    {
        this(brightcovemediacontroller);
    }
}
