// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.api;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.transfer.api:
//            FundsTransferInfoPublisher, FundsTransferInfoEvent

final class val.eventId
    implements AsyncCallback
{

    final FundsTransferInfoPublisher this$0;
    final Object val$eventId;

    private void onSuccess(com.google.wallet.proto.api.ndsTransferInfoResponse ndstransferinforesponse)
    {
        FundsTransferInfoPublisher.access$200(FundsTransferInfoPublisher.this).post(val$eventId, FundsTransferInfoPublisher.access$100(FundsTransferInfoPublisher.this, ndstransferinforesponse));
    }

    public final void onFailure(Exception exception)
    {
        exception = new FundsTransferInfoEvent(null, null, null, exception.getCause());
        FundsTransferInfoPublisher.access$200(FundsTransferInfoPublisher.this).post(val$eventId, exception);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.ndsTransferInfoResponse)obj);
    }

    esponse()
    {
        this$0 = final_fundstransferinfopublisher;
        val$eventId = Object.this;
        super();
    }
}
