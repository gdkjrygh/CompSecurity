// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            CaptionsButtonController

final class a
    implements EventListener
{

    private a a;

    public final void processEvent(Event event)
    {
        a.a.c.start();
        CaptionsButtonController.b(a.a).off("captionsDialogSettings", CaptionsButtonController.a(a.a));
    }

    ( )
    {
        a = ;
        super();
    }
}
