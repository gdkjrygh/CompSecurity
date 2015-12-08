// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.EventUtil;
import java.util.Map;

// Referenced classes of package com.brightcove.player.controller:
//            DefaultSourceSelectionController, NoSourceFoundException

final class <init>
    implements EventListener
{

    private DefaultSourceSelectionController a;

    public final void processEvent(Event event)
    {
        Video video = (Video)event.properties.get("video");
        try
        {
            com.brightcove.player.model.Source source = a.selectSource(video);
            event.properties.put("source", source);
            DefaultSourceSelectionController.a(a).respond(event);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Event event)
        {
            event = DefaultSourceSelectionController.TAG;
        }
        (new StringBuilder("no usable Source could be found for Video: ")).append(video.toString());
        EventUtil.emit(DefaultSourceSelectionController.b(a), "sourceNotFound", video);
    }

    private I(DefaultSourceSelectionController defaultsourceselectioncontroller)
    {
        a = defaultsourceselectioncontroller;
        super();
    }

    a(DefaultSourceSelectionController defaultsourceselectioncontroller, byte byte0)
    {
        this(defaultsourceselectioncontroller);
    }
}
