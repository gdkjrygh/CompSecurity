// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveSeekBarController, BrightcoveSeekBar, j

class l
    implements EventListener
{

    final BrightcoveSeekBarController a;

    private l(BrightcoveSeekBarController brightcoveseekbarcontroller)
    {
        a = brightcoveseekbarcontroller;
        super();
    }

    l(BrightcoveSeekBarController brightcoveseekbarcontroller, j j)
    {
        this(brightcoveseekbarcontroller);
    }

    public void processEvent(Event event)
    {
        Log.d(BrightcoveSeekBarController.a(), String.format("Processing event: %s.", new Object[] {
            event.getType()
        }));
        int i = event.getIntegerProperty("duration");
        if (i != -1)
        {
            BrightcoveSeekBarController.a(a).setMax(i);
        }
    }
}
