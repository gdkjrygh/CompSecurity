// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Video;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView

final class a
    implements EventListener
{

    private BaseVideoView a;

    public final void processEvent(Event event)
    {
        a.b();
        event = (Video)event.properties.get("video");
        if (event != null && !event.equals(a.getCurrentVideo()) && BaseVideoView.c(a).indexOf(event) >= 0)
        {
            BaseVideoView.d(a);
        }
        BaseVideoView.e(a);
        if (BaseVideoView.f(a))
        {
            BaseVideoView.g(a);
            a.a.emit("play");
        }
    }

    (BaseVideoView basevideoview)
    {
        a = basevideoview;
        super();
    }
}
