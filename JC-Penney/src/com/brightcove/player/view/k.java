// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.BuildConfig;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Video;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView

class k
    implements EventListener
{

    final BaseVideoView a;

    k(BaseVideoView basevideoview)
    {
        a = basevideoview;
        super();
    }

    public void processEvent(Event event)
    {
        a.c();
        event = (Video)event.properties.get("video");
        if (event != null && !event.equals(a.getCurrentVideo()) && BaseVideoView.c(a).indexOf(event) >= 0)
        {
            BaseVideoView.d(a);
            if (BuildConfig.DEBUG && !event.equals(a.getCurrentVideo()))
            {
                throw new AssertionError();
            }
        }
        BaseVideoView.a(a, true);
        if (BaseVideoView.e(a))
        {
            BaseVideoView.b(a, false);
            a.a.emit("play");
        }
    }
}
