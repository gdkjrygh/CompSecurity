// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

final class a
    implements EventListener
{

    private a a;

    public final void processEvent(Event event)
    {
        VideoDisplayComponent.n(a.a.a).emit("play");
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/brightcove/player/display/VideoDisplayComponent$a$1

/* anonymous class */
    final class VideoDisplayComponent.a._cls1
        implements EventListener
    {

        final VideoDisplayComponent.a a;
        private UUID b;

        public final void processEvent(Event event)
        {
            VideoDisplayComponent.b();
            if (event.properties.get("uuid").equals(b))
            {
                a.a.a();
                VideoDisplayComponent.b();
                (new StringBuilder("OnCompletedListener: currentSource = ")).append(a.a.j).append(", nextSource = ").append(a.a.l);
                a.a.i = a.a.k;
                a.a.k = null;
                a.a.j = a.a.l;
                a.a.l = null;
                VideoDisplayComponent.o(a.a).once("didSetSource", new VideoDisplayComponent.a._cls1._cls1(this));
                a.a.a(a.a.i, a.a.j);
            }
        }

            
            {
                a = a1;
                b = uuid;
                super();
            }
    }

}
