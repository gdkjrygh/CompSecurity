// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView

final class a
    implements EventListener
{

    private BaseVideoView a;

    public final void processEvent(Event event)
    {
        if (BaseVideoView.h(a) != null)
        {
            BaseVideoView.h(a).onCompletion(null);
        }
        a.d = 0;
        BaseVideoView.a(a, false);
    }

    er(BaseVideoView basevideoview)
    {
        a = basevideoview;
        super();
    }
}
