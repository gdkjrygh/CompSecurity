// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.kyc.api.KycClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycActivity

final class this._cls0
    implements Callable
{

    final KycActivity this$0;

    private com.google.wallet.proto.api.GetKycStatusResponse call()
        throws Exception
    {
        return kycClient.getGetKycStatusResponse();
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    tatusResponse()
    {
        this$0 = KycActivity.this;
        super();
    }
}
