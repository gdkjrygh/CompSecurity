// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveClosedCaptioningView

final class a
    implements EventListener
{

    private BrightcoveClosedCaptioningView a;

    public final void processEvent(Event event)
    {
        if (((Boolean)event.properties.get("boolean")).booleanValue())
        {
            a.setMode(osedCaptioningMode.ON);
            a.setVisibility(0);
            a.bringToFront();
            if (!a.b.isEmpty())
            {
                a.a();
            }
            return;
        } else
        {
            a.setMode(osedCaptioningMode.OFF);
            a.setVisibility(8);
            a.b();
            return;
        }
    }

    osedCaptioningMode(BrightcoveClosedCaptioningView brightcoveclosedcaptioningview)
    {
        a = brightcoveclosedcaptioningview;
        super();
    }
}
