// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.ClientLoggingWebCallback;
import com.netflix.mediaclient.util.StringUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            IntegratedClientLoggingManager, LoggingAgent

private class this._cls0
    implements ClientLoggingWebCallback
{

    private String payload;
    final IntegratedClientLoggingManager this$0;

    public void onEventsDelivered(String s)
    {
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Events delivered for  ").append(s).toString());
        }
        IntegratedClientLoggingManager.access$600(IntegratedClientLoggingManager.this).clearFailureCounter();
        IntegratedClientLoggingManager.access$400(IntegratedClientLoggingManager.this, s);
    }

    public void onEventsDeliveryFailed(final String deliveryRequestId)
    {
        if (Log.isLoggable("nf_log", 6))
        {
            Log.e("nf_log", (new StringBuilder()).append("Events delivery failed for  ").append(deliveryRequestId).toString());
        }
        if (StringUtils.isEmpty(deliveryRequestId))
        {
            return;
        } else
        {
            IntegratedClientLoggingManager.access$700(IntegratedClientLoggingManager.this).schedule(new Runnable() {

                final IntegratedClientLoggingManager.ClientLoggingWebCallbackImpl this$1;
                final String val$deliveryRequestId;

                public void run()
                {
                    IntegratedClientLoggingManager.access$300(this$0, deliveryRequestId);
                }

            
            {
                this$1 = IntegratedClientLoggingManager.ClientLoggingWebCallbackImpl.this;
                deliveryRequestId = s;
                super();
            }
            }, IntegratedClientLoggingManager.access$600(IntegratedClientLoggingManager.this).getNextTimeToDeliverAfterFailure(), TimeUnit.MILLISECONDS);
            return;
        }
    }

    public _cls1.val.deliveryRequestId(String s)
    {
        this$0 = IntegratedClientLoggingManager.this;
        super();
    }
}
