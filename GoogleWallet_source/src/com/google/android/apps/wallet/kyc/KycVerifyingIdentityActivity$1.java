// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.kyc.api.KycClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycVerifyingIdentityActivity

final class this._cls0
    implements Runnable
{

    final KycVerifyingIdentityActivity this$0;

    public final void run()
    {
        executeAction("CHECK_KYC_STATE", new Callable() {

            final KycVerifyingIdentityActivity._cls1 this$1;

            private com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse call()
                throws Exception
            {
                return kycClient.getGetKycStatusResponse();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$1 = KycVerifyingIdentityActivity._cls1.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = KycVerifyingIdentityActivity.this;
        super();
    }
}
