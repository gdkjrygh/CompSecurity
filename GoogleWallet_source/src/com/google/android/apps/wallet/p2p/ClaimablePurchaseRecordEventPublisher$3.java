// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager;
import com.google.android.apps.wallet.rpc.RpcException;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimablePurchaseRecordEventPublisher

final class this._cls0
    implements Callable
{

    final ClaimablePurchaseRecordEventPublisher this$0;

    private List call()
        throws RpcException
    {
        return ClaimablePurchaseRecordEventPublisher.access$200(ClaimablePurchaseRecordEventPublisher.this).getClaimablePurchaseRecords();
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = ClaimablePurchaseRecordEventPublisher.this;
        super();
    }
}
