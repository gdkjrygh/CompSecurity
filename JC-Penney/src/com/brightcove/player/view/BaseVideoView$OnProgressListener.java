// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView, s

public class a
    implements EventListener
{

    final BaseVideoView a;

    public void processEvent(Event event)
    {
        if (a.isPlaying())
        {
            int i = event.getIntegerProperty("duration");
            if (i > -1 && i != a.g)
            {
                Log.v(BaseVideoView.g(), String.format("Changing duration to %d.", new Object[] {
                    Integer.valueOf(i)
                }));
                a.g = i;
                if (BaseVideoView.a(a) instanceof s)
                {
                    BaseVideoView.b(a);
                }
            }
            i = event.getIntegerProperty("playheadPosition");
            if (i > -1 && i != a.h)
            {
                Log.v(BaseVideoView.g(), String.format("Changing playheadPosition to %d.", new Object[] {
                    Integer.valueOf(i)
                }));
                a.h = i;
            }
        }
    }

    protected A(BaseVideoView basevideoview)
    {
        a = basevideoview;
        super();
    }
}
