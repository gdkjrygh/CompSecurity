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
        FullScreenController.b(a, false);
        event = FullScreenController.b(a).getAttributes();
        event.flags = ((android.view.ams) (event)).flags | 0x400;
        FullScreenController.b(a).setAttributes(event);
        event = FullScreenController.c(a).getLayoutParams();
        FullScreenController.a(a, Integer.valueOf(((android.view.lScreenController.a.a) (event)).width));
        FullScreenController.b(a, Integer.valueOf(((android.view.lScreenController.a.a) (event)).height));
        FullScreenController.a();
        String.format("Saving normal screen size: %dx%d.", new Object[] {
            FullScreenController.d(a), FullScreenController.e(a)
        });
        event.width = -1;
        event.height = -1;
        FullScreenController.c(a).setLayoutParams(event);
        FullScreenController.a(a).emit("didEnterFullScreen");
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
