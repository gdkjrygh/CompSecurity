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
//            VideoDisplayComponent

public class a
    implements EventListener
{

    final VideoDisplayComponent a;

    public void processEvent(Event event)
    {
        Log.v(VideoDisplayComponent.e(), (new StringBuilder()).append("OnSeekListener: mediaPlayer = ").append(VideoDisplayComponent.a(a)).toString());
        int i = -1;
        if (event.properties.containsKey("seekPosition"))
        {
            i = event.getIntegerProperty("seekPosition");
        } else
        {
            Log.e(VideoDisplayComponent.e(), "Seek event must pass the seekPosition property");
        }
        Log.v(VideoDisplayComponent.e(), (new StringBuilder()).append("OnSeekListener: position = ").append(i).toString());
        if (VideoDisplayComponent.a(a) != null && VideoDisplayComponent.b(a) && a.e)
        {
            a.f = i;
            a.b = a.i;
            VideoDisplayComponent.a(a).seekTo(i);
            return;
        } else
        {
            a.g = i;
            return;
        }
    }

    protected (VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }
}
