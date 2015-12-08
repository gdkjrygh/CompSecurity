// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;


// Referenced classes of package com.netflix.mediaclient.service.logging:
//            PresentationTrackingManager

class val.deliveryRequestId
    implements Runnable
{

    final PresentationTrackingManager this$0;
    final String val$deliveryRequestId;

    public void run()
    {
        PresentationTrackingManager.access$400(PresentationTrackingManager.this, val$deliveryRequestId);
    }

    ()
    {
        this$0 = final_presentationtrackingmanager;
        val$deliveryRequestId = String.this;
        super();
    }
}
