// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.widget.LinearLayout;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveClosedCaptioningView

final class a
    implements EventListener
{

    private BrightcoveClosedCaptioningView a;

    public final void processEvent(Event event)
    {
        if (a.c != null)
        {
            a.c.setVisibility(8);
        }
    }

    A(BrightcoveClosedCaptioningView brightcoveclosedcaptioningview)
    {
        a = brightcoveclosedcaptioningview;
        super();
    }
}
