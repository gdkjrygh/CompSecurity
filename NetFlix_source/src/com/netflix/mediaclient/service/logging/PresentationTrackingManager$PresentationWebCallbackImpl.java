// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.presentation.PresentationWebCallback;
import com.netflix.mediaclient.util.StringUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            PresentationTrackingManager, LoggingAgent

private class this._cls0
    implements PresentationWebCallback
{

    private String payload;
    final PresentationTrackingManager this$0;

    public void onEventsDelivered(String s)
    {
        if (Log.isLoggable("nf_presentation", 3))
        {
            Log.d("nf_presentation", (new StringBuilder()).append("Events delivered for  ").append(s).toString());
        }
        PresentationTrackingManager.access$700(PresentationTrackingManager.this).clearFailureCounter();
        PresentationTrackingManager.access$500(PresentationTrackingManager.this, s);
    }

    public void onEventsDeliveryFailed(final String deliveryRequestId)
    {
        if (Log.isLoggable("nf_presentation", 6))
        {
            Log.e("nf_presentation", (new StringBuilder()).append("Events delivery failed for  ").append(deliveryRequestId).toString());
        }
        if (StringUtils.isEmpty(deliveryRequestId))
        {
            return;
        } else
        {
            PresentationTrackingManager.access$800(PresentationTrackingManager.this).schedule(new Runnable() {

                final PresentationTrackingManager.PresentationWebCallbackImpl this$1;
                final String val$deliveryRequestId;

                public void run()
                {
                    PresentationTrackingManager.access$400(this$0, deliveryRequestId);
                }

            
            {
                this$1 = PresentationTrackingManager.PresentationWebCallbackImpl.this;
                deliveryRequestId = s;
                super();
            }
            }, PresentationTrackingManager.access$700(PresentationTrackingManager.this).getNextTimeToDeliverAfterFailure(), TimeUnit.MILLISECONDS);
            return;
        }
    }

    public _cls1.val.deliveryRequestId(String s)
    {
        this$0 = PresentationTrackingManager.this;
        super();
    }
}
