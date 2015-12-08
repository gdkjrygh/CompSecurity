// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.widget.SeekBar;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.util.StringUtil;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            LiveButtonController

final class <init>
    implements EventListener
{

    private LiveButtonController a;

    public final void processEvent(Event event)
    {
        LiveButtonController.a();
        String.format("Processing event: %s.", new Object[] {
            event.getType()
        });
        int i = event.getIntegerProperty("duration");
        if (i > 0)
        {
            LiveButtonController.a();
            LiveButtonController.a(a, i);
            LiveButtonController.c(a).setMax(LiveButtonController.b(a));
            LiveButtonController.c(a).setProgress(LiveButtonController.b(a));
            LiveButtonController.d(a).setText(StringUtil.stringForTime(LiveButtonController.b(a)));
        }
        LiveButtonController.a();
        String.format("Current video duration: %1$d.", new Object[] {
            Integer.valueOf(LiveButtonController.b(a))
        });
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
