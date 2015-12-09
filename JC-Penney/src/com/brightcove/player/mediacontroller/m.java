// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveSeekBarController, BrightcoveSeekBar, j

class m
    implements EventListener
{

    final BrightcoveSeekBarController a;

    private m(BrightcoveSeekBarController brightcoveseekbarcontroller)
    {
        a = brightcoveseekbarcontroller;
        super();
    }

    m(BrightcoveSeekBarController brightcoveseekbarcontroller, j j)
    {
        this(brightcoveseekbarcontroller);
    }

    public void processEvent(Event event)
    {
        BrightcoveSeekBarController.a(a).setVisibility(4);
    }
}
