// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView, BrightcoveClosedCaptioningView

class f
    implements EventListener
{

    final BaseVideoView a;

    f(BaseVideoView basevideoview)
    {
        a = basevideoview;
        super();
    }

    public void processEvent(Event event)
    {
        if (BaseVideoView.h(a) != null)
        {
            if (event.properties.containsKey("ttmlDocument") || event.properties.containsKey("webvttDocument"))
            {
                if (BaseVideoView.h(a).getParent() == null)
                {
                    a.addView(BaseVideoView.h(a));
                }
            } else
            if (BaseVideoView.h(a).getParent() != null)
            {
                a.removeView(BaseVideoView.h(a));
                return;
            }
        }
    }
}
