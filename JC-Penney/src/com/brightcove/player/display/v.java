// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.RenderView;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent, a

class v
    implements EventListener
{

    final VideoDisplayComponent a;

    private v(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    v(VideoDisplayComponent videodisplaycomponent, a a1)
    {
        this(videodisplaycomponent);
    }

    public void processEvent(Event event)
    {
        a.a.setVisibility(0);
        event = (Event)event.properties.get("original");
        Log.v(VideoDisplayComponent.e(), (new StringBuilder()).append("OnWillResumeContentListener: originalEvent = ").append(event).toString());
        if (event != null)
        {
            VideoDisplayComponent.r(a).emit(event.getType(), event.properties);
        }
        VideoDisplayComponent.s(a).emit("didResumeContent");
    }
}
