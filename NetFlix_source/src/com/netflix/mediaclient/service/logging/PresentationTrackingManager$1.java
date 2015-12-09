// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.presentation.PresentationEvent;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.UiLocation;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            PresentationTrackingManager

class val.uiLocation
    implements Runnable
{

    final PresentationTrackingManager this$0;
    final Trackable val$trackable;
    final UiLocation val$uiLocation;
    final List val$videoIds;
    final int val$videoPos;

    public void run()
    {
        PresentationEvent presentationevent = new PresentationEvent(val$trackable, val$videoIds, val$videoPos, val$uiLocation);
        if (Log.isLoggable("nf_presentation", 3))
        {
            Log.d("nf_presentation", (new StringBuilder()).append("PresentationEvent received ").append(presentationevent).toString());
        }
        PresentationTrackingManager.access$000(PresentationTrackingManager.this).post(presentationevent);
    }

    esentationTrackingEventQueue()
    {
        this$0 = final_presentationtrackingmanager;
        val$trackable = trackable1;
        val$videoIds = list;
        val$videoPos = i;
        val$uiLocation = UiLocation.this;
        super();
    }
}
