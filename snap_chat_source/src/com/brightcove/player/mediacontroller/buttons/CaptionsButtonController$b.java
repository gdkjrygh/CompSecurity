// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.widget.Button;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            CaptionsButtonController

final class <init>
    implements EventListener
{

    private CaptionsButtonController a;

    public final void processEvent(Event event)
    {
        event = ((Event) (event.properties.get("boolean")));
        CaptionsButtonController captionsbuttoncontroller = a;
        boolean flag;
        if (event != null && (event instanceof Boolean))
        {
            flag = ((Boolean)event).booleanValue();
        } else
        {
            flag = false;
        }
        CaptionsButtonController.a(captionsbuttoncontroller, flag);
        a.getButton().setVisibility(a.getVisibilityState());
    }

    private (CaptionsButtonController captionsbuttoncontroller)
    {
        a = captionsbuttoncontroller;
        super();
    }

    a(CaptionsButtonController captionsbuttoncontroller, byte byte0)
    {
        this(captionsbuttoncontroller);
    }
}
