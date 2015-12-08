// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveMediaController, BrightcoveSeekBar

final class <init>
    implements EventListener
{

    private BrightcoveMediaController a;

    public final void processEvent(Event event)
    {
        int i = event.getIntegerProperty("percentComplete");
        if (i != -1)
        {
            BrightcoveMediaController.f(a).setSecondaryProgress((i * BrightcoveMediaController.f(a).getMax()) / 100);
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
