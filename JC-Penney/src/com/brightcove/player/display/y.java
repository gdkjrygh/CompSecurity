// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.util.Log;
import com.brightcove.player.display.tasks.LoadImageTask;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import java.net.URI;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoStillDisplayComponent, x, w

class y
    implements EventListener
{

    final VideoStillDisplayComponent a;

    private y(VideoStillDisplayComponent videostilldisplaycomponent)
    {
        a = videostilldisplaycomponent;
        super();
    }

    y(VideoStillDisplayComponent videostilldisplaycomponent, w w)
    {
        this(videostilldisplaycomponent);
    }

    public void processEvent(Event event)
    {
        Log.v(VideoStillDisplayComponent.TAG, "OnSetVideoStill");
        VideoStillDisplayComponent.c(a);
        x x1 = new x(a, null);
        VideoStillDisplayComponent.a(a, VideoStillDisplayComponent.p(a).once("cuePoint", x1));
        VideoStillDisplayComponent.b(a, VideoStillDisplayComponent.q(a).once("progress", x1));
        VideoStillDisplayComponent.c(a, VideoStillDisplayComponent.r(a).once("didSeekTo", x1));
        VideoStillDisplayComponent.d(a, VideoStillDisplayComponent.s(a).once("willInterruptContent", x1));
        VideoStillDisplayComponent.e(a, VideoStillDisplayComponent.t(a).once("activityStopped", x1));
        VideoStillDisplayComponent.f(a, VideoStillDisplayComponent.u(a).once("fragmentStopped", x1));
        event = (URI)event.properties.get("video_still");
        VideoStillDisplayComponent.a(a, new LoadImageTask(VideoStillDisplayComponent.a(a), VideoStillDisplayComponent.v(a)));
        VideoStillDisplayComponent.b(a).setSuccessEventType("didSetVideoStill");
        VideoStillDisplayComponent.b(a).execute(new URI[] {
            event
        });
    }
}
