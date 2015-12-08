// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.RenderView;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

final class <init>
    implements EventListener
{

    private VideoDisplayComponent a;

    public final void processEvent(Event event)
    {
        a.a.setVisibility(0);
        event = (Event)event.properties.get("original");
        VideoDisplayComponent.b();
        (new StringBuilder("OnWillResumeContentListener: originalEvent = ")).append(event);
        if (event != null)
        {
            VideoDisplayComponent.r(a).emit(event.getType(), event.properties);
        }
        VideoDisplayComponent.s(a).emit("didResumeContent");
    }

    private (VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    a(VideoDisplayComponent videodisplaycomponent, byte byte0)
    {
        this(videodisplaycomponent);
    }
}
