// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.model.Source;
import com.brightcove.player.view.RenderView;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent, a

class u
    implements EventListener
{

    final VideoDisplayComponent a;

    private u(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    u(VideoDisplayComponent videodisplaycomponent, a a1)
    {
        this(videodisplaycomponent);
    }

    public void processEvent(Event event)
    {
        Log.v(VideoDisplayComponent.e(), (new StringBuilder()).append("OnWillInterruptContentListener: mediaPlayer = ").append(VideoDisplayComponent.a(a)).append(", hasPrepared = ").append(VideoDisplayComponent.b(a)).append(", hasSurface = ").append(a.e).append(", currentSource = ").append(a.l).toString());
        if (VideoDisplayComponent.a(a) != null && VideoDisplayComponent.b(a) && a.e && VideoDisplayComponent.a(a).isPlaying())
        {
            Log.v(VideoDisplayComponent.e(), "OnWillInterruptContentListener: isPlaying");
            if (a.l != null && a.l.getDeliveryType() != DeliveryType.HLS)
            {
                VideoDisplayComponent.a(a).pause();
            } else
            {
                a.d();
            }
        }
        a.a.setVisibility(4);
        VideoDisplayComponent.t(a).emit("didInterruptContent");
    }
}
