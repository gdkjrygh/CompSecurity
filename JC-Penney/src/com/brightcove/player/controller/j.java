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

class j
    implements EventListener
{

    final FullScreenController a;

    private j(FullScreenController fullscreencontroller)
    {
        a = fullscreencontroller;
        super();
    }

    j(FullScreenController fullscreencontroller, g g)
    {
        this(fullscreencontroller);
    }

    private void a()
    {
        Log.v(FullScreenController.a(), (new StringBuilder()).append("Back to normal screen: ").append(FullScreenController.d(a)).append("x").append(FullScreenController.e(a)).toString());
        if (FullScreenController.d(a) != null && FullScreenController.e(a) != null)
        {
            FullScreenController.b(a, true);
            Object obj = FullScreenController.b(a).getAttributes();
            obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags ^ 0x400;
            FullScreenController.b(a).setAttributes(((android.view.WindowManager.LayoutParams) (obj)));
            obj = FullScreenController.c(a).getLayoutParams();
            obj.width = FullScreenController.d(a).intValue();
            obj.height = FullScreenController.e(a).intValue();
            FullScreenController.c(a).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            FullScreenController.a(a, null);
            FullScreenController.b(a, null);
        }
    }

    public void processEvent(Event event)
    {
        a();
        FullScreenController.a(a).emit("didExitFullScreen");
    }
}
