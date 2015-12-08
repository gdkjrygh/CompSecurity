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

class i
    implements EventListener
{

    final BrightcoveMediaController a;

    private i(BrightcoveMediaController brightcovemediacontroller)
    {
        a = brightcovemediacontroller;
        super();
    }

    i(BrightcoveMediaController brightcovemediacontroller, a a1)
    {
        this(brightcovemediacontroller);
    }

    public void processEvent(Event event)
    {
        int j = event.getIntegerProperty("duration");
        if (j > -1)
        {
            Log.d(BrightcoveMediaController.a(), String.format("Setting seekbar max to %s from event: %s.", new Object[] {
                Integer.valueOf(j), event.getType()
            }));
            BrightcoveMediaController.f(a).setMax(j);
            BrightcoveMediaController.g(a).setText(StringUtil.stringForTime(j));
        }
    }
}
