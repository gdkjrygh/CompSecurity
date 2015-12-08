// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent, k, m

class l
    implements EventListener
{

    final UUID a;
    final k b;

    l(k k1, UUID uuid)
    {
        b = k1;
        a = uuid;
        super();
    }

    public void processEvent(Event event)
    {
        Log.v(VideoDisplayComponent.e(), "OnCompletedListener: WILL_CHANGE_VIDEO");
        if (event.properties.get("uuid").equals(a))
        {
            b.a.d();
            Log.v(VideoDisplayComponent.e(), (new StringBuilder()).append("OnCompletedListener: currentSource = ").append(b.a.l).append(", nextSource = ").append(b.a.n).toString());
            b.a.k = b.a.m;
            b.a.m = null;
            b.a.l = b.a.n;
            b.a.n = null;
            VideoDisplayComponent.o(b.a).once("didSetSource", new m(this));
            b.a.a(b.a.k, b.a.l);
        }
    }
}
