// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

final class <init>
    implements EventListener
{

    private VideoDisplayComponent a;

    public final void processEvent(Event event)
    {
        VideoDisplayComponent.b();
        if (VideoDisplayComponent.a(a) != null && VideoDisplayComponent.b(a) && a.c && VideoDisplayComponent.a(a).isPlaying())
        {
            VideoDisplayComponent.a(a).pause();
            event = new HashMap();
            event.put("playheadPosition", Integer.valueOf(VideoDisplayComponent.a(a).getCurrentPosition()));
            VideoDisplayComponent.l(a).emit("didPause", event);
        }
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
