// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.util.Log;
import android.view.Window;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.controller:
//            FullScreenController, g

class i
    implements EventListener
{

    final FullScreenController a;

    private i(FullScreenController fullscreencontroller)
    {
        a = fullscreencontroller;
        super();
    }

    i(FullScreenController fullscreencontroller, g g)
    {
        this(fullscreencontroller);
    }

    private void a()
    {
        FullScreenController.b(a, false);
        Object obj = FullScreenController.b(a).getAttributes();
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x400;
        FullScreenController.b(a).setAttributes(((android.view.WindowManager.LayoutParams) (obj)));
        obj = FullScreenController.c(a).getLayoutParams();
        FullScreenController.a(a, Integer.valueOf(((android.view.ViewGroup.LayoutParams) (obj)).width));
        FullScreenController.b(a, Integer.valueOf(((android.view.ViewGroup.LayoutParams) (obj)).height));
        Log.v(FullScreenController.a(), String.format("Saving normal screen size: %dx%d.", new Object[] {
            FullScreenController.d(a), FullScreenController.e(a)
        }));
        obj.width = -1;
        obj.height = -1;
        FullScreenController.c(a).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }

    public void processEvent(Event event)
    {
        a();
        FullScreenController.a(a).emit("didEnterFullScreen");
    }
}
