// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.TTMLDocument;
import com.brightcove.player.model.WebVTTDocument;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveClosedCaptioningView

class x
    implements EventListener
{

    final BrightcoveClosedCaptioningView a;

    x(BrightcoveClosedCaptioningView brightcoveclosedcaptioningview)
    {
        a = brightcoveclosedcaptioningview;
        super();
    }

    public void processEvent(Event event)
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
            Log.e(BrightcoveClosedCaptioningView.a, "Captions document was null. No captions to load.");
            a.clear();
            return;
        }
    }
}
