// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.app.ActionBar;
import android.app.Activity;
import android.util.Log;
import android.view.Window;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.view.BaseVideoView;

// Referenced classes of package com.brightcove.player.controller:
//            i, j, g, h

public final class FullScreenController
{

    private static final String a = com/brightcove/player/controller/FullScreenController.getSimpleName();
    private ActionBar b;
    private Window c;
    private BaseVideoView d;
    private EventEmitter e;
    private boolean f;
    private Integer g;
    private Integer h;

    public FullScreenController(BaseVideoView basevideoview)
    {
        f = false;
        d = basevideoview;
        e = basevideoview.getEventEmitter();
        basevideoview = basevideoview.getContext();
        if (basevideoview instanceof Activity)
        {
            basevideoview = (Activity)basevideoview;
        } else
        {
            basevideoview = null;
        }
        if (basevideoview == null || e == null)
        {
            Log.wtf(a, a(basevideoview, e));
            return;
        }
        ActionBar actionbar;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            actionbar = basevideoview.getActionBar();
        } else
        {
            actionbar = null;
        }
        b = actionbar;
        c = basevideoview.getWindow();
        e.on("enterFullScreen", new i(this, null));
        e.on("exitFullScreen", new j(this, null));
        e.on("didEnterFullScreen", new g(this));
        e.on("didExitFullScreen", new h(this));
    }

    static EventEmitter a(FullScreenController fullscreencontroller)
    {
        return fullscreencontroller.e;
    }

    static Integer a(FullScreenController fullscreencontroller, Integer integer)
    {
        fullscreencontroller.g = integer;
        return integer;
    }

    static String a()
    {
        return a;
    }

    private String a(Activity activity, EventEmitter eventemitter)
    {
        StringBuilder stringbuilder = new StringBuilder("Aborting because ");
        if (activity == null && eventemitter != null)
        {
            stringbuilder.append("the video view context is invalid (not an Activity)");
        } else
        if (activity != null && eventemitter == null)
        {
            stringbuilder.append("the event emitter is invalid, it is null");
        } else
        {
            stringbuilder.append("both ").append("the video view context is invalid (not an Activity)").append(" and ").append("the event emitter is invalid, it is null");
        }
        stringbuilder.append(".");
        return stringbuilder.toString();
    }

    private void a(boolean flag)
    {
label0:
        {
            if (b != null)
            {
                if (!flag)
                {
                    break label0;
                }
                b.show();
            }
            return;
        }
        b.hide();
    }

    static boolean a(FullScreenController fullscreencontroller, boolean flag)
    {
        fullscreencontroller.f = flag;
        return flag;
    }

    static Window b(FullScreenController fullscreencontroller)
    {
        return fullscreencontroller.c;
    }

    static Integer b(FullScreenController fullscreencontroller, Integer integer)
    {
        fullscreencontroller.h = integer;
        return integer;
    }

    static void b(FullScreenController fullscreencontroller, boolean flag)
    {
        fullscreencontroller.a(flag);
    }

    static BaseVideoView c(FullScreenController fullscreencontroller)
    {
        return fullscreencontroller.d;
    }

    static Integer d(FullScreenController fullscreencontroller)
    {
        return fullscreencontroller.g;
    }

    static Integer e(FullScreenController fullscreencontroller)
    {
        return fullscreencontroller.h;
    }

    public boolean isFullScreen()
    {
        return f;
    }

}
