// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            PlayButtonController, r

class t
    implements EventListener
{

    final PlayButtonController a;

    private t(PlayButtonController playbuttoncontroller)
    {
        a = playbuttoncontroller;
        super();
    }

    t(PlayButtonController playbuttoncontroller, r r)
    {
        this(playbuttoncontroller);
    }

    public void processEvent(Event event)
    {
        Log.d(PlayButtonController.a(), String.format("Process event: %s.", new Object[] {
            event.getType()
        }));
        a.syncStates();
    }
}
