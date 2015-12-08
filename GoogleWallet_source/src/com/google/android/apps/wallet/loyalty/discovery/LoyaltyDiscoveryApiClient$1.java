// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.discovery;

import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.loyalty.discovery:
//            LoyaltyDiscoveryApiClient

final class this._cls0
    implements Callable
{

    final LoyaltyDiscoveryApiClient this$0;

    private com.google.wallet.proto.api.yaltyProgramsResponse call()
        throws RpcException
    {
        com.google.wallet.proto.api.yaltyProgramsResponse yaltyprogramsresponse = LoyaltyDiscoveryApiClient.access$000(LoyaltyDiscoveryApiClient.this, null);
        LoyaltyDiscoveryApiClient.access$100(LoyaltyDiscoveryApiClient.this, yaltyprogramsresponse);
        return yaltyprogramsresponse;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = LoyaltyDiscoveryApiClient.this;
        super();
    }
}
