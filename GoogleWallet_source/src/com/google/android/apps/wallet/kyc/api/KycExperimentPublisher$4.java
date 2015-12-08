// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.rpc.RpcException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycExperimentPublisher, KycClient

final class this._cls0
    implements Callable
{

    final KycExperimentPublisher this$0;

    private com.google.wallet.proto.api.esponse call()
        throws RpcException, CallErrorException
    {
        return KycExperimentPublisher.access$200(KycExperimentPublisher.this).getKycData();
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = KycExperimentPublisher.this;
        super();
    }
}
