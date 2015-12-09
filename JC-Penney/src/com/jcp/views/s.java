// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.jcp.e.q;

// Referenced classes of package com.jcp.views:
//            JcpBrightcoveVideoView

class s
    implements EventListener
{

    final q a;
    final JcpBrightcoveVideoView b;

    s(JcpBrightcoveVideoView jcpbrightcovevideoview, q q1)
    {
        b = jcpbrightcovevideoview;
        a = q1;
        super();
    }

    public void processEvent(Event event)
    {
        a.a(b.getCurrentPosition(), event);
    }
}
