// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveClosedCaptioningView

class z
    implements EventListener
{

    final BrightcoveClosedCaptioningView a;

    z(BrightcoveClosedCaptioningView brightcoveclosedcaptioningview)
    {
        a = brightcoveclosedcaptioningview;
        super();
    }

    public void processEvent(Event event)
    {
        if (((Boolean)event.properties.get("boolean")).booleanValue())
        {
            a.setMode(BrightcoveClosedCaptioningView.ClosedCaptioningMode.ON);
            a.setVisibility(0);
            a.bringToFront();
            a.a();
            return;
        } else
        {
            a.setMode(BrightcoveClosedCaptioningView.ClosedCaptioningMode.OFF);
            a.setVisibility(8);
            a.b();
            return;
        }
    }
}
