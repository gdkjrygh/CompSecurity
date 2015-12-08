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

public class a
    implements EventListener
{

    private VideoDisplayComponent a;

    public void processEvent(Event event)
    {
        VideoDisplayComponent.b();
        (new StringBuilder("OnSeekListener: mediaPlayer = ")).append(VideoDisplayComponent.a(a));
        int i = -1;
        if (event.properties.containsKey("seekPosition"))
        {
            i = event.getIntegerProperty("seekPosition");
        } else
        {
            VideoDisplayComponent.b();
        }
        VideoDisplayComponent.b();
        if (VideoDisplayComponent.a(a) != null && VideoDisplayComponent.b(a) && a.c)
        {
            a.d = i;
            a.b = a.g;
            VideoDisplayComponent.a(a).seekTo(i);
            return;
        } else
        {
            a.e = i;
            return;
        }
    }

    protected (VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }
}
