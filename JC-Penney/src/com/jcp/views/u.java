// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.widget.ProgressBar;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.jcp.e.q;

// Referenced classes of package com.jcp.views:
//            JcpBrightcoveVideoView

class u
    implements EventListener
{

    final q a;
    final JcpBrightcoveVideoView b;

    u(JcpBrightcoveVideoView jcpbrightcovevideoview, q q1)
    {
        b = jcpbrightcovevideoview;
        a = q1;
        super();
    }

    public void processEvent(Event event)
    {
        if (JcpBrightcoveVideoView.a(b) != null && JcpBrightcoveVideoView.a(b).getVisibility() == 0)
        {
            JcpBrightcoveVideoView.a(b).setVisibility(8);
        }
        a.a(b.getCurrentVideo(), b.getCurrentPosition(), event);
    }
}
