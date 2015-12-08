// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.kyc.api.KycClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            FetchKycPrefillDataAction

final class this._cls0
    implements Callable
{

    final FetchKycPrefillDataAction this$0;

    private com.google.wallet.proto.api.onse call()
        throws Exception
    {
        return FetchKycPrefillDataAction.access$000(FetchKycPrefillDataAction.this).getKycData();
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = FetchKycPrefillDataAction.this;
        super();
    }
}
