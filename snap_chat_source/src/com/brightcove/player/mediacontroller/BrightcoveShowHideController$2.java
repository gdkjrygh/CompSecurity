// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveShowHideController

final class a
    implements EventListener
{

    private BrightcoveShowHideController a;

    public final void processEvent(Event event)
    {
        a.show();
    }

    (BrightcoveShowHideController brightcoveshowhidecontroller)
    {
        a = brightcoveshowhidecontroller;
        super();
    }
}
