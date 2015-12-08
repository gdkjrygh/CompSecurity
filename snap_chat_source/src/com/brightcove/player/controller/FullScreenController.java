// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.app.ActionBar;
import android.app.Activity;
import android.util.Log;
import android.view.Window;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.BaseVideoView;

public final class FullScreenController
{
    final class a
        implements EventListener
    {

        private FullScreenController a;

        public final void processEvent(Event event)
        {
            FullScreenController.b(a, false);
            event = FullScreenController.b(a).getAttributes();
            event.flags = ((android.view.WindowManager.LayoutParams) (event)).flags | 0x400;
            FullScreenController.b(a).setAttributes(event);
            event = FullScreenController.c(a).getLayoutParams();
            FullScreenController.a(a, Integer.valueOf(((android.view.ViewGroup.LayoutParams) (event)).width));
            FullScreenController.b(a, Integer.valueOf(((android.view.ViewGroup.LayoutParams) (event)).height));
            FullScreenController.a();
            String.format("Saving normal screen size: %dx%d.", new Object[] {
                FullScreenController.d(a), FullScreenController.e(a)
            });
            event.width = -1;
            event.height = -1;
            FullScreenController.c(a).setLayoutParams(event);
            FullScreenController.a(a).emit("didEnterFullScreen");
        }

        private a()
        {
            a = FullScreenController.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
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
                event.flags = ((android.view.WindowManager.LayoutParams) (event)).flags ^ 0x400;
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

        private b()
        {
            a = FullScreenController.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


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
            String s = a;
            EventEmitter eventemitter = e;
            StringBuilder stringbuilder = new StringBuilder("Aborting because ");
            if (basevideoview == null && eventemitter != null)
            {
                stringbuilder.append("the video view context is invalid (not an Activity)");
            } else
            if (basevideoview != null && eventemitter == null)
            {
                stringbuilder.append("the event emitter is invalid, it is null");
            } else
            {
                stringbuilder.append("both the video view context is invalid (not an Activity) and the event emitter is invalid, it is null");
            }
            stringbuilder.append(".");
            Log.wtf(s, stringbuilder.toString());
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
        e.on("enterFullScreen", new a((byte)0));
        e.on("exitFullScreen", new b((byte)0));
        e.on("didEnterFullScreen", new EventListener() {

            private FullScreenController a;

            public final void processEvent(Event event)
            {
                FullScreenController.a(a, true);
            }

            
            {
                a = FullScreenController.this;
                super();
            }
        });
        e.on("didExitFullScreen", new EventListener() {

            private FullScreenController a;

            public final void processEvent(Event event)
            {
                FullScreenController.a(a, false);
            }

            
            {
                a = FullScreenController.this;
                super();
            }
        });
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
label0:
        {
            if (fullscreencontroller.b != null)
            {
                if (!flag)
                {
                    break label0;
                }
                fullscreencontroller.b.show();
            }
            return;
        }
        fullscreencontroller.b.hide();
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

    public final boolean isFullScreen()
    {
        return f;
    }

}
