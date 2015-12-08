// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;

// Referenced classes of package com.adobe.mediacore:
//            AdBreakPlacementCompletedListener, TimelineOperationQueue, VideoEngineTimeline, OpportunityHandledEvent, 
//            VideoEngineDispatcher

class this._cls0
    implements AdBreakPlacementCompletedListener
{

    final TimelineOperationQueue this$0;

    public void onCompleted(AdBreakPlacement adbreakplacement, AdBreakPlacement adbreakplacement1)
    {
        if (adbreakplacement != null && adbreakplacement.getAdBreak() != null)
        {
            if (adbreakplacement.getAdBreak().getRestoreId() != null)
            {
                long l = adbreakplacement.getAdBreak().getLocalTime();
                adbreakplacement1.getAdBreak().setLocalTime(l);
            } else
            {
                long l1 = TimelineOperationQueue.access$000(TimelineOperationQueue.this).convertToLocalTime(adbreakplacement1.getTime());
                adbreakplacement1.getAdBreak().setLocalTime(l1);
                TimelineOperationQueue.access$300(TimelineOperationQueue.this).dispatch(new OpportunityHandledEvent(ORTUNITY_COMPLETED, adbreakplacement.getTime()));
            }
        }
        TimelineOperationQueue.access$102(TimelineOperationQueue.this, null);
        TimelineOperationQueue.access$200(TimelineOperationQueue.this);
    }

    eakPlacement()
    {
        this$0 = TimelineOperationQueue.this;
        super();
    }
}
