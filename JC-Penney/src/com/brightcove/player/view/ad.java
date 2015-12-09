// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BrightcovePlayer, BaseVideoView

class ad
    implements EventListener
{

    final BrightcovePlayer a;

    ad(BrightcovePlayer brightcoveplayer)
    {
        a = brightcoveplayer;
        super();
    }

    public void processEvent(Event event)
    {
        if (BrightcovePlayer.a(a) > 0)
        {
            a.a.seekTo(BrightcovePlayer.a(a));
            BrightcovePlayer.a(a, -1);
        }
    }
}
