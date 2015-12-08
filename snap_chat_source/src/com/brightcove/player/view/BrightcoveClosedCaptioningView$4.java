// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.TTMLDocument;
import com.brightcove.player.model.WebVTTDocument;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveClosedCaptioningView

final class a
    implements EventListener
{

    private BrightcoveClosedCaptioningView a;

    public final void processEvent(Event event)
    {
        TTMLDocument ttmldocument = (TTMLDocument)event.properties.get("ttmlDocument");
        if (ttmldocument != null)
        {
            a.prepareDFXPCaptions(ttmldocument);
            return;
        }
        event = (WebVTTDocument)event.properties.get("webvttDocument");
        if (event != null)
        {
            a.prepareWebVTTCaptions(event);
            return;
        } else
        {
            event = BrightcoveClosedCaptioningView.a;
            a.clear();
            return;
        }
    }

    A(BrightcoveClosedCaptioningView brightcoveclosedcaptioningview)
    {
        a = brightcoveclosedcaptioningview;
        super();
    }
}
