// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent, a

class t
    implements EventListener
{

    final VideoDisplayComponent a;

    private t(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    t(VideoDisplayComponent videodisplaycomponent, a a1)
    {
        this(videodisplaycomponent);
    }

    public void processEvent(Event event)
    {
        Log.v(VideoDisplayComponent.e(), (new StringBuilder()).append("OnSetVolumeListener: mediaPlayer = ").append(VideoDisplayComponent.a(a)).toString());
        if (!event.properties.containsKey("leftVolume") || !event.properties.containsKey("rightVolume"))
        {
            Log.e(VideoDisplayComponent.e(), "SET_VOLUME requires LEFT_VOLUME and RIGHT_VOLUME properties.");
            return;
        }
        float f = ((Float)event.properties.get("leftVolume")).floatValue();
        float f1 = ((Float)event.properties.get("rightVolume")).floatValue();
        Log.v(VideoDisplayComponent.e(), (new StringBuilder()).append("OnSetVolumeListener: leftVolume = ").append(f).append(" rightVolume = ").append(f1).toString());
        if (f < 0.0F || f > 1.0F || f1 < 0.0F || f1 > 1.0F)
        {
            Log.e(VideoDisplayComponent.e(), (new StringBuilder()).append("LEFT_VOLUME and RIGHT_VOLUME must be between 0.0f and 1.0f: ").append(f).append(", ").append(f1).toString());
            return;
        } else
        {
            VideoDisplayComponent.a(a).setVolume(f, f1);
            return;
        }
    }
}
