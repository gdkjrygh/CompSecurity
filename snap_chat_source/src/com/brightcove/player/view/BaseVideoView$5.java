// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView, BrightcoveClosedCaptioningView

final class a
    implements EventListener
{

    private BaseVideoView a;

    public final void processEvent(Event event)
    {
        if (BaseVideoView.j(a) != null)
        {
            if (event.properties.containsKey("ttmlDocument") || event.properties.containsKey("webvttDocument"))
            {
                if (BaseVideoView.j(a).getParent() == null)
                {
                    a.addView(BaseVideoView.j(a));
                }
            } else
            if (BaseVideoView.j(a).getParent() != null)
            {
                a.removeView(BaseVideoView.j(a));
                return;
            }
        }
    }

    CaptioningView(BaseVideoView basevideoview)
    {
        a = basevideoview;
        super();
    }
}
