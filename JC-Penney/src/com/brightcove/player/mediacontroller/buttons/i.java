// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.util.StringUtil;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            LiveButtonController, h

class i
    implements EventListener
{

    final LiveButtonController a;

    private i(LiveButtonController livebuttoncontroller)
    {
        a = livebuttoncontroller;
        super();
    }

    i(LiveButtonController livebuttoncontroller, h h)
    {
        this(livebuttoncontroller);
    }

    public void processEvent(Event event)
    {
        Log.d(LiveButtonController.a(), String.format("Processing event: %s.", new Object[] {
            event.getType()
        }));
        int j = event.getIntegerProperty("duration");
        if (j > 0)
        {
            LiveButtonController.a(a, j);
            if (LiveButtonController.a(a))
            {
                Log.d(LiveButtonController.a(), "Updating seek bar...");
                LiveButtonController.c(a).setMax(LiveButtonController.b(a));
                LiveButtonController.c(a).setProgress(LiveButtonController.b(a));
                LiveButtonController.d(a).setText(StringUtil.stringForTime(LiveButtonController.b(a)));
            }
        }
        Log.d(LiveButtonController.a(), String.format("Current video duration: %1$d.", new Object[] {
            Integer.valueOf(LiveButtonController.b(a))
        }));
    }
}
