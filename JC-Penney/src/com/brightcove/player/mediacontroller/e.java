// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.os.Bundle;
import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.mediacontroller.buttons.ButtonController;
import com.brightcove.player.view.BaseVideoView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveMediaController, BrightcoveShowHideController, BrightcoveSeekBarController, BrightcoveMediaControlRegistry, 
//            a

class e
    implements EventListener
{

    final BrightcoveMediaController a;

    private e(BrightcoveMediaController brightcovemediacontroller)
    {
        a = brightcovemediacontroller;
        super();
    }

    e(BrightcoveMediaController brightcovemediacontroller, a a1)
    {
        this(brightcovemediacontroller);
    }

    public void processEvent(Event event)
    {
        Log.d(BrightcoveMediaController.a(), String.format("Processing a %s event...", new Object[] {
            event.getType()
        }));
        BrightcoveMediaController.a(a).removeListeners();
        BrightcoveMediaController.b(a).removeListeners();
        for (Iterator iterator = BrightcoveMediaController.c(a).getButtonControllers().iterator(); iterator.hasNext(); ((ButtonController)iterator.next()).removeListeners()) { }
        BrightcoveMediaController.a(a, event);
        BrightcoveMediaController.b(a, event);
        BrightcoveMediaController.e(a).removeView(BrightcoveMediaController.d(a));
        event = ((Event) (event.properties.get("instanceState")));
        if (event != null && (event instanceof Bundle))
        {
            event = (Bundle)event;
        } else
        {
            event = null;
        }
        BrightcoveMediaController.b(a, event);
    }
}
