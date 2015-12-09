// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.util.Log;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.util.StringUtil;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveMediaController, BrightcoveSeekBar, a

class f
    implements EventListener
{

    final BrightcoveMediaController a;

    private f(BrightcoveMediaController brightcovemediacontroller)
    {
        a = brightcovemediacontroller;
        super();
    }

    f(BrightcoveMediaController brightcovemediacontroller, a a1)
    {
        this(brightcovemediacontroller);
    }

    public void processEvent(Event event)
    {
        if (!a.isDragging())
        {
            Log.d(BrightcoveMediaController.a(), "Progress event updates are being applied.");
            int k = event.getIntegerProperty("duration");
            int l = event.getIntegerProperty("maxPosition");
            int j = Math.max(k, l);
            int i = j;
            if (j < 0)
            {
                i = 0;
            }
            j = BrightcoveMediaController.f(a).getMax();
            Log.d(BrightcoveMediaController.a(), String.format("videoDuration: %1$d, maxPosition: %2$d, duration: %3$d, currentMax: %4$d.", new Object[] {
                Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i), Integer.valueOf(j)
            }));
            if (i > j)
            {
                Log.d(BrightcoveMediaController.a(), "Updating the seek bar max and the control bar end_time properties.");
                BrightcoveMediaController.f(a).setMax(i);
                BrightcoveMediaController.g(a).setText(StringUtil.stringForTime(i));
            }
            i = event.getIntegerProperty("playheadPosition");
            Log.d(BrightcoveMediaController.a(), String.format("position: %1$d.", new Object[] {
                Integer.valueOf(i)
            }));
            BrightcoveMediaController.f(a).setProgress(i);
            BrightcoveMediaController.h(a).setText(StringUtil.stringForTime(i));
            return;
        } else
        {
            Log.d(BrightcoveMediaController.a(), "The seek bar is being dragged.  No progress updates are being applied.");
            return;
        }
    }
}
