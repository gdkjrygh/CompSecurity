// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView

final class a
    implements EventListener
{

    private a a;

    public final void processEvent(Event event)
    {
        BaseVideoView.b(a.a);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/brightcove/player/view/BaseVideoView$4

/* anonymous class */
    final class BaseVideoView._cls4
        implements EventListener
    {

        final BaseVideoView a;

        public final void processEvent(Event event)
        {
            if (BaseVideoView.a(a) != null)
            {
                BaseVideoView.a(a).c();
                a.a.once("progress", new BaseVideoView._cls4._cls1(this));
            }
        }

            
            {
                a = basevideoview;
                super();
            }
    }

}
