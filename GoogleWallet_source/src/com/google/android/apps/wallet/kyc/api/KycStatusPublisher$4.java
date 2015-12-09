// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycStatusPublisher

final class this._cls0
    implements Callable
{

    final KycStatusPublisher this$0;

    private Void call()
        throws RpcException, CallErrorException
    {
        fetchKycStatusFromServer();
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = KycStatusPublisher.this;
        super();
    }
}
