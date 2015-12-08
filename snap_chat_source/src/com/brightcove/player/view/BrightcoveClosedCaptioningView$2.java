// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.brightcove.player.captioning.BrightcoveClosedCaption;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveClosedCaptioningView

final class a
    implements EventListener
{

    private BrightcoveClosedCaptioningView a;

    public final void processEvent(Event event)
    {
        if (a.isEnabled() && a.getMode() == osedCaptioningMode.ON)
        {
            if (a.c != null)
            {
                a.c.setVisibility(8);
            }
            event = event.properties;
            if (event.containsKey("text"))
            {
                event = new BrightcoveClosedCaption(((Integer)event.get("position")).intValue(), -1, (String)event.get("text"));
                event = a.a(event);
                if (event != null)
                {
                    if (a.c != null)
                    {
                        a.c.setVisibility(8);
                    }
                    a.a(event);
                    a.addView(event);
                    event.setVisibility(0);
                    event.invalidate();
                }
                a.c = (LinearLayout)event;
            }
        }
    }

    osedCaptioningMode(BrightcoveClosedCaptioningView brightcoveclosedcaptioningview)
    {
        a = brightcoveclosedcaptioningview;
        super();
    }
}
