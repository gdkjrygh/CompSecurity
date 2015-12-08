// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
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
        (new StringBuilder("OnSetVolumeListener: mediaPlayer = ")).append(VideoDisplayComponent.a(a));
        if (!event.properties.containsKey("leftVolume") || !event.properties.containsKey("rightVolume"))
        {
            VideoDisplayComponent.b();
            return;
        }
        float f = ((Float)event.properties.get("leftVolume")).floatValue();
        float f1 = ((Float)event.properties.get("rightVolume")).floatValue();
        VideoDisplayComponent.b();
        (new StringBuilder("OnSetVolumeListener: leftVolume = ")).append(f).append(" rightVolume = ").append(f1);
        if (f < 0.0F || f > 1.0F || f1 < 0.0F || f1 > 1.0F)
        {
            VideoDisplayComponent.b();
            (new StringBuilder("LEFT_VOLUME and RIGHT_VOLUME must be between 0.0f and 1.0f: ")).append(f).append(", ").append(f1);
            return;
        } else
        {
            VideoDisplayComponent.a(a).setVolume(f, f1);
            return;
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
