// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.util.StringUtil;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveMediaController, BrightcoveSeekBar

final class <init>
    implements EventListener
{

    private BrightcoveMediaController a;

    public final void processEvent(Event event)
    {
        if (!a.isDragging())
        {
            int k = event.getIntegerProperty("duration");
            int l = event.getIntegerProperty("maxPosition");
            int i1 = event.getIntegerProperty("minPosition");
            int j = Math.max(k, l);
            int i = j;
            if (j < 0)
            {
                i = 0;
            }
            j = BrightcoveMediaController.f(a).getMax();
            BrightcoveMediaController.a();
            String.format("ProgressHandler: videoDuration = %1$d, maxPosition = %2$d, minDuration = %3$d, currentMax = %4$d.", new Object[] {
                Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1), Integer.valueOf(j)
            });
            if (i > j)
            {
                BrightcoveMediaController.a();
                BrightcoveMediaController.f(a).setMax(i);
                BrightcoveMediaController.g(a).setText(StringUtil.stringForTime(i));
            }
            i = event.getIntegerProperty("playheadPosition");
            BrightcoveMediaController.a();
            String.format("position: %1$d.", new Object[] {
                Integer.valueOf(i)
            });
            BrightcoveMediaController.f(a).setProgress(i);
            BrightcoveMediaController.h(a).setText(StringUtil.stringForTime(i));
            return;
        } else
        {
            BrightcoveMediaController.a();
            return;
        }
    }

    private (BrightcoveMediaController brightcovemediacontroller)
    {
        a = brightcovemediacontroller;
        super();
    }

    a(BrightcoveMediaController brightcovemediacontroller, byte byte0)
    {
        this(brightcovemediacontroller);
    }
}
