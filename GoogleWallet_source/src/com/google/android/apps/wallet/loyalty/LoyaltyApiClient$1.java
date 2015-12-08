// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import com.google.android.apps.wallet.rpc.RpcCaller;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyApiClient

final class val.query
    implements Callable
{

    final LoyaltyApiClient this$0;
    final String val$query;

    private com.google.wallet.proto.api.uggestedLoyaltyProgramInfo[] call()
        throws Exception
    {
        com.google.wallet.proto.api.uggestLoyaltyProgramsRequest uggestloyaltyprogramsrequest = new com.google.wallet.proto.api.uggestLoyaltyProgramsRequest();
        uggestloyaltyprogramsrequest.merchantNameInput = val$query;
        uggestloyaltyprogramsrequest.maxResultsToFetch = Integer.valueOf(25);
        return ((com.google.wallet.proto.api.uggestLoyaltyProgramsResponse)LoyaltyApiClient.access$000(LoyaltyApiClient.this).call("b/loyalty/suggestPrograms", uggestloyaltyprogramsrequest, new com.google.wallet.proto.api.uggestLoyaltyProgramsResponse())).matchingPrograms;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    altyProgramInfo()
    {
        this$0 = final_loyaltyapiclient;
        val$query = String.this;
        super();
    }
}
