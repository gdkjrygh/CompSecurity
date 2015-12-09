// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            EditLoyaltyCardActivity, LoyaltyCardInfo, LoyaltyApiClient

final class this._cls0
    implements Callable
{

    final EditLoyaltyCardActivity this$0;

    private Void call()
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.nce nce = loyaltyClient.editLoyalty(EditLoyaltyCardActivity.access$200(EditLoyaltyCardActivity.this), EditLoyaltyCardActivity.access$400(EditLoyaltyCardActivity.this).getAllPrompts());
        wobsManager.upsertWobIfNecessary(nce);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = EditLoyaltyCardActivity.this;
        super();
    }
}
