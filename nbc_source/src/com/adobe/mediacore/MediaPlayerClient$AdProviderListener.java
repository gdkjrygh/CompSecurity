// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.timeline.PlacementOpportunity;
import com.adobe.mediacore.timeline.TimelineOperation;
import com.adobe.mediacore.timeline.advertising.AdProvider;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerClient, VideoEngineTimelineProxy, TimelineOperationQueue, MediaPlayerNotification, 
//            OperationFailedEvent, VideoEngineDispatcher

private class this._cls0
    implements com.adobe.mediacore.timeline.advertising.
{

    final MediaPlayerClient this$0;

    public void onComplete(AdProvider adprovider, List list)
    {
        unregisterPlacement();
        if (list.size() <= 0) goto _L2; else goto _L1
_L1:
        TimelineOperation timelineoperation;
        for (adprovider = list.iterator(); adprovider.hasNext(); MediaPlayerClient.access$300(MediaPlayerClient.this).addHoldReference(timelineoperation.getPlacement().getTime()))
        {
            timelineoperation = (TimelineOperation)adprovider.next();
            MediaPlayerClient.access$200(MediaPlayerClient.this).i((new StringBuilder()).append(MediaPlayerClient.access$100()).append("#ContentResolver.OnCompleteListener::onComplete").toString(), (new StringBuilder()).append("Adding reference for timelineOperation for HOLD at ").append(timelineoperation.getPlacement().getTime()).toString());
        }

        MediaPlayerClient.access$000(MediaPlayerClient.this).addAllToQueue(list);
_L4:
        if (MediaPlayerClient.access$500(MediaPlayerClient.this) != null)
        {
            long l = MediaPlayerClient.access$500(MediaPlayerClient.this).getPlacementInformation().getTime();
            MediaPlayerClient.access$200(MediaPlayerClient.this).i((new StringBuilder()).append(MediaPlayerClient.access$100()).append("#ContentResolver.OnCompleteListener::onComplete").toString(), (new StringBuilder()).append("Release reference for timelineOperation for HOLD at ").append(l).toString());
            MediaPlayerClient.access$300(MediaPlayerClient.this).releaseHoldReference(l);
        }
        MediaPlayerClient.access$502(MediaPlayerClient.this, null);
        MediaPlayerClient.access$600(MediaPlayerClient.this);
        return;
_L2:
        if (doneInitialResolving())
        {
            MediaPlayerClient.access$400(MediaPlayerClient.this);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onError(AdProvider adprovider, this._cls0 _pcls0)
    {
        unregisterPlacement();
        this._cls0 _lcls0 = MediaPlayerNotification.createWarningNotification(D_RESOLVER_FAIL, "Ad resolving operation has failed.");
        if (MediaPlayerClient.access$500(MediaPlayerClient.this) != null)
        {
            MediaPlayerClient.access$300(MediaPlayerClient.this).releaseHoldReference(MediaPlayerClient.access$500(MediaPlayerClient.this).getPlacementInformation().getTime());
        }
        MediaPlayerClient.access$502(MediaPlayerClient.this, null);
        MediaPlayerClient.access$600(MediaPlayerClient.this);
        _lcls0.nerNotification(_pcls0);
        onWarning(adprovider, _lcls0);
        MediaPlayerClient.access$400(MediaPlayerClient.this);
    }

    public void onWarning(AdProvider adprovider, this._cls0 _pcls0)
    {
        if (MediaPlayerClient.access$700(MediaPlayerClient.this) != null)
        {
            MediaPlayerClient.access$700(MediaPlayerClient.this).dispatch(OperationFailedEvent.createEvent(_pcls0));
        }
    }

    public tion()
    {
        this$0 = MediaPlayerClient.this;
        super();
        if (MediaPlayerClient.access$000(MediaPlayerClient.this) == null)
        {
            throw new IllegalArgumentException("The TimelineOperationQueue must be not null.");
        } else
        {
            return;
        }
    }
}
