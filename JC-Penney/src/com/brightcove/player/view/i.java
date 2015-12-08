// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.util.Pair;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Video;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView

class i
    implements EventListener
{

    final Pair a;
    final BaseVideoView b;

    i(BaseVideoView basevideoview, Pair pair)
    {
        b = basevideoview;
        a = pair;
        super();
    }

    public void processEvent(Event event)
    {
        event = (Video)event.properties.get("nextVideo");
        if (event != null)
        {
            BaseVideoView.a(b, event, a);
        }
    }
}
