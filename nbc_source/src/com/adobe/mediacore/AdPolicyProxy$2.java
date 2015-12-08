// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            AdBreakPlacementFailedListener, AdPolicyProxy, SeekEvent, VideoEngineDispatcher, 
//            TimelineOperationQueue

class this._cls0
    implements AdBreakPlacementFailedListener
{

    final AdPolicyProxy this$0;

    public void onFailed(AdBreakPlacement adbreakplacement)
    {
label0:
        {
            AdPolicyProxy.access$100(AdPolicyProxy.this).e((new StringBuilder()).append(AdPolicyProxy.access$000()).append("#AdPolicyProxy::AdBreakPlacementFailedListener").toString(), "Ad break placement failed");
            if (adbreakplacement != null && AdPolicyProxy.access$200(AdPolicyProxy.this) != null && AdPolicyProxy.access$200(AdPolicyProxy.this).contains(adbreakplacement))
            {
                AdPolicyProxy.access$200(AdPolicyProxy.this).remove(adbreakplacement);
                if (!AdPolicyProxy.access$300(AdPolicyProxy.this, AdPolicyProxy.access$200(AdPolicyProxy.this)).booleanValue())
                {
                    break label0;
                }
                if (AdPolicyProxy.access$400(AdPolicyProxy.this) != null)
                {
                    AdPolicyProxy.access$400(AdPolicyProxy.this).dispatch(SeekEvent.createSeekAdjustCompleted(adbreakplacement.getTime()));
                }
                AdPolicyProxy.access$600(AdPolicyProxy.this);
            }
            return;
        }
        AdPolicyProxy.access$522(AdPolicyProxy.this, adbreakplacement.getDuration());
        AdPolicyProxy.access$100(AdPolicyProxy.this).i((new StringBuilder()).append(AdPolicyProxy.access$000()).append("AdPolicyProxy::onAdBreakComplete").toString(), "Place next Ad Break Placement that's skipped");
        adbreakplacement = (AdBreakPlacement)AdPolicyProxy.access$200(AdPolicyProxy.this).get(0);
        AdPolicyProxy.access$700(AdPolicyProxy.this).addToQueue(adbreakplacement);
    }

    sing.AdBreakPlacement()
    {
        this$0 = AdPolicyProxy.this;
        super();
    }
}
