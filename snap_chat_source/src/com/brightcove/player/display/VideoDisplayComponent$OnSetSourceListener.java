// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.EventUtil;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

public class a
    implements EventListener
{

    private VideoDisplayComponent a;

    public void processEvent(Event event)
    {
label0:
        {
            VideoDisplayComponent.b();
            a.a();
            a.i = (Video)event.properties.get("video");
            a.j = (Source)event.properties.get("source");
            if (a.j != null && a.j.getUrl() != null)
            {
                if (a.j.getDeliveryType() == DeliveryType.HLS || a.j.getDeliveryType() == DeliveryType.WVM)
                {
                    break label0;
                }
                a.a(a.i, a.j);
            }
            return;
        }
        a.j.getProperties().put("emittedDidSetSource", Boolean.valueOf(true));
        EventUtil.emit(VideoDisplayComponent.h(a), "didSetSource", a.i, a.j);
    }

    protected (VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }
}
