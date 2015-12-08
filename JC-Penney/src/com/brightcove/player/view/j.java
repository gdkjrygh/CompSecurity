// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView

class j
    implements EventListener
{

    final BaseVideoView a;

    j(BaseVideoView basevideoview)
    {
        a = basevideoview;
        super();
    }

    public void processEvent(Event event)
    {
        int i = event.getIntegerProperty("duration");
        if (i > 0)
        {
            Log.v(BaseVideoView.g(), String.format("videoDurationChanged: changing duration to %d.", new Object[] {
                Integer.valueOf(i)
            }));
            a.g = i;
            BaseVideoView.b(a);
        }
    }
}
