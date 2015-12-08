// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import com.google.common.base.Objects;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimMoneyIntroActivity

final class this._cls0
    implements Callable
{

    final ClaimMoneyIntroActivity this$0;

    private Boolean call()
    {
        boolean flag;
        try
        {
            flag = Objects.equal(fundsTransferClient.getAcceptanceOptions(new com.google.wallet.proto.api.tAcceptanceOptionsRequest()).acceptanceOptions, Integer.valueOf(2));
        }
        catch (RpcException rpcexception)
        {
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    anceOptionsResponse()
    {
        this$0 = ClaimMoneyIntroActivity.this;
        super();
    }
}
