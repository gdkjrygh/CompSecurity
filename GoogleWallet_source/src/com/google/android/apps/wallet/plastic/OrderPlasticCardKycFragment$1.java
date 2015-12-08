// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.apps.wallet.kyc.api.KycApi;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            OrderPlasticCardKycFragment

final class this._cls0
    implements android.view.rPlasticCardKycFragment._cls1
{

    final OrderPlasticCardKycFragment this$0;

    public final void onClick(View view)
    {
        getActivity().startActivityForResult(KycApi.createTwoStepKycActivityIntentForPlasticCard(getActivity()), 1);
    }

    ()
    {
        this$0 = OrderPlasticCardKycFragment.this;
        super();
    }
}
