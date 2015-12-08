// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView

class q
    implements EventListener
{

    final BaseVideoView a;

    q(BaseVideoView basevideoview)
    {
        a = basevideoview;
        super();
    }

    public void processEvent(Event event)
    {
        BaseVideoView.c(a, true);
        BaseVideoView.b(a);
        BaseVideoView.g(a);
    }
}
