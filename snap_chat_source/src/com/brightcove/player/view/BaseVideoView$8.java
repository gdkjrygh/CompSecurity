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

final class a
    implements EventListener
{

    private Video a;
    private BaseVideoView b;

    public final void processEvent(Event event)
    {
        event = (Source)event.properties.get("source");
        BaseVideoView.l(b).put(a, event);
        EventUtil.emit(b.a, "didSelectSource", a, event);
        EventUtil.emit(b.a, "prebufferNextVideo", a, event);
    }

    (BaseVideoView basevideoview, Video video)
    {
        b = basevideoview;
        a = video;
        super();
    }
}
