// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.EventUtil;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView

final class b
    implements EventListener
{

    private UUID a;
    private int b;
    private BaseVideoView c;

    public final void processEvent(Event event)
    {
label0:
        {
            if (event.properties.get("uuid").equals(a))
            {
                c.a();
                BaseVideoView.b(c, b);
                event = (Video)event.properties.get("nextVideo");
                if (event == null)
                {
                    break label0;
                }
                EventUtil.emit(c.a, "setVideo", event);
            }
            return;
        }
        c.a.emit("setSource");
    }

    (BaseVideoView basevideoview, UUID uuid, int i)
    {
        c = basevideoview;
        a = uuid;
        b = i;
        super();
    }
}
