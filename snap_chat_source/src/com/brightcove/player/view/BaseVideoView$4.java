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

    final BaseVideoView a;

    public final void processEvent(Event event)
    {
        if (BaseVideoView.a(a) != null)
        {
            BaseVideoView.a(a).c();
            a.a.once("progress", new EventListener() {

                private BaseVideoView._cls4 a;

                public final void processEvent(Event event1)
                {
                    BaseVideoView.b(a.a);
                }

            
            {
                a = BaseVideoView._cls4.this;
                super();
            }
            });
        }
    }

    _cls1.a(BaseVideoView basevideoview)
    {
        a = basevideoview;
        super();
    }
}
