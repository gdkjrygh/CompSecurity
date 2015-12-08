// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.model.Source;
import com.brightcove.player.view.RenderView;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

final class <init>
    implements EventListener
{

    private VideoDisplayComponent a;

    public final void processEvent(Event event)
    {
        VideoDisplayComponent.b();
        (new StringBuilder("OnWillInterruptContentListener: mediaPlayer = ")).append(VideoDisplayComponent.a(a)).append(", hasPrepared = ").append(VideoDisplayComponent.b(a)).append(", hasSurface = ").append(a.c).append(", currentSource = ").append(a.j);
        if (VideoDisplayComponent.a(a) != null && VideoDisplayComponent.b(a) && a.c && VideoDisplayComponent.a(a).isPlaying())
        {
            VideoDisplayComponent.b();
            if (a.j != null && a.j.getDeliveryType() != DeliveryType.HLS)
            {
                VideoDisplayComponent.a(a).pause();
            } else
            {
                a.a();
            }
        }
        a.a.setVisibility(4);
        VideoDisplayComponent.t(a).emit("didInterruptContent");
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
