// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.util.Log;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.EventUtil;
import java.util.Map;

// Referenced classes of package com.brightcove.player.controller:
//            NoSourceFoundException, DefaultSourceSelectionController, e

class f
    implements EventListener
{

    final DefaultSourceSelectionController a;

    private f(DefaultSourceSelectionController defaultsourceselectioncontroller)
    {
        a = defaultsourceselectioncontroller;
        super();
    }

    f(DefaultSourceSelectionController defaultsourceselectioncontroller, e e)
    {
        this(defaultsourceselectioncontroller);
    }

    public void processEvent(Event event)
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
            Log.e(DefaultSourceSelectionController.TAG, (new StringBuilder()).append("no usable Source could be found for Video: ").append(video.toString()).toString());
        }
        EventUtil.emit(DefaultSourceSelectionController.b(a), "sourceNotFound", video);
    }
}
