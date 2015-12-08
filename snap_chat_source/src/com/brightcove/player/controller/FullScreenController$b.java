// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.view.Window;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.controller:
//            FullScreenController

final class <init>
    implements EventListener
{

    private FullScreenController a;

    public final void processEvent(Event event)
    {
        FullScreenController.a();
        (new StringBuilder("Back to normal screen: ")).append(FullScreenController.d(a)).append("x").append(FullScreenController.e(a));
        if (FullScreenController.d(a) != null && FullScreenController.e(a) != null)
        {
            FullScreenController.b(a, true);
            event = FullScreenController.b(a).getAttributes();
            event.flags = ((android.view.ams) (event)).flags ^ 0x400;
            FullScreenController.b(a).setAttributes(event);
            event = FullScreenController.c(a).getLayoutParams();
            event.width = FullScreenController.d(a).intValue();
            event.height = FullScreenController.e(a).intValue();
            FullScreenController.c(a).setLayoutParams(event);
            FullScreenController.a(a, null);
            FullScreenController.b(a, null);
        }
        FullScreenController.a(a).emit("didExitFullScreen");
    }

    private (FullScreenController fullscreencontroller)
    {
        a = fullscreencontroller;
        super();
    }

    a(FullScreenController fullscreencontroller, byte byte0)
    {
        this(fullscreencontroller);
    }
}
