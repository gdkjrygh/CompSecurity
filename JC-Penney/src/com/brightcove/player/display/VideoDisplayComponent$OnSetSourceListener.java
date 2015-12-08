// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.util.Log;
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

    final VideoDisplayComponent a;

    public void processEvent(Event event)
    {
label0:
        {
            Log.v(VideoDisplayComponent.e(), "OnSetSourceListener");
            a.d();
            a.k = (Video)event.properties.get("video");
            a.l = (Source)event.properties.get("source");
            if (a.l != null && a.l.getUrl() != null)
            {
                if (a.l.getDeliveryType() == DeliveryType.HLS || a.l.getDeliveryType() == DeliveryType.WVM)
                {
                    break label0;
                }
                a.a(a.k, a.l);
            }
            return;
        }
        a.l.getProperties().put("emittedDidSetSource", Boolean.valueOf(true));
        EventUtil.emit(VideoDisplayComponent.h(a), "didSetSource", a.k, a.l);
    }

    protected (VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }
}
