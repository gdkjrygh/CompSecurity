// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveClosedCaptioningView

class aa
    implements EventListener
{

    final BrightcoveClosedCaptioningView a;

    aa(BrightcoveClosedCaptioningView brightcoveclosedcaptioningview)
    {
        a = brightcoveclosedcaptioningview;
        super();
    }

    public void processEvent(Event event)
    {
        int i = a.getSafeAreaMarginWidth();
        int j = a.getSafeAreaMarginHeight();
        int k = event.getIntegerProperty("controlsHeight");
        if (k != -1)
        {
            a.setPadding(i, j, i, k + j);
        }
    }
}
