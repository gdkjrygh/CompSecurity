// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView

class m
    implements EventListener
{

    final BaseVideoView a;

    m(BaseVideoView basevideoview)
    {
        a = basevideoview;
        super();
    }

    public void processEvent(Event event)
    {
        if (BaseVideoView.f(a) != null)
        {
            BaseVideoView.f(a).onCompletion(null);
        }
        a.h = 0;
        BaseVideoView.c(a, false);
    }
}
