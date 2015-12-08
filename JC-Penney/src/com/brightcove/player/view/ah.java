// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BrightcovePlayerFragment

class ah
    implements EventListener
{

    final BrightcovePlayerFragment a;

    ah(BrightcovePlayerFragment brightcoveplayerfragment)
    {
        a = brightcoveplayerfragment;
        super();
    }

    public void processEvent(Event event)
    {
        BrightcovePlayerFragment.a(a).off();
    }
}
