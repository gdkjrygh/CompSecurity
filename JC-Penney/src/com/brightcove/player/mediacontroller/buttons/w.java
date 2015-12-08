// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.widget.Button;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            RewindButtonController, u

class w
    implements EventListener
{

    final RewindButtonController a;

    private w(RewindButtonController rewindbuttoncontroller)
    {
        a = rewindbuttoncontroller;
        super();
    }

    w(RewindButtonController rewindbuttoncontroller, u u)
    {
        this(rewindbuttoncontroller);
    }

    public void processEvent(Event event)
    {
        a.getButton().setVisibility(4);
    }
}
