// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            d, BaseVideoView

class e
    implements EventListener
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public void processEvent(Event event)
    {
        BaseVideoView.b(a.a);
    }
}
