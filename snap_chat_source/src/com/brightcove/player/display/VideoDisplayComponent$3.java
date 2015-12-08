// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

final class b
    implements EventListener
{

    private Video a;
    private Source b;
    private VideoDisplayComponent c;

    public final void processEvent(Event event)
    {
        VideoDisplayComponent.a(c, a, b);
    }

    (VideoDisplayComponent videodisplaycomponent, Video video, Source source)
    {
        c = videodisplaycomponent;
        a = video;
        b = source;
        super();
    }
}
