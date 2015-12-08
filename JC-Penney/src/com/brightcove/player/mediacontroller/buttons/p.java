// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.widget.Button;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            LiveButtonController, h

class p
    implements EventListener
{

    final LiveButtonController a;

    private p(LiveButtonController livebuttoncontroller)
    {
        a = livebuttoncontroller;
        super();
    }

    p(LiveButtonController livebuttoncontroller, h h)
    {
        this(livebuttoncontroller);
    }

    public void processEvent(Event event)
    {
        int i = event.getIntegerProperty("playheadPosition");
        int j = a.c.getVideoDisplay().getTargetDuration();
        if (i > 0 && j > 0 && i > LiveButtonController.b(a) - j * 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = LiveButtonController.e(a);
        } else
        {
            i = LiveButtonController.f(a);
        }
        a.getButton().setTextColor(i);
    }
}
