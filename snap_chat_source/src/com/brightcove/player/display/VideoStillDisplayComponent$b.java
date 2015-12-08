// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import com.brightcove.player.display.tasks.LoadImageTask;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import java.net.URI;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoStillDisplayComponent

final class <init>
    implements EventListener
{

    private VideoStillDisplayComponent a;

    public final void processEvent(Event event)
    {
        Object obj = VideoStillDisplayComponent.TAG;
        VideoStillDisplayComponent.c(a);
        obj = new <init>(a, (byte)0);
        VideoStillDisplayComponent.a(a, VideoStillDisplayComponent.p(a).once("cuePoint", ((EventListener) (obj))));
        VideoStillDisplayComponent.b(a, VideoStillDisplayComponent.q(a).once("progress", ((EventListener) (obj))));
        VideoStillDisplayComponent.c(a, VideoStillDisplayComponent.r(a).once("didSeekTo", ((EventListener) (obj))));
        VideoStillDisplayComponent.d(a, VideoStillDisplayComponent.s(a).once("willInterruptContent", ((EventListener) (obj))));
        VideoStillDisplayComponent.e(a, VideoStillDisplayComponent.t(a).once("activityStopped", ((EventListener) (obj))));
        VideoStillDisplayComponent.f(a, VideoStillDisplayComponent.u(a).once("fragmentStopped", ((EventListener) (obj))));
        event = (URI)event.properties.get("video_still");
        VideoStillDisplayComponent.a(a, new LoadImageTask(VideoStillDisplayComponent.a(a), VideoStillDisplayComponent.v(a)));
        VideoStillDisplayComponent.b(a).setSuccessEventType("didSetVideoStill");
        VideoStillDisplayComponent.b(a).execute(new URI[] {
            event
        });
    }

    private (VideoStillDisplayComponent videostilldisplaycomponent)
    {
        a = videostilldisplaycomponent;
        super();
    }

    a(VideoStillDisplayComponent videostilldisplaycomponent, byte byte0)
    {
        this(videostilldisplaycomponent);
    }
}
