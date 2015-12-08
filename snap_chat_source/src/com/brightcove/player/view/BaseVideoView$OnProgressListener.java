// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView

public class a
    implements EventListener
{

    private BaseVideoView a;

    public void processEvent(Event event)
    {
        if (a.isPlaying())
        {
            int i = event.getIntegerProperty("duration");
            if (i >= 0 && i != a.c)
            {
                BaseVideoView.e();
                String.format("Changing duration to %d.", new Object[] {
                    Integer.valueOf(i)
                });
                a.c = i;
                if (BaseVideoView.a(a) instanceof a)
                {
                    BaseVideoView.b(a);
                }
            }
            i = event.getIntegerProperty("playheadPosition");
            if (i >= 0 && i != a.d)
            {
                BaseVideoView.e();
                String.format("Changing playheadPosition to %d.", new Object[] {
                    Integer.valueOf(i)
                });
                a.d = i;
            }
        }
    }

    protected A(BaseVideoView basevideoview)
    {
        a = basevideoview;
        super();
    }
}
