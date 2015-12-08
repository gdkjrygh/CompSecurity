// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            c, CaptionsButtonController

class d
    implements EventListener
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public void processEvent(Event event)
    {
        a.a.c.start();
    }
}
