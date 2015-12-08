// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

final class <init>
    implements EventListener
{

    final VideoDisplayComponent a;

    public final void processEvent(Event event)
    {
        if (a.l != null)
        {
            event = UUID.randomUUID();
            VideoDisplayComponent.p(a).once("willChangeVideo", new EventListener(event) {

                final VideoDisplayComponent.a a;
                private UUID b;

                public final void processEvent(Event event1)
                {
                    VideoDisplayComponent.b();
                    if (event1.properties.get("uuid").equals(b))
                    {
                        a.a.a();
                        VideoDisplayComponent.b();
                        (new StringBuilder("OnCompletedListener: currentSource = ")).append(a.a.j).append(", nextSource = ").append(a.a.l);
                        a.a.i = a.a.k;
                        a.a.k = null;
                        a.a.j = a.a.l;
                        a.a.l = null;
                        VideoDisplayComponent.o(a.a).once("didSetSource", new EventListener(this) {

                            private _cls1 a;

                            public final void processEvent(Event event)
                            {
                                VideoDisplayComponent.n(a.a.a).emit("play");
                            }

            
            {
                a = _pcls1;
                super();
            }
                        });
                        a.a.a(a.a.i, a.a.j);
                    }
                }

            
            {
                a = VideoDisplayComponent.a.this;
                b = uuid;
                super();
            }
            });
            HashMap hashmap = new HashMap();
            hashmap.put("currentVideo", a.i);
            hashmap.put("nextVideo", a.k);
            hashmap.put("uuid", event);
            VideoDisplayComponent.q(a).emit("willChangeVideo", hashmap);
        }
    }

    private _cls1.b(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    a(VideoDisplayComponent videodisplaycomponent, byte byte0)
    {
        this(videodisplaycomponent);
    }
}
