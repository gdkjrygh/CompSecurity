// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.widget.Button;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            LiveButtonController, h

class q
    implements EventListener
{

    final LiveButtonController a;

    private q(LiveButtonController livebuttoncontroller)
    {
        a = livebuttoncontroller;
        super();
    }

    q(LiveButtonController livebuttoncontroller, h h)
    {
        this(livebuttoncontroller);
    }

    public void processEvent(Event event)
    {
        a.getButton().setVisibility(0);
    }
}
