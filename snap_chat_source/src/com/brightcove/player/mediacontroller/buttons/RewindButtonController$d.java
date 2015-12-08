// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.widget.Button;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            RewindButtonController

final class <init>
    implements EventListener
{

    private RewindButtonController a;

    public final void processEvent(Event event)
    {
        a.getButton().setVisibility(0);
    }

    private (RewindButtonController rewindbuttoncontroller)
    {
        a = rewindbuttoncontroller;
        super();
    }

    a(RewindButtonController rewindbuttoncontroller, byte byte0)
    {
        this(rewindbuttoncontroller);
    }
}
