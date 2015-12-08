// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.brightcove.player.controller.BrightcoveClosedCaptioningController;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.mediacontroller.BrightcoveControlBar;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            AbstractButtonController, ButtonState

public class CaptionsButtonController extends AbstractButtonController
{
    final class a
        implements android.view.View.OnClickListener
    {

        final CaptionsButtonController a;

        public final void onClick(View view)
        {
            CaptionsButtonController.a();
            if (a.c.isPlaying())
            {
                a.c.pause();
                CaptionsButtonController.a(a, CaptionsButtonController.c(a).once("captionsDialogOk", new EventListener(this) {

                    private a a;

                    public final void processEvent(Event event)
                    {
                        a.a.c.start();
                        CaptionsButtonController.b(a.a).off("captionsDialogSettings", CaptionsButtonController.a(a.a));
                    }

            
            {
                a = a1;
                super();
            }
                }));
                CaptionsButtonController.b(a, CaptionsButtonController.l(a).once("captionsDialogSettings", new EventListener(this) {

                    final a a;

                    public final void processEvent(Event event)
                    {
                        CaptionsButtonController.c(a.a, CaptionsButtonController.f(a.a).once("activityResumed", new EventListener(this) {

                            private a._cls2 a;

                            public final void processEvent(Event event)
                            {
                                a.a.a.c.start();
                                CaptionsButtonController.e(a.a.a).off("fragmentResumed", CaptionsButtonController.d(a.a.a));
                            }

            
            {
                a = _pcls2;
                super();
            }
                        }));
                        CaptionsButtonController.d(a.a, CaptionsButtonController.i(a.a).once("fragmentResumed", new EventListener(this) {

                            private a._cls2 a;

                            public final void processEvent(Event event)
                            {
                                a.a.a.c.start();
                                CaptionsButtonController.h(a.a.a).off("activityResumed", CaptionsButtonController.g(a.a.a));
                            }

            
            {
                a = _pcls2;
                super();
            }
                        }));
                        CaptionsButtonController.k(a.a).off("captionsDialogOk", CaptionsButtonController.j(a.a));
                    }

            
            {
                a = a1;
                super();
            }
                }));
            }
            a.c.getClosedCaptioningController().showCaptionsDialog();
        }

        private a()
        {
            a = CaptionsButtonController.this;
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

        private CaptionsButtonController a;

        public final void processEvent(Event event)
        {
            event = ((Event) (event.properties.get("boolean")));
            CaptionsButtonController captionsbuttoncontroller = a;
            boolean flag;
            if (event != null && (event instanceof Boolean))
            {
                flag = ((Boolean)event).booleanValue();
            } else
            {
                flag = false;
            }
            CaptionsButtonController.a(captionsbuttoncontroller, flag);
            a.getButton().setVisibility(a.getVisibilityState());
        }

        private b()
        {
            a = CaptionsButtonController.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final String d = com/brightcove/player/mediacontroller/buttons/CaptionsButtonController.getSimpleName();
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;

    public CaptionsButtonController(Context context, BaseVideoView basevideoview, BrightcoveControlBar brightcovecontrolbar, Typeface typeface, Bundle bundle)
    {
        super(context, basevideoview, brightcovecontrolbar, com.brightcove.player.R.id.captions, typeface);
        basevideoview = new a((byte)0);
        brightcovecontrolbar = brightcovecontrolbar.getImage(BrightcoveControlBar.CLOSED_CAPTIONS_IMAGE);
        b.add(new ButtonState(context, com.brightcove.player.R.string.brightcove_controls_captions, com.brightcove.player.R.string.desc_captions, brightcovecontrolbar, basevideoview));
        addListener("captionsAvailable", new b((byte)0));
        boolean flag;
        if (bundle != null && bundle.containsKey("captionsState"))
        {
            flag = bundle.getBoolean("captionsState");
        } else
        {
            flag = false;
        }
        e = flag;
    }

    static int a(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.g;
    }

    static int a(CaptionsButtonController captionsbuttoncontroller, int i1)
    {
        captionsbuttoncontroller.f = i1;
        return i1;
    }

    static String a()
    {
        return d;
    }

    static boolean a(CaptionsButtonController captionsbuttoncontroller, boolean flag)
    {
        captionsbuttoncontroller.e = flag;
        return flag;
    }

    static int b(CaptionsButtonController captionsbuttoncontroller, int i1)
    {
        captionsbuttoncontroller.g = i1;
        return i1;
    }

    static EventEmitter b(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.eventEmitter;
    }

    static int c(CaptionsButtonController captionsbuttoncontroller, int i1)
    {
        captionsbuttoncontroller.h = i1;
        return i1;
    }

    static EventEmitter c(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.eventEmitter;
    }

    static int d(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.i;
    }

    static int d(CaptionsButtonController captionsbuttoncontroller, int i1)
    {
        captionsbuttoncontroller.i = i1;
        return i1;
    }

    static EventEmitter e(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.eventEmitter;
    }

    static EventEmitter f(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.eventEmitter;
    }

    static int g(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.h;
    }

    static EventEmitter h(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.eventEmitter;
    }

    static EventEmitter i(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.eventEmitter;
    }

    static int j(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.f;
    }

    static EventEmitter k(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.eventEmitter;
    }

    static EventEmitter l(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.eventEmitter;
    }

    public int getManagedState()
    {
        return 0;
    }

    public int getVisibilityState()
    {
        return !e ? 8 : 0;
    }

}
