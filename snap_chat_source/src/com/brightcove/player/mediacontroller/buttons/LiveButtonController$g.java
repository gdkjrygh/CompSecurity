// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.widget.Button;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            LiveButtonController

final class <init>
    implements EventListener
{

    private LiveButtonController a;

    public final void processEvent(Event event)
    {
        int j = event.getIntegerProperty("playheadPosition");
        int k = event.getIntegerProperty("segmentDuration");
        int i;
        if (j > 0 && k > 0 && j > LiveButtonController.b(a) - k * 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        LiveButtonController.a();
        if (i != 0)
        {
            event = "live";
        } else
        {
            event = "not live";
        }
        String.format("The video is %1$s, playhead position is %2$d, segmentDuration is %3$d.", new Object[] {
            event, Integer.valueOf(j), Integer.valueOf(k)
        });
        if (i != 0)
        {
            i = LiveButtonController.e(a);
        } else
        {
            i = LiveButtonController.f(a);
        }
        a.getButton().setTextColor(i);
    }

    private (LiveButtonController livebuttoncontroller)
    {
        a = livebuttoncontroller;
        super();
    }

    a(LiveButtonController livebuttoncontroller, byte byte0)
    {
        this(livebuttoncontroller);
    }
}
