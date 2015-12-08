// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.api;

import com.google.common.cache.LoadingCache;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.wallet.transfer.api:
//            FundsTransferInfoPublisher

final class val.eventId
    implements Callable
{

    final FundsTransferInfoPublisher this$0;
    final Object val$eventId;

    private com.google.wallet.proto.api.ndsTransferInfoResponse call()
        throws ExecutionException
    {
        return (com.google.wallet.proto.api.ndsTransferInfoResponse)FundsTransferInfoPublisher.access$000(FundsTransferInfoPublisher.this).get(val$eventId);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    esponse()
    {
        this$0 = final_fundstransferinfopublisher;
        val$eventId = Object.this;
        super();
    }
}
