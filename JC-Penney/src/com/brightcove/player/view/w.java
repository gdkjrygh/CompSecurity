// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveClosedCaptioningView

class w
    implements EventListener
{

    final BrightcoveClosedCaptioningView a;

    w(BrightcoveClosedCaptioningView brightcoveclosedcaptioningview)
    {
        a = brightcoveclosedcaptioningview;
        super();
    }

    public void processEvent(Event event)
    {
        int j = event.getIntegerProperty("originalPlayheadPosition");
        int i = j;
        if (j == -1)
        {
            i = event.getIntegerProperty("playheadPosition");
        }
        a.a(i);
    }
}
