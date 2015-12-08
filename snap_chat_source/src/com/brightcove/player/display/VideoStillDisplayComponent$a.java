// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.widget.ImageView;
import com.brightcove.player.display.tasks.LoadImageTask;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.display:
//            VideoStillDisplayComponent

final class <init>
    implements EventListener
{

    private VideoStillDisplayComponent a;

    public final void processEvent(Event event)
    {
        event = VideoStillDisplayComponent.TAG;
        VideoStillDisplayComponent.a(a).setVisibility(4);
        if (VideoStillDisplayComponent.b(a) != null)
        {
            VideoStillDisplayComponent.b(a).cancel(true);
            VideoStillDisplayComponent.a(a, null);
        }
        VideoStillDisplayComponent.c(a);
        VideoStillDisplayComponent.e(a).off("cuePoint", VideoStillDisplayComponent.d(a));
        VideoStillDisplayComponent.g(a).off("progress", VideoStillDisplayComponent.f(a));
        VideoStillDisplayComponent.i(a).off("didSeekTo", VideoStillDisplayComponent.h(a));
        VideoStillDisplayComponent.k(a).off("willInterruptContent", VideoStillDisplayComponent.j(a));
        VideoStillDisplayComponent.m(a).off("activityStopped", VideoStillDisplayComponent.l(a));
        VideoStillDisplayComponent.o(a).off("fragmentStopped", VideoStillDisplayComponent.n(a));
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
