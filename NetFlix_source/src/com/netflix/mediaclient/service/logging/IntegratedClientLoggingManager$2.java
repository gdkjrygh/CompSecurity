// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;


// Referenced classes of package com.netflix.mediaclient.service.logging:
//            IntegratedClientLoggingManager

class val.deliveryRequestId
    implements Runnable
{

    final IntegratedClientLoggingManager this$0;
    final String val$deliveryRequestId;

    public void run()
    {
        IntegratedClientLoggingManager.access$300(IntegratedClientLoggingManager.this, val$deliveryRequestId);
    }

    ()
    {
        this$0 = final_integratedclientloggingmanager;
        val$deliveryRequestId = String.this;
        super();
    }
}
