// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.EventUtil;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView

class h
    implements EventListener
{

    final Video a;
    final BaseVideoView b;

    h(BaseVideoView basevideoview, Video video)
    {
        b = basevideoview;
        a = video;
        super();
    }

    public void processEvent(Event event)
    {
        event = (Source)event.properties.get("source");
        BaseVideoView.j(b).put(a, event);
        EventUtil.emit(b.a, "didSelectSource", a, event);
        EventUtil.emit(b.a, "prebufferNextVideo", a, event);
    }
}
