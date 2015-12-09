// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.util.SparseArray;
import com.google.android.apps.wallet.rpc.RpcCaller;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyApiClient

final class this._cls0
    implements Callable
{

    final LoyaltyApiClient this$0;

    private SparseArray call()
        throws Exception
    {
        Object obj = new com.google.wallet.proto.api.etLoyaltySharedDataPromptsRequest();
        obj.sharedDataIds = null;
        com.google.wallet.proto.api.etLoyaltySharedDataPromptsResponse etloyaltyshareddatapromptsresponse = (com.google.wallet.proto.api.etLoyaltySharedDataPromptsResponse)LoyaltyApiClient.access$000(LoyaltyApiClient.this).call("b/loyalty/getPrompts", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api.etLoyaltySharedDataPromptsResponse());
        obj = new SparseArray();
        com.google.wallet.proto.api.haredDataPrompt ahareddataprompt[] = etloyaltyshareddatapromptsresponse.sharedDataPrompts;
        int j = ahareddataprompt.length;
        for (int i = 0; i < j; i++)
        {
            com.google.wallet.proto.api.haredDataPrompt hareddataprompt = ahareddataprompt[i];
            ((SparseArray) (obj)).put(hareddataprompt.sharedDataId.intValue(), hareddataprompt);
        }

        return ((SparseArray) (obj));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ompt()
    {
        this$0 = LoyaltyApiClient.this;
        super();
    }
}
