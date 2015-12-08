// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.kyc.api.KycClient;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycOowFragment, KycUiModel

final class this._cls0
    implements Callable
{

    final KycOowFragment this$0;

    private com.google.wallet.proto.api.mitAnswersResponse call()
        throws Exception
    {
        com.google.wallet.proto.api.mitAnswersRequest mitanswersrequest = new com.google.wallet.proto.api.mitAnswersRequest();
        mitanswersrequest.referralAnswer = (com.google.wallet.proto.features.erralAnswer[])KycOowFragment.access$000(KycOowFragment.this).getReferralAnswers().toArray(mitanswersrequest.referralAnswer);
        return kycClient.submitAnswers(mitanswersrequest);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ersResponse()
    {
        this$0 = KycOowFragment.this;
        super();
    }
}
