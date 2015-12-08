// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;

// Referenced classes of package com.adobe.mediacore:
//            AdBreakPlacementFailedListener, TimelineOperationQueue, OpportunityHandledEvent, VideoEngineDispatcher

class this._cls0
    implements AdBreakPlacementFailedListener
{

    final TimelineOperationQueue this$0;

    public void onFailed(AdBreakPlacement adbreakplacement)
    {
        TimelineOperationQueue.access$500(TimelineOperationQueue.this).w((new StringBuilder()).append(TimelineOperationQueue.access$400()).append("#adProviderError").toString(), (new StringBuilder()).append("Proposed ad break was refused as we fail to place any of the contained ads.[").append(adbreakplacement.toString()).append("]").toString());
        TimelineOperationQueue.access$300(TimelineOperationQueue.this).dispatch(new OpportunityHandledEvent(ORTUNITY_FAILED, adbreakplacement.getTime()));
        TimelineOperationQueue.access$102(TimelineOperationQueue.this, null);
        TimelineOperationQueue.access$200(TimelineOperationQueue.this);
    }

    eakPlacement()
    {
        this$0 = TimelineOperationQueue.this;
        super();
    }
}
