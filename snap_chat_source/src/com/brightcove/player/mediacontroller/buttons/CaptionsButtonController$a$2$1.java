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
        a.a.a.c.start();
        CaptionsButtonController.e(a.a.a).off("fragmentResumed", CaptionsButtonController.d(a.a.a));
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/brightcove/player/mediacontroller/buttons/CaptionsButtonController$a$2

/* anonymous class */
    final class CaptionsButtonController.a._cls2
        implements EventListener
    {

        final CaptionsButtonController.a a;

        public final void processEvent(Event event)
        {
            CaptionsButtonController.c(a.a, CaptionsButtonController.f(a.a).once("activityResumed", new CaptionsButtonController.a._cls2._cls1(this)));
            CaptionsButtonController.d(a.a, CaptionsButtonController.i(a.a).once("fragmentResumed", new CaptionsButtonController.a._cls2._cls2()));
            CaptionsButtonController.k(a.a).off("captionsDialogOk", CaptionsButtonController.j(a.a));
        }

            
            {
                a = a1;
                super();
            }

        // Unreferenced inner class com/brightcove/player/mediacontroller/buttons/CaptionsButtonController$a$2$2

/* anonymous class */
        final class CaptionsButtonController.a._cls2._cls2
            implements EventListener
        {

            private CaptionsButtonController.a._cls2 a;

            public final void processEvent(Event event)
            {
                a.a.a.c.start();
                CaptionsButtonController.h(a.a.a).off("activityResumed", CaptionsButtonController.g(a.a.a));
            }

                    
                    {
                        a = CaptionsButtonController.a._cls2.this;
                        super();
                    }
        }

    }

}
