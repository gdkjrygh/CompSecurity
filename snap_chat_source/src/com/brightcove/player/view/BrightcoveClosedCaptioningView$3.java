// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

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
        int j = event.getIntegerProperty("originalPlayheadPosition");
        int i = j;
        if (j == -1)
        {
            i = event.getIntegerProperty("playheadPosition");
        }
        BrightcoveClosedCaptioningView.a(a, i);
    }

    A(BrightcoveClosedCaptioningView brightcoveclosedcaptioningview)
    {
        a = brightcoveclosedcaptioningview;
        super();
    }
}
